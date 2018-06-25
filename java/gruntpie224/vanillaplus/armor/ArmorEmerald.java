package gruntpie224.vanillaplus.armor;

import java.util.List;

import gruntpie224.vanillaplus.Reference;
import gruntpie224.vanillaplus.VanillaPlus;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ArmorEmerald extends ItemArmor
{
	public Item repair;
	public String armorNamePrefix;
    public ArmorEmerald(ArmorMaterial par2EnumArmorMaterial,int par3, int par4, String armornamePrefix,Item par1Item)
    {
        super(par2EnumArmorMaterial, par3, par4);
        this.setCreativeTab(VanillaPlus.tabVanillaPlusItems);
        armorNamePrefix = armornamePrefix;
        this.repair = par1Item;
    }

    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
	    par3List.add("Durability: \u00a7aMedium");
	}
    
    @Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (stack.toString().contains("legs")) 
			return Reference.MOD_ID + ":textures/armor/" + armorNamePrefix + "_2.png";
		
		if (stack.toString().contains("Legs")) 
			return Reference.MOD_ID + ":textures/armor/" + armorNamePrefix + "_2.png";
		
		return Reference.MOD_ID + ":textures/armor/" + armorNamePrefix + "_1.png";
	}
    
    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
    	return par2ItemStack.isItemEqual(new ItemStack(this.repair, 1, 0)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
    }
}
