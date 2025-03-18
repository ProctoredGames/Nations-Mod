package net.proctoredgames.nationsmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.entity.EntityType;
import net.proctoredgames.nationsmod.entity.client.villagers.Nation3Villager;
//import net.proctoredgames.nationsmod.entity.client.Nation2TridentEntityRenderer;
//import net.proctoredgames.nationsmod.entity.client.Nation4TridentEntityRenderer;

public class NationsModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(Nation3Villager.NATION_3_VILLAGER, Nation3Villager::getTexturedModelData);
    }
}
