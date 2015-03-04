package com.yiwp.batmanplusplus.lib.utils;

import net.minecraft.block.Block;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.util.ForgeDirection;

public class WorldUtils {
	
	 public static int getXOnSide(int x, ForgeDirection side) {
	        return x + side.offsetX;
	    }

	    public static int getYOnSide(int y, ForgeDirection side) {
	        return y + side.offsetY;
	    }

	    public static int getZOnSide(int z, ForgeDirection side) {
	        return z + side.offsetZ;
	    }
	    
	    public static Block getBlock(IBlockAccess world, int x, int y, int z) {
	        return world.getBlock(x, y, z);
	    }
		

}
