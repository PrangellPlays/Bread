package dev.prangellplays.bread.recipes;

import dev.prangellplays.bread.Bread;
import dev.prangellplays.bread.registry.BreadItems;
import net.minecraft.inventory.RecipeInputInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionUtil;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SpecialCraftingRecipe;
import net.minecraft.recipe.book.CraftingRecipeCategory;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class PotionPlasmythicScytheRecipe extends SpecialCraftingRecipe {
    public PotionPlasmythicScytheRecipe(Identifier id, CraftingRecipeCategory category) {
        super(id, category);
    }

    @Override
    public boolean matches(RecipeInputInventory inventory, World world) {
        boolean hasScythe = false;
        boolean hasPotion = false;

        for(ItemStack stack : inventory.getInputStacks()) {
            if(stack.isOf(BreadItems.PLASMYTHIC_SCYTHE)) {
                if(hasScythe)
                    return false;

                hasScythe = true;
            }
            if(stack.isOf(Items.POTION)) {
                Potion potion = PotionUtil.getPotion(stack);

                if(hasPotion || potion == Potions.EMPTY || potion.hasInstantEffect())
                    return false;

                hasPotion = true;
            }
        }

        return hasScythe && hasPotion;
    }

    @Override
    public ItemStack craft(RecipeInputInventory inventory, DynamicRegistryManager registryManager) {
        Potion potion = Potions.EMPTY;
        ItemStack plasmythicScythe = ItemStack.EMPTY;

        for(ItemStack stack : inventory.getInputStacks()) {
            if(stack.isOf(BreadItems.PLASMYTHIC_SCYTHE))
                plasmythicScythe = stack.copy();
            if(stack.isOf(Items.POTION))
                potion = PotionUtil.getPotion(stack);
        }

        return potion != Potions.EMPTY && !plasmythicScythe.isEmpty() ? PotionUtil.setPotion(plasmythicScythe, potion) : ItemStack.EMPTY;
    }

    @Override
    public boolean fits(int width, int height) {
        return width * height >= 2;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Bread.POTION_PLASMYTHIC_SCYTHE;
    }
}