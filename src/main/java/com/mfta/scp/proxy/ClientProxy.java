package com.mfta.scp.proxy;

import com.mfta.scp.client.render.RenderBigFoot;
import com.mfta.scp.client.render.RenderBilly;
import com.mfta.scp.client.render.RenderFlareProjectile;
import com.mfta.scp.init.entity.EntityBigFoot;
import com.mfta.scp.init.entity.EntityBilly;
import com.mfta.scp.init.entity.projectiles.EntityFlare;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityBigFoot.class, new RenderBigFoot.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityBilly.class, new RenderBilly.RenderFactory());
		RenderingRegistry.registerEntityRenderingHandler(EntityFlare.class, RenderFlareProjectile::new);
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
		
	}
}