package com.croparia.mod.Blocks.RitualStand;

import com.croparia.mod.Reference;
import com.croparia.mod.Blocks.TileEntity.TileEntityCounter;
import com.croparia.mod.Init.ModBlocks;
import com.croparia.mod.Init.ModItems;
import com.croparia.mod.Init.CropariaCraft.RitualCraft1;
import com.croparia.mod.Rituals.FirstRitual;
import com.croparia.mod.Rituals.RitualUtils;
import com.croparia.mod.Rituals.SecondRitual;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.management.PlayerList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class BlockRitualStand extends Block implements ITileEntityProvider
{
	public boolean activate = false;
	
	public BlockRitualStand(String name) {
		super(Material.ROCK);
		ModBlocks.setBlockName(this, name);
		setCreativeTab(Reference.TAB);
		setResistance(10);
		setHardness(10);
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) 
	{
		return new AxisAlignedBB(0.0625, 0, 0.0625, 0.9375, 0.3125, 0.9375);
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
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) 
	{
		if(entityIn instanceof EntityItem)
		{
			RitualCraft1.craft(worldIn, pos, state, entityIn);
		}
	}	
	
   public static void firstRitualCraft(Item out, Item itemNeed, IBlockState blockNeed, BlockPos pos, World worldIn, Entity entityIn)
    {
    	TileEntity te = worldIn.getTileEntity(pos);
		if(te instanceof TileEntityCounter)
		{
			TileEntityCounter counter = (TileEntityCounter)te;
			if(((EntityItem) entityIn).getItem().getItem() == itemNeed)
	    	{		
				if(counter.goodRitual == false)
				{
					entityIn.setNoGravity(true);
					entityIn.setPosition(pos.getX() + 0.5, pos.getY() + 4, pos.getZ() + 0.5);
					if(FirstRitual.checkRitual(blockNeed, worldIn, pos))
					{	
						counter.goodRitual = true;
						entityIn.setGlowing(true);
					}
					else
					{
						counter.resetAll();
						entityIn.setPosition(pos.getX() + 2.5, pos.getY(), pos.getZ() + 0.5);
						entityIn.setNoGravity(false);		
						entityIn.setGlowing(false);
					}			
				}					
				else if(counter.goodRitual)
				{
					counter.more();
					System.out.print(counter.getCounter());
					entityIn.setGlowing(true);
					worldIn.spawnParticle(EnumParticleTypes.ENCHANTMENT_TABLE, pos.getX() + 0.5 + (worldIn.rand.nextFloat() - worldIn.rand.nextFloat()) / 2, pos.getY() + 0.3 + (worldIn.rand.nextFloat() / -2 - worldIn.rand.nextFloat()) / -1, pos.getZ() + 0.5 +  (worldIn.rand.nextFloat() - worldIn.rand.nextFloat()) / -1, 0, 0, 0);  				    		
					if(counter.getCounter() == 200 && !worldIn.isRemote)
					{
						RitualUtils.endFirst(out, entityIn, pos, worldIn);
						counter.resetAll();
					}
				}
			}
		}
    } 
	
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityCounter();
	}	
}
