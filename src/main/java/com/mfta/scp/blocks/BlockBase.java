package com.mfta.scp.blocks;

import com.mfta.scp.Main;
import com.mfta.scp.init.ModBlocks;
import com.mfta.scp.init.ModItems;
import com.mfta.scp.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	@Override
	public BlockRenderLayer getBlockLayer() 
    {
        return BlockRenderLayer.CUTOUT;
    }

	@Override
    public boolean isOpaqueCube(IBlockState state) 
    {
        return false;
    }
	@Override
    public boolean isFullCube(IBlockState state) 
    {
        return false;
    }
}
