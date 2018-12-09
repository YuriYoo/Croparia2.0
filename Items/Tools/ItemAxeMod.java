package com.croparia.mod.Items.Tools;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.ModItems;
import com.croparia.mod.Items.ItemMod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ItemAxeMod extends ItemAxe
{
    public ItemAxeMod(String name, ToolMaterial material, float damage, float speed)
    {
        super(material, damage, speed);
        ModItems.setItemName(this, name);
        setCreativeTab(Reference.TAB);
        
    }
      
	@Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
    {
    	if(toRepair.getItem() == ModItems.OBSIDIAN_AXE && repair.getItem() == Item.getItemFromBlock(Blocks.OBSIDIAN))
	        return true;
    	else if(toRepair.getItem() == ModItems.RENFORCED_AXE && repair.getItem() == Items.DIAMOND)
	        return true;
    	else if(toRepair.getItem() == ModItems.WATER_AXE && repair.getItem() == ModItems.ELEMENTAL_WATER)
	        return true;
    	else if(toRepair.getItem() == ModItems.FIRE_AXE && repair.getItem() == ModItems.ELEMENTAL_FIRE)
	        return true;
    	else if(toRepair.getItem() == ModItems.EARTH_AXE && repair.getItem() == ModItems.ELEMENTAL_EARTH)
	        return true;
    	else if(toRepair.getItem() == ModItems.AIR_AXE && repair.getItem() == ModItems.ELEMENTAL_AIR)
	        return true;
    	else
    		return false;
    }
    
}
