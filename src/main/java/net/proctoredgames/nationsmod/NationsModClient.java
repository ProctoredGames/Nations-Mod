package net.proctoredgames.nationsmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.proctoredgames.nationsmod.entity.ModEntities;
import net.proctoredgames.nationsmod.entity.client.ModModelLayers;
import net.proctoredgames.nationsmod.entity.client.Nation2TridentEntityRenderer;

public class NationsModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModModelLayers.registerModels();
        EntityRendererRegistry.register(
                ModEntities.NATION_2_TRIDENT,
                Nation2TridentEntityRenderer::new
        );
    }
}
