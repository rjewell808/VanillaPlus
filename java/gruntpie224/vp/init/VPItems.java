package gruntpie224.vp.init;

import com.google.common.base.Strings;
import gruntpie224.vp.VPConst;
import gruntpie224.vp.common.armor.*;
import gruntpie224.vp.common.items.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class VPItems {

    //Basic
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
    //Food
    public static Item cooked_flesh;
    public static Item seasoned_flesh;
    public static Item slime_sandwich;
    public static Item slime_sandwich_toasted;
    public static Item toast;

    //Weapons
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

    //TOOL STATS
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

    public static ArmorMaterial armorObsidian = EnumHelper.addArmorMaterial("OBSIDIAN","obsidian",66, new int[] {3, 8, 7, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN,150);
    public static ArmorMaterial armorEmerald = EnumHelper.addArmorMaterial("EMERALD","emerald", 30, new int[] {3, 6, 4, 2}, 13,SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,450);
    public static ArmorMaterial armorEnder = EnumHelper.addArmorMaterial("ENDER","ender", 40, new int[] {3, 6, 6, 2}, 15,SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,680);
    public static ArmorMaterial armorWater = EnumHelper.addArmorMaterial("WATER","scuba", 15, new int[] {2, 6, 5, 2}, 9,SoundEvents.ITEM_ARMOR_EQUIP_IRON,225);
    public static ArmorMaterial armorScorched = EnumHelper.addArmorMaterial("SCORCHED","scorched", 30, new int[] {3, 5, 4, 2}, 12,SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,420);
    public static ArmorMaterial armorRuby = EnumHelper.addArmorMaterial("RUBY","ruby", 35, new int[] {2, 7, 5,2}, 25,SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,560);
    public static ArmorMaterial armorSapphire = EnumHelper.addArmorMaterial("SAPPHIRE","sapphire", 35, new int[] {2, 7, 5, 2}, 20,SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,560);
    public static ArmorMaterial armorGuardian = EnumHelper.addArmorMaterial("GUARDIAN","guardian", 1, new int[] {2, 4, 3, 2}, 4,SoundEvents.ITEM_ARMOR_EQUIP_GOLD,11);


    public static void init(){

       
        enchanted_gem = new ItemBasic().setUnlocalizedName("enchanted_gem");
        enchanted_dust = new ItemBasic(true).setUnlocalizedName("enchanted_dust");
        magma_chunk = new ItemBasic().setUnlocalizedName("magma_chunk");
        ender_crystal_corrupt  = new ItemBasic(true).setUnlocalizedName("ender_crystal_corrupt");
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
        
        cooked_flesh = new ItemVPFood(4,0.1f,true).setUnlocalizedName("cooked_flesh");
        seasoned_flesh = new ItemVPFood(6,0.1f,true).setUnlocalizedName("seasoned_flesh");
        toast=new ItemVPFood(6,0.1F,false).setUnlocalizedName("toast");
        slime_sandwich = new ItemVPFood(15, 0.1F, false).setUnlocalizedName("slime_sandwich");
        slime_sandwich_toasted = new ItemVPFood(17, 0.1F, false).setUnlocalizedName("slime_sandwich_toasted");
    
        rapid_bow = new ItemRapidBow().setUnlocalizedName("rapid_bow");
        magma_sword=new ItemMagmaSword(toolMagma).setUnlocalizedName("magma_sword");
        air_sword=new ItemAirSword(toolAir).setUnlocalizedName("air_sword");
        ink_sword = new ItemInkSword(toolAir).setUnlocalizedName("ink_sword");
        bee_sword = new ItemBeeSword(toolbHorseSuper).setUnlocalizedName("bee_sword");

        obsidian_pickaxe = new ItemBasicPickaxe(toolObsidian,Item.getItemFromBlock(VPBlocks.obsidian_reinforced)).setUnlocalizedName("obsidian_pickaxe");
        obsidian_shovel = new ItemBasicShovel(toolObsidian,Item.getItemFromBlock(VPBlocks.obsidian_reinforced)).setUnlocalizedName("obsidian_shovel");
        obsidian_sword = new ItemBasicSword(toolObsidian,Item.getItemFromBlock(VPBlocks.obsidian_reinforced)).setUnlocalizedName("obsidian_sword");
        obsidian_axe = new ItemBasicAxe(toolObsidian,Item.getItemFromBlock(VPBlocks.obsidian_reinforced)).setUnlocalizedName("obsidian_axe");
        obsidian_hoe = new ItemBasicHoe(toolObsidian,Item.getItemFromBlock(VPBlocks.obsidian_reinforced)).setUnlocalizedName("obsidian_hoe");
        obsidian_helmet = new ArmorObsidian(armorObsidian, 0,  "obsidian", EntityEquipmentSlot.HEAD,Item.getItemFromBlock(VPBlocks.obsidian_reinforced)).setUnlocalizedName("obsidian_helmet");
        obsidian_plate = new ArmorObsidian(armorObsidian, 0,  "obsidian",EntityEquipmentSlot.CHEST,Item.getItemFromBlock(VPBlocks.obsidian_reinforced)).setUnlocalizedName("obsidian_plate");
        obsidian_legs = new ArmorObsidian(armorObsidian, 0,  "obsidian",EntityEquipmentSlot.LEGS,Item.getItemFromBlock(VPBlocks.obsidian_reinforced)).setUnlocalizedName("obsidian_legs");
        obsidian_boots = new ArmorObsidian(armorObsidian, 0,  "obsidian",EntityEquipmentSlot.FEET,Item.getItemFromBlock(VPBlocks.obsidian_reinforced)).setUnlocalizedName("obsidian_boots");

        emerald_pickaxe = new ItemBasicPickaxe(toolEmerald,Items.EMERALD).setUnlocalizedName("emerald_pickaxe");
        emerald_shovel = new ItemBasicShovel(toolEmerald,Items.EMERALD).setUnlocalizedName("emerald_shovel");
        emerald_sword = new ItemBasicSword(toolEmerald,Items.EMERALD).setUnlocalizedName("emerald_sword");
        emerald_axe = new ItemBasicAxe(toolEmerald,Items.EMERALD).setUnlocalizedName("emerald_axe");
        emerald_hoe = new ItemBasicHoe(toolEmerald,Items.EMERALD).setUnlocalizedName("emerald_hoe");
        emerald_helmet = new ArmorEmerald(armorEmerald, 0,  "emerald",EntityEquipmentSlot.HEAD, Items.EMERALD).setUnlocalizedName("emerald_helmet");
        emerald_plate = new ArmorEmerald(armorEmerald, 0,  "emerald",EntityEquipmentSlot.CHEST,Items.EMERALD).setUnlocalizedName("emerald_plate");
        emerald_legs = new ArmorEmerald(armorEmerald, 0,  "emerald",EntityEquipmentSlot.LEGS,Items.EMERALD).setUnlocalizedName("emerald_legs");
        emerald_boots = new ArmorEmerald(armorEmerald, 0,  "emerald",EntityEquipmentSlot.FEET,Items.EMERALD).setUnlocalizedName("emerald_boots");

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

        gravel_pickaxe = new ItemBasicPickaxe(toolGravel,Item.getItemFromBlock(VPBlocks.compact_gravel)).setUnlocalizedName("gravel_pickaxe");
        gravel_shovel = new ItemBasicShovel(toolGravel,Item.getItemFromBlock(VPBlocks.compact_gravel)).setUnlocalizedName("gravel_shovel");
        gravel_sword = new ItemBasicSword(toolGravel,Item.getItemFromBlock(VPBlocks.compact_gravel)).setUnlocalizedName("gravel_sword");
        gravel_axe = new ItemBasicAxe(toolGravel,Item.getItemFromBlock(VPBlocks.compact_gravel)).setUnlocalizedName("gravel_axe");
        gravel_hoe = new ItemBasicHoe(toolGravel,Item.getItemFromBlock(VPBlocks.compact_gravel)).setUnlocalizedName("gravel_hoe");

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
        ender_plate = new ArmorEnder(armorEnder, 0, 1, "ender").setUnlocalizedName("ender_plate");
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



    public static void inGameRegistr(){

        registerItem(enchanted_gem,enchanted_gem.getUnlocalizedName().substring(5));
        registerItem(enchanted_dust,enchanted_dust.getUnlocalizedName().substring(5));
        registerItem(magma_chunk,magma_chunk.getUnlocalizedName().substring(5));
        registerItem(ender_crystal_corrupt ,ender_crystal_corrupt .getUnlocalizedName().substring(5));
        registerItem(ender_crystal ,ender_crystal .getUnlocalizedName().substring(5));
        registerItem(ender_gem ,ender_gem .getUnlocalizedName().substring(5));
        registerItem(hell_stone ,hell_stone .getUnlocalizedName().substring(5));
        registerItem(ruby ,ruby.getUnlocalizedName().substring(5));
        registerItem(sapphire ,sapphire.getUnlocalizedName().substring(5));
        registerItem(head_frag_skeleton ,head_frag_skeleton.getUnlocalizedName().substring(5));
        registerItem(head_frag_creeper ,head_frag_creeper.getUnlocalizedName().substring(5));
        registerItem(head_frag_zombie ,head_frag_zombie.getUnlocalizedName().substring(5));
        registerItem(gravel_clump ,gravel_clump.getUnlocalizedName().substring(5));
        registerItem(golden_feather ,golden_feather.getUnlocalizedName().substring(5));
        registerItem(bloated_ink ,bloated_ink.getUnlocalizedName().substring(5));
        registerItem(air_tank ,air_tank.getUnlocalizedName().substring(5));
        registerItem(guardian_ingot ,guardian_ingot.getUnlocalizedName().substring(5));
        registerItem(purified_gold ,purified_gold.getUnlocalizedName().substring(5));
        registerItem(diamond_rod ,diamond_rod.getUnlocalizedName().substring(5));
        registerItem(slime_jelly ,slime_jelly.getUnlocalizedName().substring(5));

        registerItem(cooked_flesh ,cooked_flesh.getUnlocalizedName().substring(5));
        registerItem(seasoned_flesh ,seasoned_flesh.getUnlocalizedName().substring(5));
        registerItem(toast ,toast.getUnlocalizedName().substring(5));
        registerItem(slime_sandwich ,slime_sandwich.getUnlocalizedName().substring(5));
        registerItem(slime_sandwich_toasted ,slime_sandwich_toasted.getUnlocalizedName().substring(5));

        registerItem(rapid_bow ,rapid_bow.getUnlocalizedName().substring(5));
        registerItem(magma_sword ,magma_sword.getUnlocalizedName().substring(5));
        registerItem(air_sword ,air_sword.getUnlocalizedName().substring(5));
        registerItem(ink_sword ,ink_sword.getUnlocalizedName().substring(5));
        registerItem(bee_sword ,bee_sword.getUnlocalizedName().substring(5));



    }

    public static void renderItems(){
        renderRegister(enchanted_gem);
        renderRegister(enchanted_dust);
        renderRegister(magma_chunk);
        renderRegister(ender_crystal_corrupt );
        renderRegister(ender_crystal);
        renderRegister(ender_gem);
        renderRegister(hell_stone);
        renderRegister(ruby);
        renderRegister(sapphire);
        renderRegister(head_frag_skeleton);
        renderRegister(head_frag_creeper);
        renderRegister(head_frag_zombie);
        renderRegister(gravel_clump);
        renderRegister(golden_feather);
        renderRegister(bloated_ink);
        renderRegister(air_tank);
        renderRegister(guardian_ingot);
        renderRegister(purified_gold);
        renderRegister(diamond_rod);
        renderRegister(slime_jelly);
        renderRegister(cooked_flesh);
        renderRegister(seasoned_flesh);
        renderRegister(toast);
        renderRegister(slime_sandwich);
        renderRegister(slime_sandwich_toasted);
        renderRegister(rapid_bow);
        renderRegister(magma_sword);
        renderRegister(air_sword);
        renderRegister(ink_sword);
        renderRegister(bee_sword);

    }


    //Registr API
    @Deprecated
    public static void registerItem(Item item, String name)
    {
        if (item.getRegistryName() == null && Strings.isNullOrEmpty(name))
            throw new IllegalArgumentException("Attempted to register a item with no name: " + item);
        if (item.getRegistryName() != null && !item.getRegistryName().toString().equals(name))
            throw new IllegalArgumentException("Attempted to register a item with conflicting names. Old: " + item.getRegistryName() + " New: " + name);
        ForgeRegistries.ITEMS.register(item.getRegistryName() == null ? item.setRegistryName(name) : item);
    }
    public static void renderRegister(Item i){

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(i, 0, new ModelResourceLocation(
                VPConst.MODID + ":" + i.getUnlocalizedName().substring(5), "inventory"));

    }
    public static void InitBow(FMLPostInitializationEvent event)
    {
        if(event.getSide().isClient())
        {
            ModelBakery.registerItemVariants(rapid_bow, new ResourceLocation(VPConst.MODID+":rapid_bow"),new ResourceLocation(VPConst.MODID+":rapid_bow_1"),new ResourceLocation(VPConst.MODID+":rapid_bow_2"),new ResourceLocation(VPConst.MODID+":rapid_bow_3"));

            registerItem(rapid_bow, 0, VPConst.MODID  + ":rapid_bow");
            registerItem(rapid_bow, 1, VPConst.MODID  + ":rapid_bow_1");
            registerItem(rapid_bow, 2, VPConst.MODID  + ":rapid_bow_2");
            registerItem(rapid_bow, 3, VPConst.MODID  + ":rapid_bow_3");
        }
    }
    @SideOnly(Side.CLIENT)
    public static void registerItem(Item item, int metadata, String itemName)
    {
        ItemModelMesher mesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
        mesher.register(item, metadata, new ModelResourceLocation(itemName, "inventory"));
    }
}
