package com.mfta.scp.client.render;

import com.mfta.scp.Reference;
import com.mfta.scp.client.model.ModelBilly;
import com.mfta.scp.init.entity.EntityBilly;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderBilly extends RenderLiving<EntityBilly>
{
	public static final ResourceLocation NORMAL = new ResourceLocation(Reference.MOD_ID, "textures/entity/billy.png");

    public RenderBilly(RenderManager m)
    {
    	super(m, new ModelBilly(), 0.6F);
    }
    
    protected ResourceLocation getEntityTexture(EntityBilly entity)
    {
    	return NORMAL;
    }
    
    public static class RenderFactory implements IRenderFactory<EntityBilly> {
		
    	@Override
		public Render<? super EntityBilly> createRenderFor(RenderManager manager) {
			return new RenderBilly(manager);
		}
	}
}