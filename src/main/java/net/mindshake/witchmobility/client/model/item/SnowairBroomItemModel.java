package net.mindshake.witchmobility.client.model.item;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.item.GoldenwoodBroomItem;
import net.mindshake.witchmobility.item.SnowairBroomItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SnowairBroomItemModel extends AnimatedGeoModel<SnowairBroomItem> {
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
