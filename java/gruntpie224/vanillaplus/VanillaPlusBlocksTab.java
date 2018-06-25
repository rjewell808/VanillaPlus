package gruntpie224.vanillaplus;

import gruntpie224.vanillaplus.init.VanillaPlusBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class VanillaPlusBlocksTab extends CreativeTabs{

	public VanillaPlusBlocksTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(VanillaPlusBlocks.obsidian_reinforced);
	}
	
}
