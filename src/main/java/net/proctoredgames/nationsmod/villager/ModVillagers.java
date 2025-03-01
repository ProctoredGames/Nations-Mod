package net.proctoredgames.nationsmod.villager;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.village.VillagerType;
import net.minecraft.world.poi.PointOfInterestType;
import net.proctoredgames.nationsmod.NationsMod;

public class ModVillagers {
//    public static final RegistryKey<PointOfInterestType> KAUPEN_POI_KEY = registerPoiKey("kaupen_poi");
//    public static final PointOfInterestType KAUPEN_POI = registerPOI("kaupen_poi", ModBlocks.CHAIR);

    public static final VillagerType NATION_1 = registerType("nation_1");
    public static final VillagerType NATION_2 = registerType("nation_2");
    public static final VillagerType NATION_3 = registerType("nation_3");
    public static final VillagerType NATION_4 = registerType("nation_4");
    public static final VillagerType NATION_5 = registerType("nation_5");
    public static final VillagerType NATION_6 = registerType("nation_6");
    public static final VillagerType NATION_7 = registerType("nation_7");
    public static final VillagerType NATION_8 = registerType("nation_8");
    public static final VillagerType NATION_9 = registerType("nation_9");
    public static final VillagerType NATION_10 = registerType("nation_10");


    private static VillagerType registerType(String name) {
        return Registry.register(Registries.VILLAGER_TYPE, Identifier.of(NationsMod.MOD_ID, name),
                new VillagerType(name));
    }

    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, Identifier.of(NationsMod.MOD_ID, name),
                new VillagerProfession(name, entry -> entry.matchesKey(type), entry -> entry.matchesKey(type),
                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_LIBRARIAN));
    }

    private static PointOfInterestType registerPOI(String name, Block block) {
        return PointOfInterestHelper.register(Identifier.of(NationsMod.MOD_ID, name),
                1, 1, block);
    }

    private static RegistryKey<PointOfInterestType> registerPoiKey(String name) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, Identifier.of(NationsMod.MOD_ID, name));
    }

    public static void registerVillagers() {
        NationsMod.LOGGER.info("Registering Villagers for " + NationsMod.MOD_ID);
    }
}
