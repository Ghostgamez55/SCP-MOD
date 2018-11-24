package com.mfta.scp.init.dimension;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;

public class WorldProviderGas extends WorldProvider {
	
	@Override
	public DimensionType getDimensionType() {
		return SCPDimensions.DIM_GAS;
	}
	
	@Override
	public boolean hasSkyLight() {
		return false;
	}
	
	
}
