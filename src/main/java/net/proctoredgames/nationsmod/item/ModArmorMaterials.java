package net.proctoredgames.nationsmod.item;

import net.proctoredgames.nationsmod.NationsMod;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> NATION_3_NETHERITE = registerArmorMaterial("nation_3_netherite",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 11);
            }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.ESSENCE_OF_NATION_3),
                    List.of(new ArmorMaterial.Layer(Identifier.of(NationsMod.MOD_ID, "nation_3_netherite"))), 3.0F,0.1F));
    public static final RegistryEntry<ArmorMaterial> NATION_4_NETHERITE = registerArmorMaterial("nation_4_netherite",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 11);
            }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.ESSENCE_OF_NATION_4),
                    List.of(new ArmorMaterial.Layer(Identifier.of(NationsMod.MOD_ID, "nation_4_netherite"))), 3.0F,0.1F));
    public static final RegistryEntry<ArmorMaterial> NATION_9_NETHERITE = registerArmorMaterial("nation_9_netherite",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 11);
            }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.ESSENCE_OF_NATION_9),
                    List.of(new ArmorMaterial.Layer(Identifier.of(NationsMod.MOD_ID, "nation_9_netherite"))), 3.0F,0.1F));

    public static final RegistryEntry<ArmorMaterial> INVISIBLE_NETHERITE = registerArmorMaterial("invisible_netherite",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 11);
            }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.ESSENCE_OF_NATION_4),
                    List.of(new ArmorMaterial.Layer(Identifier.of(NationsMod.MOD_ID, "invisible_netherite"))), 3.0F,0.1F));
    public static final RegistryEntry<ArmorMaterial> INVISIBLE_DIAMOND = registerArmorMaterial("invisible_diamond",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 11);
            }), 10, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.ESSENCE_OF_NATION_4),
                    List.of(new ArmorMaterial.Layer(Identifier.of(NationsMod.MOD_ID, "invisible_diamond"))), 2.0F,0.0F));

    public static final RegistryEntry<ArmorMaterial> NATION_2_NETHERITE = registerArmorMaterial("nation_2_netherite",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 11);
            }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.ESSENCE_OF_NATION_3),
                    List.of(new ArmorMaterial.Layer(Identifier.of(NationsMod.MOD_ID, "nation_2_netherite"))), 3.0F,0.1F));

    public static final RegistryEntry<ArmorMaterial> NATION_2_IRON = registerArmorMaterial("nation_2_iron",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 5);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 5);
            }), 9, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.ESSENCE_OF_NATION_1),
                    List.of(new ArmorMaterial.Layer(Identifier.of(NationsMod.MOD_ID, "nation_2_iron"))), 0.0F,0.0F));


    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(NationsMod.MOD_ID, name), material.get());
    }
}