package net.proctoredgames.nationsmod.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.proctoredgames.nationsmod.mixin.VillagerEntityMixin;
import net.proctoredgames.nationsmod.villager.CustomVillager;

public class NationEssenceItem extends Item {
    int nation = 1;

    public NationEssenceItem(Settings settings, int pNation) {
        super(settings);
        this.nation = pNation;
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity player, LivingEntity entity, Hand hand) {
        if (!player.getWorld().isClient && entity instanceof VillagerEntity villager) {
            // Check if the villager implements the interface (which it will if the mixin applies correctly)
            if (villager instanceof CustomVillager customVillager) {
                customVillager.setCustomSkin(true);

                // Optionally consume the item
                if (!player.getAbilities().creativeMode) {
                    stack.decrement(1);
                }
                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.PASS;
    }
}
