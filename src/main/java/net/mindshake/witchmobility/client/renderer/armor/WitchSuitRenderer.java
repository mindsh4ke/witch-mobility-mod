package net.mindshake.witchmobility.client.renderer.armor;

import net.mindshake.witchmobility.client.model.armor.ApprenticeWitchHatModel;
import net.mindshake.witchmobility.client.model.armor.WitchSuitModel;
import net.mindshake.witchmobility.item.armor.WitchHat;
import net.mindshake.witchmobility.item.armor.WitchSuit;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class WitchSuitRenderer extends GeoArmorRenderer<WitchSuit> {
    public WitchSuitRenderer() {
        super(new WitchSuitModel());
    }
}
