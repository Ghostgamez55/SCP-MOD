package com.mfta.scp.init.blocks;

import com.mfta.scp.Reference;
import com.mfta.scp.SCPMain;
import com.mfta.scp.tabs.SCPTabs;
import com.mfta.scp.tileentity.TileEntityCoalGenerator;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockCoalGenerator extends BlockSCP
{

	public BlockCoalGenerator(Material material, String name) 
	{
		super(material, name);
		
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, BlockSCP scp, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		if(!worldIn.isRemote)
		{
			playerIn.openGui(SCPMain.instance, Reference.GUI_COAL_GENERATOR, worldIn, pos.getX(), pos.getY() , pos.getZ());
		}
		return true;
	}
	
	@Override
	public boolean hasTileEntity(BlockSCP scp)
	{
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(World world, BlockSCP scp)
	{
		return new TileEntityCoalGenerator();
	}
	
	@Override
	public void breakBlock(World worldIn, BlockPos pos, BlockSCP scp)
	{
		TileEntityCoalGenerator tileentity = (TileEntityCoalGenerator)worldIn.getTileEntity(pos);
		worldIn.spawnEntity(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), tileentity.handler.getStackInSlot(0)));
		super.breakBlock(worldIn, pos, (IBlockState) scp);
	}
}
