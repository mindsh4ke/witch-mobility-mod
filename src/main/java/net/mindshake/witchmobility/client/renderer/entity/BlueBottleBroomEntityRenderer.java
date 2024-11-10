package net.mindshake.witchmobility.client.renderer.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.client.model.entity.BlueBottleBroomEntityModel;
import net.mindshake.witchmobility.entity.BlueBottleBroomEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class BlueBottleBroomEntityRenderer extends GeoEntityRenderer<BlueBottleBroomEntity> {
    public BlueBottleBroomEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new BlueBottleBroomEntityModel());
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull BlueBottleBroomEntity instance) {
        return EntityResources.BLUE_BOTTLE_BROOM_TEXTURE;
    }
}
