package gruntpie224.vanillaplus.armor;

import java.util.List;

import gruntpie224.vanillaplus.Reference;
import gruntpie224.vanillaplus.VanillaPlus;
import gruntpie224.vanillaplus.init.VanillaPlusItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ArmorGuard extends ItemArmor {

	public String armorNamePrefix;
	public ArmorGuard(ArmorMaterial par2EnumArmorMaterial, int par3, int par4, String armornamePrefix) {
		super(par2EnumArmorMaterial, par3, par4);
		this.setCreativeTab(VanillaPlus.tabVanillaPlusItems);
		armorNamePrefix = armornamePrefix;
	}
	
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
	    par3List.add("Full Set: \u00a79Invincibility");
	    par3List.add("Durability: \u00a78Extremely Low");
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack){
	    
	    if (player.getCurrentArmor(3) != null && player.getCurrentArmor(2) != null && player.getCurrentArmor(1) != null && player.getCurrentArmor(0) != null) {
	    	   ItemStack helmet = player.getCurrentArmor(3);
	    	   ItemStack plate = player.getCurrentArmor(2);
	    	   ItemStack legs = player.getCurrentArmor(1);
	    	   ItemStack boots = player.getCurrentArmor(0);
	    	   
	    	   if (helmet.getItem() == VanillaPlusItems.guard_helmet && plate.getItem() == VanillaPlusItems.guard_plate && legs.getItem() == VanillaPlusItems.guard_legs && boots.getItem() == VanillaPlusItems.guard_boots) {
	    		   player.addPotionEffect(new PotionEffect(Potion.resistance.id, 1 * 20, 6, false, false));
	    	   }
	    }
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
}

