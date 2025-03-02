//package net.proctoredgames.nationsmod.mixin;
//
//import net.minecraft.block.BlockState;
//import net.minecraft.block.PointedDripstoneBlock;
//import net.minecraft.entity.projectile.ProjectileEntity;
//import net.minecraft.entity.projectile.TridentEntity;
//import net.minecraft.util.hit.BlockHitResult;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.world.World;
////import net.proctoredgames.nationsmod.entity.custom.Nation2TridentEntity;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.injection.At;
//import org.spongepowered.asm.mixin.injection.Inject;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
//
//@Mixin(PointedDripstoneBlock.class)
//public class PointedDripstoneTridentMixin {
//    @Inject(method = "onProjectileHit", at = @At("HEAD"), cancellable = true)
//    protected void customOnProjectileHit(World world, BlockState state, BlockHitResult hit, ProjectileEntity projectile, CallbackInfo ci) {
//        if (!world.isClient) {
//            BlockPos blockPos = hit.getBlockPos();
//            if (projectile.canModifyAt(world, blockPos)
//                    && projectile.canBreakBlocks(world)
//                    && (projectile instanceof TridentEntity || projectile instanceof Nation2TridentEntity)
//                    && projectile.getVelocity().length() > 0.6) {
//                world.breakBlock(blockPos, true);
//            }
//        }
//        ci.cancel();
//    }
//}
