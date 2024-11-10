package net.mindshake.witchmobility.registry;

import net.mindshake.witchmobility.WitchMobility;
import net.mindshake.witchmobility.item.*;
import net.mindshake.witchmobility.item.armor.WitchHat;
import net.mindshake.witchmobility.item.armor.WitchSuit;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WitchMobility.ID);

    public static final RegistryObject<Item> BASIC_BROOM = ITEMS.register("basic_broom_item", () -> {
        return new BasicBroomItem<>(ModEntities.BASIC_BROOM, (new Item.Properties().tab(ModItemGroup.WITCH).stacksTo(1)));
    });

    public static final RegistryObject<Item> BLUE_BOTTLE_BROOM = ITEMS.register("blue_bottle_broom_item", () -> {
        return new BlueBottleBroomItem<>(ModEntities.BLUE_BOTTLE_BROOM, (new Item.Properties().tab(ModItemGroup.WITCH).stacksTo(1)));
    });

    public static final RegistryObject<Item> SILVER_ARROW_BROOM = ITEMS.register("silver_arrow_broom_item", () -> {
        return new SilverArrowBroomItem<>(ModEntities.SILVER_ARROW_BROOM, (new Item.Properties().tab(ModItemGroup.WITCH).stacksTo(1)));
    });

    public static final RegistryObject<Item> FIREBOLT_BROOM = ITEMS.register("firebolt_broom_item", () -> {
        return new FireboltBroomItem<>(ModEntities.FIREBOLT_BROOM, (new Item.Properties().tab(ModItemGroup.WITCH).stacksTo(1)));
    });

    public static final RegistryObject<Item> SWIFTSTICK_BROOM = ITEMS.register("swiftstick_broom_item", () -> {
        return new SwiftstickBroomItem<>(ModEntities.SWIFTSTICK_BROOM, (new Item.Properties().tab(ModItemGroup.WITCH).stacksTo(1)));
    });
    public static final RegistryObject<Item> WOODSHADE_BROOM = ITEMS.register("woodshade_broom_item", () -> {
        return new WoodShadeBroomItem<>(ModEntities.WOODSHADE_BROOM, (new Item.Properties().tab(ModItemGroup.WITCH).stacksTo(1)));
    });

    public static final RegistryObject<Item> GOLDENWOOD_BROOM = ITEMS.register("goldenwood_broom_item", () -> {
        return new GoldenwoodBroomItem<>(ModEntities.GOLDENWOOD_BROOM, (new Item.Properties().tab(ModItemGroup.WITCH).stacksTo(1)));
    });

    public static final RegistryObject<Item> LEAFSHADE_BROOM = ITEMS.register("leafshade_broom_item", () -> {
        return new LeafshadeBroomItem<>(ModEntities.LEAFSHADE_BROOM, (new Item.Properties().tab(ModItemGroup.WITCH).stacksTo(1)));
    });

    public static final RegistryObject<Item> SNOWAIR_BROOM = ITEMS.register("snowair_broom_item", () -> {
        return new SnowairBroomItem<>(ModEntities.SNOWAIR_BROOM, (new Item.Properties().tab(ModItemGroup.WITCH).stacksTo(1)));
    });

    public static final RegistryObject<Item> WINGS_BROOM = ITEMS.register("wings_broom_item", () -> {
        return new WingsBroomItem<>(ModEntities.WINGS_BROOM, (new Item.Properties().tab(ModItemGroup.WITCH).stacksTo(1)));
    });


    public static final RegistryObject<Item> APPRENTICE_WITCH_HAT = ITEMS.register("apprentice_witch_hat", () -> {
        return new WitchHat(0, 0.3f, 0.3f, ArmorMaterials.LEATHER, EquipmentSlot.HEAD, (new Item.Properties().tab(ModItemGroup.WITCH).stacksTo(1)));
    });

    public static final RegistryObject<Item> AMETHYST_WITCH_HAT = ITEMS.register("amethyst_witch_hat", () -> {
        return new WitchHat(1, 2f, 2f, ArmorMaterials.NETHERITE, EquipmentSlot.HEAD, (new Item.Properties().tab(ModItemGroup.WITCH).stacksTo(1)));
    });

    public static final RegistryObject<Item> DIAMOND_WITCH_HAT = ITEMS.register("diamond_witch_hat", () -> {
        return new WitchHat(2, 1.25f, 0.75f, ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, (new Item.Properties().tab(ModItemGroup.WITCH).stacksTo(1)));
    });

    public static final RegistryObject<Item> GOLD_WITCH_HAT = ITEMS.register("gold_witch_hat", () -> {
        return new WitchHat(3, 0.85f, 1.25f, ArmorMaterials.GOLD, EquipmentSlot.HEAD, (new Item.Properties().tab(ModItemGroup.WITCH).stacksTo(1)));
    });

    public static final RegistryObject<Item> WITCH_SUIT = ITEMS.register("witch_suit", () -> {
        return new WitchSuit(ArmorMaterials.DIAMOND, EquipmentSlot.CHEST, (new Item.Properties().tab(ModItemGroup.WITCH).stacksTo(1)));
    });

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
