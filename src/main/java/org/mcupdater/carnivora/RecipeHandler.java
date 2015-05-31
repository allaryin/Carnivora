package org.mcupdater.carnivora;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public abstract class RecipeHandler {
	public static void init() {
		if( ConfigSettings.ZOMBIE_LEATHER.enabled )
			addSmelteryRecipe(Items.rotten_flesh, Items.leather);
		
		if( ConfigSettings.BAKED_EGG.enabled )
			addSmelteryRecipe(Items.egg, FoodDefinition.EGG_COOKED.item);
		if( ConfigSettings.HORSE_MEAT.enabled )
			addSmelteryRecipe(FoodDefinition.HORSE_RAW.item, FoodDefinition.HORSE_COOKED.item);
		if( ConfigSettings.MUTTON.enabled )
			addSmelteryRecipe(FoodDefinition.MUTTON_RAW.item, FoodDefinition.MUTTON_COOKED.item);
		if( ConfigSettings.CALAMARI.enabled )
			addSmelteryRecipe(FoodDefinition.SQUID_RAW.item, FoodDefinition.SQUID_COOKED.item);
		
		if( ConfigSettings.HORSE_LEATHER.enabled ) {
			final ItemStack horsehide = new ItemStack(HideDefinition.HORSE.item);
			addShapelessRecipe(Items.leather, horsehide, horsehide);
		}
		if( ConfigSettings.PIG_LEATHER.enabled ) {
			final ItemStack pigskin = new ItemStack(HideDefinition.PIG.item);
			addShapelessRecipe(Items.leather, pigskin, pigskin);
		}
		if( ConfigSettings.WOLF_LEATHER.enabled ) {
			final ItemStack wolfhide = new ItemStack(HideDefinition.WOLF.item);
			addShapelessRecipe(Items.leather, wolfhide, wolfhide);
		}
	}
	
	public static void addSmelteryRecipe(Item source, Item dest) {
		GameRegistry.addSmelting(source, new ItemStack(dest, 1), 0.38f);
	}
			
	public static void addShapelessRecipe(Item dest, Object... recipe) {
		GameRegistry.addShapelessRecipe(new ItemStack(dest, 1), recipe);
	}
}
