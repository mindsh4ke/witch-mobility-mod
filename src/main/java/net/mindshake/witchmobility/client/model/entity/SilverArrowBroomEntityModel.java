package net.mindshake.witchmobility.client.model.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.entity.BlueBottleBroomEntity;
import net.mindshake.witchmobility.entity.SilverArrowBroomEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SilverArrowBroomEntityModel extends AnimatedGeoModel<SilverArrowBroomEntity> {
    @Override
    public Identifier getModelLocation(SilverArrowBroomEntity object) {
        return EntityResources.SILVER_ARROW_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureLocation(SilverArrowBroomEntity object) {
        return EntityResources.SILVER_ARROW_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationFileLocation(SilverArrowBroomEntity animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
