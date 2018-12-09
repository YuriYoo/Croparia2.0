package com.croparia.mod.Items.ItemBlock;

import com.croparia.mod.Blocks.BlockCropMod;
import com.croparia.mod.Blocks.BlockStemMod;
import com.croparia.mod.Init.ModBlocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GreenHouseItemBlock extends ItemBlock{

	public GreenHouseItemBlock() {
		super(ModBlocks.GREENHOUSE);
	}
	
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
		if(!worldIn.isRemote)
		{
			ItemStack itemstack = player.getHeldItem(hand);
			if((worldIn.getBlockState(pos).getBlock() instanceof BlockCropMod || worldIn.getBlockState(pos).getBlock() instanceof BlockStemMod) && worldIn.isAirBlock(pos.up()))
			{
				worldIn.setBlockState(pos.up(), block.getDefaultState());
				itemstack.shrink(1);
	            return EnumActionResult.SUCCESS;
	        }
			else
			{
				if(worldIn.isAirBlock(pos.up(2)))
				{
					worldIn.setBlockState(pos.up(2), block.getDefaultState());
					itemstack.shrink(1);
		            return EnumActionResult.SUCCESS;
				}
			}
		}
        else
        {
            return EnumActionResult.FAIL;
        }
        return EnumActionResult.FAIL;
    }
}
