package com.croparia.mod.Items.Tools;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemElementalMultitool extends ItemMultitool
{
	
	public String name;
	public ItemElementalMultitool(String name, ToolMaterial material) {
		super(name, material);
		this.name = name;
	}


	@Override
	@SuppressWarnings("incomplete-switch")
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        ItemStack itemstack = player.getHeldItem(hand);

        if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack))
        {
            return EnumActionResult.FAIL;
        }
        else
        {
            int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(itemstack, player, worldIn, pos);
            if (hook != 0) return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;

            IBlockState iblockstate = worldIn.getBlockState(pos);
            Block block = iblockstate.getBlock();

            if (facing != EnumFacing.DOWN && worldIn.isAirBlock(pos.up()))
            {
            	if(!player.isSneaking())
            	{
	                for (int j = -5; j <= 5; j++)
		            {
		                 for (int k = -5; k <= 5; k++)
		                 {
		                	block = worldIn.getBlockState(new BlockPos(pos.getX() + j, pos.getY(), pos.getZ() + k)).getBlock() ;
			                if ((block == Blocks.GRASS || block == Blocks.GRASS_PATH || block == Blocks.DIRT) && worldIn.getBlockState(new BlockPos(pos.getX() + j, pos.getY() + 1, pos.getZ() + k)).getBlock() == Blocks.AIR)
			                {
			                    this.setBlock(itemstack, player, worldIn, new BlockPos(pos.getX() + j, pos.getY(), pos.getZ() + k), Blocks.FARMLAND.getDefaultState());
			                }
		                 }	
		            }
	                this.setBlock(itemstack, player, worldIn, pos, Blocks.FLOWING_WATER.getDefaultState());
	                return EnumActionResult.SUCCESS;
            	}  
                else if(player.isSneaking())
                {
                	if(name == "fire_multitool")
                	{
                		if (facing != EnumFacing.DOWN)
     	            	{
         	            	if(worldIn.getBlockState(pos.up()).getBlock() == Blocks.LAVA || worldIn.getBlockState(pos.up()).getBlock() == Blocks.AIR)
         	            	{
         	            		if (block == Blocks.GRASS || block == Blocks.STONE || block == Blocks.DIRT || block == Blocks.SAND  || block == Blocks.GRAVEL || block == Blocks.SANDSTONE || block == Blocks.HARDENED_CLAY )
         	            		{
         	            			this.setBlock(itemstack, player, worldIn, pos, Blocks.FLOWING_LAVA.getDefaultState());
        		            		player.attackEntityFrom(DamageSource.MAGIC, 4.0F);
         	            			return EnumActionResult.SUCCESS;          
         	            		}
         	                }
         	            	if(worldIn.getBlockState(pos).getBlock() == Blocks.OBSIDIAN ||worldIn.getBlockState(pos).getBlock() == Blocks.NETHERRACK)
         	            	{
         	            		{
         	            			this.setBlock(itemstack, player, worldIn, pos.up(), Blocks.FIRE.getDefaultState());
        		            		player.attackEntityFrom(DamageSource.MAGIC, 4.0F);
         	            			return EnumActionResult.SUCCESS;
         	            		}
         	            	}
         	            } 
                	}
                	else if(name == "water_multitool")
                	{
                		if (facing != EnumFacing.DOWN)
     	            	{
         	            	if(worldIn.getBlockState(pos.up()).getBlock() == Blocks.LAVA || worldIn.getBlockState(pos.up()).getBlock() == Blocks.AIR)
         	            	{
         	            		if (block == Blocks.GRASS || block == Blocks.STONE || block == Blocks.DIRT || block == Blocks.SAND  || block == Blocks.GRAVEL || block == Blocks.SANDSTONE || block == Blocks.HARDENED_CLAY )
         	            		{
         	            			this.setBlock(itemstack, player, worldIn, pos, Blocks.FLOWING_WATER.getDefaultState());
        		            		player.attackEntityFrom(DamageSource.MAGIC, 4.0F);
         	            			return EnumActionResult.SUCCESS;          
         	            		}
         	                }
     	            	}
                	}
                	else if(name == "earth_multitool")
                	{        	  
        	            if (block != Blocks.BEDROCK)
                		{
        	            	if (block == Blocks.DIRT || block == Blocks.GRASS || block ==  Blocks.GRAVEL || block ==  Blocks.SAND || block ==  Blocks.SANDSTONE || block ==  Blocks.HARDENED_CLAY || block ==  Blocks.LOG || block ==  Blocks.LOG2 || block ==  Blocks.COBBLESTONE || block ==  Blocks.MOSSY_COBBLESTONE || block ==  Blocks.STONE || block ==  Blocks.PLANKS || block ==  Blocks.DOUBLE_STONE_SLAB || block ==  Blocks.ICE || block ==  Blocks.NETHERRACK || block ==  Blocks.PACKED_ICE || block ==  Blocks.RED_SANDSTONE || block ==  Blocks.STONE_SLAB || block ==  Blocks.CLAY || block ==  Blocks.FARMLAND || block ==  Blocks.MYCELIUM || block ==  Blocks.SNOW || block ==  Blocks.SNOW_LAYER || block ==  Blocks.SOUL_SAND || block ==  Blocks.GRASS_PATH)
        	            	{
        	            		if (facing == EnumFacing.EAST)
        	            			this.setBlock(itemstack, player, worldIn, pos.east(), worldIn.getBlockState(pos));
        	            		else if (facing == EnumFacing.WEST)
        	            			this.setBlock(itemstack, player, worldIn, pos.west(), worldIn.getBlockState(pos));
        	            		else if (facing == EnumFacing.SOUTH)
        	            				this.setBlock(itemstack, player, worldIn, pos.south(), worldIn.getBlockState(pos));
        	            		else if (facing == EnumFacing.NORTH)
        	            			this.setBlock(itemstack, player, worldIn, pos.north(), worldIn.getBlockState(pos));
        	            		else  if (facing == EnumFacing.UP)
        	            			this.setBlock(itemstack, player, worldIn, pos.up(), worldIn.getBlockState(pos));
        	            		else  if (facing == EnumFacing.DOWN)
        	            			this.setBlock(itemstack, player, worldIn, pos.down(), worldIn.getBlockState(pos));
        	            		else
        	            			return EnumActionResult.FAIL;  
        	            	}
	            			player.attackEntityFrom(DamageSource.MAGIC, 4.0F);
	            			return EnumActionResult.SUCCESS;  	
        	            }  
                	}
                	else if(name == "air_multitool")
                	{
                		if (block != Blocks.BEDROCK)
              			{
                			this.setBlock(itemstack, player, worldIn, pos, Blocks.AIR.getDefaultState()); 
  	            		}
            			player.attackEntityFrom(DamageSource.MAGIC, 4.0F);
            			return EnumActionResult.SUCCESS;  	
                	}
                }
            }

            return EnumActionResult.SUCCESS;
        }
    }
	
	 public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
	    {
	        stack.damageItem(1, attacker);
	        return true;
	    }

	    protected void setBlock(ItemStack stack, EntityPlayer player, World worldIn, BlockPos pos, IBlockState state)
	    {
	        worldIn.playSound(player, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);

	        if (!worldIn.isRemote)
	        {
	            worldIn.setBlockState(pos, state, 11);
	            stack.damageItem(1, player);
	        }
	    }
}
