package net.akdrer.hoarfrostdeeps.item;

import net.akdrer.hoarfrostdeeps.HoarfrostDeeps;
import net.akdrer.hoarfrostdeeps.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SUS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(HoarfrostDeeps.MOD_ID, "sus"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.sus"))
                    .icon(() -> new ItemStack(ModItems.AMOGUS)).entries((displayContext, entries) -> {
                        entries.add(ModItems.AMOGUS);

                        entries.add(ModBlocks.AMOGUS_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        HoarfrostDeeps.LOGGER.info("Registering Item Groups for " + HoarfrostDeeps.MOD_ID);
    }
}
