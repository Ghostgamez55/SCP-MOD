package com.mfta.scp.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBilly extends ModelBase {
    
    public ModelRenderer torso;
    public ModelRenderer midsection;
    public ModelRenderer leftarm;
    public ModelRenderer rightarm;
    public ModelRenderer head;
    public ModelRenderer lefttopleg;
    public ModelRenderer righttopleg;
    public ModelRenderer leftbottomleg;
    public ModelRenderer rightbottomleg;

    public ModelBilly() {
        
    	this.textureWidth = 130;
        this.textureHeight = 130;
        this.midsection = new ModelRenderer(this, 48, 62);
        this.midsection.setRotationPoint(0.0F, 9.0F, 0.4F);
        this.midsection.addBox(0.0F, 0.0F, 0.0F, 6, 5, 4, 0.0F);
        this.rightarm = new ModelRenderer(this, 80, 46);
        this.rightarm.setRotationPoint(6.0F, 1.7F, 1.9F);
        this.rightarm.addBox(0.0F, 0.0F, 0.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(rightarm, -1.4114477660878142F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 47, 13);
        this.head.setRotationPoint(3.0F, 0.0F, 1.1F);
        this.head.addBox(-2.5F, -8.0F, -2.7F, 5, 8, 5, 0.0F);
        this.leftarm = new ModelRenderer(this, 28, 39);
        this.leftarm.setRotationPoint(0.0F, 1.7F, 1.9F);
        this.leftarm.addBox(-2.0F, 0.0F, 0.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(leftarm, -1.4114477660878142F, 0.0F, 0.0F);
        this.rightbottomleg = new ModelRenderer(this, 80, 103);
        this.rightbottomleg.setRotationPoint(0.0F, 5.0F, 0.3F);
        this.rightbottomleg.addBox(0.0F, 0.0F, 0.0F, 2, 7, 3, 0.0F);
        this.lefttopleg = new ModelRenderer(this, 31, 83);
        this.lefttopleg.setRotationPoint(0.0F, 5.0F, 0.6F);
        this.lefttopleg.addBox(0.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F);
        this.righttopleg = new ModelRenderer(this, 77, 86);
        this.righttopleg.setRotationPoint(4.0F, 5.0F, 0.6F);
        this.righttopleg.addBox(0.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F);
        this.torso = new ModelRenderer(this, 47, 40);
        this.torso.setRotationPoint(-2.9F, -2.0F, -2.0F);
        this.torso.addBox(0.0F, 0.0F, 0.0F, 6, 9, 4, 0.0F);
        this.leftbottomleg = new ModelRenderer(this, 34, 104);
        this.leftbottomleg.setRotationPoint(0.0F, 5.0F, 0.3F);
        this.leftbottomleg.addBox(0.0F, 0.0F, 0.0F, 2, 7, 3, 0.0F);
        this.torso.addChild(this.midsection);
        this.torso.addChild(this.rightarm);
        this.torso.addChild(this.head);
        this.torso.addChild(this.leftarm);
        this.righttopleg.addChild(this.rightbottomleg);
        this.midsection.addChild(this.lefttopleg);
        this.midsection.addChild(this.righttopleg);
        this.lefttopleg.addChild(this.leftbottomleg);
    
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.torso.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        
    	modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    
    }
}
