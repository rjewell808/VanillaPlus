package gruntpie224.vanillaplus.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import gruntpie224.vanillaplus.VanillaPlus;

public class ItemVanillaPlusFood extends ItemFood{

	private int food_amount;
	
    public ItemVanillaPlusFood(int amount, float saturation, boolean isWolfFood)
    {
        super(amount, saturation, isWolfFood);
        this.food_amount = amount;
        this.setCreativeTab(VanillaPlus.tabVanillaPlusItems);
    }

    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("\u00a7eFills " + (this.food_amount / 2.0) + " Hunger");
    }
}
