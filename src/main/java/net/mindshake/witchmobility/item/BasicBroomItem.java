package net.mindshake.witchmobility.item;

import net.mindshake.witchmobility.client.renderer.item.BasicBroomItemRenderer;
import net.minecraft.client.render.item.BuiltinModelItemRenderer;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;

public class BasicBroomItem extends BroomItem {
    public BasicBroomItem(EntityType<? extends MobEntity> type, Settings settings) {
        super(type, settings);
    }

    @Override
    protected BuiltinModelItemRenderer getRenderer() {
        return new BasicBroomItemRenderer();
    }
}
