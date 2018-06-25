package net.vanillaplus.helpers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.vanillaplus.common.VanillaPlus;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler
{
    @Override
    public int getBurnTime(ItemStack fuel)
    {

        if (fuel.getItem() == VanillaPlus.gravelClump)
        {
            return 2650;
        }
     	
        if (fuel.getItem() == VanillaPlus.magmaChunk)
        {
            return 21000;
        }
        else
        {
            return 0;
        }
    }
}
