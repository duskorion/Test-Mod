package com.duskorion.testmod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init()
	{

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.berry), " s ","sss"," s ", 's', "stickWood"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.lorem), "stickWood", new ItemStack(ModItems.berry)));
		
		GameRegistry.addSmelting(new ItemStack(ModItems.berry), new ItemStack(ModBlocks.ipsum), 0.1f);
	}
}
