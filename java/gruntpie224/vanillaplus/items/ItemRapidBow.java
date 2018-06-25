package gruntpie224.vanillaplus.items;

import java.util.List;

import javax.swing.Icon;

import gruntpie224.vanillaplus.Reference;
import gruntpie224.vanillaplus.VanillaPlus;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import scala.util.Random;

public class ItemRapidBow extends ItemBow
{
	//public static final String[] bowPullIconNameArray = new String[] {"VanillaPlus:rapid_bow_1", "VanillaPlus:rapid_bow_2", "VanillaPlus:rapid_bow_3"};
    private static final String __OBFID = "CL_00001777";

    public ItemRapidBow()
    {
        this.maxStackSize = 1;
        this.setMaxDamage(480);
        this.setCreativeTab(VanillaPlus.tabVanillaPlusItems);
    }

    @Override
    public ModelResourceLocation getModel(ItemStack stack, EntityPlayer player, int useRemaining)
    {
        ModelResourceLocation modelresourcelocation = new ModelResourceLocation(Reference.MOD_ID + ":rapid_bow", "inventory");

        if(stack.getItem() == this && player.getItemInUse() != null)
        {
        	int i = stack.getMaxItemUseDuration() - player.getItemInUseCount();
        	
            if(i >= 9)
            {
                modelresourcelocation = new ModelResourceLocation(Reference.MOD_ID + ":rapid_bow_3", "inventory");
            }
            else if(i > 5)
            {
                modelresourcelocation = new ModelResourceLocation(Reference.MOD_ID + ":rapid_bow_2", "inventory");
            }
            else if(i > 0)
            {
                modelresourcelocation = new ModelResourceLocation(Reference.MOD_ID + ":rapid_bow_1", "inventory");
            }
        }
        return modelresourcelocation;
    }
    
    @Override
    public void onPlayerStoppedUsing(ItemStack stack, World worldIn, EntityPlayer playerIn, int timeLeft)
    {
        int j = this.getMaxItemUseDuration(stack) - timeLeft;
        net.minecraftforge.event.entity.player.ArrowLooseEvent event = new net.minecraftforge.event.entity.player.ArrowLooseEvent(playerIn, stack, j);
        if (net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(event)) return;
        j = event.charge;

        boolean flag = playerIn.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, stack) > 0;

        if (flag || playerIn.inventory.hasItem(Items.arrow))
        {
            float f = (float)j / 10.0F;
            f = (f * f + f * 2.0F) / 1.5F;

            if ((double)f < 0.1D)
            {
                return;
            }

            if (f > 1.0F)
            {
                f = 1.0F;
            }

            EntityArrow entityarrow = new EntityArrow(worldIn, playerIn, f * 2.0F);

            if (f == 1.0F)
            {
                entityarrow.setIsCritical(true);
            }

            int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, stack);

            if (k > 0)
            {
                entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
            }

            int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, stack);

            if (l > 0)
            {
                entityarrow.setKnockbackStrength(l);
            }

            if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, stack) > 0)
            {
                entityarrow.setFire(100);
            }

            stack.damageItem(1 , playerIn);
            worldIn.playSoundAtEntity(playerIn, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

            if (flag)
            {
                entityarrow.canBePickedUp = 2;
            }
            else
            {
                playerIn.inventory.consumeInventoryItem(Items.arrow);
            }

            playerIn.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);

            if (!worldIn.isRemote)
            {
                worldIn.spawnEntityInWorld(entityarrow);
            }
        }
    }
	/*
	public static final String[] bowPullIconNameArray = new String[] {"VanillaPlus:rapidBow_1", "VanillaPlus:rapidBow_2", "VanillaPlus:rapidBow_3"};
    @SideOnly(Side.CLIENT)
    private IIcon[] iconArray;

    public ItemRapidBow()
    {
        this.bFull3D = true;
        this.maxStackSize = 1;
        this.setCreativeTab(VanillaPlus.VanillaPlusTabItems);
    }
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("\u00a76+2x Speed");
        par3List.add("\u00a76+Deals 3.5 Damage");
        par3List.add("\u00a7c-2 Duribility Per Shot");
    }
    
    public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4)
    {
        int j = this.getMaxItemUseDuration(par1ItemStack) - par4;
        ArrowLooseEvent event = new ArrowLooseEvent(par3EntityPlayer, par1ItemStack, j);
        MinecraftForge.EVENT_BUS.post(event);

        if (event.isCanceled())
        {
            return;
        }

        j = event.charge;
        boolean flag = par3EntityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0;

        if (flag || par3EntityPlayer.inventory.hasItem(Items.arrow))
        {
        	float f = (float)j / 1.0F;
            f = (f * f + f * 3.0F) / 1.0F;

            if ((double)f < 0.1D)
            {
                return;
            }

            if (f > 1.0F)
            {
                f = 1.0F;
            }

            EntityArrow entityarrow = new EntityArrow(par2World, par3EntityPlayer, f * 2.0F);

            if (f == 1.0F)
            {
                entityarrow.setIsCritical(true);
            }

            int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);

            if (k > 0)
            {
                entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
            }

            int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);

            if (l > 0)
            {
                entityarrow.setKnockbackStrength(l);
            }

            if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0)
            {
                entityarrow.setFire(100);
            }

            par1ItemStack.damageItem(1, par3EntityPlayer);
            par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

            if (flag)
            {
                entityarrow.canBePickedUp = 2;
            }
            else
            {
                par3EntityPlayer.inventory.consumeInventoryItem(Items.arrow);
            }

            if (!par2World.isRemote)
            {
                par2World.spawnEntityInWorld(entityarrow);
           
            }
            par1ItemStack.damageItem(1, par3EntityPlayer);
        }
    }

    @Override
    public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        return par1ItemStack;
    }


    @Override
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 72000;
    }


    @Override
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.bow;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        ArrowNockEvent event = new ArrowNockEvent(par3EntityPlayer, par1ItemStack);
        MinecraftForge.EVENT_BUS.post(event);
        if (event.isCanceled())
            return event.result;

        if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(Items.arrow))
        {
            par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        }

        return par1ItemStack;
    }


    @Override
    public int getItemEnchantability()
    {
        return 1;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon("VanillaPlus:rapidBow");
        this.iconArray = new IIcon[bowPullIconNameArray.length];

        for (int i = 0; i < this.iconArray.length; ++i)
        {
            this.iconArray[i] = par1IconRegister.registerIcon(bowPullIconNameArray[i]);
        }
    }

    @Override
    public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
    {
        if(player.getItemInUse() == null) return this.itemIcon;
        int var4 = stack.getMaxItemUseDuration() - useRemaining;
        if (var4 > 2)
            return iconArray[2];
        else if (var4 > 1)
            return iconArray[1];
        else if (var4 > 0)
            return iconArray[0];
        return iconArray[0];
    }

    @Override
    public IIcon getItemIconForUseDuration(int par1)
    {
        return this.iconArray[par1];
    }
    */
}
