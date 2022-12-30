package net.mindshake.witchmobility.client.model.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.entity.FireboltBroomEntity;
import net.mindshake.witchmobility.entity.WoodShadeBroomEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WoodShadeBroomEntityModel extends AnimatedGeoModel<WoodShadeBroomEntity> {
    @Override
    public Identifier getModelLocation(WoodShadeBroomEntity object) {
        return EntityResources.WOODSHADE_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureLocation(WoodShadeBroomEntity object) {
        return EntityResources.WOODSHADE_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationFileLocation(WoodShadeBroomEntity animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
