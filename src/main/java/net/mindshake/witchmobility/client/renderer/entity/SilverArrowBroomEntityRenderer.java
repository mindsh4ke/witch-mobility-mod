package net.mindshake.witchmobility.client.renderer.entity;

import net.mindshake.witchmobility.Main;
import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.client.model.entity.BasicBroomEntityModel;
import net.mindshake.witchmobility.client.model.entity.SilverArrowBroomEntityModel;
import net.mindshake.witchmobility.entity.BasicBroomEntity;
import net.mindshake.witchmobility.entity.SilverArrowBroomEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class SilverArrowBroomEntityRenderer extends GeoEntityRenderer<SilverArrowBroomEntity> {
    public SilverArrowBroomEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new SilverArrowBroomEntityModel());
    }

    @Override
    public Identifier getTextureLocation(SilverArrowBroomEntity instance) {
        return EntityResources.SILVER_ARROW_BROOM_TEXTURE;
    }
}
