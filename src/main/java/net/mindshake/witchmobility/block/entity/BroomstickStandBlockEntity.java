package net.mindshake.witchmobility.block.entity;

import net.mindshake.witchmobility.registry.ModBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;

public class BroomstickStandBlockEntity extends BlockEntity {


    public BroomstickStandBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.BROOMSTICK_STAND_BLOCKENTITY, pos, state);
    }
}
