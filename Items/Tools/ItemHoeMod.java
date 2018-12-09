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

public class ItemHoeMod extends HoeCroparia
{

    public ItemHoeMod(String name, ToolMaterial material)
    {
        super(material);
        ModItems.setItemName(this, name);
        setCreativeTab(Reference.TAB);
        
    }

	@Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
    {
    	if(toRepair.getItem() == ModItems.OBSIDIAN_HOE && repair.getItem() == Item.getItemFromBlock(Blocks.OBSIDIAN))
	        return true;
    	else if(toRepair.getItem() == ModItems.RENFORCED_HOE && repair.getItem() == Items.DIAMOND)
	        return true;
    	else
    		return false;
    }
}
