package org.mcupdater.carnivora;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.config.Configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

@Mod(modid = Version.MOD_ID, name = Version.MOD_NAME, version = Version.VERSION, dependencies = "")
public class Carnivora {
	@Instance(Version.MOD_ID)
	public static Carnivora	instance;

	static final Logger		LOGGER	= LogManager.getFormatterLogger(Version.MOD_ID);

	static File				BaseDir;
	static Configuration	Config;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		BaseDir = new File(event.getModConfigurationDirectory(), Version.MOD_ID);
		Config = new Configuration(event.getSuggestedConfigurationFile());

		if (!BaseDir.exists())
			BaseDir.mkdir();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		LOGGER.info("Loaded version %s", Version.VERSION);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
