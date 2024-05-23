package dev.prangellplays.bread.registry;

import dev.prangellplays.bread.Bread;
import dev.prangellplays.bread.effect.bloodrush.*;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.DamageModifierStatusEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BreadEffects {

    public static StatusEffect BLOODRUSH;

    public static StatusEffect registerBloodrushEffect(String name){ return Registry.register(Registries.STATUS_EFFECT, new Identifier(Bread.MOD_ID, name), (new BloodrushStatusEffect(StatusEffectCategory.BENEFICIAL, 13500416, 4.0)).addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE, "7cd4a1f4-61ba-4dba-a569-08fb9be88f94", 0.0,EntityAttributeModifier.Operation.ADDITION));};

    public static void init(){
        BLOODRUSH = registerBloodrushEffect("bloodrush");
    }
}
