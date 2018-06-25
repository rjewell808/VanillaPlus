package gruntpie224.vanillaplus.blocks;

import gruntpie224.vanillaplus.VanillaPlus;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockRubyBlock extends Block
{
	   public static final PropertyEnum VARIANT = PropertyEnum.create("variant", BlockRubyBlock.EnumType.class);
	
       public BlockRubyBlock(Material par2Material)
       {
             super(par2Material);
             this.setCreativeTab(VanillaPlus.tabVanillaPlusBlocks);
             setHarvestLevel("pickaxe", 2);
       }
       
		@Override
		protected BlockState createBlockState()
		{
			return new BlockState(this, new IProperty[] {VARIANT});
		}
       
       public IBlockState getStateFromMeta(int meta)
       {
           return this.getDefaultState().withProperty(VARIANT, BlockRubyBlock.EnumType.byMetadata(meta));
       }
       
       public int getMetaFromState(IBlockState state)
       {
           return ((BlockRubyBlock.EnumType)state.getValue(VARIANT)).getMetadata();
       }
       
       public static enum EnumType implements IStringSerializable
       {
           RUBY(0, "ruby"),
           SAPPHIRE(1, "sapphire"),
    	   HELLSTONE(2, "hellstone"),
    	   RUBY2(3, "ruby_special"),
    	   SAPPHIRE2(4, "sapphire_special"),
    	   HELLSTONE2(5, "hellstone_special");
           /** Array of the Block's BlockStates */
           private static final BlockRubyBlock.EnumType[] META_LOOKUP = new BlockRubyBlock.EnumType[values().length];
           /** The BlockState's metadata. */
           private final int meta;
           /** The EnumType's name. */
           private final String name;
           private final String unlocalizedName;

           private EnumType(int meta, String name)
           {
               this(meta, name, name);
           }

           private EnumType(int meta, String name, String unlocalizedName)
           {
               this.meta = meta;
               this.name = name;
               this.unlocalizedName = unlocalizedName;
           }

           /**
            * Returns the EnumType's metadata value.
            */
           public int getMetadata()
           {
               return this.meta;
           }

           public String toString()
           {
               return this.name;
           }

           /**
            * Returns an EnumType for the BlockState from a metadata value.
            */
           public static BlockRubyBlock.EnumType byMetadata(int meta)
           {
               if (meta < 0 || meta >= META_LOOKUP.length)
               {
                   meta = 0;
               }

               return META_LOOKUP[meta];
           }

           public String getName()
           {
               return this.name;
           }

           public String getUnlocalizedName()
           {
               return this.unlocalizedName;
           }

           static
           {
        	   BlockRubyBlock.EnumType[] var0 = values();
               int var1 = var0.length;

               for (int var2 = 0; var2 < var1; ++var2)
               {
            	   BlockRubyBlock.EnumType var3 = var0[var2];
                   META_LOOKUP[var3.getMetadata()] = var3;
               }
           }
       }
       

       @SideOnly(Side.CLIENT)
       public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List par3List)
       {
	        for (int var4 = 0; var4 < 6; ++var4)
	        {
	            par3List.add(new ItemStack(par1, 1, var4));
	        }
       }
       public int damageDropped(int par1)
       {
           return par1;

       }
       
   	
}