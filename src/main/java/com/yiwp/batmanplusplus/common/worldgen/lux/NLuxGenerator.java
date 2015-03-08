package com.yiwp.batmanplusplus.common.worldgen.lux;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType;
import net.minecraftforge.event.terraingen.TerrainGen;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class NLuxGenerator {

    public static final EventType EVENT_TYPE = EnumHelper.addEnum(EventType.class, "NLUX", new Class[0], new Object[0]);
    private final WorldGenerator nlux = new LuxWorldGen(1, 60, Blocks.netherrack);

    @SubscribeEvent
    public void generate(OreGenEvent.Post event) {

        World world = event.world;
        Random rand = event.rand;
        int worldX = event.worldX;
        int worldZ = event.worldZ;

        if (!TerrainGen.generateOre(world, rand, nlux, worldX, worldZ, EVENT_TYPE))
            return;

        BiomeGenBase biome = world.getBiomeGenForCoords(worldX + 16, worldZ + 16);
        if (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.NETHER))
            for (int i = 0; i < 90; i++) {
                int x = worldX + rand.nextInt(16);
                int y = 4 + rand.nextInt(20);
                int z = worldZ + rand.nextInt(16);

                nlux.generate(world, rand, x, y, z);
            }
    }

}
