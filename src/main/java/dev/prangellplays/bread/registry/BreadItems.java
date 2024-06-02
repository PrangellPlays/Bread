package dev.prangellplays.bread.registry;

import dev.prangellplays.bread.Bread;
import dev.prangellplays.bread.item.armor.PotatoBoy24.PotatoBootsItem;
import dev.prangellplays.bread.item.armor.PotatoBoy24.PotatoChestplateItem;
import dev.prangellplays.bread.item.armor.PotatoBoy24.PotatoHelemtItem;
import dev.prangellplays.bread.item.armor.PotatoBoy24.PotatoLeggingsItem;
import dev.prangellplays.bread.item.armor.PrangellPlays.PlasmythicBootsItem;
import dev.prangellplays.bread.item.armor.PrangellPlays.PlasmythicChestplateItem;
import dev.prangellplays.bread.item.armor.PrangellPlays.PlasmythicHelemtItem;
import dev.prangellplays.bread.item.armor.PrangellPlays.PlasmythicLeggingsItem;
import dev.prangellplays.bread.item.item.*;
import dev.prangellplays.bread.item.util.BreadArmourMaterials;
import dev.prangellplays.bread.item.util.BreadToolMaterials;
import dev.prangellplays.bread.item.weapons.PotatoBoy24.PotatoBladeL1;
import dev.prangellplays.bread.item.weapons.PrangellPlays.PlasmythicLongswordItem;
import dev.prangellplays.bread.item.weapons.PrangellPlays.PlasmythicScytheItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class BreadItems {
    //PrangellPlays
    public static final Item PLASMYTHIC_SCYTHE = registerItem("plasmythic_scythe", new PlasmythicScytheItem(BreadToolMaterials.PLASMYTHIC, 12, -2.8f, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));
    public static final Item PLASMYTHIC_LONGSWORD = registerItem("plasmythic_longsword", new PlasmythicLongswordItem(BreadToolMaterials.PLASMYTHIC, 12, -2.4f, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));
    public static final Item PLASMYTHIC_HELMET = registerItem("plasmythic_helmet", new PlasmythicHelemtItem(BreadArmourMaterials.PLASMYTHIC, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item PLASMYTHIC_CHESTPLATE = registerItem("plasmythic_chestplate", new PlasmythicChestplateItem(BreadArmourMaterials.PLASMYTHIC, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item PLASMYTHIC_LEGGINGS = registerItem("plasmythic_leggings", new PlasmythicLeggingsItem(BreadArmourMaterials.PLASMYTHIC, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item PLASMYTHIC_BOOTS = registerItem("plasmythic_boots", new PlasmythicBootsItem(BreadArmourMaterials.PLASMYTHIC, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item BOTTLE_OF_PLASMA = registerItem("bottle_of_plasma", new BottleOfPlasmaItem(new FabricItemSettings().food(BreadFoodComponents.BOTTLE_OF_PLASMA).fireproof().maxCount(1).rarity(Rarity.EPIC)));

    //PotatoBoy24
    //public static final Item POTION_BLADE = registerItem("potion_blade", new PotionBladeItem(BreadToolMaterials.POTION, 12, -2.4f, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));
    public static final Item POTATO_BLADE_L1 = registerItem("potato_blade_l1", new PotatoBladeL1(BreadToolMaterials.POTATO, 8, -2.7f, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));
    public static final Item POTATO_HELMET = registerItem("potato_helmet", new PotatoHelemtItem(BreadArmourMaterials.POTATO, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item POTATO_CHESTPLATE = registerItem("potato_chestplate", new PotatoChestplateItem(BreadArmourMaterials.POTATO, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item POTATO_LEGGINGS = registerItem("potato_leggings", new PotatoLeggingsItem(BreadArmourMaterials.POTATO, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item POTATO_BOOTS = registerItem("potato_boots", new PotatoBootsItem(BreadArmourMaterials.POTATO, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item EVERLASTING_BREAD = registerItem("everlasting_bread", new EverlastingBreadItem(new FabricItemSettings().food(BreadFoodComponents.EVERLASTING_BREAD).fireproof().maxCount(1).rarity(Rarity.EPIC)));

    //Items
    public static final Item POTATO_CORE_FRAGMENT = registerItem("potato_core_fragment", new PotatoCoreFragmentItem(new FabricItemSettings().maxCount(8).fireproof()));
    public static final Item POTATO_CORE = registerItem("potato_core", new PotatoCoreItem(new FabricItemSettings().maxCount(1).fireproof()));
    public static final Item DRAGON_EGG_FRAGMENT = registerItem("dragon_egg_fragment", new DragonEggFragmentItem(new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));
    public static final Item HAMMER = registerItem("hammer", new HammerItem(BreadToolMaterials.HAMMER, new FabricItemSettings().fireproof().maxCount(1)));
    public static final Item UNLIMITED_BACON = registerItem("unlimited_bacon", new UnlimitedBaconItem(new FabricItemSettings().food(BreadFoodComponents.UNLIMITED_BACON).fireproof().maxCount(1).rarity(Rarity.EPIC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Bread.MOD_ID, name), item);
    }

    public static void init() {
        Bread.LOGGER.info("Registering Mod Items for " + Bread.MOD_ID);
    }
}
