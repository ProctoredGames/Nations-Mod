package net.proctoredgames.nationsmod.item;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.proctoredgames.nationsmod.NationsMod;
import net.proctoredgames.nationsmod.item.custom.HatItem;
import net.proctoredgames.nationsmod.item.custom.NationElytraItem;
import net.proctoredgames.nationsmod.item.custom.NationEssenceItem;

public class ModItems {
    public static final Item ESSENCE_OF_NATION_1 = registerItem("essence_of_nation_1", new NationEssenceItem(new Item.Settings(), 1));
    public static final Item ESSENCE_OF_NATION_2 = registerItem("essence_of_nation_2", new NationEssenceItem(new Item.Settings(), 2));
    public static final Item ESSENCE_OF_NATION_3 = registerItem("essence_of_nation_3", new NationEssenceItem(new Item.Settings(), 3));
    public static final Item ESSENCE_OF_NATION_4 = registerItem("essence_of_nation_4", new NationEssenceItem(new Item.Settings(), 4));
    public static final Item ESSENCE_OF_NATION_5 = registerItem("essence_of_nation_5", new NationEssenceItem(new Item.Settings(), 5));
    public static final Item ESSENCE_OF_NATION_6 = registerItem("essence_of_nation_6", new NationEssenceItem(new Item.Settings(), 6));
    public static final Item ESSENCE_OF_NATION_7 = registerItem("essence_of_nation_7", new NationEssenceItem(new Item.Settings(), 7));
    public static final Item ESSENCE_OF_NATION_8 = registerItem("essence_of_nation_8", new NationEssenceItem(new Item.Settings(), 8));
    public static final Item ESSENCE_OF_NATION_9 = registerItem("essence_of_nation_9", new NationEssenceItem(new Item.Settings(), 9));
    public static final Item ESSENCE_OF_NATION_10 = registerItem("essence_of_nation_10", new NationEssenceItem(new Item.Settings(), 10));

    public static final Item NATION_1_ELYTRA = registerItem("nation_1_elytra", new NationElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), 1));
    public static final Item NATION_2_ELYTRA = registerItem("nation_2_elytra", new NationElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), 2));
    public static final Item NATION_2_DEMON_ELYTRA = registerItem("nation_2_demon_elytra", new NationElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), -2));
    public static final Item NATION_3_ELYTRA = registerItem("nation_3_elytra", new NationElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), 3));
//    public static final Item NATION_4_ELYTRA = registerItem("nation_4_elytra", new NationElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), 4));
    public static final Item NATION_5_ELYTRA = registerItem("nation_5_elytra", new NationElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), 5));
    public static final Item NATION_6_ELYTRA = registerItem("nation_6_elytra", new NationElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), 6));
    public static final Item NATION_7_ELYTRA = registerItem("nation_7_elytra", new NationElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), 7));
    public static final Item NATION_8_ELYTRA = registerItem("nation_8_elytra", new NationElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), 8));
    public static final Item NATION_9_ELYTRA = registerItem("nation_9_elytra", new NationElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), 9));
    public static final Item NATION_10_ELYTRA = registerItem("nation_10_elytra", new NationElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), 10));

    public static final Item NATION_4_HAT = registerItem("nation_4_hat", new HatItem(new Item.Settings()));
    public static final Item NATION_6_HAT = registerItem("nation_6_hat", new HatItem(new Item.Settings()));
    public static final Item NATION_8_HAT = registerItem("nation_8_hat", new HatItem(new Item.Settings()));
    public static final Item NATION_9_HAT = registerItem("nation_9_hat", new HatItem(new Item.Settings()));

    public static final Item NATION_2_TURTLE_HELMET = registerItem(
            "nation_2_turtle_helmet", new ArmorItem(ArmorMaterials.TURTLE, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(25)))
    );

    public static final Item NATION_3_NETHERITE_SWORD = registerItem(
            "nation_3_netherite_sword",
            new SwordItem(
                    ToolMaterials.NETHERITE, new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))
            )
    );

    public static final Item NATION_9_NETHERITE_AXE = registerItem(
            "nation_9_netherite_axe",
            new AxeItem(
                    ToolMaterials.NETHERITE, new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ToolMaterials.NETHERITE, 5.0F, -3.0F))
            )
    );
    public static final Item NATION_9_NETHERITE_PICKAXE = registerItem(
            "nation_9_netherite_pickaxe",
            new PickaxeItem(
                    ToolMaterials.NETHERITE, new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.NETHERITE, 1.0F, -2.8F))
            )
    );
    public static final Item NATION_9_NETHERITE_SWORD = registerItem(
            "nation_9_netherite_sword",
            new SwordItem(
                    ToolMaterials.NETHERITE, new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))
            )
    );

    public static final Item NATION_10_NETHERITE_SWORD = registerItem(
            "nation_10_netherite_sword",
            new SwordItem(
                    ToolMaterials.NETHERITE, new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))
            )
    );
    public static final Item NATION_10_NETHERITE_SHOVEL = registerItem(
            "nation_10_netherite_shovel",
            new ShovelItem(
                    ToolMaterials.NETHERITE, new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.NETHERITE, 1.5F, -3.0F))
            )
    );
    public static final Item NATION_10_NETHERITE_PICKAXE = registerItem(
            "nation_10_netherite_pickaxe",
            new PickaxeItem(
                    ToolMaterials.NETHERITE, new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.NETHERITE, 1.0F, -2.8F))
            )
    );
    public static final Item NATION_10_NETHERITE_AXE = registerItem(
            "nation_10_netherite_axe",
            new AxeItem(
                    ToolMaterials.NETHERITE, new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ToolMaterials.NETHERITE, 5.0F, -3.0F))
            )
    );

    public static final Item NATION_5_NETHERITE_SWORD = registerItem(
            "nation_5_netherite_sword",
            new SwordItem(
                    ToolMaterials.NETHERITE, new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))
            )
    );
    public static final Item NATION_5_NETHERITE_SHOVEL = registerItem(
            "nation_5_netherite_shovel",
            new ShovelItem(
                    ToolMaterials.NETHERITE, new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.NETHERITE, 1.5F, -3.0F))
            )
    );
    public static final Item NATION_5_NETHERITE_PICKAXE = registerItem(
            "nation_5_netherite_pickaxe",
            new PickaxeItem(
                    ToolMaterials.NETHERITE, new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.NETHERITE, 1.0F, -2.8F))
            )
    );
    public static final Item NATION_5_NETHERITE_AXE = registerItem(
            "nation_5_netherite_axe",
            new AxeItem(
                    ToolMaterials.NETHERITE, new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ToolMaterials.NETHERITE, 5.0F, -3.0F))
            )
    );

    public static final Item NATION_2_NETHERITE_HELMET = registerItem(
            "nation_2_netherite_helmet",
            new ArmorItem(ModArmorMaterials.NATION_2_NETHERITE, ArmorItem.Type.HELMET, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37)))
    );
    public static final Item NATION_2_NETHERITE_CHESTPLATE = registerItem(
            "nation_2_netherite_chestplate",
            new ArmorItem(ModArmorMaterials.NATION_2_NETHERITE, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37)))
    );
    public static final Item NATION_2_NETHERITE_LEGGINGS = registerItem(
            "nation_2_netherite_leggings",
            new ArmorItem(ModArmorMaterials.NATION_2_NETHERITE, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37)))
    );
    public static final Item NATION_2_NETHERITE_BOOTS = registerItem(
            "nation_2_netherite_boots",
            new ArmorItem(ModArmorMaterials.NATION_2_NETHERITE, ArmorItem.Type.BOOTS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37)))
    );

    public static final Item NATION_3_IRON_HELMET = registerItem(
            "nation_3_iron_helmet", new ArmorItem(ModArmorMaterials.NATION_3_IRON, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15)))
    );
    public static final Item NATION_3_IRON_CHESTPLATE = registerItem(
            "nation_3_iron_chestplate", new ArmorItem(ModArmorMaterials.NATION_3_IRON, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15)))
    );
    public static final Item NATION_3_IRON_LEGGINGS = registerItem(
            "nation_3_iron_leggings", new ArmorItem(ModArmorMaterials.NATION_3_IRON, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15)))
    );
    public static final Item NATION_3_IRON_BOOTS = registerItem(
            "nation_3_iron_boots", new ArmorItem(ModArmorMaterials.NATION_3_IRON, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15)))
    );

    public static final Item NATION_3_NETHERITE_HELMET = registerItem(
            "nation_3_netherite_helmet",
            new ArmorItem(ModArmorMaterials.NATION_3_NETHERITE, ArmorItem.Type.HELMET, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37)))
    );
    public static final Item NATION_3_NETHERITE_CHESTPLATE = registerItem(
            "nation_3_netherite_chestplate",
            new ArmorItem(ModArmorMaterials.NATION_3_NETHERITE, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37)))
    );
    public static final Item NATION_3_NETHERITE_LEGGINGS = registerItem(
            "nation_3_netherite_leggings",
            new ArmorItem(ModArmorMaterials.NATION_3_NETHERITE, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37)))
    );
    public static final Item NATION_3_NETHERITE_BOOTS = registerItem(
            "nation_3_netherite_boots",
            new ArmorItem(ModArmorMaterials.NATION_3_NETHERITE, ArmorItem.Type.BOOTS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37)))
    );

    public static final Item NATION_4_NETHERITE_HELMET = registerItem(
            "nation_4_netherite_helmet",
            new ArmorItem(ModArmorMaterials.NATION_4_NETHERITE, ArmorItem.Type.HELMET, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37)))
    );
    public static final Item NATION_4_NETHERITE_CHESTPLATE = registerItem(
            "nation_4_netherite_chestplate",
            new ArmorItem(ModArmorMaterials.NATION_4_NETHERITE, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37)))
    );
    public static final Item NATION_4_NETHERITE_LEGGINGS = registerItem(
            "nation_4_netherite_leggings",
            new ArmorItem(ModArmorMaterials.NATION_4_NETHERITE, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37)))
    );
    public static final Item NATION_4_NETHERITE_BOOTS = registerItem(
            "nation_4_netherite_boots",
            new ArmorItem(ModArmorMaterials.NATION_4_NETHERITE, ArmorItem.Type.BOOTS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37)))
    );

    public static final Item NATION_5_NETHERITE_HELMET = registerItem(
            "nation_5_netherite_helmet",
            new ArmorItem(ModArmorMaterials.NATION_5_NETHERITE, ArmorItem.Type.HELMET, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37)))
    );
    public static final Item NATION_5_NETHERITE_CHESTPLATE = registerItem(
            "nation_5_netherite_chestplate",
            new ArmorItem(ModArmorMaterials.NATION_5_NETHERITE, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37)))
    );
    public static final Item NATION_5_NETHERITE_LEGGINGS = registerItem(
            "nation_5_netherite_leggings",
            new ArmorItem(ModArmorMaterials.NATION_5_NETHERITE, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37)))
    );
    public static final Item NATION_5_NETHERITE_BOOTS = registerItem(
            "nation_5_netherite_boots",
            new ArmorItem(ModArmorMaterials.NATION_5_NETHERITE, ArmorItem.Type.BOOTS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37)))
    );

    public static final Item NATION_10_NETHERITE_HELMET = registerItem(
            "nation_10_netherite_helmet",
            new ArmorItem(ModArmorMaterials.NATION_10_NETHERITE, ArmorItem.Type.HELMET, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37)))
    );
    public static final Item NATION_10_NETHERITE_CHESTPLATE = registerItem(
            "nation_10_netherite_chestplate",
            new ArmorItem(ModArmorMaterials.NATION_10_NETHERITE, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37)))
    );
    public static final Item NATION_10_NETHERITE_LEGGINGS = registerItem(
            "nation_10_netherite_leggings",
            new ArmorItem(ModArmorMaterials.NATION_10_NETHERITE, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37)))
    );
    public static final Item NATION_10_NETHERITE_BOOTS = registerItem(
            "nation_10_netherite_boots",
            new ArmorItem(ModArmorMaterials.NATION_10_NETHERITE, ArmorItem.Type.BOOTS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37)))
    );

    public static final Item INVISIBLE_NETHERITE_HELMET = registerItem(
            "invisible_netherite_helmet",
            new ArmorItem(ModArmorMaterials.INVISIBLE_NETHERITE, ArmorItem.Type.HELMET, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37)))
    );
    public static final Item INVISIBLE_NETHERITE_CHESTPLATE = registerItem(
            "invisible_netherite_chestplate",
            new ArmorItem(ModArmorMaterials.INVISIBLE_NETHERITE, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37)))
    );
    public static final Item INVISIBLE_NETHERITE_LEGGINGS = registerItem(
            "invisible_netherite_leggings",
            new ArmorItem(ModArmorMaterials.INVISIBLE_NETHERITE, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37)))
    );
    public static final Item INVISIBLE_NETHERITE_BOOTS = registerItem(
            "invisible_netherite_boots",
            new ArmorItem(ModArmorMaterials.INVISIBLE_NETHERITE, ArmorItem.Type.BOOTS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37)))
    );

    public static final Item INVISIBLE_DIAMOND_HELMET = registerItem(
            "invisible_diamond_helmet",
            new ArmorItem(ModArmorMaterials.INVISIBLE_DIAMOND, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(33)))
    );
    public static final Item INVISIBLE_DIAMOND_CHESTPLATE = registerItem(
            "invisible_diamond_chestplate",
            new ArmorItem(ModArmorMaterials.INVISIBLE_DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(33)))
    );
    public static final Item INVISIBLE_DIAMOND_LEGGINGS = registerItem(
            "invisible_diamond_leggings",
            new ArmorItem(ModArmorMaterials.INVISIBLE_DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(33)))
    );
    public static final Item INVISIBLE_DIAMOND_BOOTS = registerItem(
            "invisible_diamond_boots",
            new ArmorItem(ModArmorMaterials.INVISIBLE_DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(33)))
    );

    public static final Item NATION_2_DIAMOND_SWORD = registerItem(
            "nation_2_diamond_sword",
            new SwordItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND, 3, -2.4F)))
    );
    public static final Item NATION_2_DIAMOND_SHOVEL = registerItem(
            "nation_2_diamond_shovel",
            new ShovelItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.DIAMOND, 1.5F, -3.0F)))
    );
    public static final Item NATION_2_DIAMOND_PICKAXE = registerItem(
            "nation_2_diamond_pickaxe",
            new PickaxeItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.DIAMOND, 1.0F, -2.8F)))
    );
    public static final Item NATION_2_DIAMOND_AXE = registerItem(
            "nation_2_diamond_axe",
            new AxeItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ToolMaterials.DIAMOND, 5.0F, -3.0F)))
    );
    public static final Item NATION_2_DIAMOND_HOE = registerItem(
            "nation_2_diamond_hoe",
            new HoeItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterials.DIAMOND, -3.0F, 0.0F)))
    );

    public static final Item NATION_2_BOW = registerItem("nation_2_bow", new BowItem(new Item.Settings().maxDamage(384)));
    public static final Item NATION_9_BOW = registerItem("nation_9_bow", new BowItem(new Item.Settings().maxDamage(384)));
    public static final Item NATION_10_BOW = registerItem("nation_10_bow", new BowItem(new Item.Settings().maxDamage(384)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(NationsMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        NationsMod.LOGGER.info("Registering Mod Items For " + NationsMod.MOD_ID);
    }
}
