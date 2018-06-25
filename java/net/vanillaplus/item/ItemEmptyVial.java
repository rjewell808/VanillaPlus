package net.vanillaplus.item;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;
import net.vanillaplus.common.VanillaPlus;
import net.vanillaplus.helpers.VanillaAchievements;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemEmptyVial extends Item{

    public ItemEmptyVial() {
            this.setCreativeTab(VanillaPlus.VanillaPlusTabItems);
    }
    
  
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
{
  
    if (par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
    {
    	double d0 = (double)par4 - 0.2D;
        double d1 = (double)par5 + 1.4D;
        double d2 = (double)par6 + 0.325D;
        double d3 = 0.2199999988079071D;
        double d4 = 0.27000001072883606D;
        Block i1 = par3World.getBlock(par4, par5, par6);
        Block enchanter = VanillaPlus.expTranslator;
        float currentxp = par2EntityPlayer.experienceLevel;

        if(par2EntityPlayer.inventory.getFirstEmptyStack() == -1 && !par2EntityPlayer.worldObj.isRemote && !par2EntityPlayer.inventory.hasItem(VanillaPlus.expVial)) {
        	par2EntityPlayer.addChatMessage(new ChatComponentText("Your inventory is full!"));
        	return true;
        }
        else {
        if ( i1 == enchanter && currentxp >= 1 && par2EntityPlayer.inventory.getFirstEmptyStack() != -1 || i1 == enchanter && currentxp >= 1 && par2EntityPlayer.inventory.hasItem(VanillaPlus.expVial))
        {
                            par3World.playSoundAtEntity(par2EntityPlayer, "mob.chicken.plop", 0.5F, 0.1F / (itemRand.nextFloat() * 0.4F + 0.8F));
                            par2EntityPlayer.inventory.addItemStackToInventory(new ItemStack(VanillaPlus.expVial));
            --par1ItemStack.stackSize;
            par2EntityPlayer.addExperienceLevel(-1);
            par2EntityPlayer.addStat(VanillaAchievements.expVialACH, 1);
            par3World.spawnParticle("happyVillager", d0+0.725D, d1 + d3, d2 + d4, 0.0D, 0.0D, 0.0D);
            par3World.spawnParticle("happyVillager", d0+0.725D, d1 + d3-0.1D, d2 + d4, 0.0D, 0.0D, 0.0D);
            return true;
        }
        else
        {
        	if(i1 == enchanter && !par2EntityPlayer.worldObj.isRemote){
        	par2EntityPlayer.addChatMessage(new ChatComponentText("You need at least 1 lvl of XP to bottle it."));
            return false;
        	}
        	return false;
        }
        }
    }
	return true;
    }
		

    @SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
	    this.itemIcon = par1IconRegister.registerIcon(VanillaPlus.modid + ":" + this.getUnlocalizedName().substring(5));
	}
}