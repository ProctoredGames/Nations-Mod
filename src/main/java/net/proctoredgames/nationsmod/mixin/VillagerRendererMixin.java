package net.proctoredgames.nationsmod.mixin;

import net.minecraft.client.render.entity.VillagerEntityRenderer;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.util.Identifier;
import net.proctoredgames.nationsmod.NationsMod;
import net.proctoredgames.nationsmod.villager.CustomVillager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(VillagerEntityRenderer.class)
public class VillagerRendererMixin {
    @Inject(method = "getTexture", at = @At("HEAD"), cancellable = true)
    private void getCustomTexture(VillagerEntity villager, CallbackInfoReturnable<Identifier> cir) {
        if (villager instanceof CustomVillager customVillager && customVillager.hasCustomSkin()) {
            cir.setReturnValue(Identifier.of(NationsMod.MOD_ID, "entity/villager/nation_4.png"));
        }
    }
}



