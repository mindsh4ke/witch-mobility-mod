package net.mindshake.witchmobility.client.renderer.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.client.model.entity.FireboltBroomEntityModel;
import net.mindshake.witchmobility.entity.FireboltBroomEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class FireboltBroomEntityRenderer extends GeoEntityRenderer<FireboltBroomEntity> {
    public FireboltBroomEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new FireboltBroomEntityModel());
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull FireboltBroomEntity instance) {
        return EntityResources.FIREBOLT_BROOM_TEXTURE;
    }
}
