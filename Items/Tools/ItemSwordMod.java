package com.croparia.mod.Items.Tools;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemSwordMod extends ItemSword
{
	
    public ItemSwordMod(String name, ToolMaterial material)
    {
        super(material);
        ModItems.setItemName(this, name);
        setCreativeTab(Reference.TAB);    
    }
    
	@Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
    {
    	if(toRepair.getItem() == ModItems.OBSIDIAN_SWORD && repair.getItem() == Item.getItemFromBlock(Blocks.OBSIDIAN))
	        return true;
    	else if(toRepair.getItem() == ModItems.RENFORCED_SWORD && repair.getItem() == Items.DIAMOND)
	        return true;
    	else if(toRepair.getItem() == ModItems.WATER_SWORD && repair.getItem() == ModItems.ELEMENTAL_WATER)
	        return true;
    	else if(toRepair.getItem() == ModItems.FIRE_SWORD && repair.getItem() == ModItems.ELEMENTAL_FIRE)
	        return true;
    	else if(toRepair.getItem() == ModItems.EARTH_SWORD && repair.getItem() == ModItems.ELEMENTAL_EARTH)
	        return true;
    	else if(toRepair.getItem() == ModItems.AIR_SWORD && repair.getItem() == ModItems.ELEMENTAL_AIR)
	        return true;
    	else
    		return false;
    }
}
