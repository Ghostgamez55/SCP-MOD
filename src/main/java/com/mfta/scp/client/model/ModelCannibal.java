package com.mfta.scp.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCannibal extends ModelBase {
	
	public ModelRenderer Head;
	public ModelRenderer Body;
    
	public ModelRenderer RightLeg1;
    public ModelRenderer LeftLeg1;
    
    public ModelRenderer RightArm;
    public ModelRenderer LeftArm;
    
    public ModelRenderer Sword;
    public ModelRenderer Arrows;
    
    public ModelRenderer RightLeg2;
    public ModelRenderer LeftLeg2;
    
    public ModelRenderer ArrowRightArm;

    
    public ModelCannibal() {
        
    	this.textureWidth = 128;
        this.textureHeight = 64;
        
        this.LeftLeg2 = new ModelRenderer(this, 80, 47);
        this.LeftLeg2.mirror = true;
        this.LeftLeg2.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.LeftLeg2.addBox(-2.5F, 0.0F, -2.5F, 5, 12, 5, 0.0F);
        
        this.LeftLeg1 = new ModelRenderer(this, 52, 48);
        this.LeftLeg1.mirror = true;
        this.LeftLeg1.setRotationPoint(3.5F, 6.0F, 0.0F);
        this.LeftLeg1.addBox(-3.0F, 0.0F, -4.0F, 6, 8, 8, 0.0F);
        this.LeftLeg1.addChild(this.LeftLeg2);
        
        this.Arrows = new ModelRenderer(this, 12, 0);
        this.Arrows.setRotationPoint(-3.0F, 7.0F, 4.0F);
        this.Arrows.addBox(-2.0F, -2.0F, 0.0F, 4, 7, 8, 0.0F);
        this.setRotateAngle(Arrows, 0.0F, -0.4363323129985824F, -0.7853981633974483F);
        
        this.ArrowRightArm = new ModelRenderer(this, 36, 0);
        this.ArrowRightArm.setRotationPoint(-3.0F, 13.0F, -2.0F);
        this.ArrowRightArm.addBox(0.0F, -2.0F, -8.0F, 1, 4, 8, 0.0F);
        this.setRotateAngle(ArrowRightArm, 0.0F, 0.5235987755982988F, -0.5235987755982988F);
        
        this.RightLeg1 = new ModelRenderer(this, 52, 48);
        this.RightLeg1.setRotationPoint(-3.5F, 6.0F, 0.0F);
        this.RightLeg1.addBox(-3.0F, 0.0F, -4.0F, 6, 8, 8, 0.0F);
        this.RightLeg1.addChild(this.RightLeg2);
        
        this.Body = new ModelRenderer(this, 0, 34);
        this.Body.setRotationPoint(0.0F, -11.0F, 0.0F);
        this.Body.addBox(-7.0F, 0.0F, -6.0F, 14, 18, 12, 0.0F);
        this.Body.addChild(this.Arrows);
        this.Body.addChild(this.Sword);
        
        this.Sword = new ModelRenderer(this, 0, -10);
        this.Sword.setRotationPoint(3.0F, 5.0F, 5.0F);
        this.Sword.addBox(0.0F, -3.0F, 0.0F, 0, 6, 10, 0.0F);
        this.setRotateAngle(Sword, 0.4363323129985824F, 0.7853981633974483F, 0.0F);
        
        this.Head = new ModelRenderer(this, 0, 17);
        this.Head.setRotationPoint(0.0F, -11.0F, 0.0F);
        this.Head.addBox(-4.0F, -9.0F, -4.0F, 8, 9, 8, 0.0F);
        
        this.RightArm = new ModelRenderer(this, 100, 32);
        this.RightArm.setRotationPoint(-8.0F, -8.0F, 0.0F);
        this.RightArm.addBox(-4.0F, -2.0F, -3.0F, 5, 26, 6, 0.0F);
        this.RightArm.addChild(this.ArrowRightArm);
        
        this.LeftArm = new ModelRenderer(this, 100, 32);
        this.LeftArm.mirror = true;
        this.LeftArm.setRotationPoint(8.0F, -8.0F, 0.0F);
        this.LeftArm.addBox(-1.0F, -2.0F, -3.0F, 5, 26, 6, 0.0F);
        
        this.RightLeg2 = new ModelRenderer(this, 80, 47);
        this.RightLeg2.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.RightLeg2.addBox(-2.5F, 0.0F, -2.5F, 5, 12, 5, 0.0F);
        
    }
    

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        
    	this.LeftLeg1.render(f5);
        this.RightLeg1.render(f5);
        
        this.Body.render(f5);
        this.Head.render(f5);
        
        this.RightArm.render(f5);
        this.LeftArm.render(f5);
    
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

