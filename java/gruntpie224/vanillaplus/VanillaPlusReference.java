/*
package net.vanillaplus.common;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.vanillaplus.armor.ArmorEmerald;
import net.vanillaplus.armor.ArmorEnder;
import net.vanillaplus.armor.ArmorGuard;
import net.vanillaplus.armor.ArmorObsidian;
import net.vanillaplus.armor.ArmorRuby;
import net.vanillaplus.armor.ArmorSapphire;
import net.vanillaplus.armor.ArmorScorched;
import net.vanillaplus.armor.ArmorWater;
import net.vanillaplus.block.BlockAcaciaDoor;
import net.vanillaplus.block.BlockBirchDoor;
import net.vanillaplus.block.BlockDarkOakDoor;
import net.vanillaplus.block.BlockEnderCrystalOre;
import net.vanillaplus.block.BlockExpTranslator;
import net.vanillaplus.block.BlockGravelCompact;
import net.vanillaplus.block.BlockHellFireOre;
import net.vanillaplus.block.BlockJungleDoor;
import net.vanillaplus.block.BlockMagmaOre;
import net.vanillaplus.block.BlockObsidianForced;
import net.vanillaplus.block.BlockRubyBlock;
import net.vanillaplus.block.BlockRubyOre;
import net.vanillaplus.block.BlockSapphireOre;
import net.vanillaplus.block.BlockSpruceDoor;
import net.vanillaplus.block.BlockXpOre;
import net.vanillaplus.helpers.CraftingHandler;
import net.vanillaplus.helpers.FuelHandler;
import net.vanillaplus.helpers.MainConfig;
import net.vanillaplus.helpers.RecipeHandler;
import net.vanillaplus.helpers.VanillaAchievements;
import net.vanillaplus.item.ItemBeeHorseSword;
import net.vanillaplus.item.ItemDoorItem;
import net.vanillaplus.item.ItemBasic;
import net.vanillaplus.item.ItemCookedFlesh;
import net.vanillaplus.item.ItemCorrputedEnderCrystal;
import net.vanillaplus.item.ItemEmptyVial;
import net.vanillaplus.item.ItemEnchantedRock;
import net.vanillaplus.item.ItemEnchantedSword;
import net.vanillaplus.item.ItemEnderCrystal;
import net.vanillaplus.item.ItemEnderGem;
import net.vanillaplus.item.ItemExpVial;
import net.vanillaplus.item.ItemInkSword;
import net.vanillaplus.item.ItemMagmaSword;
import net.vanillaplus.item.ItemBasicAxe;
import net.vanillaplus.item.ItemBasicHoe;
import net.vanillaplus.item.ItemBasicPickaxe;
import net.vanillaplus.item.ItemBasicShovel;
import net.vanillaplus.item.ItemBasicSword;
import net.vanillaplus.item.ItemRapidBow;
import net.vanillaplus.item.ItemRubyBlock;
import net.vanillaplus.item.ItemSeasonedFlesh;
import net.vanillaplus.item.ItemSlimeSandwich;
import net.vanillaplus.item.ItemToast;
import net.vanillaplus.item.ItemToastedSlimeSandwich;
import net.vanillaplus.proxy.ClientProxy;
import net.vanillaplus.proxy.ServerProxy;
import net.vanillaplus.renderer.TileEntityExpTranslator;
import net.vanillaplus.world.OreWorldGen;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = VanillaPlus.modid, name = "VanillaPlus")
public class VanillaPlus
{

    public static CreativeTabs VanillaPlusTabBlocks; 
    public static CreativeTabs VanillaPlusTabItems;

    
    public static final String modid = "VanillaPlus";
    @SidedProxy(clientSide = "net.vanillaplus.proxy.ClientProxy", serverSide = "net.vanillaplus.proxy.ServerProxy")
    public static ServerProxy proxy;
    public static ClientProxy Cproxy;
   
   
//BROKEN
    
/////////////////////////////////////////
//
//BLOCK AND ITEM STATS
//
/////////////////////////////////////////

//TOOLS
public static ToolMaterial toolObsidian = EnumHelper.addToolMaterial("OBSIDIAN", 4, 2500, 7.0F, 3, 35);
public static ToolMaterial toolEmerald = EnumHelper.addToolMaterial("EMERALD", 4, 450, 20.0F, 3, 35);
public static ToolMaterial toolMagma = EnumHelper.addToolMaterial("MAGMA", 3, 500, 7.0F, 3, 25);
public static ToolMaterial toolGravel = EnumHelper.addToolMaterial("GRAVEL", 1, 120, 10.0F, 1, 15);
public static ToolMaterial toolAir = EnumHelper.addToolMaterial("AIR", 3, 250, 7.0F, 2, 25);
public static ToolMaterial toolEnder = EnumHelper.addToolMaterial("ENDER", 4, 500, 20.0F, 4, 40);
public static ToolMaterial toolRuby = EnumHelper.addToolMaterial("RUBY", 3, 1600, 7.0F, 4, 38);
public static ToolMaterial toolSapphire = EnumHelper.addToolMaterial("SAPPHIRE", 3, 1700, 10.0F, 4, 38);
public static ToolMaterial toolpGold = EnumHelper.addToolMaterial("PGOLD", 1, 150, 12.0F, 0, 22);
public static ToolMaterial toolbHorseSuper = EnumHelper.addToolMaterial("BHORSESUPER", 1, 1, 12.0F, 12, 22);

//ARMOR
public static ArmorMaterial armorObsidian = EnumHelper.addArmorMaterial("OBSIDIAN", 66, new int[] {3, 8, 7, 2}, 45);
public static ArmorMaterial armorEmerald = EnumHelper.addArmorMaterial("EMERALD", 30, new int[] {3, 6, 4, 2}, 45);
public static ArmorMaterial armorEnder = EnumHelper.addArmorMaterial("ENDER", 40, new int[] {3, 6, 6, 2}, 60);
public static ArmorMaterial armorWater = EnumHelper.addArmorMaterial("WATER", 15, new int[] {2, 6, 5, 2}, 60);
public static ArmorMaterial armorScorched = EnumHelper.addArmorMaterial("SCORCHED", 30, new int[] {3, 5, 4, 2}, 60);
public static ArmorMaterial armorRuby = EnumHelper.addArmorMaterial("RUBY", 35, new int[] {2, 7, 5,2}, 60);
public static ArmorMaterial armorSapphire = EnumHelper.addArmorMaterial("SAPPHIRE", 35, new int[] {2, 7, 5, 2}, 60);
public static ArmorMaterial armorGuardian = EnumHelper.addArmorMaterial("GUARDIAN", 1, new int[] {2, 4, 3, 2}, 60);

/////////////////////////////////////////
//
//BLOCK AND ITEM VARIABLES
//
/////////////////////////////////////////

    
//BLOCKS
    public static Block obsidianForced;
    public static Block magmaOre;
    public static Block goldenEgg;
    public static Block xpOre;
    public static Block gravelCompact;
    public static Block magmaEgg;
    public static Block enchantedEgg;
    public static Block enderCrystalOre;
    public static Block hellFireOre;
    public static Block rubyOre;
    public static Block sapphireOre;
    public static Block rubyBlock;
    public static Block sapphireBlock;
    public static Block hellStoneBlock;
    public static Block birchDoor;
    public static Block spruceDoor;
    public static Block jungleDoor;
    public static Block darkOakDoor;
    public static Block acaciaDoor;
    public static Block expTranslator;

//ITEMS
    public static Item magmaChunk;
    public static Item enchantedRock;
    public static Item skeletonHeadFrag;
    public static Item creeperHeadFrag;
    public static Item zombieHeadFrag;
    public static Item gravelClump;
    public static Item enchantedGem;
    public static Item goldenFeather;
    public static Item bloatedInkSac;
    public static Item airTank;
    public static Item hellStone;
    public static Item ruby;
    public static Item sapphire;
    public static Item guardianIngot;
    public static Item purifiedGold;
    public static Item diamondRod;
    public static Item birchDoorItem;
    public static Item spruceDoorItem;
    public static Item jungleDoorItem;
    public static Item darkOakDoorItem;
    public static Item acaciaDoorItem;
    public static Item emptyVial;
    public static Item expVial;

//SPECIALIZED SWORDS    
    public static Item magmaSword;
    public static Item enchantedSword;
    public static Item inkSword;
    public static Item beeHorseSword;
   
//BOWS
    public static Item rapidBow;
    
//FOOD
    public static Item cookedFlesh;
    public static Item seasonedFlesh;
    public static Item slimeJelly;
    public static Item slimeSandwich;
    public static Item toast;
    public static Item toastedSlimeSandwich;

//EMERALD
    public static Item emeraldPickaxe;
    public static Item emeraldAxe;
    public static Item emeraldShovel;
    public static Item emeraldSword;
    public static Item emeraldHoe;
    public static Item emeraldHelmet;
    public static Item emeraldPlate;
    public static Item emeraldLegs;
    public static Item emeraldBoots;

//OBSIDIAN
    public static Item obsidianPickaxe;
    public static Item obsidianAxe;
    public static Item obsidianShovel;
    public static Item obsidianSword;
    public static Item obsidianHoe;
    public static Item obsidianHelmet;
    public static Item obsidianPlate;
    public static Item obsidianLegs;
    public static Item obsidianBoots;

//OBSIDIAN
    public static Item gravelPickaxe;
    public static Item gravelAxe;
    public static Item gravelShovel;
    public static Item gravelSword;
    public static Item gravelHoe;
    
//ENDER
    public static Item enderGem;
    public static Item enderCrystal;
    public static Item corruptedEnderCrystal;
    public static Item enderSword;
    public static Item enderPickaxe;
    public static Item enderAxe;
    public static Item enderShovel;
    public static Item enderHoe;
    public static Item enderHelmet;
    public static Item enderPlate;
    public static Item enderLegs;
    public static Item enderBoots;
    
//SCUBA
    public static Item scubaHelmet;
    public static Item scubaTank;
    public static Item scubaPants;
    public static Item scubaFlippers;
    
//SCORCHED
    public static Item scorchedHelmet;
    public static Item scorchedPlate;
    public static Item scorchedLegs;
    public static Item scorchedBoots;
    
//GUARDIAN TIER I
    public static Item invHelmet;
    public static Item invPlate;
    public static Item invLegs;
    public static Item invBoots;
    
//RUBY
    public static Item rubyPickaxe;
    public static Item rubyAxe;
    public static Item rubyShovel;
    public static Item rubySword;
    public static Item rubyHoe;
    public static Item rubyHelmet;
    public static Item rubyPlate;
    public static Item rubyLegs;
    public static Item rubyBoots;
    
//SAPPHIRE
    public static Item sapphirePickaxe;
    public static Item sapphireAxe;
    public static Item sapphireShovel;
    public static Item sapphireSword;
    public static Item sapphireHoe;
    public static Item sapphireHelmet;
    public static Item sapphirePlate;
    public static Item sapphireLegs;
    public static Item sapphireBoots;
    
//SAPPHIRE
    public static Item pGoldPickaxe;
    public static Item pGoldAxe;
    public static Item pGoldShovel;
    public static Item pGoldSword;
    public static Item pGoldHoe;
    

    @EventHandler
    public void load(FMLInitializationEvent e)
    {
/////////////////////////////////////////
//
//BLOCKS
//
/////////////////////////////////////////
//Block Properties
    	
        obsidianForced = new BlockObsidianForced(Material.iron).setHardness(65.0f).setBlockName("obsidianForced");
        gravelCompact = new BlockGravelCompact(Material.ground).setBlockName("gravelCompact");
        expTranslator = new BlockExpTranslator(1, Material.wood).setHardness(3.0f).setBlockName("expTranslatorParticles");
        magmaOre = new BlockMagmaOre(Material.iron).setBlockName("magmaOre");
        xpOre = new BlockXpOre(Material.iron).setHardness(4.0f).setLightLevel(0.2F).setBlockName("xpOre");
        enderCrystalOre = new BlockEnderCrystalOre(Material.iron).setHardness(10.0f).setResistance(2000.0F).setBlockName("enderCrystalOreNew");
        hellFireOre = new BlockHellFireOre(Material.iron).setHardness(10.0f).setBlockName("hellFireOre");
        rubyOre = new BlockRubyOre(Material.iron).setHardness(10.0f).setBlockName("rubyOre");
        sapphireOre = new BlockSapphireOre(Material.iron).setHardness(10.0f).setBlockName("sapphireOre");
        rubyBlock = new BlockRubyBlock(Material.iron).setHardness(10.0f).setBlockName("rubyBlock");
        birchDoor = new BlockBirchDoor(Material.wood).setHardness(3.0f).setBlockName("birchDoor");
        spruceDoor = new BlockSpruceDoor(Material.wood).setHardness(3.0f).setBlockName("spruceDoor");
        jungleDoor = new BlockJungleDoor(Material.wood).setHardness(3.0f).setBlockName("jungleDoor");
        acaciaDoor = new BlockAcaciaDoor(Material.wood).setHardness(3.0f).setBlockName("acaciaDoor");
        darkOakDoor = new BlockDarkOakDoor(Material.wood).setHardness(3.0f).setBlockName("darkOakDoor");
        //goldenEgg = new BlockGoldenEgg(goldenEggID).setHardness(8.0f).setUnlocalizedName("goldenEgg");
        //magmaEgg = new BlockGoldenEgg(magmaEggID).setHardness(8.0f).setUnlocalizedName("magmaEgg");
        //enchantedEgg = new BlockGoldenEgg(enchantedEggID).setHardness(8.0f).setUnlocalizedName("enchantedEgg");
     
        
        
//Adding the Blocks
        GameRegistry.registerBlock(xpOre, "xpOre");
        GameRegistry.registerBlock(rubyOre,"rubyOre");
        GameRegistry.registerBlock(sapphireOre,"sapphireOre");
        GameRegistry.registerBlock(magmaOre, "magmaOre");
        GameRegistry.registerBlock(hellFireOre,"hellFireOre");
        GameRegistry.registerBlock(enderCrystalOre, "enderCrystalOre");
        GameRegistry.registerBlock(obsidianForced, "obsidianForced");
        GameRegistry.registerBlock(gravelCompact, "gravelCompact");
        GameRegistry.registerBlock(expTranslator, "expTranslator");
        GameRegistry.registerBlock(rubyBlock,ItemRubyBlock.class,"rubyBlock");
        GameRegistry.registerBlock(birchDoor,"birchDoor");
        GameRegistry.registerBlock(spruceDoor,"spruceDoor");
        GameRegistry.registerBlock(jungleDoor,"jungleDoor");
        GameRegistry.registerBlock(acaciaDoor,"acaciaDoor");
        GameRegistry.registerBlock(darkOakDoor,"darkOakDoor");
        //GameRegistry.registerBlock(goldenEgg, modid + goldenEgg.getUnlocalizedName().substring(5));
        //GameRegistry.registerBlock(magmaEgg, modid + magmaEgg.getUnlocalizedName().substring(5));
        //GameRegistry.registerBlock(enchantedEgg, modid + enchantedEgg.getUnlocalizedName().substring(5));

/////////////////////////////////////////
//
//ITEMS
//
/////////////////////////////////////////
        
        
        magmaChunk = new ItemBasic().setUnlocalizedName("magmaChunkNew");
        enchantedRock = new ItemEnchantedRock().setUnlocalizedName("enchantedRock");
        cookedFlesh = new ItemCookedFlesh(4, 0.1F, true).setUnlocalizedName("cookedFlesh");
        hellStone = new ItemBasic().setUnlocalizedName("hellStone");
        enchantedGem = new ItemBasic().setUnlocalizedName("enchantedGem");
        ruby = new ItemBasic().setUnlocalizedName("ruby");
        sapphire = new ItemBasic().setUnlocalizedName("sapphire");
        skeletonHeadFrag = new ItemBasic().setUnlocalizedName("skeletonHeadFrag");
        creeperHeadFrag = new ItemBasic().setUnlocalizedName("creeperHeadFrag");
        zombieHeadFrag = new ItemBasic().setUnlocalizedName("zombieHeadFrag");
        gravelClump = new ItemBasic().setUnlocalizedName("gravelClump");
        goldenFeather = new ItemBasic().setUnlocalizedName("goldenFeather");
        bloatedInkSac = new ItemBasic().setUnlocalizedName("bloatedInkSac");
        airTank = new ItemBasic().setUnlocalizedName("airTank");
        guardianIngot = new ItemBasic().setUnlocalizedName("guardianIngot");
        purifiedGold = new ItemBasic().setUnlocalizedName("purifiedGold");
        diamondRod = new ItemBasic().setUnlocalizedName("diamondRod");
        birchDoorItem = new ItemDoorItem(birchDoor).setUnlocalizedName("birchDoorItem");
        spruceDoorItem = new ItemDoorItem(spruceDoor).setUnlocalizedName("spruceDoorItem");
        jungleDoorItem = new ItemDoorItem(jungleDoor).setUnlocalizedName("jungleDoorItem");
        acaciaDoorItem = new ItemDoorItem(acaciaDoor).setUnlocalizedName("acaciaDoorItem");
        darkOakDoorItem = new ItemDoorItem(darkOakDoor).setUnlocalizedName("darkOakDoorItem");
        
        expVial = new ItemExpVial().setUnlocalizedName("expVial");
        emptyVial = new ItemEmptyVial().setUnlocalizedName("emptyVial");
        
        rapidBow = new ItemRapidBow().setUnlocalizedName("rapidBow");
        magmaSword = new ItemMagmaSword(toolMagma).setUnlocalizedName("magmaSword");
        enchantedSword = new ItemEnchantedSword(toolAir).setUnlocalizedName("enchantedSword");
        inkSword = new ItemInkSword(toolAir).setUnlocalizedName("inkSword");
        beeHorseSword = new ItemBeeHorseSword(toolbHorseSuper).setUnlocalizedName("beeHorseSword");
        
        seasonedFlesh = new ItemSeasonedFlesh( 8, 0.1F, true).setUnlocalizedName("seasonedFlesh");
        slimeJelly = new ItemBasic().setUnlocalizedName("slimeJelly");
        slimeSandwich = new ItemSlimeSandwich(15, 0.1F, false).setUnlocalizedName("slimeSandwich");
        toast = new ItemToast(8, 0.1F, false).setUnlocalizedName("toast");
        toastedSlimeSandwich = new ItemToastedSlimeSandwich(17, 0.1F, false).setUnlocalizedName("toastedSlimeSandwich");
        
        obsidianPickaxe = new ItemBasicPickaxe(toolObsidian,Item.getItemFromBlock(obsidianForced)).setUnlocalizedName("obsidianPickaxe");
        obsidianShovel = new ItemBasicShovel(toolObsidian,Item.getItemFromBlock(obsidianForced)).setUnlocalizedName("obsidianShovel");
        obsidianSword = new ItemBasicSword(toolObsidian,Item.getItemFromBlock(obsidianForced)).setUnlocalizedName("obsidianSword");
        obsidianAxe = new ItemBasicAxe(toolObsidian,Item.getItemFromBlock(obsidianForced)).setUnlocalizedName("obsidianAxe");
        obsidianHoe = new ItemBasicHoe(toolObsidian,Item.getItemFromBlock(obsidianForced)).setUnlocalizedName("obsidianHoe");
        obsidianHelmet = new ArmorObsidian(armorObsidian, 0, 0, "obsidian",Item.getItemFromBlock(obsidianForced)).setUnlocalizedName("obsidianHelmet");
        obsidianPlate = new ArmorObsidian(armorObsidian, 0, 1, "obsidian",Item.getItemFromBlock(obsidianForced)).setUnlocalizedName("obsidianPlate");
        obsidianLegs = new ArmorObsidian(armorObsidian, 0, 2, "obsidian",Item.getItemFromBlock(obsidianForced)).setUnlocalizedName("obsidianLegs");
        obsidianBoots = new ArmorObsidian(armorObsidian, 0, 3, "obsidian",Item.getItemFromBlock(obsidianForced)).setUnlocalizedName("obsidianBoots");
        
        emeraldPickaxe = new ItemBasicPickaxe(toolEmerald,Items.emerald).setUnlocalizedName("emeraldPickaxe");
        emeraldShovel = new ItemBasicShovel(toolEmerald,Items.emerald).setUnlocalizedName("emeraldShovel");
        emeraldSword = new ItemBasicSword(toolEmerald,Items.emerald).setUnlocalizedName("emeraldSword");
        emeraldAxe = new ItemBasicAxe(toolEmerald,Items.emerald).setUnlocalizedName("emeraldHatchet");
        emeraldHoe = new ItemBasicHoe(toolEmerald,Items.emerald).setUnlocalizedName("emeraldHoe");
        emeraldHelmet = new ArmorEmerald(armorEmerald, 0, 0, "emerald",Items.emerald).setUnlocalizedName("emeraldHelmet");
        emeraldPlate = new ArmorEmerald(armorEmerald, 0, 1, "emerald",Items.emerald).setUnlocalizedName("emeraldPlate");
        emeraldLegs = new ArmorEmerald(armorEmerald, 0, 2, "emerald",Items.emerald).setUnlocalizedName("emeraldLegs");
        emeraldBoots = new ArmorEmerald(armorEmerald, 0, 3, "emerald",Items.emerald).setUnlocalizedName("emeraldBoots");
        
        gravelPickaxe = new ItemBasicPickaxe(toolGravel,Item.getItemFromBlock(gravelCompact)).setUnlocalizedName("gravelPickaxe");
        gravelShovel = new ItemBasicShovel(toolGravel,Item.getItemFromBlock(gravelCompact)).setUnlocalizedName("gravelShovel");
        gravelSword = new ItemBasicSword(toolGravel,Item.getItemFromBlock(gravelCompact)).setUnlocalizedName("gravelSword");
        gravelAxe = new ItemBasicAxe(toolGravel,Item.getItemFromBlock(gravelCompact)).setUnlocalizedName("gravelHatchet");
        gravelHoe = new ItemBasicHoe(toolGravel,Item.getItemFromBlock(gravelCompact)).setUnlocalizedName("gravelHoe");

        enderGem = new ItemEnderGem().setUnlocalizedName("enderGem");
        corruptedEnderCrystal = new ItemCorrputedEnderCrystal().setUnlocalizedName("enderCrystalCorruptedNew");
        enderCrystal = new ItemEnderCrystal().setUnlocalizedName("enderCrystalNew");
        
        enderSword = new ItemBasicSword(toolEnder,enderGem).setUnlocalizedName("enderSword");
        enderPickaxe = new ItemBasicPickaxe(toolEnder,enderGem).setUnlocalizedName("enderPickaxe");
        enderAxe = new ItemBasicAxe(toolEnder,enderGem).setUnlocalizedName("enderAxe");
        enderShovel = new ItemBasicShovel(toolEnder,enderGem).setUnlocalizedName("enderShovel");
        enderHoe = new ItemBasicHoe(toolEnder,enderGem).setUnlocalizedName("enderHoe");
        enderHelmet = new ArmorEnder(armorEnder, 0, 0, "ender").setUnlocalizedName("enderHelmet");
        enderPlate = new ArmorEnder (armorEnder, 0, 1, "ender").setUnlocalizedName("enderPlate");
        enderLegs = new ArmorEnder(armorEnder, 0, 2, "ender").setUnlocalizedName("enderLegs");
        enderBoots = new ArmorEnder(armorEnder, 0, 3, "ender").setUnlocalizedName("enderBoots");
        
        scubaHelmet = new ArmorWater(armorWater, 0, 0, "scuba").setUnlocalizedName("scubaHelmet");
        scubaTank = new ArmorWater( armorWater, 0, 1, "scuba").setUnlocalizedName("scubaTank");
        scubaPants = new ArmorWater(armorWater, 0, 2, "scuba").setUnlocalizedName("scubaPants");
        scubaFlippers = new ArmorWater(armorWater, 0, 3, "scuba").setUnlocalizedName("scubaFlippers");
        
        scorchedHelmet = new ArmorScorched(armorScorched,0, 0, "scorched").setUnlocalizedName("scorchedHelmet");
        scorchedPlate = new ArmorScorched(armorScorched, 0, 1, "scorched").setUnlocalizedName("scorchedPlate");
        scorchedLegs = new ArmorScorched(armorScorched, 0, 2, "scorched").setUnlocalizedName("scorchedLegs");
        scorchedBoots = new ArmorScorched(armorScorched, 0, 3, "scorched").setUnlocalizedName("scorchedBoots");
        
        invHelmet = new ArmorGuard(armorGuardian, 0, 0, "guardian").setUnlocalizedName("guardianHelmet");
        invPlate = new ArmorGuard(armorGuardian, 0, 1, "guardian").setUnlocalizedName("guardianChestplate");
        invLegs = new ArmorGuard(armorGuardian, 0, 2, "guardian").setUnlocalizedName("guardianLegs");
        invBoots = new ArmorGuard(armorGuardian, 0, 3, "guardian").setUnlocalizedName("guardianBoots");
        
        rubyPickaxe = new ItemBasicPickaxe( toolRuby,ruby).setUnlocalizedName("rubyPickaxe");
        rubyShovel = new ItemBasicShovel(toolRuby,ruby).setUnlocalizedName("rubyShovel");
        rubySword = new ItemBasicSword(toolRuby,ruby).setUnlocalizedName("rubySword");
        rubyAxe = new ItemBasicAxe(toolRuby,ruby).setUnlocalizedName("rubyHatchet");
        rubyHoe = new ItemBasicHoe(toolRuby,ruby).setUnlocalizedName("rubyHoe");
        rubyHelmet = new ArmorRuby(armorRuby, 0, 0, "ruby",ruby).setUnlocalizedName("rubyHelmet");
        rubyPlate = new ArmorRuby(armorRuby,0, 1, "ruby",ruby).setUnlocalizedName("rubyPlate");
        rubyLegs = new ArmorRuby(armorRuby,0, 2, "ruby",ruby).setUnlocalizedName("rubyLeggings");
        rubyBoots = new ArmorRuby(armorRuby, 0, 3, "ruby",ruby).setUnlocalizedName("rubyBoots");
        
        sapphirePickaxe = new ItemBasicPickaxe(toolSapphire,sapphire).setUnlocalizedName("sapphirePickaxe");
        sapphireShovel = new ItemBasicShovel(toolSapphire,sapphire).setUnlocalizedName("sapphireShovel");
        sapphireSword = new ItemBasicSword(toolSapphire,sapphire).setUnlocalizedName("sapphireSword");
        sapphireAxe = new ItemBasicAxe(toolSapphire,sapphire).setUnlocalizedName("sapphireHatchet");
        sapphireHoe = new ItemBasicHoe(toolSapphire,sapphire).setUnlocalizedName("sapphireHoe");
        sapphireHelmet = new ArmorRuby(armorSapphire, 0, 0, "sapphire",sapphire).setUnlocalizedName("sapphireHelmet");
        sapphirePlate = new ArmorRuby(armorSapphire, 0, 1, "sapphire",sapphire).setUnlocalizedName("sapphirePlate");
        sapphireLegs = new ArmorRuby(armorSapphire, 0, 2, "sapphire",sapphire).setUnlocalizedName("sapphireLeggings");
        sapphireBoots = new ArmorRuby(armorSapphire, 0, 3, "sapphire",sapphire).setUnlocalizedName("sapphireBoots");
        
        pGoldPickaxe = new ItemBasicPickaxe(toolpGold,purifiedGold).setUnlocalizedName("purifiedPickaxe");
        pGoldShovel = new ItemBasicShovel(toolpGold,purifiedGold).setUnlocalizedName("purifiedShovel");
        pGoldSword = new ItemBasicSword(toolpGold,purifiedGold).setUnlocalizedName("purifiedSword");
        pGoldAxe = new ItemBasicAxe(toolpGold,purifiedGold).setUnlocalizedName("purifiedHatchet");
        pGoldHoe = new ItemBasicHoe(toolpGold,purifiedGold).setUnlocalizedName("purifiedHoe");
        
        GameRegistry.registerItem(enchantedRock, "enchantedRock");
        GameRegistry.registerItem(enchantedGem, "enchantedGem");
        GameRegistry.registerItem(corruptedEnderCrystal, "corEndCry");
        GameRegistry.registerItem(enderCrystal, "endCry");
        GameRegistry.registerItem(enderGem, "enderGem");
        GameRegistry.registerItem(magmaChunk, "magmaChunkNew");
        GameRegistry.registerItem(hellStone, "hellStone");
        GameRegistry.registerItem(ruby, "ruby");
        GameRegistry.registerItem(sapphire, "sapphire");
        GameRegistry.registerItem(guardianIngot, "guardianIngot");
        GameRegistry.registerItem(purifiedGold, "purifiedGold");
        GameRegistry.registerItem(birchDoorItem, "birchDoorItem");
        GameRegistry.registerItem(jungleDoorItem, "jungleDoorItem");
        GameRegistry.registerItem(spruceDoorItem, "spruceDoorItem");
        GameRegistry.registerItem(acaciaDoorItem, "acaciaDoorItem");
        GameRegistry.registerItem(darkOakDoorItem, "darkOakDoorItem");
        GameRegistry.registerItem(gravelClump, "gravelClump");
        GameRegistry.registerItem(goldenFeather, "goldenFeather");
        GameRegistry.registerItem(bloatedInkSac, "bloatedInkSac");
        GameRegistry.registerItem(airTank, "airTank");
        GameRegistry.registerItem(diamondRod, "diamondRod");
        GameRegistry.registerItem(emptyVial, "emptyVial");
        GameRegistry.registerItem(expVial, "expVial");
        GameRegistry.registerItem(skeletonHeadFrag, "sHeadFrag");
        GameRegistry.registerItem(creeperHeadFrag, "cHeadFrag");
        GameRegistry.registerItem(zombieHeadFrag, "zoHeadFrag");
        
        GameRegistry.registerItem(rapidBow, "rapidBow");
        GameRegistry.registerItem(magmaSword, "magmaSword");
        GameRegistry.registerItem(inkSword, "inkSword");
        GameRegistry.registerItem(enchantedSword, "enchantedSword");
        GameRegistry.registerItem(beeHorseSword, "beeHorseSword");
        
        GameRegistry.registerItem(cookedFlesh, "cookedFlesh");
        GameRegistry.registerItem(seasonedFlesh, "seasonedFlesh");
        GameRegistry.registerItem(toast, "toast");
        GameRegistry.registerItem(slimeJelly, "slimeJelly");
        GameRegistry.registerItem(slimeSandwich, "slimeSandwich");
        GameRegistry.registerItem(toastedSlimeSandwich, "toastedSlimeSandwich");
        
        GameRegistry.registerItem(gravelPickaxe, "gravelPickaxe");
        GameRegistry.registerItem(gravelSword, "gravelSword");
        GameRegistry.registerItem(gravelAxe, "gravelAxe");
        GameRegistry.registerItem(gravelShovel, "gravelShovel");
        GameRegistry.registerItem(gravelHoe, "gravelHoe");
        
        GameRegistry.registerItem(pGoldPickaxe, "pGoldPickaxe");
        GameRegistry.registerItem(pGoldSword, "pGoldSword");
        GameRegistry.registerItem(pGoldAxe, "pGoldAxe");
        GameRegistry.registerItem(pGoldShovel, "pGoldShovel");
        GameRegistry.registerItem(pGoldHoe, "pGoldHoe");
        
        GameRegistry.registerItem(obsidianPickaxe, "obsidianPickaxe");
        GameRegistry.registerItem(obsidianSword, "obsidianSword");
        GameRegistry.registerItem(obsidianAxe, "obsidianAxe");
        GameRegistry.registerItem(obsidianShovel, "obsidianShovel");
        GameRegistry.registerItem(obsidianHoe, "obsidianHoe");
        GameRegistry.registerItem(obsidianHelmet, "obsidianHelmet");
        GameRegistry.registerItem(obsidianPlate, "obsidianPlate");
        GameRegistry.registerItem(obsidianLegs, "obsidianLegs");
        GameRegistry.registerItem(obsidianBoots, "obsidianBoots");
        
        GameRegistry.registerItem(emeraldPickaxe, "emeraldPickaxe");
        GameRegistry.registerItem(emeraldSword, "emeraldSword");
        GameRegistry.registerItem(emeraldAxe, "emeraldAxe");
        GameRegistry.registerItem(emeraldShovel, "emeraldShovel");
        GameRegistry.registerItem(emeraldHoe, "emeraldHoe");
        GameRegistry.registerItem(emeraldHelmet, "emeraldHelmet");
        GameRegistry.registerItem(emeraldPlate, "emeraldPlate");
        GameRegistry.registerItem(emeraldLegs, "emeraldLegs");
        GameRegistry.registerItem(emeraldBoots, "emeraldBoots");
        
        GameRegistry.registerItem(rubyPickaxe, "rubyPickaxe");
        GameRegistry.registerItem(rubySword, "rubySword");
        GameRegistry.registerItem(rubyAxe, "rubyAxe");
        GameRegistry.registerItem(rubyShovel, "rubyShovel");
        GameRegistry.registerItem(rubyHoe, "rubyHoe");
        GameRegistry.registerItem(rubyHelmet, "rubyHelmet");
        GameRegistry.registerItem(rubyPlate, "rubyPlate");
        GameRegistry.registerItem(rubyLegs, "rubyLegs");
        GameRegistry.registerItem(rubyBoots, "rubyBoots");
        
        GameRegistry.registerItem(sapphirePickaxe, "sapphirePickaxe");
        GameRegistry.registerItem(sapphireSword, "sapphireSword");
        GameRegistry.registerItem(sapphireAxe, "sapphireAxe");
        GameRegistry.registerItem(sapphireShovel, "sapphireShovel");
        GameRegistry.registerItem(sapphireHoe, "sapphireHoe");
        GameRegistry.registerItem(sapphireHelmet, "sapphireHelmet");
        GameRegistry.registerItem(sapphirePlate, "sapphirePlate");
        GameRegistry.registerItem(sapphireLegs, "sapphireLegs");
        GameRegistry.registerItem(sapphireBoots, "sapphireBoots");
        
        GameRegistry.registerItem(enderPickaxe, "enderPickaxe");
        GameRegistry.registerItem(enderSword, "enderSword");
        GameRegistry.registerItem(enderAxe, "enderAxe");
        GameRegistry.registerItem(enderShovel, "enderShovel");
        GameRegistry.registerItem(enderHoe, "enderHoe");
        GameRegistry.registerItem(enderHelmet, "enderHelmet");
        GameRegistry.registerItem(enderPlate, "enderPlate");
        GameRegistry.registerItem(enderLegs, "enderLegs");
        GameRegistry.registerItem(enderBoots, "enderBoots");
        
        GameRegistry.registerItem(scorchedHelmet, "scorchedHelmet");
        GameRegistry.registerItem(scorchedPlate, "scorchedPlate");
        GameRegistry.registerItem(scorchedLegs, "scorchedLegs");
        GameRegistry.registerItem(scorchedBoots, "scorchedBoots");
        
        GameRegistry.registerItem(invHelmet, "invHelmet");
        GameRegistry.registerItem(invPlate, "invPlate");
        GameRegistry.registerItem(invLegs, "invLegs");
        GameRegistry.registerItem(invBoots, "invBoots");
        
        GameRegistry.registerItem(scubaHelmet, "scubaHelmet");
        GameRegistry.registerItem(scubaTank, "scubaTank");
        GameRegistry.registerItem(scubaPants, "scubaPants");
        GameRegistry.registerItem(scubaFlippers, "scubaFlippers");
         
/////////////////////////////////////////
//
//OTHER
//
/////////////////////////////////////////
           
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(beeHorseSword),1,MainConfig.beeHorseMinSpawn,MainConfig.beeHorseMaxSpawn));
     
        GameRegistry.registerFuelHandler(new FuelHandler());
        GameRegistry.registerWorldGenerator(new OreWorldGen(),1);
        proxy.registerRenderers();
        
        TileEntity.addMapping(TileEntityExpTranslator.class, "Exp-Translator");
        FMLCommonHandler.instance().bus().register(new CraftingHandler());
        VanillaAchievements.Init(e);
        RecipeHandler.Init(e);
    }
    
    @EventHandler
    public void PreInit(FMLPreInitializationEvent event)throws IOException
    {
    	if (MainConfig.mobFragmentGrassBoolean == true){
    		MinecraftForge.EVENT_BUS.register(new MobDropHandler());
    	}
    	VanillaPlusTabBlocks = new CreativeTabs("VanillaPlusBlocks"){
			public Item getTabIconItem() {
				return Item.getItemFromBlock(obsidianForced);
			}
    		
    	};
    	VanillaPlusTabItems = new CreativeTabs("VanillaPlusItems"){
			public Item getTabIconItem() {
				return seasonedFlesh;
			}
    		
    	};
    	
    	MainConfig.PreInit(event);
    }
    
}
*/
