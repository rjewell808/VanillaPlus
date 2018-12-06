package gruntpie224.vp.init;

import gruntpie224.vp.VPConst;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class VPBlocks {

    public static Block obsidian_reinforced;
    public static Block enchanted_ore;
    public static Block compact_gravel;
    public static Block hellfire_ore;
    public static Block magma_ore;
    public static Block ender_crystal_ore;
    public static Block ruby_block;
    public static Block ruby_ore;
    public static Block sapphire_ore;


    public static void init(){

    }
    public static void register(){

    }
    public static void registerRenders(){

    }


    public static void registerRender(Block block){
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(VPConst.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
