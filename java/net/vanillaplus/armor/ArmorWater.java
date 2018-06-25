package net.vanillaplus.armor;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.vanillaplus.common.VanillaPlus;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class ArmorWater extends ItemArmor{
	public String armorNamePrefix;
	public ArmorWater(ArmorMaterial par2EnumArmorMaterial, int par3, int par4,String armornamePrefix) {
        super(par2EnumArmorMaterial, par3, par4);
        this.setCreativeTab(VanillaPlus.VanillaPlusTabItems);
        armorNamePrefix = armornamePrefix;
        
}

public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
{
    par3List.add("Full Set: \u00a79Water Breathing");
    par3List.add("Durability: \u00a77Low");
}


@Override
public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack){
    
    if (player.getCurrentArmor(3) != null && player.getCurrentArmor(2) != null && player.getCurrentArmor(1) != null && player.getCurrentArmor(0) != null)
    {
	   ItemStack helmet = player.getCurrentArmor(3);
	   ItemStack plate = player.getCurrentArmor(2);
	   ItemStack legs = player.getCurrentArmor(1);
	   ItemStack boots = player.getCurrentArmor(0);
	   
	   if (helmet.getItem() == VanillaPlus.scubaHelmet && plate.getItem() == VanillaPlus.scubaTank && legs.getItem() == VanillaPlus.scubaPants && boots.getItem() == VanillaPlus.scubaFlippers)
	   {
		   if(world.getBlock((int)player.posX, (int)player.posY, (int)player.posZ) == Blocks.water)
			   player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 1 * 20, 0, true));
	   }   
    }
  
    	  
}

public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
{
if (stack.toString().contains("pants")) 
{
return "VanillaPlus:" + armorNamePrefix + "_2.png";
}
if (stack.toString().contains("Pants")) 
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

