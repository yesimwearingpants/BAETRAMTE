package com.yiwp.batmanplusplus.init;

import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;

import com.yiwp.batmanplusplus.common.worldgen.lux.LuxGenerator;
import com.yiwp.batmanplusplus.common.worldgen.lux.LuxWorldGen;
import com.yiwp.batmanplusplus.common.worldgen.lux.NLuxGenerator;
import com.yiwp.batmanplusplus.lib.config.ConfigurationHandler;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldInit {
	
	public static int preInit() {
		
		if (ConfigurationHandler.isWorldGenEnabled(ConfigurationHandler.luxgen))
            MinecraftForge.ORE_GEN_BUS.register(new LuxGenerator());
		if (ConfigurationHandler.isWorldGenEnabled(ConfigurationHandler.nluxgen))
            MinecraftForge.ORE_GEN_BUS.register(new NLuxGenerator());
		return 1;
	}
}