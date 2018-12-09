package com.croparia.mod.Blocks;

import java.util.List;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.ModBlocks;
import com.croparia.mod.Init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockFarmland;
import net.minecraft.block.IGrowable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockCropMod  extends BlockCrops implements IGrowable
{
	
	private String name;
	private boolean more;
	private Block block = null;
	private IBlockState state = null;
	public BlockCropMod(String name, Block block) 
	{
		super();
		this.name = name;
		ModBlocks.setBlockName(this, name);
		setCreativeTab(Reference.TAB);
		this.block = block; 
	}
	
	public BlockCropMod(String name) 
	{
		super();
		this.name = name;
		ModBlocks.setBlockName(this, name);
		setCreativeTab(Reference.TAB);
	}
	
	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
		super.onBlockHarvested(worldIn, pos, state, player);
		if(block != null)
		{	
			if(worldIn.getBlockState(pos.down(2)).getBlock() == block)		
			{
				more = true;
				System.out.print("under is ok");
			}
			else 	
			{
				more = false;
				System.out.print("go dead");
			}
		}
	}
	
	public Item getItemSeed()
	{
		return getSeed();
	}
	
	public Item getItemCrop()
	{
		return getCrop();
	}

	@Override
	protected Item getSeed() 
	{
		if(name == "block_crop_coal")
		{
			return ModItems.COAL_SEED;
		}
		else
			return 	this.name == "block_crop_iron" ? ModItems.IRON_SEED : 
					this.name == "block_crop_gold" ? ModItems.GOLD_SEED : 
					this.name == "block_crop_redstone" ? ModItems.REDSTONE_SEED : 
					this.name == "block_crop_lapis" ? ModItems.LAPIS_SEED : 
					this.name == "block_crop_diamond" ? ModItems.DIAMOND_SEED : 
					this.name == "block_crop_emerald" ? ModItems.EMERALD_SEED :  
					this.name == "block_crop_elemental" ? ModItems.ELEMENTAL_SEED :  
					this.name == "block_crop_clay" ? ModItems.CLAY_SEED :  
					this.name == "block_crop_glowstone" ? ModItems.GLOWSTONE_SEED :  
					this.name == "block_crop_quartz" ? ModItems.QUARTZ_SEED :  
					this.name == "block_crop_shard" ? ModItems.SHARD_SEED :  
					this.name == "block_crop_crystal" ? ModItems.CRYSTAL_SEED :  
					this.name == "block_crop_paper" ? ModItems.PAPER_SEED : 
					this.name == "block_crop_sugar" ? ModItems.SUGAR_SEED : 
					this.name == "block_crop_charcoal" ? ModItems.CHARCOAL_SEED :  
					this.name == "block_crop_flint" ? ModItems.FLINT_SEED : 
					this.name == "block_crop_snowball" ? ModItems.SNOWBALL_SEED :  
					this.name == "block_crop_firework" ? ModItems.FIREWORK_SEED : 
					this.name == "block_crop_nether" ? ModItems.NETHER_SEED :  
					this.name == "block_crop_bottle" ? ModItems.BOTTLE_SEED : 
					this.name == "block_crop_totem" ? ModItems.TOTEM_SEED : 
					this.name == "block_crop_lead2" ? ModItems.LEAD2_SEED : 
					this.name == "block_crop_nametag" ? ModItems.NAMETAG_SEED : 
					this.name == "block_crop_xp" ? ModItems.XP_SEED :
					this.name == "block_crop_ender" ? ModItems.ENDER_SEED : 
					this.name == "block_crop_bone" ? ModItems.BONE_SEED : 
					this.name == "block_crop_eye" ? ModItems.EYE_SEED : 
					this.name == "block_crop_powder" ? ModItems.POWDER_SEED : 
					this.name == "block_crop_blaze" ? ModItems.BLAZE_SEED : 
					this.name == "block_crop_ghast" ? ModItems.GHAST_SEED : 
					this.name == "block_crop_magma" ? ModItems.MAGMA_SEED : 
					this.name == "block_crop_shell" ? ModItems.SHELL_SEED : 
					this.name == "block_crop_slime" ? ModItems.SLIME_SEED : 
					this.name == "block_crop_star" ? ModItems.STAR_SEED : 
					this.name == "block_crop_string" ? ModItems.STRING_SEED : 
					this.name == "block_crop_zombie" ? ModItems.ZOMBIE_SEED : 	
					this.name == "block_crop_apple" ? ModItems.APPLE_SEED : 
					this.name == "block_crop_goldenapple" ? ModItems.GOLDENAPPLE_SEED :
					this.name == "block_crop_bread" ? ModItems.BREAD_SEED : 
					this.name == "block_crop_egg" ? ModItems.EGG_SEED :
					this.name == "block_crop_clownfish" ? ModItems.CLOWNFISH_SEED : 
					this.name == "block_crop_pufferfish" ? ModItems.PUFFERFISH_SEED : 
					this.name == "block_crop_cookie" ? ModItems.COOKIE_SEED : 
					this.name == "block_crop_chorus" ? ModItems.CHORUS_SEED : 
					this.name == "block_crop_rawporc" ? ModItems.RAWPORC_SEED : 
					this.name == "block_crop_rawbeef" ? ModItems.RAWBEEF_SEED : 
					this.name == "block_crop_fish" ? ModItems.FISH_SEED : 
					this.name == "block_crop_salmon" ? ModItems.SALMON_SEED : 
					this.name == "block_crop_rawchicken" ? ModItems.RAWCHICKEN_SEED : 
					this.name == "block_crop_rawrabbit" ? ModItems.RAWRABBIT_SEED : 
					this.name == "block_crop_rawmutton" ? ModItems.RAWMUTTON_SEED :				
					this.name == "block_crop_orange" ? ModItems.ORANGE_SEED :
					this.name == "block_crop_magenta" ? ModItems.MAGENTA_SEED :
					this.name == "block_crop_lightblue" ? ModItems.LIGHTBLUE_SEED :
					this.name == "block_crop_yellow" ? ModItems.YELLOW_SEED :
					this.name == "block_crop_lime" ? ModItems.LIME_SEED :
					this.name == "block_crop_pink" ? ModItems.PINK_SEED :
					this.name == "block_crop_gray" ? ModItems.GRAY_SEED :
					this.name == "block_crop_silver" ? ModItems.SILVER_SEED :
					this.name == "block_crop_cyan" ? ModItems.CYAN_SEED :
					this.name == "block_crop_purple" ? ModItems.PURPLE_SEED :
					this.name == "block_crop_brown" ? ModItems.BROWN_SEED :
					this.name == "block_crop_green" ? ModItems.GREEN_SEED :
					this.name == "block_crop_red" ? ModItems.RED_SEED :
					this.name == "block_crop_black" ? ModItems.BLACK_SEED :	
					this.name == "block_crop_vine" ? ModItems.VINE_SEED :
					this.name == "block_crop_lilypad" ? ModItems.LILYPAD_SEED :
					this.name == "block_crop_tallgrass" ? ModItems.TALLGRASS_SEED :
					this.name == "block_crop_largefern" ? ModItems.LARGEFERN_SEED :
					this.name == "block_crop_bush" ? ModItems.BUSH_SEED :
					this.name == "block_crop_grass1" ? ModItems.GRASS1_SEED :
					this.name == "block_crop_fern" ? ModItems.FERN_SEED :
					this.name == "block_crop_oak" ? ModItems.OAK_SEED :
					this.name == "block_crop_birch" ? ModItems.BIRCH_SEED :
					this.name == "block_crop_spruce" ? ModItems.SPRUCE_SEED :
					this.name == "block_crop_jungle" ? ModItems.JUNGLE_SEED :
					this.name == "block_crop_darkoak" ? ModItems.DARKOAK_SEED :
					this.name == "block_crop_acacia" ? ModItems.ACACIA_SEED :
					this.name == "block_crop_leather" ? ModItems.LEATHER_SEED :
					this.name == "block_crop_feather" ? ModItems.FEATHER_SEED :
					this.name == "block_crop_hide" ? ModItems.HIDE_SEED :
					this.name == "block_crop_foot" ? ModItems.FOOT_SEED :

					this.name == "apricot_crop" ? ModItems.APRICOT :
					this.name == "banana_crop" ? ModItems.BANANA :
					this.name == "cherry_crop" ? ModItems.CHERRY :
					this.name == "kiwi_crop" ? ModItems.KIWI :
					this.name == "lemon_crop" ? ModItems.LEMON :
					this.name == "orange_crop" ? ModItems.ORANGE :
					this.name == "pear_crop" ? ModItems.PEAR :
					
					this.name == "block_crop_aluminium" ? ModItems.ALUMINIUM_SEED : 
					this.name == "block_crop_brass" ? ModItems.BRASS_SEED : 
					this.name == "block_crop_bronze" ? ModItems.BRONZE_SEED :  
					this.name == "block_crop_chrome" ? ModItems.CHROME_SEED : 
					this.name == "block_crop_copper" ? ModItems.COPPER_SEED :  						
					this.name == "block_crop_electrum" ? ModItems.ELECTRUM_SEED : 
					this.name == "block_crop_invar" ? ModItems.INVAR_SEED :  
					this.name == "block_crop_iridium" ? ModItems.IRIDIUM_SEED : 
					this.name == "block_crop_lead" ? ModItems.LEAD_SEED : 
					this.name == "block_crop_nickel" ? ModItems.NICKEL_SEED : 					
					this.name == "block_crop_platinium" ? ModItems.PLATINIUM_SEED : 
					this.name == "block_crop_silveringot" ? ModItems.SILVERINGOT_SEED :
					this.name == "block_crop_steel" ? ModItems.STEEL_SEED : 
					this.name == "block_crop_tin" ? ModItems.TIN_SEED : 
					this.name == "block_crop_titanium" ? ModItems.TITANIUM_SEED :  						
					this.name == "block_crop_tungsten" ? ModItems.TUNGSTEN_SEED : 
					this.name == "block_crop_zinc" ? ModItems.ZINC_SEED :  
					this.name == "block_crop_manasteel" ? ModItems.MANASTEEL_SEED : 
					this.name == "block_crop_terrasteel" ? ModItems.TERRASTEEL_SEED :  
					this.name == "block_crop_manadiamond" ? ModItems.MANADIAMOND_SEED : 
					this.name == "block_crop_manapearl" ? ModItems.MANAPEARL_SEED : 
					this.name == "block_crop_elementium" ? ModItems.ELEMENTIUM_SEED : 
					this.name == "block_crop_dragonstone" ? ModItems.DRAGONSTONE_SEED : 
					this.name == "block_crop_gearwood" ? ModItems.GEARWOOD_SEED : 
					this.name == "block_crop_gearstone" ? ModItems.GEARSTONE_SEED :
					this.name == "block_crop_geariron" ? ModItems.GEARIRON_SEED :  						
					this.name == "block_crop_geargold" ? ModItems.GEARGOLD_SEED : 
					this.name == "block_crop_geardiamond" ? ModItems.GEARDIAMOND_SEED :  
					this.name == "block_crop_yellorium" ? ModItems.YELLORIUM_SEED : 
					this.name == "block_crop_blutonium" ? ModItems.BLUTONIUM_SEED : 
					this.name == "block_crop_cyanite" ? ModItems.CYANITE_SEED : 						
					this.name == "block_crop_graphite" ? ModItems.GRAPHITE_SEED : 
					this.name == "block_crop_ludicrite" ? ModItems.LUDICRITE_SEED :
					this.name == "block_crop_enderium" ? ModItems.ENDERIUM_SEED : 
					this.name == "block_crop_lumium" ? ModItems.LUMIUM_SEED : 
					this.name == "block_crop_signalum" ? ModItems.SIGNALUM_SEED :  						
					this.name == "block_crop_constantan" ? ModItems.CONSTANTAN_SEED : 
					this.name == "block_crop_mithril" ? ModItems.MITHRIL_SEED :  
					this.name == "block_crop_uranium" ? ModItems.URANIUM_SEED : 
					this.name == "block_crop_apatite" ? ModItems.APATITE_SEED :  
					this.name == "block_crop_silicon" ? ModItems.SILICON_SEED : 						
					this.name == "block_crop_draconium" ? ModItems.DRACONIUM_SEED : 
					this.name == "block_crop_draconium_awakened" ? ModItems.DRACONIUM_AWAKENED_SEED : 
					this.name == "block_crop_osmium" ? ModItems.OSMIUM_SEED : 
					this.name == "block_crop_gaia" ? ModItems.GAIA_SEED : null;
	}
	
	@Override
	protected Item getCrop() 
	{
		if(name == "block_crop_coal")
		{
			return ModItems.COAL_FRUIT;
		}
		else
			return 	this.name == "block_crop_iron" ? ModItems.IRON_FRUIT : 
					this.name == "block_crop_gold" ? ModItems.GOLD_FRUIT : 
					this.name == "block_crop_redstone" ? ModItems.REDSTONE_FRUIT : 
					this.name == "block_crop_lapis" ? ModItems.LAPIS_FRUIT : 
					this.name == "block_crop_diamond" ? ModItems.DIAMOND_FRUIT : 
					this.name == "block_crop_emerald" ? ModItems.EMERALD_FRUIT : 
					this.name == "block_crop_elemental" ? ModItems.ELEMENTAL_FRUIT : 
					this.name == "block_crop_clay" ? ModItems.CLAY_FRUIT :  
					this.name == "block_crop_glowstone" ? ModItems.GLOWSTONE_FRUIT :  
					this.name == "block_crop_quartz" ? ModItems.QUARTZ_FRUIT :  
					this.name == "block_crop_shard" ? ModItems.SHARD_FRUIT :  
					this.name == "block_crop_crystal" ? ModItems.CRYSTAL_FRUIT :  
					this.name == "block_crop_paper" ? ModItems.PAPER_FRUIT : 
					this.name == "block_crop_sugar" ? ModItems.SUGAR_FRUIT : 
					this.name == "block_crop_charcoal" ? ModItems.CHARCOAL_FRUIT :  
					this.name == "block_crop_flint" ? ModItems.FLINT_FRUIT : 
					this.name == "block_crop_snowball" ? ModItems.SNOWBALL_FRUIT :  
					this.name == "block_crop_firework" ? ModItems.FIREWORK_FRUIT : 
					this.name == "block_crop_nether" ? ModItems.NETHER_FRUIT :  
					this.name == "block_crop_bottle" ? ModItems.BOTTLE_FRUIT : 
					this.name == "block_crop_totem" ? ModItems.TOTEM_FRUIT : 
					this.name == "block_crop_lead2" ? ModItems.LEAD2_FRUIT : 
					this.name == "block_crop_nametag" ? ModItems.NAMETAG_FRUIT : 
					this.name == "block_crop_xp" ? ModItems.XP_FRUIT : 
					this.name == "block_crop_ender" ? ModItems.ENDER_FRUIT : 
					this.name == "block_crop_bone" ? ModItems.BONE_FRUIT : 
					this.name == "block_crop_eye" ? ModItems.EYE_FRUIT : 
					this.name == "block_crop_powder" ? ModItems.POWDER_FRUIT : 
					this.name == "block_crop_blaze" ? ModItems.BLAZE_FRUIT : 
					this.name == "block_crop_ghast" ? ModItems.GHAST_FRUIT : 
					this.name == "block_crop_magma" ? ModItems.MAGMA_FRUIT : 
					this.name == "block_crop_shell" ? ModItems.SHELL_FRUIT : 
					this.name == "block_crop_slime" ? ModItems.SLIME_FRUIT : 
					this.name == "block_crop_star" ? ModItems.STAR_FRUIT : 
					this.name == "block_crop_string" ? ModItems.STRING_FRUIT : 
					this.name == "block_crop_zombie" ? ModItems.ZOMBIE_FRUIT : 	
					this.name == "block_crop_apple" ? ModItems.APPLE_FRUIT : 
					this.name == "block_crop_goldenapple" ? ModItems.GOLDENAPPLE_FRUIT : 
					this.name == "block_crop_bread" ? ModItems.BREAD_FRUIT :  
					this.name == "block_crop_egg" ? ModItems.EGG_FRUIT : 
					this.name == "block_crop_clownfish" ? ModItems.CLOWNFISH_FRUIT :  
					this.name == "block_crop_pufferfish" ? ModItems.PUFFERFISH_FRUIT :  
					this.name == "block_crop_cookie" ? ModItems.COOKIE_FRUIT :  
					this.name == "block_crop_chorus" ? ModItems.CHORUS_FRUIT :  
					this.name == "block_crop_rawporc" ? ModItems.RAWPORC_FRUIT :  
					this.name == "block_crop_rawbeef" ? ModItems.RAWBEEF_FRUIT :  
					this.name == "block_crop_fish" ? ModItems.FISH_FRUIT :  
					this.name == "block_crop_salmon" ? ModItems.SALMON_FRUIT :  
					this.name == "block_crop_rawchicken" ? ModItems.RAWCHICKEN_FRUIT :  
					this.name == "block_crop_rawrabbit" ? ModItems.RAWRABBIT_FRUIT :  
					this.name == "block_crop_rawmutton" ? ModItems.RAWMUTTON_FRUIT : 						
					this.name == "block_crop_orange" ? ModItems.ORANGE_FRUIT :
					this.name == "block_crop_magenta" ? ModItems.MAGENTA_FRUIT :
					this.name == "block_crop_lightblue" ? ModItems.LIGHTBLUE_FRUIT :
					this.name == "block_crop_yellow" ? ModItems.YELLOW_FRUIT :
					this.name == "block_crop_lime" ? ModItems.LIME_FRUIT :
					this.name == "block_crop_pink" ? ModItems.PINK_FRUIT :
					this.name == "block_crop_gray" ? ModItems.GRAY_FRUIT :
					this.name == "block_crop_silver" ? ModItems.SILVER_FRUIT :
					this.name == "block_crop_cyan" ? ModItems.CYAN_FRUIT :
					this.name == "block_crop_purple" ? ModItems.PURPLE_FRUIT :
					this.name == "block_crop_brown" ? ModItems.BROWN_FRUIT :
					this.name == "block_crop_green" ? ModItems.GREEN_FRUIT :
					this.name == "block_crop_red" ? ModItems.RED_FRUIT :
					this.name == "block_crop_black" ? ModItems.BLACK_FRUIT :	
					this.name == "block_crop_vine" ? ModItems.VINE_FRUIT :
					this.name == "block_crop_lilypad" ? ModItems.LILYPAD_FRUIT :
					this.name == "block_crop_tallgrass" ? ModItems.TALLGRASS_FRUIT :
					this.name == "block_crop_largefern" ? ModItems.LARGEFERN_FRUIT :
					this.name == "block_crop_bush" ? ModItems.BUSH_FRUIT :
					this.name == "block_crop_grass1" ? ModItems.GRASS1_FRUIT :
					this.name == "block_crop_fern" ? ModItems.FERN_FRUIT :
					this.name == "block_crop_oak" ? ModItems.OAK_FRUIT :
					this.name == "block_crop_birch" ? ModItems.BIRCH_FRUIT :
					this.name == "block_crop_spruce" ? ModItems.SPRUCE_FRUIT :
					this.name == "block_crop_jungle" ? ModItems.JUNGLE_FRUIT :
					this.name == "block_crop_darkoak" ? ModItems.DARKOAK_FRUIT :
					this.name == "block_crop_acacia" ? ModItems.ACACIA_FRUIT :
					this.name == "block_crop_leather" ? ModItems.LEATHER_FRUIT :
					this.name == "block_crop_feather" ? ModItems.FEATHER_FRUIT :
					this.name == "block_crop_hide" ? ModItems.HIDE_FRUIT :
					this.name == "block_crop_foot" ? ModItems.FOOT_FRUIT :

					this.name == "apricot_crop" ? ModItems.APRICOT :
					this.name == "banana_crop" ? ModItems.BANANA :
					this.name == "cherry_crop" ? ModItems.CHERRY :
					this.name == "kiwi_crop" ? ModItems.KIWI :
					this.name == "lemon_crop" ? ModItems.LEMON :
					this.name == "orange_crop" ? ModItems.ORANGE :
					this.name == "pear_crop" ? ModItems.PEAR :
						
					this.name == "block_crop_aluminium" ? ModItems.ALUMINIUM_FRUIT : 
					this.name == "block_crop_brass" ? ModItems.BRASS_FRUIT : 
					this.name == "block_crop_bronze" ? ModItems.BRONZE_FRUIT :  
					this.name == "block_crop_chrome" ? ModItems.CHROME_FRUIT : 
					this.name == "block_crop_copper" ? ModItems.COPPER_FRUIT :  						
					this.name == "block_crop_electrum" ? ModItems.ELECTRUM_FRUIT : 
					this.name == "block_crop_invar" ? ModItems.INVAR_FRUIT :  
					this.name == "block_crop_iridium" ? ModItems.IRIDIUM_FRUIT : 
					this.name == "block_crop_lead" ? ModItems.LEAD_FRUIT : 
					this.name == "block_crop_nickel" ? ModItems.NICKEL_FRUIT : 					
					this.name == "block_crop_platinium" ? ModItems.PLATINIUM_FRUIT : 
					this.name == "block_crop_silveringot" ? ModItems.SILVERINGOT_FRUIT :
					this.name == "block_crop_steel" ? ModItems.STEEL_FRUIT : 
					this.name == "block_crop_tin" ? ModItems.TIN_FRUIT : 
					this.name == "block_crop_titanium" ? ModItems.TITANIUM_FRUIT :  						
					this.name == "block_crop_tungsten" ? ModItems.TUNGSTEN_FRUIT : 
					this.name == "block_crop_zinc" ? ModItems.ZINC_FRUIT :  
					this.name == "block_crop_manasteel" ? ModItems.MANASTEEL_FRUIT : 
					this.name == "block_crop_terrasteel" ? ModItems.TERRASTEEL_FRUIT :  
					this.name == "block_crop_manadiamond" ? ModItems.MANADIAMOND_FRUIT : 
					this.name == "block_crop_manapearl" ? ModItems.MANAPEARL_FRUIT : 
					this.name == "block_crop_elementium" ? ModItems.ELEMENTIUM_FRUIT : 
					this.name == "block_crop_dragonstone" ? ModItems.DRAGONSTONE_FRUIT : 
					this.name == "block_crop_gearwood" ? ModItems.GEARWOOD_FRUIT : 
					this.name == "block_crop_gearstone" ? ModItems.GEARSTONE_FRUIT :
					this.name == "block_crop_geariron" ? ModItems.GEARIRON_FRUIT :  						
					this.name == "block_crop_geargold" ? ModItems.GEARGOLD_FRUIT : 
					this.name == "block_crop_geardiamond" ? ModItems.GEARDIAMOND_FRUIT :  
					this.name == "block_crop_yellorium" ? ModItems.YELLORIUM_FRUIT : 
					this.name == "block_crop_blutonium" ? ModItems.BLUTONIUM_FRUIT : 
					this.name == "block_crop_cyanite" ? ModItems.CYANITE_FRUIT : 						
					this.name == "block_crop_graphite" ? ModItems.GRAPHITE_FRUIT : 
					this.name == "block_crop_ludicrite" ? ModItems.LUDICRITE_FRUIT :
					this.name == "block_crop_enderium" ? ModItems.ENDERIUM_FRUIT : 
					this.name == "block_crop_lumium" ? ModItems.LUMIUM_FRUIT : 
					this.name == "block_crop_signalum" ? ModItems.SIGNALUM_FRUIT :  						
					this.name == "block_crop_constantan" ? ModItems.CONSTANTAN_FRUIT : 
					this.name == "block_crop_mithril" ? ModItems.MITHRIL_FRUIT :  
					this.name == "block_crop_uranium" ? ModItems.URANIUM_FRUIT : 
					this.name == "block_crop_apatite" ? ModItems.APATITE_FRUIT :  
					this.name == "block_crop_silicon" ? ModItems.SILICON_FRUIT : 						
					this.name == "block_crop_draconium" ? ModItems.DRACONIUM_FRUIT : 
					this.name == "block_crop_draconium_awakened" ? ModItems.DRACONIUM_AWAKENED_FRUIT : 
					this.name == "block_crop_osmium" ? ModItems.OSMIUM_FRUIT : 
					this.name == "block_crop_gaia" ? ModItems.GAIA_FRUIT :null;
	}
	
	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state,
			int fortune) {
		super.getDrops(drops, world, pos, state, fortune);
		
		int age = getAge(state);
		if(more == true && age >= getMaxAge())
		{
			if(name == "block_crop_coal")
				drops.add(new ItemStack(Items.COAL, 1, 0));
			else if(name == "block_crop_iron")
				drops.add(new ItemStack(Items.IRON_INGOT));
			else if(name == "block_crop_gold")
				drops.add(new ItemStack(Items.GOLD_INGOT));
			else if(name == "block_crop_redstone")
				drops.add(new ItemStack(Items.REDSTONE));
			else if(name == "block_crop_lapis")
				drops.add(new ItemStack(Items.DYE, 1, 4));
			else if(name == "block_crop_diamond")
				drops.add(new ItemStack(Items.DIAMOND));
			else if(name == "block_crop_emerald")
				drops.add(new ItemStack(Items.EMERALD));
			else if(name == "block_crop_elemental")
				drops.add(new ItemStack(ModItems.ELEMATILIUS));
			else if(name == "block_crop_clay")
				drops.add(new ItemStack(Items.CLAY_BALL));
			else if(name == "block_crop_glowstone")
				drops.add(new ItemStack(Items.GLOWSTONE_DUST));
			else if(name == "block_crop_quartz")
				drops.add(new ItemStack(Items.QUARTZ));
			else if(name == "block_crop_shard")
				drops.add(new ItemStack(Items.PRISMARINE_SHARD));
			else if(name == "block_crop_crystal")
				drops.add(new ItemStack(Items.PRISMARINE_CRYSTALS));
			else if(name == "block_crop_charcoal")
				drops.add(new ItemStack(Items.COAL, 1, 1));
			else if(name == "block_crop_snowball")
				drops.add(new ItemStack(Items.SNOWBALL));
			else if(name == "block_crop_nether")
				drops.add(new ItemStack(Items.NETHERBRICK));
			else if(name == "block_crop_bottle")
				drops.add(new ItemStack(Items.GLASS_BOTTLE));
			else if(name == "block_crop_xp")
				drops.add(new ItemStack(Items.EXPERIENCE_BOTTLE));
			else if(name == "block_crop_bone")
				drops.add(new ItemStack(Items.BONE));
			else if(name == "block_crop_magma")
				drops.add(new ItemStack(Items.MAGMA_CREAM));
			else if(name == "block_crop_slime")
				drops.add(new ItemStack(Items.SLIME_BALL));
			else if(name == "block_crop_string")
				drops.add(new ItemStack(Items.STRING));
		}
	}
}