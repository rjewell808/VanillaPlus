package gruntpie224.vanillaplus.init;

import gruntpie224.vanillaplus.Reference;
import gruntpie224.vanillaplus.VanillaPlus;
import gruntpie224.vanillaplus.armor.ArmorEmerald;
import gruntpie224.vanillaplus.armor.ArmorEnder;
import gruntpie224.vanillaplus.armor.ArmorGuard;
import gruntpie224.vanillaplus.armor.ArmorScorched;
import gruntpie224.vanillaplus.armor.ArmorWater;
import gruntpie224.vanillaplus.armor.ArmorObsidian;
import gruntpie224.vanillaplus.armor.ArmorRuby;
import gruntpie224.vanillaplus.items.ItemAirSword;
import gruntpie224.vanillaplus.items.ItemBasic;
import gruntpie224.vanillaplus.items.ItemBasicAxe;
import gruntpie224.vanillaplus.items.ItemBasicHoe;
import gruntpie224.vanillaplus.items.ItemBasicPickaxe;
import gruntpie224.vanillaplus.items.ItemBasicShovel;
import gruntpie224.vanillaplus.items.ItemBasicSword;
import gruntpie224.vanillaplus.items.ItemBeeSword;
import gruntpie224.vanillaplus.items.ItemInkSword;
import gruntpie224.vanillaplus.items.ItemMagmaSword;
import gruntpie224.vanillaplus.items.ItemRapidBow;
import gruntpie224.vanillaplus.items.ItemVanillaPlusFood;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.common.util.EnumHelper;

public class VanillaPlusItems {
	
	//BASIC ITEMS
	public static Item enchanted_gem;
	public static Item enchanted_dust;
	public static Item ender_crystal_corrupt;
	public static Item ender_crystal;
	public static Item ender_gem;
	public static Item magma_chunk;
	public static Item hell_stone;
	public static Item ruby;
	public static Item sapphire;
	public static Item head_frag_skeleton;
	public static Item head_frag_creeper;
	public static Item head_frag_zombie;
	public static Item gravel_clump;
	public static Item golden_feather;
	public static Item bloated_ink;
	public static Item air_tank;
	public static Item guardian_ingot;
	public static Item purified_gold;
	public static Item diamond_rod;
	public static Item slime_jelly;
	
	//FOOD
	public static Item cooked_flesh;
	public static Item seasoned_flesh;
	public static Item slime_sandwich;
	public static Item slime_sandwich_toasted;
	public static Item toast;
	
	//SPECIAL WEAPONS
	public static Item rapid_bow;
	public static Item magma_sword;
	public static Item ink_sword;
	public static Item air_sword;
	public static Item bee_sword;
	
	//OBSIDIAN SET
	public static Item obsidian_pickaxe;
    public static Item obsidian_axe;
    public static Item obsidian_shovel;
    public static Item obsidian_sword;
    public static Item obsidian_hoe;
    public static Item obsidian_helmet;
    public static Item obsidian_plate;
    public static Item obsidian_legs;
    public static Item obsidian_boots;
    
	//EMERALD SET
	public static Item emerald_pickaxe;
    public static Item emerald_axe;
    public static Item emerald_shovel;
    public static Item emerald_sword;
    public static Item emerald_hoe;
    public static Item emerald_helmet;
    public static Item emerald_plate;
    public static Item emerald_legs;
    public static Item emerald_boots;
    
    //RUBY SET
  	public static Item ruby_pickaxe;
  	public static Item ruby_axe;
  	public static Item ruby_shovel;
  	public static Item ruby_sword;
  	public static Item ruby_hoe;
    public static Item ruby_helmet;
    public static Item ruby_plate;
    public static Item ruby_legs;
    public static Item ruby_boots;
  	
  	//SAPPHIRE SET
  	public static Item sapphire_pickaxe;
  	public static Item sapphire_axe;
  	public static Item sapphire_shovel;
  	public static Item sapphire_sword;
  	public static Item sapphire_hoe;
  	public static Item sapphire_helmet;
    public static Item sapphire_plate;
    public static Item sapphire_legs;
    public static Item sapphire_boots;
    
    //GRAVEL SET
  	public static Item gravel_pickaxe;
    public static Item gravel_axe;
    public static Item gravel_shovel;
    public static Item gravel_sword;
    public static Item gravel_hoe;
    
    //PURE GOLD
    public static Item pGold_pickaxe;
    public static Item pGold_axe;
    public static Item pGold_shovel;
    public static Item pGold_sword;
    public static Item pGold_hoe;
	
	//GUARDIAN SET
	public static Item guard_helmet;
    public static Item guard_plate;
    public static Item guard_legs;
    public static Item guard_boots;
    
    //SCUBA SET
    public static Item scuba_helmet;
    public static Item scuba_plate;
    public static Item scuba_legs;
    public static Item scuba_boots;
    
    //SCORCHED SET
    public static Item scorched_helmet;
    public static Item scorched_plate;
    public static Item scorched_legs;
    public static Item scorched_boots;
    
    //ENDER SET
  	public static Item ender_pickaxe;
    public static Item ender_axe;
    public static Item ender_shovel;
    public static Item ender_sword;
    public static Item ender_hoe;
    public static Item ender_helmet;
    public static Item ender_plate;
    public static Item ender_legs;
    public static Item ender_boots;

	//TOOL STATS --------------------------------------------------(NAME, HARVESTLVL, MAXUSE, EFF, DMG, ENCHANT)
	public static ToolMaterial toolObsidian = EnumHelper.addToolMaterial("OBSIDIAN", 4, 2500, 7.0F, 3, 8);
	public static ToolMaterial toolEmerald = EnumHelper.addToolMaterial("EMERALD", 4, 450, 20.0F, 3, 12);
	public static ToolMaterial toolMagma = EnumHelper.addToolMaterial("MAGMA", 3, 500, 7.0F, 3, 15);
	public static ToolMaterial toolGravel = EnumHelper.addToolMaterial("GRAVEL", 1, 120, 10.0F, 1, 3);
	public static ToolMaterial toolAir = EnumHelper.addToolMaterial("AIR", 3, 250, 7.0F, 2, 15);
	public static ToolMaterial toolEnder = EnumHelper.addToolMaterial("ENDER", 4, 500, 20.0F, 4, 15);
	public static ToolMaterial toolRuby = EnumHelper.addToolMaterial("RUBY", 3, 1580, 7.0F, 4, 25);
	public static ToolMaterial toolSapphire = EnumHelper.addToolMaterial("SAPPHIRE", 3, 1620, 10.0F, 4, 20);
	public static ToolMaterial toolpGold = EnumHelper.addToolMaterial("PGOLD", 1, 150, 12.0F, 0, 26);
	public static ToolMaterial toolbHorseSuper = EnumHelper.addToolMaterial("BHORSESUPER", 1, 1, 12.0F, 12, 10);
	
	//ARMOR STATS
	public static ArmorMaterial armorObsidian = EnumHelper.addArmorMaterial("OBSIDIAN","obsidian",66, new int[] {3, 8, 7, 2}, 8);
	public static ArmorMaterial armorEmerald = EnumHelper.addArmorMaterial("EMERALD","emerald", 30, new int[] {3, 6, 4, 2}, 13);
	public static ArmorMaterial armorEnder = EnumHelper.addArmorMaterial("ENDER","ender", 40, new int[] {3, 6, 6, 2}, 15);
	public static ArmorMaterial armorWater = EnumHelper.addArmorMaterial("WATER","scuba", 15, new int[] {2, 6, 5, 2}, 9);
	public static ArmorMaterial armorScorched = EnumHelper.addArmorMaterial("SCORCHED","scorched", 30, new int[] {3, 5, 4, 2}, 12);
	public static ArmorMaterial armorRuby = EnumHelper.addArmorMaterial("RUBY","ruby", 35, new int[] {2, 7, 5,2}, 25);
	public static ArmorMaterial armorSapphire = EnumHelper.addArmorMaterial("SAPPHIRE","sapphire", 35, new int[] {2, 7, 5, 2}, 20);
	public static ArmorMaterial armorGuardian = EnumHelper.addArmorMaterial("GUARDIAN","guardian", 1, new int[] {2, 4, 3, 2}, 4);
	
	public static void init(){
		enchanted_gem = new ItemBasic().setUnlocalizedName("enchanted_gem");
		enchanted_dust = new ItemBasic(true).setUnlocalizedName("enchanted_dust");	
		magma_chunk = new ItemBasic().setUnlocalizedName("magma_chunk");
		ender_crystal_corrupt = new ItemBasic(true).setUnlocalizedName("ender_crystal_corrupt");
        ender_crystal = new ItemBasic().setUnlocalizedName("ender_crystal");
        ender_gem = new ItemBasic().setUnlocalizedName("ender_gem");
		hell_stone = new ItemBasic().setUnlocalizedName("hell_stone");
		ruby = new ItemBasic().setUnlocalizedName("ruby");
		sapphire = new ItemBasic().setUnlocalizedName("sapphire");
		head_frag_skeleton = new ItemBasic().setUnlocalizedName("head_frag_skeleton");
		head_frag_creeper = new ItemBasic().setUnlocalizedName("head_frag_creeper");
		head_frag_zombie = new ItemBasic().setUnlocalizedName("head_frag_zombie");
		gravel_clump = new ItemBasic().setUnlocalizedName("gravel_clump");
		golden_feather = new ItemBasic().setUnlocalizedName("golden_feather");
		bloated_ink = new ItemBasic().setUnlocalizedName("bloated_ink");
		air_tank = new ItemBasic().setUnlocalizedName("air_tank");
		guardian_ingot = new ItemBasic().setUnlocalizedName("guardian_ingot");
		purified_gold = new ItemBasic().setUnlocalizedName("purified_gold");
		diamond_rod = new ItemBasic().setUnlocalizedName("diamond_rod");
		slime_jelly = new ItemBasic().setUnlocalizedName("slime_jelly");
		
		cooked_flesh = new ItemVanillaPlusFood(4, 0.1F, true).setUnlocalizedName("cooked_flesh");
		seasoned_flesh = new ItemVanillaPlusFood(6, 0.1F, true).setUnlocalizedName("seasoned_flesh");
        toast = new ItemVanillaPlusFood(6, 0.1F, false).setUnlocalizedName("toast");
        slime_sandwich = new ItemVanillaPlusFood(15, 0.1F, false).setUnlocalizedName("slime_sandwich");
        slime_sandwich_toasted = new ItemVanillaPlusFood(17, 0.1F, false).setUnlocalizedName("slime_sandwich_toasted");
        
        rapid_bow = new ItemRapidBow().setUnlocalizedName("rapid_bow");
        magma_sword = new ItemMagmaSword(toolMagma).setUnlocalizedName("magma_sword");
        air_sword = new ItemAirSword(toolAir).setUnlocalizedName("air_sword");
        ink_sword = new ItemInkSword(toolAir).setUnlocalizedName("ink_sword");
        bee_sword = new ItemBeeSword(toolbHorseSuper).setUnlocalizedName("bee_sword");
        
        obsidian_pickaxe = new ItemBasicPickaxe(toolObsidian,Item.getItemFromBlock(VanillaPlusBlocks.obsidian_reinforced)).setUnlocalizedName("obsidian_pickaxe");
        obsidian_shovel = new ItemBasicShovel(toolObsidian,Item.getItemFromBlock(VanillaPlusBlocks.obsidian_reinforced)).setUnlocalizedName("obsidian_shovel");
        obsidian_sword = new ItemBasicSword(toolObsidian,Item.getItemFromBlock(VanillaPlusBlocks.obsidian_reinforced)).setUnlocalizedName("obsidian_sword");
        obsidian_axe = new ItemBasicAxe(toolObsidian,Item.getItemFromBlock(VanillaPlusBlocks.obsidian_reinforced)).setUnlocalizedName("obsidian_axe");
        obsidian_hoe = new ItemBasicHoe(toolObsidian,Item.getItemFromBlock(VanillaPlusBlocks.obsidian_reinforced)).setUnlocalizedName("obsidian_hoe");
        obsidian_helmet = new ArmorObsidian(armorObsidian, 0, 0, "obsidian",Item.getItemFromBlock(VanillaPlusBlocks.obsidian_reinforced)).setUnlocalizedName("obsidian_helmet");
        obsidian_plate = new ArmorObsidian(armorObsidian, 0, 1, "obsidian",Item.getItemFromBlock(VanillaPlusBlocks.obsidian_reinforced)).setUnlocalizedName("obsidian_plate");
        obsidian_legs = new ArmorObsidian(armorObsidian, 0, 2, "obsidian",Item.getItemFromBlock(VanillaPlusBlocks.obsidian_reinforced)).setUnlocalizedName("obsidian_legs");
        obsidian_boots = new ArmorObsidian(armorObsidian, 0, 3, "obsidian",Item.getItemFromBlock(VanillaPlusBlocks.obsidian_reinforced)).setUnlocalizedName("obsidian_boots");
        
        emerald_pickaxe = new ItemBasicPickaxe(toolEmerald,Items.emerald).setUnlocalizedName("emerald_pickaxe");
        emerald_shovel = new ItemBasicShovel(toolEmerald,Items.emerald).setUnlocalizedName("emerald_shovel");
        emerald_sword = new ItemBasicSword(toolEmerald,Items.emerald).setUnlocalizedName("emerald_sword");
        emerald_axe = new ItemBasicAxe(toolEmerald,Items.emerald).setUnlocalizedName("emerald_axe");
        emerald_hoe = new ItemBasicHoe(toolEmerald,Items.emerald).setUnlocalizedName("emerald_hoe");
        emerald_helmet = new ArmorEmerald(armorEmerald, 0, 0, "emerald",Items.emerald).setUnlocalizedName("emerald_helmet");
        emerald_plate = new ArmorEmerald(armorEmerald, 0, 1, "emerald",Items.emerald).setUnlocalizedName("emerald_plate");
        emerald_legs = new ArmorEmerald(armorEmerald, 0, 2, "emerald",Items.emerald).setUnlocalizedName("emerald_legs");
        emerald_boots = new ArmorEmerald(armorEmerald, 0, 3, "emerald",Items.emerald).setUnlocalizedName("emerald_boots");
        
        ruby_pickaxe = new ItemBasicPickaxe( toolRuby,ruby).setUnlocalizedName("ruby_pickaxe");
        ruby_shovel = new ItemBasicShovel(toolRuby,ruby).setUnlocalizedName("ruby_shovel");
        ruby_sword = new ItemBasicSword(toolRuby,ruby).setUnlocalizedName("ruby_sword");
        ruby_axe = new ItemBasicAxe(toolRuby,ruby).setUnlocalizedName("ruby_axe");
        ruby_hoe = new ItemBasicHoe(toolRuby,ruby).setUnlocalizedName("ruby_hoe");
        ruby_helmet = new ArmorRuby(armorRuby, 0, 0, "ruby",ruby).setUnlocalizedName("ruby_helmet");
        ruby_plate = new ArmorRuby(armorRuby,0, 1, "ruby",ruby).setUnlocalizedName("ruby_plate");
        ruby_legs = new ArmorRuby(armorRuby,0, 2, "ruby",ruby).setUnlocalizedName("ruby_legs");
        ruby_boots = new ArmorRuby(armorRuby, 0, 3, "ruby",ruby).setUnlocalizedName("ruby_boots");
        
        sapphire_pickaxe = new ItemBasicPickaxe(toolSapphire,sapphire).setUnlocalizedName("sapphire_pickaxe");
        sapphire_shovel = new ItemBasicShovel(toolSapphire,sapphire).setUnlocalizedName("sapphire_shovel");
        sapphire_sword = new ItemBasicSword(toolSapphire,sapphire).setUnlocalizedName("sapphire_sword");
        sapphire_axe = new ItemBasicAxe(toolSapphire,sapphire).setUnlocalizedName("sapphire_axe");
        sapphire_hoe = new ItemBasicHoe(toolSapphire,sapphire).setUnlocalizedName("sapphire_hoe");
        sapphire_helmet = new ArmorRuby(armorSapphire, 0, 0, "sapphire",sapphire).setUnlocalizedName("sapphire_helmet");
        sapphire_plate = new ArmorRuby(armorSapphire, 0, 1, "sapphire",sapphire).setUnlocalizedName("sapphire_plate");
        sapphire_legs = new ArmorRuby(armorSapphire, 0, 2, "sapphire",sapphire).setUnlocalizedName("sapphire_legs");
        sapphire_boots = new ArmorRuby(armorSapphire, 0, 3, "sapphire",sapphire).setUnlocalizedName("sapphire_boots");
        
        gravel_pickaxe = new ItemBasicPickaxe(toolGravel,Item.getItemFromBlock(VanillaPlusBlocks.compact_gravel)).setUnlocalizedName("gravel_pickaxe");
        gravel_shovel = new ItemBasicShovel(toolGravel,Item.getItemFromBlock(VanillaPlusBlocks.compact_gravel)).setUnlocalizedName("gravel_shovel");
        gravel_sword = new ItemBasicSword(toolGravel,Item.getItemFromBlock(VanillaPlusBlocks.compact_gravel)).setUnlocalizedName("gravel_sword");
        gravel_axe = new ItemBasicAxe(toolGravel,Item.getItemFromBlock(VanillaPlusBlocks.compact_gravel)).setUnlocalizedName("gravel_axe");
        gravel_hoe = new ItemBasicHoe(toolGravel,Item.getItemFromBlock(VanillaPlusBlocks.compact_gravel)).setUnlocalizedName("gravel_hoe");
        
        guard_helmet = new ArmorGuard(armorGuardian, 0, 0, "guardian").setUnlocalizedName("guard_helmet");
        guard_plate = new ArmorGuard(armorGuardian, 0, 1, "guardian").setUnlocalizedName("guard_plate");
        guard_legs = new ArmorGuard(armorGuardian, 0, 2, "guardian").setUnlocalizedName("guard_legs");
        guard_boots = new ArmorGuard(armorGuardian, 0, 3, "guardian").setUnlocalizedName("guard_boots");
        
        pGold_pickaxe = new ItemBasicPickaxe(toolpGold,purified_gold).setUnlocalizedName("pGold_pickaxe");
        pGold_shovel = new ItemBasicShovel(toolpGold,purified_gold).setUnlocalizedName("pGold_shovel");
        pGold_sword = new ItemBasicSword(toolpGold,purified_gold).setUnlocalizedName("pGold_sword");
        pGold_axe = new ItemBasicAxe(toolpGold,purified_gold).setUnlocalizedName("pGold_axe");
        pGold_hoe = new ItemBasicHoe(toolpGold,purified_gold).setUnlocalizedName("pGold_hoe");
        
        ender_sword = new ItemBasicSword(toolEnder,ender_gem).setUnlocalizedName("ender_sword");
        ender_pickaxe = new ItemBasicPickaxe(toolEnder,ender_gem).setUnlocalizedName("ender_pickaxe");
        ender_axe = new ItemBasicAxe(toolEnder,ender_gem).setUnlocalizedName("ender_axe");
        ender_shovel = new ItemBasicShovel(toolEnder,ender_gem).setUnlocalizedName("ender_shovel");
        ender_hoe = new ItemBasicHoe(toolEnder,ender_gem).setUnlocalizedName("ender_hoe");
        ender_helmet = new ArmorEnder(armorEnder, 0, 0, "ender").setUnlocalizedName("ender_helmet");
        ender_plate = new ArmorEnder (armorEnder, 0, 1, "ender").setUnlocalizedName("ender_plate");
        ender_legs = new ArmorEnder(armorEnder, 0, 2, "ender").setUnlocalizedName("ender_legs");
        ender_boots = new ArmorEnder(armorEnder, 0, 3, "ender").setUnlocalizedName("ender_boots");
        
        scorched_helmet = new ArmorScorched(armorScorched,0, 0, "scorched").setUnlocalizedName("scorched_helmet");
        scorched_plate = new ArmorScorched(armorScorched, 0, 1, "scorched").setUnlocalizedName("scorched_plate");
        scorched_legs = new ArmorScorched(armorScorched, 0, 2, "scorched").setUnlocalizedName("scorched_legs");
        scorched_boots = new ArmorScorched(armorScorched, 0, 3, "scorched").setUnlocalizedName("scorched_boots");
        
        scuba_helmet = new ArmorWater(armorWater, 0, 0, "scuba").setUnlocalizedName("scuba_helmet");
        scuba_plate = new ArmorWater(armorWater, 0, 1, "scuba").setUnlocalizedName("scuba_plate");
        scuba_legs = new ArmorWater(armorWater, 0, 2, "scuba").setUnlocalizedName("scuba_legs");
        scuba_boots = new ArmorWater(armorWater, 0, 3, "scuba").setUnlocalizedName("scuba_boots");
	}
	
	public static void register(){
		GameRegistry.registerItem(enchanted_dust, "enchanted_dust");
		GameRegistry.registerItem(enchanted_gem, "enchanted_gem");
		GameRegistry.registerItem(ender_crystal_corrupt, "ender_crystal_corrupt");
		GameRegistry.registerItem(ender_crystal, "ender_crystal");
		GameRegistry.registerItem(ender_gem, "ender_gem");
		GameRegistry.registerItem(magma_chunk, "magma_chunk");
		GameRegistry.registerItem(hell_stone, "hell_stone");
		GameRegistry.registerItem(ruby, "ruby");
		GameRegistry.registerItem(sapphire, "sapphire");
		GameRegistry.registerItem(guardian_ingot, "guardian_ingot");
		GameRegistry.registerItem(purified_gold, "purified_gold");	
		GameRegistry.registerItem(gravel_clump, "gravel_clump");
		GameRegistry.registerItem(golden_feather, "golden_feather");
		GameRegistry.registerItem(bloated_ink, "bloated_ink");
		GameRegistry.registerItem(air_tank, "air_tank");
		GameRegistry.registerItem(diamond_rod, "diamond_rod");
		GameRegistry.registerItem(slime_jelly, "slime_jelly");
		GameRegistry.registerItem(head_frag_skeleton, "head_frag_skeleton");
		GameRegistry.registerItem(head_frag_creeper, "head_frag_creeper");
		GameRegistry.registerItem(head_frag_zombie, "head_frag_zombie");
		
		GameRegistry.registerItem(cooked_flesh, "cooked_flesh");
		GameRegistry.registerItem(seasoned_flesh, "seasoned_flesh");
		GameRegistry.registerItem(toast, "toast");
		GameRegistry.registerItem(slime_sandwich, "slime_sandwich");
		GameRegistry.registerItem(slime_sandwich_toasted, "slime_sandwich_toasted");
		
		GameRegistry.registerItem(rapid_bow, "rapid_bow");
		GameRegistry.registerItem(magma_sword, "magma_sword");
		GameRegistry.registerItem(air_sword, "air_sword");
		GameRegistry.registerItem(ink_sword, "ink_sword");
		GameRegistry.registerItem(bee_sword, "bee_sword");
		
		GameRegistry.registerItem(gravel_pickaxe, "gravel_pickaxe");
		GameRegistry.registerItem(gravel_shovel, "gravel_shovel");
		GameRegistry.registerItem(gravel_sword, "gravel_sword");
		GameRegistry.registerItem(gravel_axe, "gravel_axe");
		GameRegistry.registerItem(gravel_hoe, "gravel_hoe");
		
		GameRegistry.registerItem(pGold_pickaxe, "pGold_pickaxe");
		GameRegistry.registerItem(pGold_shovel, "pGold_shovel");
		GameRegistry.registerItem(pGold_sword, "pGold_sword");
		GameRegistry.registerItem(pGold_axe, "pGold_axe");
		GameRegistry.registerItem(pGold_hoe, "pGold_hoe");
		
		GameRegistry.registerItem(obsidian_pickaxe, "obsidian_pickaxe");
		GameRegistry.registerItem(obsidian_shovel, "obsidian_shovel");
		GameRegistry.registerItem(obsidian_sword, "obsidian_sword");
		GameRegistry.registerItem(obsidian_axe, "obsidian_axe");
		GameRegistry.registerItem(obsidian_hoe, "obsidian_hoe");
		GameRegistry.registerItem(obsidian_helmet, "obsidian_helmet");
		GameRegistry.registerItem(obsidian_plate, "obsidian_plate");
		GameRegistry.registerItem(obsidian_legs, "obsidian_legs");
		GameRegistry.registerItem(obsidian_boots, "obsidian_boots");
		
		GameRegistry.registerItem(emerald_pickaxe, "emerald_pickaxe");
		GameRegistry.registerItem(emerald_shovel, "emerald_shovel");
		GameRegistry.registerItem(emerald_sword, "emerald_sword");
		GameRegistry.registerItem(emerald_axe, "emerald_axe");
		GameRegistry.registerItem(emerald_hoe, "emerald_hoe");
		GameRegistry.registerItem(emerald_helmet, "emerald_helmet");
		GameRegistry.registerItem(emerald_plate, "emerald_plate");
		GameRegistry.registerItem(emerald_legs, "emerald_legs");
		GameRegistry.registerItem(emerald_boots, "emerald_boots");
		
		GameRegistry.registerItem(ruby_pickaxe, "ruby_pickaxe");
		GameRegistry.registerItem(ruby_shovel, "ruby_shovel");
		GameRegistry.registerItem(ruby_sword, "ruby_sword");
		GameRegistry.registerItem(ruby_axe, "ruby_axe");
		GameRegistry.registerItem(ruby_hoe, "ruby_hoe");	
		GameRegistry.registerItem(ruby_helmet, "ruby_helmet");
		GameRegistry.registerItem(ruby_plate, "ruby_plate");
		GameRegistry.registerItem(ruby_legs, "ruby_legs");
		GameRegistry.registerItem(ruby_boots, "ruby_boots");
		
		GameRegistry.registerItem(sapphire_pickaxe, "sapphire_pickaxe");
		GameRegistry.registerItem(sapphire_shovel, "sapphire_shovel");
		GameRegistry.registerItem(sapphire_sword, "sapphire_sword");
		GameRegistry.registerItem(sapphire_axe, "sapphire_axe");
		GameRegistry.registerItem(sapphire_hoe, "sapphire_hoe");	
		GameRegistry.registerItem(sapphire_helmet, "sapphire_helmet");
		GameRegistry.registerItem(sapphire_plate, "sapphire_plate");
		GameRegistry.registerItem(sapphire_legs, "sapphire_legs");
		GameRegistry.registerItem(sapphire_boots, "sapphire_boots");
		
		GameRegistry.registerItem(ender_pickaxe, "ender_pickaxe");
		GameRegistry.registerItem(ender_shovel, "ender_shovel");
		GameRegistry.registerItem(ender_sword, "ender_sword");
		GameRegistry.registerItem(ender_axe, "ender_axe");
		GameRegistry.registerItem(ender_hoe, "ender_hoe");
		GameRegistry.registerItem(ender_helmet, "ender_helmet");
		GameRegistry.registerItem(ender_plate, "ender_plate");
		GameRegistry.registerItem(ender_legs, "ender_legs");
		GameRegistry.registerItem(ender_boots, "ender_boots");
		
		GameRegistry.registerItem(scorched_helmet, "scorched_helmet");
		GameRegistry.registerItem(scorched_plate, "scorched_plate");
		GameRegistry.registerItem(scorched_legs, "scorched_legs");
		GameRegistry.registerItem(scorched_boots, "scorched_boots");
		
		GameRegistry.registerItem(guard_helmet, "guard_helmet");
		GameRegistry.registerItem(guard_plate, "guard_plate");
		GameRegistry.registerItem(guard_legs, "guard_legs");
		GameRegistry.registerItem(guard_boots, "guard_boots");
		
		GameRegistry.registerItem(scuba_helmet, "scuba_helmet");
		GameRegistry.registerItem(scuba_plate, "scuba_plate");
		GameRegistry.registerItem(scuba_legs, "scuba_legs");
		GameRegistry.registerItem(scuba_boots, "scuba_boots");
		
	}
	
	public static void registerRenders(){
		registerRender(enchanted_gem);
		registerRender(enchanted_dust);
		registerRender(magma_chunk);
		registerRender(ender_crystal_corrupt);
		registerRender(ender_crystal);
		registerRender(ender_gem);
		registerRender(hell_stone);
		registerRender(ruby);
		registerRender(sapphire);
		registerRender(head_frag_skeleton);
		registerRender(head_frag_creeper);
		registerRender(head_frag_zombie);
		registerRender(gravel_clump);
		registerRender(golden_feather);
		registerRender(bloated_ink);
		registerRender(air_tank);
		registerRender(guardian_ingot);
		registerRender(purified_gold);
		registerRender(diamond_rod);
		registerRender(slime_jelly);
		
		registerRender(cooked_flesh);
		registerRender(seasoned_flesh);
		registerRender(toast);
		registerRender(slime_sandwich);
		registerRender(slime_sandwich_toasted);
		
		registerRender(rapid_bow);
		registerRender(magma_sword);
		registerRender(air_sword);
		registerRender(ink_sword);
		registerRender(bee_sword);
		
		registerRender(pGold_pickaxe);
		registerRender(pGold_shovel);
		registerRender(pGold_sword);
		registerRender(pGold_axe);
		registerRender(pGold_hoe);
		
		registerRender(obsidian_pickaxe);
		registerRender(obsidian_shovel);
		registerRender(obsidian_sword);
		registerRender(obsidian_axe);
		registerRender(obsidian_hoe);
		registerRender(obsidian_helmet);
		registerRender(obsidian_plate);
		registerRender(obsidian_legs);
		registerRender(obsidian_boots);
		
		registerRender(emerald_pickaxe);
		registerRender(emerald_shovel);
		registerRender(emerald_sword);
		registerRender(emerald_axe);
		registerRender(emerald_hoe);
		registerRender(emerald_helmet);
		registerRender(emerald_plate);
		registerRender(emerald_legs);
		registerRender(emerald_boots);
		
		registerRender(ruby_pickaxe);
		registerRender(ruby_shovel);
		registerRender(ruby_sword);
		registerRender(ruby_axe);
		registerRender(ruby_hoe);
		registerRender(ruby_helmet);
		registerRender(ruby_plate);
		registerRender(ruby_legs);
		registerRender(ruby_boots);
	
		registerRender(sapphire_pickaxe);
		registerRender(sapphire_shovel);
		registerRender(sapphire_sword);
		registerRender(sapphire_axe);
		registerRender(sapphire_hoe);
		registerRender(sapphire_helmet);
		registerRender(sapphire_plate);
		registerRender(sapphire_legs);
		registerRender(sapphire_boots);
		
		registerRender(gravel_pickaxe);
		registerRender(gravel_shovel);
		registerRender(gravel_sword);
		registerRender(gravel_axe);
		registerRender(gravel_hoe);
		
		registerRender(ender_pickaxe);
		registerRender(ender_shovel);
		registerRender(ender_sword);
		registerRender(ender_axe);
		registerRender(ender_hoe);
		registerRender(ender_helmet);
		registerRender(ender_plate);
		registerRender(ender_legs);
		registerRender(ender_boots);
		
		
		registerRender(scorched_helmet);
		registerRender(scorched_plate);
		registerRender(scorched_legs);
		registerRender(scorched_boots);
		
		registerRender(guard_helmet);
		registerRender(guard_plate);
		registerRender(guard_legs);
		registerRender(guard_boots);
		
		registerRender(scuba_helmet);
		registerRender(scuba_plate);
		registerRender(scuba_legs);
		registerRender(scuba_boots);
	}
	
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public static void InitBow(FMLInitializationEvent event)
	{
		if(event.getSide().isClient())
        {
            ModelBakery.addVariantName(rapid_bow, new String[] {Reference.MOD_ID + ":rapid_bow", Reference.MOD_ID + ":rapid_bow_1", Reference.MOD_ID + ":rapid_bow_2", Reference.MOD_ID + ":rapid_bow_3"});

            registerItem(rapid_bow, 0, Reference.MOD_ID + ":rapid_bow");
            registerItem(rapid_bow, 1, Reference.MOD_ID + ":rapid_bow_1");
            registerItem(rapid_bow, 2, Reference.MOD_ID + ":rapid_bow_2");
            registerItem(rapid_bow, 3, Reference.MOD_ID + ":rapid_bow_3");
        }
	}
	
	@SideOnly(Side.CLIENT)
    public static void registerItem(Item item, int metadata, String itemName)
    {
        ItemModelMesher mesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
        mesher.register(item, metadata, new ModelResourceLocation(itemName, "inventory"));
    }
}
