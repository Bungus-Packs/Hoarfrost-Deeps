package net.akdrer.hoarfrostdeeps;

import net.akdrer.hoarfrostdeeps.block.ModBlocks;
import net.akdrer.hoarfrostdeeps.item.ModItemGroups;
import net.akdrer.hoarfrostdeeps.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HoarfrostDeeps implements ModInitializer {
	public static final String MOD_ID = "hoarfrost-deeps";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
	}
}