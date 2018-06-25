package gruntpie224.vanillaplus.helpers;

import gruntpie224.vanillaplus.init.VanillaPlusBlocks;
import gruntpie224.vanillaplus.init.VanillaPlusItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.StatBase;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class VanillaAchievements {

	//ACHIEVEMENTS
    
    public static Achievement cookedFleshACH;
    public static Achievement seasonedFleshACH;
    public static Achievement enchantedGemACH;
    public static Achievement magmaSwordACH;
    public static Achievement airborneSwordACH;
    public static Achievement inkSwordACH;
    public static Achievement enchantedDustACH;
    public static Achievement xpBottleACH;
    public static Achievement beehorseSwordACH;
    
    
	public static void Init(){
		
		
		cookedFleshACH = (Achievement) new Achievement("achievement.cookedFlesh","cookedFlesh", 0, 0, VanillaPlusItems.cooked_flesh, (Achievement)null).initIndependentStat().registerStat();
			seasonedFleshACH = (Achievement) new Achievement("achievement.seasonedFlesh","seasonedFlesh", 2, 0, Items.wheat_seeds, (Achievement) cookedFleshACH).registerStat(); 
		
		enchantedDustACH = (Achievement) new Achievement("achievement.enchantedDust","enchantedDust", 2, 3, VanillaPlusBlocks.enchanted_ore, (Achievement)null).initIndependentStat().registerStat(); 
			enchantedGemACH = (Achievement) new Achievement("achievement.enchantedGem","enchantedGem", 5, 2, VanillaPlusItems.enchanted_gem, (Achievement) enchantedDustACH).registerStat(); 
				magmaSwordACH = (Achievement) new Achievement("achievement.magmaSword","magmaSword", 7, 1, VanillaPlusItems.magma_sword, (Achievement) enchantedGemACH).registerStat(); 
				inkSwordACH = (Achievement) new Achievement("achievement.inkSword","inkSword", 7, 2, VanillaPlusItems.ink_sword, (Achievement) enchantedGemACH).registerStat(); 
				airborneSwordACH = (Achievement) new Achievement("achievement.airborneSword","airborneSword", 7, 3, VanillaPlusItems.air_sword, (Achievement) enchantedGemACH).registerStat(); 
			xpBottleACH = (Achievement) new Achievement("achievement.xpBottle","xpBottle", 4, 4, Items.experience_bottle, (Achievement) enchantedDustACH).registerStat();

			
		beehorseSwordACH = (Achievement) new Achievement("achievement.beehorseSword","beehorseSword", 7, -1, VanillaPlusItems.bee_sword, (Achievement)null).setSpecial().initIndependentStat().registerStat(); 
		
		
		AchievementPage.registerAchievementPage(new AchievementPage("VanillaPlus",new Achievement[]{beehorseSwordACH,xpBottleACH,cookedFleshACH,seasonedFleshACH,enchantedDustACH,enchantedGemACH,magmaSwordACH,inkSwordACH,airborneSwordACH}));
		  
	}
	
}
