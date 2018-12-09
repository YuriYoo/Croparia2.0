package com.croparia.mod.Mobs.Entity;

import com.croparia.mod.Init.ModItems;
import com.croparia.mod.Mobs.Entity.AI.EntityAIBaseAttack;
import com.croparia.mod.World.Dimension.EarthDim;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityCentaur extends EntityMob
{  
    
    public EntityCentaur(World world)
    {
        super(world);
        this.setSize(1, 2.5F);
    }

    protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(6, new EntityAIMoveTowardsTarget(this, 1, 20F));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(1, new EntityAIBaseAttack(this, 1.0D, false));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.tasks.addTask(8, new EntityAILookIdle(this));


    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(300.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.90D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(20.0D / 2);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(40.0D);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(1.0D);

    }

    @Override
    public void onDeath(DamageSource cause)
    {
        super.onDeath(cause);
            
    	if(cause.getTrueSource() instanceof EntityPlayer)
        {
    		if(this.getCustomNameTag() == "Centaur")
			{
    			this.dropItem(EarthDim.block, 1);
	        	this.dropItem(ModItems.ELEMENTAL_EARTH_CHEST, 1);
	        	this.dropItem(ModItems.EARTH_SWORD, 1);
    		}
    	    else 
    	    {
        		int i = rand.nextInt(1);
        		int a = rand.nextInt(4);
        		int b = rand.nextInt(5);
        		if(a == 0)
        			a = 1;
        		this.dropItem(new ItemStack(Blocks.SAPLING, a, b));
    	    	this.dropItem(ModItems.ELEMENTAL_EARTH, i); 
    		}
         
        }
    }
    
    private void dropItem(ItemStack stack) 
    {
		this.entityDropItem(stack, 0);
	}
    
    @Override

    protected void updateAITasks()

    {

     super.updateAITasks();

    }

    public void addTrackingPlayer(EntityPlayerMP player)

    {

        super.addTrackingPlayer(player);

    }
    
    public void removeTrackingPlayer(EntityPlayerMP player)

    {

        super.removeTrackingPlayer(player);

    }

}
