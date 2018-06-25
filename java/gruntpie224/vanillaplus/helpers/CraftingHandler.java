package gruntpie224.vanillaplus.helpers;

import gruntpie224.vanillaplus.init.VanillaPlusItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;


public class CraftingHandler{
	
	@SubscribeEvent
	public void smeltEvent(PlayerEvent.ItemSmeltedEvent event){
		if(event.smelting.getItem().equals(VanillaPlusItems.cooked_flesh)){
			event.player.addStat(VanillaAchievements.cookedFleshACH, 1);
		}
	}
	
	@SubscribeEvent
	public void pickUpEvent(PlayerEvent.ItemPickupEvent event){
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(VanillaPlusItems.enchanted_dust))){
			event.player.addStat(VanillaAchievements.enchantedDustACH, 1);
		}
		
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(VanillaPlusItems.bee_sword))){
			event.player.addStat(VanillaAchievements.beehorseSwordACH, 1);
		}
	}
	
	@SubscribeEvent
	public void craftingEvent(PlayerEvent.ItemCraftedEvent event){
		if(event.crafting.isItemEqual(new ItemStack(VanillaPlusItems.seasoned_flesh))){
			event.player.addStat(VanillaAchievements.seasonedFleshACH, 1);
		}
		
		if(event.crafting.isItemEqual(new ItemStack(VanillaPlusItems.enchanted_gem))){
			event.player.addStat(VanillaAchievements.enchantedGemACH, 1);
		}
		
		if(event.crafting.isItemEqual(new ItemStack(VanillaPlusItems.magma_sword))){
			event.player.addStat(VanillaAchievements.magmaSwordACH, 1);
		}
		
		if(event.crafting.isItemEqual(new ItemStack(VanillaPlusItems.air_sword))){
			event.player.addStat(VanillaAchievements.airborneSwordACH, 1);
		}
		
		if(event.crafting.isItemEqual(new ItemStack(VanillaPlusItems.ink_sword))){
			event.player.addStat(VanillaAchievements.inkSwordACH, 1);
		}
		
		if(event.crafting.isItemEqual(new ItemStack(Items.experience_bottle))){
			event.player.addStat(VanillaAchievements.xpBottleACH, 1);
		}
		
	}
}