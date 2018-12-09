package com.croparia.mod.Blocks;

import java.util.Random;

import javax.annotation.Nullable;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.ModBlocks;
import com.croparia.mod.Init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockObsidianGround extends BlockBush 
{
	
	protected static final AxisAlignedBB TALL_GRASS_AABB = new AxisAlignedBB(0.09999999403953552D, 0.0D, 0.09999999403953552D, 0.8999999761581421D, 0.0D, 0.8999999761581421D);
	private String name;

	 
	public BlockObsidianGround(String name)
	{
		super(Material.ROCK);
		ModBlocks.setBlockName(this, name);
		this.name = name;
		setCreativeTab(Reference.TAB);
	}
	
	@Override
    public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos)
    {
        return true;
    }
    
	@Override
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
    {
    	if(entityIn instanceof EntityPlayer)
    	{
    		EntityPlayer player = (EntityPlayer)entityIn;
    		if(this.name == "obsidian_ground")
    		{
    				if(player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ModItems.ELEMENTAL_FIRE_FEET || player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ModItems.FIRE_GEM_FEET)
    				{}
					else
    					effect(entityIn);
    		}
        	else if(this.name == "fired_obsidian_ground")
        	{
        			if(player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ModItems.ELEMENTAL_FIRE_FEET || player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ModItems.FIRE_GEM_FEET)
        			{}
        			else
        				effect(entityIn);
        			((EntityLivingBase) entityIn).setFire(5);
    		}
    	}
    }

	public void effect(Entity entityIn)
	{
		((EntityLivingBase) entityIn).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 400, 0));
		((EntityLivingBase) entityIn).addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 400, 0));
	}
	
	
    
    @Override
    public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
    {
        IBlockState soil = worldIn.getBlockState(pos.down());
        return super.canPlaceBlockAt(worldIn, pos) && soil.getBlock().canSustainPlant(soil, worldIn, pos.down(), net.minecraft.util.EnumFacing.UP, this);
    }

   
    @Override
    protected boolean canSustainBush(IBlockState state)
    {
        return state.getBlock() == Blocks.MAGMA || state.getBlock() == ModBlocks.FIRE_GEM_ORE;
    }
    
    @Override
    public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state)
    {
        if (state.getBlock() == this)
        {
            IBlockState soil = worldIn.getBlockState(pos.down());
            return soil.getBlock().canSustainPlant(soil, worldIn, pos.down(), net.minecraft.util.EnumFacing.UP, this);
        }
        return this.canSustainBush(worldIn.getBlockState(pos.down()));
    }
    
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return TALL_GRASS_AABB;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return null;
    }

    @Override
    public Block.EnumOffsetType getOffsetType()
    {
        return Block.EnumOffsetType.XZ;
    }

    
    @Override
    public int quantityDroppedWithBonus(int fortune, Random random)
    {
        return 1 + random.nextInt(fortune * 2 + 1);
    }

    @Override
    public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack)
    {
        if (!worldIn.isRemote && stack.getItem() == Items.SHEARS)
        {
            spawnAsEntity(worldIn, pos, new ItemStack(this, 1));
        }
        else
        {
            super.harvestBlock(worldIn, player, pos, state, te, stack);
        }
    }
}