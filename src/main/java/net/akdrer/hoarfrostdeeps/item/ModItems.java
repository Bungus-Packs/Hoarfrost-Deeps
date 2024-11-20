package net.akdrer.hoarfrostdeeps.item;

import net.akdrer.hoarfrostdeeps.HoarfrostDeeps;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item AMOGUS = registerItem("amogus", new Item(new Item.Settings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(AMOGUS);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(HoarfrostDeeps.MOD_ID, name), item);
    }

    public static void registerModItems() {
        HoarfrostDeeps.LOGGER.info("Registering items for " + HoarfrostDeeps.MOD_ID);
    }
}
