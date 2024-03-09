package net.mindshake.witchmobility.client.renderer.entity;

import net.mindshake.witchmobility.Main;
import net.mindshake.witchmobility.entity.BasicBroomEntity;
import net.mindshake.witchmobility.client.model.entity.BasicBroomEntityModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class BasicBroomEntityRenderer extends GeoEntityRenderer<BasicBroomEntity> {
    public BasicBroomEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new BasicBroomEntityModel());
    }

    @Override
    public Identifier getTextureLocation(BasicBroomEntity instance) {
        return new Identifier(Main.MOD_ID, "textures/entity/basic_broom.png");
    }
}
