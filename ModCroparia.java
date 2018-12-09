package com.croparia.mod;

import org.apache.logging.log4j.Logger;

import com.croparia.mod.Init.BiomeAndDimMod;
import com.croparia.mod.Init.RegisteringHandler;
import com.croparia.mod.Mobs.MobRegistry;
import com.croparia.mod.proxy.CommonProxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, dependencies = "before:guideapi")
public class ModCroparia{

	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	@Instance(Reference.MOD_ID)
	public static ModCroparia instance;
	
	public static Logger logger;
	
	public ModCroparia() {

		MinecraftForge.EVENT_BUS.register(new RegisteringHandler());
	}
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event.getSuggestedConfigurationFile());
		BiomeAndDimMod.preInit(event);
    }

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) 
	{
		//Ore Dictionary Ok here !
		proxy.init();
		BiomeAndDimMod.init(event);
	}
	

	@Mod.EventHandler
	public void serverLoad(FMLServerStartingEvent event) 
	{
		BiomeAndDimMod.serverLoad(event);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) 
	{
	
	}
}