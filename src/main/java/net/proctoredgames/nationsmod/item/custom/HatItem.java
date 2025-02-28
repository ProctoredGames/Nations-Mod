package net.proctoredgames.nationsmod.item.custom;

import net.minecraft.block.AbstractBlock;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Equipment;
import net.minecraft.item.Item;

public class HatItem extends Item implements Equipment {

    public HatItem(Settings settings) {
        super(settings);
    }

    @Override
    public EquipmentSlot getSlotType() {
        return EquipmentSlot.HEAD;
    }
}
