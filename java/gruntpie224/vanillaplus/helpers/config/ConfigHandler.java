package gruntpie224.vanillaplus.helpers.config;

import java.io.File;

import gruntpie224.vanillaplus.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ConfigHandler 
{	
	public static Configuration configuration;
	
	public static boolean enable_emerald_recipes;
	public static boolean alt_diamond_rod;
	public static int beeHorseMinSpawn;
	public static int beeHorseMaxSpawn;
	
	public static void init(File configFile)
	{	
		//create the configuration object from the given configuration file
		if (configuration == null)
		{	
			configuration = new Configuration(configFile);
			loadConfiguration();
		}
	}
	
	public static void loadConfiguration()
	{
		configuration.load();
		enable_emerald_recipes = configuration.getBoolean("Emerald Recipes", Configuration.CATEGORY_GENERAL, true, "Enable Emerald Recipes");
		alt_diamond_rod = configuration.getBoolean("Alternate Diamond Rod Recipe", Configuration.CATEGORY_GENERAL, false, "Alternate Diamond Rod Recipe");
		beeHorseMinSpawn = configuration.getInt("BeeSword Min-Spawn", Configuration.CATEGORY_GENERAL, 1, 0, 100, "Bee Sword Min Spawn Rate");
		beeHorseMaxSpawn = configuration.getInt("BeeSword Max-Spawn", Configuration.CATEGORY_GENERAL, 5, 0, 100, "Bee Sword Max Spawn Rate");
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
	{			
		if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
		{
			//loadConfiguration();
			configuration.save();

		}
	}
}
