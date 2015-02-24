package com.yiwp.batmanplusplus.block.itemblock;

import java.util.List;

import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;

import mantle.blocks.abstracts.MultiItemBlock;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class MetalItemBlock extends ExtItemBlock {

	private static final String[] metalTypes = new String[] { Names.Metal.adamantium, Names.Metal.meteoricIron,
	Names.Metal.molybdochalkos,	Names.Metal.orichalcum, Names.Metal.titanium, Names.Metal.vibranium, Names.Metal.slag};
	private static String pre = "tile";

	public MetalItemBlock(Block b) {
		super(b, metalTypes);
	}	
	
	@Override
	public String getUnlocalizedName() {
		return String.format(pre + ".%s", Reference.MODID + ":");
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		int i = itemstack.getItemDamage();
		if (i < 0 || i >= metalTypes.length) {
			i = 0;
		}
		return super.getUnlocalizedName() + metalTypes[i];
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add(StatCollector.translateToLocal("metalblock.tooltip"));
	}

}
