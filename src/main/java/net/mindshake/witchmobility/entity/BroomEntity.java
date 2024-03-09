package net.mindshake.witchmobility.entity;

import net.mindshake.witchmobility.Main;
import net.mindshake.witchmobility.client.ModKeybinds;
import net.mindshake.witchmobility.item.armor.WitchHat;
import net.mindshake.witchmobility.util.BroomFX;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.option.KeybindsScreen;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.entity.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.constant.DefaultAnimations;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.List;
import java.util.Objects;

public abstract class BroomEntity extends MobEntity implements GeoEntity {

    private boolean isDespawned = false;
    private boolean upIsPressed, downIsPressed;
    private int particleEffectFrame = 0;
    private float bonusSpeed = 0f, bonusAgility = 0f;
    private final float fallingSpeed = 1f;

    private PlayerEntity lastPassenger;
    protected Item sourceItem;
    private AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);


    protected BroomEntity(EntityType<? extends MobEntity> entityType, World world, Item sourceItem) {
        super(entityType, world);
        setNoGravity(true);
        this.sourceItem = sourceItem;
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

    public boolean canBeControlledByRider() {
        return this.getFirstPassenger() instanceof PlayerEntity;
    }

    @Override
    public ActionResult interactAt(PlayerEntity player, Vec3d hitPos, Hand hand) {
        if (!this.getWorld().isClient) {
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

        if (this.getWorld().isClient) {
            upIsPressed = MinecraftClient.getInstance().options.jumpKey.isPressed();//MinecraftClient.getInstance().options.jumpKey.isPressed();
            downIsPressed = MinecraftClient.getInstance().options.sprintKey.isPressed();
        }

        particleEffectFrame++;

        if (particleEffectFrame >= 8) {
            doEffect();
            particleEffectFrame = 0;
        }
        if (!this.hasPassengers()) {
            /*this.setMovementSpeed(fallingSpeed);
            super.move(MovementType.SELF, new Vec3d(0, -fallingSpeed * 0.1, 0));
            this.updateLimbs(this, false);
            this.tryCheckBlockCollision();*/
            this.setVelocity(new Vec3d(0, -fallingSpeed * 0.1, 0));
            this.move(MovementType.SELF, this.getVelocity());
        }

    }

    @Override
    public void travel(Vec3d movementInput) {
        if (!this.isAlive() || !this.canBeControlledByRider() || !this.hasPassengers()) {
            return;
        }

        checkBonusValues();
        LivingEntity livingEntity = (LivingEntity) this.getFirstPassenger();
        this.prevYaw = this.getYaw();
        this.setRotation(this.getYaw(), this.getPitch());
        this.headYaw = this.bodyYaw = this.getYaw();

        assert livingEntity != null;
        float sideSpeed = livingEntity.sidewaysSpeed * getRotationSpeed() * (1+bonusAgility);

        setYaw(this.getYaw() - sideSpeed);
        float forwardSpeed = livingEntity.forwardSpeed;
        if (forwardSpeed <= 0.0f) {
            //forwardSpeed *= 0.25f;
            forwardSpeed = 0;
        }

        this.velocityDirty = true;
        //this.airStrafingSpeed = this.getMovementSpeed() * 0.1f;

        if (this.isLogicalSideForUpdatingMovement()) {
            Main.LOGGER.info(String.valueOf(upIsPressed));
            float ySpeed = MinecraftClient.getInstance().options.jumpKey.isPressed() ? 0.45f : (MinecraftClient.getInstance().options.sprintKey.isPressed() ? -0.45f : 0f);
            this.setMovementSpeed(getSpeed()/2f + (bonusSpeed/2f));
            Main.LOGGER.info(String.valueOf(ySpeed));
            super.travel(new Vec3d(-forwardSpeed, ySpeed, 0));

        } else if (livingEntity instanceof PlayerEntity) {
            this.setVelocity(Vec3d.ZERO);
        }
        this.updateLimbs(false);
        this.tryCheckBlockCollision();
    }

    private void checkBonusValues () {
        PlayerEntity player = (PlayerEntity) this.getFirstPassenger();

        assert player != null;
        if (player.hasStackEquipped(EquipmentSlot.HEAD)) {
            Item headItem = player.getEquippedStack(EquipmentSlot.HEAD).getItem();
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

    @Override
    public void move(MovementType movementType, Vec3d movement) {
        super.move(movementType, movement);
        if (!this.hasPassengers()) {
            /*this.setMovementSpeed(fallingSpeed);
            super.move(MovementType.SELF, new Vec3d(0, -fallingSpeed * 0.1, 0));
            this.updateLimbs(this, false);
            this.tryCheckBlockCollision();*/
            this.setVelocity(new Vec3d(0, -fallingSpeed * 0.1, 0));
        }
    }

    public static DefaultAttributeContainer.Builder setAttributes() {
        return AnimalEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.3f)
                .add(EntityAttributes.GENERIC_FLYING_SPEED, 0.6f);
    }

    @Override
    public void updatePassengerPosition(Entity passenger, PositionUpdater positionUpdater) {
        if (!this.hasPassenger(passenger)) {
            return;
        }
        double d = this.getY() + this.getMountedHeightOffset();
        positionUpdater.accept(passenger, this.getX() + 0.1f, d, this.getZ());
    }

    public double getMountedHeightOffset() {
        return -0.32f;
    }

    @Override
    public Vec3d getPassengerRidingPos(Entity passenger) {
        return super.getPassengerRidingPos(passenger);
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
    public boolean shouldDismountUnderwater() {
        return false;
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
        if (isDespawned) {
            return false;
        }

        if (source.getSource() instanceof PlayerEntity player) {
            for (int i = 0; i < 6; i++) {
                BroomFX.spawnParticle(this, this.random, this.getWorld(), ParticleTypes.CAMPFIRE_COSY_SMOKE);
            }
            despawn(player);
            return true;
        } else {

        }
        return false;
    }

    private void despawn (PlayerEntity player) {
        isDespawned = true;
        this.discard();
        if (player.isCreative())
            return;

        if (!player.getInventory().insertStack(new ItemStack(sourceItem))) {
            dropItem(sourceItem.asItem());
        }
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, "controller", 20, this::predicate));
        /*AnimationController anim = new AnimationController(this, "controller",
                20, this::predicate);
        animationData.addAnimationController(anim);*/
    }

    private PlayState predicate(AnimationState<BroomEntity> state) {
        if (getFirstPassenger() == null) {
            return state.setAndContinue(RawAnimation.begin().thenLoop("animation.basic_broom.fly_idle"));
            //event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.basic_broom.fly_idle", ILoopType.EDefaultLoopTypes.LOOP));
        } else if (upIsPressed) {
            return state.setAndContinue(RawAnimation.begin().thenLoop("animation.basic_broom.up"));
            //event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.basic_broom.up", ILoopType.EDefaultLoopTypes.LOOP));
        }  else if (downIsPressed) {
            return state.setAndContinue(RawAnimation.begin().thenLoop("animation.basic_broom.down"));
            //event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.basic_broom.down", ILoopType.EDefaultLoopTypes.LOOP));
        } else if (((LivingEntity) Objects.requireNonNull(this.getFirstPassenger())).forwardSpeed > 0.1f) {
            return state.setAndContinue(RawAnimation.begin().thenLoop("animation.basic_broom.forward"));
            //event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.basic_broom.forward", ILoopType.EDefaultLoopTypes.LOOP));
        } else {
            return state.setAndContinue(RawAnimation.begin().thenLoop("animation.basic_broom.static"));
            //event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.basic_broom.static", ILoopType.EDefaultLoopTypes.LOOP));
        }
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    public abstract float getSpeed ();
    public abstract float getRotationSpeed();
    public void doEffect(){}
}
