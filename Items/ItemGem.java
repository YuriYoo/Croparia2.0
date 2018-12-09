package com.croparia.mod.Items;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.ModItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class ItemGem  extends Item{
	
	public String name;
	
	public ItemGem(String name)
	{
		ModItems.setItemName(this, name);
		setCreativeTab(Reference.TAB);
		this.name = name;
	}
	
	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) 
	{
		if(entityIn instanceof EntityPlayer)
		{
			if(name == "water_gem")
			{
				if(((EntityPlayer) entityIn).getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ModItems.ELEMENTAL_WATER_HELMET || ((EntityPlayer) entityIn).getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ModItems.WATER_GEM_HELMET)	
				{}
				else
					entityIn.attackEntityFrom(DamageSource.DROWN, 1F);
			}
			else if(name == "fire_gem")
			{
				if(((EntityPlayer) entityIn).getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ModItems.ELEMENTAL_FIRE_HELMET || ((EntityPlayer) entityIn).getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ModItems.FIRE_GEM_HELMET)	
				{}
				else
					entityIn.attackEntityFrom(DamageSource.LAVA, 1F);
			}
			else if(name == "earth_gem")
			{
				if(((EntityPlayer) entityIn).getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ModItems.ELEMENTAL_EARTH_HELMET || ((EntityPlayer) entityIn).getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ModItems.EARTH_GEM_HELMET)	
				{}
				else
					entityIn.attackEntityFrom(DamageSource.IN_WALL, 1F);
			}
			else if(name == "air_gem")
			{
				if(((EntityPlayer) entityIn).getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ModItems.ELEMENTAL_AIR_HELMET || ((EntityPlayer) entityIn).getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ModItems.AIR_GEM_HELMET)	
				{}
				else
					entityIn.attackEntityFrom(DamageSource.FALL, 1F);
			}
		}
	}
}