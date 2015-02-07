package com.yiwp;

import com.yiwp.lib.config.ConfigurationHandler;
import com.yiwp.lib.reference.Reference;
import com.yiwp.proxy.IProxy;
import com.yiwp.recipes.Metals;
import com.yiwp.utils.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, guiFactory = Reference.GUIFACTORY)
public class TiCExtras
{
	
	@Mod.Instance(Reference.INSTANCE)
	public static TiCExtras instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
	public static IProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)	{
		
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		
		LogHelper.warn("##########Pre Initialization Complete##########");
		
	}
	
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)    {
    	
    	Metals.addRecipesForSmeltery();
    	Metals.addRecipesForTableCasting();
    	Metals.addRecipesForBasinCasting();
    	
    	LogHelper.warn("##########Initialization Complete##########");
    }
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)	{
    	
    	LogHelper.fatal("##########Post Initialization Complete##########");
    }
}
