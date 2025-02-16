package net.proctoredgames.nationsmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.server.command.CommandManager;
import net.minecraft.text.Text;
import net.proctoredgames.nationsmod.item.ModItemGroups;
import net.proctoredgames.nationsmod.item.ModItems;
import net.proctoredgames.nationsmod.villager.ModVillagers;
import net.proctoredgames.nationsmod.villager.NationVillager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NationsMod implements ModInitializer {
	public static final String MOD_ID = "nationsmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final String KEY = "Developer - ProctoredGames, @proctoredgames on Discord";


	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModVillagers.registerVillagers();
		ModItems.registerModItems();

		CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
			dispatcher.register(CommandManager.literal("x_write_mod_developer_info")
					.executes(context -> {

						if (context.getSource().getPlayer() != null) {
							context.getSource().getPlayer().sendMessage(
									Text.literal(KEY.trim()),
									false
							);
						}
						return 1;
					})
			);
		});

	}
}