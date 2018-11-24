package com.mfta.scp.init.dimension.world;

import com.mfta.scp.init.dimension.SCPDimensions;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;

public class WorldProviderPocket extends WorldProvider {

	@Override
	public DimensionType getDimensionType() {
		return SCPDimensions.DIM_POCKET;
	}
	
	@Override
	public boolean hasSkyLight() {
		return false;
	}
	
	@Override
	public boolean doesWaterVaporize() {
		return true;
	}
	
	@Override
	public String getSaveFolder() {
		return "pocketdim";
	}

}
