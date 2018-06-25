package gruntpie224.vanillaplus.blocks;

import java.util.Random;

import gruntpie224.vanillaplus.VanillaPlus;
import gruntpie224.vanillaplus.init.VanillaPlusBlocks;
import gruntpie224.vanillaplus.init.VanillaPlusItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockEnderCrystalOre extends Block{

	private Random rand = new Random();
	public BlockEnderCrystalOre(Material par2Material) {
		super(par2Material);
		this.setCreativeTab(VanillaPlus.tabVanillaPlusBlocks);
		setHarvestLevel("pickaxe", 3);
	}
		
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
    	return VanillaPlusItems.ender_crystal_corrupt;
    }
	
	@Override
    public int quantityDropped(Random par1Random)
    {
        return 1 + par1Random.nextInt(2);
    }
    
    @Override
    public boolean canEntityDestroy(IBlockAccess world, BlockPos pos, Entity entity)
    {
    	if (entity instanceof EntityDragon)
        {
            return this != VanillaPlusBlocks.ender_crystal_ore;
        }

        return true;
    }
    
    @Override
	public int getExpDrop(IBlockAccess world, BlockPos pos, int fortune)
    {
		return MathHelper.getRandomIntegerInRange(rand, 3, 7);
	}
    
}

