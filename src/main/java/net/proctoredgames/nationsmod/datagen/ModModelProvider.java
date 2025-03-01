package net.proctoredgames.nationsmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.item.ArmorItem;
import net.proctoredgames.nationsmod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.INVISIBLE_DIAMOND_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.INVISIBLE_DIAMOND_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.INVISIBLE_DIAMOND_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.INVISIBLE_DIAMOND_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.INVISIBLE_NETHERITE_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.INVISIBLE_NETHERITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.INVISIBLE_NETHERITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.INVISIBLE_NETHERITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NATION_2_NETHERITE_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NATION_2_NETHERITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NATION_2_NETHERITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NATION_2_NETHERITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NATION_3_NETHERITE_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NATION_3_NETHERITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NATION_3_NETHERITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NATION_3_NETHERITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NATION_3_IRON_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NATION_3_IRON_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NATION_3_IRON_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NATION_3_IRON_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NATION_4_NETHERITE_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NATION_4_NETHERITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NATION_4_NETHERITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NATION_4_NETHERITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NATION_5_NETHERITE_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NATION_5_NETHERITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NATION_5_NETHERITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NATION_5_NETHERITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NATION_10_NETHERITE_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NATION_10_NETHERITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NATION_10_NETHERITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NATION_10_NETHERITE_HELMET));
    }
}
