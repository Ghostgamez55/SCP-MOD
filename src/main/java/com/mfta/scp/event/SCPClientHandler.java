package com.mfta.scp.event;

import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(Side.CLIENT)
public class SCPClientHandler {
	
	@SubscribeEvent
	public static void onGetFogColor(EntityViewRenderEvent.FogColors event) {

	}
}
