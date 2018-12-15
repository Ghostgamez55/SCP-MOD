package com.mfta.scp.init.items.book;

import java.awt.Color;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnull;

import com.mfta.scp.Reference;
import com.mfta.scp.init.ModBlocks;
import com.mfta.scp.init.ModItems;
import com.mfta.scp.tabs.SCPTabs;

import amerifrance.guideapi.api.GuideAPI;
import amerifrance.guideapi.api.GuideBook;
import amerifrance.guideapi.api.IGuideBook;
import amerifrance.guideapi.api.IPage;
import amerifrance.guideapi.api.impl.Book;
import amerifrance.guideapi.api.impl.abstraction.CategoryAbstract;
import amerifrance.guideapi.api.impl.abstraction.EntryAbstract;
import amerifrance.guideapi.category.CategoryItemStack;
import amerifrance.guideapi.entry.EntryItemStack;
import amerifrance.guideapi.page.PageText;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@GuideBook
public class SCPGuide implements IGuideBook {

	public static Book guide;
	
	@Nonnull
	@Override
	public Book buildBook() {
		
		//Create map of entries. A LinkedHashMap is used to retain order.
		Map<ResourceLocation, EntryAbstract> entityEntries = new LinkedHashMap<>();
		Map<ResourceLocation, EntryAbstract> itemEntries = new LinkedHashMap<>();
		
		
		//SCP-173 Entry
		List<IPage> pages173 = new ArrayList<>();
		pages173.add(new PageText("lorem ipsum dolor sit amet"));
		entityEntries.put(new ResourceLocation(Reference.MOD_ID, "/book/entry_173"), new EntryItemStack(pages173, "SCP-173", new ItemStack(ModBlocks.CONCRETE)));
		
		//Hungry Bag entry
		List<IPage> pages101 = new ArrayList<>();
		pages101.add(new PageText("lorem ipsum dolor sit amet"));
		itemEntries.put(new ResourceLocation(Reference.MOD_ID, "/book/entry_101"), new EntryItemStack(pages101, "SCP-101", new ItemStack(ModItems.HUNGRY_BAG)));
		
		
		//Setup list of categories and add entries to it.
		List<CategoryAbstract> categories = new ArrayList<>();
		categories.add(new CategoryItemStack(entityEntries, "Entity/Beast SCPs", new ItemStack(ModItems.MEDKIT)));
		categories.add(new CategoryItemStack(itemEntries, "Item SCPs", new ItemStack(ModItems.HUNGRY_BAG)));
		
		
		//Book's base info. I *know* that Book is deprecated, but I can't be bothered to scour the internet for docs. Plus, this won't be removed 'till 1.13.
		guide = new Book();
		guide.setTitle("guide.scpmod.title");
		guide.setDisplayName("guide.scpmod.display");
		guide.setAuthor("guide.scpmod.author");
		guide.setWelcomeMessage("guide.scpmod.welcome");
		guide.setColor(Color.BLACK);
		guide.setCategoryList(categories);
		guide.setRegistryName(new ResourceLocation(Reference.MOD_ID, "scp_guide"));
		guide.setCreativeTab(SCPTabs.SCP_TAB_ITEMS);
		
		return guide;
		
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void handleModel(ItemStack bookStack) {
		
		//Use the default GuideAPI model
		GuideAPI.setModel(guide);
		
	}
	
	/*
	@Override
	public void handlePost(ItemStack bookStack) {
		
		//Register a recipe so players can obtain the book
		//GameRegistry.addShapelessRecipe(null, null, bookStack, new Ingredient(new ItemStack(Items.BOOK), ));
	}
	*/

}
