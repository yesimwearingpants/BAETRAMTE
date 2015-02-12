package com.yiwp.batmanplusplus.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;


public class MetalBlock extends ExtBlock	{

	public MetalBlock(float hardness, float resistance, String tex, String name) {
		super(Material.iron, tex, name);
		this.setStepSound(Block.soundTypeMetal);
			
	}
		
	public boolean isBeaconBase (IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ)	{
        return true;
        
    }
	
}
