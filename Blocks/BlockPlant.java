package com.croparia.mod.Blocks;

import java.util.Random;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.ModBlocks;
import com.croparia.mod.Init.ModItems;

import net.minecraft.block.BlockBush;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockPlant extends BlockBush {
	
	private String name;
	public BlockPlant(String name)
	{
		ModBlocks.setBlockName(this, name);
		this.name = name;
	}
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		if(name == "apricot_plant")
			return ModItems.APRICOT;
		else if(name == "banana_plant")
			return ModItems.BANANA;
		else if(name == "cherry_plant")
			return ModItems.CHERRY;
		else if(name == "kiwi_plant")
			return ModItems.KIWI;
		else if(name == "lemon_plant")
			return ModItems.LEMON;
		else if(name == "orange_plant")
			return ModItems.ORANGE;
		else if(name == "pear_plant")
			return ModItems.PEAR;
		else
			return null;
	}
}
