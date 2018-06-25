package gruntpie224.vanillaplus;

import gruntpie224.vanillaplus.helpers.config.ConfigHandler;
import gruntpie224.vanillaplus.init.VanillaPlusBlocks;
import gruntpie224.vanillaplus.init.VanillaPlusItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VanillaPlusRecipes {
	public static void Init()
	{
		//SHAPELESS
		GameRegistry.addShapelessRecipe(new ItemStack(VanillaPlusItems.seasoned_flesh, 1), new Object[] {VanillaPlusItems.cooked_flesh, Items.wheat_seeds});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.experience_bottle, 1), new Object[] {VanillaPlusItems.enchanted_dust, Items.glass_bottle });
		GameRegistry.addShapelessRecipe(new ItemStack(VanillaPlusItems.ender_crystal, 1), new Object[] {new ItemStack(Items.dye,4), VanillaPlusItems.ender_crystal_corrupt});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.skull, 1, 0), new Object[] {VanillaPlusItems.head_frag_skeleton, Items.bone });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.bone, 2), new Object[] {VanillaPlusItems.head_frag_skeleton});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.skull, 1, 4), new Object[] {VanillaPlusItems.head_frag_creeper, Items.gunpowder });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gunpowder, 2), new Object[] {VanillaPlusItems.head_frag_creeper});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.skull, 1, 2), new Object[] {VanillaPlusItems.head_frag_zombie, Items.rotten_flesh });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.rotten_flesh, 2), new Object[] {VanillaPlusItems.head_frag_zombie});
        GameRegistry.addShapelessRecipe(new ItemStack(VanillaPlusItems.slime_jelly, 1), new Object[] {Items.slime_ball, Items.sugar});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.stick, 4), new Object[] {Blocks.deadbush});
		GameRegistry.addShapelessRecipe(new ItemStack(VanillaPlusItems.ruby, 9), new Object[] {(new ItemStack(VanillaPlusBlocks.ruby_block, 1, 0))});
		GameRegistry.addShapelessRecipe(new ItemStack(VanillaPlusItems.ruby, 9), new Object[] {(new ItemStack(VanillaPlusBlocks.ruby_block, 1, 3))});
		GameRegistry.addShapelessRecipe(new ItemStack(VanillaPlusItems.sapphire, 9), new Object[] {(new ItemStack(VanillaPlusBlocks.ruby_block, 1, 1))});
		GameRegistry.addShapelessRecipe(new ItemStack(VanillaPlusItems.sapphire, 9), new Object[] {(new ItemStack(VanillaPlusBlocks.ruby_block, 1, 4))});
		GameRegistry.addShapelessRecipe(new ItemStack(VanillaPlusItems.hell_stone, 9), new Object[] {(new ItemStack(VanillaPlusBlocks.ruby_block, 1, 2))});
		GameRegistry.addShapelessRecipe(new ItemStack(VanillaPlusItems.hell_stone, 9), new Object[] {(new ItemStack(VanillaPlusBlocks.ruby_block, 1, 5))});
		
		//FURNACE RECIPE
		GameRegistry.addSmelting(Items.rotten_flesh, new ItemStack(VanillaPlusItems.cooked_flesh, 1), 0.5F);
		GameRegistry.addSmelting(Items.bread, new ItemStack(VanillaPlusItems.toast, 1), 0.4F);
		GameRegistry.addSmelting(Items.gold_ingot, new ItemStack(VanillaPlusItems.purified_gold, 1), 0.7F);
		
		//FOOD
		GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.slime_sandwich), new Object[]
                {
                    "F",
                    "J",
                    "F",
                    'J', VanillaPlusItems.slime_jelly,'F', Items.bread
                });
		
		GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.slime_sandwich_toasted), new Object[]
                {
                    "F",
                    "J",
                    "F",
                    'J', VanillaPlusItems.slime_jelly,'F', VanillaPlusItems.toast
                });
		
		//SPECIAL WEAPONS
		GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.ink_sword), new Object[]
                {
                    " X ",
                    "XGX",
                    " S ",
                    'X', Items.dye, 'S', Items.stick, 'G', VanillaPlusItems.enchanted_gem
                });
		GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.magma_sword), new Object[]
                {
                    " X ",
                    "XGX",
                    " S ",
                    'X', VanillaPlusItems.magma_chunk, 'S', Items.stick, 'G', VanillaPlusItems.enchanted_gem
                });
		GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.air_sword), new Object[]
                {
                    " F ",
                    "FXF",
                    " S ",
                    'X', VanillaPlusItems.enchanted_gem, 'S', Items.stick, 'F', VanillaPlusItems.golden_feather
                });
		 GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.rapid_bow), new Object[]
	                {
	        			" XS",
	        			"X S",
	        			" XS",
	        			'X', VanillaPlusItems.diamond_rod, 'S', Items.string
	                });
		 
		 //BASIC ITEMS
		 ItemStack lapis = new ItemStack(Items.dye, 1, 4);
		 GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.enchanted_gem), new Object[]
		        {
		        "SXS",
		        "XDX",
		        "SXS",
		        'X', VanillaPlusItems.enchanted_dust, 'S', lapis, 'D', Items.diamond
		        });
		
		 GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.golden_feather), new Object[]
		        {
		        " X ",
		        "XFX",
		        " X ",
		        'X', Items.gold_ingot,'F', Items.feather
		         });
		   
		    
		 GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.bloated_ink), new Object[]
		        {
		        "XXX",
		        "X X",
		        "XXX",
		        'X', Items.dye
		        });
		GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.air_tank), new Object[]
		        {
		        "XAX",
		        "XAX",
		        "XAX",
		        'X', Items.iron_ingot, 'A', VanillaPlusItems.bloated_ink
		        });
		
		GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.guardian_ingot), new Object[]
		        {
		        "O",
		        "X",
		        "O",
		        'X', VanillaPlusItems.purified_gold, 'O', Blocks.obsidian
		    });
		
		GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.gravel_clump), new Object[]
                {
                    " X ",
                    "XSX",
                    " X ",
                    'X', Items.flint, 'S', Items.iron_ingot
                });
		
		if(!ConfigHandler.alt_diamond_rod)
			GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.diamond_rod, 3), new Object[] {"#", "#", '#', Items.diamond});
		else
			GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.diamond_rod, 3), new Object[]
	                 {
	         			"   ",
	         			" X ",
	         			"X  ",
	         			'X', Items.diamond
	        });
			
		 
		 //SCUBA SET
		 GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.scuba_helmet), new Object[]
	                {
	                    "XXX",
	                    "XAX",
	                    "XXX",
	                    'X', Items.iron_ingot, 'A', Blocks.glass
	                });
		 GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.scuba_plate), new Object[]
	                {
	                    "XXX",
	                    "AXA",
	                    "XXX",
	                    'X', Items.iron_ingot, 'A', VanillaPlusItems.air_tank
	                });
	     GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.scuba_legs), new Object[]
	                {
	                    "XXX",
	                    "XAX",
	                    "XAX",
	                    'X', Items.iron_ingot, 'A', Items.leather
	                });
	     GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.scuba_boots), new Object[]
	                {
	                    "X X",
	                    "X X",
	                    "A A",
	                    'X', Items.iron_ingot, 'A', VanillaPlusItems.bloated_ink
	                });
	        
	     //SCORCHED SET   
	     GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.scorched_helmet), new Object[]
	                {
	                    "XXX",
	                    "A A",
	                    "   ",
	                    'X', VanillaPlusItems.magma_chunk, 'A', VanillaPlusItems.hell_stone
	                });
	     GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.scorched_plate), new Object[]
	                {
	                    "X X",
	                    "XAX",
	                    "XAX",
	                    'X', VanillaPlusItems.magma_chunk, 'A', VanillaPlusItems.hell_stone
	                });
	     GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.scorched_legs), new Object[]
	                {
	                    "XXX",
	                    "A A",
	                    "X X",
	                    'X', VanillaPlusItems.magma_chunk, 'A', VanillaPlusItems.hell_stone
	                });
	     GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.scorched_boots), new Object[]
	                {
	                    "   ",
	                    "X X",
	                    "A A",
	                    'X', VanillaPlusItems.magma_chunk, 'A', VanillaPlusItems.hell_stone
	                });
	        
	     GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.guard_helmet), new Object[]
	                {
	                    "XXX",
	                    "X X",
	                    "   ",
	                    'X', VanillaPlusItems.guardian_ingot
	                });
	     GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.guard_plate), new Object[]
	                {
	                    "X X",
	                    "XXX",
	                    "XXX",
	                    'X', VanillaPlusItems.guardian_ingot
	                });
	     GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.guard_legs), new Object[]
	                {
	                    "XXX",
	                    "X X",
	                    "X X",
	                    'X', VanillaPlusItems.guardian_ingot
	                });
	     GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.guard_boots), new Object[]
	                {
	                    "   ",
	                    "X X",
	                    "X X",
	                    'X', VanillaPlusItems.guardian_ingot
	                });
		
		//OBSIDIAN SET
		GameRegistry.addRecipe(new ItemStack(VanillaPlusBlocks.obsidian_reinforced), new Object[]
                {
                    "SXS",
                    "X X",
                    "SXS",
                    'X', Blocks.obsidian, 'S' , Blocks.cobblestone
                });
		
		GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.obsidian_pickaxe), new Object[]
                {
                    "XXX",
                    " S ",
                    " S ",
                    'X', VanillaPlusBlocks.obsidian_reinforced, 'S', Items.stick,
                });
        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.obsidian_shovel), new Object[]
                {
                    "X",
                    "S",
                    "S",
                    'X', VanillaPlusBlocks.obsidian_reinforced, 'S', Items.stick,
                });
        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.obsidian_sword), new Object[]
                {
                    "X",
                    "X",
                    "S",
                    'X', VanillaPlusBlocks.obsidian_reinforced, 'S', Items.stick,
                });
        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.obsidian_axe), new Object[]
                {
                    "XX",
                    "SX",
                    "S ",
                    'X', VanillaPlusBlocks.obsidian_reinforced, 'S', Items.stick
                });
        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.obsidian_hoe), new Object[]
                {
                    "XX",
                    "S ",
                    "S ",
                    'X', VanillaPlusBlocks.obsidian_reinforced, 'S', Items.stick
                });
        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.obsidian_helmet), new Object[]
                {
                    "XRX",
                    "R R",
                    "   ",
                    'X', VanillaPlusBlocks.obsidian_reinforced, 'R', Blocks.obsidian
                });
        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.obsidian_plate), new Object[]
                {
                    "R R",
                    "RXR",
                    "RXR",
                    'X', VanillaPlusBlocks.obsidian_reinforced, 'R', Blocks.obsidian
                });
        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.obsidian_legs), new Object[]
                {
                    "XRX",
                    "R R",
                    "R R",
                    'X', VanillaPlusBlocks.obsidian_reinforced, 'R', Blocks.obsidian
                });
        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.obsidian_boots), new Object[]
                {
                    "   ",
                    "R R",
                    "X X",
                    'X', VanillaPlusBlocks.obsidian_reinforced, 'R', Blocks.obsidian
                });
		
		//EMERALD SET
		if (ConfigHandler.enable_emerald_recipes == true){
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.emerald_sword), new Object[]
	                {
	                    "X",
	                    "X",
	                    "S",
	                    'X', Items.emerald, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.emerald_axe), new Object[]
	                {
	                    "XX",
	                    "SX",
	                    "S ",
	                    'X', Items.emerald, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.emerald_shovel), new Object[]
	                {
	                    "X",
	                    "S",
	                    "S",
	                    'X', Items.emerald, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.emerald_hoe), new Object[]
	                {
	                    "XX",
	                    "S ",
	                    "S ",
	                    'X', Items.emerald, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.emerald_pickaxe), new Object[]
	                {
	                    "XXX",
	                    " S ",
	                    " S ",
	                    'X', Items.emerald, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.emerald_helmet), new Object[]
	                {
	                    "XXX",
	                    "X X",
	                    "   ",
	                    'X', Items.emerald,
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.emerald_plate), new Object[]
	                {
	                    "X X",
	                    "XXX",
	                    "XXX",
	                    'X', Items.emerald,
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.emerald_legs), new Object[]
	                {
	                    "XXX",
	                    "X X",
	                    "X X",
	                    'X', Items.emerald,
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.emerald_boots), new Object[]
	                {
	                    "   ",
	                    "X X",
	                    "X X",
	                    'X', Items.emerald,
	                });
	        
	        //GRAVEL SET
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusBlocks.compact_gravel), new Object[]
	                {
	                    "XX ",
	                    "XX ",
	                    "   ",
	                    'X', Blocks.gravel
	                });
	        
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusBlocks.compact_gravel), new Object[]
	                {
	                    "   ",
	                    " XX",
	                    " XX",
	                    'X', Blocks.gravel
	                });
	        
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.gravel_sword), new Object[]
	                {
	                    "X",
	                    "X",
	                    "S",
	                    'X', VanillaPlusBlocks.compact_gravel, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.gravel_axe), new Object[]
	                {
	                    "XX",
	                    "SX",
	                    "S ",
	                    'X', VanillaPlusBlocks.compact_gravel, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.gravel_shovel), new Object[]
	                {
	                    "X",
	                    "S",
	                    "S",
	                    'X', VanillaPlusBlocks.compact_gravel, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.gravel_hoe), new Object[]
	                {
	                    "XX",
	                    "S ",
	                    "S ",
	                    'X', VanillaPlusBlocks.compact_gravel, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.gravel_pickaxe), new Object[]
	                {
	                    "XXX",
	                    " S ",
	                    " S ",
	                    'X', VanillaPlusBlocks.compact_gravel, 'S', Items.stick
	                });
	        
	        //ENDER SET
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.ender_sword), new Object[]
	                {
	                    "X",
	                    "X",
	                    "S",
	                    'X', VanillaPlusItems.ender_gem, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.ender_pickaxe), new Object[]
	                {
	                    "XXX",
	                    " S ",
	                    " S ",
	                    'X', VanillaPlusItems.ender_gem, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.ender_axe), new Object[]
	                {
	                    "XX",
	                    "SX",
	                    "S ",
	                    'X', VanillaPlusItems.ender_gem, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.ender_shovel), new Object[]
	                {
	                    "X",
	                    "S",
	                    "S",
	                    'X', VanillaPlusItems.ender_gem, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.ender_hoe), new Object[]
	                {
	                    "XX",
	                    "S ",
	                    "S ",
	                    'X', VanillaPlusItems.ender_gem, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.ender_helmet), new Object[]
	                {
	                    "XXX",
	                    "X X",
	                    "   ",
	                    'X', VanillaPlusItems.ender_gem
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.ender_plate), new Object[]
	                {
	                    "X X",
	                    "XXX",
	                    "XXX",
	                    'X', VanillaPlusItems.ender_gem
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.ender_legs), new Object[]
	                {
	                    "XXX",
	                    "X X",
	                    "X X",
	                    'X', VanillaPlusItems.ender_gem
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.ender_boots), new Object[]
	                {
	                    "   ",
	                    "X X",
	                    "X X",
	                    'X', VanillaPlusItems.ender_gem
	                });
	        
	        //RUBY SET
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.ruby_sword), new Object[]
	                {
	                    "X",
	                    "X",
	                    "S",
	                    'X', VanillaPlusItems.ruby, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.ruby_pickaxe), new Object[]
	                {
	                    "XXX",
	                    " S ",
	                    " S ",
	                    'X', VanillaPlusItems.ruby, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.ruby_axe), new Object[]
	                {
	                    "XX",
	                    "SX",
	                    "S ",
	                    'X', VanillaPlusItems.ruby, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.ruby_shovel), new Object[]
	                {
	                    "X",
	                    "S",
	                    "S",
	                    'X', VanillaPlusItems.ruby, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.ruby_hoe), new Object[]
	                {
	                    "XX",
	                    "S ",
	                    "S ",
	                    'X', VanillaPlusItems.ruby, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.ruby_helmet), new Object[]
	                {
	                    "XXX",
	                    "X X",
	                    "   ",
	                    'X', VanillaPlusItems.ruby
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.ruby_plate), new Object[]
	                {
	                    "X X",
	                    "XXX",
	                    "XXX",
	                    'X', VanillaPlusItems.ruby
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.ruby_legs), new Object[]
	                {
	                    "XXX",
	                    "X X",
	                    "X X",
	                    'X', VanillaPlusItems.ruby
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.ruby_boots), new Object[]
	                {
	                    "   ",
	                    "X X",
	                    "X X",
	                    'X', VanillaPlusItems.ruby
	                });
	        
	        //SAPPHIRE SET
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.sapphire_sword), new Object[]
	                {
	                    "X",
	                    "X",
	                    "S",
	                    'X', VanillaPlusItems.sapphire, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.sapphire_pickaxe), new Object[]
	                {
	                    "XXX",
	                    " S ",
	                    " S ",
	                    'X', VanillaPlusItems.sapphire, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.sapphire_axe), new Object[]
	                {
	                    "XX",
	                    "SX",
	                    "S ",
	                    'X', VanillaPlusItems.sapphire, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.sapphire_shovel), new Object[]
	                {
	                    "X",
	                    "S",
	                    "S",
	                    'X', VanillaPlusItems.sapphire, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.sapphire_hoe), new Object[]
	                {
	                    "XX",
	                    "S ",
	                    "S ",
	                    'X', VanillaPlusItems.sapphire, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.sapphire_helmet), new Object[]
	                {
	                    "XXX",
	                    "X X",
	                    "   ",
	                    'X', VanillaPlusItems.sapphire
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.sapphire_plate), new Object[]
	                {
	                    "X X",
	                    "XXX",
	                    "XXX",
	                    'X', VanillaPlusItems.sapphire
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.sapphire_legs), new Object[]
	                {
	                    "XXX",
	                    "X X",
	                    "X X",
	                    'X', VanillaPlusItems.sapphire
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.sapphire_boots), new Object[]
	                {
	                    "   ",
	                    "X X",
	                    "X X",
	                    'X', VanillaPlusItems.sapphire
	                });
	        
	        //PURIFIED GOLD SET
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.pGold_sword), new Object[]
	                {
	                    "X",
	                    "X",
	                    "S",
	                    'X', VanillaPlusItems.purified_gold, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.pGold_pickaxe), new Object[]
	                {
	                    "XXX",
	                    " S ",
	                    " S ",
	                    'X', VanillaPlusItems.purified_gold, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.pGold_axe), new Object[]
	                {
	                    "XX",
	                    "SX",
	                    "S ",
	                    'X', VanillaPlusItems.purified_gold, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.pGold_shovel), new Object[]
	                {
	                    "X",
	                    "S",
	                    "S",
	                    'X', VanillaPlusItems.purified_gold, 'S', Items.stick
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusItems.pGold_hoe), new Object[]
	                {
	                    "XX",
	                    "S ",
	                    "S ",
	                    'X', VanillaPlusItems.purified_gold, 'S', Items.stick
	                });
	        
	        //DECOR BLOCKS
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusBlocks.ruby_block, 1, 0), new Object[]
	                {
	                    "XXX",
	                    "XXX",
	                    "XXX",
	                    'X', VanillaPlusItems.ruby,
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusBlocks.ruby_block, 1, 1), new Object[]
	                {
	                    "XXX",
	                    "XXX",
	                    "XXX",
	                    'X', VanillaPlusItems.sapphire,
	                });
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusBlocks.ruby_block, 1, 2), new Object[]
	                {
	                    "XXX",
	                    "XXX",
	                    "XXX",
	                    'X', VanillaPlusItems.hell_stone,
	                });
	        ItemStack rubyBlockCRAFT = new ItemStack(VanillaPlusBlocks.ruby_block, 1, 0);
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusBlocks.ruby_block, 4, 3), new Object[]
	                {
	                    "   ",
	                    " XX",
	                    " XX",
	                    'X', rubyBlockCRAFT
	                });
	        ItemStack rubyBlockChis = new ItemStack(VanillaPlusBlocks.ruby_block, 1, 3);
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusBlocks.ruby_block, 4, 0), new Object[]
	                {
	                    "   ",
	                    " XX",
	                    " XX",
	                    'X', rubyBlockChis
	                });
	        ItemStack sapphireBlock = new ItemStack(VanillaPlusBlocks.ruby_block, 1, 1);
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusBlocks.ruby_block, 4, 4), new Object[]
	                {
	                    "   ",
	                    " XX",
	                    " XX",
	                    'X', sapphireBlock
	                });
	        ItemStack sapphireBlockChis = new ItemStack(VanillaPlusBlocks.ruby_block, 1, 4);
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusBlocks.ruby_block, 4, 1), new Object[]
	                {
	                    "   ",
	                    " XX",
	                    " XX",
	                    'X', sapphireBlockChis
	                });
	        ItemStack hellStoneBlock = new ItemStack(VanillaPlusBlocks.ruby_block, 1, 2);
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusBlocks.ruby_block, 4, 5), new Object[]
	                {
	                    "   ",
	                    " XX",
	                    " XX",
	                    'X', hellStoneBlock
	                });
	        ItemStack hellStoneBlockChis = new ItemStack(VanillaPlusBlocks.ruby_block, 1, 5);
	        GameRegistry.addRecipe(new ItemStack(VanillaPlusBlocks.ruby_block, 4, 2), new Object[]
	                {
	                    "   ",
	                    " XX",
	                    " XX",
	                    'X', hellStoneBlockChis
	                });
		}
	     
	}
}
