package net.mindshake.witchmobility.client.model.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.entity.FireboltBroomEntity;
import net.mindshake.witchmobility.entity.GoldenwoodBroomEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GoldenwoodBroomEntityModel extends AnimatedGeoModel<GoldenwoodBroomEntity> {
    @Override
    public Identifier getModelLocation(GoldenwoodBroomEntity object) {
        return EntityResources.GOLDENWOOD_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureLocation(GoldenwoodBroomEntity object) {
        return EntityResources.GOLDENWOOD_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationFileLocation(GoldenwoodBroomEntity animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
