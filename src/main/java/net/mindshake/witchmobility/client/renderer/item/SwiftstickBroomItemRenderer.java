package net.mindshake.witchmobility.client.renderer.item;

import net.mindshake.witchmobility.client.model.item.SwiftstickBroomItemModel;
import net.mindshake.witchmobility.item.SwiftstickBroomItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class SwiftstickBroomItemRenderer extends GeoItemRenderer<SwiftstickBroomItem> {
    public SwiftstickBroomItemRenderer() {
        super(new SwiftstickBroomItemModel());
    }
}
