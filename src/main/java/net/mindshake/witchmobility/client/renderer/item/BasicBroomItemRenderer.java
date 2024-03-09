package net.mindshake.witchmobility.client.renderer.item;

import net.mindshake.witchmobility.client.model.item.BasicBroomItemModel;
import net.mindshake.witchmobility.item.BasicBroomItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class BasicBroomItemRenderer extends GeoItemRenderer<BasicBroomItem> {
    public BasicBroomItemRenderer() {
        super(new BasicBroomItemModel());
    }
}
