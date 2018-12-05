package gruntpie224.vp;

import gruntpie224.vp.init.VPItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class VPCreativeTabs extends CreativeTabs {
    public VPCreativeTabs(String label) {
        super(label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(VPItems.enchanted_gem);
    }
}
