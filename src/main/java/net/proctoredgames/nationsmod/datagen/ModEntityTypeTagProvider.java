package net.proctoredgames.nationsmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.EntityTypeTags;
import net.minecraft.registry.tag.ItemTags;
import net.proctoredgames.nationsmod.entity.ModEntities;
import net.proctoredgames.nationsmod.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModEntityTypeTagProvider extends FabricTagProvider.EntityTypeTagProvider {
    public ModEntityTypeTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

//        getOrCreateTagBuilder(EntityTypeTags.IMPACT_PROJECTILES)
//                .add(ModEntities.NATION_4_TRIDENT);
//
//        getOrCreateTagBuilder(EntityTypeTags.REDIRECTABLE_PROJECTILE)
//                .add(ModEntities.NATION_4_TRIDENT);

    }
}