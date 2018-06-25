package gruntpie224.vanillaplus.items;

import java.util.List;

import gruntpie224.vanillaplus.VanillaPlus;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBasicSword extends ItemSword{

	public Item repair;
    public ItemBasicSword(ToolMaterial par2EnumToolMaterial, Item par1Item)
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
