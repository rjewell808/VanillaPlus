package net.vanillaplus.armor;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.vanillaplus.common.VanillaPlus;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ArmorSapphire extends ItemArmor {

	public String armorNamePrefix;
	public ArmorSapphire(ArmorMaterial par2EnumArmorMaterial,
			int par3, int par4, String armornamePrefix) {
		super(par2EnumArmorMaterial, par3, par4);
		this.setCreativeTab(VanillaPlus.VanillaPlusTabItems);
		armorNamePrefix = armornamePrefix;
	}
	
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
	    par3List.add("Durability: \u00a75High");
	}
    
	
	 public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	    {
		 if (stack.toString().contains("leggings")) 
		 {
		 return "VanillaPlus:" + armorNamePrefix + "_2.png";
		 }
		 if (stack.toString().contains("Leggings")) 
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
	}

