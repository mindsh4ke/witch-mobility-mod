package net.mindshake.witchmobility.client.model.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.entity.BlueBottleBroomEntity;
import net.mindshake.witchmobility.entity.SwiftstickBroomEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class SwiftstickBroomEntityModel extends GeoModel<SwiftstickBroomEntity> {
    @Override
    public Identifier getModelResource(SwiftstickBroomEntity object) {
        return EntityResources.SWIFTSTICK_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureResource(SwiftstickBroomEntity object) {
        return EntityResources.SWIFTSTICK_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationResource(SwiftstickBroomEntity animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
