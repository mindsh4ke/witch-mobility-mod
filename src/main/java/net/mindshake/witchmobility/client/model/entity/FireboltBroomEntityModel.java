package net.mindshake.witchmobility.client.model.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.entity.FireboltBroomEntity;
import net.mindshake.witchmobility.entity.SilverArrowBroomEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class FireboltBroomEntityModel extends GeoModel<FireboltBroomEntity> {
    @Override
    public Identifier getModelResource(FireboltBroomEntity object) {
        return EntityResources.BASIC_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureResource(FireboltBroomEntity object) {
        return EntityResources.FIREBOLT_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationResource(FireboltBroomEntity animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
