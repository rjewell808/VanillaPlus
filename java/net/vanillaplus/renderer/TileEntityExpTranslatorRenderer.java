package net.vanillaplus.renderer;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.vanillaplus.common.VanillaPlus;

import org.lwjgl.opengl.GL11;



public class TileEntityExpTranslatorRenderer extends TileEntitySpecialRenderer
{
    static final float scale = (float)(1.0 / 16.0);
    private ModelExpTranslator model;
    public TileEntityExpTranslatorRenderer()
    {
        model = new ModelExpTranslator();
    }
    @Override
    public void renderTileEntityAt(TileEntity var1, double x, double y,
            double z, float tick)
    {
        this.renderAModelAt((TileEntityExpTranslator)var1, x, y, z, tick);
    }

    public void renderAModelAt(TileEntityExpTranslator tileentity1, double x, double y, double z, float f)
    {
        GL11.glPushMatrix();
        GL11.glTranslated((float)x + 0.5F, (float)y, (float)z + 0.5F);
        this.bindTexture(new ResourceLocation(VanillaPlus.modid.toLowerCase(), "textures/blocks/expTranslator.png"));
        GL11.glPushMatrix();
        model.render(0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}