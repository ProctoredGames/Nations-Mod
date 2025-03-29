package net.proctoredgames.adventurecraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.proctoredgames.adventurecraft.Adventurecraft;

public class ModItemGroups {
    public static final ItemGroup ADVENTURECRAFT = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Adventurecraft.MOD_ID, "adventurecraft_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ESSENCE_OF_EMPIRE_4))
                    .displayName(Text.translatable("itemgroup.adventurecraft.adventurecraft"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ESSENCE_OF_EMPIRE_1);
                        entries.add(ModItems.ESSENCE_OF_EMPIRE_2);
                        entries.add(ModItems.ESSENCE_OF_EMPIRE_3);
                        entries.add(ModItems.ESSENCE_OF_EMPIRE_4);
                        entries.add(ModItems.ESSENCE_OF_EMPIRE_5);
                        entries.add(ModItems.ESSENCE_OF_EMPIRE_6);
                        entries.add(ModItems.ESSENCE_OF_EMPIRE_7);
                        entries.add(ModItems.ESSENCE_OF_EMPIRE_8);
                        entries.add(ModItems.ESSENCE_OF_EMPIRE_9);

                        entries.add(ModItems.EMPIRE_1_ELYTRA);
                        entries.add(ModItems.EMPIRE_2_ELYTRA);
                        entries.add(ModItems.EMPIRE_3_ELYTRA);
                        entries.add(ModItems.EMPIRE_4_ELYTRA);
                        entries.add(ModItems.EMPIRE_5_ELYTRA);
                        entries.add(ModItems.EMPIRE_6_ELYTRA);
                        entries.add(ModItems.EMPIRE_7_ELYTRA);
                        entries.add(ModItems.EMPIRE_8_ELYTRA);
                        entries.add(ModItems.EMPIRE_9_ELYTRA);

                    }).build());


    public static void registerItemGroups() {
        Adventurecraft.LOGGER.info("Registering Item Groups for " + Adventurecraft.MOD_ID);
    }
}
