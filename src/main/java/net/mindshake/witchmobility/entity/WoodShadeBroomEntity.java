package net.mindshake.witchmobility.entity;

import net.mindshake.witchmobility.registry.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

public class WoodShadeBroomEntity extends BroomEntity {


    public WoodShadeBroomEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world, ModItems.WOODSHADE_BROOM);
    }

    @Override
    public float getSpeed() {
        return 1.25f;
    }

    @Override
    public float getRotationSpeed() {
        return 3f;
    }
}
