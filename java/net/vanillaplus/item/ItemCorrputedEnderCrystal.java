package net.vanillaplus.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.vanillaplus.common.VanillaPlus;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemCorrputedEnderCrystal extends Item{

	public ItemCorrputedEnderCrystal() {
		this.setCreativeTab(VanillaPlus.VanillaPlusTabItems);
	}


@SideOnly(Side.CLIENT)
public boolean hasEffect(ItemStack par1ItemStack)
{
    return true;
}

public void registerIcons(IIconRegister par1IconRegister)
{
    this.itemIcon = par1IconRegister.registerIcon(VanillaPlus.modid + ":" + this.getUnlocalizedName().substring(5));
}
}

