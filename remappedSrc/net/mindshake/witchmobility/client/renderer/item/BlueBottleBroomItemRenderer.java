package net.mindshake.witchmobility.client.renderer.item;

import net.mindshake.witchmobility.client.model.item.BasicBroomItemModel;
import net.mindshake.witchmobility.client.model.item.BlueBottleBroomItemModel;
import net.mindshake.witchmobility.item.BasicBroomItem;
import net.mindshake.witchmobility.item.BlueBottleBroomItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class BlueBottleBroomItemRenderer extends GeoItemRenderer<BlueBottleBroomItem> {
    public BlueBottleBroomItemRenderer() {
        super(new BlueBottleBroomItemModel());
    }
}
