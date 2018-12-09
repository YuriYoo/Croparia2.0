package com.croparia.mod.Rituals;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RitualUtils extends Reference{

	public static boolean getBlock(Block block, BlockPos pos, World worldIn)
	{
		if(worldIn.getBlockState(pos) == block.getDefaultState()) return true;
		return false;
	}	
	public static boolean getBlockState(IBlockState block, BlockPos pos, World worldIn)
	{
		if(worldIn.getBlockState(pos) == block) return true;
		return false;
	}
	
	public static void endFirst(Item out, Entity entityIn, BlockPos pos, World worldIn)
	{		
			EntityItem e = new EntityItem(worldIn);
			e.setItem(new ItemStack(out));
			e.setPosition(pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5);
			worldIn.spawnEntity(e);
			entityIn.setDead();
			worldIn.setBlockState(pos.down().north(), Blocks.AIR.getDefaultState());
			worldIn.setBlockState(pos.down().east(), Blocks.AIR.getDefaultState());
			worldIn.setBlockState(pos.down().south(), Blocks.AIR.getDefaultState());
			worldIn.setBlockState(pos.down().west(), Blocks.AIR.getDefaultState());				
	}

	public static void endSecond(Entity entityIn, BlockPos pos, World worldIn)
	{
		entityIn.setDead();
		worldIn.setBlockState(pos.north(2).west(2), Blocks.AIR.getDefaultState());
		worldIn.setBlockState(pos.north(2).east(2), Blocks.AIR.getDefaultState());
		worldIn.setBlockState(pos.south(2).east(2), Blocks.AIR.getDefaultState());
		worldIn.setBlockState(pos.south(2).west(2), Blocks.AIR.getDefaultState());
	}
	
	public static void endStone(Entity entityIn, BlockPos pos, World worldIn)
	{
		entityIn.setDead();
		worldIn.setBlockState(pos.west(7), ModBlocks.INFUSOR.getDefaultState());
		worldIn.setBlockState(pos.north(7),  ModBlocks.INFUSOR.getDefaultState());
		worldIn.setBlockState(pos.south(7),  ModBlocks.INFUSOR.getDefaultState());
		worldIn.setBlockState(pos.east(7),  ModBlocks.INFUSOR.getDefaultState());
		worldIn.setBlockState(pos.south(5).east(5),  ModBlocks.INFUSOR.getDefaultState());
		worldIn.setBlockState(pos.north(5).west(5),  ModBlocks.INFUSOR.getDefaultState());
		worldIn.setBlockState(pos.north(5).east(5),  ModBlocks.INFUSOR.getDefaultState());
		worldIn.setBlockState(pos.south(5).west(5),  ModBlocks.INFUSOR.getDefaultState());
	}
	
	public static boolean bad(String error, World worldIn, BlockPos pos)
	{
		if(!worldIn.isRemote)
		{
			say("It seems there is an error with the " + error, worldIn, pos);
		}
		return false;
	}
	
	public static boolean bad(IBlockState error, World worldIn, BlockPos pos)
	{
		if(!worldIn.isRemote)
		{
			say("It seems there is an error with the " + error, worldIn, pos);
		}
		return false;
	}
}
