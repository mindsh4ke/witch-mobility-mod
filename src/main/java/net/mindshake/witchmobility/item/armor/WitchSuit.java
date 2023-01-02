package net.mindshake.witchmobility.item.armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class WitchSuit extends ArmorItem implements IAnimatable {

    private final AnimationFactory factory = new AnimationFactory(this);

    public WitchSuit(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    @Nullable
    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
    }

    /*int i = 0;
    @Override
    public void usageTick(World world, LivingEntity user, ItemStack stack, int remainingUseTicks) {
        if (world.isClient()) {
            i++;
            if (i == 360) {
                i = 0;
            }
            if (i % 10 == 0) {
                world.addImportantParticle(ParticleTypes.WITCH, user.getX()+ 1, user.getY(), user.getZ()+1, Math.cos(i) * 0.25d, 0.15d, Math.sin(i) * 0.25d);
            }
        }
        super.usageTick(world, user, stack, remainingUseTicks);
    }*/

    @Override
    public void registerControllers(AnimationData animationData) {

    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }
}
