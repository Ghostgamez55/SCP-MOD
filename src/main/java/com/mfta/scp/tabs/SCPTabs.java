package com.mfta.scp.tabs;

import com.mfta.scp.init.ModBlocks;
import com.mfta.scp.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SCPTabs
{
	
	public static CreativeTabs SCP_TAB_BLOCKS = new CreativeTabs("scptabblocks") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Item.getItemFromBlock(ModBlocks.FACTORY_BLOCK));
		}
		
		@Override
		public CreativeTabs setBackgroundImageName(String texture) {
			return super.setBackgroundImageName("scpmodtab.png");
		}
	};
	
	public static CreativeTabs SCP_TAB_ITEMS = new CreativeTabs("scptabitems") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Item.getItemFromBlock(ModBlocks.FACTORY_BLOCK));
		}
		
		@Override
		public CreativeTabs setBackgroundImageName(String texture) {
			return super.setBackgroundImageName("scpmodtab.png");
		}
	};
	
	public static CreativeTabs SCP_TAB_MISCELLANEOUS = new CreativeTabs("scptabmiscellaneous") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Item.getItemFromBlock(ModBlocks.FACTORY_BLOCK));
		}
		
		@Override
		public CreativeTabs setBackgroundImageName(String texture) {
			return super.setBackgroundImageName("scpmodtab.png");
		}
	};
	
}