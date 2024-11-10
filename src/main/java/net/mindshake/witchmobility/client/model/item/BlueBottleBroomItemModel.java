package net.mindshake.witchmobility.client.model.item;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.item.BlueBottleBroomItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlueBottleBroomItemModel extends AnimatedGeoModel<BlueBottleBroomItem> {
    @Override
    public ResourceLocation getModelResource(BlueBottleBroomItem object) {
        return EntityResources.BLUE_BOTTLE_BROOM_MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(BlueBottleBroomItem object) {
        return EntityResources.BLUE_BOTTLE_BROOM_TEXTURE;
    }

    @Override
    public ResourceLocation getAnimationResource(BlueBottleBroomItem animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
