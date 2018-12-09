package com.croparia.mod.Rituals;

import com.croparia.mod.Init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class StoneRitual extends RitualUtils
{
	public static boolean checkRitual(IBlockState blockNeed, World worldIn, BlockPos pos)
	{
		if(worldIn.getBlockState(pos.north(7).west(3).up(0)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(7).east(3).up(0)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(7).west(3).up(0)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(7).east(3).up(0)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.west(7).south(3).up(0)) == Blocks.STONE.getStateFromMeta(6)) 
		if(worldIn.getBlockState(pos.west(7).north(3).up(0)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.east(7).south(3).up(0)) == Blocks.STONE.getStateFromMeta(6))							
		if(worldIn.getBlockState(pos.east(7).north(3).up(0)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(7).west(3).up(1)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(7).east(3).up(1)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(7).west(3).up(1)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(7).east(3).up(1)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.west(7).south(3).up(1)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.west(7).north(3).up(1)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.east(7).south(3).up(1)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.east(7).north(3).up(1)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(7).west(3).up(2)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(7).east(3).up(2)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(7).west(3).up(2)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(7).east(3).up(2)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.west(7).south(3).up(2)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.west(7).north(3).up(2)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.east(7).south(3).up(2)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.east(7).north(3).up(2)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(7).west(3).up(3)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(7).east(3).up(3)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(7).west(3).up(3)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(7).east(3).up(3)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.west(7).south(3).up(3)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.west(7).north(3).up(3)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.east(7).south(3).up(3)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.east(7).north(3).up(3)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(7).west(3).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(7).east(3).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(7).west(3).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(7).east(3).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.west(7).south(3).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.west(7).north(3).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.east(7).south(3).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.east(7).north(3).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(7).east(-3).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(7).east(-3).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.east(7).north(-3).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.west(7).north(-3).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(7).east(-2).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(7).east(-2).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.east(7).north(-2).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.west(7).north(-2).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(7).east(-1).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(7).east(-1).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.east(7).north(-1).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.west(7).north(-1).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(7).east(0).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(7).east(0).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.east(7).north(0).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.west(7).north(0).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(7).east(1).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(7).east(1).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.east(7).north(1).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.west(7).north(1).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(7).east(2).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(7).east(2).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.east(7).north(2).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.west(7).north(2).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(7).east(3).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(7).east(3).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.east(7).north(3).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.west(7).north(3).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(7).east(4).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(6).east(4).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(6).east(5).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(5).east(5).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(5).east(6).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(4).east(6).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(4).east(7).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(7).west(4).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(6).west(4).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(6).west(5).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(5).west(5).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(5).west(6).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(4).west(6).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.north(4).west(7).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(7).east(4).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(6).east(4).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(6).east(5).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(5).east(5).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(5).east(6).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(4).east(6).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(4).east(7).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(7).west(4).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(6).west(4).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(6).west(5).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(5).west(5).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(5).west(6).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(4).west(6).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.south(4).west(7).up(4)) == Blocks.STONE.getStateFromMeta(6))
		if(worldIn.getBlockState(pos.down()) == ModBlocks.ELEMENTAL_STONE.getDefaultState())
		{
			
			if(worldIn.getBlockState(pos.west(7)) == blockNeed && worldIn.getBlockState(pos.north(7)) == blockNeed && worldIn.getBlockState(pos.south(7)) == blockNeed && worldIn.getBlockState(pos.east(7)) == blockNeed && worldIn.getBlockState(pos.north(5).east(5)) == blockNeed && worldIn.getBlockState(pos.south(5).east(5)) == blockNeed && worldIn.getBlockState(pos.north(5).west(5)) == blockNeed && worldIn.getBlockState(pos.south(5).west(5)) == blockNeed)		
			{
				return true;
			}	
			else
			{
				bad(blockNeed, worldIn, pos);
				return false;
			}
		}
		bad("RITUAL", worldIn, pos);
		return false;
	}		
}
