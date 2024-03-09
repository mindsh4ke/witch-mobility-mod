package net.mindshake.witchmobility.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.mindshake.witchmobility.Main;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    /* CURRENTLY IN DEVELOPMENT/MAPPINGS UPDATING */

    /*public static Block BROOMSTICK_STAND = registerBlock("broomstick_stand",
            new BroomstickStandBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_BLOCK).strength(0.1f).nonOpaque()), null);*/


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registries.ITEM, new Identifier(Main.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
}
