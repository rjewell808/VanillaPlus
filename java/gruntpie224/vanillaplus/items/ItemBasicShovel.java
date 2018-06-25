package gruntpie224.vanillaplus.items;

import gruntpie224.vanillaplus.VanillaPlus;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBasicShovel extends ItemSpade
{
	public Item repair;
    public ItemBasicShovel(ToolMaterial par2EnumToolMaterial,Item par1Item)
    {
        super(par2EnumToolMaterial);
        this.setCreativeTab(VanillaPlus.tabVanillaPlusItems);
        this.repair = par1Item;
    }
    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
    	return par2ItemStack.isItemEqual(new ItemStack(this.repair, 1, 0)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
    }
}
