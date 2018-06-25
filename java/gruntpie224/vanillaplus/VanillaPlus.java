package gruntpie224.vanillaplus;

import gruntpie224.vanillaplus.helpers.CraftingHandler;
import gruntpie224.vanillaplus.helpers.MobDropHandler;
import gruntpie224.vanillaplus.helpers.VanillaAchievements;
import gruntpie224.vanillaplus.helpers.config.ConfigGuiEventHandler;
import gruntpie224.vanillaplus.helpers.config.ConfigHandler;
import gruntpie224.vanillaplus.init.VanillaPlusBlocks;
import gruntpie224.vanillaplus.init.VanillaPlusItems;
import gruntpie224.vanillaplus.proxy.CommonProxy;
import gruntpie224.vanillaplus.world.OreWorldGen;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = "gruntpie224.vanillaplus.helpers.config.GuiFactory")
public class VanillaPlus {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final VanillaPlusBlocksTab tabVanillaPlusBlocks = new VanillaPlusBlocksTab("vanillaplusBlocks");
	public static final VanillaPlusItemsTab tabVanillaPlusItems = new VanillaPlusItemsTab("vanillaplusItems");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		VanillaPlusBlocks.init();
		VanillaPlusBlocks.register();
		VanillaPlusBlocks.registerTileEntity();
		VanillaPlusItems.init();
		VanillaPlusItems.register();
		
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigHandler());
		FMLCommonHandler.instance().bus().register(new CraftingHandler());
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.registerRenders();
		
		VanillaPlusRecipes.Init();
		VanillaPlusItems.InitBow(event);
		VanillaAchievements.Init();
		GameRegistry.registerWorldGenerator(new OreWorldGen(), 1);
		ChestGenHooks.getInfo("DUNGEON_CHEST").addItem(new WeightedRandomChestContent(new ItemStack(VanillaPlusItems.bee_sword), ConfigHandler.beeHorseMinSpawn, ConfigHandler.beeHorseMaxSpawn, 1));
				//new WeightedRandomChestContent(new ItemStack(beeHorseSword),1,MainConfig.beeHorseMinSpawn,MainConfig.beeHorseMaxSpawn));
		MinecraftForge.EVENT_BUS.register(new ConfigGuiEventHandler());
		MinecraftForge.EVENT_BUS.register(new MobDropHandler());
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}

}
