package net.mindshake.witchmobility.item.armor;

import net.mindshake.witchmobility.client.renderer.armor.ApprenticeWitchHatRenderer;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.item.BuiltinModelItemRenderer;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class WitchHat extends ArmorItem implements GeoItem {

    private AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    private final Supplier<Object> renderProvider = GeoItem.makeRenderer(this);
    private final int variant;
    private final float broomSpeedBonus, broomAgilityBonus;

    private final String[] tooltipTexts = new String[] {
            "tooltip.witch_hat.apprentice",
            "tooltip.witch_hat.amethyst",
            "tooltip.witch_hat.diamond",
            "tooltip.witch_hat.gold"
    };

    public WitchHat(int variant, float broomSpeedBonus, float broomAgilityBonus, ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, Type.HELMET, settings);
        this.variant = variant;
        this.broomSpeedBonus = broomSpeedBonus;
        this.broomAgilityBonus = broomAgilityBonus;
    }

    @Nullable
    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable(tooltipTexts[getVariant()]));
        tooltip.add(Text.translatable("tooltip.broom.speed_bonus", Float.toString(broomSpeedBonus)));
        tooltip.add(Text.translatable("tooltip.broom.agility_bonus", Float.toString(broomAgilityBonus)));
        super.appendTooltip(stack, world, tooltip, context);
    }

    public int getVariant() {
        return variant;
    }

    public float getBroomSpeedBonus() {
        return broomSpeedBonus;
    }

    public float getBroomAgilityBonus() {
        return broomAgilityBonus;
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {

    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private GeoArmorRenderer<?> renderer;

            @Override
            public BipedEntityModel<LivingEntity> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, BipedEntityModel<LivingEntity> original) {
                if (this.renderer == null) {
                    this.renderer = new ApprenticeWitchHatRenderer();
                }
                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return this.renderer;
            }
        });
    }

    @Override
    public Supplier<Object> getRenderProvider() {
        return this.renderProvider;
    }
}
