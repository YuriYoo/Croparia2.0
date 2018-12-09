package com.croparia.mod.Mobs.Render;

import com.croparia.mod.Reference;
import com.croparia.mod.Mobs.Entity.EntityDustGolem;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDustGolem extends RenderLiving<EntityDustGolem>
{
    private static final ResourceLocation ENTITY_TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/golem/dust.png");
    
    public RenderDustGolem(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) 
    {
        super(rendermanagerIn, modelbaseIn, shadowsizeIn);
    }   
    
    @Override
    protected ResourceLocation getEntityTexture(EntityDustGolem entity) 
    {
        return ENTITY_TEXTURE;
    }
}
