package net.mindshake.witchmobility.client.renderer.item;

import net.mindshake.witchmobility.client.model.item.WingsBroomItemModel;
import net.mindshake.witchmobility.item.WingsBroomItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class WingsBroomItemRenderer extends GeoItemRenderer<WingsBroomItem> {
    public WingsBroomItemRenderer() {
        super(new WingsBroomItemModel());
    }
}
