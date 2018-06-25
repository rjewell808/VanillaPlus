package net.vanillaplus.world;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.vanillaplus.common.VanillaPlus;
import net.vanillaplus.helpers.MainConfig;
import cpw.mods.fml.common.IWorldGenerator;

public class OreWorldGen implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
            IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch (world.provider.dimensionId)
        {
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
                break;

            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
                break;

            case 1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
                break;
        }
    }

    public void generateNether(World world, Random rand, int chunkX, int chunkZ)
    {
    	if(MainConfig.netherOreBoolean == true){
	    	for (int i = 0; i < 14; i++) {
	
	    		int randPosX = chunkX + rand.nextInt(16);
	            int randPosY = rand.nextInt(60);
	            int randPosZ = chunkZ + rand.nextInt(16);
	
	    	(new WorldGenMinableNether(VanillaPlus.magmaOre, 3)).generate(world, rand,
	    			randPosX, randPosY, randPosZ);
	    	}
	    	for (int i = 0; i < 13; i++) {
	
	    		int randPosX = chunkX + rand.nextInt(16);
	            int randPosY = rand.nextInt(45);
	            int randPosZ = chunkZ + rand.nextInt(16);
	
	    	(new WorldGenMinableNether(VanillaPlus.hellFireOre, 2)).generate(world, rand,
	    			randPosX, randPosY, randPosZ);
	    	}
    	}
    }

    public void generateSurface(World world, Random rand, int chunkX, int chunkZ)
    {
    	if(MainConfig.overworldOreBoolean == true){
	       // 30 veins of ore per chunk
	        for (int i = 0; i < 15; i++)
	        {
	            //16x16 area up to y = 64
	            int randPosX = chunkX + rand.nextInt(16);
	            int randPosY = rand.nextInt(20);
	            int randPosZ = chunkZ + rand.nextInt(16);
	            // 10 blocks per vein
	            (new WorldGenMinable(VanillaPlus.xpOre, 3)).generate(world, rand,
	                    randPosX, randPosY, randPosZ);
	        }
	        for (int i = 0; i < 10; i++)
	        {
	            //16x16 area up to y = 64
	            int randPosX = chunkX + rand.nextInt(16);
	            int randPosY = rand.nextInt(20);
	            int randPosZ = chunkZ + rand.nextInt(16);
	            // 10 blocks per vein
	            (new WorldGenMinable(VanillaPlus.rubyOre, 4)).generate(world, rand,
	                    randPosX, randPosY, randPosZ);
	        }
	        for (int i = 0; i < 8; i++)
	        {
	            //16x16 area up to y = 64
	            int randPosX = chunkX + rand.nextInt(16);
	            int randPosY = rand.nextInt(15);
	            int randPosZ = chunkZ + rand.nextInt(16);
	            // 10 blocks per vein
	            (new WorldGenMinable(VanillaPlus.sapphireOre, 2)).generate(world, rand,
	                    randPosX, randPosY, randPosZ);
	        }
    	}
    }

    private void generateEnd(World world, Random rand, int chunkX, int chunkZ) {
    	if(MainConfig.endOreBoolean == true){
	    	for (int i = 0; i < 20; i++) {
	
	    		int randPosX = chunkX + rand.nextInt(16);
	            int randPosY = rand.nextInt(70);
	            int randPosZ = chunkZ + rand.nextInt(16);
	
	    	(new WorldGenMinableEnd(VanillaPlus.enderCrystalOre, 5)).generate(world, rand,
	    			randPosX, randPosY, randPosZ);
	    	}
	    }
    }
}