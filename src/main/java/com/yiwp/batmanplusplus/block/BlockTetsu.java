package com.yiwp.batmanplusplus.block;

import com.yiwp.batmanplusplus.lib.reference.Names;

import net.minecraft.block.material.Material;

public class BlockTetsu extends ExtBlock {

	public BlockTetsu(float h, float r) {
		super(Material.iron, Names.tetsu);
		this.setHardness(h);
		this.setResistance(r);
	}

}
