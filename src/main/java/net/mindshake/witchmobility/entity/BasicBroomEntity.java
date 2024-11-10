package net.mindshake.witchmobility.entity;

import net.mindshake.witchmobility.registry.ModItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.Level;

public class BasicBroomEntity extends BroomEntity {

    public BasicBroomEntity(EntityType<? extends Mob> entityType, Level world) {
        super(entityType, world, ModItems.BASIC_BROOM.get());
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
