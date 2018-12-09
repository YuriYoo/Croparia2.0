package com.croparia.mod.Rituals;

import com.croparia.mod.Init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FirstRitual extends RitualUtils
{
	public static boolean checkRitual(IBlockState blockNeed, World worldIn, BlockPos pos)
	{
		if(getBlock(ModBlocks.ELEMENTAL_STONE, pos.down(), worldIn))
		{
			if(getBlockState(ModBlocks.IRON_CROP.getStateFromMeta(7), pos.north().east(), worldIn) && getBlockState(ModBlocks.IRON_CROP.getStateFromMeta(7), pos.north().west(), worldIn) && getBlockState(ModBlocks.IRON_CROP.getStateFromMeta(7), pos.south().east(), worldIn) && getBlockState(ModBlocks.IRON_CROP.getStateFromMeta(7), pos.south().west(), worldIn))	
			{
				if(getBlockState(ModBlocks.GOLD_CROP.getStateFromMeta(7), pos.north(3), worldIn) && getBlockState(ModBlocks.GOLD_CROP.getStateFromMeta(7), pos.south(3), worldIn) && getBlockState(ModBlocks.GOLD_CROP.getStateFromMeta(7), pos.east(3), worldIn) && getBlockState(ModBlocks.GOLD_CROP.getStateFromMeta(7), pos.west(3), worldIn))
				{
					if(getBlock(Blocks.WATER, pos.down().north(2).west(2), worldIn) && getBlock(Blocks.WATER, pos.down().north(2).east(2), worldIn) && getBlock(Blocks.WATER, pos.down().south(2).west(2), worldIn) && getBlock(Blocks.WATER, pos.down().south(2).east(2), worldIn))
					{
						if(getBlockState(Blocks.STONE.getStateFromMeta(3), pos.north(4).east(), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(3), pos.north(4).west(), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(3), pos.south(4).east(), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(3), pos.south(4).west(), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(3), pos.east(4).north(), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(3), pos.east(4).south(), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(3), pos.west(4).north(), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(3), pos.west(4).south(), worldIn))
						{
							if(getBlockState(Blocks.STONE.getStateFromMeta(5), pos.north(3).east(3), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.north(3).west(3), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.south(3).east(3), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.south(3).west(3), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up().north(3).east(3), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up().north(3).west(3), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up().south(3).east(3), worldIn) && getBlockState(Blocks.STONE.getStateFromMeta(5), pos.up().south(3).west(3), worldIn))
							{
								if(getBlockState(blockNeed, pos.down().north(), worldIn) && getBlockState(blockNeed, pos.down().east(), worldIn) && getBlockState(blockNeed, pos.down().south(), worldIn) && getBlockState(blockNeed, pos.down().west(), worldIn))
								{
									return true;
								}
								else 
									bad(blockNeed, worldIn, pos);
							}
							else 
								bad("ANDESITES", worldIn, pos);						
						}
						else 
							bad("DIORITES", worldIn, pos);	
					}
					else 
						bad("WATER BLOCKS", worldIn, pos);
				}
				else 
					bad("GOLD CROPS", worldIn, pos);
			}
			else 
				bad("IRON CROPS", worldIn, pos);	
		}
		else 
			bad("ELEMENTAL STONE", worldIn, pos);	
		return false;
	}
}