package net.mindshake.witchmobility.client.model.item;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.item.FireboltBroomItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FireboltBroomItemModel extends AnimatedGeoModel<FireboltBroomItem> {
    @Override
    public ResourceLocation getModelResource(FireboltBroomItem object) {
        return EntityResources.BASIC_BROOM_MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(FireboltBroomItem object) {
        return EntityResources.FIREBOLT_BROOM_TEXTURE;
    }

    @Override
    public ResourceLocation getAnimationResource(FireboltBroomItem animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
