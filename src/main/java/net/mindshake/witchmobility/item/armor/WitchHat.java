package net.mindshake.witchmobility.item.armor;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import java.util.List;

public class WitchHat extends ArmorItem implements IAnimatable {

    private AnimationFactory factory = new AnimationFactory(this);
    private final int variant;
    private final float broomSpeedBonus, broomAgilityBonus;

    private final String[] tooltipTexts = new String[] {
            "tooltip.witch_hat.apprentice",
            "tooltip.witch_hat.amethyst",
            "tooltip.witch_hat.diamond",
            "tooltip.witch_hat.gold"
    };

    public WitchHat(int variant, float broomSpeedBonus, float broomAgilityBonus, ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
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
    public void registerControllers(AnimationData animationData) {

    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText(tooltipTexts[getVariant()]));
        tooltip.add(new TranslatableText("tooltip.broom.speed_bonus", Float.toString(broomSpeedBonus)));
        tooltip.add(new TranslatableText("tooltip.broom.agility_bonus", Float.toString(broomAgilityBonus)));
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
}
