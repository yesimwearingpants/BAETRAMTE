package com.yiwp.batmanplusplus.init;

import com.yiwp.batmanplusplus.common.block.*;
import com.yiwp.batmanplusplus.common.block.itemblock.LuxOreItemBlock;
import com.yiwp.batmanplusplus.common.block.itemblock.MetalItemBlock;
import com.yiwp.batmanplusplus.common.block.itemblock.OreItemBlock;
import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MODID)
public class BlockInit {
	
	public static ExtBlock BlockMetaMetal = new MetalBlock();
	public static ExtBlock BlockTetsu = new TetsuBlock(11.5f, 35.0f);
	public static ExtBlock BlockTitaniumAlumide = new TiAlBlock(7.5f, 25.0f);
	public static ExtBlock BlockCactusSteel = new CactusSteelBlock(0.1f, 0.1f);
	public static ExtBlock BlockPressBoard = new PressBoardBlock();
	public static ExtBlock BlockLux = new LuxBlock("lux", false);
	public static ExtBlock BlockXray = new XrayBlock();
	public static ExtBlock BloXXray = new XrayBlox("xray");
	//public static ExtBlock PaneLux = new LuxPane("clear/pane", false);
	public static ExtBlock BlockLight = new LightBlock();
	public static ExtBlock BlockOre = new OreBlock();
	public static ExtBlock BlockLuxOre = new LuxOreBlock();
	
	public static void preInit() {
		GameRegistry.registerBlock(BlockTetsu, Names.Textures.block(Names.Metal.tetsu));
		GameRegistry.registerBlock(BlockTitaniumAlumide, Names.Textures.block(Names.Metal.titaniumAlumide));
		GameRegistry.registerBlock(BlockCactusSteel, Names.Textures.block(Names.Metal.cactusSteel));
		GameRegistry.registerBlock(BlockPressBoard, Names.Textures.block(Names.Misc.board));
		GameRegistry.registerBlock(BlockLux, "blockLux");
		GameRegistry.registerBlock(BlockXray, "blockXray");
		GameRegistry.registerBlock(BloXXray, "bloxXray");
		//GameRegistry.registerBlock(PaneLux, "paneLux");
		GameRegistry.registerBlock(BlockLuxOre, LuxOreItemBlock.class, "oreLux");
		GameRegistry.registerBlock(BlockMetaMetal, MetalItemBlock.class, "blockMetal");
		GameRegistry.registerBlock(BlockOre, OreItemBlock.class, "blockOre");
	}

}
