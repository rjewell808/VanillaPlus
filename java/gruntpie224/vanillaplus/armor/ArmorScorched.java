package gruntpie224.vanillaplus.armor;

import java.util.List;

import gruntpie224.vanillaplus.Reference;
import gruntpie224.vanillaplus.VanillaPlus;
import gruntpie224.vanillaplus.init.VanillaPlusItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ArmorScorched extends ItemArmor {
	public String armorNamePrefix;
	public ArmorScorched(ArmorMaterial par2EnumArmorMaterial, int par3, int par4,String armornamePrefix) {
        super(par2EnumArmorMaterial, par3, par4);
        this.setCreativeTab(VanillaPlus.tabVanillaPlusItems);
        armorNamePrefix = armornamePrefix;
	}

	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
	    par3List.add("Full Set: \u00a79Fire + Lava Protection");
	    par3List.add("Durability: \u00a7aMedium");
	}
	
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack){
	    
		if (player.getCurrentArmor(3) != null && player.getCurrentArmor(2) != null && player.getCurrentArmor(1) != null && player.getCurrentArmor(0) != null) {
			   ItemStack helmet = player.getCurrentArmor(3);
			   ItemStack plate = player.getCurrentArmor(2);
			   ItemStack legs = player.getCurrentArmor(1);
			   ItemStack boots = player.getCurrentArmor(0);
			   
			if (helmet.getItem() == VanillaPlusItems.scorched_helmet && plate.getItem() == VanillaPlusItems.scorched_plate && legs.getItem() == VanillaPlusItems.scorched_legs && boots.getItem() == VanillaPlusItems.scorched_boots) {
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 1 * 20, 0, false, false));
				player.fireResistance = 10000;
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