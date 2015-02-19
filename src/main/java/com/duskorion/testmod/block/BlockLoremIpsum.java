package com.duskorion.testmod.block;

import com.duskorion.testmod.TestMod;
import com.duskorion.testmod.reference.GuiIDs;
import com.duskorion.testmod.tileEntity.TileEntityLoremIpsum;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockLoremIpsum extends BlockContainer
{

	public BlockLoremIpsum(Material material) {
		super(material);
		// TODO Auto-generated constructor stub
	}
	
	public BlockLoremIpsum() {
		super(Material.rock);
		// TODO Auto-generated constructor stub
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityLoremIpsum();
	}

	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
	{
		if(!world.isRemote)
		{
			FMLNetworkHandler.openGui(player,TestMod.instance, GuiIDs.guiLoremIpsum, world, x, y, z);
		}
		return true;
	}
}
