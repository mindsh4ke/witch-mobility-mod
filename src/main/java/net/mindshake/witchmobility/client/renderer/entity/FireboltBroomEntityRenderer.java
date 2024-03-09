package net.mindshake.witchmobility.client.renderer.entity;

import net.mindshake.witchmobility.Main;
import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.client.model.entity.BasicBroomEntityModel;
import net.mindshake.witchmobility.client.model.entity.FireboltBroomEntityModel;
import net.mindshake.witchmobility.entity.BasicBroomEntity;
import net.mindshake.witchmobility.entity.FireboltBroomEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class FireboltBroomEntityRenderer extends GeoEntityRenderer<FireboltBroomEntity> {
    public FireboltBroomEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new FireboltBroomEntityModel());
    }

    @Override
    public Identifier getTextureLocation(FireboltBroomEntity instance) {
        return EntityResources.FIREBOLT_BROOM_TEXTURE;
    }
}
