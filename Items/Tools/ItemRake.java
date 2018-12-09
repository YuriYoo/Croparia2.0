package com.croparia.mod.Items.Tools;

import java.util.Set;

import com.croparia.mod.Reference;
import com.croparia.mod.Blocks.BlockCropMod;
import com.croparia.mod.Init.ModItems;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemRake extends ItemTool {
	
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.CARROTS});

	public ItemRake(String name, ToolMaterial materialIn) {
		super(materialIn, EFFECTIVE_ON);
		ModItems.setItemName(this, name);
		setCreativeTab(Reference.TAB);
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		if(toRepair.getItem() == ModItems.RAKE && repair.getItem() == Item.getItemFromBlock(Blocks.PLANKS))
			return true;
		return false;
	}
	
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand,
			EnumFacing facing, float hitX, float hitY, float hitZ) {
		if(!worldIn.isRemote && worldIn.getBlockState(pos).getBlock() instanceof BlockCropMod)
		{
			ItemStack itemstack = player.getHeldItem(hand);
			Block block = worldIn.getBlockState(pos).getBlock();
			if(worldIn.getBlockState(pos) == block.getStateFromMeta(7))
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5, new ItemStack(((BlockCropMod) block).getItemCrop(), 2)));
				worldIn.setBlockState(pos, block.getStateFromMeta(3));
				itemstack.damageItem(1, player);
				return EnumActionResult.SUCCESS;
			}
		}
		return EnumActionResult.FAIL;
	}
	
	
	
}
