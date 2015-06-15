package org.mcupdater.carnivora.machines;

import org.mcupdater.carnivora.Version;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public abstract class BlockMachine extends BlockContainer {
	
	private final String name;
	
	protected BlockMachine(String name) {
		super(Material.iron);
		this.name = name;
		this.setCreativeTab(CreativeTabs.tabTools);
	}

	@Override
	public int getRenderType() {
		return -1;
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	public boolean renderAsNormalBlock() {
		return false;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister icon) {
		this.blockIcon = icon.registerIcon(Version.TEXTURE_PREFIX + name);
	}

}
