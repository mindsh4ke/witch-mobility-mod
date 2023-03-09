package net.mindshake.witchmobility.client.renderer.item;

import net.mindshake.witchmobility.client.model.item.LeafshadeBroomItemModel;
import net.mindshake.witchmobility.client.model.item.SnowairBroomItemModel;
import net.mindshake.witchmobility.item.LeafshadeBroomItem;
import net.mindshake.witchmobility.item.SnowairBroomItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class LeafshadeBroomItemRenderer extends GeoItemRenderer<LeafshadeBroomItem> {
    public LeafshadeBroomItemRenderer() {
        super(new LeafshadeBroomItemModel());
    }
}
