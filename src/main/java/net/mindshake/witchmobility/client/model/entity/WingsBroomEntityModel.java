package net.mindshake.witchmobility.client.model.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.entity.LeafshadeBroomEntity;
import net.mindshake.witchmobility.entity.WingsBroomEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WingsBroomEntityModel extends AnimatedGeoModel<WingsBroomEntity> {
    @Override
    public Identifier getModelLocation(WingsBroomEntity object) {
        return EntityResources.WINGS_BROOM_MOEDL;
    }

    @Override
    public Identifier getTextureLocation(WingsBroomEntity object) {
        return EntityResources.WINGS_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationFileLocation(WingsBroomEntity animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
