package net.mindshake.witchmobility.client.model.item;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.item.GoldenwoodBroomItem;
import net.mindshake.witchmobility.item.SnowairBroomItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class SnowairBroomItemModel extends GeoModel<SnowairBroomItem> {
    @Override
    public Identifier getModelResource(SnowairBroomItem object) {
        return EntityResources.SNOWAIR_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureResource(SnowairBroomItem object) {
        return EntityResources.SNOWAIR_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationResource(SnowairBroomItem animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
