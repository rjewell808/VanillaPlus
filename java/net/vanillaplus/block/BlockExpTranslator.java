package net.vanillaplus.block;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.vanillaplus.common.VanillaPlus;
import net.vanillaplus.renderer.TileEntityExpTranslator;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockExpTranslator extends BlockContainer {

	
	
	public BlockExpTranslator(int texture, Material material) {
		super(material);
		this.setCreativeTab(VanillaPlus.VanillaPlusTabBlocks);
		this.setBlockBounds(0F, 0F, 0F, 1F, 0.55F, 1F);
		this.setStepSound(soundTypeWood);
		this.setLightLevel(0.5F);
	}


	/**
	* The type of render function that is called for this block
	*/
	public int getRenderType()
	{
		return -2;
	}

	/**
	* Is this block (a) opaque and (B) a full 1m cube? This determines whether or not to render the shared face of two
	* adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
	*/
	public boolean isOpaqueCube()
	{
		return false;
	}

	/**
	* If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
	*/
	public boolean renderAsNormalBlock()
	{
		return false;
	}
	
	public void onBlockPlacedBy(World world, int i, int j, int k, EntityLiving entityliving)
	{
		int rotation = MathHelper.floor_double((double)((entityliving.rotationYaw * 4F) / 360F) + 2.5D) & 3;
		world.setBlock(i, j, k, VanillaPlus.expTranslator, rotation - 1, rotation - 1);
	}
	

	public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
		 double d0 = (double)par2 + 0.125D;
	        double d1 = (double)par3 + 0.5D;
	        double d2 = (double)par4 + 0.6D;
	        double d3 = 0.2199999988079071D;
	        double d4 = 0.27000001072883606D;
        super.randomDisplayTick(par1World, par2, par3, par4, par5Random);

        for (int l = par2 - 2; l <= par2 + 2; ++l)
        {
            for (int i1 = par4 - 2; i1 <= par4 + 2; ++i1)
            {
                if (l > par2 - 2 && l < par2 + 2 && i1 == par4 - 1)
                {
                    i1 = par4 + 2;
                }

                if (par5Random.nextInt(25) == 0)
                {
                    for (int j1 = par3; j1 <= par3 + 1; ++j1)
                    {
                    		par1World.spawnParticle("flame", d0, d1 + d3, d2 + d4, 0.0D, 0.0D, 0.0D);
                    		par1World.spawnParticle("flame", d0, d1 + d3, d2 + d4-0.725D, 0.0D, 0.0D, 0.0D);
                    		par1World.spawnParticle("flame", d0+0.725D, d1 + d3, d2 + d4, 0.0D, 0.0D, 0.0D);
                    		par1World.spawnParticle("flame", d0+0.725D, d1 + d3, d2 + d4-0.725D, 0.0D, 0.0D, 0.0D);
                            //par1World.spawnParticle("happyVillager", (double)par2 + 0.625D, (double)par3 + 1.5D, (double)par4 + 0.625D, (double)((float)(l - par2) + par5Random.nextFloat()) - 0.5D, (double)((float)(j1 - par3) - par5Random.nextFloat() - 1.0F), (double)((float)(i1 - par4) + par5Random.nextFloat()) - 0.5D);
                        }
                    }
                }
            }
        }
    

	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister par1IconRegister)
	{
	    this.blockIcon = par1IconRegister.registerIcon(VanillaPlus.modid + ":" + this.getUnlocalizedName().substring(5));
	}
	
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {

		return new TileEntityExpTranslator();
	}

}