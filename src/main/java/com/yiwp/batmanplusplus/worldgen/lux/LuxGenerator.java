package com.yiwp.batmanplusplus.worldgen.lux;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType;
import net.minecraftforge.event.terraingen.TerrainGen;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class LuxGenerator implements IWorldGenerator{

    public static final EventType EVENT_TYPE = EnumHelper.addEnum(EventType.class, "LUX", new Class[0], new Object[0]);
    private final WorldGenerator lux = new LuxWorldGen(0, 70, Blocks.stone);

    @SubscribeEvent
    public void generate(OreGenEvent.Post event) {

        World world = event.world;
        Random rand = event.rand;
        int worldX = event.worldX;
        int worldZ = event.worldZ;

        if (!TerrainGen.generateOre(world, rand, lux, worldX, worldZ, EVENT_TYPE))
            return;

            for (int i = 0; i < 90; i++) {
                int x = worldX + rand.nextInt(16);
                int y = 4 + rand.nextInt(50);
                int z = worldZ + rand.nextInt(16);

                lux.generate(world, rand, x, y, z);
            }
    }

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		// TODO Auto-generated method stub
		
	}

}
