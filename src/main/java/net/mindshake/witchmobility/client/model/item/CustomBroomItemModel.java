package net.mindshake.witchmobility.client.model.item;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.item.BlueBottleBroomItem;
import net.mindshake.witchmobility.item.CustomBroomItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class CustomBroomItemModel extends GeoModel<CustomBroomItem> {
    @Override
    public Identifier getModelResource(CustomBroomItem object) {
        switch (object.getModelType()) {
            case 0:
                return EntityResources.SNOWAIR_BROOM_MODEL;
            case 1:
                return EntityResources.LEAFSHADE_BROOM_MODEL;
            case 2:
                return EntityResources.WOODSHADE_BROOM_MODEL;
            case 3:
                return EntityResources.SILVER_ARROW_BROOM_MODEL;
            case 4:
                return EntityResources.GOLDENWOOD_BROOM_MODEL;
        }
        return EntityResources.BLUE_BOTTLE_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureResource(CustomBroomItem object) {
        return EntityResources.BLUE_BOTTLE_BROOM_TEXTURE;
    }

    @Override
    public Identifier getAnimationResource(CustomBroomItem animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
