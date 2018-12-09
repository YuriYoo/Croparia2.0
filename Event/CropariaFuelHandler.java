package com.croparia.mod.Event;

import com.croparia.mod.Init.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class CropariaFuelHandler implements IFuelHandler{
	
	@Override
	public int getBurnTime(ItemStack fuel) 
	{
		if(fuel.getItem() == ModItems.COAL_FRUIT || fuel.getItem() == ModItems.CHARCOAL_FRUIT || fuel.getItem() == ModItems.COAL_SEED || fuel.getItem() == ModItems.CHARCOAL_SEED)
		{
			return 1600;
		}
		
		else if(fuel.getItem() == ModItems.WOOD_MULTITOOL)
		{
			return 200;
		}
		
		else if(fuel.getItem() == ModItems.ELEMENTAL_FIRE)
		{
			return 80000;
		}
		
	/*	else if(fuel.getItem() == ModItems.eternal_fire)
		{
			return 999999999;
		}
		*/
		return 0;
	}

}
