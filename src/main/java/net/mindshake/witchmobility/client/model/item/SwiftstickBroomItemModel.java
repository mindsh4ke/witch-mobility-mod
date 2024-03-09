package net.mindshake.witchmobility.client.model.item;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.item.BlueBottleBroomItem;
import net.mindshake.witchmobility.item.SwiftstickBroomItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class SwiftstickBroomItemModel extends GeoModel<SwiftstickBroomItem> {
    @Override
    public Identifier getModelResource(SwiftstickBroomItem object) {
        return EntityResources.SWIFTSTICK_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureResource(SwiftstickBroomItem object) {
        return EntityResources.SWIFTSTICK_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationResource(SwiftstickBroomItem animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
