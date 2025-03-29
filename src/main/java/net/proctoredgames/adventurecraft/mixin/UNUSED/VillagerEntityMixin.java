//package net.proctoredgames.adventurecraft.mixin.UNUSED;
//
//import net.minecraft.entity.EntityStatuses;
//import net.minecraft.entity.EntityType;
//import net.minecraft.entity.passive.PassiveEntity;
//import net.minecraft.entity.passive.VillagerEntity;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.item.ItemStack;
//import net.minecraft.sound.SoundCategory;
//import net.minecraft.sound.SoundEvents;
//import net.minecraft.util.ActionResult;
//import net.minecraft.util.Hand;
//import net.minecraft.village.VillagerData;
//import net.minecraft.village.VillagerType;
//import net.minecraft.world.World;
//import net.proctoredgames.adventurecraft.item.custom.EmpireEssenceItem;
//import net.proctoredgames.adventurecraft.villager.ModVillagers;
//import net.proctoredgames.adventurecraft.EmpireBased;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.Shadow;
//import org.spongepowered.asm.mixin.injection.At;
//import org.spongepowered.asm.mixin.injection.Inject;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
//
//@Mixin(VillagerEntity.class)
//public abstract class VillagerEntityMixin extends PassiveEntity implements EmpireBased{
//
//    @Shadow public abstract VillagerData getVillagerData();
//
//    protected VillagerEntityMixin(EntityType<? extends PassiveEntity> entityType, World world) {
//        super(entityType, world);
//    }
//
//    @Inject(method = "interactMob", at = @At("HEAD"), cancellable = true)
//    private void changeVillagerEmpire(PlayerEntity player, Hand hand, CallbackInfoReturnable<ActionResult> cir) {
//        ItemStack stack = player.getStackInHand(hand);
//
//        if (stack.getItem() instanceof EmpireEssenceItem && ((EmpireEssenceItem) stack.getItem()).getEmpire() == 4) {
//
////            System.out.println(((EmpireEssenceItem) stack.getItem()).getEmpire());
//            VillagerEntity villager = (VillagerEntity) (Object) this;
//
//            VillagerData oldData = villager.getVillagerData();
//
////            VillagerType newType = switch (((EmpireEssenceItem) stack.getItem()).getEmpire()) {
////                case 1 -> ModVillagers.EMPIRE_1;
////                case 2 -> ModVillagers.EMPIRE_1;
////                case 3 -> ModVillagers.EMPIRE_1;
////                case 4 -> ModVillagers.EMPIRE_3;
////                case 5 -> ModVillagers.EMPIRE_4;
////                case 6 -> ModVillagers.EMPIRE_5;
////                case 7 -> ModVillagers.EMPIRE_6;
////                case 8 -> ModVillagers.EMPIRE_7;
////                case 9 -> ModVillagers.EMPIRE_8;
////                default -> VillagerType.JUNGLE;
////            };
//            // Set new VillagerData but keep profession and level the same
//            villager.setVillagerData(new VillagerData(
//                    ModVillagers.EMPIRE_3,        // New biome type (controls skin)
//                    oldData.getProfession(), // Keep current profession
//                    oldData.getLevel() // Keep current level
//            ));
//
//            this.getWorld().sendEntityStatus(this, EntityStatuses.ADD_VILLAGER_HAPPY_PARTICLES);
//
//            this.getWorld().playSound(null, this.getBlockPos(), SoundEvents.ENTITY_PLAYER_LEVELUP,
//                    SoundCategory.NEUTRAL, 1.0F, 1.0F);
//
//            if (!player.isCreative()) {
//                stack.decrement(1);
//            }
//
//            cir.setReturnValue(ActionResult.SUCCESS); // Stop the UI from opening
//            cir.cancel();
//        }
//    }
//
//    public int getEmpire(){
//        VillagerType type = this.getVillagerData().getType();
//        int empire = 0;
//        if(type == ModVillagers.EMPIRE_1){
//            empire = 1;
//        } else if(type == ModVillagers.EMPIRE_1){
//            empire = 2;
//        } else if(type == ModVillagers.EMPIRE_1){
//            empire = 3;
//        } else if(type == ModVillagers.EMPIRE_3){
//            empire = 4;
//        } else if(type == ModVillagers.EMPIRE_4){
//            empire = 5;
//        } else if(type == ModVillagers.EMPIRE_5){
//            empire = 6;
//        } else if(type == ModVillagers.EMPIRE_6){
//            empire = 7;
//        } else if(type == ModVillagers.EMPIRE_7){
//            empire = 8;
//        } else if(type == ModVillagers.EMPIRE_8){
//            empire = 9;
//        } else if(type == ModVillagers.EMPIRE_9){
//            empire = 10;
//        }
//        return empire;
//    }
//}
