package org.mcupdater.carnivora.machines;

import org.mcupdater.carnivora.Version;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockSmoker extends BlockMachine {
	
	public BlockSmoker() {
		super("smoker");
	}

	@Override
	public TileEntity createNewTileEntity(World world, int p_149915_2_) {
		return new TileEntitySmoker();
	}

}
