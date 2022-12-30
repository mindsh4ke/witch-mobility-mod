package net.mindshake.witchmobility.entity;

import net.mindshake.witchmobility.registry.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

public class SwiftstickBroomEntity extends BroomEntity {


    public SwiftstickBroomEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world, ModItems.BLUE_BOTTLE_BROOM);
    }

    @Override
    public float getSpeed() {
        return 2f;
    }

    @Override
    public float getRotationSpeed() {
        return 2.5f;
    }
}
