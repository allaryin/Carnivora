package org.mcupdater.carnivora;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public abstract class ItemHandler {
	public static void init() {
		for( FoodDefinition def : FoodDefinition.values() ) {
			final ItemFood item = new ItemFood(def.hunger, def.saturation, def.dogfood);
			item.setMaxStackSize(def.stackSize);
			item.setTextureName(def.texture);
			item.setUnlocalizedName(Version.TEXTURE_PREFIX + "." + def.texture);
			item.setCreativeTab(CreativeTabs.tabFood);
			
			// save the reference :)
			def.item = item;
			GameRegistry.registerItem(item, def.texture);
		}
	}
}
