package com.mfta.scp.init;

import com.mfta.scp.Reference;
import com.mfta.scp.init.blocks.BlockCoalGenerator;
import com.mfta.scp.init.blocks.BlockConcrete;
import com.mfta.scp.init.blocks.BlockFactoryBlock;
import com.mfta.scp.init.blocks.BlockReinforced;
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
	
	public static final List<Block> BLOCKS = new ArrayList<Block>(25);
	
	//blocks
	public static final Block CONCRETE = setUpBlock(new BlockConcrete(Material.CLAY), "concrete");
	public static final Block DARK_CONCRETE = setUpBlock(new BlockConcrete(Material.CLAY), "dark_concrete");
	public static final Block BRIEFCASE_OPEN = setUpBlock(new BlockSCP(Material.ANVIL), "briefcase_open");
	public static final Block BRIEFCASE_CLOSED = setUpBlock(new BlockSCP(Material.ANVIL), "briefcase_closed");
	public static final Block BLACK_AND_WHITE_TILE = setUpBlock(new BlockSCP(Material.ROCK), "black_and_white_tile");
	public static final Block FACTORY_BLOCK_FULL = setUpBlock(new BlockSCP(Material.ANVIL), "factory_block_full");
	public static final Block FACTORY_BLOCK = setUpBlock(new BlockFactoryBlock(), "factory_block");
	public static final Block CONCRETE_BRICK = setUpBlock(new BlockFactoryBlock(), "concrete_brick");
	public static final Block DARK_CONCRETE_BRICK = setUpBlock(new BlockFactoryBlock(), "dark_concrete_brick");
	public static final Block REINFORCED_IRON_BLOCK = setUpBlock(new BlockReinforced(Material.ANVIL), "reinforced_iron_block");
	
	//generators
	public static final Block COAL_GENERATOR =  setUpBlock(new BlockCoalGenerator(Material.ANVIL), "coal_generator");

	
	
	//3d model blocks
	public static final Block STONE_TOILET = setUpBlock(new BlockSCP(Material.ANVIL), "stone_toilet");
	public static final Block MARBLE_SHELF = setUpBlock(new BlockSCP(Material.ANVIL), "marble_shelf");
	public static final Block HANGING_LAMP = setUpBlock(new BlockSCP(Material.ANVIL), "hanging_lamp").setLightLevel(1.0F);
	public static final Block SMALL_LAMP = setUpBlock(new BlockSCP(Material.ANVIL), "small_lamp").setLightLevel(1.0F);
	public static final Block ANTIQUE_CUP = setUpBlock(new BlockSCP(Material.ANVIL), "antique_cup");
	public static final Block ANTIQUE_TABLE = setUpBlock(new BlockSCP(Material.ANVIL), "antique_table");
	public static final Block ANTIQUECHAIR = setUpBlock(new BlockSCP(Material.ANVIL), "antiquechair");
	public static final Block ANTIQUEWARDORBE = setUpBlock(new BlockSCP(Material.ANVIL), "antiquewardrobe");
	public static final Block ANTIQUEDRAWER = setUpBlock(new BlockSCP(Material.ANVIL), "antiquedrawer");
	
	//TODO THIS WILL NEED A TILE, IT PLAYS AUDIO AND DOES A LOT MORE THAN JUST SIT THERE
	public static final Block RADIO = setUpBlock(new BlockSCP(Material.ANVIL), "radio");
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> e) {
		
		e.getRegistry().registerAll(BLOCKS.toArray(new Block[BLOCKS.size()]));
	
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent e) {
		
		for(Block itm : BLOCKS) {
			
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(itm), 0,
						new ModelResourceLocation(itm.getRegistryName(), "inventory"));
		
		}
	}
	
	private static Block setUpBlock(Block block, String name) {
		
		block.setRegistryName(Reference.MOD_ID, name);
		block.setTranslationKey(name);
		block.setCreativeTab(SCPTabs.SCP_TAB_BLOCKS);
		block.setTranslationKey(name);
		block.setCreativeTab(SCPTabs.SCP_TAB_BLOCKS);
		
		BLOCKS.add(block);
		ModItems.ITEMS.add(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		
		return block;
	
	}
}
