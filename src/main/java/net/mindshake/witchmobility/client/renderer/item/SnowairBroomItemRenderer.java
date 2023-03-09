package net.mindshake.witchmobility.client.renderer.item;

import net.mindshake.witchmobility.client.model.item.GoldenwoodBroomItemModel;
import net.mindshake.witchmobility.client.model.item.SnowairBroomItemModel;
import net.mindshake.witchmobility.item.GoldenwoodBroomItem;
import net.mindshake.witchmobility.item.SnowairBroomItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class SnowairBroomItemRenderer extends GeoItemRenderer<SnowairBroomItem> {
    public SnowairBroomItemRenderer() {
        super(new SnowairBroomItemModel());
    }
}
