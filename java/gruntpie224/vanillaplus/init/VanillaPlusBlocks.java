package gruntpie224.vanillaplus.init;
import gruntpie224.vanillaplus.Reference;
import gruntpie224.vanillaplus.VanillaPlus;
import gruntpie224.vanillaplus.blocks.BlockEnchantedOre;
import gruntpie224.vanillaplus.blocks.BlockEnderCrystalOre;
import gruntpie224.vanillaplus.blocks.BlockGravelCompact;
import gruntpie224.vanillaplus.blocks.BlockHellFireOre;
import gruntpie224.vanillaplus.blocks.BlockMagmaOre;
import gruntpie224.vanillaplus.blocks.BlockObsidianReinforced;
import gruntpie224.vanillaplus.blocks.BlockRubyBlock;
import gruntpie224.vanillaplus.blocks.BlockRubyOre;
import gruntpie224.vanillaplus.blocks.BlockSapphireOre;
import gruntpie224.vanillaplus.items.ItemRubyBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VanillaPlusBlocks {
	public static Block obsidian_reinforced;
	public static Block enchanted_ore;
	public static Block compact_gravel;
	public static Block hellfire_ore;
	public static Block magma_ore;
	public static Block ender_crystal_ore;
	public static Block ruby_block;
	public static Block ruby_ore;
	public static Block sapphire_ore;
	
	public static void init(){
		obsidian_reinforced = new BlockObsidianReinforced(Material.rock).setUnlocalizedName("obsidian_reinforced");
		enchanted_ore = new BlockEnchantedOre(Material.iron).setUnlocalizedName("enchanted_ore");
		compact_gravel = new BlockGravelCompact(Material.ground).setUnlocalizedName("compact_gravel");
		hellfire_ore = new BlockHellFireOre(Material.iron).setUnlocalizedName("hellfire_ore");
		magma_ore = new BlockMagmaOre(Material.iron).setUnlocalizedName("magma_ore");
		ender_crystal_ore = new BlockEnderCrystalOre(Material.iron).setHardness(10.0f).setResistance(2000.0F).setUnlocalizedName("ender_crystal_ore");
		ruby_block = new BlockRubyBlock(Material.iron).setHardness(10.0f).setUnlocalizedName("ruby_block");
		ruby_ore = new BlockRubyOre(Material.iron).setHardness(10.0f).setUnlocalizedName("ruby_ore");
        sapphire_ore = new BlockSapphireOre(Material.iron).setHardness(10.0f).setUnlocalizedName("sapphire_ore");
	}
	
	public static void register(){
		GameRegistry.registerBlock(ruby_ore, "ruby_ore");
		GameRegistry.registerBlock(sapphire_ore, "sapphire_ore");
		GameRegistry.registerBlock(enchanted_ore, "enchanted_ore");
		GameRegistry.registerBlock(magma_ore, "magma_ore");
		GameRegistry.registerBlock(hellfire_ore, "hellfire_ore");
		GameRegistry.registerBlock(ender_crystal_ore, "ender_crystal_ore");
		GameRegistry.registerBlock(obsidian_reinforced, "obsidian_reinforced");	
		GameRegistry.registerBlock(compact_gravel, "compact_gravel");
		GameRegistry.registerBlock(ruby_block,ItemRubyBlock.class,"ruby_block");
	}
	
	public static void registerRenders(){
		registerRender(obsidian_reinforced);
		registerRender(enchanted_ore);
		registerRender(compact_gravel);
		registerRender(hellfire_ore);
		registerRender(magma_ore);
		registerRender(ender_crystal_ore);
		registerRender(ruby_ore);
		registerRender(sapphire_ore);
		Item itemBlockVariants = GameRegistry.findItem(Reference.MOD_ID, "ruby_block");
		
		ModelBakery.addVariantName(itemBlockVariants, 
				"vp:ruby_block_ruby",
	            "vp:ruby_block_sapphire",
	            "vp:ruby_block_hellstone",
	            "vp:ruby_block_ruby_special",
	            "vp:ruby_block_sapphire_special",
	            "vp:ruby_block_hellstone_special");
		
		 ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("vp:ruby_block_ruby", "inventory");
	     Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockVariants, 0, itemModelResourceLocation);
	     
	     itemModelResourceLocation = new ModelResourceLocation("vp:ruby_block_sapphire", "inventory");
	     Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockVariants, 1, itemModelResourceLocation);
	     
	     itemModelResourceLocation = new ModelResourceLocation("vp:ruby_block_hellstone", "inventory");
	     Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockVariants, 2, itemModelResourceLocation);
	     
	     itemModelResourceLocation = new ModelResourceLocation("vp:ruby_block_ruby_special", "inventory");
	     Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockVariants, 3, itemModelResourceLocation); 
	     
	     itemModelResourceLocation = new ModelResourceLocation("vp:ruby_block_sapphire_special", "inventory");
	     Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockVariants, 4, itemModelResourceLocation);
	     
	     itemModelResourceLocation = new ModelResourceLocation("vp:ruby_block_hellstone_special", "inventory");
	     Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockVariants, 5, itemModelResourceLocation);

	}
	
	public static void registerTileEntity(){
		
	}
	
	public static void registerRender(Block block){
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
