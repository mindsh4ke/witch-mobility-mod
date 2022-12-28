package net.mindshake.witchmobility.client.model.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.entity.BlueBottleBroomEntity;
import net.mindshake.witchmobility.entity.SwiftstickBroomEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SwiftstickBroomEntityModel extends AnimatedGeoModel<SwiftstickBroomEntity> {
    @Override
    public Identifier getModelLocation(SwiftstickBroomEntity object) {
        return EntityResources.SWIFTSTICK_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureLocation(SwiftstickBroomEntity object) {
        return EntityResources.SWIFTSTICK_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationFileLocation(SwiftstickBroomEntity animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
