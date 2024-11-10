package net.mindshake.witchmobility.client.model.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.entity.SwiftstickBroomEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SwiftstickBroomEntityModel extends AnimatedGeoModel<SwiftstickBroomEntity> {
    @Override
    public ResourceLocation getModelResource(SwiftstickBroomEntity object) {
        return EntityResources.SWIFTSTICK_BROOM_MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(SwiftstickBroomEntity object) {
        return EntityResources.SWIFTSTICK_BROOM_TEXTURE;
    }

    @Override
    public ResourceLocation getAnimationResource(SwiftstickBroomEntity animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
