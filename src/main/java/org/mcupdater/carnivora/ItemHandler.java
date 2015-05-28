package org.mcupdater.carnivora;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.oredict.OreDictionary;

public abstract class ItemHandler {
	public static void init() {
		initFoods();
		initHides();
	}
	
	private static void initFoods() {
		for( FoodDefinition def : FoodDefinition.values() ) {
			if( !def.settings.enabled ) continue;
			final ItemFood item = new ItemFood(def.hunger, def.saturation, def.dogfood);
			item.setMaxStackSize(def.stackSize);
			item.setTextureName(Version.TEXTURE_PREFIX + def.texture);
			item.setUnlocalizedName(Version.MOD_ID.toLowerCase() + "." + def.texture);
			item.setCreativeTab(CreativeTabs.tabFood);
			
			// save the reference :)
			def.item = item;
			GameRegistry.registerItem(item, def.texture);
			for( String oreName : def.oreDict ) {
				OreDictionary.registerOre(oreName, item);
			}
		}
	}
	
	private static void initHides() {
		for( HideDefinition def : HideDefinition.values() ) {
			if( !def.settings.enabled ) continue;
			
			final Item item = new Item();
			item.setMaxStackSize(def.stackSize);
			item.setTextureName(Version.TEXTURE_PREFIX + def.texture);
			item.setUnlocalizedName(Version.MOD_ID.toLowerCase() + "." + def.texture);
			item.setCreativeTab(Items.leather.getCreativeTab());
			
			// save the reference :)
			def.item = item;
			GameRegistry.registerItem(item, def.texture);
			for( String oreName : def.oreDict ) {
				OreDictionary.registerOre(oreName, item);
			}
		}
	}
}
