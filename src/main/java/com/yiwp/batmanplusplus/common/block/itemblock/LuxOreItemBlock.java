package com.yiwp.batmanplusplus.common.block.itemblock;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;

public class LuxOreItemBlock extends ExtItemBlock {

	static final String[] textureNames = new String[] {Names.Glass.lux, "Nether"+ Names.Glass.lux};
	
	public LuxOreItemBlock(Block b) {
		super(b, "ore", textureNames);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		int i = itemstack.getItemDamage();
		if (i < 0 || i >= textureNames.length) {
			i = 0;
		}
		return super.getUnlocalizedName() + textureNames[i];
	}
	
}