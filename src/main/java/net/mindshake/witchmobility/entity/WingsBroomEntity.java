package net.mindshake.witchmobility.entity;

import net.mindshake.witchmobility.config.ModConfigs;
import net.mindshake.witchmobility.registry.ModItems;
import net.mindshake.witchmobility.util.BroomFX;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;

import java.util.Objects;

public class WingsBroomEntity extends BroomEntity {


    public WingsBroomEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world, ModItems.WINGS_BROOM);
    }

    @Override
    public float getSpeed() {
        return (float) ModConfigs.WINGS_MOV;
    }

    @Override
    public float getRotationSpeed() {
        return (float)ModConfigs.WINGS_ROT;
    }

    @Override
    public void doEffect() {
        BroomFX.spawnParticle(this, this.random, this.world, ParticleTypes.END_ROD);
    }

    /*@Override
    protected  <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (getFirstPassenger() == null) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.basic_broom.fly_idle", true));
        } else if (upIsPressed) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.basic_broom.up", true));
        }  else if (downIsPressed) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.basic_broom.down", true));
        } else if (((LivingEntity) Objects.requireNonNull(this.getPrimaryPassenger())).forwardSpeed > 0.1f) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.basic_broom.forward", true).addAnimation("animation.basic_broom.wings", true));
        } else {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.basic_broom.static", true));
        }
        return PlayState.CONTINUE;
    }*/
}
