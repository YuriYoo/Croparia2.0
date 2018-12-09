package com.croparia.mod.Mobs.Model;

import org.lwjgl.opengl.GL11;

import com.croparia.mod.LlibraryImplementation.AdvancedModelBase;
import com.croparia.mod.LlibraryImplementation.AdvancedModelRenderer;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelElementalGolem extends AdvancedModelBase
{
  //fields
	AdvancedModelRenderer typedown;
	AdvancedModelRenderer typeup;
	AdvancedModelRenderer rightbody;
	AdvancedModelRenderer leftbody;
	AdvancedModelRenderer rightarm;
	AdvancedModelRenderer rightshoulder;
	AdvancedModelRenderer body;
	AdvancedModelRenderer head;
    AdvancedModelRenderer leftshoulder;
    AdvancedModelRenderer leftarm;
  
  public ModelElementalGolem()
  {
	  textureWidth = 128;
	  textureHeight = 128;
      typedown = new AdvancedModelRenderer(this, 59, 0);
      typedown.addBox(-3F, -3F, -3F, 6, 6, 6);
      typedown.setRotationPoint(0F, 6F, 0F);
      typedown.setTextureSize(128, 128);  
      typeup = new AdvancedModelRenderer(this, 37, 0);
      typeup.addBox(4F, 4F, -2.5F, 4, 4, 5);
      typeup.setRotationPoint(0F, -13F, 0F);
      typeup.setTextureSize(128, 128);
      rightbody = new AdvancedModelRenderer(this, 66, 96);
      rightbody.addBox(-2F, 9F, -2.5F, 10, 6, 5);
      rightbody.setRotationPoint(0F, -13F, 0F);
      rightbody.setTextureSize(128, 128);
      leftbody = new AdvancedModelRenderer(this, 30, 96);
      leftbody.addBox(-8F, 9F, -2.5F, 10, 6, 5);
      leftbody.setRotationPoint(0F, -13F, 0F);
      leftbody.setTextureSize(128, 128);
      rightarm = new AdvancedModelRenderer(this, 66, 71);
      rightarm.addBox(-2F, 0F, -2.5F, 5, 16, 5);
      rightarm.setRotationPoint(-16.5F, 6F, -0.5F);
      rightarm.setTextureSize(128, 128);
      rightshoulder = new AdvancedModelRenderer(this, 66, 44);
      rightshoulder.addBox(-6F, -4F, -4F, 9, 9, 9);
      rightshoulder.setRotationPoint(-12.5F, -12F, -0.5F);
      rightshoulder.setTextureSize(128, 128);
      body = new AdvancedModelRenderer(this, 0, 20);
      body.addBox(-12.5F, 0F, -3F, 25, 9, 6);
      body.setRotationPoint(0F, -13F, 0F);
      body.setTextureSize(128, 128);
      head = new AdvancedModelRenderer(this, 0, 0);
      head.addBox(-4F, -4F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, -13F, 0F);
      head.setTextureSize(128, 128);
      leftshoulder = new AdvancedModelRenderer(this, 24, 44);
      leftshoulder.addBox(-2F, -4F, -4F, 9, 9, 9);
      leftshoulder.setRotationPoint(11.5F, -12F, -0.5F);
      leftshoulder.setTextureSize(128, 128);
      leftarm = new AdvancedModelRenderer(this, 40, 71);
      leftarm.addBox(-3F, 0F, -2.5F, 5, 16, 5);
      leftarm.setRotationPoint(16.5F, 6F, -0.5F);
      leftarm.setTextureSize(128, 128);
      this.setRotation(typeup, 0, 0, 44.8f);
      this.setRotation(rightbody, 0, 0, -0.4425f);
      this.setRotation(leftbody, 0, 0, 0.4425f);
      this.setRotation(typedown, 25, 42, 22);
      
      convertToChild(body, rightbody);
      convertToChild(body, leftbody);
      convertToChild(body, head);
      convertToChild(body, typeup);
      convertToChild(body, typedown);
      convertToChild(body, leftshoulder);
      convertToChild(body, rightshoulder);
      convertToChild(leftshoulder, leftarm);
      convertToChild(rightshoulder, rightarm);
      
      AdvancedModelRenderer[] parts = new AdvancedModelRenderer[] {head, body, rightbody, leftbody, typeup, typedown, leftarm, leftshoulder, rightarm, rightshoulder};
      updateDefaultPose();
  }
  
  protected void convertToChild(ModelRenderer parent, ModelRenderer child)
  {
    // move child rotation point to be relative to parent
      child.rotationPointX -= parent.rotationPointX;
      child.rotationPointY -= parent.rotationPointY;
      child.rotationPointZ -= parent.rotationPointZ;
      
    // make rotations relative to parent
      child.rotateAngleX -= parent.rotateAngleX;
      child.rotateAngleY -= parent.rotateAngleY;
      child.rotateAngleZ -= parent.rotateAngleZ;
      
    //create relationship
      parent.addChild(child);
      
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);GL11.glPushMatrix();
	GL11.glScalef(1f, 1f, 1f);
	GL11.glTranslatef(0f, 0f, 0f);
    this.body.render(f5);
	GL11.glPopMatrix();
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);resetToDefaultPose();
	float fa = entity.ticksExisted;
	float fa1 = 0.5f;

	float globalSpeed = 0.6f;
	float globalHeight = 1.2f;
	float globalDegree = 0.6f;

	bob(body, 1 * globalSpeed, 2 * globalHeight, false, f, f1);

	walk(typedown, 0.5f *globalSpeed, 2f * globalHeight, true, 0.5f, 0, fa, fa1);
	flap(typedown, 0.5f *globalSpeed, 2f * globalHeight, true, 0.5f, 0, fa, fa1);
	bob(typedown, globalSpeed, 1.5F * globalHeight, false, fa, fa1);

	walk(head, globalSpeed, 0.2f * globalHeight, true, 0.5f, 0, f, f1);

	walk(leftshoulder, 0.5f * globalSpeed, 1F * globalDegree, true, 0f, 0f, f, f1);
	walk(rightshoulder, 0.5f * globalSpeed, 1F * globalDegree, false, 0f, 0f, f, f1);
	walk(rightarm, 0.5f * globalSpeed, 0.4F * globalDegree, true, 0.2f, 1f, f, f1);
	walk(leftarm, 0.5f * globalSpeed, 0.4F * globalDegree, false, 0.2f, -1f, f, f1);

  }

}
