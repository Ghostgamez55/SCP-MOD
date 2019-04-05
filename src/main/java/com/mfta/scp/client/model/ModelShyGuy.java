package com.mfta.scp.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelShyGuy extends ModelBase {

	public ModelRenderer Mouth;
	public ModelRenderer Head;
    public ModelRenderer Body;
    
    public ModelRenderer RightArm;
    public ModelRenderer LeftArm;
    
    public ModelRenderer RightLeg;
    public ModelRenderer LeftLeg;
    

    public ModelShyGuy() {
        
    	this.textureWidth = 64;
        this.textureHeight = 64;
        
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, -13.0F, 0.0F);
        this.Head.addBox(-4.0F, -9.0F, -4.0F, 8, 9, 8, 0.0F);
        
        this.LeftArm = new ModelRenderer(this, 12, 39);
        this.LeftArm.mirror = true;
        this.LeftArm.setRotationPoint(5.0F, -10.5F, 0.0F);
        this.LeftArm.addBox(-1.0F, -2.0F, -1.5F, 3, 22, 3, 0.0F);
        
        this.LeftLeg = new ModelRenderer(this, 0, 37);
        this.LeftLeg.mirror = true;
        this.LeftLeg.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.LeftLeg.addBox(-1.5F, 0.0F, -1.5F, 3, 24, 3, 0.0F);
        
        this.Mouth = new ModelRenderer(this, 0, 17);
        this.Mouth.setRotationPoint(0.0F, -13.0F, 0.0F);
        this.Mouth.addBox(-4.0F, -6.0F, -4.0F, 8, 8, 4, -0.25F);
        
        this.RightLeg = new ModelRenderer(this, 0, 37);
        this.RightLeg.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.RightLeg.addBox(-1.5F, 0.0F, -1.5F, 3, 24, 3, 0.0F);
        
        this.Body = new ModelRenderer(this, 40, 0);
        this.Body.setRotationPoint(0.0F, -13.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 14, 4, 0.0F);
        
        this.RightArm = new ModelRenderer(this, 12, 39);
        this.RightArm.setRotationPoint(-5.0F, -10.5F, 0.0F);
        this.RightArm.addBox(-2.0F, -2.0F, -1.5F, 3, 22, 3, 0.0F);
    
    }

    
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        
    	this.LeftArm.render(f5);
        this.LeftLeg.render(f5);
        
        this.Mouth.render(f5);
        this.Body.render(f5);
        this.Head.render(f5);
        
        this.RightLeg.render(f5);
        this.RightArm.render(f5);
    
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
