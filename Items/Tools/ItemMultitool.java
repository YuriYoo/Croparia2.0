package com.croparia.mod.Items.Tools;

import java.util.Set;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.ModItems;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemMultitool extends ItemTool {

	 private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.PLANKS});
	
	public ItemMultitool(String name, ToolMaterial materialIn) {
		super(materialIn, EFFECTIVE_ON);
		setCreativeTab(Reference.TAB);
		ModItems.setItemName(this, name);
	}

	@Override
	public boolean canHarvestBlock(IBlockState blockIn) 
	{
		if(blockIn != Blocks.AIR.getBlockState() || blockIn != Blocks.BARRIER.getBlockState())
			return true;
		return false;
	}
	
	@Override
	public float getDestroySpeed(ItemStack stack, IBlockState state) 
	{
		if (canHarvestBlock(state)) 
			return efficiency;
		else
			return 1.0F;
	}
	
	@Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
    {
		if(toRepair.getItem() == ModItems.WOOD_MULTITOOL && repair.getItem() == Item.getItemFromBlock(Blocks.PLANKS))
	        return true;
		else if(toRepair.getItem() == ModItems.STONE_MULTITOOL && repair.getItem() == Item.getItemFromBlock(Blocks.COBBLESTONE))
	        return true;
		else if(toRepair.getItem() == ModItems.IRON_MULTITOOL && repair.getItem() == Items.IRON_INGOT)
	        return true;
		else if(toRepair.getItem() == ModItems.GOLD_MULTITOOL && repair.getItem() == Items.GOLD_INGOT)
	        return true;
		else if(toRepair.getItem() == ModItems.DIAMOND_MULTITOOL && repair.getItem() == Items.DIAMOND)
	        return true;
		else if(toRepair.getItem() == ModItems.OBSIDIAN_MULTITOOL && repair.getItem() == Item.getItemFromBlock(Blocks.OBSIDIAN))
	        return true;
    	else if(toRepair.getItem() == ModItems.RENFORCED_MULTITOOL && repair.getItem() == Items.DIAMOND)
	        return true;
    	else
    		return false;
    }
	
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
                if (block == Blocks.GRASS || block == Blocks.GRASS_PATH)
                {
                    this.setBlock(itemstack, player, worldIn, pos, Blocks.FARMLAND.getDefaultState());
                    return EnumActionResult.SUCCESS;
                }

                if (block == Blocks.DIRT)
                {
                    switch ((BlockDirt.DirtType)iblockstate.getValue(BlockDirt.VARIANT))
                    {
                        case DIRT:
                            this.setBlock(itemstack, player, worldIn, pos, Blocks.FARMLAND.getDefaultState());
                            return EnumActionResult.SUCCESS;
                        case COARSE_DIRT:
                            this.setBlock(itemstack, player, worldIn, pos, Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
                            return EnumActionResult.SUCCESS;
                    }
                }
            }

            return EnumActionResult.PASS;
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
