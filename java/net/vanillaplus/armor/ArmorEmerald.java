package net.vanillaplus.armor;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.vanillaplus.common.VanillaPlus;

public class ArmorEmerald extends ItemArmor
{
	public Item repair;
	public String armorNamePrefix;
    public ArmorEmerald(ArmorMaterial par2EnumArmorMaterial,int par3, int par4, String armornamePrefix,Item par1Item)
    {
        super(par2EnumArmorMaterial, par3, par4);
        this.setCreativeTab(VanillaPlus.VanillaPlusTabItems);
        armorNamePrefix = armornamePrefix;
        this.repair = par1Item;
    }

    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
	    par3List.add("Durability: \u00a7aMedium");
	}
    
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
if (stack.toString().contains("legs")) 
{
return "VanillaPlus:" + armorNamePrefix + "_2.png";
}
if (stack.toString().contains("Legs")) 
{
return "VanillaPlus:" + armorNamePrefix + "_2.png";
}
return "VanillaPlus:" + armorNamePrefix + "_1.png";
}
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(VanillaPlus.modid + ":" + this.getUnlocalizedName().substring(5));
    }
    
    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
    	return par2ItemStack.isItemEqual(new ItemStack(this.repair, 1, 0)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
    }
}