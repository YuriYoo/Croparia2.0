package com.croparia.mod.Blocks;

import java.util.Random;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.ModBlocks;
import com.croparia.mod.Init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.BlockIce;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockCloud extends Block
{

	private String name;
	
	public BlockCloud(String name) {
		super(Material.CORAL);
		ModBlocks.setBlockName(this, name);
		this.setCreativeTab(Reference.TAB);
		this.name = name;
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		return null;
	}

	@Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return Blocks.UNPOWERED_REPEATER.getBoundingBox(state, source, pos);
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) 
	{
		if(entityIn instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)entityIn;
			if(name == "bounce_cloud")
			{
				if(player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ModItems.ELEMENTAL_AIR_FEET || player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ModItems.AIR_GEM_FEET)
				{}
				else
					player.addPotionEffect(new PotionEffect(MobEffects.LEVITATION, 100, 0));
			}
		}
	}
}
