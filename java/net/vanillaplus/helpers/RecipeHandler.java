package net.vanillaplus.helpers;

import java.util.Iterator;
import java.util.List;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.vanillaplus.common.VanillaPlus;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeHandler {
	public static void Init(FMLInitializationEvent event){
		
			if(MainConfig.allFoodBoolean == true){
				if (MainConfig.toastBoolean == true){
		        	GameRegistry.addSmelting(Items.bread, new ItemStack(VanillaPlus.toast, 1), 0.4F);
		        }
				
				GameRegistry.addRecipe(new ItemStack(VanillaPlus.slimeSandwich), new Object[]
		                {
		                    "F",
		                    "X",
		                    "F",
		                    'X', VanillaPlus.slimeJelly,'F', Items.bread
		                });
				
				GameRegistry.addRecipe(new ItemStack(VanillaPlus.toastedSlimeSandwich), new Object[]
		                {
		        			"X",
		        			"S",
		        			"X",
		        			'X', VanillaPlus.toast, 'S',VanillaPlus.slimeJelly
		                });
				
				GameRegistry.addShapelessRecipe(new ItemStack(VanillaPlus.seasonedFlesh, 1), new Object[] {VanillaPlus.cookedFlesh, Items.wheat_seeds});
				GameRegistry.addSmelting(Items.rotten_flesh, new ItemStack(VanillaPlus.cookedFlesh, 1), 0.5F);
			}
			
			GameRegistry.addRecipe(new ItemStack(VanillaPlus.obsidianForced), new Object[]
	                {
	                    "SXS",
	                    "X X",
	                    "SXS",
	                    'X', Blocks.obsidian, 'S' , Blocks.cobblestone
	                });
			
			if(MainConfig.allSetBoolean == true){
				if (MainConfig.obsidianSetBoolean == true){
			        GameRegistry.addRecipe(new ItemStack(VanillaPlus.obsidianPickaxe), new Object[]
			                {
			                    "XXX",
			                    " S ",
			                    " S ",
			                    'X', VanillaPlus.obsidianForced, 'S', Items.stick,
			                });
			        GameRegistry.addRecipe(new ItemStack(VanillaPlus.obsidianShovel), new Object[]
			                {
			                    "X",
			                    "S",
			                    "S",
			                    'X', VanillaPlus.obsidianForced, 'S', Items.stick,
			                });
			        GameRegistry.addRecipe(new ItemStack(VanillaPlus.obsidianSword), new Object[]
			                {
			                    "X",
			                    "X",
			                    "S",
			                    'X', VanillaPlus.obsidianForced, 'S', Items.stick,
			                });
			        GameRegistry.addRecipe(new ItemStack(VanillaPlus.obsidianAxe), new Object[]
			                {
			                    "XX",
			                    "SX",
			                    "S ",
			                    'X', VanillaPlus.obsidianForced, 'S', Items.stick
			                });
			        GameRegistry.addRecipe(new ItemStack(VanillaPlus.obsidianHoe), new Object[]
			                {
			                    "XX",
			                    "S ",
			                    "S ",
			                    'X', VanillaPlus.obsidianForced, 'S', Items.stick
			                });
			        GameRegistry.addRecipe(new ItemStack(VanillaPlus.obsidianHelmet), new Object[]
			                {
			                    "XRX",
			                    "R R",
			                    "   ",
			                    'X', VanillaPlus.obsidianForced, 'R', Blocks.obsidian
			                });
			        GameRegistry.addRecipe(new ItemStack(VanillaPlus.obsidianPlate), new Object[]
			                {
			                    "R R",
			                    "RXR",
			                    "RXR",
			                    'X', VanillaPlus.obsidianForced, 'R', Blocks.obsidian
			                });
			        GameRegistry.addRecipe(new ItemStack(VanillaPlus.obsidianLegs), new Object[]
			                {
			                    "XRX",
			                    "R R",
			                    "R R",
			                    'X', VanillaPlus.obsidianForced, 'R', Blocks.obsidian
			                });
			        GameRegistry.addRecipe(new ItemStack(VanillaPlus.obsidianBoots), new Object[]
			                {
			                    "   ",
			                    "R R",
			                    "X X",
			                    'X', VanillaPlus.obsidianForced, 'R', Blocks.obsidian
			                });
			        
			}
			if (MainConfig.emeraldSetBoolean == true){
			        GameRegistry.addRecipe(new ItemStack(VanillaPlus.emeraldSword), new Object[]
			                {
			                    "X",
			                    "X",
			                    "S",
			                    'X', Items.emerald, 'S', Items.stick
			                });
			        GameRegistry.addRecipe(new ItemStack(VanillaPlus.emeraldAxe), new Object[]
			                {
			                    "XX",
			                    "SX",
			                    "S ",
			                    'X', Items.emerald, 'S', Items.stick
			                });
			        GameRegistry.addRecipe(new ItemStack(VanillaPlus.emeraldShovel), new Object[]
			                {
			                    "X",
			                    "S",
			                    "S",
			                    'X', Items.emerald, 'S', Items.stick
			                });
			        GameRegistry.addRecipe(new ItemStack(VanillaPlus.emeraldHoe), new Object[]
			                {
			                    "XX",
			                    "S ",
			                    "S ",
			                    'X', Items.emerald, 'S', Items.stick
			                });
			        GameRegistry.addRecipe(new ItemStack(VanillaPlus.emeraldPickaxe), new Object[]
			                {
			                    "XXX",
			                    " S ",
			                    " S ",
			                    'X', Items.emerald, 'S', Items.stick
			                });
			        GameRegistry.addRecipe(new ItemStack(VanillaPlus.emeraldHelmet), new Object[]
			                {
			                    "XXX",
			                    "X X",
			                    "   ",
			                    'X', Items.emerald,
			                });
			        GameRegistry.addRecipe(new ItemStack(VanillaPlus.emeraldPlate), new Object[]
			                {
			                    "X X",
			                    "XXX",
			                    "XXX",
			                    'X', Items.emerald,
			                });
			        GameRegistry.addRecipe(new ItemStack(VanillaPlus.emeraldLegs), new Object[]
			                {
			                    "XXX",
			                    "X X",
			                    "X X",
			                    'X', Items.emerald,
			                });
			        GameRegistry.addRecipe(new ItemStack(VanillaPlus.emeraldBoots), new Object[]
			                {
			                    "   ",
			                    "X X",
			                    "X X",
			                    'X', Items.emerald,
			                });
			}
			
			GameRegistry.addRecipe(new ItemStack(VanillaPlus.gravelSword), new Object[]
	                {
	                    "X",
	                    "X",
	                    "S",
	                    'X', VanillaPlus.gravelCompact, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlus.gravelAxe), new Object[]
	                {
	                    "XX",
	                    "SX",
	                    "S ",
	                    'X', VanillaPlus.gravelCompact, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlus.gravelShovel), new Object[]
	                {
	                    "X",
	                    "S",
	                    "S",
	                    'X', VanillaPlus.gravelCompact, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlus.gravelHoe), new Object[]
	                {
	                    "XX",
	                    "S ",
	                    "S ",
	                    'X', VanillaPlus.gravelCompact, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlus.gravelPickaxe), new Object[]
	                {
	                    "XXX",
	                    " S ",
	                    " S ",
	                    'X', VanillaPlus.gravelCompact, 'S', Items.stick
	                });
	        if(MainConfig.enderSetBoolean == true){
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.enderSword), new Object[]
		                {
		                    "X",
		                    "X",
		                    "S",
		                    'X', VanillaPlus.enderGem, 'S', Items.stick
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.enderPickaxe), new Object[]
		                {
		                    "XXX",
		                    " S ",
		                    " S ",
		                    'X', VanillaPlus.enderGem, 'S', Items.stick
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.enderAxe), new Object[]
		                {
		                    "XX",
		                    "SX",
		                    "S ",
		                    'X', VanillaPlus.enderGem, 'S', Items.stick
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.enderShovel), new Object[]
		                {
		                    "X",
		                    "S",
		                    "S",
		                    'X', VanillaPlus.enderGem, 'S', Items.stick
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.enderHoe), new Object[]
		                {
		                    "XX",
		                    "S ",
		                    "S ",
		                    'X', VanillaPlus.enderGem, 'S', Items.stick
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.enderHelmet), new Object[]
		                {
		                    "XXX",
		                    "X X",
		                    "   ",
		                    'X', VanillaPlus.enderGem
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.enderPlate), new Object[]
		                {
		                    "X X",
		                    "XXX",
		                    "XXX",
		                    'X', VanillaPlus.enderGem
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.enderLegs), new Object[]
		                {
		                    "XXX",
		                    "X X",
		                    "X X",
		                    'X', VanillaPlus.enderGem
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.enderBoots), new Object[]
		                {
		                    "   ",
		                    "X X",
		                    "X X",
		                    'X', VanillaPlus.enderGem
		                });
	        	}
	        if(MainConfig.specialSetBoolean == true){
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.scubaHelmet), new Object[]
		                {
		                    "XXX",
		                    "XAX",
		                    "XXX",
		                    'X', Items.iron_ingot, 'A', Blocks.glass
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.scubaTank), new Object[]
		                {
		                    "XXX",
		                    "AXA",
		                    "XXX",
		                    'X', Items.iron_ingot, 'A', VanillaPlus.airTank
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.scubaPants), new Object[]
		                {
		                    "XXX",
		                    "XAX",
		                    "XAX",
		                    'X', Items.iron_ingot, 'A', Items.leather
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.scubaFlippers), new Object[]
		                {
		                    "X X",
		                    "X X",
		                    "A A",
		                    'X', Items.iron_ingot, 'A', VanillaPlus.bloatedInkSac
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.scorchedHelmet), new Object[]
		                {
		                    "XXX",
		                    "A A",
		                    "   ",
		                    'X', VanillaPlus.magmaChunk, 'A', VanillaPlus.hellStone
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.scorchedPlate), new Object[]
		                {
		                    "X X",
		                    "XAX",
		                    "XAX",
		                    'X', VanillaPlus.magmaChunk, 'A', VanillaPlus.hellStone
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.scorchedLegs), new Object[]
		                {
		                    "XXX",
		                    "A A",
		                    "X X",
		                    'X', VanillaPlus.magmaChunk, 'A', VanillaPlus.hellStone
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.scorchedBoots), new Object[]
		                {
		                    "   ",
		                    "X X",
		                    "A A",
		                    'X', VanillaPlus.magmaChunk, 'A', VanillaPlus.hellStone
		                });
		        
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.invHelmet), new Object[]
		                {
		                    "XXX",
		                    "X X",
		                    "   ",
		                    'X', VanillaPlus.guardianIngot
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.invPlate), new Object[]
		                {
		                    "X X",
		                    "XXX",
		                    "XXX",
		                    'X', VanillaPlus.guardianIngot
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.invLegs), new Object[]
		                {
		                    "XXX",
		                    "X X",
		                    "X X",
		                    'X', VanillaPlus.guardianIngot
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.invBoots), new Object[]
		                {
		                    "   ",
		                    "X X",
		                    "X X",
		                    'X', VanillaPlus.guardianIngot
		                });
	        }
	        if(MainConfig.rubySetBoolean == true){
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.rubySword), new Object[]
		                {
		                    "X",
		                    "X",
		                    "S",
		                    'X', VanillaPlus.ruby, 'S', Items.stick
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.rubyPickaxe), new Object[]
		                {
		                    "XXX",
		                    " S ",
		                    " S ",
		                    'X', VanillaPlus.ruby, 'S', Items.stick
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.rubyAxe), new Object[]
		                {
		                    "XX",
		                    "SX",
		                    "S ",
		                    'X', VanillaPlus.ruby, 'S', Items.stick
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.rubyShovel), new Object[]
		                {
		                    "X",
		                    "S",
		                    "S",
		                    'X', VanillaPlus.ruby, 'S', Items.stick
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.rubyHoe), new Object[]
		                {
		                    "XX",
		                    "S ",
		                    "S ",
		                    'X', VanillaPlus.ruby, 'S', Items.stick
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.rubyHelmet), new Object[]
		                {
		                    "XXX",
		                    "X X",
		                    "   ",
		                    'X', VanillaPlus.ruby
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.rubyPlate), new Object[]
		                {
		                    "X X",
		                    "XXX",
		                    "XXX",
		                    'X', VanillaPlus.ruby
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.rubyLegs), new Object[]
		                {
		                    "XXX",
		                    "X X",
		                    "X X",
		                    'X', VanillaPlus.ruby
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.rubyBoots), new Object[]
		                {
		                    "   ",
		                    "X X",
		                    "X X",
		                    'X', VanillaPlus.ruby
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.sapphireSword), new Object[]
		                {
		                    "X",
		                    "X",
		                    "S",
		                    'X', VanillaPlus.sapphire, 'S', Items.stick
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.sapphirePickaxe), new Object[]
		                {
		                    "XXX",
		                    " S ",
		                    " S ",
		                    'X', VanillaPlus.sapphire, 'S', Items.stick
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.sapphireAxe), new Object[]
		                {
		                    "XX",
		                    "SX",
		                    "S ",
		                    'X', VanillaPlus.sapphire, 'S', Items.stick
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.sapphireShovel), new Object[]
		                {
		                    "X",
		                    "S",
		                    "S",
		                    'X', VanillaPlus.sapphire, 'S', Items.stick
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.sapphireHoe), new Object[]
		                {
		                    "XX",
		                    "S ",
		                    "S ",
		                    'X', VanillaPlus.sapphire, 'S', Items.stick
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.sapphireHelmet), new Object[]
		                {
		                    "XXX",
		                    "X X",
		                    "   ",
		                    'X', VanillaPlus.sapphire
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.sapphirePlate), new Object[]
		                {
		                    "X X",
		                    "XXX",
		                    "XXX",
		                    'X', VanillaPlus.sapphire
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.sapphireLegs), new Object[]
		                {
		                    "XXX",
		                    "X X",
		                    "X X",
		                    'X', VanillaPlus.sapphire
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.sapphireBoots), new Object[]
		                {
		                    "   ",
		                    "X X",
		                    "X X",
		                    'X', VanillaPlus.sapphire
		                });
	        }
	        GameRegistry.addRecipe(new ItemStack(VanillaPlus.pGoldSword), new Object[]
	                {
	                    "X",
	                    "X",
	                    "S",
	                    'X', VanillaPlus.purifiedGold, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlus.pGoldPickaxe), new Object[]
	                {
	                    "XXX",
	                    " S ",
	                    " S ",
	                    'X', VanillaPlus.purifiedGold, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlus.pGoldAxe), new Object[]
	                {
	                    "XX",
	                    "SX",
	                    "S ",
	                    'X', VanillaPlus.purifiedGold, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlus.pGoldShovel), new Object[]
	                {
	                    "X",
	                    "S",
	                    "S",
	                    'X', VanillaPlus.purifiedGold, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlus.pGoldHoe), new Object[]
	                {
	                    "XX",
	                    "S ",
	                    "S ",
	                    'X', VanillaPlus.purifiedGold, 'S', Items.stick
	                });
			}
			
			if(MainConfig.allWeaponBoolean == true){
				GameRegistry.addRecipe(new ItemStack(VanillaPlus.inkSword), new Object[]
		                {
		                    " X ",
		                    "XGX",
		                    " S ",
		                    'X', Items.dye, 'S', Items.stick, 'G', VanillaPlus.enchantedGem
		                });
				GameRegistry.addRecipe(new ItemStack(VanillaPlus.magmaSword), new Object[]
		                {
		                    " X ",
		                    "XGX",
		                    " S ",
		                    'X', VanillaPlus.magmaChunk, 'S', Items.stick, 'G', VanillaPlus.enchantedGem
		                });
				GameRegistry.addRecipe(new ItemStack(VanillaPlus.enchantedSword), new Object[]
		                {
		                    " F ",
		                    "FXF",
		                    " S ",
		                    'X', VanillaPlus.enchantedGem, 'S', Items.stick, 'F', VanillaPlus.goldenFeather
		                });
				 GameRegistry.addRecipe(new ItemStack(VanillaPlus.rapidBow), new Object[]
			                {
			        			" XS",
			        			"X S",
			        			" XS",
			        			'X', VanillaPlus.diamondRod, 'S', Items.string
			                });
			}
			
			if(MainConfig.expTableBoolean == true){
				GameRegistry.addRecipe(new ItemStack(VanillaPlus.expTranslator), new Object[]
		                {
		        			" W ",
		        			"EXE",
		        			"LLL",
		        			'X', VanillaPlus.enchantedGem, 'L', Blocks.log, 'E', VanillaPlus.hellStone, 'W', Blocks.wool
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.expTranslator), new Object[]
		                {
		        			" W ",
		        			"EXE",
		        			"LLL",
		        			'X', VanillaPlus.enchantedGem, 'E', VanillaPlus.hellStone, 'W', Blocks.wool,'L', Blocks.log2
		                });
			}
			
			  GameRegistry.addRecipe(new ItemStack(VanillaPlus.gravelClump), new Object[]
		                {
		                    " X ",
		                    "XSX",
		                    " X ",
		                    'X', Items.flint, 'S', Items.iron_ingot
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.gravelCompact), new Object[]
		                {
		                    "   ",
		                    "XX ",
		                    "XX ",
		                    'X', Blocks.gravel
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.gravelCompact), new Object[]
		                {
		                    "XX ",
		                    "XX ",
		                    "   ",
		                    'X', Blocks.gravel
		                });
		        
		        ItemStack lapis = new ItemStack(Items.dye, 1, 4);
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.enchantedGem), new Object[]
		                {
		                    "SXS",
		                    "XDX",
		                    "SXS",
		                    'X', VanillaPlus.enchantedRock, 'S', lapis, 'D', Items.diamond
		                });
		        
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.goldenFeather), new Object[]
		                {
		                    " X ",
		                    "XFX",
		                    " X ",
		                    'X', Items.gold_ingot,'F', Items.feather
		                });
		       
		        
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.bloatedInkSac), new Object[]
		                {
		                    "XXX",
		                    "X X",
		                    "XXX",
		                    'X', Items.dye
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.airTank), new Object[]
		                {
		                    "XAX",
		                    "XAX",
		                    "XAX",
		                    'X', Items.iron_ingot, 'A', VanillaPlus.bloatedInkSac
		                });
		        
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.guardianIngot), new Object[]
		                {
		                    "O",
		                    "X",
		                    "O",
		                    'X', VanillaPlus.purifiedGold, 'O', Blocks.obsidian
		                });

		       
		      
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.rubyBlock, 1, 0), new Object[]
		                {
		                    "XXX",
		                    "XXX",
		                    "XXX",
		                    'X', VanillaPlus.ruby,
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.rubyBlock, 1, 1), new Object[]
		                {
		                    "XXX",
		                    "XXX",
		                    "XXX",
		                    'X', VanillaPlus.sapphire,
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.rubyBlock, 1, 2), new Object[]
		                {
		                    "XXX",
		                    "XXX",
		                    "XXX",
		                    'X', VanillaPlus.hellStone,
		                });
		        ItemStack rubyBlockCRAFT = new ItemStack(VanillaPlus.rubyBlock, 1, 0);
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.rubyBlock, 4, 3), new Object[]
		                {
		                    "   ",
		                    " XX",
		                    " XX",
		                    'X', rubyBlockCRAFT
		                });
		        ItemStack rubyBlockChis = new ItemStack(VanillaPlus.rubyBlock, 1, 3);
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.rubyBlock, 4, 0), new Object[]
		                {
		                    "   ",
		                    " XX",
		                    " XX",
		                    'X', rubyBlockChis
		                });
		        ItemStack sapphireBlock = new ItemStack(VanillaPlus.rubyBlock, 1, 1);
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.rubyBlock, 4, 4), new Object[]
		                {
		                    "   ",
		                    " XX",
		                    " XX",
		                    'X', sapphireBlock
		                });
		        ItemStack sapphireBlockChis = new ItemStack(VanillaPlus.rubyBlock, 1, 4);
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.rubyBlock, 4, 1), new Object[]
		                {
		                    "   ",
		                    " XX",
		                    " XX",
		                    'X', sapphireBlockChis
		                });
		        ItemStack hellStoneBlock = new ItemStack(VanillaPlus.rubyBlock, 1, 2);
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.rubyBlock, 4, 5), new Object[]
		                {
		                    "   ",
		                    " XX",
		                    " XX",
		                    'X', hellStoneBlock
		                });
		        ItemStack hellStoneBlockChis = new ItemStack(VanillaPlus.rubyBlock, 1, 5);
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.rubyBlock, 4, 2), new Object[]
		                {
		                    "   ",
		                    " XX",
		                    " XX",
		                    'X', hellStoneBlockChis
		                });
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.emptyVial, 5), new Object[]
		                {
		        			"X X",
		        			"X X",
		        			"XXX",
		        			'X', Blocks.glass_pane
		                });
		        //Enabled Recipes
		        if (MainConfig.WoodenDoorsBoolean == true) {
		        	
		        	List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		    		
		            Iterator<IRecipe> Leash = recipes.iterator();
		            		          
		            	while (Leash.hasNext()) {
		            		ItemStack is = Leash.next().getRecipeOutput();
		            		if (is != null && is.getItem() == Items.wooden_door)
		            			Leash.remove();
		            	};
		            	
		        	 ItemStack birchWood = new ItemStack(Blocks.planks, 1, 2);
		             GameRegistry.addRecipe(new ItemStack(VanillaPlus.birchDoorItem), new Object[]
		                     {
		             			" XX",
		             			" XX",
		             			" XX",
		             			'X', birchWood
		                     });
		             ItemStack acaciaWood = new ItemStack(Blocks.planks, 1, 4);
		             GameRegistry.addRecipe(new ItemStack(VanillaPlus.acaciaDoorItem), new Object[]
		                     {
		             			" XX",
		             			" XX",
		             			" XX",
		             			'X', acaciaWood
		                     });
		             ItemStack darkOakWood = new ItemStack(Blocks.planks, 1, 5);
		             GameRegistry.addRecipe(new ItemStack(VanillaPlus.darkOakDoorItem), new Object[]
		                     {
		             			" XX",
		             			" XX",
		             			" XX",
		             			'X', darkOakWood
		                     });
		             ItemStack spruceWood = new ItemStack(Blocks.planks, 1, 1);
		             GameRegistry.addRecipe(new ItemStack(VanillaPlus.spruceDoorItem), new Object[]
		                     {
		             			" XX",
		             			" XX",
		             			" XX",
		             			'X', spruceWood
		                     });
		             ItemStack jungleWood = new ItemStack(Blocks.planks, 1, 3);
		             GameRegistry.addRecipe(new ItemStack(VanillaPlus.jungleDoorItem), new Object[]
		                     {
		             			" XX",
		             			" XX",
		             			" XX",
		             			'X', jungleWood
		                     });
		             ItemStack oakPlanks = new ItemStack(Blocks.planks, 1, 0);
		             GameRegistry.addRecipe(new ItemStack(Items.wooden_door), new Object[]
		                     {
		             			" XX",
		             			" XX",
		             			" XX",
		             			'X', oakPlanks
		                     });
		        }
		         
		             
		         //Alternate Recipes
		         if (MainConfig.diamondRodsBoolean == true){
		        	 
		        GameRegistry.addRecipe(new ItemStack(VanillaPlus.diamondRod, 3), new Object[] {"#", "#", '#', Items.diamond});
		        }
		         else {GameRegistry.addRecipe(new ItemStack(VanillaPlus.diamondRod, 3), new Object[]
		                 {
		         			"   ",
		         			" X ",
		         			"X  ",
		         			'X', Items.diamond
		        });}
		
		 	
	        GameRegistry.addShapelessRecipe(new ItemStack(Items.experience_bottle, 1), new Object[] {VanillaPlus.enchantedRock, Items.glass_bottle });
	        GameRegistry.addShapelessRecipe(new ItemStack(Items.skull, 1, 0), new Object[] {VanillaPlus.skeletonHeadFrag, Items.bone });
	        GameRegistry.addShapelessRecipe(new ItemStack(Items.bone, 3), new Object[] {VanillaPlus.skeletonHeadFrag});
	        GameRegistry.addShapelessRecipe(new ItemStack(Items.skull, 1, 4), new Object[] {VanillaPlus.creeperHeadFrag, Items.gunpowder });
	        GameRegistry.addShapelessRecipe(new ItemStack(Items.gunpowder, 3), new Object[] {VanillaPlus.creeperHeadFrag});
	        GameRegistry.addShapelessRecipe(new ItemStack(Items.skull, 1, 2), new Object[] {VanillaPlus.zombieHeadFrag, Items.rotten_flesh });
	        GameRegistry.addShapelessRecipe(new ItemStack(Items.rotten_flesh, 3), new Object[] {VanillaPlus.zombieHeadFrag});
	        GameRegistry.addShapelessRecipe(new ItemStack(VanillaPlus.slimeJelly, 1), new Object[] {Items.slime_ball, Items.sugar});
	        GameRegistry.addShapelessRecipe(new ItemStack(Items.stick, 4), new Object[] {Blocks.deadbush});
	        GameRegistry.addShapelessRecipe(new ItemStack(VanillaPlus.enderCrystal, 1), new Object[] {new ItemStack(Items.dye,4), VanillaPlus.corruptedEnderCrystal});
	        GameRegistry.addShapelessRecipe(new ItemStack(VanillaPlus.ruby, 9), new Object[] {(new ItemStack(VanillaPlus.rubyBlock, 1, 0))});
	        GameRegistry.addShapelessRecipe(new ItemStack(VanillaPlus.ruby, 9), new Object[] {(new ItemStack(VanillaPlus.rubyBlock, 1, 3))});
	        GameRegistry.addShapelessRecipe(new ItemStack(VanillaPlus.sapphire, 9), new Object[] {(new ItemStack(VanillaPlus.rubyBlock, 1, 1))});
	        GameRegistry.addShapelessRecipe(new ItemStack(VanillaPlus.sapphire, 9), new Object[] {(new ItemStack(VanillaPlus.rubyBlock, 1, 4))});
	        GameRegistry.addShapelessRecipe(new ItemStack(VanillaPlus.hellStone, 9), new Object[] {(new ItemStack(VanillaPlus.rubyBlock, 1, 2))});
	        GameRegistry.addShapelessRecipe(new ItemStack(VanillaPlus.hellStone, 9), new Object[] {(new ItemStack(VanillaPlus.rubyBlock, 1, 5))});
	        
	        GameRegistry.addSmelting(VanillaPlus.enderCrystal, new ItemStack(VanillaPlus.enderGem, 1), 1.0F);
	        GameRegistry.addSmelting(Items.gold_ingot, new ItemStack(VanillaPlus.purifiedGold, 1), 0.8F);
	        
	        
	        
		
	}

}
