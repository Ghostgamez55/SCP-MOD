package com.mfta.scp.init.blocks;

import com.mfta.scp.tabs.SCPTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;

public class BlockFactoryBlock extends BlockSCP {

	public BlockFactoryBlock(String name) {
		
		super(Material.ANVIL, name);		
		
		this.translucent = true;
	
	}
	
	public BlockRenderLayer getRenderLayer() {
		return BlockRenderLayer.CUTOUT;
	}
	
	@Override
	public boolean isTranslucent(IBlockState state) {
		return true;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

}
