package org.mcupdater.carnivora;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;

import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

public abstract class DropHandler {
	public static void init() {
		/// pigs
		final DropListener pigDropListener = new DropListener(0, 1, EntityPig.class);
		List<Item> pigDrops = Lists.newArrayList(
					HideDefinition.PIG.item
				);
		pigDropListener.setDrops(pigDrops);
		MinecraftForge.EVENT_BUS.register(pigDropListener);
		
		/// sheep
		final DropListener sheepDropListener = new DropListener(1, 3, EntitySheep.class);
		List<Item> sheepRawDrops = Lists.newArrayList(
					(Item)FoodDefinition.MUTTON_RAW.item
				);
		List<Item> sheepCookedDrops = Lists.newArrayList(
					(Item)FoodDefinition.MUTTON_COOKED.item
				);
		sheepDropListener.setDrops(sheepRawDrops, sheepCookedDrops);
		MinecraftForge.EVENT_BUS.register(sheepDropListener);

		/// squid
		final DropListener squidDropListener = new DropListener(0, 2, EntitySquid.class);			
		List<Item> squidRawDrops = Lists.newArrayList(
					(Item)FoodDefinition.SQUID_RAW.item
				);
		List<Item> squidCookedDrops = Lists.newArrayList(
					(Item)FoodDefinition.SQUID_COOKED.item
				);
		squidDropListener.setDrops(squidRawDrops, squidCookedDrops);
		MinecraftForge.EVENT_BUS.register(squidDropListener);
	}	
		
}
