package net.mindshake.witchmobility.client.model.entity;

import net.mindshake.witchmobility.Main;
import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.entity.BasicBroomEntity;
import net.mindshake.witchmobility.item.BasicBroomItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BasicBroomEntityModel extends AnimatedGeoModel<BasicBroomEntity> {
    @Override
    public Identifier getModelResource(BasicBroomEntity object) {
        return EntityResources.BASIC_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureResource(BasicBroomEntity object) {
        return EntityResources.BASIC_BROOM_DEFAULT_TEXTURE;
    }

    @Override
    public Identifier getAnimationResource(BasicBroomEntity animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
