package com.mfta.scp.init;

import com.mfta.scp.Reference;
import com.mfta.scp.init.items.ItemHungryBag;
import com.mfta.scp.init.items.food.FoodBase;
import com.mfta.scp.init.items.food.FoodEfectBase;
import com.mfta.scp.tabs.SCPTabs;

import net.minecraft.block.Block;
import net.minecraft.client.main.Main;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item HUNGRY_BAG = setUpItem(new ItemHungryBag(), "hungry_bag");
	//food
	public static final Item MEDKIT = new FoodBase("medkit", 20, 5f, false);
	public static final Item INFECTED_BEEF = new FoodEfectBase("infected_beef", 0, 0f, false, new PotionEffect(MobEffects.HUNGER, (60*20), 1, false, true));
	public static final Item INFECTED_CHICKEN = new FoodEfectBase("infected_chicken", 0, 0f, false, new PotionEffect(MobEffects.HUNGER, (60*20), 1, false, true));
	public static final Item INFECTED_RABBIT_RAW = new FoodEfectBase("infected_rabbit_raw", 0, 0f, false, new PotionEffect(MobEffects.HUNGER, (60*20), 1, false, true));
	public static final Item INFECTED_MUTTON = new FoodEfectBase("infected_mutton", 0, 0f, false, new PotionEffect(MobEffects.HUNGER, (60*20), 1, false, true));
	public static final Item INFECTED_PORKCHOP = new FoodEfectBase("infected_porkchop", 0, 0f, false, new PotionEffect(MobEffects.HUNGER, (60*20), 1, false, true));
	
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> e) {
		e.getRegistry().registerAll(ITEMS.toArray(new Item[ITEMS.size()]));
	}
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent e) {
		for (Item itm : ITEMS) {
			ModelLoader.setCustomModelResourceLocation(itm, 0, new ModelResourceLocation(itm.getRegistryName(), "inventory"));
		}
	}
	
	private static Item setUpItem(Item item, String name) {
		item.setRegistryName(Reference.MOD_ID, name);
		item.setUnlocalizedName(name);
		item.setCreativeTab(SCPTabs.SCP_TAB_ITEMS);
		ITEMS.add(item);
		return item;
	}
	
}
