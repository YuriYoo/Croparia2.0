package com.croparia.mod.Items.Material;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModToolMaterial {
	 	public static ToolMaterial WOOD_MULTI = EnumHelper.addToolMaterial("wood_multi", 0, 59 * 4, 2.0F, 0.0F, 15);
	    public static ToolMaterial STONE_MULTI = EnumHelper.addToolMaterial("stone_multi", 1, 131 * 4, 4.0F, 1.0F, 5);
	    public static ToolMaterial IRON_MULTI = EnumHelper.addToolMaterial("iron_multi", 2, 250 * 4, 6.0F, 2.0F, 14);
	    public static ToolMaterial GOLD_MULTI = EnumHelper.addToolMaterial("gold_multi", 30, 32 * 4, 12.0F, 0.0F, 22);
	    public static ToolMaterial DIAMOND_MULTI = EnumHelper.addToolMaterial("diamond_multi", 3, 1561 * 4, 8.0F, 3.0F, 10);    
	    public static ToolMaterial OBSIDIAN = EnumHelper.addToolMaterial("obsidian_tool", 3, 3000, 12.0F, 5.0F, 12);
	    public static ToolMaterial OBSIDIAN_MULTI = EnumHelper.addToolMaterial("obsidian_multi", 3, 3000 * 4, 12.0F, 5.0F, 12);	    
	    public static ToolMaterial RENFORCED = EnumHelper.addToolMaterial("renforced_tool", 3, 6000, 24.0F, 10.0F, 24);
	    public static ToolMaterial RENFORCED_MULTI = EnumHelper.addToolMaterial("renforced_multi", 3, 6000 * 4, 24.0F, 10.0F, 24);	    
	    public static ToolMaterial ELEMENTAL = EnumHelper.addToolMaterial("elemental_tool", 3, 7500, 27.0F, 15.0F, 27);
	    public static ToolMaterial ELEMENTAL_MULTI = EnumHelper.addToolMaterial("elemental_multi", 3, 7500 * 4, 27.0F, 15.0F, 27);	    
	    public static ToolMaterial SCYTHE = EnumHelper.addToolMaterial("scythe_mat", 3, 1561, 8.0F, Float.MAX_VALUE, 0);
}
