package gruntpie224.vanillaplus.armor;

import java.util.List;

import gruntpie224.vanillaplus.Reference;
import gruntpie224.vanillaplus.VanillaPlus;
import gruntpie224.vanillaplus.init.VanillaPlusItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ArmorWater extends ItemArmor{
	public String armorNamePrefix;
	public ArmorWater(ArmorMaterial par2EnumArmorMaterial, int par3, int par4,String armornamePrefix) {
        super(par2EnumArmorMaterial, par3, par4);
        this.setCreativeTab(VanillaPlus.tabVanillaPlusItems);
        armorNamePrefix = armornamePrefix;
        
	}
	
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
	    par3List.add("Full Set: \u00a79Water Breathing");
	    par3List.add("Durability: \u00a77Low");
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack){
	    
	    if (player.getCurrentArmor(3) != null && player.getCurrentArmor(2) != null && player.getCurrentArmor(1) != null && player.getCurrentArmor(0) != null) {
	    	   ItemStack helmet = player.getCurrentArmor(3);
	    	   ItemStack plate = player.getCurrentArmor(2);
	    	   ItemStack legs = player.getCurrentArmor(1);
	    	   ItemStack boots = player.getCurrentArmor(0);
	    	   
	    	   if (helmet.getItem() == VanillaPlusItems.scuba_helmet && plate.getItem() == VanillaPlusItems.scuba_plate && legs.getItem() == VanillaPlusItems.scuba_legs && boots.getItem() == VanillaPlusItems.scuba_boots) {

	    		   if(world.getBlockState(player.getPosition()).getBlock() == Blocks.water)
    		   			player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 1 * 20, 0, false, false));
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
