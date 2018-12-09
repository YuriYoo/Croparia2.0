package com.croparia.mod.Init;

import com.croparia.mod.Reference;
import com.croparia.mod.Config.ConfigInit;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class CropariaRecipes 
{
	public static final ItemStack blackRate = new ItemStack(Items.DYE, ConfigInit.blackRate, 0);
	public static final ItemStack redRate = new ItemStack(Items.DYE, ConfigInit.redRate, 1);
	public static final ItemStack greenRate = new ItemStack(Items.DYE, ConfigInit.greenRate, 2);
	public static final ItemStack brownRate = new ItemStack(Items.DYE, ConfigInit.brownRate, 3);
	public static final ItemStack lapisRate = new ItemStack(Items.DYE, ConfigInit.lapisRate, 4);
	public static final ItemStack purpleRate = new ItemStack(Items.DYE, ConfigInit.purpleRate, 5);
	public static final ItemStack cyanRate = new ItemStack(Items.DYE, ConfigInit.cyanRate, 6);
	public static final ItemStack lightgrayRate = new ItemStack(Items.DYE, ConfigInit.silverRate, 7);
	public static final ItemStack grayRate = new ItemStack(Items.DYE, ConfigInit.grayRate, 8);
	public static final ItemStack pinkRate = new ItemStack(Items.DYE, ConfigInit.pinkRate, 9);
	public static final ItemStack limeRate = new ItemStack(Items.DYE, ConfigInit.limeRate, 10);
	public static final ItemStack yellowRate = new ItemStack(Items.DYE, ConfigInit.yellowRate, 11);
	public static final ItemStack lightblueRate = new ItemStack(Items.DYE, ConfigInit.lightblueRate, 12);
	public static final ItemStack magentaRate = new ItemStack(Items.DYE, ConfigInit.magentaRate, 13);
	public static final ItemStack orangeRate = new ItemStack(Items.DYE, ConfigInit.orangeRate, 14);
	
	public static final ItemStack black = new ItemStack(Items.DYE, 1, 0);
	public static final ItemStack red = new ItemStack(Items.DYE, 1, 1);
	public static final ItemStack green = new ItemStack(Items.DYE, 1, 2);
	public static final ItemStack brown = new ItemStack(Items.DYE, 1, 3);
	public static final ItemStack lapis = new ItemStack(Items.DYE, 1, 4);
	public static final ItemStack purple = new ItemStack(Items.DYE, 1, 5);
	public static final ItemStack cyan = new ItemStack(Items.DYE, 1, 6);
	public static final ItemStack lightgray = new ItemStack(Items.DYE, 1, 7);
	public static final ItemStack gray = new ItemStack(Items.DYE, 1, 8);
	public static final ItemStack pink = new ItemStack(Items.DYE, 1, 9);
	public static final ItemStack lime = new ItemStack(Items.DYE, 1, 10);
	public static final ItemStack yellow = new ItemStack(Items.DYE, 1, 11);
	public static final ItemStack lightblue = new ItemStack(Items.DYE, 1, 12);
	public static final ItemStack magenta = new ItemStack(Items.DYE, 1, 13);
	public static final ItemStack orange = new ItemStack(Items.DYE, 1, 14);
	public static void init()
	{
		BrewingRecipeRegistry.addRecipe(new ItemStack(Items.POTIONITEM), new ItemStack(ModItems.ELEMATILIUS), new ItemStack(ModItems.POTION_ELEMATILIUS));
		BrewingRecipeRegistry.addRecipe(new ItemStack(ModItems.POTION_ELEMATILIUS), new ItemStack(ModItems.ELEMENTAL_WATER), new ItemStack(ModItems.POTION_WATER));
		BrewingRecipeRegistry.addRecipe(new ItemStack(ModItems.POTION_ELEMATILIUS), new ItemStack(ModItems.ELEMENTAL_FIRE), new ItemStack(ModItems.POTION_FIRE));
		BrewingRecipeRegistry.addRecipe(new ItemStack(ModItems.POTION_ELEMATILIUS), new ItemStack(ModItems.ELEMENTAL_EARTH), new ItemStack(ModItems.POTION_EARTH));
		BrewingRecipeRegistry.addRecipe(new ItemStack(ModItems.POTION_ELEMATILIUS), new ItemStack(ModItems.ELEMENTAL_AIR), new ItemStack(ModItems.POTION_AIR));
		
		seed(ModItems.COAL_SEED, new ItemStack(Items.COAL, 1, 0), ModItems.FRUIT_START, Items.WHEAT_SEEDS);
		seed(ModItems.IRON_SEED, "ingotIron", ModItems.COAL_FRUIT, ModItems.COAL_SEED);
		seed(ModItems.GOLD_SEED, "ingotGold", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
		seed(ModItems.REDSTONE_SEED, "dustRedstone", ModItems.GOLD_FRUIT, ModItems.GOLD_SEED);
		seed(ModItems.LAPIS_SEED, "gemLapis", ModItems.REDSTONE_FRUIT, ModItems.REDSTONE_SEED);
		seed(ModItems.DIAMOND_SEED, "gemDiamond", ModItems.LAPIS_FRUIT, ModItems.LAPIS_SEED);
		seed(ModItems.EMERALD_SEED, "gemEmerald", ModItems.DIAMOND_FRUIT, ModItems.DIAMOND_SEED);
		seed(ModItems.ELEMENTAL_SEED, "gemDiamond", ModItems.EMERALD_FRUIT, ModItems.EMERALD_SEED);
		
		fruit(new ItemStack(Items.COAL, ConfigInit.coalRate, 0), ModItems.COAL_FRUIT);
		fruit(Items.IRON_INGOT, ConfigInit.ironRate, ModItems.IRON_FRUIT);
		fruit(Items.GOLD_INGOT, ConfigInit.goldRate, ModItems.GOLD_FRUIT);
		fruit(Items.REDSTONE, ConfigInit.redstoneRate, ModItems.REDSTONE_FRUIT);
		fruit(lapisRate, ModItems.LAPIS_FRUIT);
		fruit(Items.DIAMOND, ConfigInit.diamondRate, ModItems.DIAMOND_FRUIT);
		fruit(Items.EMERALD, ConfigInit.emeraldRate, ModItems.EMERALD_FRUIT);
		fruit(ModItems.ELEMATILIUS, ConfigInit.elementalRate, ModItems.ELEMENTAL_FRUIT);

		ShapedOreRecipe(new ItemStack(ModBlocks.GREENHOUSE), new Object[] { "sgs", "G G", "G G", 's', Items.STICK, 'g', Blocks.GLOWSTONE, 'G', Blocks.GLASS});
		ShapedOreRecipe(new ItemStack(ModItems.RAKE), new Object[] { "s s", " s ", " s ", 's', Items.STICK});
		seedStem(ModItems.ELEMENTAL_SEED_STEM, ModBlocks.ELEMENTAL_STONE);
		
		ShapelessOreRecipe(new ItemStack(ModItems.WOOD_PESTLE, 1), "stickWood", Items.BOWL, Blocks.PLANKS);
		ShapelessOreRecipe(new ItemStack(ModItems.STONE_PESTLE, 1), "stickWood", Items.BOWL, Blocks.STONE);
		ShapelessOreRecipe(new ItemStack(ModItems.IRON_PESTLE, 1), "stickWood", Items.BOWL, Items.IRON_INGOT);
		ShapelessOreRecipe(new ItemStack(ModItems.GOLD_PESTLE, 1), "stickWood", Items.BOWL, Items.GOLD_INGOT);
		ShapelessOreRecipe(new ItemStack(ModItems.DIAMOND_PESTLE, 1), "stickWood", Items.BOWL, Items.DIAMOND);
		ShapelessOreRecipe(new ItemStack(ModItems.OBSIDIAN_PESTLE, 1), "stickWood", Items.BOWL, Blocks.OBSIDIAN);
		ShapedOreRecipe(new ItemStack(ModItems.RENFORCED_PESTLE), new Object[] { " d ", "dod", " d ", 'd', "gemDiamond", 'o', ModItems.OBSIDIAN_PESTLE});
		ShapedOreRecipe(new ItemStack(ModItems.ELEMENTAL_PESTLE), new Object[] { " d ", "dod", " d ", 'd', "gemElemental", 'o', ModItems.RENFORCED_PESTLE});
		ShapelessOreRecipe(new ItemStack(Blocks.DOUBLE_PLANT, 1, 3), new ItemStack(Blocks.TALLGRASS, 1, 2), new ItemStack(Blocks.TALLGRASS, 1, 2));
		ShapelessOreRecipe(new ItemStack(Blocks.DOUBLE_PLANT, 1, 2), new ItemStack(Blocks.TALLGRASS, 1, 1), new ItemStack(Blocks.TALLGRASS, 1, 1));

		ShapedOreRecipe(new ItemStack(ModItems.OBSIDIAN_HELMET), new Object[] { "ooo", "o o", 'o', Blocks.OBSIDIAN});
		ShapedOreRecipe(new ItemStack(ModItems.OBSIDIAN_CHEST), new Object[] { "o o", "ooo", "ooo", 'o', Blocks.OBSIDIAN});
		ShapedOreRecipe(new ItemStack(ModItems.OBSIDIAN_LEGS), new Object[] { "ooo", "o o", "o o", 'o', Blocks.OBSIDIAN});
		ShapedOreRecipe(new ItemStack(ModItems.OBSIDIAN_FEET), new Object[] { "o o", "o o", 'o', Blocks.OBSIDIAN});
		ShapedOreRecipe(new ItemStack(ModItems.RENFORCED_HELMET), new Object[] { " d ", "dod", " d ", 'd', Items.DIAMOND, 'o', ModItems.OBSIDIAN_HELMET});
		ShapedOreRecipe(new ItemStack(ModItems.RENFORCED_CHEST), new Object[] { " d ", "dod", " d ", 'd', Items.DIAMOND, 'o', ModItems.OBSIDIAN_CHEST});
		ShapedOreRecipe(new ItemStack(ModItems.RENFORCED_LEGS), new Object[] { " d ", "dod", " d ", 'd', Items.DIAMOND, 'o', ModItems.OBSIDIAN_LEGS});
		ShapedOreRecipe(new ItemStack(ModItems.RENFORCED_FEET), new Object[] { " d ", "dod", " d ", 'd', Items.DIAMOND, 'o', ModItems.OBSIDIAN_FEET});
		ShapedOreRecipe(new ItemStack(ModItems.WATER_GEM_HELMET), new Object[] { "ooo", "o o", 'o', ModItems.WATER_GEM});
		ShapedOreRecipe(new ItemStack(ModItems.WATER_GEM_CHEST), new Object[] { "o o", "ooo", "ooo", 'o', ModItems.WATER_GEM});
		ShapedOreRecipe(new ItemStack(ModItems.WATER_GEM_LEGS), new Object[] { "ooo", "o o", "o o", 'o', ModItems.WATER_GEM});
		ShapedOreRecipe(new ItemStack(ModItems.WATER_GEM_FEET), new Object[] { "o o", "o o", 'o', ModItems.WATER_GEM});
		ShapedOreRecipe(new ItemStack(ModItems.FIRE_GEM_HELMET), new Object[] { "ooo", "o o", 'o', ModItems.FIRE_GEM});
		ShapedOreRecipe(new ItemStack(ModItems.FIRE_GEM_CHEST), new Object[] { "o o", "ooo", "ooo", 'o', ModItems.FIRE_GEM});
		ShapedOreRecipe(new ItemStack(ModItems.FIRE_GEM_LEGS), new Object[] { "ooo", "o o", "o o", 'o', ModItems.FIRE_GEM});
		ShapedOreRecipe(new ItemStack(ModItems.FIRE_GEM_FEET), new Object[] { "o o", "o o", 'o', ModItems.FIRE_GEM});
		ShapedOreRecipe(new ItemStack(ModItems.EARTH_GEM_HELMET), new Object[] { "ooo", "o o", 'o', ModItems.EARTH_GEM});
		ShapedOreRecipe(new ItemStack(ModItems.EARTH_GEM_CHEST), new Object[] { "o o", "ooo", "ooo", 'o', ModItems.EARTH_GEM});
		ShapedOreRecipe(new ItemStack(ModItems.EARTH_GEM_LEGS), new Object[] { "ooo", "o o", "o o", 'o', ModItems.EARTH_GEM});
		ShapedOreRecipe(new ItemStack(ModItems.EARTH_GEM_FEET), new Object[] { "o o", "o o", 'o', ModItems.EARTH_GEM});
		ShapedOreRecipe(new ItemStack(ModItems.AIR_GEM_HELMET), new Object[] { "ooo", "o o", 'o', ModItems.AIR_GEM});
		ShapedOreRecipe(new ItemStack(ModItems.AIR_GEM_CHEST), new Object[] { "o o", "ooo", "ooo", 'o', ModItems.AIR_GEM});
		ShapedOreRecipe(new ItemStack(ModItems.AIR_GEM_LEGS), new Object[] { "ooo", "o o", "o o", 'o', ModItems.AIR_GEM});
		ShapedOreRecipe(new ItemStack(ModItems.AIR_GEM_FEET), new Object[] { "o o", "o o", 'o', ModItems.AIR_GEM});

		ShapedOreRecipe(new ItemStack(ModBlocks.INFUSOR), new Object[] {"a a", "aaa", 'a', Blocks.STONEBRICK.getStateFromMeta(1).getBlock()});
		ShapedOreRecipe(new ItemStack(ModBlocks.INFUSOR2), new Object[] {"aba", "aaa", 'a', ModBlocks.ELEMENTAL_STONE, 'b', ModBlocks.INFUSOR});
		
		ShapedOreRecipe(new ItemStack(ModItems.FRUIT_START), new Object[] { "iIi", "IiI", "iIi", 'i', "gemDiamond", 'I', Items.WHEAT_SEEDS});
		if(ConfigInit.enableMultitool == true)
		{
			ShapelessOreRecipe(new ItemStack(ModItems.WOOD_MULTITOOL, 1), Items.WOODEN_AXE, Items.WOODEN_PICKAXE, Items.WOODEN_HOE, Items.WOODEN_SHOVEL);
			ShapelessOreRecipe(new ItemStack(ModItems.IRON_MULTITOOL, 1), Items.IRON_AXE, Items.IRON_PICKAXE, Items.IRON_HOE, Items.IRON_SHOVEL);
			ShapelessOreRecipe(new ItemStack(ModItems.GOLD_MULTITOOL, 1), Items.GOLDEN_AXE, Items.GOLDEN_PICKAXE, Items.GOLDEN_HOE, Items.GOLDEN_SHOVEL);
			ShapelessOreRecipe(new ItemStack(ModItems.DIAMOND_MULTITOOL, 1), Items.DIAMOND_AXE, Items.DIAMOND_PICKAXE, Items.DIAMOND_HOE, Items.DIAMOND_SHOVEL);
			ShapelessOreRecipe(new ItemStack(ModItems.OBSIDIAN_MULTITOOL, 1), ModItems.OBSIDIAN_AXE, ModItems.OBSIDIAN_PICKAXE, ModItems.OBSIDIAN_HOE, ModItems.OBSIDIAN_SHOVEL);
			ShapelessOreRecipe(new ItemStack(ModItems.RENFORCED_MULTITOOL, 1), ModItems.RENFORCED_AXE, ModItems.RENFORCED_PICKAXE, ModItems.RENFORCED_HOE, ModItems.RENFORCED_SHOVEL);
			ShapedOreRecipe(new ItemStack(ModItems.ELEMENTAL_MULTITOOL), new Object[] { " d ", "dod", " d ", 'd', "gemElemental", 'o', ModItems.RENFORCED_MULTITOOL});
		}	
			ShapedOreRecipe(new ItemStack(ModItems.OBSIDIAN_SWORD), new Object[] { "o", "o", "s", 's', "stickWood", 'o', Blocks.OBSIDIAN});
			ShapedOreRecipe(new ItemStack(ModItems.OBSIDIAN_AXE), new Object[] { "oo ", "os ", " s ", 's', "stickWood", 'o', Blocks.OBSIDIAN});
			ShapedOreRecipe(new ItemStack(ModItems.OBSIDIAN_AXE), new Object[] { " oo", " so", " s ", 's', "stickWood", 'o', Blocks.OBSIDIAN});
			ShapedOreRecipe(new ItemStack(ModItems.OBSIDIAN_PICKAXE), new Object[] { "ooo", " s ", " s ", 's', "stickWood", 'o', Blocks.OBSIDIAN});
			ShapedOreRecipe(new ItemStack(ModItems.OBSIDIAN_SHOVEL), new Object[] { "o", "s", "s", 's', "stickWood", 'o', Blocks.OBSIDIAN});
			ShapedOreRecipe(new ItemStack(ModItems.OBSIDIAN_HOE), new Object[] { "oo ", " s ", " s ", 's', "stickWood", 'o', Blocks.OBSIDIAN});
			ShapedOreRecipe(new ItemStack(ModItems.OBSIDIAN_HOE), new Object[] { " oo", " s ", " s ", 's', "stickWood", 'o', Blocks.OBSIDIAN});

			ShapedOreRecipe(new ItemStack(ModItems.RENFORCED_SWORD), new Object[] { " d ", "dod", " d ", 'd', "gemDiamond", 'o', ModItems.OBSIDIAN_SWORD});
			ShapedOreRecipe(new ItemStack(ModItems.RENFORCED_AXE), new Object[] { " d ", "dod", " d ", 'd', "gemDiamond", 'o', ModItems.OBSIDIAN_AXE});
			ShapedOreRecipe(new ItemStack(ModItems.RENFORCED_PICKAXE), new Object[] { " d ", "dod", " d ", 'd', "gemDiamond", 'o', ModItems.OBSIDIAN_PICKAXE});
			ShapedOreRecipe(new ItemStack(ModItems.RENFORCED_SHOVEL), new Object[] { " d ", "dod", " d ", 'd', "gemDiamond", 'o', ModItems.OBSIDIAN_SHOVEL});
			ShapedOreRecipe(new ItemStack(ModItems.RENFORCED_HOE), new Object[] { " d ", "dod", " d ", 'd', "gemDiamond", 'o', ModItems.OBSIDIAN_HOE});
		 
		if(ConfigInit.enableApricot == true)
		{
			ShapedOreRecipe(new ItemStack(ModItems.APRICOT_COLLECTOR), new Object[] { "sbs", " s ", " s ", 's', "stickWood", 'b', ModItems.APRICOT});
			ShapelessOreRecipe(new ItemStack(ModItems.APRICOT_PIE, 1), "egg", Items.SUGAR, ModItems.APRICOT);
		}
		if(ConfigInit.enableBanana== true)
		{
			ShapedOreRecipe(new ItemStack(ModItems.BANANA_COLLECTOR), new Object[] { "sbs", " s ", " s ", 's', "stickWood", 'b', ModItems.BANANA});
			ShapelessOreRecipe(new ItemStack(ModItems.APRICOT_PIE, 1), "egg", Items.SUGAR, ModItems.BANANA);
		}
		if(ConfigInit.enableCherry == true)
		{
			ShapedOreRecipe(new ItemStack(ModItems.CHERRY_COLLECTOR), new Object[] { "sbs", " s ", " s ", 's', "stickWood", 'b', ModItems.CHERRY});
			ShapelessOreRecipe(new ItemStack(ModItems.APRICOT_PIE, 1), "egg", Items.SUGAR, ModItems.CHERRY);
		}
		if(ConfigInit.enableKiwi == true)
		{
			ShapedOreRecipe(new ItemStack(ModItems.KIWI_COLLECTOR), new Object[] { "sbs", " s ", " s ", 's', "stickWood", 'b', ModItems.KIWI});
			ShapelessOreRecipe(new ItemStack(ModItems.APRICOT_PIE, 1), "egg", Items.SUGAR, ModItems.KIWI);
		}
		if(ConfigInit.enableLemon == true)
		{
			ShapedOreRecipe(new ItemStack(ModItems.LEMON_COLLECTOR), new Object[] { "sbs", " s ", " s ", 's', "stickWood", 'b', ModItems.LEMON});
			ShapelessOreRecipe(new ItemStack(ModItems.APRICOT_PIE, 1), "egg", Items.SUGAR, ModItems.LEMON);
		}
		if(ConfigInit.enableOrange == true)
		{
			ShapedOreRecipe(new ItemStack(ModItems.ORANGE_COLLECTOR), new Object[] { "sbs", " s ", " s ", 's', "stickWood", 'b', ModItems.ORANGE});
			ShapelessOreRecipe(new ItemStack(ModItems.APRICOT_PIE, 1), "egg", Items.SUGAR, ModItems.ORANGE);
		}
		if(ConfigInit.enablePear == true)
		{
			ShapedOreRecipe(new ItemStack(ModItems.PEAR_COLLECTOR), new Object[] { "sbs", " s ", " s ", 's', "stickWood", 'b', ModItems.PEAR});
			ShapelessOreRecipe(new ItemStack(ModItems.APRICOT_PIE, 1), "egg", Items.SUGAR, ModItems.PEAR);
		}
		if(ConfigInit.enableFlour)
		{
			ShapelessOreRecipe(new ItemStack(ModItems.FLOUR, 1), "cropWheat", "cropWheat", ModItems.WOOD_PESTLE);
			ShapelessOreRecipe(new ItemStack(ModItems.FLOUR, 1), "cropWheat", ModItems.STONE_PESTLE);
			ShapelessOreRecipe(new ItemStack(ModItems.FLOUR, 2), "cropWheat", ModItems.IRON_PESTLE);
			ShapelessOreRecipe(new ItemStack(ModItems.FLOUR, 3), "cropWheat", ModItems.GOLD_PESTLE);
			ShapelessOreRecipe(new ItemStack(ModItems.FLOUR, 4), "cropWheat", ModItems.DIAMOND_PESTLE);
			ShapelessOreRecipe(new ItemStack(ModItems.FLOUR, 5), "cropWheat", ModItems.OBSIDIAN_PESTLE);
			ShapelessOreRecipe(new ItemStack(ModItems.FLOUR, 9), "cropWheat", ModItems.RENFORCED_PESTLE);
			ShapelessOreRecipe(new ItemStack(ModItems.FLOUR, 12), "cropWheat", ModItems.ELEMENTAL_PESTLE);
			GameRegistry.addSmelting(ModItems.FLOUR, new ItemStack(Items.BREAD), 1.0F);	
		}
		if(ConfigInit.clay == true){
			seed(ModItems.CLAY_SEED, Items.CLAY_BALL, ModItems.FRUIT_START, Items.WHEAT_SEEDS);
			fruit(Items.CLAY_BALL, ConfigInit.clayRate, ModItems.CLAY_FRUIT);
	    }
	    if(ConfigInit.glowstone == true){ 
	    	seed(ModItems.GLOWSTONE_SEED, "dustGlowstone", ModItems.FRUIT_START, Items.NETHER_WART);
			fruit(Items.GLOWSTONE_DUST, ConfigInit.glowstoneRate, ModItems.GLOWSTONE_FRUIT);
	    }
	    if(ConfigInit.quartz == true){ 
	    	seed(ModItems.QUARTZ_SEED, "gemQuartz", ModItems.FRUIT_START, Items.NETHER_WART);
			fruit(Items.QUARTZ, ConfigInit.quartzRate, ModItems.QUARTZ_FRUIT);
	    }
	    if(ConfigInit.shard == true){ 
	    	seed(ModItems.SHARD_SEED, "gemPrismarine", ModItems.FRUIT_START, Items.WHEAT_SEEDS);
			fruit(Items.PRISMARINE_SHARD, ConfigInit.shardRate, ModItems.SHARD_FRUIT);
	    }
	    if(ConfigInit.cristal == true){
	    	seed(ModItems.CRYSTAL_SEED, "dustPrismarine", ModItems.FRUIT_START, Items.WHEAT_SEEDS);
			fruit(Items.PRISMARINE_CRYSTALS, ConfigInit.cristalRate, ModItems.CRYSTAL_FRUIT);
	    }
	    if(ConfigInit.paper == true){
	    	seed(ModItems.PAPER_SEED, "paper", ModItems.FRUIT_START, Items.WHEAT_SEEDS);
			fruit(Items.PAPER, ConfigInit.paperRate, ModItems.PAPER_FRUIT);
	    }
	    if(ConfigInit.sugar == true){
	    	seed(ModItems.SUGAR_SEED, Items.SUGAR, ModItems.FRUIT_START, Items.WHEAT_SEEDS);
			fruit(Items.SUGAR, ConfigInit.sugarRate, ModItems.SUGAR_FRUIT);
	    }
	    if(ConfigInit.charcoal == true){
	    	seed(ModItems.CHARCOAL_SEED, new ItemStack(Items.COAL, 1, 1), ModItems.FRUIT_START, Items.WHEAT_SEEDS);
			fruit(new ItemStack(Items.COAL, ConfigInit.charcoalRate, 1), ModItems.CHARCOAL_FRUIT);
	    }
	    if(ConfigInit.flint == true){
	    	seed(ModItems.FLINT_SEED, Items.FLINT, ModItems.FRUIT_START, Items.WHEAT_SEEDS);
			fruit(Items.FLINT, ConfigInit.flintRate, ModItems.FLINT_FRUIT);
	    }
	    if(ConfigInit.snowball == true){
	       	seed(ModItems.SNOWBALL_SEED, Items.SNOWBALL, ModItems.FRUIT_START, Items.WHEAT_SEEDS);
	       	fruit(Items.SNOWBALL, ConfigInit.snowballRate, ModItems.SNOWBALL_FRUIT);
	    }
	    if(ConfigInit.firework == true){
	       	seed(ModItems.FIREWORK_SEED, Items.FIREWORK_CHARGE, ModItems.FRUIT_START, Items.WHEAT_SEEDS);
			fruit(Items.FIREWORK_CHARGE, ConfigInit.fireworkRate, ModItems.FIREWORK_FRUIT);
	    }
	    if(ConfigInit.nether == true){
	       	seed(ModItems.NETHER_SEED, Items.NETHERBRICK, ModItems.FRUIT_START, Items.NETHER_WART);
	       	fruit(Items.NETHERBRICK, ConfigInit.netherRate, ModItems.NETHER_FRUIT);
	    }
	    if(ConfigInit.bottle == true){
	       	seed(ModItems.BOTTLE_SEED, Items.GLASS_BOTTLE, ModItems.FRUIT_START, Items.WHEAT_SEEDS);
	       	fruit(Items.GLASS_BOTTLE, ConfigInit.bottleRate, ModItems.BOTTLE_FRUIT);
	    }
	   	if(ConfigInit.totem == true){
	       	seed(ModItems.TOTEM_SEED, Items.TOTEM_OF_UNDYING, ModItems.DIAMOND_FRUIT, ModItems.DIAMOND_SEED);
	       	fruit(Items.TOTEM_OF_UNDYING, ConfigInit.totemRate, ModItems.TOTEM_FRUIT);
	   	}
	   	if(ConfigInit.lead2 == true){
	       	seed(ModItems.LEAD2_SEED, Items.LEAD, ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(Items.LEAD, ConfigInit.lead2Rate, ModItems.LEAD2_FRUIT);
	   	}
	   	if(ConfigInit.nametag == true){
	       	seed(ModItems.NAMETAG_SEED, Items.NAME_TAG, ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(Items.NAME_TAG, ConfigInit.nametagRate, ModItems.NAMETAG_FRUIT);
	   	}
	   	if(ConfigInit.xp == true){
	       	seed(ModItems.XP_SEED, Items.EXPERIENCE_BOTTLE, ModItems.EMERALD_FRUIT, ModItems.EMERALD_SEED);
	       	fruit(Items.EXPERIENCE_BOTTLE, ConfigInit.nametagRate, ModItems.XP_FRUIT);
	   	}
	   	if(ConfigInit.ender == true){
	   		seed(ModItems.ENDER_SEED, "enderpearl", ModItems.FRUIT_START, ModItems.IRON_SEED);
	       	fruit(Items.ENDER_PEARL, ConfigInit.enderRate, ModItems.ENDER_FRUIT);
	   	}
	   	if(ConfigInit.bone == true){
	   		seed(ModItems.BONE_SEED, "bone", ModItems.FRUIT_START, ModItems.IRON_SEED);
	       	fruit(Items.BONE, ConfigInit.boneRate, ModItems.BONE_FRUIT);
	   	}
	   	if(ConfigInit.eye == true){
	   		seed(ModItems.EYE_SEED, Items.SPIDER_EYE, ModItems.FRUIT_START, ModItems.IRON_SEED);
	       	fruit(Items.SPIDER_EYE, ConfigInit.eyeRate, ModItems.EYE_FRUIT);
	   	}
	   	if(ConfigInit.powder == true){
	   		seed(ModItems.POWDER_SEED, "gunpowder", ModItems.FRUIT_START, ModItems.IRON_SEED);
	       	fruit(Items.GUNPOWDER, ConfigInit.powderRate, ModItems.POWDER_FRUIT);
	   	}
	   	if(ConfigInit.blaze == true){
	   		seed(ModItems.BLAZE_SEED, Items.BLAZE_ROD, ModItems.FRUIT_START, ModItems.IRON_SEED);
	       	fruit(Items.BLAZE_ROD, ConfigInit.blazeRate, ModItems.BLAZE_FRUIT);
	   	}
	   	if(ConfigInit.ghast == true){
	   		seed(ModItems.GHAST_SEED, Items.GHAST_TEAR, ModItems.FRUIT_START, ModItems.IRON_SEED);
	       	fruit(Items.GHAST_TEAR, ConfigInit.ghastRate, ModItems.GHAST_FRUIT);
	   	}
	   	if(ConfigInit.magma == true){
	   		seed(ModItems.MAGMA_SEED, Items.MAGMA_CREAM, ModItems.FRUIT_START, ModItems.IRON_SEED);
	       	fruit(Items.MAGMA_CREAM, ConfigInit.enderRate, ModItems.MAGMA_FRUIT);
	   	}
	   	if(ConfigInit.shell == true){
	   		seed(ModItems.SHELL_SEED, Items.SHULKER_SHELL, ModItems.FRUIT_START, ModItems.IRON_SEED);
	       	fruit(Items.SHULKER_SHELL, ConfigInit.shellRate, ModItems.SHELL_FRUIT);
	   	}
	   	if(ConfigInit.slime == true){
	   		seed(ModItems.SLIME_SEED, "slimeball", ModItems.FRUIT_START, ModItems.IRON_SEED);
	       	fruit(Items.SLIME_BALL, ConfigInit.slimeRate, ModItems.SLIME_FRUIT);
	   	}
	   	if(ConfigInit.star == true){
	   		seed(ModItems.STAR_SEED, "netherStar", ModItems.FRUIT_START, ModItems.IRON_SEED);
	       	fruit(Items.NETHER_STAR, ConfigInit.starRate, ModItems.STAR_FRUIT);
	   	}
	   	if(ConfigInit.string == true){
	   		seed(ModItems.STRING_SEED, "string", ModItems.FRUIT_START, ModItems.IRON_SEED);
	       	fruit(Items.STRING, ConfigInit.stringRate, ModItems.STRING_FRUIT);
	   	}
	   	if(ConfigInit.zombie == true){
	   		seed(ModItems.ZOMBIE_SEED, Items.ROTTEN_FLESH, ModItems.FRUIT_START, ModItems.IRON_SEED);
	       	fruit(Items.ROTTEN_FLESH, ConfigInit.zombieRate, ModItems.ZOMBIE_FRUIT);
	   	}
	   	if(ConfigInit.apple == true){
	       	seed(ModItems.APPLE_SEED, Items.APPLE, ModItems.COAL_FRUIT, ModItems.COAL_SEED);
	       	fruit(Items.APPLE, ConfigInit.appleRate, ModItems.APPLE_FRUIT);
	   	}
	   	if(ConfigInit.goldenapple == true){
	       	seed(ModItems.GOLDENAPPLE_SEED, new ItemStack(Items.GOLDEN_APPLE, 1, 0), ModItems.COAL_FRUIT, ModItems.COAL_SEED);
	       	fruit(Items.GOLDEN_APPLE, ConfigInit.goldenappleRate, ModItems.GOLDENAPPLE_FRUIT);
	   	}
	   	if(ConfigInit.bread == true){
	       	seed(ModItems.BREAD_SEED, Items.BREAD, ModItems.COAL_FRUIT, ModItems.COAL_SEED);
	       	fruit(Items.BREAD, ConfigInit.breadRate, ModItems.BREAD_FRUIT);
	   	}
	   	if(ConfigInit.egg == true){
	       	seed(ModItems.EGG_SEED, "egg", ModItems.COAL_FRUIT, ModItems.COAL_SEED);
	       	fruit(Items.EGG, ConfigInit.eggRate, ModItems.EGG_FRUIT);
	   	}
	   	if(ConfigInit.clownfish == true){
	       	seed(ModItems.CLOWNFISH_SEED, new ItemStack(Items.FISH, 1, 2), ModItems.COAL_FRUIT, ModItems.COAL_SEED);
	       	fruit(new ItemStack(Items.FISH, ConfigInit.clownfishRate, 2), ModItems.CLOWNFISH_FRUIT);
	   	}
	   	if(ConfigInit.pufferfish == true){
	       	seed(ModItems.PUFFERFISH_SEED, new ItemStack(Items.FISH, 1, 3), ModItems.COAL_FRUIT, ModItems.COAL_SEED);
	       	fruit(new ItemStack(Items.FISH, ConfigInit.pufferfishRate, 3), ModItems.PUFFERFISH_FRUIT);
	   	}
	   	if(ConfigInit.cookie == true){
	       	seed(ModItems.COOKIE_SEED, Items.COOKIE, ModItems.COAL_FRUIT, ModItems.COAL_SEED);
	       	fruit(Items.COOKIE, ConfigInit.cookieRate, ModItems.COOKIE_FRUIT);
	   	}
	   	if(ConfigInit.chorus == true){
	       	seed(ModItems.CHORUS_SEED, Items.CHORUS_FRUIT, ModItems.COAL_FRUIT, ModItems.COAL_SEED);
	       	fruit(Items.CHORUS_FRUIT, ConfigInit.chorusRate, ModItems.CHORUS_FRUIT);
	   	}
	   	if(ConfigInit.rawporc == true){
	       	seed(ModItems.RAWPORC_SEED, Items.PORKCHOP, ModItems.COAL_FRUIT, ModItems.COAL_SEED);
	       	fruit(Items.PORKCHOP, ConfigInit.rawporcRate, ModItems.RAWPORC_FRUIT);
	   	}
	   	if(ConfigInit.rawbeef == true){
	       	seed(ModItems.RAWBEEF_SEED, Items.BEEF, ModItems.COAL_FRUIT, ModItems.COAL_SEED);
	       	fruit(Items.BEEF, ConfigInit.rawbeefRate, ModItems.RAWBEEF_FRUIT);
	   	}
	   	if(ConfigInit.fish == true){
	       	seed(ModItems.FISH_SEED, new ItemStack(Items.FISH, 1, 0), ModItems.COAL_FRUIT, ModItems.COAL_SEED);
	       	fruit(new ItemStack(Items.FISH, ConfigInit.fishRate, 0), ModItems.FISH_FRUIT);
	   	}
	   	if(ConfigInit.salmon == true){
	       	seed(ModItems.SALMON_SEED, new ItemStack(Items.FISH, 1, 1), ModItems.COAL_FRUIT, ModItems.COAL_SEED);
	       	fruit(new ItemStack(Items.FISH, ConfigInit.salmonRate, 1), ModItems.SALMON_FRUIT);
	   	}
	   	if(ConfigInit.rawrabbit == true){
	       	seed(ModItems.RAWRABBIT_SEED, Items.RABBIT, ModItems.COAL_FRUIT, ModItems.COAL_SEED);
	       	fruit(Items.RABBIT, ConfigInit.rawrabbitRate, ModItems.RAWRABBIT_FRUIT);
	   	}
	   	if(ConfigInit.rawmutton == true){
	       	seed(ModItems.RAWMUTTON_SEED, Items.MUTTON, ModItems.COAL_FRUIT, ModItems.COAL_SEED);
	       	fruit(Items.MUTTON, ConfigInit.rawmuttonRate, ModItems.RAWMUTTON_FRUIT);
	   	}
	   	if(ConfigInit.rawchicken == true){
	       	seed(ModItems.RAWCHICKEN_SEED, Items.CHICKEN, ModItems.COAL_FRUIT, ModItems.COAL_SEED);
	       	fruit(Items.CHICKEN, ConfigInit.rawchickenRate, ModItems.RAWCHICKEN_FRUIT);
	   	}
	   	if(ConfigInit.orange == true){
	       	seed(ModItems.ORANGE_SEED, new ItemStack(Items.DYE, 1, 14), ModItems.GOLD_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.DYE, ConfigInit.orangeRate, 14), ModItems.ORANGE_FRUIT);
	   	}
	   	if(ConfigInit.magenta == true){
	       	seed(ModItems.MAGENTA_SEED, new ItemStack(Items.DYE, 1, 13), ModItems.GOLD_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.DYE, ConfigInit.magentaRate, 13), ModItems.MAGENTA_FRUIT);
	   	}
	   	if(ConfigInit.lightblue == true){
	       	seed(ModItems.LIGHTBLUE_SEED, new ItemStack(Items.DYE, 1, 12), ModItems.GOLD_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.DYE, ConfigInit.lightblueRate, 12), ModItems.LIGHTBLUE_FRUIT);
	   	}
	   	if(ConfigInit.yellow == true){
	       	seed(ModItems.YELLOW_SEED, new ItemStack(Items.DYE, 1, 11), ModItems.GOLD_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.DYE, ConfigInit.yellowRate, 11), ModItems.YELLOW_FRUIT);
	   	}
	   	if(ConfigInit.lime == true){
	       	seed(ModItems.LIME_SEED, new ItemStack(Items.DYE, 1, 10), ModItems.GOLD_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.DYE, ConfigInit.limeRate, 10), ModItems.LIME_FRUIT);
	   	}
	   	if(ConfigInit.pink == true){
	       	seed(ModItems.PINK_SEED, new ItemStack(Items.DYE, 1, 9), ModItems.GOLD_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.DYE, ConfigInit.pinkRate, 9), ModItems.PINK_FRUIT);
	   	}
	   	if(ConfigInit.gray == true){
	       	seed(ModItems.GRAY_SEED, new ItemStack(Items.DYE, 1, 8), ModItems.GOLD_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.DYE, ConfigInit.grayRate, 8), ModItems.GRAY_FRUIT);
	   	}
	   	if(ConfigInit.silver == true){
	       	seed(ModItems.SILVER_SEED, new ItemStack(Items.DYE, 1, 7), ModItems.GOLD_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.DYE, ConfigInit.silverRate, 7), ModItems.SILVER_FRUIT);
	   	}
	   	if(ConfigInit.cyan == true){
	       	seed(ModItems.CYAN_SEED, new ItemStack(Items.DYE, 1, 6), ModItems.GOLD_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.DYE, ConfigInit.cyanRate, 6), ModItems.CYAN_FRUIT);
	   	}
	   	if(ConfigInit.purple == true){
	       	seed(ModItems.PURPLE_SEED, new ItemStack(Items.DYE, 1, 5), ModItems.GOLD_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.DYE, ConfigInit.purpleRate, 5), ModItems.PURPLE_FRUIT);
	   	}
	   	if(ConfigInit.brown == true){
	       	seed(ModItems.BROWN_SEED, new ItemStack(Items.DYE, 1, 3), ModItems.GOLD_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.DYE, ConfigInit.brownRate, 3), ModItems.BROWN_FRUIT);
	   	}
	   	if(ConfigInit.green == true){
	       	seed(ModItems.GREEN_SEED, new ItemStack(Items.DYE, 1, 2), ModItems.GOLD_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.DYE, ConfigInit.greenRate, 2), ModItems.GREEN_FRUIT);
	   	}
	   	if(ConfigInit.red == true){
	       	seed(ModItems.RED_SEED, new ItemStack(Items.DYE, 1, 1), ModItems.GOLD_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.DYE, ConfigInit.redRate, 1), ModItems.RED_FRUIT);
	   	}
	   	if(ConfigInit.black == true){
	       	seed(ModItems.BLACK_SEED, new ItemStack(Items.DYE, 1, 0), ModItems.GOLD_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Items.DYE, ConfigInit.blackRate, 0), ModItems.BLACK_FRUIT);
	   	}
	   	if(ConfigInit.vine == true){
	       	seed(ModItems.VINE_SEED, new ItemStack(Blocks.VINE, 1, 0), ModItems.GOLD_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Blocks.VINE, ConfigInit.vineRate, 0), ModItems.VINE_FRUIT);
	   	}
	   	if(ConfigInit.lilypad == true){
	       	seed(ModItems.LILYPAD_SEED, new ItemStack(Blocks.WATERLILY, 1, 0), ModItems.GOLD_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Blocks.WATERLILY, ConfigInit.lilypadRate, 0), ModItems.LILYPAD_FRUIT);
	   	}
	   	if(ConfigInit.tallgrass == true){
	       	seed(ModItems.TALLGRASS_SEED, new ItemStack(Blocks.DOUBLE_PLANT, 1, 2), ModItems.GOLD_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Blocks.DOUBLE_PLANT, ConfigInit.tallgrassRate, 2), ModItems.TALLGRASS_FRUIT);
	   	}
	   	if(ConfigInit.largefern == true){
	       	seed(ModItems.LARGEFERN_SEED, new ItemStack(Blocks.DOUBLE_PLANT, 1, 3), ModItems.GOLD_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Blocks.DOUBLE_PLANT, ConfigInit.largefernRate, 3), ModItems.LARGEFERN_FRUIT);
	   	}
	   	if(ConfigInit.bush == true){
	       	seed(ModItems.BUSH_SEED, new ItemStack(Blocks.DEADBUSH, 1, 0), ModItems.GOLD_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Blocks.DEADBUSH, ConfigInit.bushRate, 0), ModItems.BUSH_FRUIT);
	   	}
	   	if(ConfigInit.grass1 == true){
	       	seed(ModItems.GRASS1_SEED, new ItemStack(Blocks.TALLGRASS, 1, 1), ModItems.GOLD_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Blocks.TALLGRASS, ConfigInit.grass1Rate, 1), ModItems.GRASS1_FRUIT);
	   	}
	   	if(ConfigInit.fern == true){
	       	seed(ModItems.FERN_SEED, new ItemStack(Blocks.TALLGRASS, 1, 2), ModItems.GOLD_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Blocks.TALLGRASS, ConfigInit.fernRate, 2), ModItems.FERN_FRUIT);
	   	}
	   	if(ConfigInit.oak == true){
	       	seed(ModItems.OAK_SEED, new ItemStack(Blocks.SAPLING, 1, 0), ModItems.GOLD_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Blocks.SAPLING, ConfigInit.oakRate, 0), ModItems.OAK_FRUIT);
	   	}
	   	if(ConfigInit.birch == true){
	       	seed(ModItems.BIRCH_SEED, new ItemStack(Blocks.SAPLING, 1, 1), ModItems.GOLD_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Blocks.SAPLING, ConfigInit.birchRate, 1), ModItems.BIRCH_FRUIT);
	   	}
	   	if(ConfigInit.spruce == true){
	       	seed(ModItems.SPRUCE_SEED, new ItemStack(Blocks.SAPLING, 1, 2), ModItems.GOLD_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Blocks.SAPLING, ConfigInit.spruceRate, 2), ModItems.SPRUCE_FRUIT);
	   	}
	   	if(ConfigInit.jungle == true){
	       	seed(ModItems.JUNGLE_SEED, new ItemStack(Blocks.SAPLING, 1, 3), ModItems.GOLD_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Blocks.SAPLING, ConfigInit.jungleRate, 3), ModItems.JUNGLE_FRUIT);
	   	}
	   	if(ConfigInit.darkoak == true){
	       	seed(ModItems.DARKOAK_SEED, new ItemStack(Blocks.SAPLING, 1, 5), ModItems.GOLD_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Blocks.SAPLING, ConfigInit.darkoakRate, 5), ModItems.DARKOAK_FRUIT);
	   	}
	   	if(ConfigInit.acacia == true){
	       	seed(ModItems.ACACIA_SEED, new ItemStack(Blocks.SAPLING, 1, 4), ModItems.GOLD_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(new ItemStack(Blocks.SAPLING, ConfigInit.acaciaRate, 4), ModItems.ACACIA_FRUIT);
	   	}
	   	if(ConfigInit.leather == true){
	       	seed(ModItems.LEATHER_SEED, Items.LEATHER, ModItems.IRON_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(Items.LEATHER, ConfigInit.leatherRate, ModItems.LEATHER_FRUIT);
	   	}
	   	if(ConfigInit.feather == true){
	       	seed(ModItems.FEATHER_SEED, Items.FEATHER, ModItems.IRON_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(Items.FEATHER, ConfigInit.featherRate, ModItems.FEATHER_FRUIT);
	   	}
	   	if(ConfigInit.hide == true){
	       	seed(ModItems.HIDE_SEED, Items.RABBIT_HIDE, ModItems.IRON_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(Items.RABBIT_HIDE, ConfigInit.hideRate, ModItems.HIDE_FRUIT);
	   	}
	   	if(ConfigInit.foot == true){
	       	seed(ModItems.FOOT_SEED, Items.RABBIT_FOOT, ModItems.IRON_FRUIT, Items.WHEAT_SEEDS);
	       	fruit(Items.RABBIT_FOOT, ConfigInit.footRate, ModItems.FOOT_FRUIT);
	   	}
	   	
	   	if(ConfigInit.coalStem == true)
        	seedStem(ModItems.COAL_SEED_STEM, Blocks.COAL_BLOCK);
    	if(ConfigInit.ironStem == true)
        	seedStem(ModItems.IRON_SEED_STEM, Blocks.IRON_BLOCK);
		if(ConfigInit.goldStem == true)
        	seedStem(ModItems.GOLD_SEED_STEM, Blocks.GOLD_BLOCK);
    	if(ConfigInit.redstoneStem == true)
        	seedStem(ModItems.REDSTONE_SEED_STEM, Blocks.REDSTONE_BLOCK);
    	if(ConfigInit.lapisStem == true)
        	seedStem(ModItems.LAPIS_SEED_STEM, Blocks.LAPIS_BLOCK);
    	if(ConfigInit.diamondStem == true)
        	seedStem(ModItems.DIAMOND_SEED_STEM, Blocks.DIAMOND_BLOCK);
    	if(ConfigInit.emeraldStem == true)
        	seedStem(ModItems.EMERALD_SEED_STEM, Blocks.EMERALD_BLOCK);
    	if(ConfigInit.spongeStem == true)
        	seedStem(ModItems.SPONGE_SEED_STEM, Blocks.SPONGE);
    	if(ConfigInit.glassStem == true)
        	seedStem(ModItems.GLASS_SEED_STEM, Blocks.GLASS);
    	if(ConfigInit.brickStem == true)
        	seedStem(ModItems.BRICK_SEED_STEM, Blocks.BRICK_BLOCK);
    	if(ConfigInit.bookshelfStem == true)
        	seedStem(ModItems.BOOKSHELF_SEED_STEM, Blocks.BOOKSHELF);
    	if(ConfigInit.iceStem == true)
        	seedStem(ModItems.ICE_SEED_STEM, Blocks.ICE);
    	if(ConfigInit.snowStem == true)
        	seedStem(ModItems.SNOW_SEED_STEM, Blocks.SNOW);
    	if(ConfigInit.clayStem == true)
        	seedStem(ModItems.CLAY_SEED_STEM, Blocks.CLAY);
    	if(ConfigInit.soulsandStem == true)
        	seedStem(ModItems.SOULSAND_SEED_STEM, Blocks.SOUL_SAND);
    	if(ConfigInit.glowstoneStem == true)
        	seedStem(ModItems.GLOWSTONE_SEED_STEM, Blocks.GLOWSTONE);
    	if(ConfigInit.netherStem == true)
        	seedStem(ModItems.NETHER_SEED_STEM, Blocks.NETHER_BRICK);
    	if(ConfigInit.quartzStem == true)
        	seedStem(ModItems.QUARTZ_SEED_STEM, Blocks.QUARTZ_BLOCK);
    	if(ConfigInit.sealanternStem == true)
        	seedStem(ModItems.SEALANTERN_SEED_STEM, Blocks.SEA_LANTERN);
    	if(ConfigInit.packediceStem == true)
        	seedStem(ModItems.PACKEDICE_SEED_STEM, Blocks.PACKED_ICE);
    	if(ConfigInit.magmaStem == true)
        	seedStem(ModItems.MAGMA_SEED_STEM, Blocks.MAGMA);
    	if(ConfigInit.netherwartStem == true)
        	seedStem(ModItems.NETHERWART_SEED_STEM, Blocks.NETHER_WART_BLOCK);
    	if(ConfigInit.boneStem == true)
        	seedStem(ModItems.BONE_SEED_STEM, Blocks.BONE_BLOCK);
    	if(ConfigInit.obsidianStem == true)
        	seedStem(ModItems.OBSIDIAN_SEED_STEM, Blocks.OBSIDIAN);
    	if(ConfigInit.endStem == true)
        	seedStem(ModItems.END_SEED_STEM, Blocks.END_BRICKS);
    	
	   	if(ConfigInit.aluminium == true){
	       	seed(ModItems.ALUMINIUM_SEED, "ingotAluminum", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.ALUMINIUM_ITEM, ConfigInit.aluminiumRate, ModItems.ALUMINIUM_FRUIT);
	   	}
	   	if(ConfigInit.brass == true){
	       	seed(ModItems.BRASS_SEED, "ingotBrass", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.BRASS_ITEM, ConfigInit.brassRate, ModItems.BRASS_FRUIT);
	   	}
	   	if(ConfigInit.bronze == true){
	       	seed(ModItems.BRONZE_SEED, "ingotBronze", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.BRONZE_ITEM, ConfigInit.aluminiumRate, ModItems.BRONZE_FRUIT);
	   	}
	   	if(ConfigInit.chrome == true){
	       	seed(ModItems.CHROME_SEED, "ingotChrome", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.CHROME_ITEM, ConfigInit.chromeRate, ModItems.CHROME_FRUIT);
	   	}
	   	if(ConfigInit.copper == true){
	       	seed(ModItems.COPPER_SEED, "ingotCopper", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.COPPER_ITEM, ConfigInit.copperRate, ModItems.COPPER_FRUIT);
	   	}
	   	if(ConfigInit.electrum == true){
	       	seed(ModItems.ELECTRUM_SEED, "ingotElectrum", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.ELECTRUM_ITEM, ConfigInit.electrumRate, ModItems.ELECTRUM_FRUIT);
	   	}
	   	if(ConfigInit.invar == true){
	       	seed(ModItems.INVAR_SEED, "ingotInvar", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.INVAR_ITEM, ConfigInit.invarRate, ModItems.INVAR_FRUIT);
	   	}
	   	if(ConfigInit.iridium == true){
	       	seed(ModItems.IRIDIUM_SEED, "ingotIridium", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.IRIDIUM_ITEM, ConfigInit.iridiumRate, ModItems.IRIDIUM_FRUIT);
	   	}
	   	if(ConfigInit.lead == true){
	       	seed(ModItems.LEAD_SEED, "ingotLead", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.LEAD_ITEM, ConfigInit.leadRate, ModItems.LEAD_FRUIT);
	   	}
	   	if(ConfigInit.nickel == true){
	       	seed(ModItems.NICKEL_SEED, "ingotNickel", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.NICKEL_ITEM, ConfigInit.nickelRate, ModItems.NICKEL_FRUIT);
	   	}
	   	if(ConfigInit.platinium == true){
	       	seed(ModItems.PLATINIUM_SEED, "ingotPlatinum", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.PLATINIUM_ITEM, ConfigInit.platiniumRate, ModItems.PLATINIUM_FRUIT);
	   	}
	   	if(ConfigInit.silveringot == true){
	       	seed(ModItems.SILVERINGOT_SEED, "ingotSilver", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.SILVERINGOT_ITEM, ConfigInit.silveringotRate, ModItems.SILVERINGOT_FRUIT);
	   	}
	   	if(ConfigInit.steel == true){
	       	seed(ModItems.STEEL_SEED, "ingotSteel", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.STEEL_ITEM, ConfigInit.steelRate, ModItems.STEEL_FRUIT);
	   	}
	   	if(ConfigInit.tin == true){
	       	seed(ModItems.TIN_SEED, "ingotTin", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.TIN_ITEM, ConfigInit.tinRate, ModItems.TIN_FRUIT);
	   	}
	   	if(ConfigInit.titanium == true){
	       	seed(ModItems.TITANIUM_SEED, "ingotTitanium", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.TITANIUM_ITEM, ConfigInit.titaniumRate, ModItems.TITANIUM_FRUIT);
	   	}
	   	if(ConfigInit.tungsten == true){
	       	seed(ModItems.TUNGSTEN_SEED, "ingotTungsten", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.TUNGSTEN_ITEM, ConfigInit.tungstenRate, ModItems.TUNGSTEN_FRUIT);
	   	}
	   	if(ConfigInit.zinc == true){
	       	seed(ModItems.ZINC_SEED, "ingotZinc", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.ZINC_ITEM, ConfigInit.zincRate, ModItems.ZINC_FRUIT);
	   	}
	   	if(ConfigInit.manasteel == true){
	       	seed(ModItems.MANASTEEL_SEED, "ingotManasteel", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.MANASTEEL_ITEM, ConfigInit.manasteelRate, ModItems.MANASTEEL_FRUIT);
	   	}
	   	if(ConfigInit.terrasteel == true){
	       	seed(ModItems.TERRASTEEL_SEED, "ingotTerrasteel", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.TERRASTEEL_ITEM, ConfigInit.terrasteelRate, ModItems.TERRASTEEL_FRUIT);
	   	}
	   	if(ConfigInit.manadiamond == true){
	       	seed(ModItems.MANADIAMOND_SEED, "manaDiamond", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.MANADIAMOND_ITEM, ConfigInit.manadiamondRate, ModItems.MANADIAMOND_FRUIT);
	   	}
	   	if(ConfigInit.manapearl == true){
	       	seed(ModItems.MANAPEARL_SEED, "manaPearl", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.MANAPEARL_ITEM, ConfigInit.manapearlRate, ModItems.MANAPEARL_FRUIT);
	   	}
	   	if(ConfigInit.elementium == true){
	       	seed(ModItems.ELEMENTIUM_SEED, "ingotElementium", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.ELEMENTIUM_ITEM, ConfigInit.elementiumRate, ModItems.ELEMENTIUM_FRUIT);
	   	}
	   	if(ConfigInit.dragonstone == true){
	       	seed(ModItems.DRAGONSTONE_SEED, "elvenDragonstone", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.DRAGONSTONE_ITEM, ConfigInit.dragonstoneRate, ModItems.DRAGONSTONE_FRUIT);
	   	}
	   	if(ConfigInit.gearwood == true){
	       	seed(ModItems.GEARWOOD_SEED, "gearWood", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.GEARWOOD_ITEM, ConfigInit.gearwoodRate, ModItems.GEARWOOD_FRUIT);
	   	}
	   	if(ConfigInit.gearstone == true){
	       	seed(ModItems.GEARSTONE_SEED, "gearStone", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.GEARSTONE_ITEM, ConfigInit.gearstoneRate, ModItems.GEARSTONE_FRUIT);
	   	}
	   	if(ConfigInit.geariron == true){
	       	seed(ModItems.GEARIRON_SEED, "gearIron", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.GEARIRON_ITEM, ConfigInit.gearironRate, ModItems.GEARIRON_FRUIT);
	   	}
	   	if(ConfigInit.geargold == true){
	       	seed(ModItems.GEARGOLD_SEED, "gearGold", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.GEARGOLD_ITEM, ConfigInit.geargoldRate, ModItems.GEARGOLD_FRUIT);
	   	}
	   	if(ConfigInit.geardiamond == true){
	       	seed(ModItems.GEARDIAMOND_SEED, "gearDiamond", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.GEARDIAMOND_ITEM, ConfigInit.geardiamondRate, ModItems.GEARDIAMOND_FRUIT);
	   	}
	   	if(ConfigInit.yellorium == true){
	       	seed(ModItems.YELLORIUM_SEED, "ingotYellorium", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.YELLORIUM_ITEM, ConfigInit.yelloriumRate, ModItems.YELLORIUM_FRUIT);
	   	}
	   	if(ConfigInit.blutonium == true){
	       	seed(ModItems.BLUTONIUM_SEED, "ingotBlutonium", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.BLUTONIUM_ITEM, ConfigInit.blutoniumRate, ModItems.BLUTONIUM_FRUIT);
	   	}
	   	if(ConfigInit.cyanite == true){
	       	seed(ModItems.CYANITE_SEED, "ingotCyanite", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.CYANITE_ITEM, ConfigInit.cyaniteRate, ModItems.CYANITE_FRUIT);
	   	}
	   	if(ConfigInit.graphite == true){
	       	seed(ModItems.GRAPHITE_SEED, "ingotGraphite", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.GRAPHITE_ITEM, ConfigInit.graphiteRate, ModItems.GRAPHITE_FRUIT);
	   	}
	   	if(ConfigInit.ludicrite == true){
	       	seed(ModItems.LUDICRITE_SEED, "ingotLudicrite", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.LUDICRITE_ITEM, ConfigInit.ludicriteRate, ModItems.LUDICRITE_FRUIT);
	   	}
	   	if(ConfigInit.enderium == true){
	       	seed(ModItems.ENDERIUM_SEED, "ingotEnderium", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.ENDERIUM_ITEM, ConfigInit.enderiumRate, ModItems.ENDERIUM_FRUIT);
	   	}
	   	if(ConfigInit.lumium == true){
	       	seed(ModItems.LUMIUM_SEED, "ingotLumium", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.LUMIUM_ITEM, ConfigInit.lumiumRate, ModItems.LUMIUM_FRUIT);
	   	}
	   	if(ConfigInit.signalum == true){
	       	seed(ModItems.SIGNALUM_SEED, "ingotSignalum", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.SIGNALUM_ITEM, ConfigInit.signalumRate, ModItems.SIGNALUM_FRUIT);
	   	}
	   	if(ConfigInit.constantan == true){
	       	seed(ModItems.CONSTANTAN_SEED, "ingotConstantan", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.CONSTANTAN_ITEM, ConfigInit.constantanRate, ModItems.CONSTANTAN_FRUIT);
	   	}
	   	if(ConfigInit.mithril == true){
	       	seed(ModItems.MITHRIL_SEED, "ingotMithril", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.MITHRIL_ITEM, ConfigInit.mithrilRate, ModItems.MITHRIL_FRUIT);
	   	}
	   	if(ConfigInit.uranium == true){
	       	seed(ModItems.URANIUM_SEED, "ingotUranium", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.URANIUM_ITEM, ConfigInit.uraniumRate, ModItems.URANIUM_FRUIT);
	   	}
	   	if(ConfigInit.apatite == true){
	       	seed(ModItems.APATITE_SEED, "gemApatite", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.APATITE_ITEM, ConfigInit.apatiteRate, ModItems.APATITE_FRUIT);
	   	}
	   	if(ConfigInit.silicon == true){
	       	seed(ModItems.SILICON_SEED, "itemSilicon", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.SILICON_ITEM, ConfigInit.siliconRate, ModItems.SILICON_FRUIT);
	   	}
	   	if(ConfigInit.draconium == true){
	       	seed(ModItems.DRACONIUM_SEED, "ingotDraconium", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.DRACONIUM_ITEM, ConfigInit.draconiumRate, ModItems.DRACONIUM_FRUIT);
	   	}
	   	if(ConfigInit.draconium_awakened == true){
	       	seed(ModItems.DRACONIUM_AWAKENED_SEED, "ingotDraconiumAwakened", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.DRACONIUM_AWAKENED_ITEM, ConfigInit.draconium_awakenedRate, ModItems.DRACONIUM_AWAKENED_FRUIT);
	   	}
	   	if(ConfigInit.osmium == true){
	       	seed(ModItems.OSMIUM_SEED, "ingotOsmium", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.OSMIUM_ITEM, ConfigInit.osmiumRate, ModItems.OSMIUM_FRUIT);
	   	}
	   	if(ConfigInit.gaia == true){
	       	seed(ModItems.GAIA_SEED, "eternalLifeEssence", ModItems.IRON_FRUIT, ModItems.IRON_SEED);
	       	fruit(ModItems.GAIA_ITEM, ConfigInit.gaiaRate, ModItems.GAIA_FRUIT);
	   	}
	   	
	   	if(ConfigInit.enableFurnace == true) {
	   		ShapedOreRecipe(new ItemStack(ModBlocks.COAL_FURNACE), new Object[] { "CfC", "CFC", "CfC", 'f', ModItems.COAL_FRUIT, 'F', Blocks.FURNACE, 'C', Blocks.COAL_BLOCK});
	   		ShapedOreRecipe(new ItemStack(ModBlocks.IRON_FURNACE), new Object[] { "CfC", "CFC", "CfC", 'f', ModItems.IRON_FRUIT, 'F', ModBlocks.COAL_FURNACE, 'C', Blocks.IRON_BLOCK});
	   		ShapedOreRecipe(new ItemStack(ModBlocks.GOLD_FURNACE), new Object[] { "CfC", "CFC", "CfC", 'f', ModItems.GOLD_FRUIT, 'F', ModBlocks.IRON_FURNACE, 'C', Blocks.GOLD_BLOCK});
	   		ShapedOreRecipe(new ItemStack(ModBlocks.REDSTONE_FURNACE), new Object[] { "CfC", "CFC", "CfC", 'f', ModItems.REDSTONE_FRUIT, 'F', ModBlocks.GOLD_FURNACE, 'C', Blocks.REDSTONE_BLOCK});
	   		ShapedOreRecipe(new ItemStack(ModBlocks.LAPIS_FURNACE), new Object[] { "CfC", "CFC", "CfC", 'f', ModItems.LAPIS_FRUIT, 'F', ModBlocks.REDSTONE_FURNACE, 'C', Blocks.LAPIS_BLOCK});
	   		ShapedOreRecipe(new ItemStack(ModBlocks.DIAMOND_FURNACE), new Object[] { "CfC", "CFC", "CfC", 'f', ModItems.DIAMOND_FRUIT, 'F', ModBlocks.LAPIS_FURNACE, 'C', Blocks.DIAMOND_BLOCK});
	   		ShapedOreRecipe(new ItemStack(ModBlocks.OBSIDIAN_FURNACE), new Object[] { "CCC", "CFC", "CCC", 'F', ModBlocks.DIAMOND_FURNACE, 'C', Blocks.OBSIDIAN});
			ShapedOreRecipe(new ItemStack(ModBlocks.RENFORCED_FURNACE), new Object[] { "CfC", "CFC", "CfC", 'f', ModBlocks.DIAMOND_FURNACE, 'F', ModBlocks.OBSIDIAN_FURNACE, 'C', Items.DIAMOND});
			ShapedOreRecipe(new ItemStack(ModBlocks.FIRE_FURNACE), new Object[] { "CCC", "CFC", "CCC", 'F', ModBlocks.RENFORCED_FURNACE, 'C', ModItems.ELEMENTAL_FIRE});
		   	}
	   		
	   	if(ConfigInit.enableReward == true) {
	   		ShapedOreRecipe(new ItemStack(ModBlocks.REWARD), new Object[] { "GPG", "PDP", "GPG", 'D', Blocks.DIAMOND_BLOCK, 'P', Items.PAPER, 'G', Items.GOLD_INGOT});
	   	}

		ShapedOreRecipe(new ItemStack(ModBlocks.RITUAL_STAND), new Object[] { "ata", 'a', Blocks.ANVIL, 't', Blocks.IRON_TRAPDOOR});
		ShapedOreRecipe(new ItemStack(ModBlocks.RITUAL_STAND_t2), new Object[] { " a ", "tgt", 'a', ModBlocks.RITUAL_STAND, 't', Items.GOLD_INGOT, 'g', Blocks.GOLD_BLOCK});
		ShapedOreRecipe(new ItemStack(ModBlocks.RITUAL_STAND_t3), new Object[] { " a ", "tgt", 'a', ModBlocks.RITUAL_STAND_t2, 't', Items.DIAMOND, 'g', Blocks.DIAMOND_BLOCK});
	   	
	}
	


	public static void seed(Item output, Item ore, Item fruit, Item seed)
	{
		ShapedOreRecipe(new ItemStack(output), new Object[] { "iIi", "ISI", "iIi", 'i', ore, 'S', fruit, 'I', seed});
	}
	public static void seed(Item output, String ore, Item fruit, Item seed)
	{
		ShapedOreRecipe(new ItemStack(output), new Object[] { "iIi", "ISI", "iIi", 'i', ore, 'S', fruit, 'I', seed});
	}
	public static void seed(ItemStack output, Item ore, Item fruit, Item seed)
	{
		ShapedOreRecipe(output, new Object[] { "iIi", "ISI", "iIi", 'i', ore, 'S', fruit, 'I', seed});
	}
	public static void seedStem(Item coalSeedStem, Block craft)
	{
		ShapedOreRecipe(new ItemStack(coalSeedStem), new Object[] { " i ", "iai", " i ", 'a', Items.MELON_SEEDS, 'i', craft});
		ShapedOreRecipe(new ItemStack(coalSeedStem), new Object[] { " i ", "iai", " i ", 'a', Items.PUMPKIN_SEEDS, 'i', craft});
	}
	
	public static void seed(Item output, ItemStack ore, Item fruit, Item seed)
	{
		ShapedOreRecipe(new ItemStack(output), new Object[] { "iIi", "ISI", "iIi", 'i', ore, 'S', fruit, 'I', seed});
	}	

	public static void fruit(Item output, int i, Item input)
	{
		ShapelessOreRecipe(new ItemStack(output, i), new ItemStack(input));	
	}
	
	public static void fruit(ItemStack output, Item input)
	{
		ShapelessOreRecipe(output, new ItemStack(input));	
	}
	public static void ShapedOreRecipe(ItemStack output, Object... input){
		ForgeRegistries.RECIPES.register(new ShapedOreRecipe(new ResourceLocation(""), output, input).setRegistryName(getLocation(output)));
	}
	public static void ShapelessOreRecipe(ItemStack output, Object... input){
		ForgeRegistries.RECIPES.register(new ShapelessOreRecipe(new ResourceLocation(""), output, input).setRegistryName(getLocation(output)));
	}
	
	public static ResourceLocation getLocation(ItemStack output){
    	String modid = Reference.MOD_ID;
        ResourceLocation resourceLocation = new ResourceLocation(modid, output.getItem().getRegistryName().getResourcePath());
        ResourceLocation location = resourceLocation;
        int i = 0;

        while(CraftingManager.REGISTRY.containsKey(location)){
            i++;
            location = new ResourceLocation(modid, resourceLocation.getResourcePath() + "_" + i);
        }
        
        return location;
    }
}
