package net.vanillaplus.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.vanillaplus.common.VanillaPlus;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemEnderGem extends Item{

	public ItemEnderGem() {
		this.setCreativeTab(VanillaPlus.VanillaPlusTabItems);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
	    this.itemIcon = par1IconRegister.registerIcon(VanillaPlus.modid + ":" + this.getUnlocalizedName().substring(5));
	}
	
}

