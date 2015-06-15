package org.mcupdater.carnivora.render;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class ItemSmokerRenderer implements IItemRenderer {

	private final ModelSmoker model;
	
	public ItemSmokerRenderer() {
		this.model = ModelSmoker.getInstance();
	}
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		GL11.glPushMatrix();
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glScalef(1F, 1F, 1F);
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(model.getTexture());
		model.render(null, 0F, 0F, -0.1F, 0F, 0F, 0.0625F);
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();
	}

}
