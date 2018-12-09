package com.croparia.mod.World.Generation;

import java.util.Random;

import com.croparia.mod.Structure.WaterDimension.PhutWorldGen;
import com.croparia.mod.Structure.WaterDimension.SchestWorldGen;
import com.croparia.mod.Structure.WaterDimension.ShouseWorldGen;
import com.croparia.mod.Structure.WaterDimension.Stree1WorldGen;
import com.croparia.mod.Structure.WaterDimension.Stree2WorldGen;
import com.croparia.mod.Structure.WaterDimension.Stree3WorldGen;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraftforge.fml.common.IWorldGenerator;

public class StructureWorldGen{

	public static void generateWater(World world, Random rand, int blockX, int blockZ)
	{	
		if ((int) (Math.random() * 300) == 0)
		{
			int y = getGroundFromAbove(world, blockX, blockZ);
			BlockPos pos = new BlockPos(blockX, y, blockZ);
			WorldGenerator structure = new ShouseWorldGen();
			structure.generate(world, rand, pos);
		}	
		if ((int) (Math.random() * 300) == 0)
		{
			int y = getGroundFromAbove(world, blockX, blockZ);
			BlockPos pos = new BlockPos(blockX, y, blockZ);
			WorldGenerator structure1 = new PhutWorldGen();
			structure1.generate(world, rand, pos);
		}	
		if ((int) (Math.random() * 300) == 0)
		{
			int y = getGroundFromAbove(world, blockX, blockZ);
			BlockPos pos = new BlockPos(blockX, y, blockZ);
			WorldGenerator structure1 = new SchestWorldGen();
			structure1.generate(world, rand, pos);
		}	
		if ((int) (Math.random() * 5) == 0)
		{
			int y = getGroundFromAbove(world, blockX, blockZ);
			BlockPos pos = new BlockPos(blockX, y, blockZ);
			WorldGenerator structure1 = new Stree1WorldGen();
			structure1.generate(world, rand, pos);
		}	
		if ((int) (Math.random() * 5) == 0)
		{
			int y = getGroundFromAbove(world, blockX, blockZ);
			BlockPos pos = new BlockPos(blockX, y, blockZ);
			WorldGenerator structure1 = new Stree2WorldGen();
			structure1.generate(world, rand, pos);
		}	
		if ((int) (Math.random() * 5) == 0)
		{
			int y = getGroundFromAbove(world, blockX, blockZ);
			BlockPos pos = new BlockPos(blockX, y, blockZ);
			WorldGenerator structure1 = new Stree3WorldGen();
			structure1.generate(world, rand, pos);
		}
	}
	
/*	private void generateFire(World world, Random rand, int blockX, int blockZ)
	{	
		if ((int) (Math.random() * 5) == 0)
		{
			int y = getGroundFromAbove(world, blockX, blockZ);
			BlockPos pos = new BlockPos(blockX, y, blockZ);
			WorldGenerator structure1 = new Mtree1WorldGen();
			structure1.generate(world, rand, pos);
		}	
		if ((int) (Math.random() * 5) == 0)
		{
			int y = getGroundFromAbove(world, blockX, blockZ);
			BlockPos pos = new BlockPos(blockX, y, blockZ);
			WorldGenerator structure1 = new Mtree2WorldGen();
			structure1.generate(world, rand, pos);
		}	
		if ((int) (Math.random() * 5) == 0)
		{
			int y = getGroundFromAbove(world, blockX, blockZ);
			BlockPos pos = new BlockPos(blockX, y, blockZ);
			WorldGenerator structure1 = new Mtree3WorldGen();
			structure1.generate(world, rand, pos);
		}
		if ((int) (Math.random() * 300) == 0)
		{
			int y = getGroundFromAbove(world, blockX, blockZ);
			BlockPos pos = new BlockPos(blockX, y, blockZ);
			WorldGenerator structure1 = new Mthing1WorldGen();
			structure1.generate(world, rand, pos);
		}		
		if ((int) (Math.random() * 300) == 0)
		{
			int y = getGroundFromAbove(world, blockX, blockZ);
			BlockPos pos = new BlockPos(blockX, y, blockZ);
			WorldGenerator structure1 = new Mthing2WorldGen();
			structure1.generate(world, rand, pos);
		}		
		if ((int) (Math.random() * 300) == 0)
		{
			int y = getGroundFromAbove(world, blockX, blockZ);
			BlockPos pos = new BlockPos(blockX, y, blockZ);
			WorldGenerator structure1 = new Mthing3WorldGen();
			structure1.generate(world, rand, pos);
		}		
		if ((int) (Math.random() * 300) == 0)
		{
			int y = getGroundFromAbove(world, blockX, blockZ);
			BlockPos pos = new BlockPos(blockX, y, blockZ);
			WorldGenerator structure1 = new Mthing4WorldGen();
			structure1.generate(world, rand, pos);
		}
	}
*/
	private void generateOverworld(World world, Random rand, int chunkX, int chunkZ) {}
	private void generateNether(World world, Random rand, int chunkX, int chunkZ) {}
	private void generateEnd(World world, Random rand, int chunkX, int chunkZ) {}
	
	
	
	
	public static int getGroundFromAbove(World world, int x, int z)
	{
		int y = 255;
		boolean foundGround = false;
		while(!foundGround && y-- >= 31)
		{
			Block blockAt = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			foundGround = blockAt == Blocks.PACKED_ICE || blockAt == Blocks.ICE || blockAt == Blocks.MAGMA;
		}

		return y;
	}

	
	public static boolean canSpawnHere(Template template, World world, BlockPos posAboveGround)
	{
		int zwidth = template.getSize().getZ();
		int xwidth = template.getSize().getX();
		
		// check all the corners to see which ones are replaceable
		boolean corner1 = isCornerValid(world, posAboveGround);
		boolean corner2 = isCornerValid(world, posAboveGround.add(xwidth, 0, zwidth));
		
		// if Y > 20 and all corners pass the test, it's okay to spawn the structure
		return posAboveGround.getY() > 31 && corner1 && corner2;
	}
	
	public static boolean isCornerValid(World world, BlockPos pos)
	{
		int variation = 3;
		int highestBlock = getGroundFromAbove(world, pos.getX(), pos.getZ());
		
		if (highestBlock > pos.getY() - variation && highestBlock < pos.getY() + variation)
			return true;
				
		return false;
	}
}