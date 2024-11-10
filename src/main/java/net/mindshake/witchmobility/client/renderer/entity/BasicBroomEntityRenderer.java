package net.mindshake.witchmobility.client.renderer.entity;

import net.mindshake.witchmobility.WitchMobility;
import net.mindshake.witchmobility.entity.BasicBroomEntity;
import net.mindshake.witchmobility.client.model.entity.BasicBroomEntityModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class BasicBroomEntityRenderer extends GeoEntityRenderer<BasicBroomEntity> {
    public BasicBroomEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new BasicBroomEntityModel());
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull BasicBroomEntity instance) {
        return new ResourceLocation(WitchMobility.ID, "textures/entity/basic_broom.png");
    }
}
