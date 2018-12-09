package com.croparia.mod.Blocks;

import com.croparia.mod.Reference;
import com.croparia.mod.Blocks.TileEntity.TileEntityCounter;
import com.croparia.mod.Init.ModBlocks;
import com.croparia.mod.Init.CropariaCraft.InfusorCraft;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
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

public class BlockInfusor2 extends Block implements ITileEntityProvider{

	public boolean empty;
	public boolean water;
	public boolean fire;
	public boolean earth;
	public boolean air;
	public boolean elemental;
	public int counter = 0;
	
	public BlockInfusor2(String name, boolean empty, boolean water, boolean fire, boolean earth, boolean air, boolean elemental) {
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
    	return true;
    }
    
    @Override
    public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) 
    {
    	if(!worldIn.isRemote)
    	{    		
    		if(elemental == true)
    			worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(ModBlocks.INFUSOR2_ELEMENTAL)));  
			else if(water == true)
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(ModBlocks.INFUSOR2_WATER)));  
			else if(fire == true)
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(ModBlocks.INFUSOR2_FIRE)));  
			else if(earth == true)
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(ModBlocks.INFUSOR2_EARTH)));  
			else if(air == true)
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(ModBlocks.INFUSOR2_AIR))); 
			else if(empty == true)
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(ModBlocks.INFUSOR2)));  		
		}
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
