package com.duskorion.testmod;

import com.duskorion.testmod.client.handler.GuiHandler;
import com.duskorion.testmod.client.handler.KeyInputEventHandler;
import com.duskorion.testmod.handler.ConfigurationHandler;
import com.duskorion.testmod.init.ModBlocks;
import com.duskorion.testmod.init.ModItems;
import com.duskorion.testmod.init.ModRecipes;
import com.duskorion.testmod.init.ModTiles;
import com.duskorion.testmod.proxy.IProxy;
import com.duskorion.testmod.reference.Reference;
import com.duskorion.testmod.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME,version=Reference.VERSION, guiFactory=Reference.GUI_FACTORY_CLASS)

public class TestMod 
{
	@Mod.Instance(Reference.MOD_ID)
	public static TestMod instance;
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS,serverSide=Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
		
		proxy.registerKeyBindings();
		
		ModItems.init();
		ModBlocks.init();	
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{		
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		ModTiles.init();

		ModRecipes.init();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
	}
	
}
