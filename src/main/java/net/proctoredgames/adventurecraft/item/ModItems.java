package net.proctoredgames.adventurecraft.item;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.proctoredgames.adventurecraft.Adventurecraft;
import net.proctoredgames.adventurecraft.item.custom.HatItem;
//import net.proctoredgames.adventurecraft.item.custom.Empire2TridentItem;
import net.proctoredgames.adventurecraft.item.custom.EmpireElytraItem;
import net.proctoredgames.adventurecraft.item.custom.EmpireEssenceItem;

public class ModItems {
    public static final Item ESSENCE_OF_EMPIRE_1 = registerItem("essence_of_empire_1", new EmpireEssenceItem(new Item.Settings(), 1));
    public static final Item ESSENCE_OF_EMPIRE_2 = registerItem("essence_of_empire_2", new EmpireEssenceItem(new Item.Settings(), 2));
    public static final Item ESSENCE_OF_EMPIRE_3 = registerItem("essence_of_empire_3", new EmpireEssenceItem(new Item.Settings(), 3));
    public static final Item ESSENCE_OF_EMPIRE_4 = registerItem("essence_of_empire_4", new EmpireEssenceItem(new Item.Settings(), 4));
    public static final Item ESSENCE_OF_EMPIRE_5 = registerItem("essence_of_empire_5", new EmpireEssenceItem(new Item.Settings(), 5));
    public static final Item ESSENCE_OF_EMPIRE_6 = registerItem("essence_of_empire_6", new EmpireEssenceItem(new Item.Settings(), 6));
    public static final Item ESSENCE_OF_EMPIRE_7 = registerItem("essence_of_empire_7", new EmpireEssenceItem(new Item.Settings(), 7));
    public static final Item ESSENCE_OF_EMPIRE_8 = registerItem("essence_of_empire_8", new EmpireEssenceItem(new Item.Settings(), 8));
    public static final Item ESSENCE_OF_EMPIRE_9 = registerItem("essence_of_empire_9", new EmpireEssenceItem(new Item.Settings(), 9));

    public static final Item EMPIRE_1_ELYTRA = registerItem("empire_1_elytra", new EmpireElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), 1));
    public static final Item EMPIRE_2_ELYTRA = registerItem("empire_2_elytra", new EmpireElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), 2));
    public static final Item EMPIRE_3_ELYTRA = registerItem("empire_3_elytra", new EmpireElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), 3));
    public static final Item EMPIRE_4_ELYTRA = registerItem("empire_4_elytra", new EmpireElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), 4));
    public static final Item EMPIRE_5_ELYTRA = registerItem("empire_5_elytra", new EmpireElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), 5));
    public static final Item EMPIRE_6_ELYTRA = registerItem("empire_6_elytra", new EmpireElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), 6));
    public static final Item EMPIRE_7_ELYTRA = registerItem("empire_7_elytra", new EmpireElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), 7));
    public static final Item EMPIRE_8_ELYTRA = registerItem("empire_8_elytra", new EmpireElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), 8));
    public static final Item EMPIRE_9_ELYTRA = registerItem("empire_9_elytra", new EmpireElytraItem(new Item.Settings().maxDamage(432).rarity(Rarity.UNCOMMON), 9));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Adventurecraft.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Adventurecraft.LOGGER.info("Registering Mod Items For " + Adventurecraft.MOD_ID);
    }
}
