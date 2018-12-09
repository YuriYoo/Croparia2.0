package com.croparia.mod.Mobs.Render;

import com.croparia.mod.Reference;
import com.croparia.mod.Mobs.Entity.EntityReaper;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderReaper extends RenderLiving<EntityReaper>
{
    private static final ResourceLocation ENTITY_TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/reaper.png");
    
    public RenderReaper(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) 
    {
        super(rendermanagerIn, modelbaseIn, shadowsizeIn);
    }   
    
    @Override
    protected ResourceLocation getEntityTexture(EntityReaper entity) 
    {
        return ENTITY_TEXTURE;
    }
}
