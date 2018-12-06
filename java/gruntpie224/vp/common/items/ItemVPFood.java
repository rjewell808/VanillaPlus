package gruntpie224.vp.common.items;


import gruntpie224.vp.VanillaPlus;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ItemVPFood extends ItemFood {

    private int food_amount;
    private String food_key = "vp.food.fills";
    public ItemVPFood(int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        this.food_amount=amount;
        setCreativeTab(VanillaPlus.vanillaPlusTabs);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(TextFormatting.YELLOW+I18n.format(food_key) + (this.food_amount / 2.0));

    }
}
