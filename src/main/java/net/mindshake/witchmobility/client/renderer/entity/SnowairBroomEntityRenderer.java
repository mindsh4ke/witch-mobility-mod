package net.mindshake.witchmobility.client.renderer.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.client.model.entity.GoldenwoodBroomEntityModel;
import net.mindshake.witchmobility.client.model.entity.SnowairBroomEntityModel;
import net.mindshake.witchmobility.entity.GoldenwoodBroomEntity;
import net.mindshake.witchmobility.entity.SnowairBroomEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class SnowairBroomEntityRenderer extends GeoEntityRenderer<SnowairBroomEntity> {
    public SnowairBroomEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new SnowairBroomEntityModel());
    }

    @Override
    public Identifier getTextureLocation(SnowairBroomEntity instance) {
        return EntityResources.SNOWAIR_BROOM_TEXTURE;
    }
}
