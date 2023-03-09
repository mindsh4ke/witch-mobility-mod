package net.mindshake.witchmobility.registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.mindshake.witchmobility.Main;
import net.mindshake.witchmobility.entity.*;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<BasicBroomEntity> BASIC_BROOM = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(Main.MOD_ID, "basic_broom"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, BasicBroomEntity::new).dimensions(EntityDimensions.fixed(0.5f,0.5f)).build()
    );

    public static final EntityType<BlueBottleBroomEntity> BLUE_BOTTLE_BROOM = createBroom("blue_bottle_broom", BlueBottleBroomEntity::new);
    public static final EntityType<SilverArrowBroomEntity> SILVER_ARROW_BROOM = createBroom("silver_arrow_broom", SilverArrowBroomEntity::new);
    public static final EntityType<FireboltBroomEntity> FIREBOLT_BROOM = createBroom("firebolt_broom", FireboltBroomEntity::new);
    public static final EntityType<SwiftstickBroomEntity> SWIFTSTICK_BROOM = createBroom("swiftstick_broom", SwiftstickBroomEntity::new);
    public static final EntityType<WoodShadeBroomEntity> WOODSHADE_BROOM = createBroom("woodshade_broom", WoodShadeBroomEntity::new);
    public static final EntityType<GoldenwoodBroomEntity> GOLDENWOOD_BROOM = createBroom("goldenwood_broom", GoldenwoodBroomEntity::new);
    public static final EntityType<SnowairBroomEntity> SNOWAIR_BROOM = createBroom("snowair_broom", SnowairBroomEntity::new);
    public static final EntityType<LeafshadeBroomEntity> LEAFSHADE_BROOM = createBroom("leafshade_broom", LeafshadeBroomEntity::new);
    public static final EntityType<WingsBroomEntity> WINGS_BROOM = createBroom("wings_broom", WingsBroomEntity::new);


    public static void registerEntities () {
        FabricDefaultAttributeRegistry.register(ModEntities.BASIC_BROOM, BasicBroomEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.BLUE_BOTTLE_BROOM, BasicBroomEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.SILVER_ARROW_BROOM, SilverArrowBroomEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.FIREBOLT_BROOM, FireboltBroomEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.SWIFTSTICK_BROOM, SwiftstickBroomEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.WOODSHADE_BROOM, SwiftstickBroomEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.GOLDENWOOD_BROOM, GoldenwoodBroomEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.SNOWAIR_BROOM, SnowairBroomEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.LEAFSHADE_BROOM, LeafshadeBroomEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.WINGS_BROOM, WingsBroomEntity.setAttributes());
    }

    public static <T extends BroomEntity> EntityType<T> createBroom (String identifier, EntityType.EntityFactory<T> factory) {
        return Registry.register(
                Registry.ENTITY_TYPE,
                new Identifier(Main.MOD_ID, identifier),
                FabricEntityTypeBuilder.create(SpawnGroup.MISC, factory).dimensions(EntityDimensions.fixed(1f,0.5f)).build()
        );

    }
}
