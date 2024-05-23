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
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.items")).icon(() -> new ItemStack(BreadItems.PLASMYTHIC_SCYTHE)).entries((displayContext, entries) -> {
                entries.add(BreadItems.PLASMYTHIC_SCYTHE);
                entries.add(BreadItems.POTION_BLADE);
            }).build());


    public static void init() {
        Bread.LOGGER.info("Registering Item Groups for " + Bread.MOD_ID);
    }
}