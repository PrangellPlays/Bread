package dev.prangellplays.bread.registry;

import dev.prangellplays.bread.Bread;
import dev.prangellplays.bread.item.BreadToolMaterials;
import dev.prangellplays.bread.item.PlasmythicScytheItem;
import dev.prangellplays.bread.item.PotionBladeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class BreadItems {
    public static final Item PLASMYTHIC_SCYTHE = registerItem("plasmythic_scythe", new PlasmythicScytheItem(BreadToolMaterials.PLASMYTHIC, 12, -2.8f, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));
    public static final Item POTION_BLADE = registerItem("potion_blade", new PotionBladeItem(BreadToolMaterials.POTION, 12, -2.4f, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Bread.MOD_ID, name), item);
    }

    public static void init() {
        Bread.LOGGER.info("Registering Mod Items for " + Bread.MOD_ID);
    }
}
