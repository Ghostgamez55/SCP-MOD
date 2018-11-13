package com.mfta.scp.proxy;

import com.mfta.scp.init.ModBlocks;
import com.mfta.scp.init.ModEntities;
import com.mfta.scp.init.ModItems;
import com.mfta.scp.init.sounds.ModSounds;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public enum GUI{
		
		;
		
		public final int id;
		
		GUI(){
			this.id = getNextId();
		}

		static int count = 0;

		private static int getNextId(){
			return count++;
		}
	}
	
    public ModelBiped getArmorModel(ItemStack armorItem, int id) {
		return null;
	}
	
	public void preInit(FMLPreInitializationEvent event)
	{	
		ModBlocks.registerBlocks();
		ModItems.registerItems();
		ModEntities.registerEntity();
	}
	
	public void init(FMLInitializationEvent event) {		
		ModSounds.registerSounds();
	}
	
	public void postInit(FMLPostInitializationEvent event) {

	}
	
	public void registerRenders() {}
}
