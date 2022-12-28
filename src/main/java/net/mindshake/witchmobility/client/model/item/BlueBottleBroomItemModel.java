package net.mindshake.witchmobility.client.model.item;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.item.BasicBroomItem;
import net.mindshake.witchmobility.item.BlueBottleBroomItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlueBottleBroomItemModel extends AnimatedGeoModel<BlueBottleBroomItem> {
    @Override
    public Identifier getModelLocation(BlueBottleBroomItem object) {
        return EntityResources.BLUE_BOTTLE_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureLocation(BlueBottleBroomItem object) {
        return EntityResources.BLUE_BOTTLE_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationFileLocation(BlueBottleBroomItem animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
