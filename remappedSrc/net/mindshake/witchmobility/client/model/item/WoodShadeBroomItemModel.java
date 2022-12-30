package net.mindshake.witchmobility.client.model.item;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.item.BlueBottleBroomItem;
import net.mindshake.witchmobility.item.WoodShadeBroomItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WoodShadeBroomItemModel extends AnimatedGeoModel<WoodShadeBroomItem> {
    @Override
    public Identifier getModelLocation(WoodShadeBroomItem object) {
        return EntityResources.WOODSHADE_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureLocation(WoodShadeBroomItem object) {
        return EntityResources.WOODSHADE_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationFileLocation(WoodShadeBroomItem animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
