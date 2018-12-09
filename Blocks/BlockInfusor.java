package com.croparia.mod.Blocks;

import com.croparia.mod.Reference;
import com.croparia.mod.Blocks.TileEntity.TileEntityCounter;
import com.croparia.mod.Init.ModBlocks;
import com.croparia.mod.Init.ModItems;
import com.croparia.mod.Init.CropariaCraft.InfusorCraft;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockInfusor extends Block implements ITileEntityProvider{

	public boolean empty;
	public boolean water;
	public boolean fire;
	public boolean earth;
	public boolean air;
	public boolean elemental;
	public int counter = 0;
	
	public BlockInfusor(String name, boolean empty, boolean water, boolean fire, boolean earth, boolean air, boolean elemental) {
		super(Material.ROCK);
		ModBlocks.setBlockName(this, name);
		setCreativeTab(Reference.TAB);
		this.empty = empty;
		this.water = water;
		this.fire = fire;
		this.earth = earth;
		this.air = air;
		this.elemental = elemental;
		setResistance(10);
		setHardness(10);
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) 
	{
		return new AxisAlignedBB(0.0, 0, 0.0, 1, 0.5, 1);
	}
	
	@Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
    
    
    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) 
    {
    	if(!worldIn.isRemote)
    	{
    		ItemStack stack = playerIn.getHeldItemMainhand();
    		System.out.print("Empty : " + empty);
    		System.out.print("Water : " + water);
    		System.out.print("Fire : " + fire);
    		System.out.print("Earth : " + earth);
    		System.out.print("Air : " + air);
    		System.out.print("Elemental : " + elemental);
    		if(stack.getItem() == ModItems.POTION_ELEMATILIUS && empty == true)
    		{
				playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(Items.GLASS_BOTTLE));
    			worldIn.setBlockState(pos, ModBlocks.INFUSOR_ELEMENTAL.getDefaultState());
    			
    		}	
    		else if(stack.getItem() == ModItems.POTION_WATER && empty == true)
    		{
				playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(Items.GLASS_BOTTLE));
    			worldIn.setBlockState(pos, ModBlocks.INFUSOR_WATER.getDefaultState());
    			
    		}	
    		else if(stack.getItem() == ModItems.POTION_FIRE && empty == true)
    		{
				playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(Items.GLASS_BOTTLE));
    			worldIn.setBlockState(pos, ModBlocks.INFUSOR_FIRE.getDefaultState());
    			
    		}
    		else if(stack.getItem() == ModItems.POTION_EARTH && empty == true)
    		{
				playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(Items.GLASS_BOTTLE));
    			worldIn.setBlockState(pos, ModBlocks.INFUSOR_EARTH.getDefaultState());
    			
    		}
    		else if(stack.getItem() == ModItems.POTION_AIR && empty == true)
    		{
				playerIn.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(Items.GLASS_BOTTLE));
    			worldIn.setBlockState(pos, ModBlocks.INFUSOR_AIR.getDefaultState());
    			
    		}
    		else if(elemental == true && stack.getItem() == Items.GLASS_BOTTLE)
    		{
    			stack.shrink(1);
    			worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, new ItemStack(ModItems.POTION_ELEMATILIUS))); 
    			worldIn.setBlockState(pos, ModBlocks.INFUSOR.getDefaultState());
    			
    		}
    		else if(water == true && stack.getItem() == Items.GLASS_BOTTLE)
    		{
    			stack.shrink(1);
    			worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, new ItemStack(ModItems.POTION_WATER))); 
    			worldIn.setBlockState(pos, ModBlocks.INFUSOR.getDefaultState());
    			
    		}
    		else if(fire == true && stack.getItem() == Items.GLASS_BOTTLE)
    		{
    			stack.shrink(1);
    			worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, new ItemStack(ModItems.POTION_FIRE))); 
    			worldIn.setBlockState(pos, ModBlocks.INFUSOR.getDefaultState());
    			
    		}
    		else if(earth == true && stack.getItem() == Items.GLASS_BOTTLE)
    		{
    			stack.shrink(1);
    			worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, new ItemStack(ModItems.POTION_EARTH))); 
    			worldIn.setBlockState(pos, ModBlocks.INFUSOR.getDefaultState());
    			
    		}
    		else if(air == true && stack.getItem() == Items.GLASS_BOTTLE)
    		{
    			stack.shrink(1);
    			worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, new ItemStack(ModItems.POTION_AIR))); 
    			worldIn.setBlockState(pos, ModBlocks.INFUSOR.getDefaultState());
    			
    		}
    	
    	}
    	return true;
    }
    
    @Override
    public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) 
    {
    	if(!worldIn.isRemote)
    		worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(ModBlocks.INFUSOR)));  		
    }
    
    
    @Override
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) 
    {
    	if(entityIn instanceof EntityItem)
    	{    
    		InfusorCraft.craft(worldIn, pos, state, entityIn);   		
    	}
    }
    
    public static void craft(Item out, Item check, double r, double g, double b, IBlockState state, BlockPos pos, World worldIn, Entity entityIn) 
    { 	
    	if(((EntityItem) entityIn).getItem().getItem() == check && ((EntityItem) entityIn).getItem().getItemDamage() == ((EntityItem) entityIn).getItem().getMaxDamage() - ((EntityItem) entityIn).getItem().getMaxDamage())
		{	
    		TileEntity te = worldIn.getTileEntity(pos);
			if(te instanceof TileEntityCounter)
			{	
				worldIn.spawnParticle(EnumParticleTypes.REDSTONE, pos.getX() + 0.5 + (worldIn.rand.nextFloat() - worldIn.rand.nextFloat()) / 2, pos.getY() + 0.5 + (worldIn.rand.nextFloat() / -2 - worldIn.rand.nextFloat()) / -1, pos.getZ() + 0.5 +  (worldIn.rand.nextFloat() - worldIn.rand.nextFloat()) / -1, r, g, b);   		
				if(!worldIn.isRemote)
				{	
					TileEntityCounter counter = (TileEntityCounter)te;		    		
		    		counter.more();
					if(counter.counter >= 100)
					{    	
						EntityItem e = new EntityItem(worldIn);
						e.setItem(new ItemStack(out));
						e.setPosition(pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5);
						worldIn.spawnEntity(e);
						entityIn.setDead();
						worldIn.setBlockState(pos, ModBlocks.INFUSOR.getDefaultState());
						counter.reset();											
					}					
				}
			}
		}
    }
    
    public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityCounter();
	}
}
