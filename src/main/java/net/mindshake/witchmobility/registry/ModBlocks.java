package net.mindshake.witchmobility.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.mindshake.witchmobility.Main;
import net.mindshake.witchmobility.block.BroomstickStandBlock;
import net.mindshake.witchmobility.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static Block BROOMSTICK_STAND = registerBlock("broomstick_stand",
            new BroomstickStandBlock(FabricBlockSettings.of(Material.WOOD).strength(0.1f).nonOpaque()), null);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
}
