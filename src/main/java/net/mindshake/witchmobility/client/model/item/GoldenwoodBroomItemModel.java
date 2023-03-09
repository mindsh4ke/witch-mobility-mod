package net.mindshake.witchmobility.client.model.item;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.item.BlueBottleBroomItem;
import net.mindshake.witchmobility.item.GoldenwoodBroomItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GoldenwoodBroomItemModel extends AnimatedGeoModel<GoldenwoodBroomItem> {
    @Override
    public Identifier getModelLocation(GoldenwoodBroomItem object) {
        return EntityResources.GOLDENWOOD_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureLocation(GoldenwoodBroomItem object) {
        return EntityResources.GOLDENWOOD_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationFileLocation(GoldenwoodBroomItem animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
