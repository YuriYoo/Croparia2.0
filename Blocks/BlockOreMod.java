package com.croparia.mod.Blocks;

import java.util.Random;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.ModBlocks;
import com.croparia.mod.Init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockOreMod extends Block
{
	public String name;
	public boolean water = false;
	public boolean fire = false;
	public boolean earth = false;
	public boolean air = false;
	
	public BlockOreMod(Material mat, String name)
	{
		super(mat);
		this.name = name;
		setHardness(1.5F);
		setResistance(10.0F);
		setCreativeTab(Reference.TAB);
		ModBlocks.setBlockName(this, name);
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
		if(name == "air_gem_ore")
			return BlockRenderLayer.TRANSLUCENT;
		return BlockRenderLayer.SOLID;
    }
	
	@Override
	public boolean isFullCube(IBlockState state) {
		if(name == "air_gem_ore")
			return false;
		return true;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		if(name == "air_gem_ore")
			return Blocks.UNPOWERED_REPEATER.getBoundingBox(state, source, pos);
		return Blocks.STONE.getBoundingBox(state, source, pos);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		if(name == "water_gem_ore" && water == true)
			return ModItems.WATER_GEM;
		else if(name == "fire_gem_ore" && fire == true)
			return ModItems.FIRE_GEM;
		else if(name == "earth_gem_ore" && earth == true)
			return ModItems.EARTH_GEM;
		else if(name == "air_gem_ore" && air == true)
			return ModItems.AIR_GEM;
		return null;
	}
	
	@Override
	public boolean canHarvestBlock(IBlockAccess world, BlockPos pos, EntityPlayer player) 
	{
		if(getItem(player) == ModItems.WATER_PICKAXE || getItem(player) == ModItems.WATER_MULTITOOL)
		{
			water = true;
			return true;
		}
		else if(getItem(player) == ModItems.FIRE_PICKAXE || getItem(player) == ModItems.FIRE_MULTITOOL)
		{
			fire = true;
			return true;
		}
		else if(getItem(player) == ModItems.EARTH_PICKAXE || getItem(player) == ModItems.EARTH_MULTITOOL)
		{
			earth = true;
			return true;
		}
		else if(getItem(player) == ModItems.AIR_PICKAXE || getItem(player) == ModItems.AIR_MULTITOOL)
		{
			air = true;
			return true;
		}
		return false;
	}
	
	private Item getItem(EntityPlayer player)
	{
		return player.getItemStackFromSlot(EntityEquipmentSlot.MAINHAND).getItem();
	}
}
