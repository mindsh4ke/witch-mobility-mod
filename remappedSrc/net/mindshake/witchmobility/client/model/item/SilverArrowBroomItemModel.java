package net.mindshake.witchmobility.client.model.item;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.item.BlueBottleBroomItem;
import net.mindshake.witchmobility.item.SilverArrowBroomItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SilverArrowBroomItemModel extends AnimatedGeoModel<SilverArrowBroomItem> {
    @Override
    public Identifier getModelLocation(SilverArrowBroomItem object) {
        return EntityResources.SILVER_ARROW_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureLocation(SilverArrowBroomItem object) {
        return EntityResources.SILVER_ARROW_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationFileLocation(SilverArrowBroomItem animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
