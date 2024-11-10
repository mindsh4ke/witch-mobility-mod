package net.mindshake.witchmobility.client.model.item;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.item.SilverArrowBroomItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SilverArrowBroomItemModel extends AnimatedGeoModel<SilverArrowBroomItem> {
    @Override
    public ResourceLocation getModelResource(SilverArrowBroomItem object) {
        return EntityResources.SILVER_ARROW_BROOM_MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(SilverArrowBroomItem object) {
        return EntityResources.SILVER_ARROW_BROOM_TEXTURE;
    }

    @Override
    public ResourceLocation getAnimationResource(SilverArrowBroomItem animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
