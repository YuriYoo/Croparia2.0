package com.croparia.mod.Mobs.Model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Frog - Defacto34
 * Created using Tabula 7.0.0
 */
public class ModelFrog extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer LLeg1;
    public ModelRenderer RLeg1;
    public ModelRenderer LArm;
    public ModelRenderer RArm;
    public ModelRenderer LLeg2;
    public ModelRenderer RLeg2;

    public ModelFrog() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.LLeg2 = new ModelRenderer(this, 25, 7);
        this.LLeg2.setRotationPoint(0.5F, 0.5F, -1.0F);
        this.LLeg2.addBox(-0.5F, -0.6F, -2.0F, 1, 1, 2, 0.0F);
        this.RLeg1 = new ModelRenderer(this, 35, 0);
        this.RLeg1.setRotationPoint(-3.0F, 0.3F, -0.9F);
        this.RLeg1.addBox(0.0F, -1.0F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(RLeg1, 0.2617993877991494F, 0.0F, 0.0F);
        this.LLeg1 = new ModelRenderer(this, 25, 0);
        this.LLeg1.setRotationPoint(2.0F, 0.3F, -0.9F);
        this.LLeg1.addBox(0.0F, -1.0F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(LLeg1, 0.2617993877991494F, 0.0F, 0.0F);
        this.RLeg2 = new ModelRenderer(this, 35, 7);
        this.RLeg2.setRotationPoint(0.5F, 0.5F, -1.0F);
        this.RLeg2.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 23.0F, 3.0F);
        this.Body.addBox(-2.0F, -1.0F, -6.0F, 4, 2, 6, 0.0F);
        this.setRotateAngle(Body, -0.2617993877991494F, 0.0F, 0.0F);
        this.LArm = new ModelRenderer(this, 25, 14);
        this.LArm.setRotationPoint(1.5F, 1.0F, -5.5F);
        this.LArm.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.RArm = new ModelRenderer(this, 35, 14);
        this.RArm.setRotationPoint(-1.5F, 1.0F, -5.5F);
        this.RArm.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.LLeg1.addChild(this.LLeg2);
        this.Body.addChild(this.RLeg1);
        this.Body.addChild(this.LLeg1);
        this.RLeg1.addChild(this.RLeg2);
        this.Body.addChild(this.LArm);
        this.Body.addChild(this.RArm);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Body.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
