package com.croparia.mod.Mobs;

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
import com.croparia.mod.Mobs.Model.ModelCentaur;
import com.croparia.mod.Mobs.Model.ModelElementalGolem;
import com.croparia.mod.Mobs.Model.ModelFlying;
import com.croparia.mod.Mobs.Model.ModelFrog;
import com.croparia.mod.Mobs.Model.ModelMinotaur;
import com.croparia.mod.Mobs.Model.ModelPenguin;
import com.croparia.mod.Mobs.Model.ModelReaper;
import com.croparia.mod.Mobs.Model.ModelSeafarerRmx;
import com.croparia.mod.Mobs.Render.RenderAirGolem;
import com.croparia.mod.Mobs.Render.RenderAkurojin;
import com.croparia.mod.Mobs.Render.RenderCentaur;
import com.croparia.mod.Mobs.Render.RenderCentaurL;
import com.croparia.mod.Mobs.Render.RenderCentaurS;
import com.croparia.mod.Mobs.Render.RenderDustGolem;
import com.croparia.mod.Mobs.Render.RenderEarthGolem;
import com.croparia.mod.Mobs.Render.RenderFireGolem;
import com.croparia.mod.Mobs.Render.RenderFlying;
import com.croparia.mod.Mobs.Render.RenderFlyingL;
import com.croparia.mod.Mobs.Render.RenderFlyingS;
import com.croparia.mod.Mobs.Render.RenderIceGolem;
import com.croparia.mod.Mobs.Render.RenderLavaGolem;
import com.croparia.mod.Mobs.Render.RenderLightningGolem;
import com.croparia.mod.Mobs.Render.RenderMinotaur;
import com.croparia.mod.Mobs.Render.RenderMinotaurL;
import com.croparia.mod.Mobs.Render.RenderMinotaurS;
import com.croparia.mod.Mobs.Render.RenderMudGolem;
import com.croparia.mod.Mobs.Render.RenderObsidianGolem;
import com.croparia.mod.Mobs.Render.RenderPenguin;
import com.croparia.mod.Mobs.Render.RenderPoisonousFrog;
import com.croparia.mod.Mobs.Render.RenderReaper;
import com.croparia.mod.Mobs.Render.RenderSeafarer;
import com.croparia.mod.Mobs.Render.RenderSeafarerL;
import com.croparia.mod.Mobs.Render.RenderSeafarerS;
import com.croparia.mod.Mobs.Render.RenderSmokeGolem;
import com.croparia.mod.Mobs.Render.RenderSteamGolem;
import com.croparia.mod.Mobs.Render.RenderWaterGolem;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class CropariaRenderingRegistry 
{
	public static void registerEntityRenders() 
	{
		RenderingRegistry.registerEntityRenderingHandler(EntitySeafarer.class, new IRenderFactory<EntitySeafarer>() 
		{
			@Override
			public Render<? super EntitySeafarer> createRenderFor(RenderManager manager) {
				return new RenderSeafarer(manager, new ModelSeafarerRmx(), 0.5F);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntitySeafarerS.class, new IRenderFactory<EntitySeafarerS>() 
		{
			@Override
			public Render<? super EntitySeafarerS> createRenderFor(RenderManager manager) {
				return new RenderSeafarerS(manager, new ModelSeafarerRmx(), 0.5F);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntitySeafarerL.class, new IRenderFactory<EntitySeafarerL>() 
		{
			@Override
			public Render<? super EntitySeafarerL> createRenderFor(RenderManager manager) {
				return new RenderSeafarerL(manager, new ModelSeafarerRmx(), 0.5F);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityPenguin.class, new IRenderFactory<EntityPenguin>() 
		{
			@Override
			public Render<? super EntityPenguin> createRenderFor(RenderManager manager) {
				return new RenderPenguin(manager, new ModelPenguin(), 0.5F);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityReaper.class, new IRenderFactory<EntityReaper>() 
		{
			@Override
			public Render<? super EntityReaper> createRenderFor(RenderManager manager) {
				return new RenderReaper(manager, new ModelReaper(), 0.5F);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityMinotaur.class, new IRenderFactory<EntityMinotaur>() 
		{
			@Override
			public Render<? super EntityMinotaur> createRenderFor(RenderManager manager) {
				return new RenderMinotaur(manager, new ModelMinotaur(), 0.5F);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityMinotaurS.class, new IRenderFactory<EntityMinotaurS>() 
		{
			@Override
			public Render<? super EntityMinotaurS> createRenderFor(RenderManager manager) {
				return new RenderMinotaurS(manager, new ModelMinotaur(), 0.5F);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityMinotaurL.class, new IRenderFactory<EntityMinotaurL>() 
		{
			@Override
			public Render<? super EntityMinotaurL> createRenderFor(RenderManager manager) {
				return new RenderMinotaurL(manager, new ModelMinotaur(), 0.5F);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityAkurojin.class, new IRenderFactory<EntityAkurojin>() 
		{
			@Override
			public Render<? super EntityAkurojin> createRenderFor(RenderManager manager) {
				return new RenderAkurojin(manager, new ModelBiped(), 0F);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityCentaur.class, new IRenderFactory<EntityCentaur>() 
		{
			@Override
			public Render<? super EntityCentaur> createRenderFor(RenderManager manager) {
				return new RenderCentaur(manager, new ModelCentaur(), 0.5F);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityCentaurS.class, new IRenderFactory<EntityCentaurS>() 
		{
			@Override
			public Render<? super EntityCentaurS> createRenderFor(RenderManager manager) {
				return new RenderCentaurS(manager, new ModelCentaur(), 0.5F);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityCentaurL.class, new IRenderFactory<EntityCentaurL>() 
		{
			@Override
			public Render<? super EntityCentaurL> createRenderFor(RenderManager manager) {
				return new RenderCentaurL(manager, new ModelCentaur(), 0.5F);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFlying.class, new IRenderFactory<EntityFlying>() 
		{
			@Override
			public Render<? super EntityFlying> createRenderFor(RenderManager manager) {
				return new RenderFlying(manager, new ModelFlying(), 0F);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFlyingS.class, new IRenderFactory<EntityFlyingS>() 
		{
			@Override
			public Render<? super EntityFlyingS> createRenderFor(RenderManager manager) {
				return new RenderFlyingS(manager, new ModelFlying(), 0F);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFlyingL.class, new IRenderFactory<EntityFlyingL>() 
		{
			@Override
			public Render<? super EntityFlyingL> createRenderFor(RenderManager manager) {
				return new RenderFlyingL(manager, new ModelFlying(), 0F);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityPoisonousFrog.class, new IRenderFactory<EntityPoisonousFrog>() 
		{
			@Override
			public Render<? super EntityPoisonousFrog> createRenderFor(RenderManager manager) {
				return new RenderPoisonousFrog(manager, new ModelFrog(), 0F);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityWaterGolem.class, new IRenderFactory<EntityWaterGolem>() 
		{
			@Override
			public Render<? super EntityWaterGolem> createRenderFor(RenderManager manager) {
				return new RenderWaterGolem(manager, new ModelElementalGolem(), 0F);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityIceGolem.class, new IRenderFactory<EntityIceGolem>() 
		{
			@Override
			public Render<? super EntityIceGolem> createRenderFor(RenderManager manager) {
				return new RenderIceGolem(manager, new ModelElementalGolem(), 0F);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntitySteamGolem.class, new IRenderFactory<EntitySteamGolem>() 
		{
			@Override
			public Render<? super EntitySteamGolem> createRenderFor(RenderManager manager) {
				return new RenderSteamGolem(manager, new ModelElementalGolem(), 0F);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFireGolem.class, new IRenderFactory<EntityFireGolem>() 
		{
			@Override
			public Render<? super EntityFireGolem> createRenderFor(RenderManager manager) {
				return new RenderFireGolem(manager, new ModelElementalGolem(), 0F);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityLavaGolem.class, new IRenderFactory<EntityLavaGolem>() 
		{
			@Override
			public Render<? super EntityLavaGolem> createRenderFor(RenderManager manager) {
				return new RenderLavaGolem(manager, new ModelElementalGolem(), 0F);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityObsidianGolem.class, new IRenderFactory<EntityObsidianGolem>() 
		{
			@Override
			public Render<? super EntityObsidianGolem> createRenderFor(RenderManager manager) {
				return new RenderObsidianGolem(manager, new ModelElementalGolem(), 0F);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityEarthGolem.class, new IRenderFactory<EntityEarthGolem>() 
		{
			@Override
			public Render<? super EntityEarthGolem> createRenderFor(RenderManager manager) {
				return new RenderEarthGolem(manager, new ModelElementalGolem(), 0F);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityMudGolem.class, new IRenderFactory<EntityMudGolem>() 
		{
			@Override
			public Render<? super EntityMudGolem> createRenderFor(RenderManager manager) {
				return new RenderMudGolem(manager, new ModelElementalGolem(), 0F);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityDustGolem.class, new IRenderFactory<EntityDustGolem>() 
		{
			@Override
			public Render<? super EntityDustGolem> createRenderFor(RenderManager manager) {
				return new RenderDustGolem(manager, new ModelElementalGolem(), 0F);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityAirGolem.class, new IRenderFactory<EntityAirGolem>() 
		{
			@Override
			public Render<? super EntityAirGolem> createRenderFor(RenderManager manager) {
				return new RenderAirGolem(manager, new ModelElementalGolem(), 0F);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntitySmokeGolem.class, new IRenderFactory<EntitySmokeGolem>() 
		{
			@Override
			public Render<? super EntitySmokeGolem> createRenderFor(RenderManager manager) {
				return new RenderSmokeGolem(manager, new ModelElementalGolem(), 0F);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityLightningGolem.class, new IRenderFactory<EntityLightningGolem>() 
		{
			@Override
			public Render<? super EntityLightningGolem> createRenderFor(RenderManager manager) {
				return new RenderLightningGolem(manager, new ModelElementalGolem(), 0F);
			}
		});
	}
}
