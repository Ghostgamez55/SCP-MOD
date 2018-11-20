package com.mfta.scp.init.blocks;

import com.mfta.scp.tabs.SCPTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;

public class BlockSCP extends Block {
	
	public BlockSCP(Material material) {
		super(material);
		setCreativeTab(SCPTabs.SCP_TAB_BLOCKS);
	}

	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
}
