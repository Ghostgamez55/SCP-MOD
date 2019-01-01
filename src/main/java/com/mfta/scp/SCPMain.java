package com.mfta.scp;

import java.rmi.registry.RegistryHandler;
import java.util.logging.Logger;

import com.mfta.scp.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, dependencies = "before:guideapi") //<- This is needed, please don't delete
public class SCPMain {
	
	public static final Logger logger = Logger.getLogger(SCPMain.class.getName());

	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@Mod.Instance(Reference.MOD_ID)
	public static SCPMain instance;
	
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		
		proxy.preInit(event);
		proxy.registerRenders();
	
	}

	@EventHandler
	public static void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
	
}
