package org.mcupdater.carnivora.machines;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public abstract class BlockMachine extends BlockContainer {
	
	protected BlockMachine() {
		super(Material.iron);
		this.setCreativeTab(CreativeTabs.tabTools);
	}

}
