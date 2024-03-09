package net.mindshake.witchmobility.client.model.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.entity.FireboltBroomEntity;
import net.mindshake.witchmobility.entity.WoodShadeBroomEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class WoodShadeBroomEntityModel extends GeoModel<WoodShadeBroomEntity> {
    @Override
    public Identifier getModelResource(WoodShadeBroomEntity object) {
        return EntityResources.WOODSHADE_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureResource(WoodShadeBroomEntity object) {
        return EntityResources.WOODSHADE_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationResource(WoodShadeBroomEntity animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
