package net.mindshake.witchmobility.registry;

import net.mindshake.witchmobility.WitchMobility;
import net.mindshake.witchmobility.entity.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, WitchMobility.ID);

    public static final RegistryObject<EntityType<BasicBroomEntity>> BASIC_BROOM =
            ENTITY_TYPES.register("basic_broom",
                    () -> EntityType.Builder.of(BasicBroomEntity::new, MobCategory.AMBIENT)
                            .sized(0.5f,0.5f)
                            .build(new ResourceLocation(WitchMobility.ID, "basic_broom").toString()));


    public static final RegistryObject<EntityType<BlueBottleBroomEntity>> BLUE_BOTTLE_BROOM = createBroom("blue_bottle_broom", BlueBottleBroomEntity::new);
    public static final RegistryObject<EntityType<SilverArrowBroomEntity>> SILVER_ARROW_BROOM = createBroom("silver_arrow_broom", SilverArrowBroomEntity::new);
    public static final RegistryObject<EntityType<FireboltBroomEntity>> FIREBOLT_BROOM = createBroom("firebolt_broom", FireboltBroomEntity::new);
    public static final RegistryObject<EntityType<SwiftstickBroomEntity>> SWIFTSTICK_BROOM = createBroom("swiftstick_broom", SwiftstickBroomEntity::new);
    public static final RegistryObject<EntityType<WoodShadeBroomEntity>> WOODSHADE_BROOM = createBroom("woodshade_broom", WoodShadeBroomEntity::new);
    public static final RegistryObject<EntityType<GoldenwoodBroomEntity>> GOLDENWOOD_BROOM = createBroom("goldenwood_broom", GoldenwoodBroomEntity::new);
    public static final RegistryObject<EntityType<LeafshadeBroomEntity>> LEAFSHADE_BROOM = createBroom("leafshade_broom", LeafshadeBroomEntity::new);
    public static final RegistryObject<EntityType<SnowairBroomEntity>> SNOWAIR_BROOM = createBroom("snowair_broom", SnowairBroomEntity::new);
    public static final RegistryObject<EntityType<WingsBroomEntity>> WINGS_BROOM = createBroom("wings_broom", WingsBroomEntity::new);

    public static <T extends BroomEntity> RegistryObject<EntityType<T>> createBroom (String identifier, EntityType.EntityFactory<T> createFactory) {
        return ENTITY_TYPES.register(identifier,
                () -> EntityType.Builder.of(createFactory, MobCategory.AMBIENT)
                        .sized(0.5f,0.5f)
                        .build(new ResourceLocation(WitchMobility.ID, identifier).toString()));

    }

    public static void register (IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
