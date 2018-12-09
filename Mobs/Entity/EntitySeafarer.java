package com.croparia.mod.Mobs.Entity;

import com.croparia.mod.Init.ModItems;
import com.croparia.mod.Items.ItemMod;
import com.croparia.mod.Mobs.Entity.AI.EntityAIBaseAttack;
import com.croparia.mod.World.Dimension.WaterDim;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIZombieAttack;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntitySeafarer extends EntityMob
{

    public boolean boss = false;
	
    public EntitySeafarer(World world)
    {
        super(world);
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
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(200.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.40D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(15.0D / 2);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(30.0D);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0D);
    }
    

    @Override
    public void onDeath(DamageSource cause)
    {
        super.onDeath(cause); 
    	if(cause.getTrueSource() instanceof EntityPlayer)
	    {
    		if(this.getCustomNameTag() == "Seafarer")
 			{
 				this.dropItem(WaterDim.block, 1);
	        	this.dropItem(ModItems.ELEMENTAL_WATER_CHEST, 1);
	        	this.dropItem(ModItems.WATER_SWORD, 1);
 			}
    	    else 
    	    {
        		int i = rand.nextInt(1);
        		int a = rand.nextInt(4);
        		this.dropItem(Items.FISH, a);
    	    	this.dropItem(ModItems.ELEMENTAL_WATER, i); 
    	    }
	    }
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
