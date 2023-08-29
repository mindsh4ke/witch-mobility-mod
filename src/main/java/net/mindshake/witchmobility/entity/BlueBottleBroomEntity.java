package net.mindshake.witchmobility.entity;

import net.mindshake.witchmobility.registry.ModItems;
import net.mindshake.witchmobility.util.BroomFX;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.world.World;

public class BlueBottleBroomEntity extends BroomEntity {


    public BlueBottleBroomEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world, ModItems.BLUE_BOTTLE_BROOM);
    }

    @Override
    public float getSpeed() {
        return 1.25f;
    }

    @Override
    public float getRotationSpeed() {
        return 3.5f;
    }
}
