package net.mindshake.witchmobility.client.model.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.entity.FireboltBroomEntity;
import net.mindshake.witchmobility.entity.GoldenwoodBroomEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class GoldenwoodBroomEntityModel extends GeoModel<GoldenwoodBroomEntity> {
    @Override
    public Identifier getModelResource(GoldenwoodBroomEntity object) {
        return EntityResources.GOLDENWOOD_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureResource(GoldenwoodBroomEntity object) {
        return EntityResources.GOLDENWOOD_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationResource(GoldenwoodBroomEntity animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
