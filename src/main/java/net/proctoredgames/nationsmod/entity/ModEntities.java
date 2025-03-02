package net.proctoredgames.nationsmod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.proctoredgames.nationsmod.NationsMod;
import net.proctoredgames.nationsmod.entity.custom.Nation2TridentEntity;

public class ModEntities {

    public static final EntityType<Nation2TridentEntity> NATION_2_TRIDENT = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(NationsMod.MOD_ID, "nation_2_trident"),
            EntityType.Builder.<Nation2TridentEntity>create(Nation2TridentEntity::new, SpawnGroup.MISC)
                    .dimensions(0.5F, 0.5F)
                    .eyeHeight(0.13F)
                    .maxTrackingRange(4)
                    .trackingTickInterval(20).build());

    public static void registerModEntities() {
        NationsMod.LOGGER.info("Registering Mod Entities for " + NationsMod.MOD_ID);
    }
}