package net.mindshake.witchmobility.item;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;

public class BasicBroomItem extends BroomItem{
    public BasicBroomItem(EntityType<? extends MobEntity> type, Settings settings) {
        super(type, settings);
    }
}
