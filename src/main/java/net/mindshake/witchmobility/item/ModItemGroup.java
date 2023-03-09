package net.mindshake.witchmobility.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.mindshake.witchmobility.Main;
import net.mindshake.witchmobility.registry.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup WITCH = FabricItemGroupBuilder.build(new Identifier(Main.MOD_ID, "witch"),
            () -> new ItemStack(ModItems.BASIC_BROOM));
}
