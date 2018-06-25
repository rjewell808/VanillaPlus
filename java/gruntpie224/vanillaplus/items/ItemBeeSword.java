package gruntpie224.vanillaplus.items;

import java.util.List;

import gruntpie224.vanillaplus.VanillaPlus;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ItemBeeSword extends ItemSword{

	public ItemBeeSword(ToolMaterial par2EnumToolMaterial) {
		super(par2EnumToolMaterial);
		this.setCreativeTab(VanillaPlus.tabVanillaPlusItems);
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
}
