package com.croparia.mod.proxy;

import java.io.File;

import com.croparia.mod.Config.CropariaConfig;
import com.croparia.mod.Init.CropariaRecipes;
import com.croparia.mod.Init.OreDictionaryRegistry;
import com.croparia.mod.Init.TileEntityRegistry;
import com.croparia.mod.Mobs.MobRegistry;
import com.croparia.mod.World.Generation.ModWorldGenerator;

import net.minecraftforge.fml.common.registry.GameRegistry;


public class CommonProxy
{
	public void preInit(File configFile)
    {
		CropariaConfig.config();
    }

    public void init()
    {
    	CropariaRecipes.init();
		TileEntityRegistry.init();
		OreDictionaryRegistry.init();
		MobRegistry.registerEntities();
		GameRegistry.registerWorldGenerator(new ModWorldGenerator(), 0);
    }
    
 
}
