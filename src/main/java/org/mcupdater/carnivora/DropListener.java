package org.mcupdater.carnivora;

import java.util.List;
import java.util.Random;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.IEventListener;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class DropListener {

	private static Random rand;
	
	protected final Class<?extends EntityLiving> mobClass;
	protected List<Item> rawDrops;
	protected List<Item> cookedDrops;
	
	protected int minDrops;
	protected int maxDrops;
	
	public DropListener(int min, int max, Class<?extends EntityLiving> mob) {
		this.minDrops = min;
		this.maxDrops = max;
		// NB: not bothering to validate that max >= min
		this.mobClass = mob;
	}
	
	public void setDrops(List<Item> raw, List<Item> cooked) {
		this.rawDrops = raw;
		this.cookedDrops = cooked;
	}
	
	public void setDrops(List<Item> drops) {
		this.rawDrops = this.cookedDrops = drops;
	}
	
	@SubscribeEvent
	public void invoke(LivingDropsEvent event) {
		// is this even the right kind of event?
		if( event == null || !(event instanceof LivingDropsEvent) ) return;
		
		// is the mob eligible to drop?
		final LivingDropsEvent dropEvent = (LivingDropsEvent)event;		
		if( dropEvent.entity == null || dropEvent.entityLiving.isChild()
				|| !mobClass.isInstance(dropEvent.entity) ) return;
		
		// determine which drop table to pull from
		final List<Item> drops = (dropEvent.entity.isBurning() ? cookedDrops : rawDrops);
		if( drops == null || drops.isEmpty() ) return;

		// get and save an RNG so we don't have to think about this any more
		if( rand == null ) {
			rand = dropEvent.entity.worldObj.rand;
			if( rand == null )
				rand = new Random();
		}
		
		/**
		 *  Actually perform the drops.
		 *  
		 *  Modeled partially after vanilla's method - get a number of items in
		 *  the appropriate range, add looting bonus if any, then drop them one
		 *  at a time.
		 *  
		 *  Because we potentially have a drop "table", we are iterating over
		 *  it from a random starting point. This gives us semi-random drops
		 *  without having to roll random every time.
		 */
		int numDrops = minDrops + rand.nextInt(1 + maxDrops - minDrops);
		if( dropEvent.lootingLevel > 0 ) {
			numDrops += rand.nextInt(1 + dropEvent.lootingLevel);
		}
		int offset = rand.nextInt(7);
		for( int k = 0; k < numDrops; ++k ) {
			final Item item = drops.get((offset + k) % drops.size());
			dropEvent.entityLiving.dropItem(item, 1);
		}
	}

}
