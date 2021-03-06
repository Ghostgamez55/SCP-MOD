package com.mfta.scp.init;

import java.util.ArrayList;
import java.util.List;

import com.mfta.scp.Reference;
import com.mfta.scp.init.items.ItemFlareGun;
import com.mfta.scp.init.items.ItemHungryBag;
import com.mfta.scp.init.items.ItemSCP;
import com.mfta.scp.init.items.ItemSpecialArmor;
import com.mfta.scp.init.items.ItemStunRod;
import com.mfta.scp.init.items.food.FoodBase;
import com.mfta.scp.init.items.food.FoodEffectBase;
import com.mfta.scp.tabs.SCPTabs;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>(30);
	
	
	public static final ArmorMaterial SCP = EnumHelper.addArmorMaterial("scp", Reference.MOD_ID + ":scp", 33, 
			new int[]{4, 7, 9, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	
	public static final ArmorMaterial HAZMAT = EnumHelper.addArmorMaterial("scp", Reference.MOD_ID + ":scp", 33, 
			new int[]{4, 7, 9, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	
	public static final int SCP_ARMOR = 0, HAZMAT_ARMOR = 1;
	
	
	//bags
	public static final Item HUNGRY_BAG = setUpItem(new ItemHungryBag(), "hungry_bag").setMaxStackSize(1);
	
	//food
	public static final Item MEDKIT = setUpItem(new FoodBase(20, 5f, false), "medkit");
	
	public static final Item INFECTED_BEEF = setUpItem(new FoodEffectBase(0, 0f, false, new PotionEffect(
			MobEffects.HUNGER, (60 * 20), 2, false, true)), "infected_beef");
	
	public static final Item INFECTED_CHICKEN = setUpItem(new FoodEffectBase(0, 0f, false, new PotionEffect(
			MobEffects.HUNGER, (60 * 20), 2, false, true)), "infected_chicken");
	
	public static final Item INFECTED_RABBIT_RAW = setUpItem(new FoodEffectBase(0, 0f, false, new PotionEffect(
			MobEffects.HUNGER, (60 * 20), 2, false, true)), "infected_rabbit_raw");
	
	public static final Item INFECTED_MUTTON = setUpItem(new FoodEffectBase(0, 0f, false, new PotionEffect(
			MobEffects.HUNGER, (60 * 20), 2, false, true)), "infected_mutton");
	
	public static final Item INFECTED_PORKCHOP = setUpItem(new FoodEffectBase(0, 0f, false, new PotionEffect(
			MobEffects.HUNGER, (60 * 20), 2, false, true)), "infected_porkchop");
	
	//items
	public static final Item FLARE_AMMO = setUpItem(new ItemSCP(), "flare_ammo");
	public static final Item FLARE_GUN = setUpItem(new ItemFlareGun(), "flare_gun");
	public static final Item SYRINGE = setUpItem(new ItemSCP(), "syringe");
	public static final Item BLOOD_SYRINGE = setUpItem(new ItemSCP(), "blood_syringe");
	public static final Item INFECTED_BLOOD_SYRINGE = setUpItem(new ItemSCP(), "infected_blood_syringe");
	public static final Item WATER_SYRINGE = setUpItem(new ItemSCP(), "water_syringe");
	
	//ingots
	public static final Item REINFORCED_IRON_INGOT = setUpItem(new ItemSCP(), "reinforced_iron_ingot");
	
	//armor
	public static final Item SCP_ARMOR_HEAD = setUpItem(new ItemSpecialArmor(SCP_ARMOR, SCP, 0, EntityEquipmentSlot.HEAD), "scp_armor_head");
	public static final Item SCP_ARMOR_CHEST = setUpItem(new ItemSpecialArmor(SCP_ARMOR, SCP, 0, EntityEquipmentSlot.CHEST), "scp_armor_chest");
	//Seems like there is no model for these?
//	public static final Item SCP_ARMOR_LEGS = setUpItem(new ItemSpecialArmor(SCP_ARMOR, SCP, 1, EntityEquipmentSlot.LEGS), "scp_armor_legs");
//	public static final Item SCP_ARMOR_BOOTS = setUpItem(new ItemSpecialArmor(SCP_ARMOR, SCP, 0, EntityEquipmentSlot.FEET), "scp_armor_boots");
	
	public static final Item HAZMAT_HEAD = setUpItem(new ItemSpecialArmor(HAZMAT_ARMOR, HAZMAT, 0, EntityEquipmentSlot.HEAD), "hazmat_head");
	public static final Item HAZMAT_CHEST = setUpItem(new ItemSpecialArmor(HAZMAT_ARMOR, HAZMAT, 0, EntityEquipmentSlot.CHEST), "hazmat_chest");
	public static final Item HAZMAT_LEGS = setUpItem(new ItemSpecialArmor(HAZMAT_ARMOR, HAZMAT, 1, EntityEquipmentSlot.LEGS), "hazmat_legs");
	public static final Item HATMAT_BOOTS = setUpItem(new ItemSpecialArmor(HAZMAT_ARMOR, HAZMAT, 0, EntityEquipmentSlot.FEET), "hazmat_boots");
	
	public static final Item STUN_ROD = setUpItem(new ItemStunRod(), "stun_rod");

	
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
		item.setTranslationKey(name);
		item.setCreativeTab(SCPTabs.SCP_TAB_ITEMS);
		
		ITEMS.add(item);
		
		return item;
	
	}
	
}

