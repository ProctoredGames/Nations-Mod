package net.proctoredgames.nationsmod.item.custom;

import net.minecraft.block.DispenserBlock;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ElytraItem;
import net.proctoredgames.nationsmod.NationBased;

public class NationElytraItem extends ElytraItem implements NationBased {
    public int nation;

    public NationElytraItem(Settings settings, int pNation) {
        super(settings);
        DispenserBlock.registerBehavior(this, ArmorItem.DISPENSER_BEHAVIOR);
        setNation(pNation);
        setNation(this.nation);
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
