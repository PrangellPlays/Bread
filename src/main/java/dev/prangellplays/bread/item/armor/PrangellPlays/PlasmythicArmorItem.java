package dev.prangellplays.bread.item.armor.PrangellPlays;

import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PlasmythicArmorItem extends ArmorItem {
    public PlasmythicArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient() && entity instanceof PlayerEntity player) {
                if (!player.getAbilities().flying && !player.isOnGround()) startFlying(player);
            if (isWearingCorrectArmor(this.material, player)) {

                if (!player.hasStatusEffect(StatusEffects.CONDUIT_POWER)) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 20, 0, true, false, false));
                }
                if (!player.hasStatusEffect(StatusEffects.WATER_BREATHING)) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 20, 0, true, false, false));
                }
                if (!player.hasStatusEffect(StatusEffects.RESISTANCE)) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20, 0, true, false, false));
                }
                if (!player.hasStatusEffect(StatusEffects.REGENERATION)) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20, 0, true, false, false));
                }
                if (!player.hasStatusEffect(StatusEffects.SPEED)) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20, 1, true, false, false));
                }
                if (!player.hasStatusEffect(StatusEffects.NIGHT_VISION)) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 20, 0, true, false, false));
                }
                entity.fallDistance = 0;
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    public boolean isWearingCorrectArmor(ArmorMaterial material, PlayerEntity player) {
        for (ItemStack stack : player.getArmorItems()) {
            if (!(stack.getItem() instanceof ArmorItem armorItem) || armorItem.getMaterial() != material) {
                stopFlying(player);
                return false;
            }
        }
        //startFlying(player);
        return true;
    }

    private void startFlying(PlayerEntity player) {
        if (!player.isCreative() && !player.isSpectator() && !player.isOnGround()) {
            player.getAbilities().allowFlying = true;
            player.getAbilities().flying = false;
            player.sendAbilitiesUpdate();
        }
    }

    private void stopFlying(PlayerEntity player) {
        if (!player.isCreative() && !player.isSpectator()) {
            player.getAbilities().allowFlying = false;
            player.getAbilities().flying = false;
            player.sendAbilitiesUpdate();
        }
    }
}
