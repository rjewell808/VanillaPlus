package net.vanillaplus.proxy;

import java.util.ArrayList;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraftforge.client.MinecraftForgeClient;
import net.vanillaplus.common.VanillaPlus;
import net.vanillaplus.item.ItemExpTranslatorRenderer;
import net.vanillaplus.renderer.TileEntityExpTranslator;
import net.vanillaplus.renderer.TileEntityExpTranslatorRenderer;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy
{

	@Override
    public void registerRenderers() {
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityExpTranslator.class, new TileEntityExpTranslatorRenderer());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(VanillaPlus.expTranslator), new ItemExpTranslatorRenderer());
    }
    public int addArmor(String armor)
    {
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }
    
}