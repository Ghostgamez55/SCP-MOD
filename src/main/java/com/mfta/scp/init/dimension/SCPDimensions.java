package com.mfta.scp.init.dimension;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class SCPDimensions {
	
	public static final int DIM_GAS_ID = 666;//TODO - Make confirgurable
	public static DimensionType DIM_GAS;
	
	public static void init() {
		DIM_GAS = DimensionType.register("GAS", "_gas", DIM_GAS_ID, WorldProviderGas.class, false);
		DimensionManager.registerDimension(DIM_GAS_ID, DIM_GAS);
	}
	
}
