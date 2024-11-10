package net.mindshake.witchmobility.client.model.item;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.item.BasicBroomItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BasicBroomItemModel extends AnimatedGeoModel<BasicBroomItem> {
    @Override
    public ResourceLocation getModelResource(BasicBroomItem object) {
        return EntityResources.BASIC_BROOM_MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(BasicBroomItem object) {
        return EntityResources.BASIC_BROOM_DEFAULT_TEXTURE;
    }

    @Override
    public ResourceLocation getAnimationResource(BasicBroomItem animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
