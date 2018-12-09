package com.croparia.mod.Items.Relics;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.ModItems;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemInfiniteApple extends ItemFood {
	public ItemInfiniteApple(String name)
	{
		super(6, 1.8F, false);
		ModItems.setItemName(this, name);
		setMaxStackSize(1);
		setCreativeTab(Reference.TAB);
	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
	{
       if (entityLiving instanceof EntityPlayer)
       {
           EntityPlayer entityplayer = (EntityPlayer)entityLiving;
           entityplayer.getFoodStats().addStats(this, stack);
           worldIn.playSound((EntityPlayer)null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.PLAYERS, 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
           this.onFoodEaten(stack, worldIn, entityplayer);
           entityplayer.addStat(StatList.getObjectUseStats(this));

           if (entityplayer instanceof EntityPlayerMP)
           {
               CriteriaTriggers.CONSUME_ITEM.trigger((EntityPlayerMP)entityplayer, stack);
           }
       }
       return stack;
	}
}
