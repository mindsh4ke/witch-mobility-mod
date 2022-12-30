package net.mindshake.witchmobility.client.renderer.item;

import net.mindshake.witchmobility.client.model.item.FireboltBroomItemModel;
import net.mindshake.witchmobility.client.model.item.WoodShadeBroomItemModel;
import net.mindshake.witchmobility.item.FireboltBroomItem;
import net.mindshake.witchmobility.item.WoodShadeBroomItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class WoodShadeBroomItemRenderer extends GeoItemRenderer<WoodShadeBroomItem> {
    public WoodShadeBroomItemRenderer() {
        super(new WoodShadeBroomItemModel());
    }
}
