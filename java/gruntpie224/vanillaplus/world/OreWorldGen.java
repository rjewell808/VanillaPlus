package gruntpie224.vanillaplus.world;

import java.util.Random;

import gruntpie224.vanillaplus.VanillaPlus;
import gruntpie224.vanillaplus.init.VanillaPlusBlocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OreWorldGen implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch (world.provider.getDimensionId())
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
	    	for (int i = 0; i < 14; i++) {
	
	    		int randPosX = chunkX + rand.nextInt(16);
	            int randPosY = rand.nextInt(60);
	            int randPosZ = chunkZ + rand.nextInt(16);
	
	            (new WorldGenMinableNether(VanillaPlusBlocks.magma_ore.getBlockState().getBaseState(), 3)).generate(world, rand, new BlockPos(randPosX, randPosY, randPosZ));
	    	}
	    	for (int i = 0; i < 13; i++) {
	
	    		int randPosX = chunkX + rand.nextInt(16);
	            int randPosY = rand.nextInt(45);
	            int randPosZ = chunkZ + rand.nextInt(16);
	
	            (new WorldGenMinableNether(VanillaPlusBlocks.hellfire_ore.getBlockState().getBaseState(), 2)).generate(world, rand, new BlockPos(randPosX, randPosY, randPosZ));
	    	}
    }

    public void generateSurface(World world, Random rand, int chunkX, int chunkZ)
    {
	       // 30 veins of ore per chunk
	        for (int i = 0; i < 20; i++)
	        {
	            //16x16 area up to y = 64
	            int randPosX = chunkX + rand.nextInt(16);
	            int randPosY = rand.nextInt(20);
	            int randPosZ = chunkZ + rand.nextInt(16);
	            // 10 blocks per vein
	            (new WorldGenMinable(VanillaPlusBlocks.enchanted_ore.getBlockState().getBaseState(), 4)).generate(world, rand, new BlockPos(randPosX, randPosY, randPosZ));
	        }
	        for (int i = 0; i < 10; i++)
	        {
	            //16x16 area up to y = 64
	            int randPosX = chunkX + rand.nextInt(16);
	            int randPosY = rand.nextInt(20);
	            int randPosZ = chunkZ + rand.nextInt(16);
	            // 10 blocks per vein
	            (new WorldGenMinable(VanillaPlusBlocks.ruby_ore.getBlockState().getBaseState(), 4)).generate(world, rand, new BlockPos(randPosX, randPosY, randPosZ));
	        }
	        for (int i = 0; i < 5; i++)
	        {
	            //16x16 area up to y = 64
	            int randPosX = chunkX + rand.nextInt(16);
	            int randPosY = rand.nextInt(15);
	            int randPosZ = chunkZ + rand.nextInt(16);
	            // 10 blocks per vein
	            (new WorldGenMinable(VanillaPlusBlocks.sapphire_ore.getBlockState().getBaseState(), 2)).generate(world, rand, new BlockPos(randPosX, randPosY, randPosZ));
	        }
    }

    private void generateEnd(World world, Random rand, int chunkX, int chunkZ) {
	    	for (int i = 0; i < 55; i++) {
	
	    		int randPosX = chunkX + rand.nextInt(16);
	            int randPosY = rand.nextInt(70);
	            int randPosZ = chunkZ + rand.nextInt(16);
	
	            (new WorldGenMinableEnd(VanillaPlusBlocks.ender_crystal_ore.getBlockState().getBaseState(), 5)).generate(world, rand, new BlockPos(randPosX, randPosY, randPosZ));
	        }

    }
}