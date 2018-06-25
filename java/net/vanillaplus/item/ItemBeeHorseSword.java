package net.vanillaplus.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.vanillaplus.common.VanillaPlus;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBeeHorseSword extends ItemSword{
	

	public ItemBeeHorseSword(ToolMaterial par2EnumToolMaterial) {
		super(par2EnumToolMaterial);
		this.setCreativeTab(VanillaPlus.VanillaPlusTabItems);
	}
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("\u00a77\u00a7oIt's a Bee the Size of a Horse");
        par3List.add("\u00a76+First Strike Does Tons of Damage");
        par3List.add("\u00a76+Poison");
        par3List.add("\u00a7c-It's really a Stone Sword");
 
    }	
	
	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
    {
		par2EntityLivingBase.addPotionEffect(new PotionEffect(Potion.poison.id, 12 * 20, 0));
		par3EntityLivingBase.setCurrentItemOrArmor(0, new ItemStack(Items.stone_sword));       
        return true;
    }
   
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(VanillaPlus.modid + ":" + this.getUnlocalizedName().substring(5));
    
    }
}