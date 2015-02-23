package com.yiwp.batmanplusplus.block.itemblock;

import mantle.blocks.abstracts.MultiItemBlock;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;

public class ExtItemBlock extends MultiItemBlock {
	
	private static String[] textureNames;

	public ExtItemBlock(Block b, String[] tex) {
		super(b, "tile", textureNames);
		this.setHasSubtypes(true);
        textureNames = tex;
	}
	
	public ExtItemBlock(Block b, String prefix, String[] tex) {
		super(b, prefix, textureNames);
		this.setHasSubtypes(true);
        textureNames = tex;
	}
			
	@Override
	public int getMetadata(int meta) {
		return meta;
	}

}
