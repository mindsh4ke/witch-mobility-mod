package net.mindshake.witchmobility.client.model.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.entity.WoodShadeBroomEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WoodShadeBroomEntityModel extends AnimatedGeoModel<WoodShadeBroomEntity> {
    @Override
    public ResourceLocation getModelResource(WoodShadeBroomEntity object) {
        return EntityResources.WOODSHADE_BROOM_MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(WoodShadeBroomEntity object) {
        return EntityResources.WOODSHADE_BROOM_TEXTURE;
    }

    @Override
    public ResourceLocation getAnimationResource(WoodShadeBroomEntity animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
