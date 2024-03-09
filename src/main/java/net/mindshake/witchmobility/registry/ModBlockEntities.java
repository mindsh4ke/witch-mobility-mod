package net.mindshake.witchmobility.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.mindshake.witchmobility.Main;
import net.mindshake.witchmobility.block.entity.BroomstickStandBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static BlockEntityType<BroomstickStandBlockEntity> BROOMSTICK_STAND_BLOCKENTITY;

    public static void registerAllEntities () {
        /*BROOMSTICK_STAND_BLOCKENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Main.MOD_ID, "broomstick_stand_block_entity"),
                FabricBlockEntityTypeBuilder.create(BroomstickStandBlockEntity::new,
                        ModBlocks.BROOMSTICK_STAND).build(null));*/
    }
}
