package dev.prangellplays.bread.item.util;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum BreadToolMaterials implements ToolMaterial {
    PLASMYTHIC(5, 0, 6.5f, 0, 26,() -> Ingredient.ofItems(Items.AIR)),
    POTATO(5, 0, 6.5f, 0, 26,() -> Ingredient.ofItems(Items.AIR)),
    HAMMER(5,750,0.5f,0,2,() -> Ingredient.ofItems(Items.AIR)),
    POTION(5, 0, 10.5f, 0, 26,() -> Ingredient.ofItems(Items.AIR));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    BreadToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
