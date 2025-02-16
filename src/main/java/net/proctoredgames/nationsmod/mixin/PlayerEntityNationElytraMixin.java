package net.proctoredgames.nationsmod.mixin;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public class PlayerEntityNationElytraMixin {

    @Inject(method = "checkFallFlying", at = @At("HEAD"), cancellable = true)
    public void customCheckFallFlying(CallbackInfoReturnable<Boolean> ci) {
        PlayerEntity self = (PlayerEntity) (Object) this; // Correctly reference the player entity

        if (!self.isOnGround() && !self.isFallFlying() && !self.isTouchingWater() && !self.hasStatusEffect(StatusEffects.LEVITATION)) {
            ItemStack itemStack = self.getEquippedStack(EquipmentSlot.CHEST);
            if (itemStack.getItem() instanceof ElytraItem && ElytraItem.isUsable(itemStack)) {
                self.startFallFlying();
                ci.setReturnValue(true);
            }
        }
    }
}
