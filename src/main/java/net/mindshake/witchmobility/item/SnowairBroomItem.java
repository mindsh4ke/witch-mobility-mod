package net.mindshake.witchmobility.item;

import net.mindshake.witchmobility.client.renderer.item.BasicBroomItemRenderer;
import net.mindshake.witchmobility.client.renderer.item.SnowairBroomItemRenderer;
import net.minecraft.client.render.item.BuiltinModelItemRenderer;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;

public class SnowairBroomItem extends BroomItem{
    public SnowairBroomItem(EntityType<? extends MobEntity> type, Settings settings) {
        super(type, settings);
    }

    @Override
    protected BuiltinModelItemRenderer getRenderer() {
        return new SnowairBroomItemRenderer();
    }
}
