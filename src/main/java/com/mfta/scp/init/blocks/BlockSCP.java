package com.mfta.scp.init.blocks;

import com.mfta.scp.Reference;
import com.mfta.scp.init.ModBlocks;
import com.mfta.scp.init.ModItems;
import com.mfta.scp.tabs.SCPTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockSCP extends Block {
	
	public BlockSCP(Material material, String name) {
		
		super(material);
		
		this.setRegistryName(Reference.MOD_ID, name);
		this.setTranslationKey(name);
		this.setCreativeTab(SCPTabs.SCP_TAB_BLOCKS);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	
	}

	public BlockRenderLayer getRenderLayer() {
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

	public boolean onBlockActivated(World worldIn, BlockPos pos, BlockSCP SCP, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {	
		return false;
	}

	public void breakBlock(World worldIn, BlockPos pos, BlockSCP scp) {
		
	}

	public TileEntity createTileEntity(World world, BlockSCP scp) {
		return null;
	}

	public boolean hasTileEntity(BlockSCP scp) {
		return false;
	}
}
