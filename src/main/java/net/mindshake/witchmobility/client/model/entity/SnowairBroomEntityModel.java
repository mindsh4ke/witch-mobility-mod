package net.mindshake.witchmobility.client.model.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.entity.GoldenwoodBroomEntity;
import net.mindshake.witchmobility.entity.SnowairBroomEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class SnowairBroomEntityModel extends GeoModel<SnowairBroomEntity> {
    @Override
    public Identifier getModelResource(SnowairBroomEntity object) {
        return EntityResources.SNOWAIR_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureResource(SnowairBroomEntity object) {
        return EntityResources.SNOWAIR_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationResource(SnowairBroomEntity animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
