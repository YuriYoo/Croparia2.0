package com.croparia.mod.Items;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.ModItems;

import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemModArmor extends ItemArmor 
{

	public ItemModArmor(String name, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, 0, equipmentSlotIn);
		ModItems.setItemName(this, name);
		setCreativeTab(Reference.TAB);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) 
	{
		if(this == ModItems.OBSIDIAN_LEGS)
        {
            return Reference.MOD_ID + ":textures/models/armor/obsidian_layer_2.png";
        }
        else if (this == ModItems.OBSIDIAN_HELMET || this == ModItems.OBSIDIAN_CHEST || this == ModItems.OBSIDIAN_FEET)
        {
            return Reference.MOD_ID + ":textures/models/armor/obsidian_layer_1.png";
        }
        else if(this == ModItems.RENFORCED_LEGS)
        {
            return Reference.MOD_ID + ":textures/models/armor/renforced_layer_2.png";
        }
        else if (this == ModItems.RENFORCED_HELMET || this == ModItems.RENFORCED_CHEST || this == ModItems.RENFORCED_FEET)
        {
            return Reference.MOD_ID + ":textures/models/armor/renforced_layer_1.png";
        }
		return null;
	}
	
	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
	{
		if(toRepair == new ItemStack(ModItems.OBSIDIAN_HELMET) || toRepair == new ItemStack(ModItems.OBSIDIAN_CHEST) || toRepair == new ItemStack(ModItems.OBSIDIAN_LEGS) || toRepair == new ItemStack(ModItems.OBSIDIAN_FEET))
    	{
    		if(repair.getItem() == Item.getItemFromBlock(Blocks.OBSIDIAN))
    		{
    			return true;
    		}
    		return false;
    	}
		else if(toRepair == new ItemStack(ModItems.RENFORCED_HELMET) || toRepair == new ItemStack(ModItems.RENFORCED_CHEST) || toRepair == new ItemStack(ModItems.RENFORCED_LEGS) || toRepair == new ItemStack(ModItems.RENFORCED_FEET))
    	{
    		if(repair.getItem() == Items.DIAMOND)
    		{
    			return true;
    		}
    		return false;
    	}
		return false;
	}
}
