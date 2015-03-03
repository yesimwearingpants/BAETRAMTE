package com.yiwp.batmanplusplus;

import com.yiwp.batmanplusplus.init.BiomeInit;
import com.yiwp.batmanplusplus.init.BlockInit;
import com.yiwp.batmanplusplus.init.FluidInit;
import com.yiwp.batmanplusplus.init.ItemInit;
import com.yiwp.batmanplusplus.init.WorldInit;
import com.yiwp.batmanplusplus.lib.config.ConfigurationHandler;
import com.yiwp.batmanplusplus.lib.reference.Reference;
import com.yiwp.batmanplusplus.lib.utils.LogHelper;
import com.yiwp.batmanplusplus.proxy.IProxy;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, guiFactory = Reference.GUIFACTORY, dependencies = Reference.DEPENDENCIES)
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
		//BiomeInit.preInit();
		WorldInit.preInit();
		LogHelper.info("##########Pre Initialization Complete##########");
		
	}
	
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)    {
    	    	
    	LogHelper.info("##########Initialization Complete##########");
    }
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)	{
    	
    	LogHelper.info("##########Post Initialization Complete##########");
    }
}
