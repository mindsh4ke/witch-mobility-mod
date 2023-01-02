package net.mindshake.witchmobility.client.model.armor;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.item.armor.WitchHat;
import net.mindshake.witchmobility.item.armor.WitchSuit;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WitchSuitModel extends AnimatedGeoModel<WitchSuit> {
    @Override
    public Identifier getModelLocation(WitchSuit object) {
        return EntityResources.WITCH_SUIT_MODEL;
    }

    @Override
    public Identifier getTextureLocation(WitchSuit object) {
        return EntityResources.WITCH_SUIT_TEXTURE;
    }

    @Override
    public Identifier getAnimationFileLocation(WitchSuit animatable) {
        return null;
    }
}
