package com.croparia.mod.Mobs;

import com.croparia.mod.ModCroparia;
import com.croparia.mod.Reference;
import com.croparia.mod.Mobs.Entity.EntityAirGolem;
import com.croparia.mod.Mobs.Entity.EntityAkurojin;
import com.croparia.mod.Mobs.Entity.EntityCentaur;
import com.croparia.mod.Mobs.Entity.EntityCentaurL;
import com.croparia.mod.Mobs.Entity.EntityCentaurS;
import com.croparia.mod.Mobs.Entity.EntityDustGolem;
import com.croparia.mod.Mobs.Entity.EntityEarthGolem;
import com.croparia.mod.Mobs.Entity.EntityFireGolem;
import com.croparia.mod.Mobs.Entity.EntityFlying;
import com.croparia.mod.Mobs.Entity.EntityFlyingL;
import com.croparia.mod.Mobs.Entity.EntityFlyingS;
import com.croparia.mod.Mobs.Entity.EntityIceGolem;
import com.croparia.mod.Mobs.Entity.EntityLavaGolem;
import com.croparia.mod.Mobs.Entity.EntityLightningGolem;
import com.croparia.mod.Mobs.Entity.EntityMinotaur;
import com.croparia.mod.Mobs.Entity.EntityMinotaurL;
import com.croparia.mod.Mobs.Entity.EntityMinotaurS;
import com.croparia.mod.Mobs.Entity.EntityMudGolem;
import com.croparia.mod.Mobs.Entity.EntityObsidianGolem;
import com.croparia.mod.Mobs.Entity.EntityPenguin;
import com.croparia.mod.Mobs.Entity.EntityPoisonousFrog;
import com.croparia.mod.Mobs.Entity.EntityReaper;
import com.croparia.mod.Mobs.Entity.EntitySeafarer;
import com.croparia.mod.Mobs.Entity.EntitySeafarerL;
import com.croparia.mod.Mobs.Entity.EntitySeafarerS;
import com.croparia.mod.Mobs.Entity.EntitySmokeGolem;
import com.croparia.mod.Mobs.Entity.EntitySteamGolem;
import com.croparia.mod.Mobs.Entity.EntityWaterGolem;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class MobRegistry 
{
	public static int entitiesId;
	
	public static void registerEntities()
    {
		register(EntitySeafarer.class, "Seafarer", 0x000069, 0x110BBF);  
		register(EntitySeafarerL.class, "SeafarerL", 0x000069, 0x110BBF);  
		register(EntitySeafarerS.class, "SeafarerS", 0x000069, 0x110BBF);  
		register(EntityReaper.class, "Reaper", 0x00000, 0xFFFFFF);  
		register(EntityPenguin.class, "Penguin", 0x00000, 0xC5801F); 
		register(EntityMinotaur.class, "Minotaur", 0x000069, 0xDB000A);
		register(EntityMinotaurL.class, "MinotaurL", 0x000069, 0xDB000A);
		register(EntityMinotaurS.class, "MinotaurS", 0x000069, 0xDB000A);
		register(EntityAkurojin.class, "Akurojin", 0x00000, 0x00000); 
		register(EntityCentaur.class, "Centaur", 0x000069, 0x913C04);
		register(EntityCentaurS.class, "CentaurS", 0x000069, 0x913C04);
		register(EntityCentaurL.class, "CentaurL", 0x000069, 0x913C04);
		register(EntityFlying.class, "Flying", 0x000069, 0xC0C0C0);
		register(EntityFlyingS.class, "FlyingS", 0x000069, 0xC0C0C0);
		register(EntityFlyingL.class, "FlyingL", 0x000069, 0xC0C0C0);
		register(EntityPoisonousFrog.class, "PoisonousFrog", 0x3721FF, 0x000065);
		register(EntityWaterGolem.class, "WaterGolem", 0xFFFFFF, 0x000BFF); 
		register(EntityIceGolem.class, "IcyGolem", 0xFFFFFF, 0xA5F4FF); 
		register(EntitySteamGolem.class, "SteamGolem", 0xFFFFFF, 0xFFFFFF);
		register(EntityFireGolem.class, "FireGolem", 0xFFFFFF, 0x000BFF); 
		register(EntityLavaGolem.class, "LavaGolem", 0xFFFFFF, 0xA5F4FF); 
		register(EntityObsidianGolem.class, "ObsidianGolem", 0xFFFFFF, 0xFFFFFF);  
		register(EntityEarthGolem.class, "EarthGolem", 0xFFFFFF, 0xFFFFFF);  
		register(EntityMudGolem.class, "MudGolem", 0xFFFFFF, 0xFFFFFF);  
		register(EntityDustGolem.class, "DustGolem", 0xFFFFFF, 0xFFFFFF);  
		register(EntityAirGolem.class, "AirGolem", 0xFFFFFF, 0xFFFFFF);  
		register(EntitySmokeGolem.class, "SmokeGolem", 0xFFFFFF, 0xFFFFFF);  
		register(EntityLightningGolem.class, "LightningGolem", 0xFFFFFF, 0xFFFFFF);  
	}
	
	public static void register(Class EntityClass, String entityNameIn, int solidColorIn, int spotColorIn)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + entityNameIn), EntityClass, entityNameIn, ++entitiesId, ModCroparia.instance, 64, 1, true, solidColorIn, spotColorIn);	
	}
}

     

