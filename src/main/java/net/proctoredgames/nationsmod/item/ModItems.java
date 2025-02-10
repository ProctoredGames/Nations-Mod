package net.proctoredgames.nationsmod.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.proctoredgames.nationsmod.NationsMod;
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

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(NationsMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        NationsMod.LOGGER.info("Registering Mod Items For " + NationsMod.MOD_ID);
    }
}
