package net.proctoredgames.adventurecraft.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.proctoredgames.adventurecraft.EmpireBased;

public class EmpireEssenceItem extends Item implements EmpireBased {
    public int empire;

    public EmpireEssenceItem(Settings settings, int pEmpire) {
        super(settings);
        setEmpire(pEmpire);
    }

    @Override
    public void setEmpire(int key) {
        this.empire = key;
    }

    @Override
    public int getEmpire() {
        return this.empire;
    }
}
