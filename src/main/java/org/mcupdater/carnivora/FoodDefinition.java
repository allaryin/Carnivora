package org.mcupdater.carnivora;

import net.minecraft.item.ItemFood;

public enum FoodDefinition {
	MUTTON_RAW(		"muttonRaw",	64, 2, 0.6F, true),
	MUTTON_COOKED(	"muttonCooked",	64, 6, 1.6F, true),
	SQUID_RAW(		"squidRaw",		64, 2, 0.2F, true),
	SQUID_COOKED(	"squidCooked",	64, 5, 1.2F, true),
	EGG_COOKED(		"eggCooked",	16, 4, 0.8F, true);
	
	public final String texture;
	public final int stackSize;
	public final int hunger;
	public final float saturation;
	public final boolean dogfood;
	
	public ItemFood item;
	
	private FoodDefinition(String texture, int stackSize, int hunger, float saturation, boolean dogfood) {
		this.texture = texture;
		this.stackSize = stackSize;
		this.hunger = hunger;
		this.saturation = saturation;
		this.dogfood = dogfood;
	}
}
