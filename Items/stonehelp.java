package com.croparia.mod.Items;

import com.croparia.mod.Init.ModBlocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class stonehelp extends Item
{
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand,
			EnumFacing facing, float hitX, float hitY, float hitZ) 
	{
		if(!worldIn.isRemote)
		{	
			worldIn.setBlockState(pos.north(7).west(3).up(0), Blocks.STONE.getStateFromMeta(6));;
			worldIn.setBlockState(pos.north(7).east(3).up(0), Blocks.STONE.getStateFromMeta(6));;
			worldIn.setBlockState(pos.south(7).west(3).up(0), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(7).west(3).up(0), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(7).east(3).up(0), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(7).west(3).up(0), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(7).east(3).up(0), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.west(7).south(3).up(0), Blocks.STONE.getStateFromMeta(6)); 
			worldIn.setBlockState(pos.west(7).north(3).up(0), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.east(7).south(3).up(0), Blocks.STONE.getStateFromMeta(6));							
			worldIn.setBlockState(pos.east(7).north(3).up(0), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(7).west(3).up(1), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(7).east(3).up(1), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(7).west(3).up(1), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(7).east(3).up(1), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.west(7).south(3).up(1), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.west(7).north(3).up(1), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.east(7).south(3).up(1), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.east(7).north(3).up(1), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(7).west(3).up(2), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(7).east(3).up(2), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(7).west(3).up(2), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(7).east(3).up(2), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.west(7).south(3).up(2), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.west(7).north(3).up(2), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.east(7).south(3).up(2), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.east(7).north(3).up(2), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(7).west(3).up(3), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(7).east(3).up(3), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(7).west(3).up(3), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(7).east(3).up(3), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.west(7).south(3).up(3), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.west(7).north(3).up(3), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.east(7).south(3).up(3), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.east(7).north(3).up(3), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(7).west(3).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(7).east(3).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(7).west(3).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(7).east(3).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.west(7).south(3).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.west(7).north(3).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.east(7).south(3).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.east(7).north(3).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(7).east(-3).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(7).east(-3).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.east(7).north(-3).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.west(7).north(-3).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(7).east(-2).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(7).east(-2).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.east(7).north(-2).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.west(7).north(-2).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(7).east(-1).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(7).east(-1).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.east(7).north(-1).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.west(7).north(-1).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(7).east(0).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(7).east(0).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.east(7).north(0).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.west(7).north(0).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(7).east(1).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(7).east(1).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.east(7).north(1).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.west(7).north(1).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(7).east(2).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(7).east(2).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.east(7).north(2).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.west(7).north(2).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(7).east(3).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(7).east(3).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.east(7).north(3).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.west(7).north(3).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(7).east(4).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(6).east(4).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(6).east(5).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(5).east(5).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(5).east(6).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(4).east(6).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(4).east(7).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(7).west(4).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(6).west(4).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(6).west(5).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(5).west(5).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(5).west(6).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(4).west(6).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.north(4).west(7).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(7).east(4).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(6).east(4).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(6).east(5).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(5).east(5).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(5).east(6).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(4).east(6).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(4).east(7).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(7).west(4).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(6).west(4).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(6).west(5).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(5).west(5).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(5).west(6).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(4).west(6).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.south(4).west(7).up(4), Blocks.STONE.getStateFromMeta(6));
			worldIn.setBlockState(pos.down(), ModBlocks.ELEMENTAL_STONE.getDefaultState());
			worldIn.setBlockState(pos.west(7), ModBlocks.INFUSOR_WATER.getDefaultState());
			worldIn.setBlockState(pos.north(7),  ModBlocks.INFUSOR_WATER.getDefaultState());
			worldIn.setBlockState(pos.south(7),  ModBlocks.INFUSOR_WATER.getDefaultState());
			worldIn.setBlockState(pos.east(7),  ModBlocks.INFUSOR_WATER.getDefaultState());
			worldIn.setBlockState(pos.south(5).east(5),  ModBlocks.INFUSOR_WATER.getDefaultState());
			worldIn.setBlockState(pos.north(5).west(5),  ModBlocks.INFUSOR_WATER.getDefaultState());
			worldIn.setBlockState(pos.north(5).east(5),  ModBlocks.INFUSOR_WATER.getDefaultState());
			worldIn.setBlockState(pos.south(5).west(5),  ModBlocks.INFUSOR_WATER.getDefaultState());
		}
		return EnumActionResult.SUCCESS;
	}
}
				
	

