package net.proctoredgames.nationsmod.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.proctoredgames.nationsmod.item.custom.NationEssenceItem;
import net.proctoredgames.nationsmod.villager.CustomVillager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(VillagerEntity.class)
public abstract class VillagerEntityMixin extends PassiveEntity implements CustomVillager {
    private static final TrackedData<Boolean> HAS_CUSTOM_SKIN =
            DataTracker.registerData(VillagerEntity.class, TrackedDataHandlerRegistry.BOOLEAN);

    protected VillagerEntityMixin(EntityType<? extends PassiveEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "initDataTracker", at = @At("TAIL"))
    private void initCustomDataTracker(CallbackInfo ci) {
        if (this.getDataTracker() != null) {
            this.getDataTracker().set(HAS_CUSTOM_SKIN, false); // Default to false
        }
    }

    @Inject(method = "readCustomDataFromNbt", at = @At("TAIL"))
    private void readCustomSkinFromNbt(NbtCompound nbt, CallbackInfo ci) {
        if (this.getDataTracker() != null) {
            if (nbt.contains("HasCustomSkin")) {
                this.getDataTracker().set(HAS_CUSTOM_SKIN, nbt.getBoolean("HasCustomSkin"));
            }
        }
    }

    @Inject(method = "writeCustomDataToNbt", at = @At("TAIL"))
    private void writeCustomSkinToNbt(NbtCompound nbt, CallbackInfo ci) {
        if (this.getDataTracker() != null) {
            nbt.putBoolean("HasCustomSkin", this.getDataTracker().get(HAS_CUSTOM_SKIN));
        }
    }

    @Inject(method = "interactMob", at = @At("HEAD"), cancellable = true)
    private void preventTradeUI(PlayerEntity player, Hand hand, CallbackInfoReturnable<ActionResult> cir) {
        ItemStack stack = player.getStackInHand(hand);
        if (stack.getItem() instanceof NationEssenceItem) {
            cir.setReturnValue(ActionResult.SUCCESS); // Stops the UI from opening
        }
    }

    public void setCustomSkin(boolean hasCustomSkin) {
        if (this.getDataTracker() != null) {
            this.getDataTracker().set(HAS_CUSTOM_SKIN, hasCustomSkin);
        }
    }

    public boolean hasCustomSkin() {
        return this.dataTracker != null && this.getDataTracker().get(HAS_CUSTOM_SKIN);
    }
}
