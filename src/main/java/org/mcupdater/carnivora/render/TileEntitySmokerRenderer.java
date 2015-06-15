package org.mcupdater.carnivora.render;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;
import org.mcupdater.carnivora.Version;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class TileEntitySmokerRenderer extends TileEntitySpecialRenderer {

	private final ModelSmoker model;
	
	public TileEntitySmokerRenderer() {
		this.model = ModelSmoker.getInstance();
	}
	
	private void adjustRotatePivotViaMeta(World world, int x, int y, int z) {
		int meta = world.getBlockMetadata(x, y, z);
		GL11.glPushMatrix();
		GL11.glRotatef(meta * -90, 0F, 0F, 1F);
		GL11.glPopMatrix();
	}
	
	@Override
	public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
		GL11.glPushMatrix();
		
		// not sure if we want this or not
		GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
		
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(model.getTexture());
		
		{
			GL11.glPushMatrix();
			GL11.glRotatef(180F,  0F,  0F,  1F);
			model.render(null, 0F, 0F, -0.1F, 0F, 0F, 0.0625F);
			GL11.glPopMatrix();
		}
		
		GL11.glPopMatrix();
	}
	
	private void adjustLightFixture(World world, int i, int j, int k, Block block) {
		Tessellator tess = Tessellator.instance;
		float brightness = block.getLightValue(world, i, j, k);
		int skyLight = world.getLightBrightnessForSkyBlocks(i, j, k, 0);
		int modMod = skyLight % 65536;
		int divMod = skyLight / 65536;
		tess.setColorOpaque_F(brightness, brightness, brightness);
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)modMod, divMod);
	}
}