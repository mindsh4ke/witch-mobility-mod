package net.mindshake.witchmobility.entity;

import net.mindshake.witchmobility.config.ModConfigs;
import net.mindshake.witchmobility.registry.ModItems;
import net.mindshake.witchmobility.util.BroomFX;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.world.World;

public class SnowairBroomEntity extends BroomEntity {


    public SnowairBroomEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world, ModItems.SNOWAIR_BROOM);
    }

    @Override
    public float getSpeed() {
        return (float) ModConfigs.SNOWAIR_MOV;
    }

    @Override
    public float getRotationSpeed() {
        return (float)ModConfigs.SNOWAIR_ROT;
    }

    @Override
    public void doEffect() {
        BroomFX.spawnParticle(this, this.random, this.getWorld(), ParticleTypes.SNOWFLAKE);
    }
}
