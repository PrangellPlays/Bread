package dev.prangellplays.bread.item.armor.PotatoBoy24;

import dev.prangellplays.bread.registry.BreadEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PotatoArmorItem extends ArmorItem {
    public PotatoArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient() && entity instanceof PlayerEntity player) {
            if (isWearingCorrectArmor(this.material, player)) {

                if (!player.hasStatusEffect(StatusEffects.RESISTANCE)) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20, 0, true, false, false));
                }
                if (!player.hasStatusEffect(StatusEffects.REGENERATION)) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20, 0, true, false, false));
                }
                if (!player.hasStatusEffect(StatusEffects.SPEED)) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20, 1, true, false, false));
                }
                if (!player.hasStatusEffect(BreadEffects.POTATO_ARMOUR)) {
                    player.addStatusEffect(new StatusEffectInstance(BreadEffects.POTATO_ARMOUR, 20, 0, true, false, false));
                }
                if (!player.hasStatusEffect(StatusEffects.HERO_OF_THE_VILLAGE)) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 20, 0, true, false, false));
                }
                if (!player.hasStatusEffect(StatusEffects.LUCK)) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 20, 4, true, false, false));
                }
                if (!player.hasStatusEffect(StatusEffects.STRENGTH)) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20, 1, true, false, false));
                }
                if (!player.hasStatusEffect(StatusEffects.HASTE)) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 20, 1, true, false, false));
                }
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    public boolean isWearingCorrectArmor(ArmorMaterial material, PlayerEntity player) {
        for (ItemStack stack : player.getArmorItems()) {
            if (!(stack.getItem() instanceof ArmorItem armorItem) || armorItem.getMaterial() != material) {
                return false;
            }
        }
        return true;
    }
}
