package com.croparia.mod.Items;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;

public class ItemSeedMod extends ItemSeeds {
	
	
	public ItemSeedMod(Block crops, Block soil, String name) 
	{
		super(crops, soil); 
        ModItems.setItemName(this, name);
        setCreativeTab(Reference.TAB);
	}

}
