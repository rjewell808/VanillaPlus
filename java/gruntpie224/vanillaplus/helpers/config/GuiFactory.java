package gruntpie224.vanillaplus.helpers.config;

import java.util.Set;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;
import net.minecraftforge.fml.client.IModGuiFactory.RuntimeOptionCategoryElement;
import net.minecraftforge.fml.client.IModGuiFactory.RuntimeOptionGuiHandler;

public class GuiFactory implements IModGuiFactory
{
	@Override
	public void initialize(Minecraft minecraftInstance) 
	{
		
	}

	@Override
	public Class<? extends GuiScreen> mainConfigGuiClass() 
	{	
		return VanillaPlusGuiConfig.class;
	}

	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() 
	{	
		return null;
	}

	@Override
	public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element) 
	{	
		return null;
	}
	
}
