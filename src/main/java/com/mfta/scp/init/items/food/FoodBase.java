package com.mfta.scp.init.items.food;

import com.mfta.scp.init.ModItems;
import com.mfta.scp.tabs.SCPTabs;

import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood 
{
	public FoodBase(String name, int amount, float saturation, boolean isAnimalFood) 
	{
		super(amount, saturation, isAnimalFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(SCPTabs.SCP_TAB_ITEMS);
		
		ModItems.ITEMS.add(this);
		
		
	}

}
