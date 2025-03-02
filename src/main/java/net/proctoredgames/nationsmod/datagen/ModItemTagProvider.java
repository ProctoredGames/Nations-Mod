package net.proctoredgames.nationsmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.proctoredgames.nationsmod.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.TRIDENT_ENCHANTABLE)
                .add(ModItems.NATION_2_TRIDENT);

        getOrCreateTagBuilder(ItemTags.BOW_ENCHANTABLE)
                .add(ModItems.NATION_2_BOW)
                .add(ModItems.NATION_9_BOW)
                .add(ModItems.NATION_10_BOW);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.NATION_3_NETHERITE_SWORD)
                .add(ModItems.NATION_9_NETHERITE_SWORD)
                .add(ModItems.NATION_5_NETHERITE_SWORD)
                .add(ModItems.NATION_2_DIAMOND_SWORD)
                .add(ModItems.NATION_10_NETHERITE_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.NATION_10_NETHERITE_PICKAXE)
                .add(ModItems.NATION_5_NETHERITE_PICKAXE)
                .add(ModItems.NATION_2_DIAMOND_PICKAXE)
                .add(ModItems.NATION_9_NETHERITE_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.NATION_10_NETHERITE_SHOVEL)
                .add(ModItems.NATION_2_DIAMOND_SHOVEL)
                .add(ModItems.NATION_5_NETHERITE_SHOVEL);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.NATION_5_NETHERITE_AXE)
                .add(ModItems.NATION_10_NETHERITE_AXE)
                .add(ModItems.NATION_2_DIAMOND_AXE)
                .add(ModItems.NATION_9_NETHERITE_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.NATION_2_DIAMOND_HOE);

        getOrCreateTagBuilder(ItemTags.ARMOR_ENCHANTABLE)
                .add(ModItems.INVISIBLE_NETHERITE_HELMET)
                .add(ModItems.INVISIBLE_NETHERITE_CHESTPLATE)
                .add(ModItems.INVISIBLE_NETHERITE_LEGGINGS)
                .add(ModItems.INVISIBLE_NETHERITE_BOOTS)
                .add(ModItems.INVISIBLE_DIAMOND_HELMET)
                .add(ModItems.INVISIBLE_DIAMOND_CHESTPLATE)
                .add(ModItems.INVISIBLE_DIAMOND_LEGGINGS)
                .add(ModItems.INVISIBLE_DIAMOND_BOOTS)
                .add(ModItems.NATION_2_NETHERITE_HELMET)
                .add(ModItems.NATION_2_NETHERITE_CHESTPLATE)
                .add(ModItems.NATION_2_NETHERITE_LEGGINGS)
                .add(ModItems.NATION_2_NETHERITE_BOOTS)
                .add(ModItems.NATION_3_NETHERITE_HELMET)
                .add(ModItems.NATION_3_NETHERITE_CHESTPLATE)
                .add(ModItems.NATION_3_NETHERITE_LEGGINGS)
                .add(ModItems.NATION_3_NETHERITE_BOOTS)
                .add(ModItems.NATION_3_IRON_HELMET)
                .add(ModItems.NATION_3_IRON_CHESTPLATE)
                .add(ModItems.NATION_3_IRON_LEGGINGS)
                .add(ModItems.NATION_3_IRON_BOOTS)
                .add(ModItems.NATION_4_NETHERITE_HELMET)
                .add(ModItems.NATION_4_NETHERITE_CHESTPLATE)
                .add(ModItems.NATION_4_NETHERITE_LEGGINGS)
                .add(ModItems.NATION_4_NETHERITE_BOOTS)
                .add(ModItems.NATION_5_NETHERITE_HELMET)
                .add(ModItems.NATION_5_NETHERITE_CHESTPLATE)
                .add(ModItems.NATION_5_NETHERITE_LEGGINGS)
                .add(ModItems.NATION_5_NETHERITE_BOOTS)
                .add(ModItems.NATION_10_NETHERITE_HELMET)
                .add(ModItems.NATION_10_NETHERITE_CHESTPLATE)
                .add(ModItems.NATION_10_NETHERITE_LEGGINGS)
                .add(ModItems.NATION_10_NETHERITE_BOOTS)
                .add(ModItems.NATION_2_TURTLE_HELMET);

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR_ENCHANTABLE)
                .add(ModItems.INVISIBLE_NETHERITE_HELMET)
                .add(ModItems.INVISIBLE_DIAMOND_HELMET)
                .add(ModItems.NATION_2_NETHERITE_HELMET)
                .add(ModItems.NATION_3_NETHERITE_HELMET)
                .add(ModItems.NATION_3_IRON_HELMET)
                .add(ModItems.NATION_4_NETHERITE_HELMET)
                .add(ModItems.NATION_5_NETHERITE_HELMET)
                .add(ModItems.NATION_10_NETHERITE_HELMET)
                .add(ModItems.NATION_2_TURTLE_HELMET);

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(ModItems.INVISIBLE_NETHERITE_HELMET)
                .add(ModItems.INVISIBLE_DIAMOND_HELMET)
                .add(ModItems.NATION_2_NETHERITE_HELMET)
                .add(ModItems.NATION_3_NETHERITE_HELMET)
                .add(ModItems.NATION_3_IRON_HELMET)
                .add(ModItems.NATION_4_NETHERITE_HELMET)
                .add(ModItems.NATION_5_NETHERITE_HELMET)
                .add(ModItems.NATION_10_NETHERITE_HELMET)
                .add(ModItems.NATION_2_TURTLE_HELMET);

        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR_ENCHANTABLE)
                .add(ModItems.INVISIBLE_NETHERITE_CHESTPLATE)
                .add(ModItems.INVISIBLE_DIAMOND_CHESTPLATE)
                .add(ModItems.NATION_2_NETHERITE_CHESTPLATE)
                .add(ModItems.NATION_3_NETHERITE_CHESTPLATE)
                .add(ModItems.NATION_3_IRON_CHESTPLATE)
                .add(ModItems.NATION_4_NETHERITE_CHESTPLATE)
                .add(ModItems.NATION_5_NETHERITE_CHESTPLATE)
                .add(ModItems.NATION_10_NETHERITE_CHESTPLATE);

        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(ModItems.INVISIBLE_NETHERITE_CHESTPLATE)
                .add(ModItems.INVISIBLE_DIAMOND_CHESTPLATE)
                .add(ModItems.NATION_2_NETHERITE_CHESTPLATE)
                .add(ModItems.NATION_3_NETHERITE_CHESTPLATE)
                .add(ModItems.NATION_3_IRON_CHESTPLATE)
                .add(ModItems.NATION_4_NETHERITE_CHESTPLATE)
                .add(ModItems.NATION_5_NETHERITE_CHESTPLATE)
                .add(ModItems.NATION_10_NETHERITE_CHESTPLATE);

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR_ENCHANTABLE)
                .add(ModItems.INVISIBLE_NETHERITE_LEGGINGS)
                .add(ModItems.INVISIBLE_DIAMOND_LEGGINGS)
                .add(ModItems.NATION_2_NETHERITE_LEGGINGS)
                .add(ModItems.NATION_3_NETHERITE_LEGGINGS)
                .add(ModItems.NATION_3_IRON_LEGGINGS)
                .add(ModItems.NATION_4_NETHERITE_LEGGINGS)
                .add(ModItems.NATION_5_NETHERITE_LEGGINGS)
                .add(ModItems.NATION_10_NETHERITE_LEGGINGS);

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(ModItems.INVISIBLE_NETHERITE_LEGGINGS)
                .add(ModItems.INVISIBLE_DIAMOND_LEGGINGS)
                .add(ModItems.NATION_2_NETHERITE_LEGGINGS)
                .add(ModItems.NATION_3_NETHERITE_LEGGINGS)
                .add(ModItems.NATION_3_IRON_LEGGINGS)
                .add(ModItems.NATION_4_NETHERITE_LEGGINGS)
                .add(ModItems.NATION_5_NETHERITE_LEGGINGS)
                .add(ModItems.NATION_10_NETHERITE_LEGGINGS);

        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR_ENCHANTABLE)
                .add(ModItems.INVISIBLE_NETHERITE_BOOTS)
                .add(ModItems.INVISIBLE_DIAMOND_BOOTS)
                .add(ModItems.NATION_2_NETHERITE_BOOTS)
                .add(ModItems.NATION_3_NETHERITE_BOOTS)
                .add(ModItems.NATION_3_IRON_BOOTS)
                .add(ModItems.NATION_4_NETHERITE_BOOTS)
                .add(ModItems.NATION_5_NETHERITE_BOOTS)
                .add(ModItems.NATION_10_NETHERITE_BOOTS);

        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(ModItems.INVISIBLE_NETHERITE_BOOTS)
                .add(ModItems.INVISIBLE_DIAMOND_BOOTS)
                .add(ModItems.NATION_2_NETHERITE_BOOTS)
                .add(ModItems.NATION_3_NETHERITE_BOOTS)
                .add(ModItems.NATION_3_IRON_BOOTS)
                .add(ModItems.NATION_4_NETHERITE_BOOTS)
                .add(ModItems.NATION_5_NETHERITE_BOOTS)
                .add(ModItems.NATION_10_NETHERITE_BOOTS);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.INVISIBLE_NETHERITE_HELMET)
                .add(ModItems.INVISIBLE_NETHERITE_CHESTPLATE)
                .add(ModItems.INVISIBLE_NETHERITE_LEGGINGS)
                .add(ModItems.INVISIBLE_NETHERITE_BOOTS)
                .add(ModItems.INVISIBLE_DIAMOND_HELMET)
                .add(ModItems.INVISIBLE_DIAMOND_CHESTPLATE)
                .add(ModItems.INVISIBLE_DIAMOND_LEGGINGS)
                .add(ModItems.INVISIBLE_DIAMOND_BOOTS)
                .add(ModItems.NATION_2_NETHERITE_HELMET)
                .add(ModItems.NATION_2_NETHERITE_CHESTPLATE)
                .add(ModItems.NATION_2_NETHERITE_LEGGINGS)
                .add(ModItems.NATION_2_NETHERITE_BOOTS)
                .add(ModItems.NATION_3_NETHERITE_HELMET)
                .add(ModItems.NATION_3_NETHERITE_CHESTPLATE)
                .add(ModItems.NATION_3_NETHERITE_LEGGINGS)
                .add(ModItems.NATION_3_NETHERITE_BOOTS)
                .add(ModItems.NATION_3_IRON_HELMET)
                .add(ModItems.NATION_3_IRON_CHESTPLATE)
                .add(ModItems.NATION_3_IRON_LEGGINGS)
                .add(ModItems.NATION_3_IRON_BOOTS)
                .add(ModItems.NATION_4_NETHERITE_HELMET)
                .add(ModItems.NATION_4_NETHERITE_CHESTPLATE)
                .add(ModItems.NATION_4_NETHERITE_LEGGINGS)
                .add(ModItems.NATION_4_NETHERITE_BOOTS)
                .add(ModItems.NATION_5_NETHERITE_HELMET)
                .add(ModItems.NATION_5_NETHERITE_CHESTPLATE)
                .add(ModItems.NATION_5_NETHERITE_LEGGINGS)
                .add(ModItems.NATION_5_NETHERITE_BOOTS)
                .add(ModItems.NATION_10_NETHERITE_HELMET)
                .add(ModItems.NATION_10_NETHERITE_CHESTPLATE)
                .add(ModItems.NATION_10_NETHERITE_LEGGINGS)
                .add(ModItems.NATION_10_NETHERITE_BOOTS)
                .add(ModItems.NATION_2_TURTLE_HELMET);

//        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
//                .add(ModItems.);

//        getOrCreateTagBuilder(ItemTags.TRIM_TEMPLATES)
//                .add(ModItems.);

    }
}