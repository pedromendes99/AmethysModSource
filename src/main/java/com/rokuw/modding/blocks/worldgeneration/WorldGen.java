package com.rokuw.modding.blocks.worldgeneration;

import java.util.*;

import com.rokuw.modding.MainClass;
import com.rokuw.modding.blocks.RokuwBlocks;

import net.minecraft.world.*;
import net.minecraft.world.chunk.*;
import net.minecraft.world.gen.feature.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.registry.*;

public class WorldGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
                    IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
            switch(world.provider.dimensionId) {
            case 0 : generateSurface(world, random, chunkX*16, chunkZ*16);
           
           
            }
         
    }

    @EventHandler
    public void generateSurface(World world, Random random, int x, int z) {
           
            for(int i = 0; i < 11; i++) {
                    int Xcoords = x + random.nextInt(16);
                    int Ycoords = random.nextInt(256);
                    int Zcoords = z + random.nextInt(16);
                    new WorldGenMinable(RokuwBlocks.amethystOre, 8).generate(world, random, Xcoords, Ycoords, Zcoords);
                   
                   
                   
            }
           
           
           
    }   
	public static void Register() {
		GameRegistry.registerWorldGenerator(worldGen, 1);
	}

	public static WorldGen worldGen = new WorldGen();
    
}