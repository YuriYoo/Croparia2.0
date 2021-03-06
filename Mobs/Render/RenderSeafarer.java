package com.croparia.mod.Mobs.Render;

import com.croparia.mod.Reference;
import com.croparia.mod.Mobs.Entity.EntitySeafarer;
import com.croparia.mod.Mobs.Model.ModelSeafarerRmx;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSeafarer extends RenderLiving<EntitySeafarer>
{
    private static final ResourceLocation ENTITY_TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/seafarer.png"); 
    

	public RenderSeafarer(RenderManager renderManager, ModelSeafarerRmx modelSeafarerRmx, float f) {
		super(renderManager, modelSeafarerRmx, f);
	}


	@Override
    protected ResourceLocation getEntityTexture(EntitySeafarer entity) 
    {
        return ENTITY_TEXTURE;
    }
}
