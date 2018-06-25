package net.vanillaplus.helpers;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.vanillaplus.common.VanillaPlus;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;


public class CraftingHandler{
	
	@SubscribeEvent
	public void smeltEvent(PlayerEvent.ItemSmeltedEvent event){
		if(event.smelting.getItem().equals(VanillaPlus.cookedFlesh)){
			event.player.addStat(VanillaAchievements.cookedFleshACH, 1);
		}
	}
	
	@SubscribeEvent
	public void pickUpEvent(PlayerEvent.ItemPickupEvent event){
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(VanillaPlus.enchantedRock))){
			event.player.addStat(VanillaAchievements.enchantedDustACH, 1);
		}
		
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(VanillaPlus.beeHorseSword))){
			event.player.addStat(VanillaAchievements.beehorseSwordACH, 1);
		}
	}
	
	@SubscribeEvent
	public void craftingEvent(PlayerEvent.ItemCraftedEvent event){
		if(event.crafting.isItemEqual(new ItemStack(VanillaPlus.seasonedFlesh))){
			event.player.addStat(VanillaAchievements.seasonedFleshACH, 1);
		}
		
		if(event.crafting.isItemEqual(new ItemStack(VanillaPlus.enchantedGem))){
			event.player.addStat(VanillaAchievements.enchantedGemACH, 1);
		}
		
		if(event.crafting.isItemEqual(new ItemStack(VanillaPlus.magmaSword))){
			event.player.addStat(VanillaAchievements.magmaSwordACH, 1);
		}
		
		if(event.crafting.isItemEqual(new ItemStack(VanillaPlus.enchantedSword))){
			event.player.addStat(VanillaAchievements.airborneSwordACH, 1);
		}
		
		if(event.crafting.isItemEqual(new ItemStack(VanillaPlus.inkSword))){
			event.player.addStat(VanillaAchievements.inkSwordACH, 1);
		}
		
		if(event.crafting.isItemEqual(new ItemStack(Items.experience_bottle))){
			event.player.addStat(VanillaAchievements.xpBottleACH, 1);
		}
		
		if(event.crafting.isItemEqual(new ItemStack(VanillaPlus.expTranslator))){
			event.player.addStat(VanillaAchievements.expTranACH, 1);
		}
	}
}