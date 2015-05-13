package org.mcupdater.carnivora;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public abstract class RecipeHandler {
	public static void init() {
		GameRegistry.addSmelting(Items.rotten_flesh, new ItemStack(Items.leather, 1), 1);
	}
}
