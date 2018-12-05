package gruntpie224.vp.init;

import com.google.common.base.Strings;
import gruntpie224.vp.VPConst;
import gruntpie224.vp.common.items.ItemBasic;
import gruntpie224.vp.common.items.ItemVPFood;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

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

    public static ArmorMaterial armorObsidian = EnumHelper.addArmorMaterial("OBSIDIAN","obsidian",66, new int[] {3, 8, 7, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN,150);
    public static ArmorMaterial armorEmerald = EnumHelper.addArmorMaterial("EMERALD","emerald", 30, new int[] {3, 6, 4, 2}, 13,SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,450);
    public static ArmorMaterial armorEnder = EnumHelper.addArmorMaterial("ENDER","ender", 40, new int[] {3, 6, 6, 2}, 15,SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,680);
    public static ArmorMaterial armorWater = EnumHelper.addArmorMaterial("WATER","scuba", 15, new int[] {2, 6, 5, 2}, 9,SoundEvents.ITEM_ARMOR_EQUIP_IRON,225);
    public static ArmorMaterial armorScorched = EnumHelper.addArmorMaterial("SCORCHED","scorched", 30, new int[] {3, 5, 4, 2}, 12,SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,420);
    public static ArmorMaterial armorRuby = EnumHelper.addArmorMaterial("RUBY","ruby", 35, new int[] {2, 7, 5,2}, 25,SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,560);
    public static ArmorMaterial armorSapphire = EnumHelper.addArmorMaterial("SAPPHIRE","sapphire", 35, new int[] {2, 7, 5, 2}, 20,SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,560);
    public static ArmorMaterial armorGuardian = EnumHelper.addArmorMaterial("GUARDIAN","guardian", 1, new int[] {2, 4, 3, 2}, 4,SoundEvents.ITEM_ARMOR_EQUIP_GOLD,11);


    public static void init(){

        //Basic
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
        //Food
        cooked_flesh = new ItemVPFood(4,0.1f,true).setUnlocalizedName("cooked_flesh");
        seasoned_flesh = new ItemVPFood(6,0.1f,true).setUnlocalizedName("seasoned_flesh");
        toast=new ItemVPFood(6,0.1F,false).setUnlocalizedName("toast");
        slime_sandwich = new ItemVPFood(15, 0.1F, false).setUnlocalizedName("slime_sandwich");
        slime_sandwich_toasted = new ItemVPFood(17, 0.1F, false).setUnlocalizedName("slime_sandwich_toasted");
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
}
