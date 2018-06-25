package net.vanillaplus.block;

import static net.minecraftforge.common.util.ForgeDirection.UP;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldProviderEnd;
import net.minecraftforge.common.util.ForgeDirection;
import net.vanillaplus.common.VanillaPlus;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMagmaOre extends Block
{
    public BlockMagmaOre(Material par2Material)
    {
        super(par2Material);
        this.setCreativeTab(VanillaPlus.VanillaPlusTabBlocks);
        setHardness(6.0f);
        setHarvestLevel("pickaxe", 2);
    }
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(VanillaPlus.modid + ":" + this.getUnlocalizedName().substring(5));
    }

    @Override
    public boolean isFireSource(World world, int x, int y, int z, ForgeDirection side)
    {
        if (this == VanillaPlus.magmaOre && side == UP)
        {
            return true;
        }
        if ((world.provider instanceof WorldProviderEnd) && this == Blocks.bedrock && side == UP)
        {
            return true;
        }
        return false;
    }
    
    public Item getItemDropped(int metadata, Random rand, int fortune){
    	return VanillaPlus.magmaChunk;
    }
    
    public int quantityDropped(Random rand)
    {
        return 1;
    }
    
    private Random rand = new Random();
    @Override
    public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_)
    {
        if (this.getItemDropped(p_149690_5_, rand, p_149690_7_) != Item.getItemFromBlock(this))
        {  
            return MathHelper.getRandomIntegerInRange(rand, 1, 5);
        }
        return 0;
    }

}
