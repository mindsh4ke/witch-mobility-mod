package net.mindshake.witchmobility.registry;

import net.mindshake.witchmobility.Main;
import net.mindshake.witchmobility.item.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {


    public static final Item BASIC_BROOM = new BasicBroomItem(ModEntities.BASIC_BROOM, new Item.Settings().group(ItemGroup.COMBAT).maxCount(1));
    public static final Item BLUE_BOTTLE_BROOM = new BlueBottleBroomItem(ModEntities.BLUE_BOTTLE_BROOM, new Item.Settings().group(ItemGroup.COMBAT).maxCount(1));
    public static final Item SILVER_ARROW_BROOM = new SilverArrowBroomItem(ModEntities.SILVER_ARROW_BROOM, new Item.Settings().group(ItemGroup.COMBAT).maxCount(1));
    public static final Item FIREBOLT_BROOM = new FireboltBroomItem(ModEntities.FIREBOLT_BROOM, new Item.Settings().group(ItemGroup.COMBAT).maxCount(1));
    public static final Item SWIFTSTICK_BROOM = new SwiftstickBroomItem(ModEntities.SWIFTSTICK_BROOM, new Item.Settings().group(ItemGroup.COMBAT).maxCount(1));
    public static final Item WOODSHADE_BROOM = new WoodShadeBroomItem(ModEntities.WOODSHADE_BROOM, new Item.Settings().group(ItemGroup.COMBAT).maxCount(1));

    public static void registerItems () {
        registerItem("basic_broom_item", BASIC_BROOM);
        registerItem("blue_bottle_broom_item", BLUE_BOTTLE_BROOM);
        registerItem("silver_arrow_broom_item", SILVER_ARROW_BROOM);
        registerItem("firebolt_broom_item", FIREBOLT_BROOM);
        registerItem("swiftstick_broom_item", SWIFTSTICK_BROOM);
        registerItem("woodshade_broom_item", WOODSHADE_BROOM);
    }

    private static void registerItem (String itemName, Item item) {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, itemName), item);
    }

}
