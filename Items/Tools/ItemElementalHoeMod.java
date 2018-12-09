package com.croparia.mod.Items.Tools;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.ModItems;
import com.croparia.mod.Items.ItemMod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class ItemElementalHoeMod extends HoeCroparia
{

    public ItemElementalHoeMod(String name, ToolMaterial material)
    {
        super(material);
        ModItems.setItemName(this, name);
        setCreativeTab(Reference.TAB);
        
    }

	@Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
    {
		if(toRepair.getItem() == ModItems.WATER_HOE && repair.getItem() == ModItems.ELEMENTAL_WATER)
	        return true;
    	else if(toRepair.getItem() == ModItems.FIRE_HOE && repair.getItem() == ModItems.ELEMENTAL_FIRE)
	        return true;
    	else if(toRepair.getItem() == ModItems.EARTH_HOE && repair.getItem() == ModItems.ELEMENTAL_EARTH)
	        return true;
    	else if(toRepair.getItem() == ModItems.AIR_HOE && repair.getItem() == ModItems.ELEMENTAL_AIR)
	        return true;
    	else
    		return false;
    }
}
