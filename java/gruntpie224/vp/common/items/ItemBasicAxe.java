package gruntpie224.vp.common.items;

import gruntpie224.vp.VanillaPlus;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ItemBasicAxe extends ItemAxe {

    public Item repair;

    public ItemBasicAxe(ToolMaterial material, Item repairItem) {
        super(material);
        setCreativeTab(VanillaPlus.vanillaPlusTabs);
        this.repair=repairItem;
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.isItemEqual(new ItemStack(this.repair,1,0))||super.getIsRepairable(toRepair, repair);
    }
}
