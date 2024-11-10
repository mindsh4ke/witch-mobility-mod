package net.mindshake.witchmobility.entity;

import net.mindshake.witchmobility.registry.ModItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.Level;

public class SwiftstickBroomEntity extends BroomEntity {


    public SwiftstickBroomEntity(EntityType<? extends Mob> entityType, Level world) {
        super(entityType, world, ModItems.SWIFTSTICK_BROOM.get());
    }

    @Override
    public float getSpeed() {
        return 1.7f;
    }

    @Override
    public float getRotationSpeed() {
        return 3f;
    }
}
