package com.yiwp.batmanplusplus.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;


public class MetalBlock extends ExtBlock	{

	static String[] metalTypes = new String[] {"blockMolydbochalkos", "blockOrichalcum", "blockCactusSteel",
		"blockMeteoricIron", "blockTetsu", "blockTitanium", "blockVibranium", "blockAdamantium", "blockTitanium", "blockTiAl",};
    public IIcon[] icons;
	
	public static MetalBlock BlockMolybdochalkas = new MetalBlock(3.1f, 9.0f, Names.Blocks.molybdochalkosBlock);
	public static MetalBlock BlockOrichalcum = new MetalBlock(3.5f, 9.9f, Names.Blocks.orichalcumBlock);
	public static MetalBlock BlockCactusSteel = new MetalBlock(0.1f, 0.1f, Names.Blocks.cactusSteelBlock);
	public static MetalBlock BlockMeteoricIron = new MetalBlock(11.0f, 35.0f, Names.Blocks.meteoricIronBlock);
	public static MetalBlock BlockTetsu = new MetalBlock(11.5f, 35.0f, Names.Blocks.tetsuBlock);
	public static MetalBlock BlockTitanium  = new MetalBlock(10.0f, 30.0f, Names.Blocks.titaniumBlock);
	public static MetalBlock BlockVibranium = new MetalBlock(20.f, 40.0f, Names.Blocks.vibraniumBlock);
	public static MetalBlock BlockAdamantium = new MetalBlock(16.0f, 50.0f, Names.Blocks.adamantiumBlock);
	public static MetalBlock BlockTitaniumAlumide = new MetalBlock(7.5f, 25.0f, Names.Blocks.titaniumAlumideBlock);
	
	public MetalBlock(float hardness, float resistance, String name) {
		super(Material.iron, metalTypes, name);
		this.setStepSound(Block.soundTypeMetal);
			
	}
		
	@Override
	public boolean isBeaconBase (IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ)	{
        return true;
        
    }
	
}
