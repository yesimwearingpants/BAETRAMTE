package com.yiwp.batmanplusplus.init;

import com.yiwp.batmanplusplus.block.BlockCactusSteel;
import com.yiwp.batmanplusplus.block.BlockPressBoard;
import com.yiwp.batmanplusplus.block.BlockTetsu;
import com.yiwp.batmanplusplus.block.BlockTiAl;
import com.yiwp.batmanplusplus.block.ExtBlock;
import com.yiwp.batmanplusplus.block.LuxBlock;
import com.yiwp.batmanplusplus.block.LuxOreBlock;
import com.yiwp.batmanplusplus.block.MetalBlock;
import com.yiwp.batmanplusplus.block.OreBlock;
import com.yiwp.batmanplusplus.block.itemblock.LuxItemBlock;
import com.yiwp.batmanplusplus.block.itemblock.LuxOreItemBlock;
import com.yiwp.batmanplusplus.block.itemblock.MetalItemBlock;
import com.yiwp.batmanplusplus.block.itemblock.OreItemBlock;
import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MODID)
public class BlockInit {
	
	
	public static ExtBlock BlockMetaMetal = new MetalBlock();
	public static ExtBlock BlockTetsu = new BlockTetsu(11.5f, 35.0f);
	public static ExtBlock BlockTitaniumAlumide = new BlockTiAl(7.5f, 25.0f);
	public static ExtBlock BlockCactusSteel = new BlockCactusSteel(0.1f, 0.1f);
	public static ExtBlock BlockPressBoard = new BlockPressBoard();
	public static ExtBlock BlockLux = new LuxBlock("clear", false);
	//public static ExtBlock PaneLux = new LuxPane("clear/pane", false);
	public static ExtBlock BlockOre = new OreBlock();
	public static ExtBlock BlockLuxOre = new LuxOreBlock();
	
	public static void preInit() {
		GameRegistry.registerBlock(BlockTetsu, Names.Textures.block(Names.Metal.tetsu));
		GameRegistry.registerBlock(BlockTitaniumAlumide, Names.Textures.block(Names.Metal.titaniumAlumide));
		GameRegistry.registerBlock(BlockCactusSteel, Names.Textures.block(Names.Metal.cactusSteel));
		GameRegistry.registerBlock(BlockPressBoard, Names.Textures.block(Names.Misc.board));
		GameRegistry.registerBlock(BlockLux, LuxItemBlock.class, "blockLux");
		//GameRegistry.registerBlock(PaneLux, "paneLux");
		GameRegistry.registerBlock(BlockLuxOre, LuxOreItemBlock.class, "oreLux");
		GameRegistry.registerBlock(BlockMetaMetal, MetalItemBlock.class, "blockMetal");
		GameRegistry.registerBlock(BlockOre, OreItemBlock.class, "blockOre");
	}

}
