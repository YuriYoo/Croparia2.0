package com.croparia.mod.Items;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.ModItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;

public class ItemFireArmor extends ItemArmor
{
	public ItemFireArmor(String name, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, 0, equipmentSlotIn);
		ModItems.setItemName(this, name);
		this.setCreativeTab(Reference.TAB);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
    {
        if(this == ModItems.ELEMENTAL_FIRE_LEGS)
        {
            return Reference.MOD_ID + ":textures/models/armor/fire_layer_2.png";
        }
        
        else if (this == ModItems.ELEMENTAL_FIRE_HELMET || this == ModItems.ELEMENTAL_FIRE_CHEST || this == ModItems.ELEMENTAL_FIRE_FEET)
        {
            return Reference.MOD_ID + ":textures/models/armor/fire_layer_1.png";
        }
        else if(this == ModItems.FIRE_GEM_LEGS)
        {
            return Reference.MOD_ID + ":textures/models/armor/fire_gem_layer_2.png";
        }
        
        else if (this == ModItems.FIRE_GEM_HELMET || this == ModItems.FIRE_GEM_CHEST || this == ModItems.FIRE_GEM_FEET)
        {
            return Reference.MOD_ID + ":textures/models/armor/fire_gem_layer_1.png";
        }
		return null;
	}
	public boolean getIsRepairable(ItemStack input, ItemStack repair)
    {
        if(input.getItem() == ModItems.ELEMENTAL_FIRE_HELMET)
        {
            if(repair.getItem() == ModItems.ELEMENTAL_FIRE)
            {
                return true;
            }
        }
        else if(input.getItem() ==ModItems.ELEMENTAL_FIRE_CHEST)
        {
            if(repair.getItem() == ModItems.ELEMENTAL_FIRE)
            {
                return true;
            }
        } 
        else if(input.getItem() ==ModItems.ELEMENTAL_FIRE_LEGS)
        {
            if(repair.getItem() == ModItems.ELEMENTAL_FIRE)
            {
                return true;
            }
        }
        else if(input.getItem() ==ModItems.ELEMENTAL_FIRE_FEET)
        {
            if(repair.getItem() == ModItems.ELEMENTAL_FIRE)
            {
                return true;
            }
        }
        else if(input.getItem() == ModItems.FIRE_GEM_HELMET)
        {
            if(repair.getItem() == ModItems.FIRE_GEM)
            {
                return true;
            }
        }
        else if(input.getItem() ==ModItems.FIRE_GEM_CHEST)
        {
            if(repair.getItem() == ModItems.FIRE_GEM)
            {
                return true;
            }
        } 
        else if(input.getItem() ==ModItems.FIRE_GEM_LEGS)
        {
            if(repair.getItem() == ModItems.FIRE_GEM)
            {
                return true;
            }
        }
        else if(input.getItem() ==ModItems.FIRE_GEM_FEET)
        {
            if(repair.getItem() == ModItems.FIRE_GEM)
            {
                return true;
            }
        }
       return false;
   }
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack)
    {	
		ItemStack head = player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
    	ItemStack chest = player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
    	ItemStack legs = player.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
    	ItemStack feet = player.getItemStackFromSlot(EntityEquipmentSlot.FEET);	
    	
    	if(legs.getItem() == ModItems.ELEMENTAL_FIRE_LEGS)
    		player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 220, 0));	
		if (legs.getItem() == ModItems.FIRE_GEM_LEGS || head.getItem() == ModItems.FIRE_GEM_HELMET || chest.getItem() == ModItems.FIRE_GEM_CHEST || feet.getItem() == ModItems.FIRE_GEM_FEET)
			player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 220, 3));			
        if (head != null && head.getItem() == ModItems.FIRE_GEM_HELMET && chest != null && chest.getItem() == ModItems.FIRE_GEM_CHEST && legs != null && legs.getItem() == ModItems.FIRE_GEM_LEGS && feet != null && feet.getItem() == ModItems.FIRE_GEM_FEET)
			player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 220, 2));					 
	}
}
