package net.proctoredgames.nationsmod;

import net.fabricmc.api.ClientModInitializer;
import net.proctoredgames.nationsmod.entity.client.ModModelLayers;

public class NationsModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModModelLayers.registerModels();
    }
}
