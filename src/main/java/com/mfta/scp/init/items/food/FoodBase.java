package com.mfta.scp.init.items.food;

import com.mfta.scp.tabs.SCPTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FoodBase extends ItemFood {
	
	public FoodBase(int amount, float saturation, boolean isAnimalFood) {
		
		super(amount, saturation, isAnimalFood);
		
		setCreativeTab(SCPTabs.SCP_TAB_ITEMS);
	
	}
	
}
