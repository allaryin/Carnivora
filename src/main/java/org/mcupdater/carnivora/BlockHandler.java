package org.mcupdater.carnivora;

import org.mcupdater.carnivora.machines.BlockSmoker;

import cpw.mods.fml.common.registry.GameRegistry;

public abstract class BlockHandler {
	public static void init() {
		initMachines();
	}
	
	private static void initMachines() {
		if( ConfigSettings.SMOKER.enabled ) {
			BlockSmoker smoker = new BlockSmoker();
			GameRegistry.registerBlock(smoker, "smoker");
		}
	}
}
