package net.mindshake.witchmobility.client.model.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.entity.FireboltBroomEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FireboltBroomEntityModel extends AnimatedGeoModel<FireboltBroomEntity> {
    @Override
    public ResourceLocation getModelResource(FireboltBroomEntity object) {
        return EntityResources.BASIC_BROOM_MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(FireboltBroomEntity object) {
        return EntityResources.FIREBOLT_BROOM_TEXTURE;
    }

    @Override
    public ResourceLocation getAnimationResource(FireboltBroomEntity animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
