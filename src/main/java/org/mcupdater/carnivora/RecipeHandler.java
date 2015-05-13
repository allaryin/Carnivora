package org.mcupdater.carnivora;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public abstract class RecipeHandler {
	public static void init() {
		addSmelteryRecipe(Items.rotten_flesh, Items.leather);
		
		addSmelteryRecipe(Items.egg, FoodDefinition.EGG_COOKED.item);
		addSmelteryRecipe(FoodDefinition.MUTTON_RAW.item, FoodDefinition.MUTTON_COOKED.item);
		addSmelteryRecipe(FoodDefinition.SQUID_RAW.item, FoodDefinition.SQUID_COOKED.item);
	}
	
	public static void addSmelteryRecipe(Item source, Item dest) {
		GameRegistry.addSmelting(source, new ItemStack(dest, 1), 0.38f);
	}
}