package net.proctoredgames.nationsmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.server.command.CommandManager;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.proctoredgames.nationsmod.item.ModItemGroups;
import net.proctoredgames.nationsmod.item.ModItems;
import net.proctoredgames.nationsmod.util.ModModelPredicates;
import net.proctoredgames.nationsmod.villager.ModVillagers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NationsMod implements ModInitializer {
	public static final String MOD_ID = "nationsmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final String KEY = "Developer - ProctoredGames (@proctoredgames on Discord)\nModels and textures by @pippslays on YT\nMade for the Nations SMP";


	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModVillagers.registerVillagers();
		ModItems.registerModItems();
		ModModelPredicates.registerModelPredicates();

		CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
			dispatcher.register(CommandManager.literal("x_write_mod_developer_info")
					.executes(context -> {
						if (context.getSource().getPlayer() != null) {
							context.getSource().getPlayer().sendMessage(
									Text.literal(KEY.trim()).setStyle(Style.EMPTY.withColor(TextColor.fromRgb(0x00FF00))),
									false
							);
						}

						context.getSource().getPlayer().getWorld().playSound(null,
								context.getSource().getPlayer().getX(), context.getSource().getPlayer().getY(),
								context.getSource().getPlayer().getZ(), SoundEvents.ENTITY_PLAYER_LEVELUP,
								SoundCategory.NEUTRAL, 1.0F, 1.0F);

						return 1;
					})
			);
		});

	}
}