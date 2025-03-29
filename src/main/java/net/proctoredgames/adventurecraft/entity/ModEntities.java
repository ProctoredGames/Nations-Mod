package net.proctoredgames.adventurecraft.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.proctoredgames.adventurecraft.Adventurecraft;
//import net.proctoredgames.adventurecraft.entity.custom.Empire4TridentEntity;
//import net.proctoredgames.adventurecraft.entity.custom.Empire2TridentEntity;

public class ModEntities {

//    public static final EntityType<Empire4TridentEntity> EMPIRE_4_TRIDENT = Registry.register(Registries.ENTITY_TYPE,
//            Identifier.of(Adventurecraft.MOD_ID, "empire_4_trident"),
//            EntityType.Builder.<Empire4TridentEntity>create(Empire4TridentEntity::new, SpawnGroup.MISC)
//                    .dimensions(0.5F, 0.5F)
//                    .eyeHeight(0.13F)
//                    .maxTrackingRange(4)
//                    .trackingTickInterval(20).build());

    public static void registerModEntities() {
        Adventurecraft.LOGGER.info("Registering Mod Entities for " + Adventurecraft.MOD_ID);
    }
}