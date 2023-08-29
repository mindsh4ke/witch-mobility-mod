package net.mindshake.witchmobility.client.renderer.item;

import net.mindshake.witchmobility.client.model.item.CustomBroomItemModel;
import net.mindshake.witchmobility.item.CustomBroomItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class CustomBroomItemRenderer extends GeoItemRenderer<CustomBroomItem> {
    public CustomBroomItemRenderer() {
        super(new CustomBroomItemModel());
    }
}
