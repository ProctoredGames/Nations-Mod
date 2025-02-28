package net.proctoredgames.nationsmod.mixin;

import net.minecraft.entity.EntityStatuses;
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
import net.proctoredgames.nationsmod.NationBased;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(VillagerEntity.class)
public abstract class VillagerEntityMixin extends PassiveEntity implements NationBased{

    @Shadow public abstract VillagerData getVillagerData();

    protected VillagerEntityMixin(EntityType<? extends PassiveEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "interactMob", at = @At("HEAD"), cancellable = true)
    private void changeVillagerNation(PlayerEntity player, Hand hand, CallbackInfoReturnable<ActionResult> cir) {
        ItemStack stack = player.getStackInHand(hand);

        if (stack.getItem() instanceof NationEssenceItem && ((NationEssenceItem) stack.getItem()).getNation() == 4) {

//            System.out.println(((NationEssenceItem) stack.getItem()).getNation());
            VillagerEntity villager = (VillagerEntity) (Object) this;

            VillagerData oldData = villager.getVillagerData();

//            VillagerType newType = switch (((NationEssenceItem) stack.getItem()).getNation()) {
//                case 1 -> ModVillagers.NATION_1;
//                case 2 -> ModVillagers.NATION_2;
//                case 3 -> ModVillagers.NATION_3;
//                case 4 -> ModVillagers.NATION_4;
//                case 5 -> ModVillagers.NATION_5;
//                case 6 -> ModVillagers.NATION_6;
//                case 7 -> ModVillagers.NATION_7;
//                case 8 -> ModVillagers.NATION_8;
//                case 9 -> ModVillagers.NATION_9;
//                default -> VillagerType.JUNGLE;
//            };
            // Set new VillagerData but keep profession and level the same
            villager.setVillagerData(new VillagerData(
                    ModVillagers.NATION_4,        // New biome type (controls skin)
                    oldData.getProfession(), // Keep current profession
                    oldData.getLevel() // Keep current level
            ));

            this.getWorld().sendEntityStatus(this, EntityStatuses.ADD_VILLAGER_HAPPY_PARTICLES);

            this.getWorld().playSound(null, this.getBlockPos(), SoundEvents.ENTITY_PLAYER_LEVELUP,
                    SoundCategory.NEUTRAL, 1.0F, 1.0F);

            if (!player.isCreative()) {
                stack.decrement(1);
            }

            cir.setReturnValue(ActionResult.SUCCESS); // Stop the UI from opening
            cir.cancel();
        }
    }

    public int getNation(){
        VillagerType type = this.getVillagerData().getType();
        int nation = 0;
        if(type == ModVillagers.NATION_1){
            nation = 1;
        } else if(type == ModVillagers.NATION_2){
            nation = 2;
        } else if(type == ModVillagers.NATION_3){
            nation = 3;
        } else if(type == ModVillagers.NATION_4){
            nation = 4;
        } else if(type == ModVillagers.NATION_5){
            nation = 5;
        } else if(type == ModVillagers.NATION_6){
            nation = 6;
        } else if(type == ModVillagers.NATION_7){
            nation = 7;
        } else if(type == ModVillagers.NATION_8){
            nation = 8;
        } else if(type == ModVillagers.NATION_9){
            nation = 9;
        }
        return nation;
    }
}
