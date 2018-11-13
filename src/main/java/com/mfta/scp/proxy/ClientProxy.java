package com.mfta.scp.proxy;

import com.mfta.scp.client.render.RenderBilly;
import com.mfta.scp.init.ModBlocks;
import com.mfta.scp.init.ModItems;
import com.mfta.scp.init.entity.EntityBilly;

import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenders() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();

		RenderingRegistry.registerEntityRenderingHandler(EntityBilly.class, new RenderBilly.RenderFactory());
	}
}