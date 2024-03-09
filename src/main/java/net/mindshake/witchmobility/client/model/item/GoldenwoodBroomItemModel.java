package net.mindshake.witchmobility.client.model.item;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.item.BlueBottleBroomItem;
import net.mindshake.witchmobility.item.GoldenwoodBroomItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class GoldenwoodBroomItemModel extends GeoModel<GoldenwoodBroomItem> {
    @Override
    public Identifier getModelResource(GoldenwoodBroomItem object) {
        return EntityResources.GOLDENWOOD_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureResource(GoldenwoodBroomItem object) {
        return EntityResources.GOLDENWOOD_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationResource(GoldenwoodBroomItem animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
