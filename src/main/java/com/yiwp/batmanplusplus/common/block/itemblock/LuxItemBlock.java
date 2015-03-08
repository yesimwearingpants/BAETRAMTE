package com.yiwp.batmanplusplus.common.block.itemblock;

import java.util.List;

import com.yiwp.batmanplusplus.lib.reference.Names;

import mantle.blocks.abstracts.MultiItemBlock;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class LuxItemBlock extends ExtItemBlock{

	private final static String[] textureNames = new String[] {Names.Glass.lux + "Lamp", Names.Glass.lux + "X-Ray"};
	
	public LuxItemBlock(Block b) {
		super(b, "glass", textureNames);
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