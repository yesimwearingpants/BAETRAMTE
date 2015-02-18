package com.yiwp.batmanplusplus.block.itemblock;

import java.util.List;

import com.yiwp.batmanplusplus.lib.reference.Names;

import mantle.blocks.abstracts.MultiItemBlock;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class MetalItemBlock extends ExtItemBlock {

	private static final String c = "block";	
	static final String[] metalTypes = new String[] { Names.adamantium.toLowerCase(), Names.meteoricIron.toLowerCase(),
		Names.molybdochalkos.toLowerCase(), Names.orichalcum.toLowerCase(), Names.titanium.toLowerCase(),
		Names.vibranium.toLowerCase()};

	public MetalItemBlock(Block b) {
		super(b, metalTypes);
	}	
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add(StatCollector.translateToLocal("metalblock.tooltip"));
	}

}
