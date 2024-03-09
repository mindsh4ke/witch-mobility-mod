package net.mindshake.witchmobility.client.model.item;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.item.BlueBottleBroomItem;
import net.mindshake.witchmobility.item.WoodShadeBroomItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class WoodShadeBroomItemModel extends GeoModel<WoodShadeBroomItem> {
    @Override
    public Identifier getModelResource(WoodShadeBroomItem object) {
        return EntityResources.WOODSHADE_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureResource(WoodShadeBroomItem object) {
        return EntityResources.WOODSHADE_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationResource(WoodShadeBroomItem animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
