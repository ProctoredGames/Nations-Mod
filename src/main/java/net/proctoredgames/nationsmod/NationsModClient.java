package net.proctoredgames.nationsmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.proctoredgames.nationsmod.entity.ModEntities;
import net.proctoredgames.nationsmod.entity.client.ModModelLayers;
//import net.proctoredgames.nationsmod.entity.client.Nation2TridentEntityRenderer;
//import net.proctoredgames.nationsmod.entity.client.Nation4TridentEntityRenderer;
import net.proctoredgames.nationsmod.item.ModItems;
import net.proctoredgames.nationsmod.util.ModModelPredicates;

public class NationsModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModModelLayers.registerModels();
        ModModelPredicates.registerModelPredicates();
//        EntityRendererRegistry.register(
//                ModEntities.NATION_4_TRIDENT,
//                Nation4TridentEntityRenderer::new
//        );
    }
}
