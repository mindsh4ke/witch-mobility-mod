package net.mindshake.witchmobility.client.renderer.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.client.model.entity.BlueBottleBroomEntityModel;
import net.mindshake.witchmobility.client.model.entity.GoldenwoodBroomEntityModel;
import net.mindshake.witchmobility.entity.BlueBottleBroomEntity;
import net.mindshake.witchmobility.entity.GoldenwoodBroomEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GoldenwoodBroomEntityRenderer extends GeoEntityRenderer<GoldenwoodBroomEntity> {
    public GoldenwoodBroomEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new GoldenwoodBroomEntityModel());
    }

    @Override
    public Identifier getTextureLocation(GoldenwoodBroomEntity instance) {
        return EntityResources.GOLDENWOOD_BROOM_TEXTURE;
    }
}
