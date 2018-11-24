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
	public String getSaveFolder() {
		return "pocketdim";
	}

}
