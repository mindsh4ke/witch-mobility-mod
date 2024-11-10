package net.mindshake.witchmobility.item;

import net.mindshake.witchmobility.entity.BroomEntity;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;
import software.bernie.example.client.renderer.item.PistolRender;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.builder.ILoopType;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.util.GeckoLibUtil;

import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public class BroomItem <T> extends Item implements IAnimatable {

    private final RegistryObject<T> registryObject;
    protected AnimationFactory factory = GeckoLibUtil.createFactory(this);

    private boolean screenOpened = false;

    public BroomItem(RegistryObject<T> registryObject, Item.Properties settings) {
        super(settings);
        this.registryObject = registryObject;
    }

    @Override
    public InteractionResult useOn(UseOnContext p_41427_) {
        Level level = p_41427_.getLevel();
        if (!(level instanceof ServerLevel)) {
            return InteractionResult.SUCCESS;
        } else {
            ItemStack itemstack = p_41427_.getItemInHand();
            BlockPos blockpos = p_41427_.getClickedPos();
            Direction direction = p_41427_.getClickedFace();
            BlockState blockstate = level.getBlockState(blockpos);

            BlockPos blockpos1;
            if (blockstate.getCollisionShape(level, blockpos).isEmpty()) {
                blockpos1 = blockpos;
            } else {
                blockpos1 = blockpos.relative(direction);
            }

            EntityType<?> entitytype = (EntityType<?>) registryObject.get();
            if (entitytype.spawn((ServerLevel)level, itemstack, p_41427_.getPlayer(), blockpos1, MobSpawnType.SPAWN_EGG, true, !Objects.equals(blockpos, blockpos1) && direction == Direction.UP) != null) {
                itemstack.shrink(1);
                level.gameEvent(p_41427_.getPlayer(), GameEvent.ENTITY_PLACE, blockpos);
            }

            return InteractionResult.CONSUME;
        }
    }

    /*public EntityType<?> getEntityType(@Nullable NbtCompound nbt) {
        NbtCompound nbtCompound;
        if (nbt != null && nbt.contains("EntityTag", 10) && (nbtCompound = nbt.getCompound("EntityTag")).contains("id", 8)) {
            return EntityType.get(nbtCompound.getString("id")).orElse(this.type);
        }
        return this.type;
    }
    SpawnEggItem


    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        tooltip.add(new TranslatableText("tootip.broom"));
        if (world != null) {
            if (world.isClient()) {
                if (Screen.hasControlDown()) {
                    screenOpened = true;
                    MinecraftClient.getInstance().setScreen(new ItemPreviewScreen(type));
                }
            }
        }
    }*/

    @Override
    public void appendHoverText(ItemStack p_41421_, @Nullable Level p_41422_, List<Component> p_41423_, TooltipFlag p_41424_) {
        super.appendHoverText(p_41421_, p_41422_, p_41423_, p_41424_);
        if (p_41422_ != null) {
            EntityType<?> entitytype = (EntityType<?>) registryObject.get();
            BroomEntity broomEntity = (BroomEntity) entitytype.create(p_41422_);

            p_41423_.add(Component.translatable("tooltip.broom.speed", Float.toString(broomEntity.getSpeed())));
            p_41423_.add(Component.translatable("tooltip.broom.agility", Float.toString(broomEntity.getRotationSpeed())));
        }
    }

    @Override
    public void registerControllers(AnimationData animationData) {
        //animationData.addAnimationController(new AnimationController(this, "controller", 0, this::predicate));
    }

    private <E extends IAnimatable>PlayState predicate (AnimationEvent<E> event) {
        event.getController().setAnimation(new AnimationBuilder().addAnimation("idle", ILoopType.EDefaultLoopTypes.LOOP));
        return PlayState.CONTINUE;
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }
}
