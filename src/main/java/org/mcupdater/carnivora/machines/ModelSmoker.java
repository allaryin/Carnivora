package org.mcupdater.carnivora.machines;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSmoker extends ModelBase {
	ModelRenderer chimney1;
	ModelRenderer chimney2;
	ModelRenderer chimney3;
	ModelRenderer chimney4;
	ModelRenderer body;
	ModelRenderer handle1;
	ModelRenderer handle2;
	ModelRenderer leg1;
	ModelRenderer leg2;
	ModelRenderer leg3;
	ModelRenderer leg4;
	
	public ModelSmoker() {
		textureWidth = 58;
		textureHeight = 19;
		
		chimney1 = new ModelRenderer(this, 0, 8);
		chimney1.addBox(-2F, -1F, -1F, 1, 2, 2);
		chimney1.setRotationPoint(0F, 9F, 0F);
		chimney1.setTextureSize(58, 19);
		chimney1.mirror = true;
		setRotation(chimney1, 0F, 3.141593F, 0F);
		
		chimney2 = new ModelRenderer(this, 0, 8);
		chimney2.addBox(-2F, -1F, -1F, 1, 2, 2);
		chimney2.setRotationPoint(0F, 9F, 0F);
		chimney2.setTextureSize(58, 19);
		chimney2.mirror = true;
		setRotation(chimney2, 0F, 0F, 0F);
		
		chimney3 = new ModelRenderer(this, 0, 8);
		chimney3.addBox(-2F, -1F, -1F, 1, 2, 2);
		chimney3.setRotationPoint(0F, 9F, 0F);
		chimney3.setTextureSize(58, 19);
		chimney3.mirror = true;
		setRotation(chimney3, 0F, 1.570796F, 0F);
		
		chimney4 = new ModelRenderer(this, 0, 8);
		chimney4.addBox(-2F, -1F, -1F, 1, 2, 2);
		chimney4.setRotationPoint(0F, 9F, 0F);
		chimney4.setTextureSize(58, 19);
		chimney4.mirror = true;
		setRotation(chimney4, 0F, -1.570796F, 0F);
		
		body = new ModelRenderer(this, 8, 0);
		body.addBox(-8F, -5F, -5F, 16, 10, 9);
		body.setRotationPoint(0F, 14F, 0F);
		body.setTextureSize(58, 19);
		body.mirror = true;
		setRotation(body, 1.570796F, 0F, 0F);
		
		handle1 = new ModelRenderer(this, 0, 0);
		handle1.addBox(-2F, -1F, 0F, 4, 1, 1);
		handle1.setRotationPoint(0F, 13F, 5F);
		handle1.setTextureSize(58, 19);
		handle1.mirror = true;
		setRotation(handle1, 0F, 0F, 0F);
		
		handle2 = new ModelRenderer(this, 0, 0);
		handle2.addBox(-2F, -1F, -1F, 4, 1, 1);
		handle2.setRotationPoint(0F, 13F, -5F);
		handle2.setTextureSize(58, 19);
		handle2.mirror = true;
		setRotation(handle2, 0F, 0F, 0F);
		
		leg1 = new ModelRenderer(this, 0, 12);
		leg1.addBox(-1F, 0F, -1F, 2, 5, 2);
		leg1.setRotationPoint(7F, 19F, -4F);
		leg1.setTextureSize(58, 19);
		leg1.mirror = true;
		setRotation(leg1, 0F, 0F, 0F);
		
		leg2 = new ModelRenderer(this, 0, 12);
		leg2.addBox(-1F, 0F, -1F, 2, 5, 2);
		leg2.setRotationPoint(-7F, 19F, -4F);
		leg2.setTextureSize(58, 19);
		leg2.mirror = true;
		setRotation(leg2, 0F, 0F, 0F);
		
		leg3 = new ModelRenderer(this, 0, 12);
		leg3.addBox(-1F, 0F, -1F, 2, 5, 2);
		leg3.setRotationPoint(-7F, 19F, 4F);
		leg3.setTextureSize(58, 19);
		leg3.mirror = true;
		setRotation(leg3, 0F, 0F, 0F);
		
		leg4 = new ModelRenderer(this, 0, 12);
		leg4.addBox(-1F, 0F, -1F, 2, 5, 2);
		leg4.setRotationPoint(7F, 19F, 4F);
		leg4.setTextureSize(58, 19);
		leg4.mirror = true;
		setRotation(leg4, 0F, 0F, 0F);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		chimney1.render(f5);
		chimney2.render(f5);
		chimney3.render(f5);
		chimney4.render(f5);
		body.render(f5);
		handle1.render(f5);
		handle2.render(f5);
		leg1.render(f5);
		leg2.render(f5);
		leg3.render(f5);
		leg4.render(f5);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5, final Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
