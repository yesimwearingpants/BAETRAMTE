package com.yiwp.batmanplusplus.lib.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ConfigurationHandler {
	
	public static Configuration config;
	public static boolean configCastDeniers = false;
	public static boolean configAddMagicMetals = false;
	public static int configBiome0ID;
	public static int configBiome1ID;
	public static int configBiome2ID;
	public static int configBiome3ID;
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
		configBiome0ID = config.get(Names.Config.Catagory3, "Biome ID's", 250).getInt();
		configBiome1ID = config.get(Names.Config.Catagory3, "Biome ID's", 251).getInt();
		configBiome2ID = config.get(Names.Config.Catagory3, "Biome ID's", 252).getInt();
		configBiome3ID = config.get(Names.Config.Catagory3, "Biome ID's", 253).getInt();
		
		if (config.hasChanged()) {
			config.save();
		}
	}

}
