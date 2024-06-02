package dev.prangellplays.bread.registry;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class BreadFoodComponents {
    public static final FoodComponent BOTTLE_OF_PLASMA = new FoodComponent.Builder().hunger(9).saturationModifier(1.3F).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 1, true, false, true), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 200, 1, true, false, true), 1.0F).build();
    public static final FoodComponent EVERLASTING_BREAD = new FoodComponent.Builder().hunger(9).saturationModifier(1.3F).snack().build();
    public static final FoodComponent UNLIMITED_BACON = new FoodComponent.Builder().hunger(9).saturationModifier(1.3F).meat().build();
}
