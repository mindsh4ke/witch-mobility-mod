package net.mindshake.witchmobility.client.model.armor;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.item.armor.WitchHat;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class ApprenticeWitchHatModel extends GeoModel<WitchHat> {
    @Override
    public Identifier getModelResource(WitchHat object) {
        return EntityResources.WITCH_HAT_MODEL;
    }

    @Override
    public Identifier getTextureResource(WitchHat object) {
        return EntityResources.WITCH_HAT_TEXTURE_VARIANTS[object.getVariant()];
    }

    @Override
    public Identifier getAnimationResource(WitchHat animatable) {
        return null;
    }
}
