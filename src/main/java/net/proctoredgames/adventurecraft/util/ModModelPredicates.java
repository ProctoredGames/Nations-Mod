package net.proctoredgames.adventurecraft.util;

import net.proctoredgames.adventurecraft.Adventurecraft;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.proctoredgames.adventurecraft.item.ModItems;

public class ModModelPredicates {
    public static void registerModelPredicates() {
//        registerCustomBow(ModItems.EMPIRE_2_BOW);
//        registerCustomBow(ModItems.EMPIRE_9_BOW);
    }

    private static void registerCustomBow(Item item) {
        ModelPredicateProviderRegistry.register(item, Identifier.ofVanilla("pull"), (stack, world, entity, seed) -> {
            if (entity == null) {
                return 0.0F;
            } else {
                return entity.getActiveItem() != stack ? 0.0F : (float)(stack.getMaxUseTime(entity) - entity.getItemUseTimeLeft()) / 20.0F;
            }
        });
        ModelPredicateProviderRegistry.register(
                item,
                Identifier.ofVanilla("pulling"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F
        );
    }
}