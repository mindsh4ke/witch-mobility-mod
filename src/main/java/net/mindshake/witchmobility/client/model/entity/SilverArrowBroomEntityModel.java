package net.mindshake.witchmobility.client.model.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.entity.BlueBottleBroomEntity;
import net.mindshake.witchmobility.entity.SilverArrowBroomEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class SilverArrowBroomEntityModel extends GeoModel<SilverArrowBroomEntity> {
    @Override
    public Identifier getModelResource(SilverArrowBroomEntity object) {
        return EntityResources.SILVER_ARROW_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureResource(SilverArrowBroomEntity object) {
        return EntityResources.SILVER_ARROW_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationResource(SilverArrowBroomEntity animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
