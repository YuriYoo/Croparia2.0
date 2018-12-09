package com.croparia.mod.Blocks;

import java.util.Random;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockGreenhouse extends Block {

	public BlockGreenhouse() {
		super(Material.GLASS);
		setLightLevel(4F);
		ModBlocks.setBlockName(this, "greenhouse");
		setCreativeTab(Reference.TAB);
		this.setTickRandomly(true);
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return Blocks.UNPOWERED_REPEATER.getBoundingBox(state, source, pos);
	}

	@Override
	public boolean isFullBlock(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	
	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer,
			ItemStack stack) {
		updateTick(worldIn, pos, state, null);
	}

	
	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) 
	{
		if(!worldIn.isRemote)
		{
			if(worldIn.getBlockState(pos.down()).getBlock() instanceof BlockCropMod)
			{
				Block block = worldIn.getBlockState(pos.down()).getBlock();
				if(worldIn.getBlockState(pos.down()) == block.getStateFromMeta(7))
				{
					int i = worldIn.rand.nextInt(1);
					worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() - 1, pos.getZ() + 0.5, new ItemStack(((BlockCropMod) block).getItemSeed(), i)));
					worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() - 1, pos.getZ() + 0.5, new ItemStack(((BlockCropMod) block).getItemCrop(), 3)));
					worldIn.setBlockState(pos.down(), block.getStateFromMeta(4));
				}
			}			
			else if(worldIn.getBlockState(pos.down()).getBlock() instanceof BlockStemMod)
			{
				Block block = worldIn.getBlockState(pos.down()).getBlock();
				if(worldIn.getBlockState(pos.down()) == block.getStateFromMeta(7))
				{
					worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() - 1, pos.getZ() + 0.5, new ItemStack(((BlockStemMod) block).getGreenHouseItem(), 1)));
					worldIn.setBlockState(pos.down(), block.getStateFromMeta(3));
				}
			}
		}
	}
}
