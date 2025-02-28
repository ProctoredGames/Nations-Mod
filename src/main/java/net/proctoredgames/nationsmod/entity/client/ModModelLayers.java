package net.proctoredgames.nationsmod.entity.client;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.proctoredgames.nationsmod.NationsMod;
import net.proctoredgames.nationsmod.entity.client.villagers.Nation4ButcherVillager;
import net.proctoredgames.nationsmod.entity.client.villagers.Nation4FishermanVillager;
import net.proctoredgames.nationsmod.entity.client.villagers.Nation4LibrarianVillager;

public class ModModelLayers {
    public static final EntityModelLayer NATION_1_VILLAGER = new EntityModelLayer(Identifier.of(NationsMod.MOD_ID, "nation_1_villager"), "main");
    public static final EntityModelLayer NATION_2_VILLAGER = new EntityModelLayer(Identifier.of(NationsMod.MOD_ID, "nation_2_villager"), "main");
    public static final EntityModelLayer NATION_3_VILLAGER = new EntityModelLayer(Identifier.of(NationsMod.MOD_ID, "nation_3_villager"), "main");

    public static final EntityModelLayer NATION_4_BUTCHER = new EntityModelLayer(Identifier.of(NationsMod.MOD_ID, "nation_4_butcher"), "main");
    public static final EntityModelLayer NATION_4_FISHERMAN = new EntityModelLayer(Identifier.of(NationsMod.MOD_ID, "nation_4_fisherman"), "main");
    public static final EntityModelLayer NATION_4_LIBRARIAN = new EntityModelLayer(Identifier.of(NationsMod.MOD_ID, "nation_4_librarian"), "main");

    public static final EntityModelLayer NATION_5_VILLAGER = new EntityModelLayer(Identifier.of(NationsMod.MOD_ID, "nation_5_villager"), "main");
    public static final EntityModelLayer NATION_6_VILLAGER = new EntityModelLayer(Identifier.of(NationsMod.MOD_ID, "nation_6_villager"), "main");
    public static final EntityModelLayer NATION_7_VILLAGER = new EntityModelLayer(Identifier.of(NationsMod.MOD_ID, "nation_7_villager"), "main");
    public static final EntityModelLayer NATION_8_VILLAGER = new EntityModelLayer(Identifier.of(NationsMod.MOD_ID, "nation_8_villager"), "main");

    public static void registerModels() {
//        EntityModelLayerRegistry.registerModelLayer(NATION_1_VILLAGER, MalbiNationsCatVillagerModel::getTexturedModelData);
//        EntityModelLayerRegistry.registerModelLayer(NATION_2_VILLAGER, MalbiNationsCatVillagerModel::getTexturedModelData);
//        EntityModelLayerRegistry.registerModelLayer(NATION_3_VILLAGER, MalbiNationsCatVillagerModel::getTexturedModelData);

        EntityModelLayerRegistry.registerModelLayer(NATION_4_BUTCHER, Nation4ButcherVillager::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(NATION_4_FISHERMAN, Nation4FishermanVillager::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(NATION_4_LIBRARIAN, Nation4LibrarianVillager::getTexturedModelData);

//        EntityModelLayerRegistry.registerModelLayer(NATION_5_VILLAGER, MalbiNationsCatVillagerModel::getTexturedModelData);
//        EntityModelLayerRegistry.registerModelLayer(NATION_6_VILLAGER, MalbiNationsCatVillagerModel::getTexturedModelData);
//        EntityModelLayerRegistry.registerModelLayer(NATION_7_VILLAGER, MalbiNationsCatVillagerModel::getTexturedModelData);
//        EntityModelLayerRegistry.registerModelLayer(NATION_8_VILLAGER, MalbiNationsCatVillagerModel::getTexturedModelData);
    }
}

