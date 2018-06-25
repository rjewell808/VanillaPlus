package gruntpie224.vanillaplus.items;

import gruntpie224.vanillaplus.VanillaPlus;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBasic extends Item{
	private boolean isSpecial;
	
	public ItemBasic() 
	{
		this.setCreativeTab(VanillaPlus.tabVanillaPlusItems);
		this.isSpecial = false;
	}
	
	public ItemBasic(boolean isSpecial) 
	{
		this.setCreativeTab(VanillaPlus.tabVanillaPlusItems);
		this.isSpecial = isSpecial;
	}
	
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return isSpecial;
    }
}
