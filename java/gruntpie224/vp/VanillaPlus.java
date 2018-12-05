package gruntpie224.vp;


import gruntpie224.vp.init.VPItems;
import gruntpie224.vp.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

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

    }

    @Mod.EventHandler
    public  void init(FMLInitializationEvent e){


    }
    @Mod.EventHandler
    public  void postInit(FMLPostInitializationEvent e){
        proxy.registerRenderObject();
    }


}
