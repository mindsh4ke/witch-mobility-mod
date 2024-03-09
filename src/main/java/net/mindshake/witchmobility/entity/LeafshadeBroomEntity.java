package net.mindshake.witchmobility.entity;

import net.mindshake.witchmobility.config.ModConfigs;
import net.mindshake.witchmobility.registry.ModItems;
import net.mindshake.witchmobility.util.BroomFX;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.world.World;

public class LeafshadeBroomEntity extends BroomEntity {


    public LeafshadeBroomEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world, ModItems.LEAFSHADE_BROOM);
    }

    @Override
    public float getSpeed() {
        return (float) ModConfigs.LEAFSHADE_MOV;
    }

    @Override
    public float getRotationSpeed() {
        return (float)ModConfigs.LEAFSHADE_ROT;
    }

    @Override
    public void doEffect() {
        BroomFX.spawnParticle(this, this.random, this.getWorld(), ParticleTypes.FALLING_SPORE_BLOSSOM);
    }
}
