package net.mindshake.witchmobility.item;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.nbt.NbtCompound;

public class CustomBroomItem extends BroomItem{

    private int modelType = 0;

    public CustomBroomItem(EntityType<? extends MobEntity> type, Settings settings) {
        super(type, settings);
    }

    @Override
    public void postProcessNbt(NbtCompound nbt) {
        super.postProcessNbt(nbt);
        modelType = nbt.getInt("witch_mobility.model_type");
    }

    public int getModelType() {
        return modelType;
    }
}
