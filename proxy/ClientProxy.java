package com.croparia.mod.proxy;

import java.io.File;

import com.croparia.mod.Event.CropariaFuelHandler;
import com.croparia.mod.Event.DropEvent;
import com.croparia.mod.Mobs.CropariaRenderingRegistry;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy
{	
	@Override
    public void preInit(File configFile)
    {
        super.preInit(configFile);
        CropariaRenderingRegistry.registerEntityRenders();
    }

    @Override
    public void init()
    {
        super.init();
		MinecraftForge.EVENT_BUS.register(new DropEvent());
        GameRegistry.registerFuelHandler(new CropariaFuelHandler());
    }
}
