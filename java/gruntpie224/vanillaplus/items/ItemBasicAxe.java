package gruntpie224.vanillaplus.items;

import gruntpie224.vanillaplus.VanillaPlus;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ItemBasicAxe extends ItemAxe
{
	public Item repair;
    public ItemBasicAxe(ToolMaterial par2EnumToolMaterial, Item parRepair)
    {
        super(par2EnumToolMaterial);
        this.setCreativeTab(VanillaPlus.tabVanillaPlusItems);
        this.repair=parRepair;
    }

    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
    	return par2ItemStack.isItemEqual(new ItemStack(this.repair, 1, 0)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
    }
}

