package net.proctoredgames.nationsmod.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.proctoredgames.nationsmod.NationBased;

public class NationEssenceItem extends Item implements NationBased {
    public int nation;

    public NationEssenceItem(Settings settings, int pNation) {
        super(settings);
        setNation(pNation);
    }

    @Override
    public void setNation(int key) {
        this.nation = key;
    }

    @Override
    public int getNation() {
        return this.nation;
    }
}
