package net.mindshake.witchmobility.client.renderer.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.client.model.entity.BlueBottleBroomEntityModel;
import net.mindshake.witchmobility.client.model.entity.SwiftstickBroomEntityModel;
import net.mindshake.witchmobility.entity.BlueBottleBroomEntity;
import net.mindshake.witchmobility.entity.SwiftstickBroomEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SwiftstickBroomEntityRenderer extends GeoEntityRenderer<SwiftstickBroomEntity> {
    public SwiftstickBroomEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new SwiftstickBroomEntityModel());
    }

    @Override
    public Identifier getTextureLocation(SwiftstickBroomEntity instance) {
        return EntityResources.SWIFTSTICK_BROOM_TEXTURE;
    }
}
