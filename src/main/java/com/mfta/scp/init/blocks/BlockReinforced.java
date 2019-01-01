package com.mfta.scp.init.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockReinforced extends BlockSCP {
	
	public BlockReinforced(Material material) {
		
		super(material);
		
		setSoundType(SoundType.STONE);
		setHardness(2.0f);
		setResistance(1.0f);
		setHarvestLevel("pickaxe", 1);
		
		//setLightLevel(0.0f);
		//setLightOpacity(0);
		//setBlockUnbreakable();
	}
	
}
