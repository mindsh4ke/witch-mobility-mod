package net.mindshake.witchmobility.client.model.item;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.item.BlueBottleBroomItem;
import net.mindshake.witchmobility.item.SwiftstickBroomItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SwiftstickBroomItemModel extends AnimatedGeoModel<SwiftstickBroomItem> {
    @Override
    public Identifier getModelLocation(SwiftstickBroomItem object) {
        return EntityResources.SWIFTSTICK_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureLocation(SwiftstickBroomItem object) {
        return EntityResources.SWIFTSTICK_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationFileLocation(SwiftstickBroomItem animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
