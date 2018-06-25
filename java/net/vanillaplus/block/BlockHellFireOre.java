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

public class BlockHellFireOre extends Block{

	private Random rand = new Random();
	
	public BlockHellFireOre(Material par2Material) {
		super(par2Material);
		this.setCreativeTab(VanillaPlus.VanillaPlusTabBlocks);
		setHarvestLevel("pickaxe", 4);
	}
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(VanillaPlus.modid + ":" + this.getUnlocalizedName().substring(5));
    }

	@Override
	public int getExpDrop(IBlockAccess world, int metadata, int fortune)
    {
		return MathHelper.getRandomIntegerInRange(rand, 2, 6);
	}
	
	@Override
    public boolean isFireSource(World world, int x, int y, int z, ForgeDirection side)
    {
        if (this == VanillaPlus.hellFireOre && side == UP)
        {
            return true;
        }
        if ((world.provider instanceof WorldProviderEnd) && this == Blocks.bedrock && side == UP)
        {
            return true;
        }
        return false;
    }
	public boolean isFireSource(World world, int x, int y, int z, int metadata, int face)
	{
	        if(face == 0)
	        {
	                return true;
	        }
	        return false;
	}
	
	public Item getItemDropped(int metadata, Random rand, int fortune){
    	return VanillaPlus.hellStone;
    }
    
    public int quantityDropped(Random rand)
    {
        return 1;
    }
}
