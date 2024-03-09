package net.mindshake.witchmobility.client.renderer.item;

import net.mindshake.witchmobility.client.model.item.LeafshadeBroomItemModel;
import net.mindshake.witchmobility.item.LeafshadeBroomItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class LeafshadeBroomItemRenderer extends GeoItemRenderer<LeafshadeBroomItem> {
    public LeafshadeBroomItemRenderer() {
        super(new LeafshadeBroomItemModel());
    }
}
