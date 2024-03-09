package net.mindshake.witchmobility.client.model.item;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.item.BasicBroomItem;
import net.mindshake.witchmobility.item.BlueBottleBroomItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class BlueBottleBroomItemModel extends GeoModel<BlueBottleBroomItem> {
    @Override
    public Identifier getModelResource(BlueBottleBroomItem object) {
        return EntityResources.BLUE_BOTTLE_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureResource(BlueBottleBroomItem object) {
        return EntityResources.BLUE_BOTTLE_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationResource(BlueBottleBroomItem animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
