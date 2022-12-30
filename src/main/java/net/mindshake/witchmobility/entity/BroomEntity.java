package net.mindshake.witchmobility.entity;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import java.util.List;
import java.util.Objects;

public abstract class BroomEntity extends MobEntity implements IAnimatable {

    private boolean upIsPressed, downIsPressed;

    private PlayerEntity lastPassenger;
    protected Item sourceItem;
    protected AnimationFactory factory = new AnimationFactory(this);


    protected BroomEntity(EntityType<? extends MobEntity> entityType, World world, Item sourceItem) {
        super(entityType, world);
        setNoGravity(true);
        this.sourceItem = sourceItem;
    }


    @Override
    @Nullable
    public Entity getPrimaryPassenger() {
        return this.getFirstPassenger();
    }

    @Override
    protected boolean canAddPassenger(Entity passenger) {
        List<Entity> passengers = getPassengerList();
        return passengers.size() < 1;
    }

    @Override
    public float getHealth() {
        return 0;
    }

    @Override
    public boolean canBeControlledByRider() {
        return this.getPrimaryPassenger() instanceof PlayerEntity;
    }

    @Override
    public ActionResult interactAt(PlayerEntity player, Vec3d hitPos, Hand hand) {
        if (!world.isClient) {
            boolean isRiding = player.startRiding(this);
            lastPassenger = isRiding?player:lastPassenger;
            return isRiding ? ActionResult.CONSUME : ActionResult.FAIL;
        } else {
            return player.getRootVehicle() == getRootVehicle() ? ActionResult.FAIL : ActionResult.SUCCESS;
        }
    }

    @Override
    public void tick() {
        super.tick();
        if (world.isClient) {
                upIsPressed = MinecraftClient.getInstance().options.jumpKey.isPressed();
                downIsPressed = MinecraftClient.getInstance().options.sprintKey.isPressed();
        }
    }

    @Override
    public void travel(Vec3d movementInput) {
        if (!this.isAlive()) {
            return;
        }
        if (!(this.hasPassengers() && this.canBeControlledByRider())) {
            return;
        }
        LivingEntity livingEntity = (LivingEntity) this.getPrimaryPassenger();
        this.prevYaw = this.getYaw();
        this.setRotation(this.getYaw(), this.getPitch());
        this.headYaw = this.bodyYaw = this.getYaw();
        float sideSpeed = livingEntity.sidewaysSpeed * getRotationSpeed();

        setYaw(this.getYaw() - sideSpeed);
        float forwardSpeed = livingEntity.forwardSpeed;
        float verticalSpeed = 0;
        if (forwardSpeed <= 0.0f) {
            forwardSpeed *= 0.25f;
        }

        if (upIsPressed) {
            verticalSpeed = 0.45f;
        }

        if (downIsPressed) {
            verticalSpeed = -0.45f;
        }

        this.velocityDirty = true;
        this.airStrafingSpeed = this.getMovementSpeed() * 0.1f;
        if (this.isLogicalSideForUpdatingMovement()) {

            this.setMovementSpeed((float)getSpeed()/2f);
            super.travel(new Vec3d(-forwardSpeed, verticalSpeed, 0));

        } else if (livingEntity instanceof PlayerEntity) {
            this.setVelocity(Vec3d.ZERO);
        }
        this.updateLimbs(this, false);
        this.tryCheckBlockCollision();
    }

    @Override
    public void move(MovementType movementType, Vec3d movement) {
        super.move(movementType, movement);
    }

    public static DefaultAttributeContainer.Builder setAttributes() {
        return AnimalEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.3f)
                .add(EntityAttributes.GENERIC_FLYING_SPEED, 0.6f);
    }

    @Override
    public void updatePassengerPosition(Entity passenger) {
        updatePassengerPosition(passenger, Entity::setPosition);
    }

    private void updatePassengerPosition(Entity passenger, PositionUpdater positionUpdater) {
        if (!this.hasPassenger(passenger)) {
            return;
        }
        double d = this.getY() + this.getMountedHeightOffset() + passenger.getHeightOffset();
        positionUpdater.accept(passenger, this.getX() + 0.1f, d, this.getZ());
    }

    @Override
    public double getMountedHeightOffset() {
        return 0.08f;
    }

    @Override
    public boolean isAffectedBySplashPotions() {
        return false;
    }

    @Override
    public boolean isDead() {
        return false;
    }

    @Override
    public boolean isAlive() {
        return !this.isRemoved();
    }

    @Override
    protected int computeFallDamage(float fallDistance, float damageMultiplier) {
        return 0;
    }

    @Override
    public boolean handleFallDamage(float fallDistance, float damageMultiplier, DamageSource damageSource) {
        return false;
    }

    @Override
    public boolean canTakeDamage() {
        return false;
    }

    @Override
    public boolean canBreatheInWater() {
        return true;
    }

    @Override
    public boolean canBeRiddenInWater() {
        return true;
    }

    @Override
    public boolean cannotDespawn() {
        return true;
    }

    @Override
    public boolean isFireImmune() {
        return true;
    }

    @Override
    public boolean damage(DamageSource source, float amount) {
        if (source.getSource() instanceof PlayerEntity player) {
            despawn(player);
            return true;
        } else {
            super.damage(source, amount);
        }
        return false;
    }

    private void despawn (PlayerEntity player) {
        this.discard();
        if (!player.getInventory().insertStack(new ItemStack(sourceItem))) {
            dropItem(sourceItem.asItem());
        }
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (getFirstPassenger() == null) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.basic_broom.fly_idle", true));
        } else if (upIsPressed) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.basic_broom.up", true));
        }  else if (downIsPressed) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.basic_broom.down", true));
        } else if (((LivingEntity) Objects.requireNonNull(this.getPrimaryPassenger())).forwardSpeed > 0.1f) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.basic_broom.forward", true));
        } else {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.basic_broom.static", true));
        }
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimationData animationData) {
        AnimationController anim = new AnimationController(this, "controller",
                20, this::predicate);
        animationData.addAnimationController(anim);
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    public abstract float getSpeed ();
    public abstract float getRotationSpeed();
}
