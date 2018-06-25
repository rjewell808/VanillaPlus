package gruntpie224.vanillaplus;

import gruntpie224.vanillaplus.init.VanillaPlusItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class VanillaPlusItemsTab extends CreativeTabs{

	public VanillaPlusItemsTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return VanillaPlusItems.enchanted_dust;
	}
	
}
