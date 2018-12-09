package com.croparia.mod.Blocks;

import java.util.Random;

import javax.annotation.Nullable;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.ModBlocks;
import com.croparia.mod.Init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStem;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockStemMod extends BlockStem
{

	public Block crop;
	public String name;

	public BlockStemMod(Block crop, String name) 
	{
		super(crop);
		this.crop = crop;
		this.name = name;
		ModBlocks.setBlockName(this, name);
	}
	
	public Item getGreenHouseItem()
    {
		if (this.name == "stem_coal")
	    {
            return Item.getItemFromBlock(Blocks.OBSIDIAN);
	    }
		else
	    {
            return this.name == "stem_iron" ? Item.getItemFromBlock(Blocks.IRON_BLOCK) : 
            this.name == "stem_gold" ? Item.getItemFromBlock(Blocks.GOLD_BLOCK) : 
            this.name == "stem_redstone" ? Item.getItemFromBlock(Blocks.REDSTONE_BLOCK) : 
            this.name == "stem_lapis" ? Item.getItemFromBlock(Blocks.LAPIS_BLOCK) : 
            this.name == "stem_diamond" ? Item.getItemFromBlock(Blocks.DIAMOND_BLOCK) : 
            this.name == "stem_emerald" ? Item.getItemFromBlock(Blocks.EMERALD_BLOCK) : 
            this.name == "stem_sponge" ? Item.getItemFromBlock(Blocks.SPONGE) : 
            this.name == "stem_glass" ? Item.getItemFromBlock(Blocks.GLASS) : 
            this.name == "stem_brick" ? Item.getItemFromBlock(Blocks.BRICK_BLOCK) : 
            this.name == "stem_bookshelf" ? Item.getItemFromBlock(Blocks.BOOKSHELF) : 
            this.name == "stem_ice" ? Item.getItemFromBlock(Blocks.ICE) : 
            this.name == "stem_snow" ? Item.getItemFromBlock(Blocks.SNOW) : 
            this.name == "stem_clay" ? Item.getItemFromBlock(Blocks.CLAY) : 
            this.name == "stem_soulsand" ? Item.getItemFromBlock(Blocks.SOUL_SAND) : 
            this.name == "stem_glowstone" ? Item.getItemFromBlock(Blocks.GLOWSTONE) : 
            this.name == "stem_nether" ? Item.getItemFromBlock(Blocks.NETHER_BRICK) : 
            this.name == "stem_quartz" ? Item.getItemFromBlock(Blocks.QUARTZ_BLOCK) : 
            this.name == "stem_sealantern" ? Item.getItemFromBlock(Blocks.SEA_LANTERN) : 
            this.name == "stem_packedice" ? Item.getItemFromBlock(Blocks.PACKED_ICE) : 
            this.name == "stem_magma" ? Item.getItemFromBlock(Blocks.MAGMA) : 
            this.name == "stem_netherwart" ? Item.getItemFromBlock(Blocks.NETHER_WART_BLOCK) : 
            this.name == "stem_bone" ? Item.getItemFromBlock(Blocks.BONE_BLOCK) : 
            this.name == "stem_obsidian" ? Item.getItemFromBlock(Blocks.OBSIDIAN) : 
            this.name == "stem_end" ? Item.getItemFromBlock(Blocks.END_BRICKS) : 
            this.name == "stem_elemental" ? Item.getItemFromBlock(ModBlocks.ELEMENTAL_STONE) :  null;        
	    }
    }
	
	public Item getSeed()
	{
		return getSeedItem();
	}
	
	@Override
	protected Item getSeedItem() 
	{
		if (this.crop == ModBlocks.BLOCK_PLANT_COAL)
	    {
            return ModItems.COAL_SEED_STEM;
	    }
		else
	    {
            return this.crop == ModBlocks.BLOCK_PLANT_IRON ? ModItems.IRON_SEED_STEM :
            this.crop == ModBlocks.BLOCK_PLANT_GOLD ? ModItems.GOLD_SEED_STEM :
            this.crop == ModBlocks.BLOCK_PLANT_REDSTONE ? ModItems.REDSTONE_SEED_STEM :
            this.crop == ModBlocks.BLOCK_PLANT_LAPIS ? ModItems.LAPIS_SEED_STEM :
            this.crop == ModBlocks.BLOCK_PLANT_DIAMOND ? ModItems.DIAMOND_SEED_STEM :
            this.crop == ModBlocks.BLOCK_PLANT_EMERALD ? ModItems.EMERALD_SEED_STEM :
            this.crop == ModBlocks.BLOCK_PLANT_SPONGE ? ModItems.SPONGE_SEED_STEM :
            this.crop == ModBlocks.BLOCK_PLANT_GLASS ? ModItems.GLASS_SEED_STEM :
            this.crop == ModBlocks.BLOCK_PLANT_BRICK ? ModItems.BRICK_SEED_STEM :
            this.crop == ModBlocks.BLOCK_PLANT_BOOKSHELF ? ModItems.BOOKSHELF_SEED_STEM :
            this.crop == ModBlocks.BLOCK_PLANT_ICE ? ModItems.ICE_SEED_STEM :
            this.crop == ModBlocks.BLOCK_PLANT_SNOW ? ModItems.SNOW_SEED_STEM :
            this.crop == ModBlocks.BLOCK_PLANT_CLAY ? ModItems.CLAY_SEED_STEM :
            this.crop == ModBlocks.BLOCK_PLANT_SOULSAND ? ModItems.SOULSAND_SEED_STEM :
            this.crop == ModBlocks.BLOCK_PLANT_GLOWSTONE ? ModItems.GLOWSTONE_SEED_STEM :
            this.crop == ModBlocks.BLOCK_PLANT_NETHER ? ModItems.NETHER_SEED_STEM :
            this.crop == ModBlocks.BLOCK_PLANT_QUARTZ ? ModItems.QUARTZ_SEED_STEM :
            this.crop == ModBlocks.BLOCK_PLANT_SEALANTERN ? ModItems.SEALANTERN_SEED_STEM :
            this.crop == ModBlocks.BLOCK_PLANT_PACKEDICE ? ModItems.PACKEDICE_SEED_STEM :
            this.crop == ModBlocks.BLOCK_PLANT_MAGMA ? ModItems.MAGMA_SEED_STEM :
            this.crop == ModBlocks.BLOCK_PLANT_NETHERWART ? ModItems.NETHERWART_SEED_STEM :
            this.crop == ModBlocks.BLOCK_PLANT_BONE ? ModItems.BONE_SEED_STEM :
            this.crop == ModBlocks.BLOCK_PLANT_OBSIDIAN ? ModItems.OBSIDIAN_SEED_STEM :
            this.crop == ModBlocks.BLOCK_PLANT_END ? ModItems.END_SEED_STEM :
            this.crop == ModBlocks.BLOCK_PLANT_ELEMENTAL ? ModItems.ELEMENTAL_SEED_STEM : null;    
        }
	}
}