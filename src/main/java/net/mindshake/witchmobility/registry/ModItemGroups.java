package net.mindshake.witchmobility.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mindshake.witchmobility.Main;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    /*public static final ItemGroup WITCH = FabricItemGroupBuilder.build(new Identifier(Main.MOD_ID, "witch"),
            () -> new ItemStack(ModItems.BASIC_BROOM));*/
    public static final ItemGroup WITH = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Main.MOD_ID, "witch"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.witchmobility.witch"))
                    .icon(() -> new ItemStack(ModItems.BASIC_BROOM))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModItems.BASIC_BROOM);
                        entries.add(ModItems.BLUE_BOTTLE_BROOM);
                        entries.add(ModItems.SILVER_ARROW_BROOM);
                        entries.add(ModItems.FIREBOLT_BROOM);
                        entries.add(ModItems.SWIFTSTICK_BROOM);
                        entries.add(ModItems.WOODSHADE_BROOM);
                        entries.add(ModItems.GOLDENWOOD_BROOM);
                        entries.add(ModItems.SNOWAIR_BROOM);
                        entries.add(ModItems.LEAFSHADE_BROOM);
                        entries.add(ModItems.WINGS_BROOM);
                        entries.add(ModItems.APPRENTICE_WITCH_HAT);
                        entries.add(ModItems.AMETHYST_WITCH_HAT);
                        entries.add(ModItems.DIAMOND_WITCH_HAT);
                        entries.add(ModItems.GOLD_WITCH_HAT);
                        entries.add(ModItems.WITCH_SUIT);
                    }))
            .build()
    );

    public static void registerItemGroups() {
        Main.LOGGER.info("Registering Item Groups for " + Main.MOD_ID);
    }
}
