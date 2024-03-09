package net.mindshake.witchmobility.client.renderer.item;

import net.mindshake.witchmobility.client.model.item.SnowairBroomItemModel;
import net.mindshake.witchmobility.item.SnowairBroomItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class SnowairBroomItemRenderer extends GeoItemRenderer<SnowairBroomItem> {
    public SnowairBroomItemRenderer() {
        super(new SnowairBroomItemModel());
    }
}
