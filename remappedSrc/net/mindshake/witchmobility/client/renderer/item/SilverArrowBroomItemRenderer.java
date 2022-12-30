package net.mindshake.witchmobility.client.renderer.item;

import net.mindshake.witchmobility.client.model.item.BlueBottleBroomItemModel;
import net.mindshake.witchmobility.client.model.item.SilverArrowBroomItemModel;
import net.mindshake.witchmobility.item.BlueBottleBroomItem;
import net.mindshake.witchmobility.item.SilverArrowBroomItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class SilverArrowBroomItemRenderer extends GeoItemRenderer<SilverArrowBroomItem> {
    public SilverArrowBroomItemRenderer() {
        super(new SilverArrowBroomItemModel());
    }
}
