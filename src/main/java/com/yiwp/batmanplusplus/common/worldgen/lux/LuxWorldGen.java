package com.yiwp.batmanplusplus.common.worldgen.lux;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import com.yiwp.batmanplusplus.common.worldgen.ExtWorldGen;
import com.yiwp.batmanplusplus.init.BlockInit;
import com.yiwp.batmanplusplus.lib.utils.WorldUtils;

public class LuxWorldGen extends ExtWorldGen {

	public LuxWorldGen(int meta, int amount, Block block) {
		super(BlockInit.BlockLuxOre, meta, amount, block);
	}
	
	@Override
    protected boolean canGen(World world, int i, int j, int k) {
        for (int side = 2; side < 6; side++) {
            ForgeDirection s = ForgeDirection.getOrientation(side);
            int x = WorldUtils.getXOnSide(i, s);
            int y = WorldUtils.getYOnSide(j, s);
            int z = WorldUtils.getZOnSide(k, s);

            if (world.blockExists(x, y, z)) {
            	Block block[] = new Block[] {WorldUtils.getBlock(world, x, y, z),  WorldUtils.getBlock(world, x-1, y, z), WorldUtils.getBlock(world, x+1, y, z),
            	WorldUtils.getBlock(world, x, y, z-1), WorldUtils.getBlock(world, x, y, z+1), WorldUtils.getBlock(world, x, y-1, z), WorldUtils.getBlock(world, x-1, y-1, z),
            	WorldUtils.getBlock(world, x, y-1, z-1), WorldUtils.getBlock(world, x+1, y-1, z), WorldUtils.getBlock(world, x, y-1, z+1), WorldUtils.getBlock(world, x, y+1, z),
            	WorldUtils.getBlock(world, x-1, y+1, z), WorldUtils.getBlock(world, x, y+1, z-1), WorldUtils.getBlock(world, x+1, y+1, z), WorldUtils.getBlock(world, x, y+1, z+1),
            	WorldUtils.getBlock(world, x, y-2, z), WorldUtils.getBlock(world, x, y+2, z),};
            	Block block1[];
            	List<Block> temp = new ArrayList<Block>();
                for(int l = 0; l < block.length; l++) {
                	if(block[l] == Blocks.air) {
                		if(block[l] != Blocks.lava || block[l] != Blocks.flowing_lava) {
                			temp.add(block[l]);
                		}
                } for(int m = l; m < block.length; m++){
                	if(block[m] == Blocks.air) {
                		if(block[l] != Blocks.lava || block[l] != Blocks.flowing_lava) {
                			temp.add(block[m]);
                		}
                	} for(int n = m; n < block.length; n++){
                		if(block[n] == Blocks.air) {
                			if(block[l] != Blocks.lava || block[l] != Blocks.flowing_lava) {
                    			temp.add(block[n]);
                    		}
                		} 
                	}block1 = temp.toArray(new Block[0]);
                		for(int l1 = 0; l1 < block1.length; ++l1) {
                			if(block1[l1] == Blocks.stone) {
                				return true;
                			}
                		}
                	}
                }
            }
        }
        return false;
    }

}
