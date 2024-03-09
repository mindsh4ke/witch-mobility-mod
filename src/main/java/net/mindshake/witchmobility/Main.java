package net.mindshake.witchmobility;

import net.fabricmc.api.ModInitializer;
import net.mindshake.witchmobility.config.ModConfigs;
import net.mindshake.witchmobility.registry.ModBlockEntities;
import net.mindshake.witchmobility.registry.ModEntities;
import net.mindshake.witchmobility.registry.ModItemGroups;
import net.mindshake.witchmobility.registry.ModItems;
import net.mindshake.witchmobility.screen.ModScreenHandlers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

public class Main implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("witchmobility");
	public static final String MOD_ID = "witchmobility";

	@Override
	public void onInitialize() {
		GeckoLib.initialize();
		ModConfigs.registerConfigs();
		ModBlockEntities.registerAllEntities();
		ModItems.registerItems();
		ModScreenHandlers.registerAllScreenHandlers();
		ModEntities.registerEntities();
		ModItemGroups.registerItemGroups();

		LOGGER.info("Welcome to Boiling Isles!");
	}
}
