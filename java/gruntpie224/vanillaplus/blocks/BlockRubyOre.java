package gruntpie224.vanillaplus.blocks;

import java.util.Random;

import gruntpie224.vanillaplus.VanillaPlus;
import gruntpie224.vanillaplus.init.VanillaPlusItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

public class BlockRubyOre extends Block{

	private Random rand = new Random();
	public BlockRubyOre(Material par2Material) {
		super(par2Material);
		this.setCreativeTab(VanillaPlus.tabVanillaPlusBlocks);
		setHarvestLevel("pickaxe", 2);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {	
		return VanillaPlusItems.ruby;
    }
    
    public int quantityDropped(Random rand)
    {
        return 1;
    }
    
	@Override
	public int getExpDrop(IBlockAccess world, BlockPos pos, int fortune)
	{
		return MathHelper.getRandomIntegerInRange(rand, 3, 6);
	}

}
