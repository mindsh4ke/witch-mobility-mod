package net.mindshake.witchmobility.client.renderer.entity;

import net.mindshake.witchmobility.Main;
import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.client.model.entity.BasicBroomEntityModel;
import net.mindshake.witchmobility.client.model.entity.BlueBottleBroomEntityModel;
import net.mindshake.witchmobility.entity.BasicBroomEntity;
import net.mindshake.witchmobility.entity.BlueBottleBroomEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class BlueBottleBroomEntityRenderer extends GeoEntityRenderer<BlueBottleBroomEntity> {
    public BlueBottleBroomEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new BlueBottleBroomEntityModel());
    }

    @Override
    public Identifier getTextureLocation(BlueBottleBroomEntity instance) {
        return EntityResources.BLUE_BOTTLE_BROOM_TEXTURE;
    }
}
