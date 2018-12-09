package com.croparia.mod.Blocks;

import java.util.Random;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.ModBlocks;
import com.croparia.mod.Init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class BlockPlantMod extends Block
{
	private String name;
	
	public BlockPlantMod(String name) {
		super(Material.PLANTS, MapColor.LIME);
		this.setCreativeTab(Reference.TAB);
		ModBlocks.setBlockName(this, name);
		this.name = name;
		this.setHardness(1.0F);
		this.setSoundType(SoundType.PLANT);
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
		if (this.name == "block_plant_coal")
	    {
            return Item.getItemFromBlock(Blocks.COAL_BLOCK);
	    }
		else
	    {
            return this.name == "block_plant_iron" ? Item.getItemFromBlock(Blocks.IRON_BLOCK) : 
            this.name == "block_plant_gold" ? Item.getItemFromBlock(Blocks.GOLD_BLOCK) : 
            this.name == "block_plant_redstone" ? Item.getItemFromBlock(Blocks.REDSTONE_BLOCK) : 
            this.name == "block_plant_lapis" ? Item.getItemFromBlock(Blocks.LAPIS_BLOCK) : 
            this.name == "block_plant_diamond" ? Item.getItemFromBlock(Blocks.DIAMOND_BLOCK) : 
            this.name == "block_plant_emerald" ? Item.getItemFromBlock(Blocks.EMERALD_BLOCK) : 
            this.name == "block_plant_sponge" ? Item.getItemFromBlock(Blocks.SPONGE) : 
            this.name == "block_plant_glass" ? Item.getItemFromBlock(Blocks.GLASS) : 
            this.name == "block_plant_brick" ? Item.getItemFromBlock(Blocks.BRICK_BLOCK) : 
            this.name == "block_plant_bookshelf" ? Item.getItemFromBlock(Blocks.BOOKSHELF) : 
            this.name == "block_plant_ice" ? Item.getItemFromBlock(Blocks.ICE) : 
            this.name == "block_plant_snow" ? Item.getItemFromBlock(Blocks.SNOW) : 
            this.name == "block_plant_clay" ? Item.getItemFromBlock(Blocks.CLAY) : 
            this.name == "block_plant_soulsand" ? Item.getItemFromBlock(Blocks.SOUL_SAND) : 
            this.name == "block_plant_glowstone" ? Item.getItemFromBlock(Blocks.GLOWSTONE) : 
            this.name == "block_plant_nether" ? Item.getItemFromBlock(Blocks.NETHER_BRICK) : 
            this.name == "block_plant_quartz" ? Item.getItemFromBlock(Blocks.QUARTZ_BLOCK) : 
            this.name == "block_plant_sealantern" ? Item.getItemFromBlock(Blocks.SEA_LANTERN) : 
            this.name == "block_plant_packedice" ? Item.getItemFromBlock(Blocks.PACKED_ICE) : 
            this.name == "block_plant_magma" ? Item.getItemFromBlock(Blocks.MAGMA) : 
            this.name == "block_plant_netherwart" ? Item.getItemFromBlock(Blocks.NETHER_WART_BLOCK) : 
            this.name == "block_plant_bone" ? Item.getItemFromBlock(Blocks.BONE_BLOCK) : 
            this.name == "block_plant_obsidian" ? Item.getItemFromBlock(Blocks.OBSIDIAN) : 
            this.name == "block_plant_end" ? Item.getItemFromBlock(Blocks.END_BRICKS) : 
            this.name == "block_plant_elemental" ? Item.getItemFromBlock(ModBlocks.ELEMENTAL_STONE) :  null;        
	    }
    }
	
	public int quantityDropped(Random random)
    {
        return 1;
    }

}