package com.croparia.mod.Mobs.Render;

import com.croparia.mod.Reference;
import com.croparia.mod.Mobs.Entity.EntityObsidianGolem;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderObsidianGolem extends RenderLiving<EntityObsidianGolem>
{
    private static final ResourceLocation ENTITY_TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/golem/obsidian.png");
    
    public RenderObsidianGolem(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) 
    {
        super(rendermanagerIn, modelbaseIn, shadowsizeIn);
    }   
    
    @Override
    protected ResourceLocation getEntityTexture(EntityObsidianGolem entity) 
    {
        return ENTITY_TEXTURE;
    }
}
