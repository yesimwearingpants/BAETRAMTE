package yesiwearpants.compressionmod.gen;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import yesiwearpants.compressionmod.handler.BlockHandler;
import cpw.mods.fml.common.IWorldGenerator;

public class YIWPWorldGen implements IWorldGenerator{
	
	private static int stone = Blocks.stone;
	private static int gravel = Blocks.gravel;
	private static int dirt = Blocks.dirt;
	private static int grass = Blocks.grass;
	private static int nether = Blocks.netherrack;
	private static int end = Blocks.whiteStone;
	private int maxX = 16;
	private int maxZ = 16;
	private int minNY = 22;
	private int maxNY = 110;

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
		case -1:generateNether(world, random, chunkX*16, chunkZ*16);
		break;
		case 0:generateOverworld(world, random, chunkX*16, chunkZ*16);
		case 1:generateEnd();
		}
		
	}

	private void generateNether(World world, Random random, int x, int z) 
	{
		this.addOreNetherSpawn(BlockHandler.nlux, 2, world, random, x, z, maxX, maxZ, 6+random.nextInt(6), 64, minNY, maxNY);
		this.addOreNetherSpawn(BlockHandler.steelore, 3, world, random, x, z, maxX, maxZ, 4+random.nextInt(9), 10, minNY, maxNY);
		this.addOreNetherSpawn(BlockHandler.bstone, 4, world, random, x, z, maxX, maxZ, 30+random.nextInt(30), 7, minNY, maxNY);
		this.addOreNetherSpawn(BlockHandler.viles, 5, world, random, x, z, maxX, maxZ, 31+random.nextInt(31), 6, minNY, maxNY);
	}

	private void generateOverworld(World world, Random random, int x, int z) {
		this.addOreSpawn(BlockHandler.lumen, stone, world, random, x, z, maxX, maxZ, 1+random.nextInt(3), 64, 3, 52);
		this.addOresSpawn(BlockHandler.titanore, world, random, x, z, maxX, maxZ, 2+random.nextInt(7), 23, 5, 48);
	}

	private void generateEnd() {
		// TODO Auto-generated method stub
		
	}
	
	public void addOreNetherSpawn(Block block, int var, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minNY, int maxNY)
    {
          int maxPossY = minNY + (maxNY - 1);
          assert maxNY > minNY: "The maximum Y must be greater than the Minimum Y";
          assert maxX > 0 && maxX <= 16: "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
          assert minNY > 20: "addOreSpawn: The Minimum Y must be greater than 0";
          assert maxNY < 128 && maxNY > 20: "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
          assert maxZ > 0 && maxZ <= 16: "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
         
          int diffBtwnMinMaxY = maxNY - minNY;
          for(int x = 0; x < chancesToSpawn; x++)
          {
                 int posX = blockXPos + random.nextInt(maxX);
                 int posY = minNY + random.nextInt(diffBtwnMinMaxY);
                 int posZ = blockZPos + random.nextInt(maxZ);
                 (new WorldGenMinable(block.blockID, var, maxVeinSize, nether)).generate(world, random, posX, posY, posZ);
          }
    }
	
	public void addOreSpawn(Block block, int target, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
    {
          int maxPossY = minY + (maxY - 1);
          assert maxY > minY: "The maximum Y must be greater than the Minimum Y";
          assert maxX > 0 && maxX <= 16: "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
          assert minY > 0: "addOreSpawn: The Minimum Y must be greater than 0";
          assert maxY < 256 && maxY > 0: "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
          assert maxZ > 0 && maxZ <= 16: "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
          
          int diffBtwnMinMaxY = maxY - minY;
          for(int x = 0; x < chancesToSpawn; x++)
          {
                 int posX = blockXPos + random.nextInt(maxX);
                 int posY = minY + random.nextInt(diffBtwnMinMaxY);
                 int posZ = blockZPos + random.nextInt(maxZ);
                 (new WorldGenMinable(block.blockID, maxVeinSize, target)).generate(world, random, posX, posY, posZ);
                 
                 
          }
    }

	public void addOreEndSpawn(Block block, int var, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
    {
          int maxPossY = minY + (maxY - 1);
          assert maxY > minY: "The maximum Y must be greater than the Minimum Y";
          assert maxX > 0 && maxX <= 16: "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
          assert minY > 0: "addOreSpawn: The Minimum Y must be greater than 0";
          assert maxY < 256 && maxY > 0: "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
          assert maxZ > 0 && maxZ <= 16: "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
         
          int diffBtwnMinMaxY = maxY - minY;
          for(int x = 0; x < chancesToSpawn; x++)
          {
                 int posX = blockXPos + random.nextInt(maxX);
                 int posY = minY + random.nextInt(diffBtwnMinMaxY);
                 int posZ = blockZPos + random.nextInt(maxZ);
                 (new WorldGenMinable(block.blockID, var, maxVeinSize, end)).generate(world, random, posX, posY, posZ);
          }
    }
	public void addOresSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
    {
          int maxPossY = minY + (maxY - 1);
          assert maxY > minY: "The maximum Y must be greater than the Minimum Y";
          assert maxX > 0 && maxX <= 16: "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
          assert minY > 0: "addOreSpawn: The Minimum Y must be greater than 0";
          assert maxY < 256 && maxY > 0: "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
          assert maxZ > 0 && maxZ <= 16: "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
          
          int diffBtwnMinMaxY = maxY - minY;
          for(int x = 0; x < chancesToSpawn; x++)
          {
                 int posX = blockXPos + random.nextInt(maxX);
                 int posY = minY + random.nextInt(diffBtwnMinMaxY);
                 int posZ = blockZPos + random.nextInt(maxZ);
                 (new WorldGenMinable(block.blockID, maxVeinSize)).generate(world, random, posX, posY, posZ);
                 
                 
          }
    }
	
}