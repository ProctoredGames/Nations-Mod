package net.proctoredgames.nationsmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.proctoredgames.nationsmod.NationsMod;

public class ModItemGroups {
    public static final ItemGroup NATIONS_MOD = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(NationsMod.MOD_ID, "nations_mod_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ESSENCE_OF_NATION_4))
                    .displayName(Text.translatable("itemgroup.nationsmod.nations_mod"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ESSENCE_OF_NATION_1);
                        entries.add(ModItems.ESSENCE_OF_NATION_2);
                        entries.add(ModItems.ESSENCE_OF_NATION_3);
                        entries.add(ModItems.ESSENCE_OF_NATION_4);
                        entries.add(ModItems.ESSENCE_OF_NATION_5);
                        entries.add(ModItems.ESSENCE_OF_NATION_6);
                        entries.add(ModItems.ESSENCE_OF_NATION_7);
                        entries.add(ModItems.ESSENCE_OF_NATION_8);
                        entries.add(ModItems.ESSENCE_OF_NATION_9);
                        entries.add(ModItems.ESSENCE_OF_NATION_10);

                        entries.add(ModItems.NATION_1_ELYTRA);
                        entries.add(ModItems.NATION_2_ELYTRA);
                        entries.add(ModItems.NATION_2_DEMON_ELYTRA);
                        entries.add(ModItems.NATION_3_ELYTRA);
//                        entries.add(ModItems.NATION_4_ELYTRA);
                        entries.add(ModItems.NATION_5_ELYTRA);
                        entries.add(ModItems.NATION_6_ELYTRA);
                        entries.add(ModItems.NATION_7_ELYTRA);
                        entries.add(ModItems.NATION_8_ELYTRA);
                        entries.add(ModItems.NATION_9_ELYTRA);
                        entries.add(ModItems.NATION_10_ELYTRA);

                        entries.add(ModItems.NATION_3_NETHERITE_SWORD);
                        entries.add(ModItems.NATION_9_NETHERITE_AXE);
                        entries.add(ModItems.NATION_9_NETHERITE_PICKAXE);
                        entries.add(ModItems.NATION_9_NETHERITE_SWORD);

                        entries.add(ModItems.NATION_2_NETHERITE_HELMET);
                        entries.add(ModItems.NATION_2_NETHERITE_CHESTPLATE);
                        entries.add(ModItems.NATION_2_NETHERITE_LEGGINGS);
                        entries.add(ModItems.NATION_2_NETHERITE_BOOTS);
                        entries.add(ModItems.NATION_3_NETHERITE_HELMET);
                        entries.add(ModItems.NATION_3_NETHERITE_CHESTPLATE);
                        entries.add(ModItems.NATION_3_NETHERITE_LEGGINGS);
                        entries.add(ModItems.NATION_3_NETHERITE_BOOTS);
                        entries.add(ModItems.NATION_4_NETHERITE_HELMET);
                        entries.add(ModItems.NATION_4_NETHERITE_CHESTPLATE);
                        entries.add(ModItems.NATION_4_NETHERITE_LEGGINGS);
                        entries.add(ModItems.NATION_4_NETHERITE_BOOTS);
                        entries.add(ModItems.NATION_5_NETHERITE_HELMET);
                        entries.add(ModItems.NATION_5_NETHERITE_CHESTPLATE);
                        entries.add(ModItems.NATION_5_NETHERITE_LEGGINGS);
                        entries.add(ModItems.NATION_5_NETHERITE_BOOTS);

                        entries.add(ModItems.INVISIBLE_DIAMOND_HELMET);
                        entries.add(ModItems.INVISIBLE_DIAMOND_CHESTPLATE);
                        entries.add(ModItems.INVISIBLE_DIAMOND_LEGGINGS);
                        entries.add(ModItems.INVISIBLE_DIAMOND_BOOTS);

                        entries.add(ModItems.INVISIBLE_NETHERITE_HELMET);
                        entries.add(ModItems.INVISIBLE_NETHERITE_CHESTPLATE);
                        entries.add(ModItems.INVISIBLE_NETHERITE_LEGGINGS);
                        entries.add(ModItems.INVISIBLE_NETHERITE_BOOTS);

                        entries.add(ModItems.NATION_2_BOW);
                        entries.add(ModItems.NATION_9_BOW);

                        entries.add(ModItems.NATION_4_HAT);
                        entries.add(ModItems.NATION_6_HAT);
                        entries.add(ModItems.NATION_8_HAT);
                        entries.add(ModItems.NATION_9_HAT);

                    }).build());


    public static void registerItemGroups() {
        NationsMod.LOGGER.info("Registering Item Groups for " + NationsMod.MOD_ID);
    }
}
