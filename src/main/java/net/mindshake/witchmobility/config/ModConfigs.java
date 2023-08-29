package net.mindshake.witchmobility.config;

import com.mojang.datafixers.util.Pair;
import net.mindshake.witchmobility.Main;

public class ModConfigs {
    public static SimpleConfig CONFIG;
    private static ModConfigProvider configs;

    public static double BLUE_BOTTLE_MOV, BLUE_BOTTLE_ROT, FIREBOLT_MOV, FIREBOLT_ROT, GOLDENWOOD_MOV, GOLDENWOOD_ROT, LEAFSHADE_MOV, LEAFSHADE_ROT,
    SILVER_ARROW_MOV, SILVER_ARROW_ROT, SNOWAIR_MOV, SNOWAIR_ROT, SWIFTSTICK_MOV, SWIFTSTICK_ROT, WINGS_MOV, WINGS_ROT, WOODSHADE_MOV, WOODSHADE_ROT;

    public static void registerConfigs() {
        configs = new ModConfigProvider();
        createConfigs();

        CONFIG = SimpleConfig.of(Main.MOD_ID + "config").provider(configs).request();

        assignConfigs();
    }

    private static void createConfigs() {
        configs.addKeyValuePair(new Pair<>("broom.blue_bottle.movement", 1.25f), "double");
        configs.addKeyValuePair(new Pair<>("broom.blue_bottle.rotation", 3.5f), "double");

        configs.addKeyValuePair(new Pair<>("broom.firebolt.movement", 1.75f), "double");
        configs.addKeyValuePair(new Pair<>("broom.firebolt.rotation", 3.25f), "double");

        configs.addKeyValuePair(new Pair<>("broom.goldenwood.movement", 1.45f), "double");
        configs.addKeyValuePair(new Pair<>("broom.goldenwood.rotation", 3.0f), "double");

        configs.addKeyValuePair(new Pair<>("broom.leafshade.movement", 1.6f), "double");
        configs.addKeyValuePair(new Pair<>("broom.leafshade.rotation", 3.1f), "double");

        configs.addKeyValuePair(new Pair<>("broom.silver_arrow.movement", 3.0f), "double");
        configs.addKeyValuePair(new Pair<>("broom.silver_arrow.rotation", 4.1f), "double");

        configs.addKeyValuePair(new Pair<>("broom.snowair.movement", 1.55f), "double");
        configs.addKeyValuePair(new Pair<>("broom.snowair.rotation", 2.9f), "double");

        configs.addKeyValuePair(new Pair<>("broom.swiftstick.movement", 1.7f), "double");
        configs.addKeyValuePair(new Pair<>("broom.swiftstick.rotation", 3.0f), "double");

        configs.addKeyValuePair(new Pair<>("broom.wings.movement", 1.85f), "double");
        configs.addKeyValuePair(new Pair<>("broom.wings.rotation", 3.0f), "double");

        configs.addKeyValuePair(new Pair<>("broom.woodshade.movement", 1.5f), "double");
        configs.addKeyValuePair(new Pair<>("broom.woodshade.rotation", 3.5f), "double");
    }

    private static void assignConfigs() {

        BLUE_BOTTLE_MOV = CONFIG.getOrDefault("broom.blue_bottle.movement", 1.25f);
        BLUE_BOTTLE_ROT = CONFIG.getOrDefault("broom.blue_bottle.rotation", 3.5f);

        FIREBOLT_MOV = CONFIG.getOrDefault("broom.firebolt.movement", 1.75f);
        FIREBOLT_ROT = CONFIG.getOrDefault("broom.firebolt.rotation", 3.25f);

        GOLDENWOOD_MOV = CONFIG.getOrDefault("broom.goldenwood.movement", 1.45f);
        GOLDENWOOD_ROT = CONFIG.getOrDefault("broom.goldenwood.rotation", 3.0f);

        LEAFSHADE_MOV = CONFIG.getOrDefault("broom.leafshade.movement", 1.6f);
        LEAFSHADE_ROT = CONFIG.getOrDefault("broom.leafshade.rotation", 3.1f);

        SILVER_ARROW_MOV = CONFIG.getOrDefault("broom.silver_arrow.movement", 3.0f);
        SILVER_ARROW_ROT = CONFIG.getOrDefault("broom.silver_arrow.rotation", 4.1f);

        SNOWAIR_MOV = CONFIG.getOrDefault("broom.snowair.movement", 1.55f);
        SNOWAIR_ROT = CONFIG.getOrDefault("broom.snowair.rotation", 2.9f);

        SWIFTSTICK_MOV = CONFIG.getOrDefault("broom.swiftstick.movement", 1.7f);
        SWIFTSTICK_ROT = CONFIG.getOrDefault("broom.swiftstick.rotation", 3.0f);

        WINGS_MOV = CONFIG.getOrDefault("broom.wings.movement", 1.85f);
        WINGS_ROT = CONFIG.getOrDefault("broom.wings.rotation", 3.0f);

        WOODSHADE_MOV = CONFIG.getOrDefault("broom.woodshade.movement", 1.5f);
        WOODSHADE_ROT = CONFIG.getOrDefault("broom.woodshade.rotation", 3.5f);

        System.out.println("All " + configs.getConfigsList().size() + " have been set properly :)");
    }
}