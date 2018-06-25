package gruntpie224.vanillaplus.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import gruntpie224.vanillaplus.init.VanillaPlusBlocks;
import gruntpie224.vanillaplus.init.VanillaPlusItems;


public class ClientProxy extends CommonProxy
{

	@Override
    public void registerRenders()
	{
		VanillaPlusBlocks.registerRenders();
		VanillaPlusItems.registerRenders();
	}
	
    public int addArmor(String armor)
    {
    	return 0;
        //return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }
    
}