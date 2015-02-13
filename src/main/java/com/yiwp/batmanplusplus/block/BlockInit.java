package com.yiwp.batmanplusplus.block;

import net.minecraft.block.Block;

import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MODID)
public class BlockInit {
	
	
	public static ExtBlock BlockMolybdochalkas = new MetalBlock();
	public static ExtBlock BlockOrichalcum = new MetalBlock();
	public static ExtBlock BlockMeteoricIron = new MetalBlock();
	public static ExtBlock BlockTitanium  = new MetalBlock();
	public static ExtBlock BlockVibranium = new MetalBlock();
	public static ExtBlock BlockAdamantium = new MetalBlock();
	public static ExtBlock BlockTetsu = new BlockTetsu(11.5f, 35.0f);
	public static ExtBlock BlockTitaniumAlumide = new BlockTiAl(7.5f, 25.0f);
		
	
	public static void preInit() {
		GameRegistry.registerBlock(BlockAdamantium, Names.Textures.block(Names.adamantium));
		GameRegistry.registerBlock(BlockMeteoricIron, Names.Textures.block(Names.meteoricIron));
		GameRegistry.registerBlock(BlockMolybdochalkas, Names.Textures.block(Names.molybdochalkos));
		GameRegistry.registerBlock(BlockOrichalcum, Names.Textures.block(Names.orichalcum));
		GameRegistry.registerBlock(BlockTetsu, Names.Textures.block(Names.tetsu));
		GameRegistry.registerBlock(BlockTitanium, Names.Textures.block(Names.titanium));
		GameRegistry.registerBlock(BlockTitaniumAlumide, Names.Textures.block(Names.titaniumAlumide));
		GameRegistry.registerBlock(BlockVibranium, Names.Textures.block(Names.vibranium));
	}

}
