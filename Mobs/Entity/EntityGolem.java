package com.croparia.mod.Mobs.Entity;

import com.croparia.mod.Mobs.Entity.AI.EntityAIBaseAttack;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;

public class EntityGolem extends EntityMob
{

    
    public EntityGolem(World world)
    {
        super(world);
        this.setSize(1f, 2.5f);
    }

    protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(6, new EntityAIMoveTowardsTarget(this, 1, 20F));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(1, new EntityAIBaseAttack(this, 0.5D, false));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityVillager.class, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityIronGolem.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntitySlime.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityWolf.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityPig.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityCow.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntitySheep.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityRabbit.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityZombie.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntitySkeleton.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityCreeper.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityEnderman.class, true));
        this.tasks.addTask(8, new EntityAILookIdle(this));


    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(1200.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(120D / 2);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(30.0D);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(1.0D);
        this.isImmuneToFire = true;

    }
    
    @Override
    public boolean isImmuneToExplosions() {
    	return true;
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
