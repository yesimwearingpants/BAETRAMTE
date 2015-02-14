package com.yiwp.batmanplusplus.block.itemblock;
/* 
 * 
 * 	This Class Is a Part 
 * 	Tinkers Construct
 * 	all credit goes to them
 *  
 */
import java.util.List;

import com.yiwp.batmanplusplus.lib.reference.Names;

import mantle.blocks.abstracts.MultiItemBlock;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class MetalItemBlock extends MultiItemBlock {
	
	public static final String[] blockTypes = {  Names.adamantium, Names.darkIron, Names.meteoricIron, Names.molybdochalkos,
		Names.orichalcum, Names.titanium, Names.vibranium};

	public MetalItemBlock(Block b) {
		super(b, "StorageMetals", blockTypes);
		setMaxDamage(0);
		setHasSubtypes(true);
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add(StatCollector.translateToLocal("metalblock.tooltip"));
	}

}
