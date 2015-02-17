package com.yiwp.batmanplusplus;

import com.yiwp.batmanplusplus.init.BlockInit;
import com.yiwp.batmanplusplus.init.BotaniaRecipesInit;
import com.yiwp.batmanplusplus.init.FluidInit;
import com.yiwp.batmanplusplus.init.ItemInit;
import com.yiwp.batmanplusplus.lib.config.ConfigurationHandler;
import com.yiwp.batmanplusplus.lib.reference.Reference;
import com.yiwp.batmanplusplus.lib.utils.LogHelper;
import com.yiwp.batmanplusplus.proxy.IProxy;
import com.yiwp.batmanplusplus.recipes.Metals;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, guiFactory = Reference.GUIFACTORY)
public class BatmanPlusPlus
{
	
	@Mod.Instance(Reference.INSTANCE)
	public static BatmanPlusPlus instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)	{
		
		
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		BlockInit.preInit();
		ItemInit.preInit();
		//FluidInit.preInit();
		LogHelper.warn("##########Pre Initialization Complete##########");
		
	}
	
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)    {
    	
    	Metals.addRecipesForSmeltery();
    	Metals.addRecipesForTableCasting();
    	Metals.addRecipesForBasinCasting();
    	BotaniaRecipesInit.init();
    	
    	LogHelper.warn("##########Initialization Complete##########");
    }
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)	{
    	
    	LogHelper.fatal("##########Post Initialization Complete##########");
    }
}
