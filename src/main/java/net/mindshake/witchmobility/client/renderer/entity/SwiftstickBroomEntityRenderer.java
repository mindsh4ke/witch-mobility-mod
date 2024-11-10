package net.mindshake.witchmobility.client.renderer.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.client.model.entity.SwiftstickBroomEntityModel;
import net.mindshake.witchmobility.entity.SwiftstickBroomEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SwiftstickBroomEntityRenderer extends GeoEntityRenderer<SwiftstickBroomEntity> {
    public SwiftstickBroomEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new SwiftstickBroomEntityModel());
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull SwiftstickBroomEntity instance) {
        return EntityResources.SWIFTSTICK_BROOM_TEXTURE;
    }
}
