package net.mindshake.witchmobility.client.renderer.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.client.model.entity.SilverArrowBroomEntityModel;
import net.mindshake.witchmobility.entity.SilverArrowBroomEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SilverArrowBroomEntityRenderer extends GeoEntityRenderer<SilverArrowBroomEntity> {
    public SilverArrowBroomEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new SilverArrowBroomEntityModel());
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull SilverArrowBroomEntity instance) {
        return EntityResources.SILVER_ARROW_BROOM_TEXTURE;
    }
}
