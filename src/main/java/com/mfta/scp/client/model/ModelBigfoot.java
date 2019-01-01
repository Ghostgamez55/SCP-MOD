package com.mfta.scp.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * SCP 128 - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelBigfoot extends ModelBase {
    
	public ModelRenderer maintorso;
    public ModelRenderer midsection;
    public ModelRenderer waist;
    public ModelRenderer head;
    
    public ModelRenderer leftpeck;
    public ModelRenderer rightpeck;
    
    public ModelRenderer leftshoulder;
    public ModelRenderer rightshoulder;
    
    public ModelRenderer topleftleg;
    public ModelRenderer righttopleg;
    public ModelRenderer rightbottomleg;
    public ModelRenderer bottomleg;
    
    public ModelRenderer leftfoot;
    public ModelRenderer rightfoot;
    
    public ModelRenderer leftarm;
    public ModelRenderer rightarm;
    
    public ModelRenderer shape18;
    public ModelRenderer shape18_1;

    public ModelBigfoot() {
        
    	this.textureWidth = 130;
        this.textureHeight = 130;
        this.shape18_1 = new ModelRenderer(this, 69, 108);
        this.shape18_1.setRotationPoint(0.0F, 13.9F, 0.0F);
        this.shape18_1.addBox(0.0F, 0.0F, 0.0F, 4, 2, 4, 0.0F);
        this.rightpeck = new ModelRenderer(this, 28, 13);
        this.rightpeck.setRotationPoint(5.7F, 0.6F, -1.0F);
        this.rightpeck.addBox(0.0F, 0.0F, 0.0F, 5, 5, 1, 0.0F);
        this.maintorso = new ModelRenderer(this, 48, 41);
        this.maintorso.setRotationPoint(-5.5F, -12.0F, -3.0F);
        this.maintorso.addBox(0.0F, 0.0F, 0.0F, 11, 9, 7, 0.0F);
        this.midsection = new ModelRenderer(this, 49, 65);
        this.midsection.setRotationPoint(0.5F, 9.0F, -0.4F);
        this.midsection.addBox(0.0F, 0.0F, 0.0F, 10, 8, 7, 0.0F);
        this.rightarm = new ModelRenderer(this, 94, 52);
        this.rightarm.setRotationPoint(0.1F, 4.0F, 0.0F);
        this.rightarm.addBox(0.0F, 0.0F, 0.0F, 4, 14, 4, 0.0F);
        this.setRotateAngle(rightarm, 0.0F, 0.0F, -0.091106186954104F);
        this.topleftleg = new ModelRenderer(this, 21, 90);
        this.topleftleg.setRotationPoint(0.2F, 1.0F, 2.0F);
        this.topleftleg.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(topleftleg, 0.0F, 0.0F, 0.27314402793711257F);
        this.waist = new ModelRenderer(this, 51, 90);
        this.waist.setRotationPoint(0.5F, 7.9F, 0.0F);
        this.waist.addBox(0.0F, 0.0F, 0.0F, 9, 2, 7, 0.0F);
        this.leftpeck = new ModelRenderer(this, 10, 14);
        this.leftpeck.setRotationPoint(0.5F, 0.6F, -1.0F);
        this.leftpeck.addBox(0.0F, 0.0F, 0.0F, 5, 5, 1, 0.0F);
        this.leftfoot = new ModelRenderer(this, 3, 118);
        this.leftfoot.setRotationPoint(0.0F, 13.0F, -3.1F);
        this.leftfoot.addBox(0.0F, 0.0F, 0.0F, 4, 1, 7, 0.0F);
        this.rightfoot = new ModelRenderer(this, 73, 121);
        this.rightfoot.setRotationPoint(0.1F, 13.0F, -3.1F);
        this.rightfoot.addBox(0.0F, 0.0F, 0.0F, 4, 1, 7, 0.0F);
        this.leftarm = new ModelRenderer(this, 13, 54);
        this.leftarm.setRotationPoint(-0.1F, 3.7F, 0.0F);
        this.leftarm.addBox(0.0F, 0.0F, 0.0F, 4, 14, 4, 0.0F);
        this.setRotateAngle(leftarm, 0.0F, 0.0F, 0.091106186954104F);
        this.leftshoulder = new ModelRenderer(this, 12, 31);
        this.leftshoulder.setRotationPoint(-4.0F, 0.7F, 1.1F);
        this.leftshoulder.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
        this.rightbottomleg = new ModelRenderer(this, 93, 107);
        this.rightbottomleg.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.rightbottomleg.addBox(0.0F, 0.0F, 0.0F, 4, 13, 4, 0.0F);
        this.setRotateAngle(rightbottomleg, 0.0F, 0.0F, 0.18203784098300857F);
        this.shape18 = new ModelRenderer(this, 49, 118);
        this.shape18.setRotationPoint(0.0F, 14.0F, 0.0F);
        this.shape18.addBox(0.0F, 0.0F, 0.0F, 4, 2, 4, 0.0F);
        this.setRotateAngle(shape18, 0.0F, 0.0F, -0.010471975511965976F);
        this.head = new ModelRenderer(this, 50, 11);
        this.head.setRotationPoint(2.1F, -9.0F, -2.2F);
        this.head.addBox(0.0F, 0.0F, 0.0F, 7, 9, 7, 0.0F);
        this.righttopleg = new ModelRenderer(this, 95, 91);
        this.righttopleg.setRotationPoint(5.2F, 2.0F, 1.9F);
        this.righttopleg.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(righttopleg, 0.0F, 0.0F, -0.22759093446006054F);
        this.rightshoulder = new ModelRenderer(this, 95, 32);
        this.rightshoulder.setRotationPoint(11.0F, 0.4F, 1.2F);
        this.rightshoulder.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
        this.bottomleg = new ModelRenderer(this, 22, 106);
        this.bottomleg.setRotationPoint(0.0F, 4.1F, -0.1F);
        this.bottomleg.addBox(0.0F, 0.0F, 0.0F, 4, 13, 4, 0.0F);
        this.setRotateAngle(bottomleg, 0.0F, -0.045553093477052F, -0.22759093446006054F);
        this.rightarm.addChild(this.shape18_1);
        this.maintorso.addChild(this.rightpeck);
        this.maintorso.addChild(this.midsection);
        this.rightshoulder.addChild(this.rightarm);
        this.waist.addChild(this.topleftleg);
        this.midsection.addChild(this.waist);
        this.maintorso.addChild(this.leftpeck);
        this.bottomleg.addChild(this.leftfoot);
        this.rightbottomleg.addChild(this.rightfoot);
        this.leftshoulder.addChild(this.leftarm);
        this.maintorso.addChild(this.leftshoulder);
        this.righttopleg.addChild(this.rightbottomleg);
        this.leftarm.addChild(this.shape18);
        this.maintorso.addChild(this.head);
        this.waist.addChild(this.righttopleg);
        this.maintorso.addChild(this.rightshoulder);
        this.topleftleg.addChild(this.bottomleg);
    
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.maintorso.render(f5);
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
