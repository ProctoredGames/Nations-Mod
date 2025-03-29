package net.proctoredgames.adventurecraft;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.proctoredgames.adventurecraft.entity.ModEntities;
//import net.proctoredgames.adventurecraft.entity.client.Empire2TridentEntityRenderer;
//import net.proctoredgames.adventurecraft.entity.client.Empire4TridentEntityRenderer;
import net.proctoredgames.adventurecraft.item.ModItems;
import net.proctoredgames.adventurecraft.util.ModModelPredicates;

public class AdventurecraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModModelPredicates.registerModelPredicates();
//        EntityRendererRegistry.register(
//                ModEntities.EMPIRE_4_TRIDENT,
//                Empire4TridentEntityRenderer::new
//        );
    }
}
