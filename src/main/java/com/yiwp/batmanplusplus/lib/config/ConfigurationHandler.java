package com.yiwp.batmanplusplus.lib.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ConfigurationHandler {
	
	public static Configuration config;
	public static boolean configCastDeniers = false;
	public static boolean configAddMagicMetals = false;
	public static void init (File configFile)	{
		if (config == null) {
		
		//Create & Load Configuration Object from Given File
		config = new Configuration(configFile);
		loadConfiguration();
		}
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)		{
		if (event.modID.equalsIgnoreCase(Reference.MODID)) {
			loadConfiguration();
		}
	}
	
	private static void loadConfiguration()	{
		
		configCastDeniers = config.get(Names.Config.Catagory1, "Casting Millenaire Deniers", true, "Disables This Feature").getBoolean(true);
		configAddMagicMetals = config.get(Names.Config.Catagory1, "Adds Metals for TC4/BloodMagic/EE3", true, "Disables The Metals Entirely").getBoolean(true);
		
		
		if (config.hasChanged()) {
			config.save();
		}
	}

}
