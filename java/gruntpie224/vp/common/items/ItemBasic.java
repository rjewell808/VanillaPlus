package gruntpie224.vp.common.items;

import gruntpie224.vp.VanillaPlus;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBasic  extends Item {


    private boolean isSpecial;


    public ItemBasic(){
        setCreativeTab(VanillaPlus.vanillaPlusTabs);
    }

    public ItemBasic(boolean isSpecial){

        setCreativeTab(VanillaPlus.vanillaPlusTabs);
        this.isSpecial=isSpecial;
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return isSpecial;
    }
}
