package com.croparia.mod.Init;

import com.croparia.mod.Reference;
import com.croparia.mod.Blocks.TileEntity.TileEntityCoalFurnace;
import com.croparia.mod.Blocks.TileEntity.TileEntityCounter;
import com.croparia.mod.Blocks.TileEntity.TileEntityDiamondFurnace;
import com.croparia.mod.Blocks.TileEntity.TileEntityFireFurnace;
import com.croparia.mod.Blocks.TileEntity.TileEntityGoldFurnace;
import com.croparia.mod.Blocks.TileEntity.TileEntityIronFurnace;
import com.croparia.mod.Blocks.TileEntity.TileEntityLapisFurnace;
import com.croparia.mod.Blocks.TileEntity.TileEntityObsidianFurnace;
import com.croparia.mod.Blocks.TileEntity.TileEntityRedstoneFurnace;
import com.croparia.mod.Blocks.TileEntity.TileEntityRenforcedFurnace;
import com.croparia.mod.Blocks.TileEntity.TileEntityReward;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityRegistry {
	public static void init()
	{
		register(TileEntityReward.class, "Reward");
		register(TileEntityCoalFurnace.class, "CoalFurnace");
		register(TileEntityIronFurnace.class, "IronFurnace");
		register(TileEntityGoldFurnace.class, "GoldFurnace");
		register(TileEntityRedstoneFurnace.class, "RedstoneFurnace");
		register(TileEntityLapisFurnace.class, "LapisFurnace");
		register(TileEntityDiamondFurnace.class, "DiamondFurnace");
		register(TileEntityObsidianFurnace.class, "ObsidianFurnace");
		register(TileEntityRenforcedFurnace.class, "RenforcedFurnace");
		register(TileEntityFireFurnace.class, "FireFurnace");
		register(TileEntityCounter.class, "Counter");
	}
	
	public static void register(Class TEclass, String name)
	{
		 GameRegistry.registerTileEntity(TEclass, new ResourceLocation(Reference.MOD_ID + ":TileEntity" + name));
		 
	}
}
