package net.mindshake.witchmobility.client.model.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.entity.GoldenwoodBroomEntity;
import net.mindshake.witchmobility.entity.SnowairBroomEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SnowairBroomEntityModel extends AnimatedGeoModel<SnowairBroomEntity> {
    @Override
    public Identifier getModelLocation(SnowairBroomEntity object) {
        return EntityResources.SNOWAIR_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureLocation(SnowairBroomEntity object) {
        return EntityResources.SNOWAIR_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationFileLocation(SnowairBroomEntity animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
