package net.mindshake.witchmobility.client.renderer.armor;

import net.mindshake.witchmobility.client.model.armor.ApprenticeWitchHatModel;
import net.mindshake.witchmobility.item.armor.WitchHat;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ApprenticeWitchHatRenderer extends GeoArmorRenderer<WitchHat> {
    public ApprenticeWitchHatRenderer() {
        super(new ApprenticeWitchHatModel());
        this.headBone = "armorHead";
    }
}
