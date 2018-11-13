package com.mfta.scp.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBilly extends ModelBase {
    public ModelRenderer leftbottomleg;
    public ModelRenderer rightbottomleg;
    public ModelRenderer righttopleg;
    public ModelRenderer lefttopleg;
    public ModelRenderer midsection;
    public ModelRenderer torso;
    public ModelRenderer rightarm;
    public ModelRenderer leftarm;
    public ModelRenderer head;

    public ModelBilly() {
        this.textureWidth = 130;
        this.textureHeight = 130;
        this.leftarm = new ModelRenderer(this, 28, 39);
        this.leftarm.setRotationPoint(-5.0F, 1.1F, 0.0F);
        this.leftarm.addBox(0.0F, 0.0F, 0.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(leftarm, -1.4114477660878142F, 0.0F, 0.0F);
        this.torso = new ModelRenderer(this, 47, 40);
        this.torso.setRotationPoint(-3.0F, 0.0F, -1.2F);
        this.torso.addBox(0.0F, 0.0F, 0.0F, 6, 9, 4, 0.0F);
        this.righttopleg = new ModelRenderer(this, 77, 86);
        this.righttopleg.setRotationPoint(1.1F, 14.0F, -0.3F);
        this.righttopleg.addBox(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F);
        this.rightarm = new ModelRenderer(this, 80, 46);
        this.rightarm.setRotationPoint(3.0F, 1.1F, 0.6F);
        this.rightarm.addBox(0.0F, 0.0F, 0.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(rightarm, -1.4114477660878142F, 0.0F, 0.0F);
        this.midsection = new ModelRenderer(this, 48, 62);
        this.midsection.setRotationPoint(-3.0F, 9.0F, -0.9F);
        this.midsection.addBox(0.0F, 0.0F, 0.0F, 6, 5, 4, 0.0F);
        this.head = new ModelRenderer(this, 47, 13);
        this.head.setRotationPoint(-2.5F, -8.0F, -2.7F);
        this.head.addBox(0.0F, 0.0F, 0.0F, 5, 8, 5, 0.0F);
        this.lefttopleg = new ModelRenderer(this, 31, 83);
        this.lefttopleg.setRotationPoint(-3.0F, 14.0F, -0.3F);
        this.lefttopleg.addBox(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F);
        this.leftbottomleg = new ModelRenderer(this, 34, 104);
        this.leftbottomleg.setRotationPoint(-3.0F, 17.0F, 0.0F);
        this.leftbottomleg.addBox(0.0F, 0.0F, 0.0F, 2, 7, 3, 0.0F);
        this.rightbottomleg = new ModelRenderer(this, 80, 103);
        this.rightbottomleg.setRotationPoint(1.0F, 17.0F, 0.0F);
        this.rightbottomleg.addBox(0.0F, 0.0F, 0.0F, 2, 7, 3, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.leftarm.render(f5);
        this.torso.render(f5);
        this.righttopleg.render(f5);
        this.rightarm.render(f5);
        this.midsection.render(f5);
        this.head.render(f5);
        this.lefttopleg.render(f5);
        this.leftbottomleg.render(f5);
        this.rightbottomleg.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
