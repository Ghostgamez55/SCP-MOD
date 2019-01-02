package com.mfta.scp.init.blocks;

import com.mfta.scp.Reference;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockConcrete extends BlockSCP {
	
	public BlockConcrete(Material material, String name) {
		
		super(material, name);
		
		setSoundType(SoundType.STONE);
		setHardness(2.0f);
		setResistance(1.0f);
		setHarvestLevel("pickaxe", 1);
		
		//setLightLevel(0.0f);
		//setLightOpacity(0);
		//setBlockUnbreakable();
	
	}
	
}
