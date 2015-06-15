package org.mcupdater.carnivora;

import net.minecraftforge.common.config.Configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Version.MOD_ID, name = Version.MOD_NAME, version = Version.VERSION, dependencies = "")
public class Carnivora {
	@Instance(Version.MOD_ID)
	public static Carnivora	instance;

	static final Logger		LOGGER	= LogManager.getFormatterLogger(Version.MOD_ID);

	static Configuration	Config;
	
	@SidedProxy(clientSide="org.mcupdater.carnivora.ClientProxy", serverSide="org.mcupdater.carnivora.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Config = new Configuration(event.getSuggestedConfigurationFile());
		
		for( ConfigSettings settings : ConfigSettings.values() ) {
			settings.load(Config);
		}
		
		Config.save();
		
		ItemHandler.init();
		BlockHandler.init();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		LOGGER.info("Loaded version %s", Version.VERSION);
		RecipeHandler.init();
		DropHandler.init();
		
		proxy.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
