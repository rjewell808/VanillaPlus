package gruntpie224.vanillaplus.items;

import java.util.List;

import gruntpie224.vanillaplus.VanillaPlus;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class ItemMagmaSword extends ItemSword
{
 
	public ItemMagmaSword(ToolMaterial par2EnumToolMaterial)
    {
        super(par2EnumToolMaterial);
        this.setCreativeTab(VanillaPlus.tabVanillaPlusItems);
    }
   

    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
    	 par3List.add("\u00a76+Fire Damage");
         par3List.add("\u00a76+Right-Click for F&S");
         par3List.add("\u00a7c-3 Duribility Per F&S");
    }
    
    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
    {
    	pos = pos.offset(side);

        if (!playerIn.canPlayerEdit(pos, side, stack))
        {
            return false;
        }
        else
        {
            if (worldIn.isAirBlock(pos))
            {
                worldIn.playSoundEffect((double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
                worldIn.setBlockState(pos, Blocks.fire.getDefaultState());
            }

            stack.damageItem(3, playerIn);
            return true;
        }
        
    }
       
    

    
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
    {
        par2EntityLivingBase.setFire(8);
        par1ItemStack.damageItem(1, par3EntityLivingBase);
        return true;
    }
}
