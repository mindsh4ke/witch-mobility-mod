package net.mindshake.witchmobility.client.renderer.item;

import net.mindshake.witchmobility.client.model.item.LeafshadeBroomItemModel;
import net.mindshake.witchmobility.client.model.item.WingsBroomItemModel;
import net.mindshake.witchmobility.item.LeafshadeBroomItem;
import net.mindshake.witchmobility.item.WingsBroomItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class WingsBroomItemRenderer extends GeoItemRenderer<WingsBroomItem> {
    public WingsBroomItemRenderer() {
        super(new WingsBroomItemModel());
    }
}
