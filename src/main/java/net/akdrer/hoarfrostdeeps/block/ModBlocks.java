package net.akdrer.hoarfrostdeeps.block;

import net.akdrer.hoarfrostdeeps.HoarfrostDeeps;
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

public class ModBlocks {
    public static final Block AMOGUS_BLOCK = registerBlock("amogus_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));


    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(HoarfrostDeeps.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(HoarfrostDeeps.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        HoarfrostDeeps.LOGGER.info("Registering blocks for " + HoarfrostDeeps.MOD_ID);
    }
}
