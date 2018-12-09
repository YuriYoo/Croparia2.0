package com.croparia.mod.Rituals;

import com.croparia.mod.Init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SecondRitual extends RitualUtils
{
	public static boolean checkRitual(IBlockState blockNeed, World worldIn, BlockPos pos)
	{
		if(getBlock(ModBlocks.ELEMENTAL_STONE, pos.down(), worldIn) && getBlock(ModBlocks.ELEMENTAL_STONE, pos.down().north(), worldIn) && getBlock(ModBlocks.ELEMENTAL_STONE, pos.down().south(), worldIn) && getBlock(ModBlocks.ELEMENTAL_STONE, pos.down().east(), worldIn) && getBlock(ModBlocks.ELEMENTAL_STONE, pos.down().west(), worldIn))						
		{
			if(getBlockState(ModBlocks.REDSTONE_CROP.getStateFromMeta(7), pos.north(5), worldIn) && getBlockState(ModBlocks.REDSTONE_CROP.getStateFromMeta(7), pos.south(5), worldIn) && getBlockState(ModBlocks.REDSTONE_CROP.getStateFromMeta(7), pos.east(5), worldIn) && getBlockState(ModBlocks.REDSTONE_CROP.getStateFromMeta(7), pos.west(5), worldIn))
			{
				if(getBlockState(ModBlocks.ELEMENTAL_CROP.getStateFromMeta(7), pos.north(3).west(3), worldIn) && getBlockState(ModBlocks.ELEMENTAL_CROP.getStateFromMeta(7), pos.north(3).east(3), worldIn) && getBlockState(ModBlocks.ELEMENTAL_CROP.getStateFromMeta(7), pos.south(3).west(3), worldIn) && getBlockState(ModBlocks.ELEMENTAL_CROP.getStateFromMeta(7), pos.south(3).east(3), worldIn))
				{
					if(getBlock(Blocks.WATER, pos.down().north(4).west(), worldIn) && getBlock(Blocks.WATER, pos.down().north(4).east(), worldIn) && getBlock(Blocks.WATER, pos.down().south(4).west(), worldIn) && getBlock(Blocks.WATER, pos.down().south(4).east(), worldIn) && getBlock(Blocks.WATER, pos.down().east(4).north(), worldIn) && getBlock(Blocks.WATER, pos.down().east(4).south(), worldIn) && getBlock(Blocks.WATER, pos.down().west(4).north(), worldIn) && getBlock(Blocks.WATER, pos.down().west(4).south(), worldIn))
					{
						if(getBlockState(Blocks.STONE.getStateFromMeta(6), pos.north(4).east(4), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(6), pos.up().north(4).east(4), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(6), pos.up(2).north(4).east(4), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(6), pos.north(4).west(4), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(6), pos.up().north(4).west(4), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(6), pos.up(2).north(4).west(4), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(6), pos.south(4).east(4), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(6), pos.up().south(4).east(4), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(6), pos.up(2).south(4).east(4), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(6), pos.south(4).west(4), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(6), pos.up().south(4).west(4), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(6), pos.up(2).south(4).west(4), worldIn))
						{
							if(getBlockState(Blocks.STONE.getStateFromMeta(5), pos.north(5).east(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.north(5).west(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up().north(5).east(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up().north(5).west(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up(2).north(5).east(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up(2).north(5).west(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up(3).north(5).east(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up(3).north(5).west(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up(3).north(5).east(), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up(3).north(5).west(), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up(3).north(5), worldIn))
							{
								if(getBlockState(Blocks.STONE.getStateFromMeta(5), pos.south(5).east(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.south(5).west(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up().south(5).east(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up().south(5).west(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up(2).south(5).east(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up(2).south(5).west(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up(3).south(5).east(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up(3).south(5).west(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up(3).south(5).east(), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up(3).south(5).west(), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up(3).south(5), worldIn))
								{
									if(getBlockState(Blocks.STONE.getStateFromMeta(5), pos.east(5).north(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.east(5).south(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up().east(5).north(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up().east(5).south(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up(2).east(5).north(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up(2).east(5).south(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up(3).east(5).north(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up(3).east(5).south(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up(3).east(5).north(), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up(3).east(5).south(), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up(3).east(5), worldIn))
									{
										if(getBlockState(Blocks.STONE.getStateFromMeta(5), pos.west(5).north(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.west(5).south(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up().west(5).north(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up().west(5).south(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up(2).west(5).north(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up(2).west(5).south(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up(3).west(5).north(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up(3).west(5).south(2), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up(3).west(5).north(), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up(3).west(5).south(), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up(3).west(5), worldIn))
										{
											if(getBlockState(blockNeed, pos.north(2).east(2), worldIn) && getBlockState(blockNeed, pos.north(2).west(2), worldIn) && getBlockState(blockNeed, pos.south(2).east(2), worldIn) && getBlockState(blockNeed, pos.south(2).west(2), worldIn))
											{
												return true;
											}
											else
												bad(blockNeed, worldIn, pos);
										}
										else
											bad("ARCH IN ANDESITE TO THE WEST", worldIn, pos);	
									}
									else
										bad("ARCH IN ANDESITE TO THE EAST", worldIn, pos);
								}
								else
									bad("ARCH IN ANDESITE TO THE SOUTH", worldIn, pos);
							}
							else
								bad("ARCH IN ANDESITE TO THE NORTH", worldIn, pos);
						}
						else
							bad("POLISHED ANDESITE PILLARS", worldIn, pos);
					}
					else
						bad("WATER BLOCKS", worldIn, pos);
				}
				else 
					bad("ELEMENTAL CROPS", worldIn, pos);
			}
			else
				bad("REDSTONE CROPS", worldIn, pos);	
		}
		else 
			bad("ELEMENTAL STONES", worldIn, pos);
		return false;
	}
}
