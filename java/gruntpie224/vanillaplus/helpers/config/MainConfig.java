package gruntpie224.vanillaplus.helpers.config;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class MainConfig {

/////////////////////////////////////////
//
//ITEM AND BLOCK CONFIG
//
/////////////////////////////////////////
//Block ID
public static int obsidianForcedID;
public static int magmaOreID;
public static int goldenEggID;
public static int magmaEggID;
public static int enchantedEggID;
public static int xpOreID;
public static int gravelCompactID;
public static int enderCrystalOreID;
public static int hellFireOreID;
public static int rubyOreID;
public static int sapphireOreID;
public static int rubyBlockID;
public static int sapphireBlockID;
public static int hellStoneBlockID;
public static int birchDoorID;
public static int spruceDoorID;
public static int jungleDoorID;
public static int expTranslatorID;

//Item ID
public static int magmaChunkID;
public static int enchantedRockID;
public static int gravelClumpID;
public static int skeletonHeadFragID;
public static int creeperHeadFragID;
public static int zombieHeadFragID;
public static int enchantedGemID;
public static int goldenFeatherID;
public static int scubaHelmetID;
public static int scubaTankID;
public static int scubaPantsID;
public static int scubaFlippersID;
public static int bloatedInkSacID;
public static int airTankID;
public static int hellStoneID;
public static int rubyID;
public static int sapphireID;
public static int guardianIngotID;
public static int purifiedGoldID;
public static int diamondRodID;
public static int birchDoorItemID;
public static int spruceDoorItemID;
public static int jungleDoorItemID;
public static int emptyExpBottleID;
public static int filledExpBottleID;

//SPECIALIZED SWORDS
public static int enchantedSwordID;
public static int magmaSwordID;
public static int inkSwordID;
public static int beeHorseSwordID;

//BOWS
public static int rapidBowID;

//FOOD
public static int cookedFleshID;
public static int seasonedFleshID;
public static int slimeJellyID;
public static int slimeSandwichID;
public static int toastID;
public static int toastedSlimeSandwichID;

//OBSIDIAN
public static int obsidianPickaxeID;
public static int obsidianAxeID;
public static int obsidianShovelID;
public static int obsidianSwordID;
public static int obsidianHoeID;
public static int obsidianHelmetID;
public static int obsidianPlateID;
public static int obsidianLegsID;
public static int obsidianBootsID;

//EMERALD
public static int emeraldPickaxeID;
public static int emeraldAxeID;
public static int emeraldShovelID;
public static int emeraldSwordID;
public static int emeraldHoeID;
public static int emeraldHelmetID;
public static int emeraldPlateID;
public static int emeraldLegsID;
public static int emeraldBootsID;

//GRAVEL
public static int gravelPickaxeID;
public static int gravelAxeID;
public static int gravelShovelID;
public static int gravelSwordID;
public static int gravelHoeID;

//PURIFIED GOLD
public static int pGoldPickaxeID;
public static int pGoldAxeID;
public static int pGoldShovelID;
public static int pGoldSwordID;
public static int pGoldHoeID;

//ENDER
public static int enderCrystalID;
public static int corruptedEnderCrystalID;
public static int enderGemID;
public static int enderSwordID;
public static int enderPickaxeID;
public static int enderAxeID;
public static int enderShovelID;
public static int enderHoeID;
public static int enderHelmetID;
public static int enderPlateID;
public static int enderLegsID;
public static int enderBootsID;

//SCORCHED
public static int scorchedHelmetID;
public static int scorchedPlateID;
public static int scorchedLegsID;
public static int scorchedBootsID;

//SCORCHED
public static int invHelmetID;
public static int invPlateID;
public static int invLegsID;
public static int invBootsID;

//RUBY
public static int rubyPickaxeID;
public static int rubyAxeID;
public static int rubyShovelID;
public static int rubySwordID;
public static int rubyHoeID;
public static int rubyHelmetID;
public static int rubyPlateID;
public static int rubyLegsID;
public static int rubyBootsID;

//SAPPHIRE
public static int sapphirePickaxeID;
public static int sapphireAxeID;
public static int sapphireShovelID;
public static int sapphireSwordID;
public static int sapphireHoeID;
public static int sapphireHelmetID;
public static int sapphirePlateID;
public static int sapphireLegsID;
public static int sapphireBootsID;

//GENERAL
public static boolean WoodenDoorsBoolean;
public static boolean expTableBoolean;

public static boolean diamondRodsBoolean;
public static boolean mobFragmentGrassBoolean;
public static boolean allWeaponBoolean;

public static boolean obsidianSetBoolean;
public static boolean emeraldSetBoolean;
public static boolean rubySetBoolean;
public static boolean specialSetBoolean;
public static boolean enderSetBoolean;
public static boolean allSetBoolean;

public static boolean cookedFleshBoolean;
public static boolean toastBoolean;
public static boolean allFoodBoolean;

public static boolean overworldOreBoolean;
public static boolean netherOreBoolean;
public static boolean endOreBoolean;

public static int beeHorseMinSpawn;
public static int beeHorseMaxSpawn;
	
	public static void PreInit(FMLPreInitializationEvent event){
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
	     config.load();
	   //General
	        WoodenDoorsBoolean = config.get(Configuration.CATEGORY_GENERAL, "Enable Wooden Doors Recipes", true).getBoolean(false);
	        diamondRodsBoolean = config.get(Configuration.CATEGORY_GENERAL, "Normal DiamondRod Recipe", true).getBoolean(false);
	        obsidianSetBoolean = config.get(Configuration.CATEGORY_GENERAL, "Enable Obsidian Recipes", true).getBoolean(false);
	        emeraldSetBoolean = config.get(Configuration.CATEGORY_GENERAL, "Enable Emerald Recipes", true).getBoolean(false);
	        rubySetBoolean = config.get(Configuration.CATEGORY_GENERAL, "Enable Ruby/Sapphire Recipes", true).getBoolean(false);
	        specialSetBoolean = config.get(Configuration.CATEGORY_GENERAL, "Enable Special Armor Recipes", true).getBoolean(false);
	        enderSetBoolean = config.get(Configuration.CATEGORY_GENERAL, "Enable Ender Recipes", true).getBoolean(false);
	        mobFragmentGrassBoolean = config.get(Configuration.CATEGORY_GENERAL, "Enable Mob-Fragment Drops", true).getBoolean(false);
	        cookedFleshBoolean = config.get(Configuration.CATEGORY_GENERAL, "Enable Cooked Flesh Recipe", true).getBoolean(false);
	        toastBoolean = config.get(Configuration.CATEGORY_GENERAL, "Enable Toast Recipe", true).getBoolean(false);
	        allFoodBoolean = config.get(Configuration.CATEGORY_GENERAL, "Enable VanillaPlus Food Recipes", true).getBoolean(false);
	        allSetBoolean = config.get(Configuration.CATEGORY_GENERAL, "Enable VanillaPlus Armor/Tool Recipes", true).getBoolean(false);
	        allWeaponBoolean = config.get(Configuration.CATEGORY_GENERAL, "Enable VanillaPlus Special Weapon Recipes", true).getBoolean(false);
	        expTableBoolean = config.get(Configuration.CATEGORY_GENERAL, "Enable Exp-Table Recipe", true).getBoolean(false);
	        overworldOreBoolean = config.get(Configuration.CATEGORY_GENERAL, "Enable Overworld Ore Generation", true).getBoolean(false);
	        netherOreBoolean = config.get(Configuration.CATEGORY_GENERAL, "Enable Nether Ore Generation", true).getBoolean(false);
	        endOreBoolean = config.get(Configuration.CATEGORY_GENERAL, "Enable End Ore Generation", true).getBoolean(false);
	        beeHorseMinSpawn = config.getInt("beeHorseMinSpawn", Configuration.CATEGORY_GENERAL, 1, 0, 100, "BeeHorse Sword Min Spawn Rate");
	        beeHorseMaxSpawn = config.getInt("beeHorseMaxSpawn", Configuration.CATEGORY_GENERAL, 5, 0, 100, "BeeHorse Sword Max Spawn Rate");
	        
	        /*
	        //Blocks
	        obsidianForcedID = config.get(Configuration.CATEGORY_BLOCK, "Reinforced Obsidian", 3000).getInt();
	        magmaOreID = config.get(Configuration.CATEGORY_BLOCK, "Magma Ore", 3001).getInt();
	        goldenEggID = config.get(Configuration.CATEGORY_BLOCK, "Golden Egg", 3002).getInt();
	        xpOreID = config.get(Configuration.CATEGORY_BLOCK, "Enchanted Ore", 3003).getInt();
	        gravelCompactID = config.get(Configuration.CATEGORY_BLOCK, "Compacted Gravel", 3004).getInt();
	        magmaEggID = config.get(Configuration.CATEGORY_BLOCK, "Magma Egg", 3005).getInt();
	        enchantedEggID = config.get(Configuration.CATEGORY_BLOCK, "Enchanted Egg", 3006).getInt();
	        enderCrystalOreID = config.get(Configuration.CATEGORY_BLOCK,"EnderCrystal Ore", 3007).getInt();
	        hellFireOreID = config.get(Configuration.CATEGORY_BLOCK,"HellFire Ore", 3008).getInt();
	        rubyOreID = config.get(Configuration.CATEGORY_BLOCK,"Ruby Ore", 3009).getInt();
	        sapphireOreID = config.get(Configuration.CATEGORY_BLOCK,"Sapphire Ore", 3010).getInt();
	        rubyBlockID = config.get(Configuration.CATEGORY_BLOCK,"Ruby Block", 3011).getInt();
	        sapphireBlockID = config.get(Configuration.CATEGORY_BLOCK,"Sapphire Block", 3012).getInt();
	        hellStoneBlockID = config.get(Configuration.CATEGORY_BLOCK,"HellStone Block", 3013).getInt();
	        birchDoorID = config.get(Configuration.CATEGORY_BLOCK,"Birch Door", 3014).getInt();
	        spruceDoorID = config.get(Configuration.CATEGORY_BLOCK,"Spruce Door", 3015).getInt();
	        jungleDoorID = config.get(Configuration.CATEGORY_BLOCK,"Jungle Door", 3016).getInt();
	        expTranslatorID = config.get(Configuration.CATEGORY_BLOCK,"Exp-Translator", 3017).getInt();
	     
	        //Items
	        magmaChunkID = config.get(Configuration.CATEGORY_ITEM, "Magma Chunk", 6020).getInt();
	        enchantedRockID = config.get(Configuration.CATEGORY_ITEM, "Enchanted Rock", 6022).getInt();
	        skeletonHeadFragID = config.get(Configuration.CATEGORY_ITEM, "SkeletonHead Fragment", 6031).getInt();
	        creeperHeadFragID = config.get(Configuration.CATEGORY_ITEM, "CreeperHead Fragment", 6030).getInt();
	        zombieHeadFragID = config.get(Configuration.CATEGORY_ITEM, "ZombieHead Fragment", 6032).getInt();
	        gravelClumpID = config.get(Configuration.CATEGORY_ITEM, "Flint Compound", 6024).getInt();
	        enchantedGemID = config.get(Configuration.CATEGORY_ITEM, "Enchanted Gem", 6034).getInt();
	        goldenFeatherID = config.get(Configuration.CATEGORY_ITEM, "Golden Feather", 6035).getInt();
	        slimeJellyID = config.get(Configuration.CATEGORY_ITEM, "Slime Jelly", 6036).getInt();
	        bloatedInkSacID = config.get(Configuration.CATEGORY_ITEM, "Bloated InkSac", 6055).getInt();
	        airTankID = config.get(Configuration.CATEGORY_ITEM, "Air Tank", 6056).getInt();
	        hellStoneID = config.get(Configuration.CATEGORY_ITEM, "Hell Stone", 6057).getInt();
	        rubyID = config.get(Configuration.CATEGORY_ITEM, "Ruby", 6063).getInt();
	        sapphireID = config.get(Configuration.CATEGORY_ITEM, "Sapphire", 6064).getInt();
	        diamondRodID = config.get(Configuration.CATEGORY_ITEM, "Diamond Rod",6096).getInt();
	        birchDoorItemID = config.get(Configuration.CATEGORY_ITEM, "Birch Door",6099).getInt();
	        spruceDoorItemID = config.get(Configuration.CATEGORY_ITEM, "Spruce Door",6100).getInt();
	        jungleDoorItemID = config.get(Configuration.CATEGORY_ITEM, "Jungle Door",6101).getInt();
	        emptyExpBottleID = config.get(Configuration.CATEGORY_ITEM, "Empty Vial",6102).getInt();
	        filledExpBottleID = config.get(Configuration.CATEGORY_ITEM, "XP Vial",6103).getInt();
	        
	        scubaHelmetID = config.get(Configuration.CATEGORY_ITEM, "Scuba Helmet", 6051).getInt();
	        scubaTankID = config.get(Configuration.CATEGORY_ITEM, "Scuba Tank", 6052).getInt();
	        scubaPantsID = config.get(Configuration.CATEGORY_ITEM, "Scuba Pants", 6053).getInt();
	        scubaFlippersID = config.get(Configuration.CATEGORY_ITEM, "Scuba Flippers", 6054).getInt();
	  
	        //Specialized Swords
	        magmaSwordID = config.get(Configuration.CATEGORY_ITEM, "Magma Sword", 6021).getInt();
	        enchantedSwordID = config.get(Configuration.CATEGORY_ITEM, "Airborn Sword", 6033).getInt();
	        inkSwordID = config.get(Configuration.CATEGORY_ITEM,"Ink Sword", 6038).getInt();
	        beeHorseSwordID = config.get(Configuration.CATEGORY_ITEM,"Bee-Horse Sword", 6098).getInt();
	        
	        //Bows
	        rapidBowID = config.get(Configuration.CATEGORY_ITEM,"Rapid Bow", 6062).getInt();
	        
	        //Food
	        cookedFleshID = config.get(Configuration.CATEGORY_ITEM, "Cooked Flesh", 6018).getInt();
	        seasonedFleshID = config.get(Configuration.CATEGORY_ITEM, "Seasoned Flesh", 6019).getInt();
	        slimeSandwichID = config.get(Configuration.CATEGORY_ITEM, "Slime Sandwich", 6037).getInt();
	        toastID = config.get(Configuration.CATEGORY_ITEM, "Toast", 6095).getInt();
	        toastedSlimeSandwichID = config.get(Configuration.CATEGORY_ITEM, "Toasted Slime Sandwich", 6097).getInt();
	        
	        //Obsidian
	        obsidianPickaxeID = config.get(Configuration.CATEGORY_ITEM, "Obsidian Pickaxe", 6000).getInt();
	        obsidianAxeID = config.get(Configuration.CATEGORY_ITEM, "Obsidian Axe", 6001).getInt();
	        obsidianShovelID = config.get(Configuration.CATEGORY_ITEM, "Obsidian Shovel", 6002).getInt();
	        obsidianSwordID = config.get(Configuration.CATEGORY_ITEM, "Obsidian Sword", 6003).getInt();
	        obsidianHoeID = config.get(Configuration.CATEGORY_ITEM, "Obsidian Hoe", 6004).getInt();
	        obsidianHelmetID = config.get(Configuration.CATEGORY_ITEM, "Obsidian Helmet", 6005).getInt();
	        obsidianPlateID = config.get(Configuration.CATEGORY_ITEM, "Obsidian Chestplate", 6006).getInt();
	        obsidianLegsID = config.get(Configuration.CATEGORY_ITEM, "Obsidian Leggings", 6007).getInt();
	        obsidianBootsID = config.get(Configuration.CATEGORY_ITEM, "Obsidian Boots", 6008).getInt();
	        
	        //Emerald
	        emeraldPickaxeID = config.get(Configuration.CATEGORY_ITEM, "Emerald Pickaxe", 6009).getInt();
	        emeraldAxeID = config.get(Configuration.CATEGORY_ITEM, "Emerald Axe", 6010).getInt();
	        emeraldShovelID = config.get(Configuration.CATEGORY_ITEM, "Emerald Shovel", 6011).getInt();
	        emeraldSwordID = config.get(Configuration.CATEGORY_ITEM, "Emerald Sword", 6012).getInt();
	        emeraldHoeID = config.get(Configuration.CATEGORY_ITEM, "Emerald Hoe", 6013).getInt();
	        emeraldHelmetID = config.get(Configuration.CATEGORY_ITEM, "Emerald Helmet", 6014).getInt();
	        emeraldPlateID = config.get(Configuration.CATEGORY_ITEM, "Emerald Chestplate", 6015).getInt();
	        emeraldLegsID = config.get(Configuration.CATEGORY_ITEM, "Emerald Leggings", 6016).getInt();
	        emeraldBootsID = config.get(Configuration.CATEGORY_ITEM, "Emerald Boots", 6017).getInt();
	        
	        //Gravel
	        gravelPickaxeID = config.get(Configuration.CATEGORY_ITEM, "Gravel Pickaxe", 6025).getInt();
	        gravelAxeID = config.get(Configuration.CATEGORY_ITEM, "Gravel Axe", 6026).getInt();
	        gravelShovelID = config.get(Configuration.CATEGORY_ITEM, "Gravel Shovel", 6027).getInt();
	        gravelSwordID = config.get(Configuration.CATEGORY_ITEM, "Gravel Sword", 6028).getInt();
	        gravelHoeID = config.get(Configuration.CATEGORY_ITEM, "Gravel Hoe", 6029).getInt();
	        
	        //Ender
	        enderCrystalID = config.get(Configuration.CATEGORY_ITEM, "Ender Crystal", 6039).getInt();
	        enderSwordID = config.get(Configuration.CATEGORY_ITEM, "Ender Sword", 6040).getInt();
	        enderPickaxeID = config.get(Configuration.CATEGORY_ITEM, "Ender Pickaxe", 6041).getInt();
	        enderAxeID = config.get(Configuration.CATEGORY_ITEM, "Ender Axe", 6042).getInt();
	        enderShovelID = config.get(Configuration.CATEGORY_ITEM, "Ender Shovel", 6043).getInt();
	        enderHoeID = config.get(Configuration.CATEGORY_ITEM, "Ender Hoe", 6044).getInt();
	        enderHelmetID = config.get(Configuration.CATEGORY_ITEM, "Ender Helmet", 6045).getInt();
	        enderPlateID = config.get(Configuration.CATEGORY_ITEM, "Ender Chestplate", 6046).getInt();
	        enderLegsID = config.get(Configuration.CATEGORY_ITEM, "Ender Leggings", 6047).getInt();
	        enderBootsID = config.get(Configuration.CATEGORY_ITEM, "Ender Boots", 6048).getInt();
	        corruptedEnderCrystalID = config.get(Configuration.CATEGORY_ITEM, "Corrupted Ender Crystal", 6049).getInt();
	        enderGemID = config.get(Configuration.CATEGORY_ITEM, "Ender Gem", 6050).getInt();
	        guardianIngotID = config.get(Configuration.CATEGORY_ITEM, "Guardian Ingot", 6087).getInt();
	        purifiedGoldID = config.get(Configuration.CATEGORY_ITEM, "Purified Gold", 6088).getInt();
	        
	        //Scorched
	        scorchedHelmetID = config.get(Configuration.CATEGORY_ITEM, "Scorched Helmet", 6058).getInt();
	        scorchedPlateID = config.get(Configuration.CATEGORY_ITEM, "Scorched Chestplate", 6059).getInt();
	        scorchedLegsID = config.get(Configuration.CATEGORY_ITEM, "Scorched Leggings", 6060).getInt();
	        scorchedBootsID = config.get(Configuration.CATEGORY_ITEM, "Scorched Boots", 6061).getInt();
	        
	        //Guardian
	        invHelmetID = config.get(Configuration.CATEGORY_ITEM, "Guardian Helmet", 6083).getInt();
	        invPlateID = config.get(Configuration.CATEGORY_ITEM, "Guradian Chestplate", 6084).getInt();
	        invLegsID = config.get(Configuration.CATEGORY_ITEM, "Guradian Leggings", 6085).getInt();
	        invBootsID = config.get(Configuration.CATEGORY_ITEM, "Guradian Boots", 6086).getInt();
	        
	        //Ruby
	        rubyPickaxeID = config.get(Configuration.CATEGORY_ITEM, "Ruby Pickaxe", 6065).getInt();
	        rubyAxeID = config.get(Configuration.CATEGORY_ITEM, "Ruby Axe", 6066).getInt();
	        rubyShovelID = config.get(Configuration.CATEGORY_ITEM, "Ruby Shovel", 6067).getInt();
	        rubySwordID = config.get(Configuration.CATEGORY_ITEM, "Ruby Sword", 6068).getInt();
	        rubyHoeID = config.get(Configuration.CATEGORY_ITEM, "Ruby Hoe", 6069).getInt();
	        rubyHelmetID = config.get(Configuration.CATEGORY_ITEM, "Ruby Helmet", 6070).getInt();
	        rubyPlateID = config.get(Configuration.CATEGORY_ITEM, "Ruby Chestplate", 6071).getInt();
	        rubyLegsID = config.get(Configuration.CATEGORY_ITEM, "Ruby Leggings", 6072).getInt();
	        rubyBootsID = config.get(Configuration.CATEGORY_ITEM, "Ruby Boots", 6073).getInt();
	        
	      //Sapphire
	        sapphirePickaxeID = config.get(Configuration.CATEGORY_ITEM, "Sapphire Pickaxe", 6074).getInt();
	        sapphireAxeID = config.get(Configuration.CATEGORY_ITEM, "Sapphire Axe", 6075).getInt();
	        sapphireShovelID = config.get(Configuration.CATEGORY_ITEM, "Sapphire Shovel", 6076).getInt();
	        sapphireSwordID = config.get(Configuration.CATEGORY_ITEM, "Sapphire Sword", 6077).getInt();
	        sapphireHoeID = config.get(Configuration.CATEGORY_ITEM, "Sapphire Hoe", 6078).getInt();
	        sapphireHelmetID = config.get(Configuration.CATEGORY_ITEM, "Sapphire Helmet", 6079).getInt();
	        sapphirePlateID = config.get(Configuration.CATEGORY_ITEM, "Sapphire Chestplate", 6080).getInt();
	        sapphireLegsID = config.get(Configuration.CATEGORY_ITEM, "Sapphire Leggings", 6081).getInt();
	        sapphireBootsID = config.get(Configuration.CATEGORY_ITEM, "Sapphire Boots", 6082).getInt();
	        
	      //Purified Gold
	        pGoldPickaxeID = config.get(Configuration.CATEGORY_ITEM, "Purified Pickaxe", 6089).getInt();
	        pGoldAxeID = config.get(Configuration.CATEGORY_ITEM, "Purified Axe", 6090).getInt();
	        pGoldShovelID = config.get(Configuration.CATEGORY_ITEM, "Purified Shovel", 6091).getInt();
	        pGoldSwordID = config.get(Configuration.CATEGORY_ITEM, "Purified Sword", 6092).getInt();
	        pGoldHoeID = config.get(Configuration.CATEGORY_ITEM, "Purified Hoe", 6093).getInt();
	        */
	     config.save();
	}
	
}
