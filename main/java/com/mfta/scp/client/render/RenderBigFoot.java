package com.mfta.scp.client.render;

import com.mfta.scp.Reference;
import com.mfta.scp.client.model.ModelBigfoot;
import com.mfta.scp.init.entity.EntityBigFoot;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderBigFoot extends RenderLiving<EntityBigFoot>
{
	public static final ResourceLocation NORMAL = new ResourceLocation(Reference.MOD_ID, "textures/entity/bigfoot.png");

    public RenderBigFoot(RenderManager m)
    {
        super(m, new ModelBigfoot(), 0.6F);
    }
    
    protected ResourceLocation getEntityTexture(EntityBigFoot entity)
    {
    	return NORMAL;
    }
    
	public static class RenderFactory implements IRenderFactory<EntityBigFoot>{
		@Override
		public Render<? super EntityBigFoot> createRenderFor(RenderManager manager) {
			return new RenderBigFoot(manager);
		}
	}
}