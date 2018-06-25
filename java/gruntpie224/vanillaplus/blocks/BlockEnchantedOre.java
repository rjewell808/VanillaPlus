package gruntpie224.vanillaplus.blocks;

import gruntpie224.vanillaplus.VanillaPlus;
import gruntpie224.vanillaplus.init.VanillaPlusItems;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockEnchantedOre extends Block
{
    public BlockEnchantedOre(Material par2Material)
    {
        super(par2Material);
        this.setCreativeTab(VanillaPlus.tabVanillaPlusBlocks);
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(4.0f);
        this.setLightLevel(0.4f);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return VanillaPlusItems.enchanted_dust;
    }
    
    public int quantityDropped(Random par1Random)
    {
        return 2 + par1Random.nextInt(3);
    }
}
