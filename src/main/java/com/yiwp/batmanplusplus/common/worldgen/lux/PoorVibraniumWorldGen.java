package com.yiwp.batmanplusplus.common.worldgen.lux;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import com.yiwp.batmanplusplus.common.worldgen.ExtWorldGen;
import com.yiwp.batmanplusplus.init.BlockInit;
import com.yiwp.batmanplusplus.lib.utils.WorldUtils;

public class PoorVibraniumWorldGen extends ExtWorldGen{

	public PoorVibraniumWorldGen(Block ore, int meta, int number, Block replace) {
		super(BlockInit.BlockOre, 2, 5, Blocks.netherrack);
	}
	
	@Override
    protected boolean canGen(World world, int x, int y, int z) {
        for (int side = 2; side < 6; side++) {
            ForgeDirection s = ForgeDirection.getOrientation(side);
            int i = WorldUtils.getXOnSide(x, s);
            int j = WorldUtils.getYOnSide(y, s);
            int k = WorldUtils.getZOnSide(z, s);

            if (world.blockExists(i, j, k)) {
            	Block block[] = new Block[] {WorldUtils.getBlock(world, i, j, k), WorldUtils.getBlock(world, i-1, j, k), WorldUtils.getBlock(world, i+1, j, k),
                WorldUtils.getBlock(world, i-1, j, k), WorldUtils.getBlock(world, i-1, j-2, k), WorldUtils.getBlock(world, i-1, j+2, k),
                WorldUtils.getBlock(world, i+1, j, k), WorldUtils.getBlock(world, i+1, j-2, k), WorldUtils.getBlock(world, i+1, j+2, k),
                WorldUtils.getBlock(world, i, j-1, k), WorldUtils.getBlock(world, i, j+1, k), WorldUtils.getBlock(world, i, j, k-1),
                WorldUtils.getBlock(world, i, j, k+1), WorldUtils.getBlock(world, i, j+2, k-1), WorldUtils.getBlock(world, i, j-2, k+1),
                WorldUtils.getBlock(world, i, j-2, k-1), WorldUtils.getBlock(world, i, j+2, k+1)};
                	
            }
        }
        for (int j = 0; j < 4; j++) {
            Block block = WorldUtils.getBlock(world, x, y - j, z);

            if (block == Blocks.lava || block == Blocks.flowing_lava)
                return true;
            else if (block != Blocks.air)
                return false;
        }
        return false;
    }

}
