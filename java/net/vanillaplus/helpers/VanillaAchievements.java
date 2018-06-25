package net.vanillaplus.helpers;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import net.vanillaplus.common.VanillaPlus;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;

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
    public static Achievement expTranACH;
    public static Achievement expVialACH;
    public static Achievement emptyVialACH;
    
    
	public static void Init(FMLInitializationEvent event){
		
		
		cookedFleshACH = new Achievement("achievement.cookedFlesh","cookedFlesh", 0, 0, VanillaPlus.cookedFlesh, (Achievement)null).initIndependentStat().registerStat();
			seasonedFleshACH = new Achievement("achievement.seasonedFlesh","seasonedFlesh", 2, 0, Items.wheat_seeds, cookedFleshACH).registerStat(); 
		
		enchantedDustACH = new Achievement("achievement.enchantedDust","enchantedDust", 2, 3, VanillaPlus.xpOre, (Achievement)null).initIndependentStat().registerStat(); 
			enchantedGemACH = new Achievement("achievement.enchantedGem","enchantedGem", 5, 2, VanillaPlus.enchantedGem, enchantedDustACH).registerStat(); 
				magmaSwordACH = new Achievement("achievement.magmaSword","magmaSword", 7, 0, VanillaPlus.magmaSword, enchantedGemACH).registerStat(); 
				inkSwordACH = new Achievement("achievement.inkSword","inkSword", 7, 1, VanillaPlus.inkSword, enchantedGemACH).registerStat(); 
				airborneSwordACH = new Achievement("achievement.airborneSword","airborneSword", 7, 2, VanillaPlus.enchantedSword, enchantedGemACH).registerStat(); 
				expTranACH = new Achievement("achievement.expTran","expTran", 7, 5, VanillaPlus.expTranslator, enchantedGemACH).registerStat();
					expVialACH = new Achievement("achievement.expVial","expVial", 8, 6, VanillaPlus.expVial, expTranACH).registerStat();
					emptyVialACH = new Achievement("achievement.emptyVial","emptyVial", 8, 4, VanillaPlus.emptyVial, expTranACH).registerStat();
			xpBottleACH = new Achievement("achievement.xpBottle","xpBottle", 4, 4, Items.experience_bottle, enchantedDustACH).registerStat();

			
		beehorseSwordACH = new Achievement("achievement.beehorseSword","beehorseSword", 7, -1, VanillaPlus.beeHorseSword, (Achievement)null).initIndependentStat().registerStat().setSpecial(); 
		
		
		AchievementPage.registerAchievementPage(new AchievementPage("VanillaPlus",new Achievement[]{beehorseSwordACH,xpBottleACH,emptyVialACH,expVialACH,expTranACH,cookedFleshACH,seasonedFleshACH,enchantedDustACH,enchantedGemACH,magmaSwordACH,inkSwordACH,airborneSwordACH}));
		  
	}
	
}
