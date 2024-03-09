package net.mindshake.witchmobility.client.renderer.item;

import net.mindshake.witchmobility.client.model.item.BlueBottleBroomItemModel;
import net.mindshake.witchmobility.client.model.item.GoldenwoodBroomItemModel;
import net.mindshake.witchmobility.item.BlueBottleBroomItem;
import net.mindshake.witchmobility.item.GoldenwoodBroomItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class GoldenwoodBroomItemRenderer extends GeoItemRenderer<GoldenwoodBroomItem> {
    public GoldenwoodBroomItemRenderer() {
        super(new GoldenwoodBroomItemModel());
    }
}
