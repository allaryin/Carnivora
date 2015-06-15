package org.mcupdater.carnivora;

import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import org.mcupdater.carnivora.machines.TileEntitySmoker;
import org.mcupdater.carnivora.render.ItemSmokerRenderer;
import org.mcupdater.carnivora.render.TileEntitySmokerRenderer;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {
	public void init() {
		if( ConfigSettings.SMOKER.enabled ) {
			ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySmoker.class, new TileEntitySmokerRenderer());
			MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockHandler.Blocks.SMOKER.block), new ItemSmokerRenderer());
		}
	}
}
