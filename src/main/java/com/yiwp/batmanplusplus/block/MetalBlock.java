package com.yiwp.batmanplusplus.block;
/* 
 * 
 * 	This Class Is a Part 
 * 	Tinkers Construct
 * 	all credit goes to them
 *  
 */
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;


public class MetalBlock extends ExtBlock {
	
	private static final String c = "compressed_";
	
	protected float[] hardness = ExtBlock.hardness = new float[] { 16.0f, 11.0f, 3.1f, 3.5f, 10.0f, 20.f};
	
	static String[] metalTypes = new String[] { c + Names.adamantium.toLowerCase(), c + Names.meteoricIron.toLowerCase(),
		c + Names.molybdochalkos.toLowerCase(), c + Names.orichalcum.toLowerCase(), c + Names.titanium.toLowerCase(),
		c + Names.vibranium};
	
	private static float[] resistance = ExtBlock.resistance = new float[] { 50.0f, 35.0f, 9.0f, 9.9f, 30.0f, 40.0f};

	public MetalBlock() {
		super(Material.iron, metalTypes);
		this.setStepSound(Block.soundTypeMetal);
			
	}
		
	public boolean isBeaconBase (IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ)	{
        return true;
        
    }
	
}
