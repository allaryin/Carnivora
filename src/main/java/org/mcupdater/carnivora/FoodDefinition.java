package org.mcupdater.carnivora;

import net.minecraft.item.ItemFood;

public enum FoodDefinition {
	MUTTON_RAW(		"muttonRaw",	64, 2, 0.6F, true, ConfigSettings.MUTTON),
	MUTTON_COOKED(	"muttonCooked",	64, 6, 1.6F, true, ConfigSettings.MUTTON),
	SQUID_RAW(		"squidRaw",		64, 2, 0.2F, true, ConfigSettings.CALAMARI),
	SQUID_COOKED(	"squidCooked",	64, 5, 1.2F, true, ConfigSettings.CALAMARI),
	EGG_COOKED(		"eggCooked",	16, 4, 0.8F, true, ConfigSettings.BAKED_EGG);
	
	public final String texture;
	public final int stackSize;
	public final int hunger;
	public final float saturation;
	public final boolean dogfood;
	
	public final ConfigSettings settings;
	
	public ItemFood item;
	
	private FoodDefinition(String texture, int stackSize, int hunger, float saturation, boolean dogfood, ConfigSettings settings) {
		this.texture = texture;
		this.stackSize = stackSize;
		this.hunger = hunger;
		this.saturation = saturation;
		this.dogfood = dogfood;
		this.settings = settings;
	}
}
