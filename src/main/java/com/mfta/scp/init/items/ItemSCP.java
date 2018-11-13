package com.mfta.scp.init.items;

import com.mfta.scp.SCPMain;
import com.mfta.scp.init.ModItems;

import net.minecraft.item.Item;

public class ItemSCP extends Item {

	public ItemSCP(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(SCPMain.SCPTAB);
		ModItems.ITEMS.add(this);
	}

}
