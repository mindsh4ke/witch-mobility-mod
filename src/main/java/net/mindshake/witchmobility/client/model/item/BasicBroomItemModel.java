package net.mindshake.witchmobility.client.model.item;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.item.BasicBroomItem;
import net.mindshake.witchmobility.item.BroomItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BasicBroomItemModel extends AnimatedGeoModel<BasicBroomItem> {
    @Override
    public Identifier getModelLocation(BasicBroomItem object) {
        return EntityResources.BASIC_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureLocation(BasicBroomItem object) {
        return EntityResources.BASIC_BROOM_DEFAULT_TEXTURE;
    }

    @Override
    public Identifier getAnimationFileLocation(BasicBroomItem animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }
}
