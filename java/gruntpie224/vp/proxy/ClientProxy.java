package gruntpie224.vp.proxy;

import gruntpie224.vp.init.VPBlocks;
import gruntpie224.vp.init.VPItems;

public class ClientProxy extends CommonProxy {


    @Override
    public void registerRenderObject() {
        VPBlocks.registerRenders();
        VPItems.renderItems();

    }
}
