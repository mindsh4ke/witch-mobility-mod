package net.mindshake.witchmobility.client.model.item;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.item.LeafshadeBroomItem;
import net.mindshake.witchmobility.item.SnowairBroomItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LeafshadeBroomItemModel extends AnimatedGeoModel<LeafshadeBroomItem> {
    @Override
    public Identifier getModelLocation(LeafshadeBroomItem object) {
        return EntityResources.LEAFSHADE_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureLocation(LeafshadeBroomItem object) {
        return EntityResources.LEAFSHADE_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationFileLocation(LeafshadeBroomItem animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
