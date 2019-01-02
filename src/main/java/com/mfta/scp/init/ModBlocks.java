package com.mfta.scp.init;

import java.util.ArrayList;
import java.util.List;

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

@Mod.EventBusSubscriber
public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>(25);
	
	//blocks
	public static final Block CONCRETE = new BlockConcrete(Material.CLAY, "concrete");
	public static final Block DARK_CONCRETE = new BlockConcrete(Material.CLAY, "dark_concrete");
	public static final Block BRIEFCASE_OPEN = new BlockSCP(Material.ANVIL, "briefcase_open");
	public static final Block BRIEFCASE_CLOSED = new BlockSCP(Material.ANVIL, "briefcase_closed");
	public static final Block BLACK_AND_WHITE_TILE = new BlockSCP(Material.ROCK, "black_and_white_tile");
	public static final Block FACTORY_BLOCK_FULL = new BlockSCP(Material.ANVIL, "factory_block_full");
	public static final Block FACTORY_BLOCK = new BlockFactoryBlock("factory_block");
	public static final Block CONCRETE_BRICK = new BlockFactoryBlock("concrete_brick");
	public static final Block DARK_CONCRETE_BRICK = new BlockFactoryBlock("dark_concrete_brick");
	public static final Block REINFORCED_IRON_BLOCK = new BlockReinforced(Material.ANVIL, "reinforced_iron_block");
	public static final Block DECAYED_STONE = new BlockSCP(Material.SNOW, "decayed_stone");
	
	//generators
	public static final Block COAL_GENERATOR =  new BlockCoalGenerator(Material.ANVIL, "coal_generator");

	
	
	//3d model blocks
	public static final Block STONE_TOILET = new BlockSCP(Material.ANVIL, "stone_toilet");
	public static final Block MARBLE_SHELF = new BlockSCP(Material.ANVIL, "marble_shelf");
	public static final Block HANGING_LAMP = new BlockSCP(Material.ANVIL, "hanging_lamp").setLightLevel(1.0F);
	public static final Block SMALL_LAMP = new BlockSCP(Material.ANVIL, "small_lamp").setLightLevel(1.0F);
	public static final Block ANTIQUE_CUP = new BlockSCP(Material.ANVIL, "antique_cup");
	public static final Block ANTIQUE_TABLE = new BlockSCP(Material.ANVIL, "antique_table");
	public static final Block ANTIQUECHAIR = new BlockSCP(Material.ANVIL, "antiquechair");
	public static final Block ANTIQUEWARDORBE = new BlockSCP(Material.ANVIL, "antiquewardrobe");
	public static final Block ANTIQUEDRAWER = new BlockSCP(Material.ANVIL, "antiquedrawer");
	
	//TODO THIS WILL NEED A TILE, IT PLAYS AUDIO AND DOES A LOT MORE THAN JUST SIT THERE
	public static final Block RADIO = new BlockSCP(Material.ANVIL, "radio");
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> e) {
		
		e.getRegistry().registerAll(BLOCKS.toArray(new Block[BLOCKS.size()]));
	
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent e) {
		
		for (Block itm : BLOCKS) {
			
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(itm), 0,
						new ModelResourceLocation(itm.getRegistryName(), "inventory"));
		
		}
	}
	
	/*private static Block setUpBlock(Block block, String name) {
		
		block.setRegistryName(Reference.MOD_ID, name);
		block.setTranslationKey(name);
		block.setCreativeTab(SCPTabs.SCP_TAB_BLOCKS);
		block.setTranslationKey(name);
		block.setCreativeTab(SCPTabs.SCP_TAB_BLOCKS);
		
		BLOCKS.add(block);
		ModItems.ITEMS.add(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		
		return block;
	
	}
	*/ //No longer needed - See above
}
