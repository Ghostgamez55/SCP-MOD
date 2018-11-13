package com.mfta.scp.init;

import java.util.ArrayList;
import java.util.List;

import com.mfta.scp.init.blocks.BlockSCP;
import com.mfta.scp.init.blocks.Concrete;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ROUGH_CONCRETE = new Concrete("rough_concrete", Material.CLAY);
	public static final Block CONCRETE = new Concrete("concrete", Material.CLAY);
	public static final Block DARK_CONCRETE = new Concrete("dark_concrete", Material.CLAY);
	public static final Block BRIEFCASE_OPEN = new BlockSCP("briefcase_open", Material.ANVIL);
	public static final Block BRIEFCASE_CLOSED = new BlockSCP("briefcase_closed", Material.ANVIL);
	public static final Block BLACK_AND_WHITE_TILE = new BlockSCP("black_and_white_tile", Material.ROCK);
	public static final Block FACTORY_BLOCK_FULL = new BlockSCP("factory_block_full", Material.ANVIL);
	public static final Block FACTORY_BLOCK = new BlockSCP("factory_block", Material.ANVIL);
	
	public static void registerBlocks() {
		ForgeRegistries.BLOCKS.registerAll(BLOCKS.toArray(new Block[BLOCKS.size()]));
	}
	
	public static void registerRenders() {
		for(Block itm : BLOCKS) {
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(itm), 0, new ModelResourceLocation(itm.getRegistryName(), "inventory"));
		}
	}
}
