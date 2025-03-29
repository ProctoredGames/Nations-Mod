package net.proctoredgames.adventurecraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.EntityTypeTags;
import net.minecraft.registry.tag.ItemTags;
import net.proctoredgames.adventurecraft.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
                .add(ModItems.ESSENCE_OF_EMPIRE_1)
                .add(ModItems.ESSENCE_OF_EMPIRE_2)
                .add(ModItems.ESSENCE_OF_EMPIRE_3)
                .add(ModItems.ESSENCE_OF_EMPIRE_4)
                .add(ModItems.ESSENCE_OF_EMPIRE_5)
                .add(ModItems.ESSENCE_OF_EMPIRE_6)
                .add(ModItems.ESSENCE_OF_EMPIRE_7)
                .add(ModItems.ESSENCE_OF_EMPIRE_8)
                .add(ModItems.ESSENCE_OF_EMPIRE_9);
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(Items.ELYTRA);

    }
}