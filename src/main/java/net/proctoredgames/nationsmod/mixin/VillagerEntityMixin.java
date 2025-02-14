package net.proctoredgames.nationsmod.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.village.VillagerData;
import net.minecraft.village.VillagerType;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.proctoredgames.nationsmod.item.custom.NationEssenceItem;
import net.proctoredgames.nationsmod.villager.ModVillagers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(VillagerEntity.class)
public abstract class VillagerEntityMixin extends PassiveEntity {

    protected VillagerEntityMixin(EntityType<? extends PassiveEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "interactMob", at = @At("HEAD"), cancellable = true)
    private void changeVillagerBiome(PlayerEntity player, Hand hand, CallbackInfoReturnable<ActionResult> cir) {
        ItemStack stack = player.getStackInHand(hand);
        System.out.println("tried to change villager type");

        if (stack.getItem() instanceof NationEssenceItem) {
            System.out.println("changed villager type");

            VillagerEntity villager = (VillagerEntity) (Object) this;

            VillagerData oldData = villager.getVillagerData();
            Biome biome = this.getWorld().getBiome(this.getBlockPos()).value(); // Get the current biome

            VillagerType newType = VillagerType.SWAMP;
            switch(((NationEssenceItem) stack.getItem()).getNation()){
                case 1:
                    newType = ModVillagers.NATION_1;
                    break;
                case 2:
                    newType = ModVillagers.NATION_2;
                    break;
                case 3:
                    newType = ModVillagers.NATION_3;
                    break;
                case 4:
                    newType = ModVillagers.NATION_4;
                    break;
                case 5:
                    newType = ModVillagers.NATION_5;
                    break;
                case 6:
                    newType = ModVillagers.NATION_6;
                    break;
                case 7:
                    newType = ModVillagers.NATION_7;
                    break;
                case 8:
                    newType = ModVillagers.NATION_8;
                    break;
                default:
                    newType = VillagerType.JUNGLE;
            }
            // Set new VillagerData but keep profession and level the same
            villager.setVillagerData(new VillagerData(
                    newType,        // New biome type (controls skin)
                    oldData.getProfession(), // Keep current profession
                    oldData.getLevel() // Keep current level
            ));

            this.getWorld().playSound(null, this.getBlockPos(), SoundEvents.ENTITY_VILLAGER_CELEBRATE,
                    SoundCategory.NEUTRAL, 1.0F, 1.0F);

            if (!player.isCreative()) {
                stack.decrement(1);
            }

            cir.setReturnValue(ActionResult.SUCCESS); // Stop the UI from opening
            cir.cancel();
        }
    }
}
