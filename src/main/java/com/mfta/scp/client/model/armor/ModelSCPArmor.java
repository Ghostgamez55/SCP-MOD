package com.mfta.scp.client.model.armor;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelPlayer - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelSCPArmor extends ModelBiped {
   
	public ModelRenderer frontvest;
    public ModelRenderer shoulderpadleft;
    public ModelRenderer backvest;
    public ModelRenderer shoulderpadright;
    public ModelRenderer shader;
    public ModelRenderer holsterbag;

    public ModelSCPArmor() {
     
    	this.textureWidth = 130;
        this.textureHeight = 130;
        this.backvest = new ModelRenderer(this, 84, 63);
        this.backvest.setRotationPoint(0.0F, 4.7F, 5.8F);
        this.backvest.addBox(-3.6F, -4.0F, -4.0F, 7, 10, 1, 0.0F);
        this.frontvest = new ModelRenderer(this, 85, 39);
        this.frontvest.setRotationPoint(-3.4F, 5.4F, 1.0F);
        this.frontvest.addBox(-0.2F, -5.0F, -4.0F, 7, 10, 1, 0.0F);
        this.shoulderpadleft = new ModelRenderer(this, 63, 22);
        this.shoulderpadleft.setRotationPoint(-6.5F, -0.1F, 0.0F);
        this.shoulderpadleft.addBox(-2.3F, 0.0F, -3.0F, 5, 4, 6, 0.0F);
        this.shader = new ModelRenderer(this, 86, 78);
        this.shader.mirror = true;
        this.shader.setRotationPoint(-3.5F, -6.9F, -5.0F);
        this.shader.addBox(0.0F, 0.0F, 0.0F, 7, 4, 1, 0.0F);
        this.shoulderpadright = new ModelRenderer(this, 96, 20);
        this.shoulderpadright.setRotationPoint(3.9F, -0.1F, -3.0F);
        this.shoulderpadright.addBox(0.0F, 0.0F, 0.0F, 5, 4, 6, 0.0F);
        this.holsterbag = new ModelRenderer(this, 87, 5);
        this.holsterbag.setRotationPoint(2.0F, 2.9F, -1.0F);
        this.holsterbag.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.bipedBody.addChild(this.backvest);
        this.bipedBody.addChild(this.frontvest);
        this.shoulderpadleft.addChild(this.bipedLeftArm);
        this.shoulderpadright.addChild(this.bipedRightArm);
        this.bipedBody.addChild(this.shoulderpadleft);
        this.bipedHead.addChild(this.shader);
        this.bipedBody.addChild(this.shoulderpadright);
        this.bipedRightLeg.addChild(this.holsterbag);
    
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        
    	modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    
    }
}
