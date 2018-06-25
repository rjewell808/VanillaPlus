package net.vanillaplus.block;

import java.util.Random;

import net.minecraft.block.BlockDragonEgg;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.vanillaplus.common.VanillaPlus;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGoldenEgg extends BlockDragonEgg
{
	
    public BlockGoldenEgg()
    {
    
    }
    public int quantityDropped(Random random)
    {
        return 9;
    }


    public int getRenderType()
    {
        return 27;
    }

    @SideOnly(Side.CLIENT)
    
    
    public void registerIcons(IIconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(VanillaPlus.modid + ":" + this.getUnlocalizedName().substring(5));
    }
}
