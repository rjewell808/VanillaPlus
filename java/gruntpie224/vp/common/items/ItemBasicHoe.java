package gruntpie224.vp.common.items;

import gruntpie224.vp.VanillaPlus;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class ItemBasicHoe extends ItemHoe
{
    public Item repair;
    public ItemBasicHoe(ToolMaterial par2EnumToolMaterial,Item par1Item)
    {
        super(par2EnumToolMaterial);
        this.setCreativeTab(VanillaPlus.vanillaPlusTabs);
        this.repair = par1Item;
    }

    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return par2ItemStack.isItemEqual(new ItemStack(this.repair, 1, 0)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
    }
}
