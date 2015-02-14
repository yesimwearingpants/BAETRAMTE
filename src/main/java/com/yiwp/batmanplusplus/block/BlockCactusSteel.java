package com.yiwp.batmanplusplus.block;

import java.util.Random;

import com.yiwp.batmanplusplus.lib.reference.Names;

import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;

public class BlockCactusSteel extends ExtBlock {

	public BlockCactusSteel() {
		super(Material.iron, Names.cactusSteel);
	}
	
	@Override
    public int quantityDropped(Random rand)
    {
        return 0;
    }
	
	@Override
    protected boolean canSilkHarvest()
    {
        return false;
    }

}
