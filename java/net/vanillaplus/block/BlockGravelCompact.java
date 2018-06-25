package net.vanillaplus.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.vanillaplus.common.VanillaPlus;

public class BlockGravelCompact extends Block
{
    public BlockGravelCompact(Material par2Material)
    {
        super(par2Material);
        this.setCreativeTab(VanillaPlus.VanillaPlusTabBlocks);
        setHardness(2.0f);
        setHarvestLevel("pickaxe", 2);
    }
    public void registerBlockIcons(IIconRegister iconRegister)
    {
    
    this.blockIcon = iconRegister.registerIcon("VanillaPlus:gravelCompact");
    }
    
}
