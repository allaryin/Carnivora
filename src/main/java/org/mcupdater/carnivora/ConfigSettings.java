package org.mcupdater.carnivora;

import java.util.Locale;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public enum ConfigSettings {
	MUTTON(true, "Sheep drop mutton."),
	CALAMARI(true, "Squid drop calamari."),
	BAKED_EGG(true, "Eggs may be cooked and eaten."),
	BAKED_CARROT(true, "Carrots may also be cooked before eating."),
	ZOMBIE_LEATHER(true, "Zombie meat may be cooked into leather."),
	PIG_LEATHER(true, "Pigs drop pigskin, which may be processed into normal leather."),
	HORSE_LEATHER(true, "Horses drop horse hide in addition to vanilla leather."),
	HORSE_MEAT(false, "Horses drop meat."),
	WOLF_LEATHER(true, "Wolves drop hides, which may be processed into normal leather."),
	SMOKER(false, "Enable the smoker.");
	
	public final boolean defaultValue;
	public boolean enabled;
	private final String comment;
	private ConfigSettings(boolean defaultValue, String comment) {
		this.enabled = this.defaultValue = defaultValue;
		this.comment = comment;
	}

	public void load(Configuration config) {
		Property prop = config.get(Configuration.CATEGORY_GENERAL, this.name().toLowerCase(Locale.ENGLISH), this.defaultValue);
		prop.comment = this.comment;
		this.enabled = prop.getBoolean();
	}

}
