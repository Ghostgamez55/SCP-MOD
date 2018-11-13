package com.mfta.scp.tabs;

import com.mfta.scp.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ScpModTab extends CreativeTabs 
{
	public ScpModTab(String label) { super("scpmodtab");
    this.setBackgroundImageName("scpmodtab.png"); }
	public ItemStack getTabIconItem() {return new ItemStack(Item.getItemFromBlock(ModBlocks.factory_block));}
		
}