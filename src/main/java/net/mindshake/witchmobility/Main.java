package net.mindshake.witchmobility;

import net.fabricmc.api.ModInitializer;
import net.mindshake.witchmobility.registry.ModEntities;
import net.mindshake.witchmobility.registry.ModItems;
import net.mindshake.witchmobility.screen.ModScreenHandlers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class Main implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("witchmobility");
	public static final String MOD_ID = "witchmobility";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerItems();
		ModScreenHandlers.registerAllScreenHandlers();
		ModEntities.registerEntities();
		GeckoLib.initialize();

		LOGGER.info("Welcome to Boiling Isles!");
		LOGGER.info("Hola Alba");
	}
}
