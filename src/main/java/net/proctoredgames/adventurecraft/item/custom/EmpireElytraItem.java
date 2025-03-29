package net.proctoredgames.adventurecraft.item.custom;

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
import net.proctoredgames.adventurecraft.EmpireBased;

public class EmpireElytraItem extends ElytraItem implements EmpireBased {
    public int empire;

    public EmpireElytraItem(Settings settings, int pEmpire) {
        super(settings);
        DispenserBlock.registerBehavior(this, ArmorItem.DISPENSER_BEHAVIOR);
        setEmpire(pEmpire);
        setEmpire(this.empire);
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
    public void setEmpire(int key) {
        this.empire = key;
    }

    @Override
    public int getEmpire() {
        return this.empire;
    }
}
