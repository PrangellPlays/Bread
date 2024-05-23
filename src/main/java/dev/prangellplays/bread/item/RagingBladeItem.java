package dev.prangellplays.bread.item;

import dev.prangellplays.bread.registry.BreadEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;

import java.time.Duration;

public class RagingBladeItem extends SwordItem {
    public RagingBladeItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        int duration = 0;
        new StatusEffectInstance(BreadEffects.BLOODRUSH).getDuration() = duration;
        ServerWorld world = world;
        if (attacker.onKilledOther(world, target)) {
            if (attacker.hasStatusEffect(new StatusEffectInstance(BreadEffects.BLOODRUSH, duration, 0).getEffectType())) {
                attacker.addStatusEffect(new StatusEffectInstance(BreadEffects.BLOODRUSH, 14, 1));
            }
            else if (attacker.hasStatusEffect(new StatusEffectInstance(BreadEffects.BLOODRUSH, duration, 1).getEffectType())) {
                attacker.addStatusEffect(new StatusEffectInstance(BreadEffects.BLOODRUSH, 21, 2));
            }
            else if (attacker.hasStatusEffect(new StatusEffectInstance(BreadEffects.BLOODRUSH, duration, 2).getEffectType())) {
                attacker.addStatusEffect(new StatusEffectInstance(BreadEffects.BLOODRUSH, 30, 3));
            }
            else if (attacker.hasStatusEffect(new StatusEffectInstance(BreadEffects.BLOODRUSH, duration,3).getEffectType())) {
                attacker.addStatusEffect(new StatusEffectInstance(BreadEffects.BLOODRUSH, 40, 4));
            }
            else {
                attacker.addStatusEffect(new StatusEffectInstance(BreadEffects.BLOODRUSH, 7, 0));
            }
        }
        return super.postHit(stack, target, attacker);
    }
}
