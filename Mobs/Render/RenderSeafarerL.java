package com.croparia.mod.Mobs.Render;

import com.croparia.mod.Reference;
import com.croparia.mod.Mobs.Entity.EntitySeafarerL;
import com.croparia.mod.Mobs.Model.ModelSeafarerRmx;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSeafarerL extends RenderLiving<EntitySeafarerL>
{
    private static final ResourceLocation ENTITY_TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/seafarer.png"); 
    

	public RenderSeafarerL(RenderManager renderManager, ModelSeafarerRmx modelSeafarerRmx, float f) {
		super(renderManager, modelSeafarerRmx, f);
	}


	@Override
    protected ResourceLocation getEntityTexture(EntitySeafarerL entity) 
    {
        return ENTITY_TEXTURE;
    }
}
