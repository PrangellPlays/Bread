package dev.prangellplays.bread.effect.Armor;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class PlasmythicArmourStatusEffect extends StatusEffect {
    public PlasmythicArmourStatusEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }
    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {

    }


    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
