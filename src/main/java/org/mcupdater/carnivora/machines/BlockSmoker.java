package org.mcupdater.carnivora.machines;

import org.mcupdater.carnivora.Version;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockSmoker extends BlockMachine {
	
	public BlockSmoker() {
		super();
		setBlockTextureName(Version.TEXTURE_PREFIX + "smoker");
		//setUnlocalizedName(Version.MOD_ID.toLowerCase() + ".smoker");
	}

	@Override
	public TileEntity createNewTileEntity(World world, int p_149915_2_) {
		return new TileEntitySmoker();
	}

}
