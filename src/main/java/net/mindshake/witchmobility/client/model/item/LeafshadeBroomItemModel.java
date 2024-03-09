package net.mindshake.witchmobility.client.model.item;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.item.LeafshadeBroomItem;
import net.mindshake.witchmobility.item.SnowairBroomItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class LeafshadeBroomItemModel extends GeoModel<LeafshadeBroomItem> {
    @Override
    public Identifier getModelResource(LeafshadeBroomItem object) {
        return EntityResources.LEAFSHADE_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureResource(LeafshadeBroomItem object) {
        return EntityResources.LEAFSHADE_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationResource(LeafshadeBroomItem animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
