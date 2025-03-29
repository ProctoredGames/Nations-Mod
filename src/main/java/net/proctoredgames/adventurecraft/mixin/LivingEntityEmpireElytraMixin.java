package net.proctoredgames.adventurecraft.mixin;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.effect.EnchantmentLocationBasedEffect;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.brain.Brain;
import net.minecraft.entity.attribute.*;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageTracker;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtOps;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import net.proctoredgames.adventurecraft.item.ModItems;
import net.proctoredgames.adventurecraft.item.custom.EmpireElytraItem;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

@Mixin(LivingEntity.class)
public abstract class LivingEntityEmpireElytraMixin extends Entity implements Attackable {
    protected int fallFlyingTicks;

    private final Map<RegistryEntry<StatusEffect>, StatusEffectInstance> activeStatusEffects = Maps.<RegistryEntry<StatusEffect>, StatusEffectInstance>newHashMap();


    protected LivingEntityEmpireElytraMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }


    @Inject(method = "tickFallFlying", at = @At("HEAD"), cancellable = true)
    private void customTickFallFlying(CallbackInfo ci) {
        boolean bl = this.getFlag(Entity.FALL_FLYING_FLAG_INDEX);
        if (bl && !this.isOnGround() && !this.hasVehicle() && !this.hasStatusEffect(StatusEffects.LEVITATION)) {
            ItemStack itemStack = this.getEquippedStack(EquipmentSlot.CHEST);
            if ((itemStack.getItem() instanceof EmpireElytraItem && EmpireElytraItem.isUsable(itemStack))
            || (itemStack.getItem() instanceof ElytraItem && ElytraItem.isUsable(itemStack))) {
                bl = true;
                this.fallFlyingTicks++;
                int i = this.fallFlyingTicks + 1;
                if (!this.getWorld().isClient && i % 10 == 0) {
                    int j = i / 10;
                    if (j % 2 == 0) {
                        itemStack.damage(1, (LivingEntity)(Object) this, EquipmentSlot.CHEST);
                    }

                    this.emitGameEvent(GameEvent.ELYTRA_GLIDE);
                }
            } else {
                bl = false;
            }
        } else {
            bl = false;
        }

        if (!this.getWorld().isClient) {
            this.setFlag(Entity.FALL_FLYING_FLAG_INDEX, bl);
        }
        ci.cancel();
    }

    public boolean hasStatusEffect(RegistryEntry<StatusEffect> effect) {
        return this.activeStatusEffects.containsKey(effect);
    }

    @Shadow
    public abstract ItemStack getEquippedStack(EquipmentSlot slot);

}
