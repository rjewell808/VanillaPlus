package gruntpie224.vp;


import gruntpie224.vp.helpers.EventModDrops;
import gruntpie224.vp.init.VPItems;
import gruntpie224.vp.init.VPRecipes;
import gruntpie224.vp.proxy.CommonProxy;
import gruntpie224.vp.world.OreWorldGen;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = VPConst.MODID,name = VPConst.MODNAME,version = VPConst.MODVERSION)


public class VanillaPlus {



    @Mod.Instance
    public static VanillaPlus instance;

    @SidedProxy(clientSide = VPConst.CLIENT_PROXY,serverSide = VPConst.COMMON_PROXY)
    public static CommonProxy proxy;


    public static final VPCreativeTabs vanillaPlusTabs = new VPCreativeTabs("VanillaPlus");

    @Mod.EventHandler
    public  void preInit(FMLPreInitializationEvent e){

        VPItems.init();
        VPItems.inGameRegistr();

        VPRecipes.loadRecipes();

    }

    @Mod.EventHandler
    public  void init(FMLInitializationEvent e){


        GameRegistry.registerWorldGenerator(new OreWorldGen(),1);
        MinecraftForge.EVENT_BUS.register(new EventModDrops());


    }
    @Mod.EventHandler
    public  void postInit(FMLPostInitializationEvent e){
        proxy.registerRenderObject();
    }


}
