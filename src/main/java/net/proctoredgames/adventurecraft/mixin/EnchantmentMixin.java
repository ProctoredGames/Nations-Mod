package net.proctoredgames.adventurecraft.mixin;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.proctoredgames.adventurecraft.item.custom.EmpireElytraItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Enchantment.class)
public class EnchantmentMixin {
    @Inject(method = "isAcceptableItem", at = @At("HEAD"), cancellable = true)
    private void allowCustomItems(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
        if (stack.getItem() instanceof EmpireElytraItem) {
            cir.setReturnValue(true); // Marks it as enchantable via commands
        }
    }
}

