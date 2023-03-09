package net.mindshake.witchmobility.entity;

import net.mindshake.witchmobility.registry.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

public class LeafshadeBroomEntity extends BroomEntity {


    public LeafshadeBroomEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world, ModItems.LEAFSHADE_BROOM);
    }

    @Override
    public float getSpeed() {
        return 1.6f;
    }

    @Override
    public float getRotationSpeed() {
        return 3.1f;
    }
}
