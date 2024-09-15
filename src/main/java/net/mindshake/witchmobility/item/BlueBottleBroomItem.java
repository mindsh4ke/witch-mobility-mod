package net.mindshake.witchmobility.item;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.mindshake.witchmobility.client.renderer.item.BlueBottleBroomItemRenderer;
import net.minecraft.client.render.item.BuiltinModelItemRenderer;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;

public class BlueBottleBroomItem extends BroomItem{
    public BlueBottleBroomItem(EntityType<? extends MobEntity> type, Settings settings) {
        super(type, settings);
    }
    @Environment(EnvType.CLIENT)
    @Override
    protected BuiltinModelItemRenderer getRenderer() {
        return new BlueBottleBroomItemRenderer();
    }
}
