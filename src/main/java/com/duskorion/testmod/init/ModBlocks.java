package com.duskorion.testmod.init;

import com.duskorion.testmod.block.BlockIpsum;
import com.duskorion.testmod.block.BlockLorem;
import com.duskorion.testmod.block.BlockLoremIpsum;
import com.duskorion.testmod.block.BlockTestMod;
import com.duskorion.testmod.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks 
{
	public static final BlockTestMod lorem = new BlockLorem();
	public static final BlockTestMod ipsum = new BlockIpsum();
	public static final BlockLoremIpsum loremipsum = new BlockLoremIpsum();
	
	public static void init()
	{
		GameRegistry.registerBlock(lorem, "lorem");
		GameRegistry.registerBlock(ipsum, "ipsum");
		GameRegistry.registerBlock(loremipsum, "loremipsum");
		
	}
	
}
