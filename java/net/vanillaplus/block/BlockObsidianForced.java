package net.vanillaplus.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSkull;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.vanillaplus.common.VanillaPlus;

public class BlockObsidianForced extends Block
{
    public BlockObsidianForced(Material par2Material)
    {
        super(par2Material);
        this.setCreativeTab(VanillaPlus.VanillaPlusTabBlocks);
        setHarvestLevel("pickaxe", 3);
    }
    
    
    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(VanillaPlus.modid + ":" + this.getUnlocalizedName().substring(5));
    }
}
