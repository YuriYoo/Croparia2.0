package com.croparia.mod.Blocks.RitualStand;

import com.croparia.mod.Blocks.TileEntity.TileEntityCounter;
import com.croparia.mod.Init.CropariaCraft.RitualCraft2;
import com.croparia.mod.Mobs.Entity.EntityCentaur;
import com.croparia.mod.Mobs.Entity.EntityFlying;
import com.croparia.mod.Mobs.Entity.EntityMinotaur;
import com.croparia.mod.Mobs.Entity.EntitySeafarer;
import com.croparia.mod.Rituals.RitualUtils;
import com.croparia.mod.Rituals.SecondRitual;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockRitualStandT2 extends BlockRitualStand
{
	public BlockRitualStandT2(String name) {
		super(name);		
	}	

	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) 
	{
		super.onEntityCollidedWithBlock(worldIn, pos, state, entityIn);
		if(entityIn instanceof EntityItem)
		{
			RitualCraft2.craft(worldIn, pos, state, entityIn);
		}
	}
	
   public static void secondRitualCraft(String out, Item itemNeed, IBlockState blockNeed, BlockPos pos, World worldIn, Entity entityIn)
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
					if(SecondRitual.checkRitual(blockNeed, worldIn, pos))
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
						if(out == "seafarer")
						{
							EntitySeafarer e = new EntitySeafarer(worldIn);
							e.setCustomNameTag("Seafarer");
							e.setPosition(pos.getX() + 0.5, pos.getY() + 2, pos.getZ() + 0.5);
							worldIn.spawnEntity(e);
							RitualUtils.endSecond(entityIn, pos, worldIn);
							counter.resetAll();
						}
						else if(out == "minotaur")
						{
							EntityMinotaur e = new EntityMinotaur(worldIn);
							e.setCustomNameTag("Minotaur");
							e.setPosition(pos.getX() + 0.5, pos.getY() + 2, pos.getZ() + 0.5);
							worldIn.spawnEntity(e);
							RitualUtils.endSecond(entityIn, pos, worldIn);
							counter.resetAll();
						}
						else if(out == "centaur")
						{
							EntityCentaur e = new EntityCentaur(worldIn);
							e.setCustomNameTag("Centaur");
							e.setPosition(pos.getX() + 0.5, pos.getY() + 2, pos.getZ() + 0.5);
							worldIn.spawnEntity(e);
							RitualUtils.endSecond(entityIn, pos, worldIn);
							counter.resetAll();
						}
						else if(out == "flying_beast")
						{
							EntityFlying e = new EntityFlying(worldIn);
							e.setCustomNameTag("Flying Beast");
							e.setPosition(pos.getX() + 0.5, pos.getY() + 2, pos.getZ() + 0.5);
							worldIn.spawnEntity(e);
							RitualUtils.endSecond(entityIn, pos, worldIn);
							counter.resetAll();
						}					
					}
				}
			}
		}
    }
}
