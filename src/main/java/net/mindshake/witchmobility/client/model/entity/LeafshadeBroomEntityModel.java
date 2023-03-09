package net.mindshake.witchmobility.client.model.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.entity.LeafshadeBroomEntity;
import net.mindshake.witchmobility.entity.SnowairBroomEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LeafshadeBroomEntityModel extends AnimatedGeoModel<LeafshadeBroomEntity> {
    @Override
    public Identifier getModelResource(LeafshadeBroomEntity object) {
        return EntityResources.LEAFSHADE_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureResource(LeafshadeBroomEntity object) {
        return EntityResources.LEAFSHADE_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationResource(LeafshadeBroomEntity animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
