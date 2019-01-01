package com.mfta.scp.proxy;

import com.mfta.scp.SCPMain;
import com.mfta.scp.event.SCPCommonHandler;
import com.mfta.scp.gui.GuiHandler;
import com.mfta.scp.init.ModEntities;
import com.mfta.scp.init.dimension.SCPDimensions;
import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy {
	
	public enum GUI{
		
		HUNGRY_BAG;
		
		public final int id;
		
		GUI() {
			
			this.id = getNextId();
		
		}

		static int count = 0;

		private static int getNextId() {
			return count++;	
		}
	
	}
	
	public ModelBiped getArmorModel(int ID, int type) {
		return null;
	}
	
	public void preInit(FMLPreInitializationEvent event) {
		
		ModEntities.registerEntity();
		MinecraftForge.EVENT_BUS.register(new SCPCommonHandler());
		SCPDimensions.init();
	
	}
	
	public void init(FMLInitializationEvent event) {
		NetworkRegistry.INSTANCE.registerGuiHandler(SCPMain.instance, new GuiHandler());
	}
	
	public void postInit(FMLPostInitializationEvent event) {

	}
	
	public void registerRenders() {}
}
