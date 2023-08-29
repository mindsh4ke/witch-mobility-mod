package net.mindshake.witchmobility.entity;

import net.mindshake.witchmobility.config.ModConfigs;
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
        return (float) ModConfigs.SILVER_ARROW_MOV;
    }

    @Override
    public float getRotationSpeed() {
        return (float)ModConfigs.SILVER_ARROW_ROT;
    }
}
