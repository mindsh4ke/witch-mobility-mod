package net.mindshake.witchmobility.client.renderer.entity;

import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.client.model.entity.LeafshadeBroomEntityModel;
import net.mindshake.witchmobility.client.model.entity.SnowairBroomEntityModel;
import net.mindshake.witchmobility.entity.LeafshadeBroomEntity;
import net.mindshake.witchmobility.entity.SnowairBroomEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class LeafshadeBroomEntityRenderer extends GeoEntityRenderer<LeafshadeBroomEntity> {
    public LeafshadeBroomEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new LeafshadeBroomEntityModel());
    }

    @Override
    public Identifier getTextureLocation(LeafshadeBroomEntity instance) {
        return EntityResources.LEAFSHADE_BROOM_TEXTURE;
    }
}
