package com.mfta.scp.init.dimension;

import com.mfta.scp.Reference;
import com.mfta.scp.init.dimension.world.WorldProviderGas;
import com.mfta.scp.init.dimension.world.WorldProviderPocket;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class SCPDimensions {
	
	//Gas mask dimension
	public static final int DIM_GAS_ID = 666; //TODO - Make configurable
	public static DimensionType DIM_GAS;
	
	//Radical Larry's dimension
	public static final int DIM_POCKET_ID = 100;
	public static DimensionType DIM_POCKET;
	
	public static void init() {
		
			//DIM_GAS = DimensionType.register(Reference.MOD_ID, "_gas", DIM_GAS_ID, WorldProviderGas.class, false);
			//DimensionManager.registerDimension(DIM_GAS_ID, DIM_GAS);
		
			DIM_POCKET = DimensionType.register(Reference.MOD_ID, "_pocket", DIM_POCKET_ID, WorldProviderPocket.class, false);
			DimensionManager.registerDimension(DIM_POCKET_ID, DIM_POCKET);
	}
	
}
