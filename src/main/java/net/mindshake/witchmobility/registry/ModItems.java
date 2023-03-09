package net.mindshake.witchmobility.registry;

import net.mindshake.witchmobility.Main;
import net.mindshake.witchmobility.item.*;
import net.mindshake.witchmobility.item.armor.WitchHat;
import net.mindshake.witchmobility.item.armor.WitchSuit;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {


    public static final Item BASIC_BROOM = new BasicBroomItem(ModEntities.BASIC_BROOM, new Item.Settings().group(ModItemGroup.WITCH).maxCount(1));
    public static final Item BLUE_BOTTLE_BROOM = new BlueBottleBroomItem(ModEntities.BLUE_BOTTLE_BROOM, new Item.Settings().group(ModItemGroup.WITCH).maxCount(1));
    public static final Item SILVER_ARROW_BROOM = new SilverArrowBroomItem(ModEntities.SILVER_ARROW_BROOM, new Item.Settings().group(ModItemGroup.WITCH).maxCount(1));
    public static final Item FIREBOLT_BROOM = new FireboltBroomItem(ModEntities.FIREBOLT_BROOM, new Item.Settings().group(ModItemGroup.WITCH).maxCount(1));
    public static final Item SWIFTSTICK_BROOM = new SwiftstickBroomItem(ModEntities.SWIFTSTICK_BROOM, new Item.Settings().group(ModItemGroup.WITCH).maxCount(1));
    public static final Item WOODSHADE_BROOM = new WoodShadeBroomItem(ModEntities.WOODSHADE_BROOM, new Item.Settings().group(ModItemGroup.WITCH).maxCount(1));
    public static final Item GOLDENWOOD_BROOM = new GoldenwoodBroomItem(ModEntities.GOLDENWOOD_BROOM, new Item.Settings().group(ModItemGroup.WITCH).maxCount(1));
    public static final Item SNOWAIR_BROOM = new SnowairBroomItem(ModEntities.SNOWAIR_BROOM, new Item.Settings().group(ModItemGroup.WITCH).maxCount(1));
    public static final Item LEAFSHADE_BROOM = new LeafshadeBroomItem(ModEntities.LEAFSHADE_BROOM, new Item.Settings().group(ModItemGroup.WITCH).maxCount(1));
    public static final Item WINGS_BROOM = new WingsBroomItem(ModEntities.WINGS_BROOM, new Item.Settings().group(ModItemGroup.WITCH).maxCount(1));


    public static final Item APPRENTICE_WITCH_HAT = new WitchHat(0, 0.5f, 0.25f, ArmorMaterials.LEATHER, EquipmentSlot.HEAD, new Item.Settings().group(ModItemGroup.WITCH).maxCount(1));
    public static final Item AMETHYST_WITCH_HAT = new WitchHat(1, 2f, 2f, ArmorMaterials.NETHERITE, EquipmentSlot.HEAD, new Item.Settings().group(ModItemGroup.WITCH).maxCount(1));
    public static final Item DIAMOND_WITCH_HAT = new WitchHat(2, 1.25f, 0.75f, ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new Item.Settings().group(ModItemGroup.WITCH).maxCount(1));
    public static final Item GOLD_WITCH_HAT = new WitchHat(3, 0.85f, 1.25f, ArmorMaterials.GOLD, EquipmentSlot.HEAD, new Item.Settings().group(ModItemGroup.WITCH).maxCount(1));

    public static final Item WITCH_SUIT = new WitchSuit(ArmorMaterials.DIAMOND, EquipmentSlot.CHEST, new Item.Settings().group(ModItemGroup.WITCH).maxCount(1));

    public static void registerItems () {
        registerItem("basic_broom_item", BASIC_BROOM);
        registerItem("blue_bottle_broom_item", BLUE_BOTTLE_BROOM);
        registerItem("silver_arrow_broom_item", SILVER_ARROW_BROOM);
        registerItem("firebolt_broom_item", FIREBOLT_BROOM);
        registerItem("swiftstick_broom_item", SWIFTSTICK_BROOM);
        registerItem("woodshade_broom_item", WOODSHADE_BROOM);
        registerItem("apprentice_witch_hat", APPRENTICE_WITCH_HAT);
        registerItem("amethyst_witch_hat", AMETHYST_WITCH_HAT);
        registerItem("diamond_witch_hat", DIAMOND_WITCH_HAT);
        registerItem("gold_witch_hat", GOLD_WITCH_HAT);
        registerItem("witch_suit", WITCH_SUIT);
        registerItem("goldenwood_broom_item", GOLDENWOOD_BROOM);
        registerItem("snowair_broom_item", SNOWAIR_BROOM);
        registerItem("leafshade_broom_item", LEAFSHADE_BROOM);
        registerItem("wings_broom_item", WINGS_BROOM);
    }

    private static void registerItem (String itemName, Item item) {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, itemName), item);
    }

}
