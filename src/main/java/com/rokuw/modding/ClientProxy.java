package com.rokuw.modding;

import com.rokuw.modding.lamp.RenderTestContainer;
import com.rokuw.modding.lamp.TileEntityTestContainer;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy{
	 
    @Override
    public void registerInformation()
    {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTestContainer.class, new RenderTestContainer());
    }

   
}
