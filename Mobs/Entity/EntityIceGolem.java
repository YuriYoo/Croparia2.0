package com.croparia.mod.Mobs.Entity;

import com.croparia.mod.Init.ModItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityIceGolem extends EntityGolem
{
    public EntityIceGolem(World world)
    {
        super(world);
    }
    
    @Override
    public void onDeath(DamageSource cause) {
        super.onDeath(cause);
    	if(cause.getTrueSource() instanceof EntityPlayer)
    	{
    		this.dropItem(ModItems.GOLEM_EYE_ICE, 1);
    	}
    }
}
