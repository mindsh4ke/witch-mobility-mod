package net.mindshake.witchmobility.client.renderer.item;

import net.mindshake.witchmobility.client.model.item.BlueBottleBroomItemModel;
import net.mindshake.witchmobility.client.model.item.SwiftstickBroomItemModel;
import net.mindshake.witchmobility.item.BlueBottleBroomItem;
import net.mindshake.witchmobility.item.SwiftstickBroomItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class SwiftstickBroomItemRenderer extends GeoItemRenderer<SwiftstickBroomItem> {
    public SwiftstickBroomItemRenderer() {
        super(new SwiftstickBroomItemModel());
    }
}
