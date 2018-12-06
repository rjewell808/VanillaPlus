package gruntpie224.vp.common.items;

import gruntpie224.vp.VanillaPlus;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ItemMagmaSword extends ItemSword {

    private String magma_key1 = "vp.magma.1";
    private String magma_key2 = "vp.magma.2";
    private String magma_key3 = "vp.magma.3";

    public ItemMagmaSword(ToolMaterial material) {
        super(material);
        setCreativeTab(VanillaPlus.vanillaPlusTabs);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
       tooltip.add(I18n.format(magma_key1));
       tooltip.add(I18n.format(magma_key2));
       tooltip.add(I18n.format(magma_key3));
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

        ItemStack stack = player.getHeldItem(EnumHand.MAIN_HAND);
        pos=pos.offset(facing);

        if(!player.canPlayerEdit(pos,facing,stack)){
                return EnumActionResult.FAIL;
        }

        else{
            if(worldIn.isAirBlock(pos)){
                worldIn.playSound(player,(double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, SoundEvents.ITEM_FIRECHARGE_USE,SoundCategory.MASTER, 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
                worldIn.setBlockState(pos, Blocks.FIRE.getDefaultState());
            }
        }
        stack.damageItem(3,player);
        return EnumActionResult.SUCCESS;
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
       target.setFire(8);
       stack.damageItem(1,attacker);
       return true;
    }
}
