package com.yiwp.batmanplusplus.block.itemblock.fluid;

import com.yiwp.batmanplusplus.block.itemblock.ExtItemBlock;
import com.yiwp.batmanplusplus.lib.reference.Names;

import net.minecraft.block.Block;

public class FluidItemBlock extends ExtItemBlock{
	
	static final String[] metalTypes = new String[] { Names.adamantium.toLowerCase(), Names.meteoricIron.toLowerCase(),
		Names.molybdochalkos.toLowerCase(), Names.orichalcum.toLowerCase(), Names.titanium.toLowerCase(),
		Names.vibranium.toLowerCase()};

	public FluidItemBlock(Block b) {
		super(b, metalTypes);
	}

}
