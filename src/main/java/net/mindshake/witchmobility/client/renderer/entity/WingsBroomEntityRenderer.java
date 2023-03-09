package net.mindshake.witchmobility.client.renderer.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.client.model.entity.LeafshadeBroomEntityModel;
import net.mindshake.witchmobility.client.model.entity.WingsBroomEntityModel;
import net.mindshake.witchmobility.entity.LeafshadeBroomEntity;
import net.mindshake.witchmobility.entity.WingsBroomEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class WingsBroomEntityRenderer extends GeoEntityRenderer<WingsBroomEntity> {
    public WingsBroomEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new WingsBroomEntityModel());
    }

    @Override
    public Identifier getTextureLocation(WingsBroomEntity instance) {
        return EntityResources.WINGS_BROOM_TEXTURE;
    }
}
