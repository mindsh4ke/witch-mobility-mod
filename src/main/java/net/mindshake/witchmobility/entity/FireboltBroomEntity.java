package net.mindshake.witchmobility.entity;

import net.mindshake.witchmobility.registry.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

public class FireboltBroomEntity extends BroomEntity {


    public FireboltBroomEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world, ModItems.FIREBOLT_BROOM);
    }

    @Override
    public float getSpeed() {
        return 2.5f;
    }

    @Override
    public float getRotationSpeed() {
        return 3f;
    }
}
