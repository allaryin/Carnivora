package org.mcupdater.carnivora;

import java.util.List;

import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

import com.google.common.collect.Lists;

public abstract class DropHandler {
	public static void init() {
		/// horses
		if( ConfigSettings.HORSE_LEATHER.enabled ) {
			final DropListener pigDropListener = new DropListener(0, 1, EntityHorse.class);
			List<Item> horseDrops = Lists.newArrayList(
						HideDefinition.HORSE.item
					);
			pigDropListener.setDrops(horseDrops);
			MinecraftForge.EVENT_BUS.register(pigDropListener);
		}
		if( ConfigSettings.HORSE_MEAT.enabled ) {
			final DropListener horseMeatDropListener = new DropListener(1, 3, EntityHorse.class);
			List<Item> horseRawDrops = Lists.newArrayList(
						(Item)FoodDefinition.HORSE_RAW.item
					);
			List<Item> horseCookedDrops = Lists.newArrayList(
						(Item)FoodDefinition.HORSE_COOKED.item
					);
			horseMeatDropListener.setDrops(horseRawDrops, horseCookedDrops);
			MinecraftForge.EVENT_BUS.register(horseMeatDropListener);
		}
		
		/// pigs
		if( ConfigSettings.PIG_LEATHER.enabled ) {
			final DropListener pigDropListener = new DropListener(0, 1, EntityPig.class);
			List<Item> pigDrops = Lists.newArrayList(
						HideDefinition.PIG.item
					);
			pigDropListener.setDrops(pigDrops);
			MinecraftForge.EVENT_BUS.register(pigDropListener);
		}
		
		/// sheep
		if( ConfigSettings.MUTTON.enabled ) {
			final DropListener sheepDropListener = new DropListener(1, 3, EntitySheep.class);
			List<Item> sheepRawDrops = Lists.newArrayList(
						(Item)FoodDefinition.MUTTON_RAW.item
					);
			List<Item> sheepCookedDrops = Lists.newArrayList(
						(Item)FoodDefinition.MUTTON_COOKED.item
					);
			sheepDropListener.setDrops(sheepRawDrops, sheepCookedDrops);
			MinecraftForge.EVENT_BUS.register(sheepDropListener);
		}
		
		/// squid
		if( ConfigSettings.CALAMARI.enabled ) {
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
		
		/// wolves
		if( ConfigSettings.WOLF_LEATHER.enabled ) {
			final DropListener wolfDropListener = new DropListener(0, 1, EntityWolf.class);
			List<Item> wolfDrops = Lists.newArrayList(
						HideDefinition.WOLF.item
					);
			wolfDropListener.setDrops(wolfDrops);
			MinecraftForge.EVENT_BUS.register(wolfDropListener);			
		}
	}	
		
}
