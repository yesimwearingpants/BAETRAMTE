package com.yiwp.batmanplusplus.block.itemblock;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ExtItemBlock extends ItemBlock {
	
	public String[] textureNames;

	public ExtItemBlock(Block b, String[] tex) {
		super(b);
		this.setHasSubtypes(true);
        textureNames = tex;
	}
	
	public ExtItemBlock(Block b, boolean bool) {
		super(b);
		this.setHasSubtypes(bool);
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		int i = itemstack.getItemDamage();
		if (i < 0 || i >= textureNames.length) {
			i = 0;
		}
		return super.getUnlocalizedName() + "." + textureNames[i];
	}
	
	@Override
	public int getMetadata(int meta) {
		return meta;
	}

}
