package gruntpie224.vanillaplus.helpers;

import gruntpie224.vanillaplus.VanillaPlus;
import gruntpie224.vanillaplus.init.VanillaPlusItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler
{
    @Override
    public int getBurnTime(ItemStack fuel)
    {

        if (fuel.getItem() == VanillaPlusItems.gravel_clump)
        {
            return 2650;
        }
     	
        if (fuel.getItem() == VanillaPlusItems.magma_chunk)
        {
            return 21000;
        }
        else
        {
            return 0;
        }
    }
}

