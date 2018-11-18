package com.mfta.scp.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGasMask extends ModelBase {
	
	public ModelRenderer Head;
	public ModelRenderer Nose1;
	public ModelRenderer EyeHole1;
	public ModelRenderer EyeHole2;
	public ModelRenderer Nose2;
	
	public ModelGasMask() {
		this.textureWidth = 64;
		this.textureHeight = 32;
		this.Nose1 = new ModelRenderer(this, 0, 21);
		this.Nose1.setRotationPoint(0.0F, -2.0F, -4.0F);
		this.Nose1.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F);
		this.setRotateAngle(Nose1, 0.2617993877991494F, 0.0F, 0.0F);
		this.EyeHole1 = new ModelRenderer(this, 0, 0);
		this.EyeHole1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.EyeHole1.addBox(-3.0F, -5.0F, -4.5F, 2, 2, 1, 0.0F);
		this.Nose2 = new ModelRenderer(this, 0, 24);
		this.Nose2.setRotationPoint(0.0F, 1.0F, -1.0F);
		this.Nose2.addBox(-2.0F, -2.0F, -2.0F, 4, 4, 2, 0.0F);
		this.EyeHole2 = new ModelRenderer(this, 0, 0);
		this.EyeHole2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.EyeHole2.addBox(1.0F, -5.0F, -4.5F, 2, 2, 1, 0.0F);
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
		this.Head.addChild(this.Nose1);
		this.Head.addChild(this.EyeHole1);
		this.Nose1.addChild(this.Nose2);
		this.Head.addChild(this.EyeHole2);
	}
	
	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		this.Head.render(scale);
	}
	
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
