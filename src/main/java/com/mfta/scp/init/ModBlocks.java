package com.mfta.scp.init;

import com.mfta.scp.Reference;
import com.mfta.scp.init.blocks.BlockConcrete;
import com.mfta.scp.init.blocks.BlockSCP;
import com.mfta.scp.tabs.SCPTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber
public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ROUGH_CONCRETE = setUpBlock(new BlockConcrete(Material.CLAY), "rough_concrete");
	public static final Block CONCRETE = setUpBlock(new BlockConcrete(Material.CLAY), "concrete");
	public static final Block DARK_CONCRETE = setUpBlock(new BlockConcrete(Material.CLAY), "dark_concrete");
	public static final Block BRIEFCASE_OPEN = setUpBlock(new BlockSCP(Material.ANVIL), "briefcase_open");
	public static final Block BRIEFCASE_CLOSED = setUpBlock(new BlockSCP(Material.ANVIL), "briefcase_closed");
	public static final Block BLACK_AND_WHITE_TILE = setUpBlock(new BlockSCP(Material.ROCK), "black_and_white_tile");
	public static final Block FACTORY_BLOCK_FULL = setUpBlock(new BlockSCP(Material.ANVIL), "factory_block_full");
	public static final Block FACTORY_BLOCK = setUpBlock(new BlockSCP(Material.ANVIL), "factory_block");
	
	public static final Block STONE_TOILET = setUpBlock(new BlockSCP(Material.ANVIL), "stone_toilet");
	public static final Block MARBLE_SHELF = setUpBlock(new BlockSCP(Material.ANVIL), "marble_shelf");
	public static final Block HANGING_LAMP = setUpBlock(new BlockSCP(Material.ANVIL), "hanging_lamp").setLightLevel(1.0F);
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> e) {
		e.getRegistry().registerAll(BLOCKS.toArray(new Block[BLOCKS.size()]));
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent e) {
		for(Block itm : BLOCKS) {
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(itm), 0, new ModelResourceLocation(itm.getRegistryName(), "inventory"));
		}
	}
	
	private static Block setUpBlock(Block block, String name) {
		block.setRegistryName(Reference.MOD_ID, name);
		block.setTranslationKey(name);
		block.setCreativeTab(SCPTabs.SCP_TAB);
		BLOCKS.add(block);
		ModItems.ITEMS.add(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		return block;
	}
}
