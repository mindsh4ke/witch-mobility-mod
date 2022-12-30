package net.mindshake.witchmobility.entity;

import net.mindshake.witchmobility.registry.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

public class SilverArrowBroomEntity extends BroomEntity {

    public SilverArrowBroomEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world, ModItems.SILVER_ARROW_BROOM);
    }

    @Override
    public float getSpeed() {
        return 4.5f;
    }

    @Override
    public float getRotationSpeed() {
        return 3f;
    }
}
