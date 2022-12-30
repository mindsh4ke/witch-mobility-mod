package net.mindshake.witchmobility.entity;

import net.mindshake.witchmobility.registry.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

public class BasicBroomEntity extends BroomEntity {

    public BasicBroomEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world, ModItems.BASIC_BROOM);
    }

    @Override
    public float getSpeed() {
        return 1.35f;
    }

    @Override
    public float getRotationSpeed() {
        return 2.25f;
    }
}
