package net.mindshake.witchmobility.client.model.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.entity.BasicBroomEntity;
import net.mindshake.witchmobility.entity.BlueBottleBroomEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class BlueBottleBroomEntityModel extends GeoModel<BlueBottleBroomEntity> {
    @Override
    public Identifier getModelResource(BlueBottleBroomEntity object) {
        return EntityResources.BLUE_BOTTLE_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureResource(BlueBottleBroomEntity object) {
        return EntityResources.BLUE_BOTTLE_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationResource(BlueBottleBroomEntity animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
