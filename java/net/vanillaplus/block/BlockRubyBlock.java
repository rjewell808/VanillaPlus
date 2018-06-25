package net.vanillaplus.block;

import java.util.List;

import javax.swing.Icon;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.vanillaplus.common.VanillaPlus;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class BlockRubyBlock extends Block
{
       public BlockRubyBlock(Material par2Material)
       {
             super(par2Material);
             this.setCreativeTab(VanillaPlus.VanillaPlusTabBlocks);
             setHarvestLevel("pickaxe", 2);
       }
      
       @SideOnly(Side.CLIENT)
       private IIcon[] icons;
      
       @SideOnly(Side.CLIENT)
       public void registerBlockIcons(IIconRegister par1IconRegister)
       {
             this.icons = new IIcon[6];
            
             for(int i = 0; i < icons.length; i++)
             {
                    this.icons[i] = par1IconRegister.registerIcon(VanillaPlus.modid + ":" + (this.getUnlocalizedName().substring(5)) + i);
             }
       }
       @SideOnly(Side.CLIENT)
       public IIcon getIcon(int par1, int par2)
       {
             return icons[par2];
       }
      
       @SideOnly(Side.CLIENT)
       public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List par3List)
       {
	        for (int var4 = 0; var4 < 6; ++var4)
	        {
	            par3List.add(new ItemStack(par1, 1, var4));
	        }
       }
       public int damageDropped(int par1)
       {
           return par1;

       }
       
   	
}