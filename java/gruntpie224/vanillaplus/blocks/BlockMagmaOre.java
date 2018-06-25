package gruntpie224.vanillaplus.blocks;

import java.util.Random;

import gruntpie224.vanillaplus.VanillaPlus;
import gruntpie224.vanillaplus.init.VanillaPlusBlocks;
import gruntpie224.vanillaplus.init.VanillaPlusItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldProviderEnd;

public class BlockMagmaOre extends Block {
	public BlockMagmaOre(Material par2Material) {
		super(par2Material);
		this.setCreativeTab(VanillaPlus.tabVanillaPlusBlocks);
		setHardness(6.0f);
		setHarvestLevel("pickaxe", 2);
	}

	@Override
    public boolean isFireSource(World world, BlockPos pos, EnumFacing side)
    {
        if (this == VanillaPlusBlocks.hellfire_ore && side == side.UP)
        {
            return true;
        }
        if ((world.provider instanceof WorldProviderEnd) && this == Blocks.bedrock && side == side.UP)
        {
            return true;
        }
        return false;
    }

	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return VanillaPlusItems.magma_chunk;
    }

	public int quantityDropped(Random rand) {
		return 1;
	}

	private Random rand = new Random();

	@Override
	public int getExpDrop(IBlockAccess world, BlockPos pos, int fortune)
    {
		return MathHelper.getRandomIntegerInRange(rand, 2, 5);
	}

}
