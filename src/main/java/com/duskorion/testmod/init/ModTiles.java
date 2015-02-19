package com.duskorion.testmod.init;

import net.minecraft.tileentity.TileEntity;

import com.duskorion.testmod.block.BlockLoremIpsum;
import com.duskorion.testmod.block.BlockTestMod;
import com.duskorion.testmod.reference.GuiIDs;
import com.duskorion.testmod.tileEntity.TileEntityLoremIpsum;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModTiles 
{
	
	public static final TileEntityLoremIpsum loremipsum = new TileEntityLoremIpsum();
	
	public static void init()
	{
		GameRegistry.registerTileEntity(TileEntityLoremIpsum.class, "loremipsum");
	}
	
}
