package net.mindshake.witchmobility.entity;

import net.mindshake.witchmobility.config.ModConfigs;
import net.mindshake.witchmobility.registry.ModItems;
import net.mindshake.witchmobility.util.BroomFX;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.world.World;

public class WoodShadeBroomEntity extends BroomEntity {


    public WoodShadeBroomEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world, ModItems.WOODSHADE_BROOM);
    }

    @Override
    public float getSpeed() {
        return (float) ModConfigs.WOODSHADE_MOV;
    }

    @Override
    public float getRotationSpeed() {
        return (float)ModConfigs.FIREBOLT_ROT;
    }

    @Override
    public void doEffect() {
        BroomFX.spawnParticle(this, this.random, this.world, ParticleTypes.ENCHANT);
    }
}
