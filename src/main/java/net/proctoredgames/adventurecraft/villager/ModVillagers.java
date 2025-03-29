package net.proctoredgames.adventurecraft.villager;

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
import net.proctoredgames.adventurecraft.Adventurecraft;

public class ModVillagers {
//    public static final RegistryKey<PointOfInterestType> KAUPEN_POI_KEY = registerPoiKey("kaupen_poi");
//    public static final PointOfInterestType KAUPEN_POI = registerPOI("kaupen_poi", ModBlocks.CHAIR);

    public static final VillagerType EMPIRE_1 = registerType("empire_1");
    public static final VillagerType EMPIRE_2 = registerType("empire_2");
    public static final VillagerType EMPIRE_3 = registerType("empire_3");
    public static final VillagerType EMPIRE_4 = registerType("empire_4");
    public static final VillagerType EMPIRE_5 = registerType("empire_5");
    public static final VillagerType EMPIRE_6 = registerType("empire_6");
    public static final VillagerType EMPIRE_7 = registerType("empire_7");
    public static final VillagerType EMPIRE_8 = registerType("empire_8");
    public static final VillagerType EMPIRE_9 = registerType("empire_9");
    public static final VillagerType EMPIRE_10 = registerType("empire_10");


    private static VillagerType registerType(String name) {
        return Registry.register(Registries.VILLAGER_TYPE, Identifier.of(Adventurecraft.MOD_ID, name),
                new VillagerType(name));
    }

    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, Identifier.of(Adventurecraft.MOD_ID, name),
                new VillagerProfession(name, entry -> entry.matchesKey(type), entry -> entry.matchesKey(type),
                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_LIBRARIAN));
    }

    private static PointOfInterestType registerPOI(String name, Block block) {
        return PointOfInterestHelper.register(Identifier.of(Adventurecraft.MOD_ID, name),
                1, 1, block);
    }

    private static RegistryKey<PointOfInterestType> registerPoiKey(String name) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, Identifier.of(Adventurecraft.MOD_ID, name));
    }

    public static void registerVillagers() {
        Adventurecraft.LOGGER.info("Registering Villagers for " + Adventurecraft.MOD_ID);
    }
}
