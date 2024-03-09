package net.mindshake.witchmobility.client.renderer.item;

import net.mindshake.witchmobility.client.model.item.CustomBroomItemModel;
import net.mindshake.witchmobility.item.CustomBroomItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class CustomBroomItemRenderer extends GeoItemRenderer<CustomBroomItem> {
    public CustomBroomItemRenderer() {
        super(new CustomBroomItemModel());
    }
}
