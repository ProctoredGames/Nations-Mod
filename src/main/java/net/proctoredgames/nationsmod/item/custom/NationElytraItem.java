package net.proctoredgames.nationsmod.item.custom;

import net.fabricmc.fabric.api.item.v1.EnchantingContext;
import net.minecraft.block.DispenserBlock;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
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
    public boolean isEnchantable(ItemStack stack) {
        return true; // Ensure it can be enchanted via anvil and commands
    }

    @Override
    public boolean canBeEnchantedWith(ItemStack stack, RegistryEntry<Enchantment> enchantment, EnchantingContext context) {
        return enchantment.matchesKey(Enchantments.UNBREAKING) || enchantment.matchesKey(Enchantments.MENDING)
                || enchantment.matchesKey(Enchantments.VANISHING_CURSE) || enchantment.matchesKey(Enchantments.BINDING_CURSE);
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
