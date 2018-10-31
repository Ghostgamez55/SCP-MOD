package com.mfta.scp.init;

import java.util.ArrayList;
import java.util.List;

import com.mfta.scp.blocks.BlockBase;
import com.mfta.scp.blocks.Concrete;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block ROUGH_CONCRETE = new Concrete("rough_concrete", Material.CLAY);
	public static final Block CONCRETE = new Concrete("concrete", Material.CLAY);
	public static final Block DARK_CONCRETE = new Concrete("dark_concrete", Material.CLAY);
	
}
