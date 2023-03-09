package net.mindshake.witchmobility.client.model.item;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.item.LeafshadeBroomItem;
import net.mindshake.witchmobility.item.WingsBroomItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WingsBroomItemModel extends AnimatedGeoModel<WingsBroomItem> {
    @Override
    public Identifier getModelLocation(WingsBroomItem object) {
        return EntityResources.WINGS_BROOM_MOEDL;
    }

    @Override
    public Identifier getTextureLocation(WingsBroomItem object) {
        return EntityResources.WINGS_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationFileLocation(WingsBroomItem animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
