package com.croparia.mod.Init.CropariaCraft;

import com.croparia.mod.Blocks.RitualStand.BlockRitualStandT2;
import com.croparia.mod.Blocks.RitualStand.BlockRitualStandT3;
import com.croparia.mod.Init.ModBlocks;
import com.croparia.mod.Init.ModItems;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RitualCraft3 extends BlockRitualStandT3{

	public RitualCraft3(String name) {
		super(name);
	}

	public static void craft(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
	{
		stoneRitualCraft("water", ModItems.WATER_GEM, ModBlocks.INFUSOR_WATER.getDefaultState(), pos, worldIn, entityIn);
		stoneRitualCraft("fire", ModItems.FIRE_GEM, ModBlocks.INFUSOR_FIRE.getDefaultState(), pos, worldIn, entityIn);
		stoneRitualCraft("earth", ModItems.EARTH_GEM, ModBlocks.INFUSOR_EARTH.getDefaultState(), pos, worldIn, entityIn);
		stoneRitualCraft("air", ModItems.AIR_GEM, ModBlocks.INFUSOR_AIR.getDefaultState(), pos, worldIn, entityIn);
	}
}
