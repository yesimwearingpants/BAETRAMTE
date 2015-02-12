package com.yiwp.batmanplusplus.block;

import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MODID)
public class BlockInit {
	
	
	public static MetalBlock BlockMolybdochalkas = new MetalBlock(3.1f, 9.0f, Names.molybdochalkos, Names.block(Names.molybdochalkos));
	public static MetalBlock BlockOrichalcum = new MetalBlock(3.5f, 9.9f, Names.orichalcum, Names.block(Names.orichalcum));
	public static MetalBlock BlockCactusSteel = new MetalBlock(0.1f, 0.1f, Names.cactusSteel, Names.block(Names.cactusSteel));
	public static MetalBlock BlockMeteoricIron = new MetalBlock(11.0f, 35.0f, Names.meteoricIron, Names.block(Names.meteoricIron));
	public static MetalBlock BlockTetsu = new MetalBlock(11.5f, 35.0f, Names.tetsu, Names.block(Names.tetsu));
	public static MetalBlock BlockTitanium  = new MetalBlock(10.0f, 30.0f, Names.titanium, Names.block(Names.titanium));
	public static MetalBlock BlockVibranium = new MetalBlock(20.f, 40.0f, Names.vibranium, Names.block(Names.vibranium));
	public static MetalBlock BlockAdamantium = new MetalBlock(16.0f, 50.0f, Names.adamantium, Names.block(Names.adamantium));
	public static MetalBlock BlockTitaniumAlumide = new MetalBlock(7.5f, 25.0f, Names.titaniumAlumide, Names.block(Names.titaniumAlumide));
	
	
	
	public static void preInit() {
		GameRegistry.registerBlock(BlockAdamantium, Names.block(Names.adamantium));
		GameRegistry.registerBlock(BlockCactusSteel, Names.block(Names.cactusSteel));
		GameRegistry.registerBlock(BlockMeteoricIron, Names.block(Names.meteoricIron));
		GameRegistry.registerBlock(BlockMolybdochalkas, Names.block(Names.molybdochalkos));
		GameRegistry.registerBlock(BlockOrichalcum, Names.block(Names.orichalcum));
		GameRegistry.registerBlock(BlockTetsu, Names.block(Names.tetsu));
		GameRegistry.registerBlock(BlockTitanium, Names.block(Names.titanium));
		GameRegistry.registerBlock(BlockTitaniumAlumide, Names.block(Names.titaniumAlumide));
		GameRegistry.registerBlock(BlockVibranium, Names.block(Names.vibranium));
	}

}
