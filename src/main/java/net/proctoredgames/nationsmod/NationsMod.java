package net.proctoredgames.nationsmod;

import net.fabricmc.api.ModInitializer;

import net.proctoredgames.nationsmod.item.ModItemGroups;
import net.proctoredgames.nationsmod.item.ModItems;
import net.proctoredgames.nationsmod.villager.ModVillagers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NationsMod implements ModInitializer {
	public static final String MOD_ID = "nationsmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModVillagers.registerVillagers();
		ModItems.registerModItems();
	}
}