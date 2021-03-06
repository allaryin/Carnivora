package org.mcupdater.carnivora;

import net.minecraft.item.Item;

public enum HideDefinition {
	PIG(	"hidePig",	64, ConfigSettings.PIG_LEATHER,
			new String[]{"hidePig", "listAllhide"}),
	HORSE(	"hideHorse",64, ConfigSettings.HORSE_LEATHER,
			new String[]{"hideHorse", "listAllhide"}),
	WOLF(	"hideWolf",	64, ConfigSettings.WOLF_LEATHER,
			new String[]{"hideWolf", "listAllhide"});
	
	public final String texture;
	public final int stackSize;
	
	public final ConfigSettings settings;
	public final String[] oreDict;
	
	public Item item;
	
	private HideDefinition(String texture, int stackSize, ConfigSettings settings, String[] oreDict) {
		this.texture = texture;
		this.stackSize = stackSize;
		this.settings = settings;
		this.oreDict = oreDict;
	}
}
