package net.mindshake.witchmobility.client.model.entity;

import net.mindshake.witchmobility.Main;
import net.mindshake.witchmobility.client.EntityResources;
import net.mindshake.witchmobility.entity.BasicBroomEntity;
import net.mindshake.witchmobility.item.BasicBroomItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class BasicBroomEntityModel extends GeoModel<BasicBroomEntity> {
    @Override
    public Identifier getModelResource(BasicBroomEntity object) {
        return EntityResources.BASIC_BROOM_MODEL;
    }

    @Override
    public Identifier getTextureResource(BasicBroomEntity object) {
        return EntityResources.BASIC_BROOM_DEFAULT_TEXTURE;
    }

    @Override
    public Identifier getAnimationResource(BasicBroomEntity animatable) {
        return EntityResources.BASIC_ANIMATIONS;
    }

    /*@SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(BasicBroomEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");
        IBone canyon = this.getAnimationProcessor().getBone("canyon");
        head.setHidden(true);

        EntityModelData extraData = (EntityModelData)  customPredicate.getExtraDataOfType(EntityModelData.class).get(0);

        if (head != null && canyon != null) {
            head.setRotationY(extraData.headPitch * ((float) Math.PI / 180f));
        }
    }*/
}
