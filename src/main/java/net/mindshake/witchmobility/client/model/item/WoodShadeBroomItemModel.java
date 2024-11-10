package net.mindshake.witchmobility.client.model.item;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.item.WoodShadeBroomItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WoodShadeBroomItemModel extends AnimatedGeoModel<WoodShadeBroomItem> {
    @Override
    public ResourceLocation getModelResource(WoodShadeBroomItem object) {
        return EntityResources.WOODSHADE_BROOM_MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(WoodShadeBroomItem object) {
        return EntityResources.WOODSHADE_BROOM_TEXTURE;
    }

    @Override
    public ResourceLocation getAnimationResource(WoodShadeBroomItem animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
