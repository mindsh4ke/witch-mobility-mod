package net.mindshake.witchmobility.client.model.item;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.item.GoldenwoodBroomItem;
import net.mindshake.witchmobility.item.SnowairBroomItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SnowairBroomItemModel extends AnimatedGeoModel<SnowairBroomItem> {
    @Override
    public Identifier getModelLocation(SnowairBroomItem object) {
        return EntityResources.SNOWAIR_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureLocation(SnowairBroomItem object) {
        return EntityResources.SNOWAIR_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationFileLocation(SnowairBroomItem animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
