package gruntpie224.vanillaplus.items;

import java.util.List;

import gruntpie224.vanillaplus.VanillaPlus;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemAirSword extends ItemSword{
	
	public ItemAirSword(ToolMaterial par2EnumToolMaterial) {
		super(par2EnumToolMaterial);
		this.setCreativeTab(VanillaPlus.tabVanillaPlusItems);
	}
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {

        par3List.add("\u00a76+Air Damage");
    }
 
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
    {
    	par1ItemStack.damageItem(1, par3EntityLivingBase);
        par2EntityLivingBase.motionY += 0.8000000059604645D;
        
        return true;
    }

}
