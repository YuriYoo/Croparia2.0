package com.croparia.mod.Mobs.Entity;

import com.croparia.mod.Init.ModItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityMudGolem extends EntityGolem
{
    public EntityMudGolem(World world)
    {
        super(world);
    }
    
    @Override
    public void onDeath(DamageSource cause) {
        super.onDeath(cause);
    	if(cause.getTrueSource() instanceof EntityPlayer)
    	{
    		this.dropItem(ModItems.ELEMENTAL_WATER, 1);
    	}
    }
}
