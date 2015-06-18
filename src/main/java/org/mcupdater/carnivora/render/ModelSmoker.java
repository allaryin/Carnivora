package org.mcupdater.carnivora.render;

import org.mcupdater.carnivora.Version;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class ModelSmoker extends ModelBase {
	public static ModelSmoker INSTANCE = null;
	public static ModelSmoker getInstance() {
		if( INSTANCE == null )
			INSTANCE = new ModelSmoker();
		return INSTANCE;
	}
	
	ResourceLocation texture;
	public ResourceLocation getTexture() {
		return texture;
	}
	
    ModelRenderer handle;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer chimney1;
    ModelRenderer chimney2;
    ModelRenderer chimney3;
    ModelRenderer chimney4;
    ModelRenderer bodyleft;
    ModelRenderer bodyback;
    ModelRenderer bodyfrontright;
    ModelRenderer bodytop;
    ModelRenderer bodyfrontleft;
    ModelRenderer bodybottom;
    ModelRenderer bodyback;
    ModelRenderer bodyright;
  
	public ModelSmoker() {
		texture = new ResourceLocation(Version.TEXTURE_PREFIX+"textures/blocks/smoker.png");
		
		textureWidth = 58;
		textureHeight = 19;
    
      handle = new ModelRenderer(this, 62, 30);
      handle.addBox(-1F, -2F, -1F, 1, 4, 1);
      handle.setRotationPoint(0F, 13F, -5.5F);
      handle.setTextureSize(69, 38);
      handle.mirror = true;
      setRotation(handle, 0F, 0F, 1.570796F);
      leg1 = new ModelRenderer(this, 0, 13);
      leg1.addBox(-1F, 0F, -1F, 2, 5, 2);
      leg1.setRotationPoint(6F, 19F, -3F);
      leg1.setTextureSize(69, 38);
      leg1.mirror = true;
      setRotation(leg1, 0F, 0.7853982F, 0F);
      leg2 = new ModelRenderer(this, 0, 13);
      leg2.addBox(-1F, 0F, -1F, 2, 5, 2);
      leg2.setRotationPoint(-6F, 19F, -3F);
      leg2.setTextureSize(69, 38);
      leg2.mirror = true;
      setRotation(leg2, 0F, 0.7853982F, 0F);
      leg3 = new ModelRenderer(this, 0, 13);
      leg3.addBox(-1F, 0F, -1F, 2, 5, 2);
      leg3.setRotationPoint(-6F, 19F, 3F);
      leg3.setTextureSize(69, 38);
      leg3.mirror = true;
      setRotation(leg3, 0F, 0.7853982F, 0F);
      leg4 = new ModelRenderer(this, 0, 13);
      leg4.addBox(-1F, 0F, -1F, 2, 5, 2);
      leg4.setRotationPoint(6F, 19F, 3F);
      leg4.setTextureSize(69, 38);
      leg4.mirror = true;
      setRotation(leg4, 0F, 0.7853982F, 0F);
      chimney1 = new ModelRenderer(this, 0, 23);
      chimney1.addBox(-2F, -1F, -1F, 1, 2, 2);
      chimney1.setRotationPoint(0F, 9F, 0F);
      chimney1.setTextureSize(69, 38);
      chimney1.mirror = true;
      setRotation(chimney1, 0F, 3.141593F, 0F);
      chimney2 = new ModelRenderer(this, 0, 23);
      chimney2.addBox(-2F, -1F, -1F, 1, 2, 2);
      chimney2.setRotationPoint(0F, 9F, 0F);
      chimney2.setTextureSize(69, 38);
      chimney2.mirror = true;
      setRotation(chimney2, 0F, 0F, 0F);
      chimney3 = new ModelRenderer(this, 0, 23);
      chimney3.addBox(-2F, -1F, -1F, 1, 2, 2);
      chimney3.setRotationPoint(0F, 9F, 0F);
      chimney3.setTextureSize(69, 38);
      chimney3.mirror = true;
      setRotation(chimney3, 0F, 1.570796F, 0F);
      chimney4 = new ModelRenderer(this, 0, 23);
      chimney4.addBox(-2F, -1F, -1F, 1, 2, 2);
      chimney4.setRotationPoint(0F, 9F, 0F);
      chimney4.setTextureSize(69, 38);
      chimney4.mirror = true;
      setRotation(chimney4, 0F, -1.570796F, 0F);
      bodyleft = new ModelRenderer(this, 31, 30);
      bodyleft.addBox(-4F, -7.5F, -4F, 8, 1, 7);
      bodyleft.setRotationPoint(0F, 14F, 0F);
      bodyleft.setTextureSize(69, 38);
      bodyleft.mirror = true;
      setRotation(bodyleft, 1.570796F, -1.570796F, 0F);
      bodyback = new ModelRenderer(this, 9, 12);
      bodyback.addBox(-6F, -0.5F, 0F, 12, 1, 7);
      bodyback.setRotationPoint(0F, 18F, -5F);
      bodyback.setTextureSize(69, 38);
      bodyback.mirror = true;
      setRotation(bodyback, 1.570796F, 0F, 0F);
      bodyfrontright = new ModelRenderer(this, 48, 12);
      bodyfrontright.addBox(-8F, -5F, -4F, 2, 1, 7);
      bodyfrontright.setRotationPoint(0F, 14F, 0F);
      bodyfrontright.setTextureSize(69, 38);
      bodyfrontright.mirror = true;
      setRotation(bodyfrontright, 1.570796F, 0F, 0F);
      bodytop = new ModelRenderer(this, 35, 0);
      bodytop.addBox(-8F, -5F, 3F, 16, 10, 1);
      bodytop.setRotationPoint(0F, 14F, 0F);
      bodytop.setTextureSize(69, 38);
      bodytop.mirror = true;
      setRotation(bodytop, 1.570796F, 0F, 0F);
      bodyfrontleft = new ModelRenderer(this, 48, 21);
      bodyfrontleft.addBox(6F, -5F, -4F, 2, 1, 7);
      bodyfrontleft.setRotationPoint(0F, 14F, 0F);
      bodyfrontleft.setTextureSize(69, 38);
      bodyfrontleft.mirror = true;
      setRotation(bodyfrontleft, 1.570796F, 0F, 0F);
      bodybottom = new ModelRenderer(this, 0, 0);
      bodybottom.addBox(-8F, -5F, -5F, 16, 10, 1);
      bodybottom.setRotationPoint(0F, 14F, 0F);
      bodybottom.setTextureSize(69, 38);
      bodybottom.mirror = true;
      setRotation(bodybottom, 1.570796F, 0F, 0F);
      bodyback = new ModelRenderer(this, 1, 21);
      bodyback.addBox(-8F, 4F, -4F, 16, 1, 7);
      bodyback.setRotationPoint(0F, 14F, 0F);
      bodyback.setTextureSize(69, 38);
      bodyback.mirror = true;
      setRotation(bodyback, 1.570796F, 0F, 0F);
      bodyright = new ModelRenderer(this, 0, 30);
      bodyright.addBox(-4F, -7.5F, -4F, 8, 1, 7);
      bodyright.setRotationPoint(0F, 14F, 0F);
      bodyright.setTextureSize(69, 38);
      bodyright.mirror = true;
      setRotation(bodyright, 1.570796F, 1.570796F, 0F);
  }
  
	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    handle.render(f5);
    leg1.render(f5);
    leg2.render(f5);
    leg3.render(f5);
    leg4.render(f5);
    chimney1.render(f5);
    chimney2.render(f5);
    chimney3.render(f5);
    chimney4.render(f5);
    bodyleft.render(f5);
    bodyback.render(f5);
    bodyfrontright.render(f5);
    bodytop.render(f5);
    bodyfrontleft.render(f5);
    bodybottom.render(f5);
    bodyback.render(f5);
    bodyright.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
	@Override
	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5, final Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
