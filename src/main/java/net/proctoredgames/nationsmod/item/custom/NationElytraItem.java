package net.proctoredgames.nationsmod.item.custom;

import net.minecraft.block.DispenserBlock;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ElytraItem;

public class NationElytraItem extends ElytraItem implements NationItem {
    public int nation;

    public NationElytraItem(Settings settings, int pNation) {
        super(settings);
        DispenserBlock.registerBehavior(this, ArmorItem.DISPENSER_BEHAVIOR);
        this.nation = pNation;
    }

    public int getNation(){
        return this.nation;
    }
}
