package com.croparia.mod.Items;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.ModItems;

import net.minecraft.item.Item;

public class ItemMod extends Item{
	
	public ItemMod(String name) {
        ModItems.setItemName(this, name);
        setCreativeTab(Reference.TAB);
	}
}
