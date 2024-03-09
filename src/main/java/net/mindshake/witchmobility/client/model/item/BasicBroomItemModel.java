package net.mindshake.witchmobility.client.model.item;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.item.BasicBroomItem;
import net.mindshake.witchmobility.item.BroomItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class BasicBroomItemModel extends GeoModel<BasicBroomItem> {
    @Override
    public Identifier getModelResource(BasicBroomItem object) {
        return EntityResources.BASIC_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureResource(BasicBroomItem object) {
        return EntityResources.BASIC_BROOM_DEFAULT_TEXTURE;
    }

    @Override
    public Identifier getAnimationResource(BasicBroomItem animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
