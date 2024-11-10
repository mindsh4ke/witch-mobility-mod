package net.mindshake.witchmobility.entity;

import net.mindshake.witchmobility.registry.ModItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.Level;

public class BlueBottleBroomEntity extends BroomEntity {

    public BlueBottleBroomEntity(EntityType<? extends Mob> entityType, Level world) {
        super(entityType, world, ModItems.BLUE_BOTTLE_BROOM.get());
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
