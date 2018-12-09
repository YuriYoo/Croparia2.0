package com.croparia.mod.Init.CropariaCraft;

import com.croparia.mod.Blocks.RitualStand.BlockRitualStandT2;
import com.croparia.mod.Init.ModBlocks;
import com.croparia.mod.Init.ModItems;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RitualCraft2 extends BlockRitualStandT2{

	public RitualCraft2(String name) {
		super(name);
	}

	public static void craft(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
	{
		secondRitualCraft("seafarer", ModItems.ELEMENTAL_WATER, ModBlocks.WATER_BLOCK.getDefaultState(), pos, worldIn, entityIn);
		secondRitualCraft("minotaur", ModItems.ELEMENTAL_FIRE, ModBlocks.FIRE_BLOCK.getDefaultState(), pos, worldIn, entityIn);
		secondRitualCraft("centaur", ModItems.ELEMENTAL_FIRE, ModBlocks.FIRE_BLOCK.getDefaultState(), pos, worldIn, entityIn);
		secondRitualCraft("flying_beast", ModItems.ELEMENTAL_FIRE, ModBlocks.FIRE_BLOCK.getDefaultState(), pos, worldIn, entityIn);
	}
}
