package gruntpie224.vp.common.items;

import gruntpie224.vp.VanillaPlus;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ItemBeeSword extends ItemSword {
    private String bee_sword_key1="vp.bee.text.1";
    private String bee_sword_key2="vp.bee.text.2";
    private String bee_sword_key3="vp.bee.text.3";
    private String bee_sword_key4="vp.bee.text.4";



    public ItemBeeSword(ToolMaterial material) {
        super(material);
        setCreativeTab(VanillaPlus.vanillaPlusTabs);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(I18n.format(bee_sword_key1));
        tooltip.add(I18n.format(bee_sword_key2));
        tooltip.add(I18n.format(bee_sword_key3));
        tooltip.add(I18n.format(bee_sword_key4));
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        target.addPotionEffect(new PotionEffect(MobEffects.POISON,12*20,0));
        attacker.setHeldItem(EnumHand.MAIN_HAND,new ItemStack(Items.STONE_SWORD));

        return true;
    }
}
