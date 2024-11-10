package net.mindshake.witchmobility.entity;

import net.mindshake.witchmobility.registry.ModItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.Level;

public class WoodShadeBroomEntity extends BroomEntity {


    public WoodShadeBroomEntity(EntityType<? extends Mob> entityType, Level world) {
        super(entityType, world, ModItems.WOODSHADE_BROOM.get());
    }

    @Override
    public float getSpeed() {
        return 1.5f;
    }

    @Override
    public float getRotationSpeed() {
        return 3.5f;
    }
}
