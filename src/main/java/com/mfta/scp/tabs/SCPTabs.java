package com.mfta.scp.tabs;

import com.mfta.scp.init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SCPTabs {
	
	public static CreativeTabs SCP_TAB = new CreativeTabs("scpmodtab") {
		
		@Override
		public CreativeTabs setBackgroundImageName(String texture) {
			return super.setBackgroundImageName("scpmodtab.png");
		}
		
		@Override
		public ItemStack createIcon() {
			return new ItemStack(Item.getItemFromBlock(ModBlocks.FACTORY_BLOCK));
		}
	};
	
}