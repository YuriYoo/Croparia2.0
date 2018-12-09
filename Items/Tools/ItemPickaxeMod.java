package com.croparia.mod.Items.Tools;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemPickaxeMod extends ItemPickaxe
{

	
    public ItemPickaxeMod(String name, ToolMaterial material)
    {
        super(material);
        ModItems.setItemName(this, name);
        setCreativeTab(Reference.TAB);
        
    }
    
	@Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
    {
    	if(toRepair.getItem() == ModItems.OBSIDIAN_PICKAXE && repair.getItem() == Item.getItemFromBlock(Blocks.OBSIDIAN))
	        return true;
    	else if(toRepair.getItem() == ModItems.RENFORCED_PICKAXE && repair.getItem() == Items.DIAMOND)
	        return true;
    	else if(toRepair.getItem() == ModItems.WATER_PICKAXE && repair.getItem() == ModItems.ELEMENTAL_WATER)
	        return true;
    	else if(toRepair.getItem() == ModItems.FIRE_PICKAXE && repair.getItem() == ModItems.ELEMENTAL_FIRE)
	        return true;
    	else if(toRepair.getItem() == ModItems.EARTH_PICKAXE && repair.getItem() == ModItems.ELEMENTAL_EARTH)
	        return true;
    	else if(toRepair.getItem() == ModItems.AIR_PICKAXE && repair.getItem() == ModItems.ELEMENTAL_AIR)
	        return true;
    	else
    		return false;
    }
}
