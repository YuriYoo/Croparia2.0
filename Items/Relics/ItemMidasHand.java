package com.croparia.mod.Items.Relics;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.ModItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemMidasHand extends Item 
{
	public ItemMidasHand(String name)
	{
		ModItems.setItemName(this, name);
		setMaxStackSize(1);
		setCreativeTab(Reference.TAB);
	}
	
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) 
	{
		if(worldIn.getBlockState(pos).getBlock() != Blocks.BEDROCK && !worldIn.isRemote)
		{
			worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());
			worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5, new ItemStack(Items.GOLD_INGOT)));	
			return EnumActionResult.SUCCESS;
		}
		else
			return EnumActionResult.FAIL;
	}
	
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) 
	{
		if(!entity.world.isRemote)
		{
			entity.world.setBlockState(entity.getPosition(), Blocks.GOLD_BLOCK.getDefaultState());
			entity.setDead();
			return true;
		}
		else
			return false;
	}
}
