package gruntpie224.vp.init;

import com.google.common.base.Strings;
import gruntpie224.vp.VPConst;
import gruntpie224.vp.common.items.ItemBasic;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
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
    }


    public static void inGameRegistr(){

        registerItem(enchanted_gem,enchanted_gem.getUnlocalizedName().substring(5));
        registerItem(enchanted_dust,enchanted_dust.getUnlocalizedName().substring(5));
        registerItem(magma_chunk,magma_chunk.getUnlocalizedName().substring(5));
        registerItem(ender_crystal_corrupt ,ender_crystal_corrupt .getUnlocalizedName().substring(5));
        registerItem(ender_crystal ,ender_crystal .getUnlocalizedName().substring(5));

    }

    public static void renderItems(){
        renderRegister(enchanted_gem);
        renderRegister(enchanted_dust);
        renderRegister(magma_chunk);
        renderRegister(ender_crystal_corrupt );
        renderRegister(ender_crystal);

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
