package com.yiwp.batmanplusplus.block.itemblock;

import com.yiwp.batmanplusplus.lib.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ExtItemBlock extends ItemBlock {

	private static String pre = "tile";

	public ExtItemBlock(Block b, String prefix, String[] tex) {
		super(b);
		this.setHasSubtypes(true);
		pre = prefix;
	}
	
	public ExtItemBlock(Block b, String[] tex) {
		super(b);
		this.setHasSubtypes(true);
	}
	
	@Override
	public String getUnlocalizedName() {
		return String.format(pre + ".%s", Reference.MODID + ":");
	}
	
	@Override
	public int getMetadata(int meta) {
		return meta;
	}

}
