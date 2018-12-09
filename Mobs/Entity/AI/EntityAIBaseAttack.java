package com.croparia.mod.Mobs.Entity.AI;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIAttackMelee;

public class EntityAIBaseAttack extends EntityAIAttackMelee
{

    public EntityAIBaseAttack(EntityCreature creature, double speedIn, boolean useLongMemory)
    {
        super(creature, speedIn, useLongMemory);
    }
  
 
}
