package com.duskorion.testmod.proxy;

import com.duskorion.testmod.client.settings.Keybindings;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy
{

	@Override
	public void registerKeyBindings() 
	{
		ClientRegistry.registerKeyBinding(Keybindings.charge);
		ClientRegistry.registerKeyBinding(Keybindings.release);

	}

}
