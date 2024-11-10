package net.mindshake.witchmobility.client.renderer.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.client.model.entity.WoodShadeBroomEntityModel;
import net.mindshake.witchmobility.entity.WoodShadeBroomEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class WoodShadeBroomEntityRenderer extends GeoEntityRenderer<WoodShadeBroomEntity> {
    public WoodShadeBroomEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new WoodShadeBroomEntityModel());
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull WoodShadeBroomEntity instance) {
        return EntityResources.WOODSHADE_BROOM_TEXTURE;
    }
}
