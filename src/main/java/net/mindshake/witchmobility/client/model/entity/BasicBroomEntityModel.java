package net.mindshake.witchmobility.client.model.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.entity.BasicBroomEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BasicBroomEntityModel extends AnimatedGeoModel<BasicBroomEntity> {
    @Override
    public ResourceLocation getModelResource(BasicBroomEntity object) {
        return EntityResources.BASIC_BROOM_MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(BasicBroomEntity object) {
        return EntityResources.BASIC_BROOM_DEFAULT_TEXTURE;
    }

    @Override
    public ResourceLocation getAnimationResource(BasicBroomEntity animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
