package net.mindshake.witchmobility.client.renderer.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.client.model.entity.BlueBottleBroomEntityModel;
import net.mindshake.witchmobility.client.model.entity.WoodShadeBroomEntityModel;
import net.mindshake.witchmobility.entity.BlueBottleBroomEntity;
import net.mindshake.witchmobility.entity.WoodShadeBroomEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class WoodShadeBroomEntityRenderer extends GeoEntityRenderer<WoodShadeBroomEntity> {
    public WoodShadeBroomEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new WoodShadeBroomEntityModel());
    }

    @Override
    public Identifier getTextureLocation(WoodShadeBroomEntity instance) {
        return EntityResources.WOODSHADE_BROOM_TEXTURE;
    }
}
