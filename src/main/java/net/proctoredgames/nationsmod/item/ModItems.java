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

    public static final Item NATION_1_ELYTRA = registerItem("nation_1_elytra", new NationElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), 1));
    public static final Item NATION_2_ELYTRA = registerItem("nation_2_elytra", new NationElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), 2));
    public static final Item NATION_2_DEMON_ELYTRA = registerItem("nation_2_demon_elytra", new NationElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), -2));
    public static final Item NATION_3_ELYTRA = registerItem("nation_3_elytra", new NationElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), 3));
//    public static final Item NATION_4_ELYTRA = registerItem("nation_4_elytra", new NationElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), 4));
//    public static final Item NATION_5_ELYTRA = registerItem("nation_5_elytra", new NationElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), 5));
//    public static final Item NATION_6_ELYTRA = registerItem("nation_6_elytra", new NationElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), 6));
//    public static final Item NATION_7_ELYTRA = registerItem("nation_7_elytra", new NationElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), 7));
//    public static final Item NATION_8_ELYTRA = registerItem("nation_8_elytra", new NationElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), 8));
    public static final Item NATION_9_ELYTRA = registerItem("nation_9_elytra", new NationElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), 9));

    public static final Item NATION_9_HAT = registerItem("nation_9_hat", new HatItem(new Item.Settings()));

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


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(NationsMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        NationsMod.LOGGER.info("Registering Mod Items For " + NationsMod.MOD_ID);
    }
}
