package gruntpie224.vp.common.items;

import gruntpie224.vp.VanillaPlus;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemBasicSword extends ItemSword {

    public Item repair;
    public ItemBasicSword(ToolMaterial par2EnumToolMaterial, Item par1Item)
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
