package gruntpie224.vanillaplus.blocks;

import java.util.Random;

import gruntpie224.vanillaplus.VanillaPlus;
import gruntpie224.vanillaplus.VanillaPlusBlocksTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

public class BlockGravelCompact extends Block
{
    public BlockGravelCompact(Material par2Material)
    {
        super(par2Material);
        this.setCreativeTab(VanillaPlus.tabVanillaPlusBlocks);
        setHardness(2.0f);
        setHarvestLevel("pickaxe", 2);
    }   
}
