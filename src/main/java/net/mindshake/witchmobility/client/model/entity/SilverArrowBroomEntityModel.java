package net.mindshake.witchmobility.client.model.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.entity.SilverArrowBroomEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SilverArrowBroomEntityModel extends AnimatedGeoModel<SilverArrowBroomEntity> {
    @Override
    public ResourceLocation getModelResource(SilverArrowBroomEntity object) {
        return EntityResources.SILVER_ARROW_BROOM_MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(SilverArrowBroomEntity object) {
        return EntityResources.SILVER_ARROW_BROOM_TEXTURE;
    }

    @Override
    public ResourceLocation getAnimationResource(SilverArrowBroomEntity animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
