package com.mfta.scp.init.dimension.world.gen;

import com.mfta.scp.init.dimension.world.chunk.ChunkGeneratorPocketDimension;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.ChunkGeneratorEnd;
import net.minecraft.world.gen.structure.MapGenStructure;
import net.minecraft.world.gen.structure.StructureStart;

public class MapGenPocketDimension extends MapGenStructure {
	
	private final ChunkGeneratorPocketDimension dimProvider;
	
	public MapGenPocketDimension(ChunkGeneratorPocketDimension dimProviderIn) {
		this.dimProvider = dimProviderIn;
	}

	@Override
	public String getStructureName() {
		return "Pocket Dimension";
	}

	@Override
	public BlockPos getNearestStructurePos(World worldIn, BlockPos pos, boolean findUnexplored) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean canSpawnStructureAtCoords(int chunkX, int chunkZ) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected StructureStart getStructureStart(int chunkX, int chunkZ) {
		// TODO Auto-generated method stub
		return null;
	}

}
