package net.mindshake.witchmobility.item;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.mindshake.witchmobility.client.renderer.item.LeafshadeBroomItemRenderer;
import net.minecraft.client.render.item.BuiltinModelItemRenderer;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;

public class LeafshadeBroomItem extends BroomItem{
    public LeafshadeBroomItem(EntityType<? extends MobEntity> type, Settings settings) {
        super(type, settings);
    }
    @Environment(EnvType.CLIENT)
    @Override
    protected BuiltinModelItemRenderer getRenderer() {
        return new LeafshadeBroomItemRenderer();
    }
}
