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

public class NationEssenceItem extends Item {
    public int nation = 1;

    public NationEssenceItem(Settings settings, int pNation) {
        super(settings);
        this.nation = pNation;
    }

    public int getNation(){
        return this.nation;
    }
}
