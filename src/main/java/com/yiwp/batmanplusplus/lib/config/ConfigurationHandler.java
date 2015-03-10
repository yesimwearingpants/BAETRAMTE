package com.yiwp.batmanplusplus.lib.config;

import java.io.File;
import java.util.List;
import java.util.ListIterator;

import net.minecraftforge.common.config.Configuration;
import tconstruct.util.config.PHConstruct;

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
	public static boolean connectedTexturesMode;
	public static boolean oneStopConfig;
	public static boolean vibraniumgen;
	public static boolean titaniumgen;
	public static boolean poorore;
	public static boolean luxgen;
	public static boolean nluxgen;
	public static List<String> blocks;
	public static List<String> blockIn;
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
		
		configCastDeniers = config.get(Names.Config.Recipe, "Casting Millenaire Deniers", true, "Disables This Feature").getBoolean(true);
		configAddMagicMetals = config.get(Names.Config.Core, "Adds Metals for TC4/BloodMagic/EE3", true).getBoolean(true);
		configBiome0ID = config.get(Names.Config.Extras, "Biome ID's", 250).getInt();
		configBiome1ID = config.get(Names.Config.Extras, "Biome ID's", 251).getInt();
		configBiome2ID = config.get(Names.Config.Extras, "Biome ID's", 252).getInt();
		configBiome3ID = config.get(Names.Config.Extras, "Biome ID's", 253).getInt();
		oneStopConfig = config.get(Names.Config.Core, "Stops All 'OSCS' Settings From Toggling Other Mod Configs", false).getBoolean(false);
		titaniumgen = config.get(Names.Config.Generation, "Titanium World Gen", true).getBoolean(true);
		vibraniumgen = config.get(Names.Config.Generation, "Vibranium World Gen", true).getBoolean(true);
		connectedTexturesMode = config.get(Names.Config.OSCS, "Disables TCon Connected Textures As well as Mine", true).getBoolean(true);
		if(oneStopConfig == true){
			if(connectedTexturesMode == false) {
				PHConstruct.connectedTexturesMode = 0;
			}
		}
		
		if (config.hasChanged()) {
			config.save();
		}
	}
	
	public static boolean isWorldGenEnabled(boolean bool) {
		return bool;
	}
	
	private static void blocks(List<String> l1, List<Boolean> l2) {
		/*	if(!block) {
		 *		blocks.add("string.name"); 
		 *
		 *
		int i = 0;
		ListIterator<String> iter = l1.listIterator(i);
		while(iter.hasNext())
			if
		 *
		 */
	}

}
