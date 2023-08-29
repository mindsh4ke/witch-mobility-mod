package net.mindshake.witchmobility.entity;

import net.mindshake.witchmobility.config.ModConfigs;
import net.mindshake.witchmobility.registry.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

public class GoldenwoodBroomEntity extends BroomEntity {


    public GoldenwoodBroomEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world, ModItems.GOLDENWOOD_BROOM);
    }

    @Override
    public float getSpeed() {
        return (float) ModConfigs.GOLDENWOOD_MOV;
    }

    @Override
    public float getRotationSpeed() {
        return (float)ModConfigs.GOLDENWOOD_ROT;
    }
}
