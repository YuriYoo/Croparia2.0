package com.croparia.mod.Items.Material;

import com.croparia.mod.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModArmorMaterial {
	public static ArmorMaterial OBSIDIAN = EnumHelper.addArmorMaterial("obsidian_mod", Reference.MOD_ID + ":obsidian_mod", 40, new int[] {5, 8, 10, 5}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
    public static ArmorMaterial RENFORCED = EnumHelper.addArmorMaterial("renforced_mod", Reference.MOD_ID + ":renforced_mod", 40 * 2, new int[] {5 * 2, 8 * 2, 10 * 2, 5 * 2}, 12 * 2, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F);
    public static ArmorMaterial ELEMENTAL = EnumHelper.addArmorMaterial("elemental_mod", Reference.MOD_ID + ":elemental_mod", 40 * 3, new int[] {5 * 3, 8 * 3, 10 * 3, 5 * 3}, 12 * 3, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 6.0F);
    public static ArmorMaterial GEM = EnumHelper.addArmorMaterial("gem", Reference.MOD_ID + ":gem", 40 * 4, new int[] {5 * 4, 8 * 4, 10 * 4, 5 * 4}, 12 * 4, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 8.0F);
    public static ArmorMaterial MASK = EnumHelper.addArmorMaterial("mask", Reference.MOD_ID + ":mask", 40 * 3, new int[] {0, 0, 0, 0}, 0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 6.0F);
   
}
