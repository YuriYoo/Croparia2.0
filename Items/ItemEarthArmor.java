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

public class ItemEarthArmor extends ItemArmor
{
	public ItemEarthArmor(String name, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, 0, equipmentSlotIn);
		ModItems.setItemName(this, name);
		this.setCreativeTab(Reference.TAB);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
    {
        if(this == ModItems.ELEMENTAL_EARTH_LEGS)
        {
            return Reference.MOD_ID + ":textures/models/armor/earth_layer_2.png";
        }
        
        else if (this == ModItems.ELEMENTAL_EARTH_HELMET || this == ModItems.ELEMENTAL_EARTH_CHEST || this == ModItems.ELEMENTAL_EARTH_FEET)
        {
            return Reference.MOD_ID + ":textures/models/armor/earth_layer_1.png";
        }
        else if(this == ModItems.EARTH_GEM_LEGS)
        {
            return Reference.MOD_ID + ":textures/models/armor/earth_gem_layer_2.png";
        }
        
        else if (this == ModItems.EARTH_GEM_HELMET || this == ModItems.EARTH_GEM_CHEST || this == ModItems.EARTH_GEM_FEET)
        {
            return Reference.MOD_ID + ":textures/models/armor/earth_gem_layer_1.png";
        }
		return null;
	}
	public boolean getIsRepairable(ItemStack input, ItemStack repair)
    {
        if(input.getItem() == ModItems.ELEMENTAL_EARTH_HELMET)
        {
            if(repair.getItem() == ModItems.ELEMENTAL_EARTH)
            {
                return true;
            }
        }
        else if(input.getItem() ==ModItems.ELEMENTAL_EARTH_CHEST)
        {
            if(repair.getItem() == ModItems.ELEMENTAL_EARTH)
            {
                return true;
            }
        } 
        else if(input.getItem() ==ModItems.ELEMENTAL_EARTH_LEGS)
        {
            if(repair.getItem() == ModItems.ELEMENTAL_EARTH)
            {
                return true;
            }
        }
        else if(input.getItem() ==ModItems.ELEMENTAL_EARTH_FEET)
        {
            if(repair.getItem() == ModItems.ELEMENTAL_EARTH)
            {
                return true;
            }
        }
        else if(input.getItem() == ModItems.EARTH_GEM_HELMET)
        {
            if(repair.getItem() == ModItems.EARTH_GEM)
            {
                return true;
            }
        }
        else if(input.getItem() ==ModItems.EARTH_GEM_CHEST)
        {
            if(repair.getItem() == ModItems.EARTH_GEM)
            {
                return true;
            }
        } 
        else if(input.getItem() ==ModItems.EARTH_GEM_LEGS)
        {
            if(repair.getItem() == ModItems.EARTH_GEM)
            {
                return true;
            }
        }
        else if(input.getItem() ==ModItems.EARTH_GEM_FEET)
        {
            if(repair.getItem() == ModItems.EARTH_GEM)
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
		if ((head.getItem() == ModItems.EARTH_GEM_HELMET) || (chest.getItem() == ModItems.EARTH_GEM_CHEST) || (legs.getItem() == ModItems.EARTH_GEM_LEGS) || (feet.getItem() == ModItems.EARTH_GEM_FEET)){
			player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 220, 2));				
        } 
        if (player.getHealth() < 9 && head != null && head.getItem() == ModItems.EARTH_GEM_HELMET && chest != null && chest.getItem() == ModItems.EARTH_GEM_CHEST && legs != null && legs.getItem() == ModItems.EARTH_GEM_LEGS && feet != null && feet.getItem() == ModItems.EARTH_GEM_FEET) {
			player.setHealth(11);		
        } 
	}
}
