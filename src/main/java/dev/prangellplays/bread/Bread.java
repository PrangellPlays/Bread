package dev.prangellplays.bread;

import dev.prangellplays.bread.recipes.PotionPlasmythicScytheRecipe;
import dev.prangellplays.bread.registry.BreadBlocks;
import dev.prangellplays.bread.registry.BreadEffects;
import dev.prangellplays.bread.registry.BreadItemGroups;
import dev.prangellplays.bread.registry.BreadItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.recipe.SpecialRecipeSerializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("unused")
public class Bread implements ModInitializer {
	public static final String MOD_ID = "bread";
	public static final Logger LOGGER = LoggerFactory.getLogger("bread");

	public static SpecialRecipeSerializer<PotionPlasmythicScytheRecipe> POTION_PLASMYTHIC_SCYTHE;

	@Override
	public void onInitialize() {
		BreadItems.init();
		BreadItemGroups.init();
		BreadEffects.init();
		BreadBlocks.init();

		POTION_PLASMYTHIC_SCYTHE = Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(MOD_ID, "potion_plasmythic_scythe"), new SpecialRecipeSerializer<>(PotionPlasmythicScytheRecipe::new));
	}
	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}