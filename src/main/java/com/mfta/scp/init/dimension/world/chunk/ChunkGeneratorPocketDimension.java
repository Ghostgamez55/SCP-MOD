package com.mfta.scp.init.dimension.world.chunk;

import java.util.List;
import java.util.Random;

import com.mfta.scp.init.ModBlocks;
import com.mfta.scp.init.dimension.world.gen.MapGenPocketDimension;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.NoiseGeneratorSimplex;
import net.minecraft.world.gen.feature.WorldGenEndIsland;

/**
 * Chunk generator for SCP-106s pocket dimension. Needs work
 * @author Elisis
 * @since 2/01/2019
 *
 */
public class ChunkGeneratorPocketDimension implements IChunkGenerator {
	
	private final Random rand;
    
	protected static final IBlockState DECAYED_STONE = ModBlocks.DECAYED_STONE.getDefaultState();
    protected static final IBlockState AIR = Blocks.AIR.getDefaultState();
    
    private NoiseGeneratorOctaves lperlinNoise1;
    private NoiseGeneratorOctaves lperlinNoise2;
    private NoiseGeneratorOctaves perlinNoise1;
    
    /** A NoiseGeneratorOctaves used in generating terrain */
    public NoiseGeneratorOctaves noiseGen5;
    
    /** A NoiseGeneratorOctaves used in generating terrain */
    public NoiseGeneratorOctaves noiseGen6;
    
    /** Reference to the World object. */
    private final World world;
    
    /** are map structures going to be generated (e.g. strongholds) */
    private final boolean mapFeaturesEnabled;
    private final BlockPos spawnPoint;
    private MapGenPocketDimension endCityGen = new MapGenPocketDimension(this);
    private NoiseGeneratorSimplex ambientNoise;
   
    private double[] buffer;
    
    /** The biomes that are used to generate the chunk */
    private Biome[] biomesForGeneration;
    double[] pnr;
    double[] ar;
    double[] br;
    
    private final WorldGenEndIsland endIslands = new WorldGenEndIsland();
   
    // temporary variables used during event handling
    private int chunkX = 0;
    private int chunkZ = 0;
    
	@Override
	public Chunk generateChunk(int x, int z) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void populate(int x, int z) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean generateStructures(Chunk chunkIn, int x, int z) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<SpawnListEntry> getPossibleCreatures(EnumCreatureType creatureType, BlockPos pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BlockPos getNearestStructurePos(World worldIn, String structureName, BlockPos position,
			boolean findUnexplored) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void recreateStructures(Chunk chunkIn, int x, int z) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isInsideStructure(World worldIn, String structureName, BlockPos pos) {
		// TODO Auto-generated method stub
		return false;
	}

}
