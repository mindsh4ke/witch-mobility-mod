package net.mindshake.witchmobility.client.renderer.item;

import net.mindshake.witchmobility.client.model.item.BlueBottleBroomItemModel;
import net.mindshake.witchmobility.client.model.item.FireboltBroomItemModel;
import net.mindshake.witchmobility.item.BlueBottleBroomItem;
import net.mindshake.witchmobility.item.FireboltBroomItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class FireboltBroomItemRenderer extends GeoItemRenderer<FireboltBroomItem> {
    public FireboltBroomItemRenderer() {
        super(new FireboltBroomItemModel());
    }
}
