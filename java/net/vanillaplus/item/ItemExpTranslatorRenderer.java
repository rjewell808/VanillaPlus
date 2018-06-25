package net.vanillaplus.item;

import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;
import net.vanillaplus.renderer.ModelExpTranslator;
import net.vanillaplus.renderer.TileEntityExpTranslator;

public class ItemExpTranslatorRenderer implements IItemRenderer {

private ModelExpTranslator Tier1EnchanterModel;
private final TileEntityExpTranslator table = new TileEntityExpTranslator();

public ItemExpTranslatorRenderer() {

	Tier1EnchanterModel = new ModelExpTranslator();
}

@Override
public boolean handleRenderType(ItemStack item, ItemRenderType type) {

return true;
}

@Override
public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {

return true;
}

@Override
public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
	TileEntityRendererDispatcher.instance.renderTileEntityAt(table, 0.0D, 0.0D, 0.0D, 0.0F);
}
}
