package com.croparia.mod.Blocks.RitualStand;

import com.croparia.mod.Blocks.TileEntity.TileEntityCounter;
import com.croparia.mod.Init.CropariaCraft.RitualCraft3;
import com.croparia.mod.Mobs.Entity.EntityAirGolem;
import com.croparia.mod.Mobs.Entity.EntityDustGolem;
import com.croparia.mod.Mobs.Entity.EntityEarthGolem;
import com.croparia.mod.Mobs.Entity.EntityFireGolem;
import com.croparia.mod.Mobs.Entity.EntityIceGolem;
import com.croparia.mod.Mobs.Entity.EntityLavaGolem;
import com.croparia.mod.Mobs.Entity.EntityLightningGolem;
import com.croparia.mod.Mobs.Entity.EntityMudGolem;
import com.croparia.mod.Mobs.Entity.EntityObsidianGolem;
import com.croparia.mod.Mobs.Entity.EntitySmokeGolem;
import com.croparia.mod.Mobs.Entity.EntitySteamGolem;
import com.croparia.mod.Mobs.Entity.EntityWaterGolem;
import com.croparia.mod.Rituals.RitualUtils;
import com.croparia.mod.Rituals.StoneRitual;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockRitualStandT3 extends BlockRitualStandT2
{
	public BlockRitualStandT3(String name) {
		super(name);		
	}	

	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) 
	{
		super.onEntityCollidedWithBlock(worldIn, pos, state, entityIn);
		if(entityIn instanceof EntityItem)
		{
			RitualCraft3.craft(worldIn, pos, state, entityIn);
		}
	}
	
   public static void stoneRitualCraft(String out, Item itemNeed, IBlockState blockNeed, BlockPos pos, World worldIn, Entity entityIn)
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
					if(StoneRitual.checkRitual(blockNeed, worldIn, pos))
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
						switch (worldIn.provider.getDimension())
						{
							case 0: 
								if(out == "water")
								{
									EntityWaterGolem e = new EntityWaterGolem(worldIn);
									e.setPosition(pos.getX() + 0.5, pos.getY() + 2, pos.getZ() + 0.5);
									worldIn.spawnEntity(e);
									RitualUtils.endStone(entityIn, pos, worldIn);
									counter.resetAll();
								}
								else if(out == "fire")
								{
									EntityFireGolem e = new EntityFireGolem(worldIn);
									e.setPosition(pos.getX() + 0.5, pos.getY() + 2, pos.getZ() + 0.5);
									worldIn.spawnEntity(e);
									RitualUtils.endStone(entityIn, pos, worldIn);
									counter.resetAll();
								}
								else if(out == "earth")
								{
									EntityEarthGolem e = new EntityEarthGolem(worldIn);
									e.setPosition(pos.getX() + 0.5, pos.getY() + 2, pos.getZ() + 0.5);
									worldIn.spawnEntity(e);
									RitualUtils.endStone(entityIn, pos, worldIn);
									counter.resetAll();
								}
								else if(out == "air")
								{
									EntityAirGolem e = new EntityAirGolem(worldIn);
									e.setPosition(pos.getX() + 0.5, pos.getY() + 2, pos.getZ() + 0.5);
									worldIn.spawnEntity(e);
									RitualUtils.endStone(entityIn, pos, worldIn);
									counter.resetAll();
								}
								break;
							//water dim
							case 5: 
								if(out == "water")
								{
									EntityIceGolem e = new EntityIceGolem(worldIn);
									e.setPosition(pos.getX() + 0.5, pos.getY() + 2, pos.getZ() + 0.5);
									worldIn.spawnEntity(e);
									RitualUtils.endStone(entityIn, pos, worldIn);
									counter.resetAll();
								}
								else if(out == "fire")
								{
									EntityObsidianGolem e = new EntityObsidianGolem(worldIn);
									e.setPosition(pos.getX() + 0.5, pos.getY() + 2, pos.getZ() + 0.5);
									worldIn.spawnEntity(e);
									RitualUtils.endStone(entityIn, pos, worldIn);
									counter.resetAll();
								}
								else if(out == "earth")
								{
									EntityMudGolem e = new EntityMudGolem(worldIn);
									e.setPosition(pos.getX() + 0.5, pos.getY() + 2, pos.getZ() + 0.5);
									worldIn.spawnEntity(e);
									RitualUtils.endStone(entityIn, pos, worldIn);
									counter.resetAll();
								}
								else if(out == "air")
								{
									EntityLightningGolem e = new EntityLightningGolem(worldIn);
									e.setPosition(pos.getX() + 0.5, pos.getY() + 2, pos.getZ() + 0.5);
									worldIn.spawnEntity(e);
									RitualUtils.endStone(entityIn, pos, worldIn);
									counter.resetAll();
								}
								break;
							//fire dim
							case 6: 
								if(out == "water")
								{
									EntitySteamGolem e = new EntitySteamGolem(worldIn);
									e.setPosition(pos.getX() + 0.5, pos.getY() + 2, pos.getZ() + 0.5);
									worldIn.spawnEntity(e);
									RitualUtils.endStone(entityIn, pos, worldIn);
									counter.resetAll();
								}	
								else if(out == "air")
								{
									EntitySmokeGolem e = new EntitySmokeGolem(worldIn);
									e.setPosition(pos.getX() + 0.5, pos.getY() + 2, pos.getZ() + 0.5);
									worldIn.spawnEntity(e);
									RitualUtils.endStone(entityIn, pos, worldIn);
									counter.resetAll();
								}
								break;
							//earth dim
							case 7: 
								if(out == "fire")
								{
									EntityLavaGolem e = new EntityLavaGolem(worldIn);
									e.setPosition(pos.getX() + 0.5, pos.getY() + 2, pos.getZ() + 0.5);
									worldIn.spawnEntity(e);
									RitualUtils.endStone(entityIn, pos, worldIn);
									counter.resetAll();
								}
								break;
							//air dim
							case 8: 
								if(out == "earth")
								{
									EntityDustGolem e = new EntityDustGolem(worldIn);
									e.setPosition(pos.getX() + 0.5, pos.getY() + 2, pos.getZ() + 0.5);
									worldIn.spawnEntity(e);
									RitualUtils.endStone(entityIn, pos, worldIn);
									counter.resetAll();
								}
								break;
							
						}		
					}
				}
			}
		}
    }
}
