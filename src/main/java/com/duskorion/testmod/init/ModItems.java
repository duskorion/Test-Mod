package com.duskorion.testmod.init;

import com.duskorion.testmod.item.ItemBerry;
import com.duskorion.testmod.item.ItemTestMod;
import com.duskorion.testmod.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
	public static final ItemTestMod berry = new ItemBerry();
	
	public static void init()
	{
		GameRegistry.registerItem(berry, "berry");
	}
}
