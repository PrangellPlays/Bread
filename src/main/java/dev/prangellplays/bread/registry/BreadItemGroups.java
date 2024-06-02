package dev.prangellplays.bread.registry;

import dev.prangellplays.bread.Bread;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BreadItemGroups {
    public static final ItemGroup BREAD_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Bread.MOD_ID, "items"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.items")).icon(() -> new ItemStack(BreadItems.EVERLASTING_BREAD)).entries((displayContext, entries) -> {
                //PrangellPlays
                entries.add(BreadItems.PLASMYTHIC_SCYTHE);
                entries.add(BreadItems.PLASMYTHIC_LONGSWORD);
                entries.add(BreadItems.PLASMYTHIC_HELMET);
                entries.add(BreadItems.PLASMYTHIC_CHESTPLATE);
                entries.add(BreadItems.PLASMYTHIC_LEGGINGS);
                entries.add(BreadItems.PLASMYTHIC_BOOTS);
                entries.add(BreadItems.BOTTLE_OF_PLASMA);

                //PotatoBoy24
                //entries.add(BreadItems.POTION_BLADE);
                entries.add(BreadItems.POTATO_BLADE_L1);
                entries.add(BreadItems.POTATO_HELMET);
                entries.add(BreadItems.POTATO_CHESTPLATE);
                entries.add(BreadItems.POTATO_LEGGINGS);
                entries.add(BreadItems.POTATO_BOOTS);
                entries.add(BreadItems.EVERLASTING_BREAD);

                //Items
                entries.add(BreadItems.POTATO_CORE_FRAGMENT);
                entries.add(BreadItems.POTATO_CORE);
                entries.add(BreadItems.DRAGON_EGG_FRAGMENT);
                entries.add(BreadItems.HAMMER);
                entries.add(BreadItems.UNLIMITED_BACON);
            }).build());

    public static final ItemGroup BREAD_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Bread.MOD_ID, "blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.blocks")).icon(() -> new ItemStack(BreadBlocks.PLASMA_ORE)).entries((displayContext, entries) -> {
                entries.add(BreadBlocks.PLASMA_ORE);
            }).build());


    public static void init() {
        Bread.LOGGER.info("Registering Item Groups for " + Bread.MOD_ID);
    }
}