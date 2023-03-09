package net.mindshake.witchmobility.entity;

import net.mindshake.witchmobility.registry.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

public class SnowairBroomEntity extends BroomEntity {


    public SnowairBroomEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world, ModItems.SNOWAIR_BROOM);
    }

    @Override
    public float getSpeed() {
        return 1.55f;
    }

    @Override
    public float getRotationSpeed() {
        return 3f;
    }
}
