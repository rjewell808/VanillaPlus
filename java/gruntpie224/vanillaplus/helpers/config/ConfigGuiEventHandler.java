package gruntpie224.vanillaplus.helpers.config;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.client.GuiIngameModOptions;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ConfigGuiEventHandler{

	@SideOnly(Side.CLIENT)
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
	public void onEvent(GuiOpenEvent event)
	{
	    if (event.gui instanceof GuiIngameModOptions)
	    {
	        System.out.println("GuiOpenEvent for GuiIngameModOptions");
	        event.gui = new VanillaPlusGuiConfig(null);        
	    }
	}

}
