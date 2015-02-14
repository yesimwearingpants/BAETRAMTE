package com.yiwp.batmanplusplus.block;

import com.yiwp.batmanplusplus.lib.reference.Names;

import net.minecraft.block.material.Material;

public class BlockTiAl extends ExtBlock {

	public BlockTiAl(float h, float r) {
		super(Material.iron, Names.titaniumAlumide);
		this.setHardness(h);
		this.setResistance(r);
	}

}
