package com.duskorion.testmod.client.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

import com.duskorion.testmod.tileEntity.TileEntityLoremIpsum;

public class ContainerLoremIpsum extends Container
{
	private TileEntityLoremIpsum loremIpsum;

	public ContainerLoremIpsum(InventoryPlayer inventory, TileEntityLoremIpsum entity) 
	{
		this.loremIpsum = entity;
	}

	
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		// TODO Auto-generated method stub
		return true;
	}

}