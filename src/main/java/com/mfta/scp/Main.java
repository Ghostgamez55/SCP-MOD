package com.mfta.scp;

import com.mfta.scp.client.render.RenderBilly;
import com.mfta.scp.init.ModEntities;
import com.mfta.scp.init.entity.EntityBilly;
import com.mfta.scp.init.sounds.ModSounds;
import com.mfta.scp.proxy.CommonProxy;
import com.mfta.scp.util.Reference;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@Mod.Instance(Reference.MOD_ID)
	public static Main instance;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		ModEntities.registerEntity();
		RenderingRegistry.registerEntityRenderingHandler(EntityBilly.class, new RenderBilly.RenderFactory());
	}
	
	@EventHandler
	public static void init(FMLPreInitializationEvent event)
	{
		ModSounds.registerSounds();
	}
	
	@EventHandler
	public static void Postinit(FMLPreInitializationEvent event)
	{
		
	}
	
}
