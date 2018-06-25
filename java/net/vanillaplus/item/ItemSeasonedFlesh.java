package net.vanillaplus.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.vanillaplus.common.VanillaPlus;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSeasonedFlesh extends ItemFood
{
    private final int healAmount;
    private final boolean isWolfsFavoriteMeat;
    private final float saturationModifier;
    public final int itemUseDuration;

    public ItemSeasonedFlesh(int par2, float par3, boolean par4)
    {
        super(par2, par3, par4);
        this.itemUseDuration = 32;
        this.healAmount = 10;
        this.isWolfsFavoriteMeat = true;
        this.saturationModifier = 3.0F;
        this.setCreativeTab(VanillaPlus.VanillaPlusTabItems);
    }

    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("\u00a7eFills 4 Hunger");
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(VanillaPlus.modid + ":" + this.getUnlocalizedName().substring(5));
    }
}

