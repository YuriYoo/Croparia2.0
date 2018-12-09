package com.croparia.mod.Items.Tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemPestle extends Item
{
	public ItemPestle() {
		this.maxStackSize = 1;
	}
	
	@Override
	public Item getContainerItem() {
		return this;
	}
}
