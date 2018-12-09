package com.croparia.mod.Init.CropariaCraft;

import com.croparia.mod.Blocks.RitualStand.BlockRitualStand;
import com.croparia.mod.Init.ModItems;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RitualCraft1 extends BlockRitualStand{

	public RitualCraft1(String name) {
		super(name);
	}

	public static void craft(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
	{
		firstRitualCraft(ModItems.RELICS_INFINITE_APPLE, Items.APPLE, Blocks.GOLD_BLOCK.getDefaultState(), pos, worldIn, entityIn);
		firstRitualCraft(ModItems.RELICS_HORN_PLENTY, Item.getItemFromBlock(Blocks.LOG), Blocks.NETHER_WART_BLOCK.getDefaultState(), pos, worldIn, entityIn);
		firstRitualCraft(ModItems.RELICS_HORN_PLENTY, Item.getItemFromBlock(Blocks.LOG2), Blocks.NETHER_WART_BLOCK.getDefaultState(), pos, worldIn, entityIn);
		firstRitualCraft(ModItems.RELICS_MIDAS_HAND, Items.STICK, Blocks.GOLD_BLOCK.getDefaultState(), pos, worldIn, entityIn);	
	}
}
