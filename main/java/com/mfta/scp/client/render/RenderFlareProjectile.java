package com.mfta.scp.client.render;

import com.mfta.scp.init.entity.projectiles.EntityFlare;
import com.mfta.scp.util.RenderHelper;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class RenderFlareProjectile extends Render<EntityFlare> {
	
	public RenderFlareProjectile(RenderManager renderManager) {
		super(renderManager);
	}
	
	@Override
	public void doRenderShadowAndFire(Entity entityIn, double x, double y, double z, float yaw, float partialTicks) {
		
	}
	
	@Override
	public void doRender(EntityFlare entity, double x, double y, double z, float entityYaw, float partialTicks) {
		RenderHelper.setupRenderLightning();
		GlStateManager.translate(x, y, z);
		
		Vec3d vec1 = new Vec3d(entity.lastTickPosX, entity.lastTickPosY, entity.lastTickPosZ);
		Vec3d vec2 = new Vec3d(entity.posX, entity.posY, entity.posZ);
		vec1 = vec2.subtract(vec1);
		vec2 = vec2.subtract(vec2);
		vec1 = vec1.normalize();
		
		double x_ = vec2.x - vec1.x;
		double y_ = vec2.y - vec1.y;
		double z_ = vec2.z - vec1.z;
		double diff = MathHelper.sqrt(x_ * x_ + z_ * z_);
		float yaw = (float) (Math.atan2(z_, x_) * 180.0D / 3.141592653589793D) - 90.0F;
		float pitch = (float) -(Math.atan2(y_, diff) * 180.0D / 3.141592653589793D);
		GlStateManager.rotate(-yaw, 0.0F, 1.0F, 0.0F);
		GlStateManager.rotate(pitch, 1.0F, 0.0F, 0.0F);
		
		RenderHelper.drawGlowingLine(Vec3d.ZERO, new Vec3d(0, 0, 1), 0.5F, entity.color);
		
		RenderHelper.finishRenderLightning();
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityFlare entity) {
		return null;
	}
	
}
