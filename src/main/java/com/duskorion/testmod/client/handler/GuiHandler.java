package com.duskorion.testmod.client.handler;

import com.duskorion.testmod.client.gui.ContainerLoremIpsum;
import com.duskorion.testmod.client.gui.GuiLoremIpsum;
import com.duskorion.testmod.reference.GuiIDs;
import com.duskorion.testmod.tileEntity.TileEntityLoremIpsum;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z)
	{
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null)
		{
			switch(ID)
			{
			case GuiIDs.guiLoremIpsum:
				if(entity instanceof TileEntityLoremIpsum)
				{
					return new ContainerLoremIpsum(player.inventory, (TileEntityLoremIpsum) entity);
				}
				return null;
			}
		}
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null)
		{
			switch(ID)
			{
			case GuiIDs.guiLoremIpsum:
				if(entity instanceof TileEntityLoremIpsum)
				{
					return new GuiLoremIpsum(player.inventory, (TileEntityLoremIpsum) entity);
				}
				return null;
			}
		}
		
		return null;
	}
	
}