package net.mindshake.witchmobility.entity;

import net.mindshake.witchmobility.item.armor.WitchHat;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.builder.ILoopType;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.util.GeckoLibUtil;

import java.util.List;
import java.util.Objects;

public abstract class BroomEntity extends Mob implements IAnimatable {

    private boolean upIsPressed, downIsPressed;

    private Player lastPassenger;
    protected Item sourceItem;
    protected AnimationFactory factory = GeckoLibUtil.createFactory(this);

    private float bonusSpeed = 0f, bonusAgility = 0f;


    protected BroomEntity(EntityType<? extends Mob> entityType, Level world, Item sourceItem) {
        super(entityType, world);
        setNoGravity(true);
        this.sourceItem = sourceItem;
    }


    @Nullable
    @Override
    public Entity getControllingPassenger() {
        return this.getFirstPassenger();
    }

    @Override
    protected boolean canAddPassenger(Entity passenger) {
        List<Entity> passengers = getPassengers();
        return passengers.size() < 1;
    }

    @Override
    public float getHealth() {
        return 0;
    }

    public boolean canBeControlledByRider() {
        return this.getControllingPassenger() instanceof Player;
    }

    @Override
    public InteractionResult interactAt(Player p_19980_, Vec3 p_19981_, InteractionHand p_19982_) {
        if (!level.isClientSide()) {
            boolean isRiding = p_19980_.startRiding(this);
            lastPassenger = isRiding?p_19980_:lastPassenger;
            return isRiding ? InteractionResult.CONSUME : InteractionResult.FAIL;
        } else {
            return p_19980_.getRootVehicle() == getRootVehicle() ? InteractionResult.FAIL : InteractionResult.SUCCESS;
        }
    }

    @Override
    public void tick() {
        super.tick();
        if (level.isClientSide()) {
                upIsPressed = Minecraft.getInstance().options.keyJump.isDown();
                downIsPressed = Minecraft.getInstance().options.keySprint.isDown();
        }
    }

    @Override
    public void travel(Vec3 p_21280_) {
        if (!this.isAlive()) {
            return;
        }
        if (!(this.isVehicle() && this.canBeControlledByRider())) {
            return;
        }
        checkBonusValues();
        LivingEntity livingEntity = (LivingEntity) this.getControllingPassenger();
        this.yRotO = this.getYRot();
        this.setRot(this.getYRot(), this.getXRot());
        this.yHeadRot = this.yBodyRot = this.getYRot();
        float sideSpeed = livingEntity.xxa * getRotationSpeed() * (1+bonusAgility);

        setYRot(this.getYRot() - sideSpeed);
        float forwardSpeed = livingEntity.zza;
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

        this.hasImpulse = true;
        this.flyingSpeed = this.getSpeed() * 0.030f;
        if (this.isControlledByLocalInstance()) {

            this.setSpeed(((float)getSpeed()/2.5f + (bonusSpeed/2f)) * 0.8f);
            super.travel(new Vec3(-forwardSpeed, verticalSpeed, 0));

        } else if (livingEntity instanceof Player) {
            this.setDeltaMovement(Vec3.ZERO);
        }
        this.calculateEntityAnimation(this, false);
        this.tryCheckInsideBlocks();
    }

    private void checkBonusValues () {
        Player player = (Player) this.getControllingPassenger();
        if (player.hasItemInSlot(EquipmentSlot.HEAD)) {
            Item headItem = player.getItemBySlot(EquipmentSlot.HEAD).getItem();
            if (headItem instanceof WitchHat) {
                bonusSpeed = ((WitchHat)headItem).getBroomSpeedBonus();
                bonusAgility = ((WitchHat)headItem).getBroomAgilityBonus();
            } else {
                bonusSpeed = 0;
                bonusAgility = 0;
            }
        } else {
            bonusSpeed = 0;
            bonusAgility = 0;
        }
    }

    public static AttributeSupplier.Builder setAttributes() {
        return Animal.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 0)
                .add(Attributes.MOVEMENT_SPEED, 0.3f)
                .add(Attributes.FLYING_SPEED, 0.6f);
    }


    /*@Override
    public void positionRider(Entity p_20312_) {
        updatePassengerPosition(passenger, Entity::setPosition);
    }

    private void updatePassengerPosition(Entity passenger,) {
        if (!this.hasPassenger(passenger)) {
            return;
        }
        double d = this.getY() + this.getMountedHeightOffset() + passenger.getHeightOffset();
        positionUpdater.accept(passenger, this.getX() + 0.1f, d, this.getZ());
    }*/

    @Override
    public double getPassengersRidingOffset() {
        return 0.08f;
    }

    @Override
    public boolean isAffectedByPotions() {
        return false;
    }

    @Override
    public boolean isDeadOrDying() {
        return false;
    }

    @Override
    public boolean isAlive() {
        return !this.isRemoved();
    }

    @Override
    protected int calculateFallDamage(float p_21237_, float p_21238_) {
        return 0;
    }

    @Override
    public boolean causeFallDamage(float p_147187_, float p_147188_, DamageSource p_147189_) {
        return false;
    }

    @Override
    public boolean canBeSeenAsEnemy() {
        return false;
    }

    @Override
    public boolean canBreatheUnderwater() {
        return false;
    }

    @Override
    public boolean rideableUnderWater() {
        return true;
    }

    @Override
    public boolean requiresCustomPersistence() {
        return true;
    }

    @Override
    public boolean fireImmune() {
        return true;
    }

    @Override
    public boolean hurt(DamageSource p_21016_, float p_21017_) {
        if (p_21016_.getEntity() instanceof Player player) {
            despawn(player);
            return true;
        }
        return false;
    }

    private void despawn (Player player) {
        this.discard();
        if (!player.getInventory().add(new ItemStack(sourceItem))) {
            spawnAtLocation(sourceItem.asItem());
        }
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (getFirstPassenger() == null) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.basic_broom.fly_idle", ILoopType.EDefaultLoopTypes.LOOP));
        } else if (upIsPressed) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.basic_broom.up", ILoopType.EDefaultLoopTypes.LOOP));
        }  else if (downIsPressed) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.basic_broom.down", ILoopType.EDefaultLoopTypes.LOOP));
        } else if (((LivingEntity) Objects.requireNonNull(this.getControllingPassenger())).zza > 0.1f) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.basic_broom.forward", ILoopType.EDefaultLoopTypes.LOOP));
        } else {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.basic_broom.static", ILoopType.EDefaultLoopTypes.LOOP));
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
