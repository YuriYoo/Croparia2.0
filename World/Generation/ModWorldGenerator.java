package com.croparia.mod.World.Generation;

import java.util.Random;

import com.croparia.mod.Config.ConfigInit;
import com.croparia.mod.Init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGenerator implements IWorldGenerator {

	private WorldGenerator gen_apricot;
	private WorldGenerator gen_banana;
	private WorldGenerator gen_cherry;
	private WorldGenerator gen_kiwi;
	private WorldGenerator gen_lemon;
	private WorldGenerator gen_orange;
	private WorldGenerator gen_pear;
	private WorldGenerator gen_coalcrop;
	private WorldGenerator gen_poisonous_icy_plant;
	private WorldGenerator gen_water_gem_ore;
	private WorldGenerator gen_fired_obsidian_ground;
	private WorldGenerator gen_fire_gem_ore;
	private WorldGenerator gen_earth_gem_ore;
	private WorldGenerator gen_air_gem_ore;
	private WorldGenerator gen_bounce_cloud;
	
	public ModWorldGenerator()
	{
		this.gen_apricot = new WorldGenMinable(ModBlocks.APRICOT_PLANT.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.TALLGRASS));
		this.gen_banana = new WorldGenMinable(ModBlocks.BANANA_PLANT.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.TALLGRASS));
		this.gen_cherry = new WorldGenMinable(ModBlocks.CHERRY_PLANT.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.TALLGRASS));
		this.gen_kiwi = new WorldGenMinable(ModBlocks.KIWI_PLANT.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.TALLGRASS));
		this.gen_lemon = new WorldGenMinable(ModBlocks.LEMON_PLANT.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.TALLGRASS));
		this.gen_orange = new WorldGenMinable(ModBlocks.ORANGE_PLANT.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.TALLGRASS));
		this.gen_pear = new WorldGenMinable(ModBlocks.PEAR_PLANT.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.TALLGRASS));
		this.gen_coalcrop = new WorldGenMinable(ModBlocks.COAL_CROP.getStateFromMeta(3), 5, BlockMatcher.forBlock(Blocks.TALLGRASS));	
		this.gen_poisonous_icy_plant = new WorldGenMinable(ModBlocks.POISONOUS_ICY_PLANT.getDefaultState(), 9, BlockMatcher.forBlock(ModBlocks.ICY_PLANT));
		this.gen_fired_obsidian_ground = new WorldGenMinable(ModBlocks.FIRED_OBSIDIAN_GROUND.getDefaultState(), 9, BlockMatcher.forBlock(ModBlocks.OBSIDIAN_GROUND));
		this.gen_water_gem_ore = new WorldGenMinable(ModBlocks.WATER_GEM_ORE.getDefaultState(), 3, BlockMatcher.forBlock(Blocks.PACKED_ICE));
		this.gen_fire_gem_ore = new WorldGenMinable(ModBlocks.FIRE_GEM_ORE.getDefaultState(), 3, BlockMatcher.forBlock(Blocks.MAGMA));
		this.gen_earth_gem_ore = new WorldGenMinable(ModBlocks.EARTH_GEM_ORE.getDefaultState(), 3, BlockMatcher.forBlock(Blocks.DIRT));
		this.gen_air_gem_ore = new WorldGenMinable(ModBlocks.AIR_GEM_ORE.getDefaultState(), 3, BlockMatcher.forBlock(ModBlocks.CLOUD));
		this.gen_bounce_cloud = new WorldGenMinable(ModBlocks.BOUNCE_CLOUD.getDefaultState(), 3, BlockMatcher.forBlock(ModBlocks.CLOUD));
		
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		int blockX = chunkX * 16;
		int blockZ = chunkZ * 16;
		
		switch(world.provider.getDimension())
		{
		case 0 : //OverWorld
			this.runGenerator(this.gen_apricot, world, random, chunkX, chunkZ, ConfigInit.fruitGenChance, Blocks.GRASS);
			this.runGenerator(this.gen_banana, world, random, chunkX, chunkZ, ConfigInit.fruitGenChance, Blocks.GRASS);
			this.runGenerator(this.gen_cherry, world, random, chunkX, chunkZ, ConfigInit.fruitGenChance, Blocks.GRASS);
			this.runGenerator(this.gen_kiwi, world, random, chunkX, chunkZ, ConfigInit.fruitGenChance, Blocks.GRASS);
			this.runGenerator(this.gen_lemon, world, random, chunkX, chunkZ, ConfigInit.fruitGenChance, Blocks.GRASS);
			this.runGenerator(this.gen_orange, world, random, chunkX, chunkZ, ConfigInit.fruitGenChance, Blocks.GRASS);
			this.runGenerator(this.gen_pear, world, random, chunkX, chunkZ, ConfigInit.fruitGenChance, Blocks.GRASS);
			this.runGenerator(this.gen_coalcrop, world, random, chunkX, chunkZ, ConfigInit.coalGenChance, Blocks.GRASS);
			break;
		case 1 : //Nether			
			break;
		case 5: 
			StructureWorldGen.generateWater(world, random, blockX + 8, blockZ + 8);
			this.runGenerator(this.gen_poisonous_icy_plant, world, random, chunkX, chunkZ, ConfigInit.poisonousIcyPlantGen, Blocks.PACKED_ICE);
			this.runGenerator(this.gen_water_gem_ore, world, random, chunkX, chunkZ, ConfigInit.waterGemOreGen, 0, 128);
			break;
		case 6:
			this.runGenerator(this.gen_fired_obsidian_ground, world, random, chunkX, chunkZ, ConfigInit.firedObsidianGroundGen, Blocks.MAGMA);
			this.runGenerator(this.gen_fire_gem_ore, world, random, chunkX, chunkZ, ConfigInit.fireGemOreGen, 0, 128);
			break;
		case 7:
			this.runGenerator(this.gen_earth_gem_ore, world, random, chunkX, chunkZ, ConfigInit.earthGemOreGen, 0, 128);
			break;
		case 8:
			this.runGenerator(this.gen_bounce_cloud, world, random, chunkX, chunkZ, ConfigInit.bounceCloudGen, ModBlocks.CLOUD);
			this.runGenerator(this.gen_air_gem_ore, world, random, chunkX, chunkZ, ConfigInit.airGemOreGen, 0, 128);
			break;
		case -1 : // End			
			break;
		}
	} 
	
	private void runGenerator(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int chancesToSpawn, int minHeight, int maxHeight)
	{
		if(minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
		{
			throw new IllegalArgumentException("Illegal Height Argument For WorldGenerator");
		}
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chancesToSpawn; i++)
		{
			int x = chunkX * 16 + random.nextInt(16);
			int y  = minHeight + random.nextInt(heightDiff);
			int z = chunkZ * 16 + random.nextInt(16);
			generator.generate(world, random, new BlockPos(x, y, z));
		}
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int chancesToSpawn, Block topblock)
	{
		for(int i = 0; i < chancesToSpawn; i++)
		{
			int x = chunkX * 16 + random.nextInt(16);
			int z = chunkZ * 16 + random.nextInt(16);
			int y = calculateGenerationHeight(world, x, z, topblock);
			generator.generate(world, random, new BlockPos(x, y, z));
		}
	}
	
	private static int calculateGenerationHeight(World world, int x, int z, Block topBlock)
	{
		int y = world.getHeight();
		boolean foundGround = false;
		
		while(!foundGround && y-- >= 0)
		{
			Block block = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			foundGround = block == topBlock;
		}
		
		return y;
	}
}
