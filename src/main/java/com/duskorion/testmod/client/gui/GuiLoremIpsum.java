package com.duskorion.testmod.client.gui;

import com.duskorion.testmod.reference.Reference;
import com.duskorion.testmod.tileEntity.TileEntityLoremIpsum;
import com.duskorion.testmod.client.gui.ContainerLoremIpsum;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GuiLoremIpsum extends GuiContainer
{
	public static final ResourceLocation background = new ResourceLocation(Reference.MOD_ID, "textures/gui/loremipsum_background.png");
	
	public TileEntityLoremIpsum loremIpsum;
	
	public GuiLoremIpsum(InventoryPlayer inventoryPlayer, TileEntityLoremIpsum entity) 
	{
		super(ContainerLoremIpsum(inventoryPlayer, entity));
		
		this.loremIpsum = entity;
		
		this.xSize = 286;
		this.ySize = 166;
	}


	public void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		String name = this.loremIpsum.hasCustomInventoryName() ? this.loremIpsum.getInventoryName() : I18n.format(this.loremIpsum.getInventoryName(), new Object[0]);
		
		this.fontRendererObj.drawString(name, this.xSize/2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, this.ySize - 96 + 2, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float p_146976_1_,
			int p_146976_2_, int p_146976_3_) {
		
	}


}