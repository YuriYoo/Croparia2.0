package com.croparia.mod.Items;

import java.util.Set;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.ModBlocks;
import com.croparia.mod.Init.ModItems;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemCollector extends ItemTool{

	public static final Set<Block> EFFECTIVE_ON = Sets.newHashSet();
	
	public ItemCollector(String name) {
		super(ToolMaterial.WOOD, EFFECTIVE_ON);
		ModItems.setItemName(this, name);
		setCreativeTab(Reference.TAB);
		setMaxStackSize(1);
	}

	@Override
	public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos,
			EntityLivingBase entityLiving) 
	{
		if(!worldIn.isRemote)
		{
			if(state.getBlock() == ModBlocks.APRICOT_PLANT || state == ModBlocks.APRICOT_CROP.getStateFromMeta(7))
			{	int i = worldIn.rand.nextInt(5);
				if(i <= 1)
					if(state.getBlock() == ModBlocks.APRICOT_CROP)
						i = i + 2;
					else
						i = i + 4;
				System.out.print(i);
				for(int a = 0; a<i; a++)
				{
					worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(ModItems.APRICOT)));
				}
			}
			else if(state.getBlock() == ModBlocks.BANANA_PLANT || state == ModBlocks.BANANA_CROP.getStateFromMeta(7))
			{	int i = worldIn.rand.nextInt(5);
				if(i <= 1)
					if(state.getBlock() == ModBlocks.BANANA_CROP)
						i = i + 2;
					else
						i = i + 4;
				System.out.print(i);
				for(int a = 0; a<i; a++)
				{
					worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(ModItems.BANANA)));
				}
				
			}
			else if(state.getBlock() == ModBlocks.CHERRY_PLANT || state == ModBlocks.CHERRY_CROP.getStateFromMeta(7))
			{	int i = worldIn.rand.nextInt(5);
				if(i <= 1)
					if(state.getBlock() == ModBlocks.CHERRY_CROP)
						i = i + 2;
					else
						i = i + 4;
				System.out.print(i);
				for(int a = 0; a<i; a++)
				{
					worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(ModItems.CHERRY)));
				}
				
			}
			else if(state.getBlock() == ModBlocks.KIWI_PLANT || state == ModBlocks.KIWI_CROP.getStateFromMeta(7))
			{	int i = worldIn.rand.nextInt(5);
				if(i <= 1)
					if(state.getBlock() == ModBlocks.KIWI_CROP)
						i = i + 2;
					else
						i = i + 4;
				System.out.print(i);
				for(int a = 0; a<i; a++)
				{
					worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(ModItems.KIWI)));
				}
				
			}
			else if(state.getBlock() == ModBlocks.LEMON_PLANT || state == ModBlocks.LEMON_CROP.getStateFromMeta(7))
			{	int i = worldIn.rand.nextInt(5);
				if(i <= 1)
					if(state.getBlock() == ModBlocks.LEMON_CROP)
						i = i + 2;
					else
						i = i + 4;
				System.out.print(i);
				for(int a = 0; a<i; a++)
				{
					worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(ModItems.LEMON)));
				}
				
			}
			else if(state.getBlock() == ModBlocks.ORANGE_PLANT || state == ModBlocks.ORANGE_CROP.getStateFromMeta(7))
			{	int i = worldIn.rand.nextInt(5);
				if(i <= 1)
					if(state.getBlock() == ModBlocks.ORANGE_CROP)
						i = i + 2;
					else
						i = i + 4;
				System.out.print(i);
				for(int a = 0; a<i; a++)
				{
					worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(ModItems.ORANGE)));
				}
				
			}
			else if(state.getBlock() == ModBlocks.PEAR_PLANT || state == ModBlocks.PEAR_CROP.getStateFromMeta(7))
			{	int i = worldIn.rand.nextInt(5);
				if(i <= 1)
					if(state.getBlock() == ModBlocks.PEAR_CROP)
						i = i + 2;
					else
						i = i + 4;
				System.out.print(i);
				for(int a = 0; a<i; a++)
				{
					worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(ModItems.PEAR)));
				}
				
			}
			stack.damageItem(1, entityLiving);
		}
		return true;
	}
}
