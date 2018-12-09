package com.croparia.mod.Init.CropariaCraft;

import com.croparia.mod.Blocks.BlockInfusor;
import com.croparia.mod.Blocks.BlockInfusor2;
import com.croparia.mod.Init.ModBlocks;
import com.croparia.mod.Init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class InfusorCraft
{
	public static void craft(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
	{
		Block block = state.getBlock();
		if(block instanceof BlockInfusor)
		{
			if(((BlockInfusor) block).elemental == true)
			{
				BlockInfusor.craft(ModItems.ELEMENTAL_WATER, Items.WATER_BUCKET, 1, 0, 1, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.ELEMENTAL_FIRE, Items.FLINT_AND_STEEL, 1, 0, 1, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.ELEMENTAL_EARTH, Item.getItemFromBlock(Blocks.LEAVES), 1, 0, 1, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.ELEMENTAL_EARTH, Item.getItemFromBlock(Blocks.LEAVES2), 1, 0, 1, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.ELEMENTAL_AIR, Items.GLASS_BOTTLE, 1, 0, 1, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.BLOCK_ELEMENTAL_STONE_ITEM, Item.getItemFromBlock(Blocks.STONE), 1, 0, 1, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.BLOCK_INFUSOR2_ELEMENTAL_ITEM, ModItems.BLOCK_INFUSOR2_ITEM, 1, 0, 1, state, pos, worldIn, entityIn);
			}
			else if(((BlockInfusor) block).water == true)
			{
				BlockInfusor.craft(ModItems.WATER_MULTITOOL, ModItems.ELEMENTAL_MULTITOOL, -1, -1, 1, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.WATER_AXE, ModItems.RENFORCED_AXE, -1, -1, 1, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.WATER_PICKAXE, ModItems.RENFORCED_PICKAXE, -1, -1, 1, state, pos, worldIn, entityIn);
		   		BlockInfusor.craft(ModItems.WATER_SHOVEL, ModItems.RENFORCED_SHOVEL, -1, -1, 1, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.WATER_HOE, ModItems.RENFORCED_HOE, -1, -1, 1, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.ELEMENTAL_WATER_HELMET, ModItems.RENFORCED_HELMET, -1, -1, 1, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.ELEMENTAL_WATER_LEGS, ModItems.RENFORCED_LEGS, -1, -1, 1, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.ELEMENTAL_WATER_FEET, ModItems.RENFORCED_FEET, -1, -1, 1, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.BLOCK_WATER_BLOCK_ITEM, Item.getItemFromBlock(ModBlocks.ELEMENTAL_STONE), -1, -1, -1, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.BLOCK_INFUSOR2_WATER_ITEM, ModItems.BLOCK_INFUSOR2_ITEM, 1, 0, 1, state, pos, worldIn, entityIn);
				
			}
			else if(((BlockInfusor) block).fire == true)
			{
				BlockInfusor.craft(ModItems.FIRE_MULTITOOL, ModItems.ELEMENTAL_MULTITOOL, 1, 0, 0, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.FIRE_AXE, ModItems.RENFORCED_AXE, 1, 0, 0, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.FIRE_PICKAXE, ModItems.RENFORCED_PICKAXE, 1, 0, 0, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.FIRE_SHOVEL, ModItems.RENFORCED_SHOVEL, 1, 0, 0, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.FIRE_HOE, ModItems.RENFORCED_HOE, 1, 0, 0, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.ELEMENTAL_FIRE_HELMET, ModItems.RENFORCED_HELMET, 1, 0, 0, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.ELEMENTAL_FIRE_LEGS, ModItems.RENFORCED_LEGS, 1, 0, 0, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.ELEMENTAL_FIRE_FEET, ModItems.RENFORCED_FEET, 1, 0, 0, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.BLOCK_FIRE_BLOCK_ITEM, Item.getItemFromBlock(ModBlocks.ELEMENTAL_STONE), -1, -1, -1, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.BLOCK_INFUSOR2_FIRE_ITEM, ModItems.BLOCK_INFUSOR2_ITEM, 1, 0, 1, state, pos, worldIn, entityIn);
				
			}
			else if(((BlockInfusor) block).earth == true)
			{
				BlockInfusor.craft(ModItems.EARTH_MULTITOOL, ModItems.ELEMENTAL_MULTITOOL, 0.7, 0.3, 0, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.EARTH_AXE, ModItems.RENFORCED_AXE, 0.7, 0.3, 0, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.EARTH_PICKAXE, ModItems.RENFORCED_PICKAXE, 0.7, 0.3, 0, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.EARTH_SHOVEL, ModItems.RENFORCED_SHOVEL, 0.7, 0.3, 0, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.EARTH_HOE, ModItems.RENFORCED_HOE, 0.7, 0.3, 0, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.ELEMENTAL_EARTH_HELMET, ModItems.RENFORCED_HELMET, 0.7, 0.3, 0, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.ELEMENTAL_EARTH_LEGS, ModItems.RENFORCED_LEGS, 0.7, 0.3, 0, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.ELEMENTAL_EARTH_FEET, ModItems.RENFORCED_FEET, 0.7, 0.3, 0, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.BLOCK_EARTH_BLOCK_ITEM, Item.getItemFromBlock(ModBlocks.ELEMENTAL_STONE), -1, -1, -1, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.BLOCK_INFUSOR2_EARTH_ITEM, ModItems.BLOCK_INFUSOR2_ITEM, 1, 0, 1, state, pos, worldIn, entityIn);
				
			}
			else if(((BlockInfusor) block).air == true)
			{
				BlockInfusor.craft(ModItems.AIR_MULTITOOL, ModItems.ELEMENTAL_MULTITOOL, 0.9, 1, 1, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.AIR_AXE, ModItems.RENFORCED_AXE, 0.9, 1, 1, state, pos, worldIn, entityIn);    	
				BlockInfusor.craft(ModItems.AIR_PICKAXE, ModItems.RENFORCED_PICKAXE, 0.9, 1, 1, state, pos, worldIn, entityIn);	
				BlockInfusor.craft(ModItems.AIR_SHOVEL, ModItems.RENFORCED_SHOVEL, 0.9, 1, 1, state, pos, worldIn, entityIn); 
				BlockInfusor.craft(ModItems.AIR_HOE, ModItems.RENFORCED_HOE, 0.9, 1, 1, state, pos, worldIn, entityIn);      
				BlockInfusor.craft(ModItems.ELEMENTAL_AIR_HELMET, ModItems.RENFORCED_HELMET, 0.9, 1, 1, state, pos, worldIn, entityIn);   
				BlockInfusor.craft(ModItems.ELEMENTAL_AIR_LEGS, ModItems.RENFORCED_LEGS, 0.9, 1, 1, state, pos, worldIn, entityIn); 	
				BlockInfusor.craft(ModItems.ELEMENTAL_AIR_FEET, ModItems.RENFORCED_FEET, 0.9, 1, 1, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.BLOCK_AIR_BLOCK_ITEM, Item.getItemFromBlock(ModBlocks.ELEMENTAL_STONE), -1, -1, -1, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.BLOCK_INFUSOR2_AIR_ITEM, ModItems.BLOCK_INFUSOR2_ITEM, 1, 0, 1, state, pos, worldIn, entityIn);
				
			}
		}
		else if(block instanceof BlockInfusor2)
		{
			if(((BlockInfusor2) block).elemental == true)
			{
				BlockInfusor2.craft(ModItems.ELEMENTAL_WATER, Items.WATER_BUCKET, 1, 0, 1, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.ELEMENTAL_FIRE, Items.FLINT_AND_STEEL, 1, 0, 1, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.ELEMENTAL_EARTH, Item.getItemFromBlock(Blocks.LEAVES), 1, 0, 1, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.ELEMENTAL_EARTH, Item.getItemFromBlock(Blocks.LEAVES2), 1, 0, 1, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.ELEMENTAL_AIR, Items.GLASS_BOTTLE, 1, 0, 1, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.BLOCK_ELEMENTAL_STONE_ITEM, Item.getItemFromBlock(Blocks.STONE), 1, 0, 1, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.BLOCK_INFUSOR2_ELEMENTAL_ITEM, ModItems.BLOCK_INFUSOR2_ITEM, 1, 0, 1, state, pos, worldIn, entityIn);
			}
			else if(((BlockInfusor2) block).water == true)
			{
				BlockInfusor2.craft(ModItems.WATER_MULTITOOL, ModItems.ELEMENTAL_MULTITOOL, -1, -1, 1, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.WATER_AXE, ModItems.RENFORCED_AXE, -1, -1, 1, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.WATER_PICKAXE, ModItems.RENFORCED_PICKAXE, -1, -1, 1, state, pos, worldIn, entityIn);
		   		BlockInfusor2.craft(ModItems.WATER_SHOVEL, ModItems.RENFORCED_SHOVEL, -1, -1, 1, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.WATER_HOE, ModItems.RENFORCED_HOE, -1, -1, 1, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.ELEMENTAL_WATER_HELMET, ModItems.RENFORCED_HELMET, -1, -1, 1, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.ELEMENTAL_WATER_LEGS, ModItems.RENFORCED_LEGS, -1, -1, 1, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.ELEMENTAL_WATER_FEET, ModItems.RENFORCED_FEET, -1, -1, 1, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.BLOCK_WATER_BLOCK_ITEM, Item.getItemFromBlock(ModBlocks.ELEMENTAL_STONE), -1, -1, -1, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.BLOCK_INFUSOR2_WATER_ITEM, ModItems.BLOCK_INFUSOR2_ITEM, 1, 0, 1, state, pos, worldIn, entityIn);
				
			}
			else if(((BlockInfusor2) block).fire == true)
			{
				BlockInfusor2.craft(ModItems.FIRE_MULTITOOL, ModItems.ELEMENTAL_MULTITOOL, 1, 0, 0, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.FIRE_AXE, ModItems.RENFORCED_AXE, 1, 0, 0, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.FIRE_PICKAXE, ModItems.RENFORCED_PICKAXE, 1, 0, 0, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.FIRE_SHOVEL, ModItems.RENFORCED_SHOVEL, 1, 0, 0, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.FIRE_HOE, ModItems.RENFORCED_HOE, 1, 0, 0, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.ELEMENTAL_FIRE_HELMET, ModItems.RENFORCED_HELMET, 1, 0, 0, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.ELEMENTAL_FIRE_LEGS, ModItems.RENFORCED_LEGS, 1, 0, 0, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.ELEMENTAL_FIRE_FEET, ModItems.RENFORCED_FEET, 1, 0, 0, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.BLOCK_FIRE_BLOCK_ITEM, Item.getItemFromBlock(ModBlocks.ELEMENTAL_STONE), -1, -1, -1, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.BLOCK_INFUSOR2_FIRE_ITEM, ModItems.BLOCK_INFUSOR2_ITEM, 1, 0, 1, state, pos, worldIn, entityIn);
				
			}
			else if(((BlockInfusor2) block).earth == true)
			{
				BlockInfusor2.craft(ModItems.EARTH_MULTITOOL, ModItems.ELEMENTAL_MULTITOOL, 0.7, 0.3, 0, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.EARTH_AXE, ModItems.RENFORCED_AXE, 0.7, 0.3, 0, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.EARTH_PICKAXE, ModItems.RENFORCED_PICKAXE, 0.7, 0.3, 0, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.EARTH_SHOVEL, ModItems.RENFORCED_SHOVEL, 0.7, 0.3, 0, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.EARTH_HOE, ModItems.RENFORCED_HOE, 0.7, 0.3, 0, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.ELEMENTAL_EARTH_HELMET, ModItems.RENFORCED_HELMET, 0.7, 0.3, 0, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.ELEMENTAL_EARTH_LEGS, ModItems.RENFORCED_LEGS, 0.7, 0.3, 0, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.ELEMENTAL_EARTH_FEET, ModItems.RENFORCED_FEET, 0.7, 0.3, 0, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.BLOCK_EARTH_BLOCK_ITEM, Item.getItemFromBlock(ModBlocks.ELEMENTAL_STONE), -1, -1, -1, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.BLOCK_INFUSOR2_EARTH_ITEM, ModItems.BLOCK_INFUSOR2_ITEM, 1, 0, 1, state, pos, worldIn, entityIn);
				
			}
			else if(((BlockInfusor2) block).air == true)
			{
				BlockInfusor2.craft(ModItems.AIR_MULTITOOL, ModItems.ELEMENTAL_MULTITOOL, 0.9, 1, 1, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.AIR_AXE, ModItems.RENFORCED_AXE, 0.9, 1, 1, state, pos, worldIn, entityIn);    	
				BlockInfusor2.craft(ModItems.AIR_PICKAXE, ModItems.RENFORCED_PICKAXE, 0.9, 1, 1, state, pos, worldIn, entityIn);	
				BlockInfusor2.craft(ModItems.AIR_SHOVEL, ModItems.RENFORCED_SHOVEL, 0.9, 1, 1, state, pos, worldIn, entityIn); 
				BlockInfusor2.craft(ModItems.AIR_HOE, ModItems.RENFORCED_HOE, 0.9, 1, 1, state, pos, worldIn, entityIn);      
				BlockInfusor2.craft(ModItems.ELEMENTAL_AIR_HELMET, ModItems.RENFORCED_HELMET, 0.9, 1, 1, state, pos, worldIn, entityIn);   
				BlockInfusor2.craft(ModItems.ELEMENTAL_AIR_LEGS, ModItems.RENFORCED_LEGS, 0.9, 1, 1, state, pos, worldIn, entityIn); 	
				BlockInfusor2.craft(ModItems.ELEMENTAL_AIR_FEET, ModItems.RENFORCED_FEET, 0.9, 1, 1, state, pos, worldIn, entityIn);
				BlockInfusor2.craft(ModItems.BLOCK_AIR_BLOCK_ITEM, Item.getItemFromBlock(ModBlocks.ELEMENTAL_STONE), -1, -1, -1, state, pos, worldIn, entityIn);
				BlockInfusor.craft(ModItems.BLOCK_INFUSOR2_AIR_ITEM, ModItems.BLOCK_INFUSOR2_ITEM, 1, 0, 1, state, pos, worldIn, entityIn);
				
			}
		}
	}
}
