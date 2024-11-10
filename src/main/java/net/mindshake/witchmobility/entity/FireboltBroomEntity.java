package net.mindshake.witchmobility.entity;

import net.mindshake.witchmobility.registry.ModItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.Level;

public class FireboltBroomEntity extends BroomEntity {


    public FireboltBroomEntity(EntityType<? extends Mob> entityType, Level world) {
        super(entityType, world, ModItems.FIREBOLT_BROOM.get());
    }

    @Override
    public float getSpeed() {
        return 1.75f;
    }

    @Override
    public float getRotationSpeed() {
        return 3.25f;
    }
}
