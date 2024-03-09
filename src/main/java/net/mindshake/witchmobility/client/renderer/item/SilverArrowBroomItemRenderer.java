package net.mindshake.witchmobility.client.renderer.item;

import net.mindshake.witchmobility.client.model.item.SilverArrowBroomItemModel;
import net.mindshake.witchmobility.item.SilverArrowBroomItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class SilverArrowBroomItemRenderer extends GeoItemRenderer<SilverArrowBroomItem> {
    public SilverArrowBroomItemRenderer() {
        super(new SilverArrowBroomItemModel());
    }
}
