package com.croparia.mod.Mobs.Entity;

import com.croparia.mod.Config.ConfigInit;
import com.croparia.mod.Mobs.Entity.AI.EntityAIBaseAttack;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.PotionTypes;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionUtils;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityPoisonousFrog extends EntityMob
{  
    
    public EntityPoisonousFrog(World world)
    {
        super(world);
        this.setSize(0.3F, 0.3F);
        this.moveHelper = new EntityPoisonousFrog.SlimeMoveHelper(this);
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
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(3D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(10.0D);

    }
    
    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) 
    {
    	super.attackEntityFrom(source, amount);
    	if(source.getTrueSource() instanceof EntityPlayer && this.isServerWorld())
    	{
    		if(((EntityPlayer)source.getTrueSource()).getItemStackFromSlot(EntityEquipmentSlot.MAINHAND).getItem() == Items.ARROW)
    		{
    			((EntityPlayer)source.getTrueSource()).getItemStackFromSlot(EntityEquipmentSlot.MAINHAND).shrink(1);
    			ItemStack arrow = new ItemStack(Items.TIPPED_ARROW);
    			PotionUtils.addPotionToItemStack(arrow, PotionTypes.POISON);
    			this.world.spawnEntity(new EntityItem(this.world, this.posX, this.posY, this.posZ, arrow));
    		}
    	}
		return false;
    }

    protected void jump()
    {
        this.motionY = 0.41999998688697815D;
        this.isAirBorne = true;
    }

    
    @Override
    public void onDeath(DamageSource cause)
    {          
    	int i = this.world.rand.nextInt(2);
    	if(i == 0)
    		i=1;
    	this.dropItem(Items.SLIME_BALL, i);
    }
    
    @Override
    public void onCollideWithPlayer(EntityPlayer entityIn) 
    {
    	entityIn.addPotionEffect(new PotionEffect(MobEffects.POISON, ConfigInit.frogPoisonTime, ConfigInit.frogPoisonPower));	
    }

    @Override
    protected void updateAITasks()
    {super.updateAITasks();}

    public void addTrackingPlayer(EntityPlayerMP player)
    {super.addTrackingPlayer(player);}
    
    public void removeTrackingPlayer(EntityPlayerMP player)
    {super.removeTrackingPlayer(player);}
    
    
    
    protected SoundEvent getJumpSound()
    {
        return SoundEvents.ENTITY_SMALL_SLIME_JUMP;
    }
    
    protected int getJumpDelay()
    {
        return this.rand.nextInt(10) + 10;
    }
    
    static class SlimeMoveHelper extends EntityMoveHelper
    {
        private float yRot;
        private int jumpDelay;
        private final EntityPoisonousFrog slime;
        private boolean isAggressive;

        public SlimeMoveHelper(EntityPoisonousFrog slimeIn)
        {
            super(slimeIn);
            this.slime = slimeIn;
            this.yRot = 180.0F * slimeIn.rotationYaw / (float)Math.PI;
        }

        public void setDirection(float p_179920_1_, boolean p_179920_2_)
        {
            this.yRot = p_179920_1_;
            this.isAggressive = p_179920_2_;
        }

        public void setSpeed(double speedIn)
        {
            this.speed = speedIn;
            this.action = EntityMoveHelper.Action.MOVE_TO;
        }       

        public void onUpdateMoveHelper()
        {
            this.entity.rotationYaw = this.limitAngle(this.entity.rotationYaw, this.yRot, 90.0F);
            this.entity.rotationYawHead = this.entity.rotationYaw;
            this.entity.renderYawOffset = this.entity.rotationYaw;

            if (this.action != EntityMoveHelper.Action.MOVE_TO)
            {
                this.entity.setMoveForward(0.0F);
            }
            else
            {
                this.action = EntityMoveHelper.Action.WAIT;

                if (this.entity.onGround)
                {
                    this.entity.setAIMoveSpeed((float)(this.speed * this.entity.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue()));

                    if (this.jumpDelay-- <= 0)
                    {
                        this.jumpDelay = this.slime.getJumpDelay();

                        if (this.isAggressive)
                        {
                            this.jumpDelay /= 3;
                        }

                        this.slime.getJumpHelper().setJumping();
                        this.slime.playSound(this.slime.getJumpSound(), this.slime.getSoundVolume(), ((this.slime.getRNG().nextFloat() - this.slime.getRNG().nextFloat()) * 0.2F + 1.0F) * 0.8F);                       
                    }
                    else
                    {
                        this.slime.moveStrafing = 0.0F;
                        this.slime.moveForward = 0.0F;
                        this.entity.setAIMoveSpeed(0.0F);
                    }
                }
                else
                {
                    this.entity.setAIMoveSpeed((float)(this.speed * this.entity.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue()));
                }
            }
        }
    }

	

}
