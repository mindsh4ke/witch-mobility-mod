package net.mindshake.witchmobility.client.model.armor;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.item.armor.WitchHat;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ApprenticeWitchHatModel extends AnimatedGeoModel<WitchHat> {
    @Override
    public Identifier getModelLocation(WitchHat object) {
        return EntityResources.WITCH_HAT_MODEL;
    }

    @Override
    public Identifier getTextureLocation(WitchHat object) {
        return EntityResources.WITCH_HAT_TEXTURE_VARIANTS[object.getVariant()];
    }

    @Override
    public Identifier getAnimationFileLocation(WitchHat animatable) {
        return null;
    }
}
