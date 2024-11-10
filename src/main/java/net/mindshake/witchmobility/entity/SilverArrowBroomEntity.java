package net.mindshake.witchmobility.entity;

import net.mindshake.witchmobility.registry.ModItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.Level;

public class SilverArrowBroomEntity extends BroomEntity {

    public SilverArrowBroomEntity(EntityType<? extends Mob> entityType, Level world) {
        super(entityType, world, ModItems.SILVER_ARROW_BROOM.get());
    }

    @Override
    public float getSpeed() {
        return 3f;
    }

    @Override
    public float getRotationSpeed() {
        return 4.5f;
    }
}
