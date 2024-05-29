package net.splintery.qwak;

import net.fabricmc.api.ModInitializer;

import net.splintery.qwak.block.ModBlocks;
import net.splintery.qwak.item.ModItemGroups;
import net.splintery.qwak.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Qwak implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static String MOD_ID = "qwak";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerModItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}