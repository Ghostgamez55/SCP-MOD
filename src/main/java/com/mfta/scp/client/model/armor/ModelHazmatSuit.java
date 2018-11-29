package com.mfta.scp.client.model.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHazmatSuit extends ModelBiped {
    public ModelRenderer Head1;
    public ModelRenderer Head2;
    public ModelRenderer Foot1;
    public ModelRenderer Foot2;
    public ModelRenderer Foot3;
    public ModelRenderer Foot4;
    public ModelRenderer Body1;
    public ModelRenderer Body2;
    public ModelRenderer Body3;
    public ModelRenderer Legs1;
    public ModelRenderer Legs2;
    public ModelRenderer Legs3;
    public ModelRenderer Body4;
    public ModelRenderer Body5;

    public ModelHazmatSuit() {
        this.textureWidth = 64;
        this.textureHeight = 128;
        this.Head1 = new ModelRenderer(this, 0, 0);
        this.Head1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head1.addBox(-4.5F, -11.0F, -4.5F, 9, 11, 9, 0.0F);
        this.Foot1 = new ModelRenderer(this, 0, 92);
        this.Foot1.setRotationPoint(-2.0F, 12.0F, 0.0F);
        this.Foot1.addBox(-2.5F, 10.0F, -3.5F, 5, 2, 6, 0.0F);
        this.Legs2 = new ModelRenderer(this, 0, 52);
        this.Legs2.setRotationPoint(-2.0F, 12.0F, 0.0F);
        this.Legs2.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 4, 0.0F);
        this.Legs3 = new ModelRenderer(this, 0, 52);
        this.Legs3.mirror = true;
        this.Legs3.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.Legs3.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 4, 0.0F);
        this.Body1 = new ModelRenderer(this, 0, 20);
        this.Body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body1.addBox(-4.5F, 0.0F, -2.5F, 9, 13, 5, 0.0F);
        this.Head2 = new ModelRenderer(this, 38, 0);
        this.Head2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head2.addBox(-3.5F, -0.1F, -3.0F, 7, 8, 6, 0.0F);
        this.Foot3 = new ModelRenderer(this, 0, 84);
        this.Foot3.setRotationPoint(-2.0F, 12.0F, 0.0F);
        this.Foot3.addBox(-2.0F, 6.0F, -2.0F, 4, 4, 4, 0.0F);
        this.Body3 = new ModelRenderer(this, 44, 37);
        this.Body3.mirror = true;
        this.Body3.setRotationPoint(6.0F, 2.0F, 0.0F);
        this.Body3.addBox(-1.5F, -2.0F, -2.5F, 5, 10, 5, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.0F, -0.17453292519943295F);
        this.Foot2 = new ModelRenderer(this, 0, 92);
        this.Foot2.mirror = true;
        this.Foot2.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.Foot2.addBox(-2.5F, 10.0F, -3.5F, 5, 2, 6, 0.0F);
        this.Legs1 = new ModelRenderer(this, 0, 76);
        this.Legs1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Legs1.addBox(-4.0F, 8.0F, -2.0F, 8, 4, 4, 0.0F);
        this.Body4 = new ModelRenderer(this, 0, 45);
        this.Body4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body4.addBox(-3.0F, 8.0F, -2.0F, 4, 3, 4, 0.0F);
        this.Foot4 = new ModelRenderer(this, 0, 84);
        this.Foot4.mirror = true;
        this.Foot4.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.Foot4.addBox(-2.0F, 6.0F, -2.0F, 4, 4, 4, 0.0F);
        this.Body2 = new ModelRenderer(this, 44, 37);
        this.Body2.setRotationPoint(-6.0F, 2.0F, 0.0F);
        this.Body2.addBox(-3.5F, -2.0F, -2.5F, 5, 10, 5, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.0F, 0.17453292519943295F);
        this.Body5 = new ModelRenderer(this, 0, 45);
        this.Body5.mirror = true;
        this.Body5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body5.addBox(-1.0F, 8.0F, -2.0F, 4, 3, 4, 0.0F);
        this.Body2.addChild(this.Body4);
        this.Body3.addChild(this.Body5);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Head1.render(f5);
        this.Foot1.render(f5);
        this.Legs2.render(f5);
        this.Legs3.render(f5);
        this.Body1.render(f5);
        this.Head2.render(f5);
        this.Foot3.render(f5);
        this.Body3.render(f5);
        this.Foot2.render(f5);
        this.Legs1.render(f5);
        this.Foot4.render(f5);
        this.Body2.render(f5);
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
