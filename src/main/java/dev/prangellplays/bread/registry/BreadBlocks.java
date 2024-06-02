package dev.prangellplays.bread.registry;

import dev.prangellplays.bread.Bread;
import dev.prangellplays.bread.block.PlasmaOreBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class BreadBlocks {
    public static final Block PLASMA_ORE = registerBlock("plasma_ore", new PlasmaOreBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).strength(4.0f).requiresTool().dropsNothing().hardness(-1f).luminance(state -> 2).sounds(BlockSoundGroup.STONE)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Bread.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(Bread.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }

    public static void init() {
        Bread.LOGGER.info("Registering ModBlocks for " + Bread.MOD_ID);
    }
}
