package gruntpie224.vp.common.items;

import gruntpie224.vp.VanillaPlus;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ItemInkSword extends ItemSword {

    private String ink_sword_key ="vp.ink.text";

    public ItemInkSword(ToolMaterial material) {
        super(material);
        setCreativeTab(VanillaPlus.vanillaPlusTabs);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(I18n.format(ink_sword_key));
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        stack.damageItem(1,attacker);
        target.addPotionEffect(new PotionEffect(MobEffects.WITHER,12*20,0));
        return true;
    }
}
