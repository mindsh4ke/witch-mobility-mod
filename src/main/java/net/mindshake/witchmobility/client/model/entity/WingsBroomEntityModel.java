package net.mindshake.witchmobility.client.model.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.entity.LeafshadeBroomEntity;
import net.mindshake.witchmobility.entity.WingsBroomEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class WingsBroomEntityModel extends GeoModel<WingsBroomEntity> {
    @Override
    public Identifier getModelResource(WingsBroomEntity object) {
        return EntityResources.WINGS_BROOM_MOEDL;
    }

    @Override
    public Identifier getTextureResource(WingsBroomEntity object) {
        return EntityResources.WINGS_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationResource(WingsBroomEntity animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
