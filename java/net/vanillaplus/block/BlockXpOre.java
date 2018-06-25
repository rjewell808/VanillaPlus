package net.vanillaplus.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.vanillaplus.common.VanillaPlus;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockXpOre extends Block
{
    public BlockXpOre(Material par2Material)
    {
        super(par2Material);
        this.setCreativeTab(VanillaPlus.VanillaPlusTabBlocks);
        setHarvestLevel("pickaxe", 2);
    }
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(VanillaPlus.modid + ":" + this.getUnlocalizedName().substring(5));
    }

    public Item getItemDropped(int metadata, Random rand, int fortune){
    	return VanillaPlus.enchantedRock;
    }
    public int quantityDropped(Random par1Random)
    {
        return 2 + par1Random.nextInt(3);
    }
}
