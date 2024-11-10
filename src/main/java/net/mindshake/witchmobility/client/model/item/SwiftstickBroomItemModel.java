package net.mindshake.witchmobility.client.model.item;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.item.SwiftstickBroomItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SwiftstickBroomItemModel extends AnimatedGeoModel<SwiftstickBroomItem> {
    @Override
    public ResourceLocation getModelResource(SwiftstickBroomItem object) {
        return EntityResources.SWIFTSTICK_BROOM_MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(SwiftstickBroomItem object) {
        return EntityResources.SWIFTSTICK_BROOM_TEXTURE;
    }

    @Override
    public ResourceLocation getAnimationResource(SwiftstickBroomItem animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
