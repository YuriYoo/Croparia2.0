package com.croparia.mod.Blocks;

import java.util.Random;

import javax.annotation.Nullable;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.ModBlocks;
import com.croparia.mod.Init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockQuickIce extends Block 
{
	public String name;
	
	public BlockQuickIce(String name) {
		super(Material.ICE);
		ModBlocks.setBlockName(this, name);
		setCreativeTab(Reference.TAB);
		this.name = name;
	}

	@Override
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
    {
    	if(entityIn instanceof EntityPlayer)
    	{
    		if(name == "quick_ice")
    		{	
    			EntityPlayer player = (EntityPlayer)entityIn;
	    		if(player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == ModItems.ELEMENTAL_WATER_LEGS || player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == ModItems.WATER_GEM_LEGS)
	    		{}
	    		else
	    			effect(entityIn);
	    		((EntityLivingBase) entityIn).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 500, 1));
    		}
    		else if(name == "quick_sand")
    		{	
    			EntityPlayer player = (EntityPlayer)entityIn;
	    		if(player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == ModItems.ELEMENTAL_EARTH_LEGS || player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == ModItems.EARTH_GEM_LEGS)
	    		{}
	    		else
	    			effect(entityIn);
	    		((EntityLivingBase) entityIn).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 500, 1));
    		}
    	}
    }

	public void effect(Entity entityIn)
	{
        entityIn.setInWeb();
		((EntityLivingBase) entityIn).addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 500, 1));
	}

    public boolean isOpaqueCube(IBlockState state)
    {
        return true;
    }

    @Nullable
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
    {
        return NULL_AABB;
    }

    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }
}
