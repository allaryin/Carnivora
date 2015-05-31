package org.mcupdater.carnivora;

import net.minecraft.item.ItemFood;

public enum FoodDefinition {
	MUTTON_RAW(		"muttonRaw",	64, 2, 0.6F, true, ConfigSettings.MUTTON,
			new String[]{"foodMuttonraw", "listAllmeatraw", "listAllmuttonraw"}),
	MUTTON_COOKED(	"muttonCooked",	64, 6, 1.6F, true, ConfigSettings.MUTTON,
			new String[]{"foodMuttoncooked", "listAllmeatcooked", "listAllmuttoncooked"}),
	SQUID_RAW(		"squidRaw",		64, 2, 0.2F, true, ConfigSettings.CALAMARI,
			new String[]{"foodCalamariraw", "listAllfishraw"}),
	SQUID_COOKED(	"squidCooked",	64, 5, 1.2F, true, ConfigSettings.CALAMARI,
			new String[]{"foodCalamaricooked", "listAllfishcooked"}),
	HORSE_RAW(		"horseRaw",		64, 3, 0.3F, true, ConfigSettings.HORSE_MEAT,
			new String[]{"foodHorseraw", "listAllmeatraw", "listAllhorseraw"}),
	HORSE_COOKED(	"horseCooked",	64, 8, 0.8F, true, ConfigSettings.HORSE_MEAT,
			new String[]{"foodHorsecooked", "listAllmeatcooked", "listAllhorsecooked"}),
	EGG_COOKED(		"eggCooked",	16, 4, 0.8F, true, ConfigSettings.BAKED_EGG,
			new String[]{"foodBakedegg"});
	
	public final String texture;
	public final int stackSize;
	public final int hunger;
	public final float saturation;
	public final boolean dogfood;
	
	public final ConfigSettings settings;
	public final String[] oreDict;
	
	public ItemFood item;
	
	private FoodDefinition(String texture, int stackSize, int hunger, float saturation, boolean dogfood, ConfigSettings settings, String[] oreDict) {
		this.texture = texture;
		this.stackSize = stackSize;
		this.hunger = hunger;
		this.saturation = saturation;
		this.dogfood = dogfood;
		this.settings = settings;
		this.oreDict = oreDict;
	}
}
