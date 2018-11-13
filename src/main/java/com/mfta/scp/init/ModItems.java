package com.mfta.scp.init;

import java.util.ArrayList;
import java.util.List;

import com.mfta.scp.SCPMain;
import com.mfta.scp.init.items.ItemHungryBag;
import com.mfta.scp.init.items.ItemSCP;
import com.mfta.scp.proxy.CommonProxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();

	public static final Item HUNGRY_BAG = new ItemHungryBag("hungry_bag");

	public static void registerItems() {
		ForgeRegistries.ITEMS.registerAll(ITEMS.toArray(new Item[ITEMS.size()]));
	}

	public static void registerRenders() {
		for (Item itm : ITEMS) {
			ModelLoader.setCustomModelResourceLocation(itm, 0, new ModelResourceLocation(itm.getRegistryName(), "inventory"));
		}
	}

}
