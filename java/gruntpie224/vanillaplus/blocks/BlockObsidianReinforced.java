package gruntpie224.vanillaplus.blocks;

import java.util.Random;

import gruntpie224.vanillaplus.VanillaPlus;
import gruntpie224.vanillaplus.init.VanillaPlusBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class BlockObsidianReinforced extends Block{

	public BlockObsidianReinforced(Material materialIn) {
		super(materialIn);
		this.setHarvestLevel("pickaxe", 3);
		this.setHardness(65.0f);
		this.setCreativeTab(VanillaPlus.tabVanillaPlusBlocks);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(VanillaPlusBlocks.obsidian_reinforced);
    }
}
