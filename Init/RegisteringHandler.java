package com.croparia.mod.Init;

import com.croparia.mod.Config.ConfigInit;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RegisteringHandler 
{

	@SubscribeEvent
    public void registerBlocks(RegistryEvent.Register <Block>event)
    {

        
        event.getRegistry().registerAll(
        		ModBlocks.COAL_CROP,
        		ModBlocks.IRON_CROP,
        		ModBlocks.GOLD_CROP,
        		ModBlocks.REDSTONE_CROP,
        		ModBlocks.LAPIS_CROP,
        		ModBlocks.DIAMOND_CROP,
        		ModBlocks.EMERALD_CROP,
        		ModBlocks.ELEMENTAL_CROP,

        		ModBlocks.ELEMENTAL_STONE,
        		ModBlocks.WATER_BLOCK,
        		ModBlocks.FIRE_BLOCK,
        		ModBlocks.EARTH_BLOCK,
        		ModBlocks.AIR_BLOCK,
        		ModBlocks.WATER_GEM_ORE,
        		ModBlocks.FIRE_GEM_ORE,
        		ModBlocks.EARTH_GEM_ORE,
        		ModBlocks.AIR_GEM_ORE,
        		ModBlocks.QUICK_ICE,
        		ModBlocks.ICY_PLANT,
        		ModBlocks.POISONOUS_ICY_PLANT,
        		ModBlocks.OBSIDIAN_GROUND,
        		ModBlocks.FIRED_OBSIDIAN_GROUND,
        		ModBlocks.QUICK_SAND,
        		ModBlocks.CLOUD,
        		ModBlocks.BOUNCE_CLOUD,
        		ModBlocks.INFUSOR,
        		ModBlocks.INFUSOR_ELEMENTAL,
        		ModBlocks.INFUSOR_WATER,
        		ModBlocks.INFUSOR_FIRE,
        		ModBlocks.INFUSOR_EARTH,
        		ModBlocks.INFUSOR_AIR,
        		ModBlocks.INFUSOR2,
        		ModBlocks.INFUSOR2_ELEMENTAL,
        		ModBlocks.INFUSOR2_WATER,
        		ModBlocks.INFUSOR2_FIRE,
        		ModBlocks.INFUSOR2_EARTH,
        		ModBlocks.INFUSOR2_AIR,
        		ModBlocks.RITUAL_STAND,
        		ModBlocks.RITUAL_STAND_t2,
        		ModBlocks.RITUAL_STAND_t3,
        		ModBlocks.GREENHOUSE,
        		ModBlocks.ELEMENTAL_STEM, 
        		ModBlocks.BLOCK_PLANT_ELEMENTAL);
        
        if(ConfigInit.enableApricot == true)
        	event.getRegistry().registerAll(ModBlocks.APRICOT_CROP, ModBlocks.APRICOT_PLANT);
        if(ConfigInit.enableBanana == true)
        	event.getRegistry().registerAll(ModBlocks.BANANA_CROP, ModBlocks.BANANA_PLANT);
        if(ConfigInit.enableCherry == true)
        	event.getRegistry().registerAll(ModBlocks.CHERRY_CROP, ModBlocks.CHERRY_PLANT);
        if(ConfigInit.enableKiwi == true)
        	event.getRegistry().registerAll(ModBlocks.KIWI_CROP, ModBlocks.KIWI_PLANT);
        if(ConfigInit.enableLemon == true)
        	event.getRegistry().registerAll(ModBlocks.LEMON_CROP, ModBlocks.LEMON_PLANT);
        if(ConfigInit.enableOrange == true)
        	event.getRegistry().registerAll(ModBlocks.ORANGE_CROP, ModBlocks.ORANGE_PLANT);
        if(ConfigInit.enablePear == true)
        	event.getRegistry().registerAll(ModBlocks.PEAR_CROP, ModBlocks.PEAR_PLANT);
        
        if(ConfigInit.enableReward == true)
        	event.getRegistry().registerAll(ModBlocks.REWARD);
        if(ConfigInit.enableFurnace == true)
        	event.getRegistry().registerAll(
        			ModBlocks.COAL_FURNACE, ModBlocks.LIT_COAL_FURNACE,
        			ModBlocks.IRON_FURNACE, ModBlocks.LIT_IRON_FURNACE,
					ModBlocks.GOLD_FURNACE, ModBlocks.LIT_GOLD_FURNACE,
					ModBlocks.REDSTONE_FURNACE, ModBlocks.LIT_REDSTONE_FURNACE,
					ModBlocks.LAPIS_FURNACE, ModBlocks.LIT_LAPIS_FURNACE,
					ModBlocks.DIAMOND_FURNACE, ModBlocks.LIT_DIAMOND_FURNACE,
					ModBlocks.OBSIDIAN_FURNACE, ModBlocks.LIT_OBSIDIAN_FURNACE,
					ModBlocks.RENFORCED_FURNACE, ModBlocks.LIT_RENFORCED_FURNACE,
					ModBlocks.FIRE_FURNACE, ModBlocks.LIT_FIRE_FURNACE);

        
        if(ConfigInit.clay == true)
        	event.getRegistry().register(ModBlocks.CLAY_CROP);
        if(ConfigInit.glowstone == true)
        	event.getRegistry().register(ModBlocks.GLOWSTONE_CROP);
        if(ConfigInit.quartz == true)
        	event.getRegistry().register(ModBlocks.QUARTZ_CROP);
        if(ConfigInit.shard == true)
        	event.getRegistry().register(ModBlocks.SHARD_CROP);
        if(ConfigInit.cristal == true)
        	event.getRegistry().register(ModBlocks.CRYSTAL_CROP);
        if(ConfigInit.paper == true)
        	event.getRegistry().register(ModBlocks.PAPER_CROP);
        if(ConfigInit.sugar == true)
        	event.getRegistry().register(ModBlocks.SUGAR_CROP);
        if(ConfigInit.charcoal == true)
        	event.getRegistry().register(ModBlocks.CHARCOAL_CROP);
        if(ConfigInit.flint == true)
        	event.getRegistry().register(ModBlocks.FLINT_CROP);
        if(ConfigInit.snowball == true)
        	event.getRegistry().register(ModBlocks.SNOWBALL_CROP);	
        if(ConfigInit.firework == true)
        	event.getRegistry().register(ModBlocks.FIREWORK_CROP);
        if(ConfigInit.nether == true)
        	event.getRegistry().register(ModBlocks.NETHER_CROP);
    	if(ConfigInit.bottle == true)
        	event.getRegistry().register(ModBlocks.BOTTLE_CROP);
    	if(ConfigInit.totem == true)
        	event.getRegistry().register(ModBlocks.TOTEM_CROP);
    	if(ConfigInit.lead2 == true)
        	event.getRegistry().register(ModBlocks.LEAD2_CROP);
    	if(ConfigInit.nametag == true)
        	event.getRegistry().register(ModBlocks.NAMETAG_CROP);
    	if(ConfigInit.xp == true)
        	event.getRegistry().register(ModBlocks.XP_CROP);
    	if(ConfigInit.ender == true)
        	event.getRegistry().register(ModBlocks.ENDER_CROP);
    	if(ConfigInit.bone == true)
        	event.getRegistry().register(ModBlocks.BONE_CROP);
    	if(ConfigInit.eye == true)
        	event.getRegistry().register(ModBlocks.EYE_CROP);
    	if(ConfigInit.powder == true)
        	event.getRegistry().register(ModBlocks.POWDER_CROP);
    	if(ConfigInit.blaze == true)
        	event.getRegistry().register(ModBlocks.BLAZE_CROP);
    	if(ConfigInit.ghast == true)
        	event.getRegistry().register(ModBlocks.GHAST_CROP);
    	if(ConfigInit.magma == true)
        	event.getRegistry().register(ModBlocks.MAGMA_CROP);
    	if(ConfigInit.shell == true)
        	event.getRegistry().register(ModBlocks.SHELL_CROP);
    	if(ConfigInit.slime == true)
        	event.getRegistry().register(ModBlocks.SLIME_CROP);
    	if(ConfigInit.star == true)
        	event.getRegistry().register(ModBlocks.STAR_CROP);
    	if(ConfigInit.string == true)
        	event.getRegistry().register(ModBlocks.STRING_CROP);
    	if(ConfigInit.zombie == true)
        	event.getRegistry().register(ModBlocks.ZOMBIE_CROP);
    	if(ConfigInit.apple == true)
        	event.getRegistry().register(ModBlocks.APPLE_CROP);
    	if(ConfigInit.goldenapple == true)
        	event.getRegistry().register(ModBlocks.GOLDENAPPLE_CROP);
    	if(ConfigInit.bread == true)
        	event.getRegistry().register(ModBlocks.BREAD_CROP);
    	if(ConfigInit.egg == true)
        	event.getRegistry().register(ModBlocks.EGG_CROP);
    	if(ConfigInit.clownfish == true)
        	event.getRegistry().register(ModBlocks.CLOWNFISH_CROP);
    	if(ConfigInit.pufferfish == true)
        	event.getRegistry().register(ModBlocks.PUFFERFISH_CROP);
    	if(ConfigInit.cookie == true)
        	event.getRegistry().register(ModBlocks.COOKIE_CROP);
    	if(ConfigInit.chorus == true)
        	event.getRegistry().register(ModBlocks.CHORUS_CROP);
    	if(ConfigInit.rawporc == true)
        	event.getRegistry().register(ModBlocks.RAWPORC_CROP);
    	if(ConfigInit.rawbeef == true)
        	event.getRegistry().register(ModBlocks.RAWBEEF_CROP);
    	if(ConfigInit.fish == true)
        	event.getRegistry().register(ModBlocks.FISH_CROP);
    	if(ConfigInit.salmon == true)
        	event.getRegistry().register(ModBlocks.SALMON_CROP);
    	if(ConfigInit.rawmutton == true)
        	event.getRegistry().register(ModBlocks.RAWMUTTON_CROP);
    	if(ConfigInit.rawrabbit == true)
        	event.getRegistry().register(ModBlocks.RAWRABBIT_CROP);
    	if(ConfigInit.rawchicken == true)
        	event.getRegistry().register(ModBlocks.RAWCHICKEN_CROP);
    	if(ConfigInit.orange == true)
        	event.getRegistry().register(ModBlocks.ORANGE_CROP1);
    	if(ConfigInit.magenta == true)
        	event.getRegistry().register(ModBlocks.MAGENTA_CROP);
    	if(ConfigInit.lightblue == true)
        	event.getRegistry().register(ModBlocks.LIGHTBLUE_CROP);
    	if(ConfigInit.yellow == true)
        	event.getRegistry().register(ModBlocks.YELLOW_CROP);
    	if(ConfigInit.lime == true)
        	event.getRegistry().register(ModBlocks.LIME_CROP);
    	if(ConfigInit.pink == true)
        	event.getRegistry().register(ModBlocks.PINK_CROP);
    	if(ConfigInit.gray == true)
        	event.getRegistry().register(ModBlocks.GRAY_CROP);
    	if(ConfigInit.silver == true)
        	event.getRegistry().register(ModBlocks.SILVER_CROP);
    	if(ConfigInit.cyan == true)
        	event.getRegistry().register(ModBlocks.CYAN_CROP);
    	if(ConfigInit.purple == true)
        	event.getRegistry().register(ModBlocks.PURPLE_CROP);
    	if(ConfigInit.brown == true)
        	event.getRegistry().register(ModBlocks.BROWN_CROP);
    	if(ConfigInit.green == true)
        	event.getRegistry().register(ModBlocks.GREEN_CROP);
    	if(ConfigInit.red == true)
        	event.getRegistry().register(ModBlocks.RED_CROP);
    	if(ConfigInit.black == true)
        	event.getRegistry().register(ModBlocks.BLACK_CROP);
    	if(ConfigInit.vine == true)
        	event.getRegistry().register(ModBlocks.VINE_CROP);
    	if(ConfigInit.lilypad == true)
        	event.getRegistry().register(ModBlocks.LILYPAD_CROP);
    	if(ConfigInit.tallgrass == true)
        	event.getRegistry().register(ModBlocks.TALLGRASS_CROP);
    	if(ConfigInit.largefern == true)
        	event.getRegistry().register(ModBlocks.LARGEFERN_CROP);
    	if(ConfigInit.bush == true)
        	event.getRegistry().register(ModBlocks.BUSH_CROP);
    	if(ConfigInit.grass1 == true)
        	event.getRegistry().register(ModBlocks.GRASS1_CROP);
    	if(ConfigInit.fern == true)
        	event.getRegistry().register(ModBlocks.FERN_CROP);
    	if(ConfigInit.oak == true)
        	event.getRegistry().register(ModBlocks.OAK_CROP);
    	if(ConfigInit.birch == true)
        	event.getRegistry().register(ModBlocks.BIRCH_CROP);
    	if(ConfigInit.spruce == true)
        	event.getRegistry().register(ModBlocks.SPRUCE_CROP);
    	if(ConfigInit.jungle == true)
        	event.getRegistry().register(ModBlocks.JUNGLE_CROP);
    	if(ConfigInit.darkoak == true)
        	event.getRegistry().register(ModBlocks.DARKOAK_CROP);
    	if(ConfigInit.acacia == true)
        	event.getRegistry().register(ModBlocks.ACACIA_CROP);
    	if(ConfigInit.leather == true)
        	event.getRegistry().register(ModBlocks.LEATHER_CROP);
    	if(ConfigInit.feather == true)
        	event.getRegistry().register(ModBlocks.FEATHER_CROP);
    	if(ConfigInit.hide == true)
        	event.getRegistry().register(ModBlocks.HIDE_CROP);
    	if(ConfigInit.foot == true)
        	event.getRegistry().register(ModBlocks.FOOT_CROP);

    	if(ConfigInit.aluminium == true)
        	event.getRegistry().register(ModBlocks.ALUMINIUM_CROP);
    	if(ConfigInit.brass == true)
        	event.getRegistry().register(ModBlocks.BRASS_CROP);
    	if(ConfigInit.bronze == true)
        	event.getRegistry().register(ModBlocks.BRONZE_CROP);
    	if(ConfigInit.chrome == true)
        	event.getRegistry().register(ModBlocks.CHROME_CROP);
    	if(ConfigInit.copper == true)
        	event.getRegistry().register(ModBlocks.COPPER_CROP);
    	if(ConfigInit.electrum == true)
        	event.getRegistry().register(ModBlocks.ELECTRUM_CROP);
    	if(ConfigInit.invar == true)
        	event.getRegistry().register(ModBlocks.INVAR_CROP);
    	if(ConfigInit.iridium == true)
        	event.getRegistry().register(ModBlocks.IRIDIUM_CROP);
    	if(ConfigInit.lead == true)
        	event.getRegistry().register(ModBlocks.LEAD_CROP);
    	if(ConfigInit.nickel == true)
        	event.getRegistry().register(ModBlocks.NICKEL_CROP);
    	if(ConfigInit.platinium == true)
        	event.getRegistry().register(ModBlocks.PLATINIUM_CROP);
    	if(ConfigInit.silveringot == true)
        	event.getRegistry().register(ModBlocks.SILVERINGOT_CROP);
    	if(ConfigInit.steel == true)
        	event.getRegistry().register(ModBlocks.STEEL_CROP);
    	if(ConfigInit.tin == true)
        	event.getRegistry().register(ModBlocks.TIN_CROP);
    	if(ConfigInit.titanium == true)
        	event.getRegistry().register(ModBlocks.TITANIUM_CROP);
    	if(ConfigInit.tungsten == true)
        	event.getRegistry().register(ModBlocks.TUNGSTEN_CROP);
    	if(ConfigInit.zinc == true)
        	event.getRegistry().register(ModBlocks.ZINC_CROP);
    	if(ConfigInit.manasteel == true)
        	event.getRegistry().register(ModBlocks.MANASTEEL_CROP);
    	if(ConfigInit.terrasteel == true)
        	event.getRegistry().register(ModBlocks.TERRASTEEL_CROP);
    	if(ConfigInit.manadiamond == true)
        	event.getRegistry().register(ModBlocks.MANADIAMOND_CROP);
    	if(ConfigInit.manapearl == true)
        	event.getRegistry().register(ModBlocks.MANAPEARL_CROP);
    	if(ConfigInit.elementium == true)
        	event.getRegistry().register(ModBlocks.ELEMENTIUM_CROP);
    	if(ConfigInit.dragonstone == true)
        	event.getRegistry().register(ModBlocks.DRAGONSTONE_CROP);
    	if(ConfigInit.gearwood == true)
        	event.getRegistry().register(ModBlocks.GEARWOOD_CROP);
    	if(ConfigInit.gearstone == true)
        	event.getRegistry().register(ModBlocks.GEARSTONE_CROP);
    	if(ConfigInit.geariron == true)
        	event.getRegistry().register(ModBlocks.GEARIRON_CROP);
    	if(ConfigInit.geargold == true)
        	event.getRegistry().register(ModBlocks.GEARGOLD_CROP);
    	if(ConfigInit.geardiamond == true)
        	event.getRegistry().register(ModBlocks.GEARDIAMOND_CROP);
    	if(ConfigInit.yellorium == true)
        	event.getRegistry().register(ModBlocks.YELLORIUM_CROP);
    	if(ConfigInit.blutonium == true)
        	event.getRegistry().register(ModBlocks.BLUTONIUM_CROP);
    	if(ConfigInit.cyanite == true)
        	event.getRegistry().register(ModBlocks.CYANITE_CROP);
    	if(ConfigInit.graphite == true)
        	event.getRegistry().register(ModBlocks.GRAPHITE_CROP);
    	if(ConfigInit.ludicrite == true)
        	event.getRegistry().register(ModBlocks.LUDICRITE_CROP);
    	if(ConfigInit.enderium == true)
        	event.getRegistry().register(ModBlocks.ENDERIUM_CROP);
    	if(ConfigInit.lumium == true)
        	event.getRegistry().register(ModBlocks.LUMIUM_CROP);
    	if(ConfigInit.signalum == true)
        	event.getRegistry().register(ModBlocks.SIGNALUM_CROP);
    	if(ConfigInit.constantan == true)
        	event.getRegistry().register(ModBlocks.CONSTANTAN_CROP);
    	if(ConfigInit.mithril == true)
        	event.getRegistry().register(ModBlocks.MITHRIL_CROP);
    	if(ConfigInit.uranium == true)
        	event.getRegistry().register(ModBlocks.URANIUM_CROP);
    	if(ConfigInit.apatite == true)
        	event.getRegistry().register(ModBlocks.APATITE_CROP);
    	if(ConfigInit.silicon == true)
        	event.getRegistry().register(ModBlocks.SILICON_CROP);
    	if(ConfigInit.draconium == true)
        	event.getRegistry().register(ModBlocks.DRACONIUM_CROP);
    	if(ConfigInit.draconium_awakened == true)
        	event.getRegistry().register(ModBlocks.DRACONIUM_AWAKENED_CROP);
    	if(ConfigInit.osmium == true)
        	event.getRegistry().register(ModBlocks.OSMIUM_CROP);
    	if(ConfigInit.gaia == true)  		
        	event.getRegistry().register(ModBlocks.GAIA_CROP);
    	
    	if(ConfigInit.coalStem == true)
        	event.getRegistry().registerAll(ModBlocks.COAL_STEM, ModBlocks.BLOCK_PLANT_COAL);
    	if(ConfigInit.ironStem == true)
        	event.getRegistry().registerAll(ModBlocks.IRON_STEM, ModBlocks.BLOCK_PLANT_IRON);
		if(ConfigInit.goldStem == true)
        	event.getRegistry().registerAll(ModBlocks.GOLD_STEM, ModBlocks.BLOCK_PLANT_GOLD);
    	if(ConfigInit.redstoneStem == true)
        	event.getRegistry().registerAll(ModBlocks.REDSTONE_STEM, ModBlocks.BLOCK_PLANT_REDSTONE);
    	if(ConfigInit.lapisStem == true)
        	event.getRegistry().registerAll(ModBlocks.LAPIS_STEM, ModBlocks.BLOCK_PLANT_LAPIS);
    	if(ConfigInit.diamondStem == true)
        	event.getRegistry().registerAll(ModBlocks.DIAMOND_STEM, ModBlocks.BLOCK_PLANT_DIAMOND);
    	if(ConfigInit.emeraldStem == true)
        	event.getRegistry().registerAll(ModBlocks.EMERALD_STEM, ModBlocks.BLOCK_PLANT_EMERALD);
    	if(ConfigInit.spongeStem == true)
        	event.getRegistry().registerAll(ModBlocks.SPONGE_STEM, ModBlocks.BLOCK_PLANT_SPONGE);
    	if(ConfigInit.glassStem == true)
        	event.getRegistry().registerAll(ModBlocks.GLASS_STEM, ModBlocks.BLOCK_PLANT_GLASS);
    	if(ConfigInit.brickStem == true)
        	event.getRegistry().registerAll(ModBlocks.BRICK_STEM, ModBlocks.BLOCK_PLANT_BRICK);
    	if(ConfigInit.bookshelfStem == true)
        	event.getRegistry().registerAll(ModBlocks.BOOKSHELF_STEM, ModBlocks.BLOCK_PLANT_BOOKSHELF);
    	if(ConfigInit.iceStem == true)
        	event.getRegistry().registerAll(ModBlocks.ICE_STEM, ModBlocks.BLOCK_PLANT_ICE);
    	if(ConfigInit.snowStem == true)
        	event.getRegistry().registerAll(ModBlocks.SNOW_STEM, ModBlocks.BLOCK_PLANT_SNOW);
    	if(ConfigInit.clayStem == true)
        	event.getRegistry().registerAll(ModBlocks.CLAY_STEM, ModBlocks.BLOCK_PLANT_CLAY);
    	if(ConfigInit.soulsandStem == true)
        	event.getRegistry().registerAll(ModBlocks.SOULSAND_STEM, ModBlocks.BLOCK_PLANT_SOULSAND);
    	if(ConfigInit.glowstoneStem == true)
        	event.getRegistry().registerAll(ModBlocks.GLOWSTONE_STEM, ModBlocks.BLOCK_PLANT_GLOWSTONE);
    	if(ConfigInit.netherStem == true)
        	event.getRegistry().registerAll(ModBlocks.NETHER_STEM, ModBlocks.BLOCK_PLANT_NETHER);
    	if(ConfigInit.quartzStem == true)
        	event.getRegistry().registerAll(ModBlocks.QUARTZ_STEM, ModBlocks.BLOCK_PLANT_QUARTZ);
    	if(ConfigInit.sealanternStem == true)
        	event.getRegistry().registerAll(ModBlocks.SEALANTERN_STEM, ModBlocks.BLOCK_PLANT_SEALANTERN);
    	if(ConfigInit.packediceStem == true)
        	event.getRegistry().registerAll(ModBlocks.PACKEDICE_STEM, ModBlocks.BLOCK_PLANT_PACKEDICE);
    	if(ConfigInit.magmaStem == true)
        	event.getRegistry().registerAll(ModBlocks.MAGMA_STEM, ModBlocks.BLOCK_PLANT_MAGMA);
    	if(ConfigInit.netherwartStem == true)
        	event.getRegistry().registerAll(ModBlocks.NETHERWART_STEM, ModBlocks.BLOCK_PLANT_NETHERWART);
    	if(ConfigInit.boneStem == true)
        	event.getRegistry().registerAll(ModBlocks.BONE_STEM, ModBlocks.BLOCK_PLANT_BONE);
    	if(ConfigInit.obsidianStem == true)
        	event.getRegistry().registerAll(ModBlocks.OBSIDIAN_STEM, ModBlocks.BLOCK_PLANT_OBSIDIAN);
    	if(ConfigInit.endStem == true)
        	event.getRegistry().registerAll(ModBlocks.END_STEM, ModBlocks.BLOCK_PLANT_END);
    }
	
	@SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) 
	{		
        event.getRegistry().registerAll(	
				ModItems.FRUIT_START,
				ModItems.RAKE,
				ModItems.ELEMATILIUS,
				ModItems.GOLEM_EYE_WATER,
				ModItems.GOLEM_EYE_ICE,
				ModItems.GOLEM_EYE_STEAM,
				ModItems.GOLEM_EYE_FIRE,
				ModItems.GOLEM_EYE_LAVA,
				ModItems.GOLEM_EYE_OBSIDIAN,
				ModItems.GOLEM_EYE_EARTH,
				ModItems.GOLEM_EYE_MUD,
				ModItems.GOLEM_EYE_DUST,
				ModItems.GOLEM_EYE_AIR,
				ModItems.GOLEM_EYE_SMOKE,
				ModItems.GOLEM_EYE_LIGHTNING,
				ModItems.BLOCK_ELEMENTAL_STONE_ITEM,
				ModItems.BLOCK_WATER_BLOCK_ITEM,
				ModItems.BLOCK_FIRE_BLOCK_ITEM,
				ModItems.BLOCK_EARTH_BLOCK_ITEM,
				ModItems.BLOCK_AIR_BLOCK_ITEM,
				ModItems.BLOCK_WATER_GEM_ORE_ITEM,
				ModItems.BLOCK_FIRE_GEM_ORE_ITEM,
				ModItems.BLOCK_EARTH_GEM_ORE_ITEM,
				ModItems.BLOCK_AIR_GEM_ORE_ITEM,
				ModItems.BLOCK_QUICK_ICE_ITEM,
				ModItems.BLOCK_ICY_PLANT_ITEM,
				ModItems.BLOCK_POISONOUS_ICY_PLANT_ITEM,
				ModItems.BLOCK_OBSIDIAN_GROUND_ITEM,
				ModItems.BLOCK_FIRED_OBSIDIAN_GROUND_ITEM,
				ModItems.BLOCK_QUICK_SAND_ITEM,
				ModItems.BLOCK_CLOUD_ITEM,
				ModItems.BLOCK_BOUNCE_CLOUD_ITEM,
				ModItems.OBSIDIAN_AXE, 
				ModItems.OBSIDIAN_PICKAXE, 
				ModItems.OBSIDIAN_SWORD, 
				ModItems.OBSIDIAN_SHOVEL, 
				ModItems.OBSIDIAN_HOE,
				ModItems.RENFORCED_AXE, 
				ModItems.RENFORCED_PICKAXE, 
				ModItems.RENFORCED_SWORD, 
				ModItems.RENFORCED_SHOVEL, 
				ModItems.RENFORCED_HOE,
				ModItems.WOOD_PESTLE,
				ModItems.STONE_PESTLE,
				ModItems.IRON_PESTLE,
				ModItems.GOLD_PESTLE,
				ModItems.DIAMOND_PESTLE,
				ModItems.OBSIDIAN_PESTLE,
				ModItems.RENFORCED_PESTLE,
				ModItems.ELEMENTAL_PESTLE,
				ModItems.ELEMENTAL_FIRE,
				ModItems.ELEMENTAL_WATER,
				ModItems.ELEMENTAL_EARTH,
				ModItems.ELEMENTAL_AIR,
				ModItems.WATER_GEM,
				ModItems.FIRE_GEM,
				ModItems.EARTH_GEM,
				ModItems.AIR_GEM,
				ModItems.POTION_ELEMATILIUS,
				ModItems.POTION_WATER,
				ModItems.POTION_FIRE,
				ModItems.POTION_EARTH,
				ModItems.POTION_AIR,
				ModItems.BLOCK_INFUSOR_ITEM,
				ModItems.BLOCK_INFUSOR2_ITEM,
				ModItems.BLOCK_INFUSOR2_ELEMENTAL_ITEM,
				ModItems.BLOCK_INFUSOR2_WATER_ITEM,
				ModItems.BLOCK_INFUSOR2_FIRE_ITEM,
				ModItems.BLOCK_INFUSOR2_EARTH_ITEM,
				ModItems.BLOCK_INFUSOR2_AIR_ITEM,
				ModItems.BLOCK_RITUAL_STAND_ITEM,
				ModItems.BLOCK_RITUAL_STAND_t2_ITEM,
				ModItems.BLOCK_RITUAL_STAND_t3_ITEM,
				ModItems.BLOCK_GREENHOUSE_ITEM,
				ModItems.RELICS_INFINITE_APPLE,
				ModItems.RELICS_HORN_PLENTY,
				ModItems.RELICS_MIDAS_HAND,
				ModItems.SCYTHE,
				ModItems.OBSIDIAN_HELMET,
				ModItems.OBSIDIAN_CHEST,
				ModItems.OBSIDIAN_LEGS,
				ModItems.OBSIDIAN_FEET,
				ModItems.RENFORCED_HELMET,
				ModItems.RENFORCED_CHEST,
				ModItems.RENFORCED_LEGS,
				ModItems.RENFORCED_FEET,
				ModItems.ELEMENTAL_WATER_HELMET,
				ModItems.ELEMENTAL_WATER_CHEST,
				ModItems.ELEMENTAL_WATER_LEGS,
				ModItems.ELEMENTAL_WATER_FEET,
				ModItems.ELEMENTAL_FIRE_HELMET,
				ModItems.ELEMENTAL_FIRE_CHEST,
				ModItems.ELEMENTAL_FIRE_LEGS,
				ModItems.ELEMENTAL_FIRE_FEET,
				ModItems.ELEMENTAL_EARTH_HELMET,
				ModItems.ELEMENTAL_EARTH_CHEST,
				ModItems.ELEMENTAL_EARTH_LEGS,
				ModItems.ELEMENTAL_EARTH_FEET,
				ModItems.ELEMENTAL_AIR_HELMET,
				ModItems.ELEMENTAL_AIR_CHEST,
				ModItems.ELEMENTAL_AIR_LEGS,
				ModItems.ELEMENTAL_AIR_FEET,
				ModItems.WATER_GEM_HELMET,
				ModItems.WATER_GEM_CHEST,
				ModItems.WATER_GEM_LEGS,
				ModItems.WATER_GEM_FEET,
				ModItems.FIRE_GEM_HELMET,
				ModItems.FIRE_GEM_CHEST,
				ModItems.FIRE_GEM_LEGS,
				ModItems.FIRE_GEM_FEET,
				ModItems.EARTH_GEM_HELMET,
				ModItems.EARTH_GEM_CHEST,
				ModItems.EARTH_GEM_LEGS,
				ModItems.EARTH_GEM_FEET,
				ModItems.AIR_GEM_HELMET,
				ModItems.AIR_GEM_CHEST,
				ModItems.AIR_GEM_LEGS,
				ModItems.AIR_GEM_FEET,
				ModItems.WATER_AXE, 
				ModItems.WATER_PICKAXE, 
				ModItems.WATER_SWORD, 
				ModItems.WATER_SHOVEL, 
				ModItems.WATER_HOE,
				ModItems.FIRE_AXE, 
				ModItems.FIRE_PICKAXE, 
				ModItems.FIRE_SWORD, 
				ModItems.FIRE_SHOVEL, 
				ModItems.FIRE_HOE,
				ModItems.EARTH_AXE, 
				ModItems.EARTH_PICKAXE, 
				ModItems.EARTH_SWORD, 
				ModItems.EARTH_SHOVEL, 
				ModItems.EARTH_HOE,
				ModItems.AIR_AXE, 
				ModItems.AIR_PICKAXE, 
				ModItems.AIR_SWORD, 
				ModItems.AIR_SHOVEL, 
				ModItems.AIR_HOE);
        
        if(ConfigInit.enableMultitool == true)
     		event.getRegistry().registerAll(ModItems.WOOD_MULTITOOL, ModItems.STONE_MULTITOOL, ModItems.IRON_MULTITOOL, ModItems.GOLD_MULTITOOL, ModItems.DIAMOND_MULTITOOL, ModItems.OBSIDIAN_MULTITOOL, ModItems.RENFORCED_MULTITOOL, ModItems.ELEMENTAL_MULTITOOL, ModItems.FIRE_MULTITOOL, ModItems.WATER_MULTITOOL, ModItems.EARTH_MULTITOOL, ModItems.AIR_MULTITOOL);     
        if(ConfigInit.enableApricot == true)
        	event.getRegistry().registerAll(ModItems.APRICOT, ModItems.APRICOT_COLLECTOR, ModItems.APRICOT_PIE);
        if(ConfigInit.enableBanana == true)
        	event.getRegistry().registerAll(ModItems.BANANA, ModItems.BANANA_COLLECTOR, ModItems.BANANA_PIE);
        if(ConfigInit.enableCherry == true)
        	event.getRegistry().registerAll(ModItems.CHERRY, ModItems.CHERRY_COLLECTOR, ModItems.CHERRY_PIE);
        if(ConfigInit.enableKiwi == true)
        	event.getRegistry().registerAll(ModItems.KIWI, ModItems.KIWI_COLLECTOR, ModItems.KIWI_PIE);
        if(ConfigInit.enableLemon == true)
        	event.getRegistry().registerAll(ModItems.LEMON, ModItems.LEMON_COLLECTOR, ModItems.LEMON_PIE);
        if(ConfigInit.enableOrange == true)
        	event.getRegistry().registerAll(ModItems.ORANGE, ModItems.ORANGE_COLLECTOR, ModItems.ORANGE_PIE);
        if(ConfigInit.enablePear == true)
        	event.getRegistry().registerAll(ModItems.PEAR, ModItems.PEAR_COLLECTOR, ModItems.PEAR_PIE);
        if(ConfigInit.enableFlour == true)
        	event.getRegistry().registerAll(ModItems.FLOUR);
        if(ConfigInit.enableReward == true)
        {event.getRegistry().register(ModItems.BLOCK_REWARD_ITEM);}
        
        if(ConfigInit.enableFurnace == true)
        	event.getRegistry().registerAll(
        			ModItems.BLOCK_COAL_FURNACE_ITEM,
        			ModItems.BLOCK_IRON_FURNACE_ITEM,
        			ModItems.BLOCK_GOLD_FURNACE_ITEM,
        			ModItems.BLOCK_REDSTONE_FURNACE_ITEM,
        			ModItems.BLOCK_LAPIS_FURNACE_ITEM,
        			ModItems.BLOCK_DIAMOND_FURNACE_ITEM,
        			ModItems.BLOCK_OBSIDIAN_FURNACE_ITEM,
        			ModItems.BLOCK_RENFORCED_FURNACE_ITEM,
        			ModItems.BLOCK_FIRE_FURNACE_ITEM);
        			
        event.getRegistry().registerAll(   		
        		ModItems.COAL_SEED, 
				ModItems.IRON_SEED,
				ModItems.GOLD_SEED,
				ModItems.REDSTONE_SEED,
				ModItems.LAPIS_SEED,
				ModItems.DIAMOND_SEED,
				ModItems.EMERALD_SEED,
				ModItems.ELEMENTAL_SEED,
				
				ModItems.COAL_FRUIT,	
				ModItems.IRON_FRUIT,	
				ModItems.GOLD_FRUIT,	
				ModItems.REDSTONE_FRUIT,	
				ModItems.LAPIS_FRUIT,	
				ModItems.DIAMOND_FRUIT,	
				ModItems.EMERALD_FRUIT,	
				ModItems.ELEMENTAL_FRUIT,
				ModItems.ELEMENTAL_SEED_STEM);
        
        if(ConfigInit.clay == true)
        	event.getRegistry().registerAll(ModItems.CLAY_SEED, ModItems.CLAY_FRUIT);
        if(ConfigInit.glowstone == true)
        	event.getRegistry().registerAll(ModItems.GLOWSTONE_SEED, ModItems.GLOWSTONE_FRUIT);
        if(ConfigInit.quartz == true)
        	event.getRegistry().registerAll(ModItems.QUARTZ_SEED, ModItems.QUARTZ_FRUIT);
        if(ConfigInit.shard == true)
        	event.getRegistry().registerAll(ModItems.SHARD_SEED, ModItems.SHARD_FRUIT);
        if(ConfigInit.cristal == true)
        	event.getRegistry().registerAll(ModItems.CRYSTAL_SEED, ModItems.CRYSTAL_FRUIT);
        if(ConfigInit.paper == true)
        	event.getRegistry().registerAll(ModItems.PAPER_SEED, ModItems.PAPER_FRUIT);
        if(ConfigInit.sugar == true)
        	event.getRegistry().registerAll(ModItems.SUGAR_SEED, ModItems.SUGAR_FRUIT);
        if(ConfigInit.charcoal == true)
        	event.getRegistry().registerAll(ModItems.CHARCOAL_SEED, ModItems.CHARCOAL_FRUIT);
        if(ConfigInit.flint == true)
        	event.getRegistry().registerAll(ModItems.FLINT_SEED, ModItems.FLINT_FRUIT);
        if(ConfigInit.snowball == true)
        	event.getRegistry().registerAll(ModItems.SNOWBALL_SEED, ModItems.SNOWBALL_FRUIT);	
        if(ConfigInit.firework == true)
        	event.getRegistry().registerAll(ModItems.FIREWORK_SEED, ModItems.FIREWORK_FRUIT);
        if(ConfigInit.nether == true)
        	event.getRegistry().registerAll(ModItems.NETHER_SEED, ModItems.NETHER_FRUIT);
    	if(ConfigInit.bottle == true)
        	event.getRegistry().registerAll(ModItems.BOTTLE_SEED, ModItems.BOTTLE_FRUIT);
    	if(ConfigInit.totem == true)
        	event.getRegistry().registerAll(ModItems.TOTEM_SEED, ModItems.TOTEM_FRUIT);
    	if(ConfigInit.lead2 == true)
        	event.getRegistry().registerAll(ModItems.LEAD2_SEED, ModItems.LEAD2_FRUIT);
    	if(ConfigInit.nametag == true)
        	event.getRegistry().registerAll(ModItems.NAMETAG_SEED, ModItems.NAMETAG_FRUIT);
    	if(ConfigInit.xp == true)
        	event.getRegistry().registerAll(ModItems.XP_SEED, ModItems.XP_FRUIT);
    	if(ConfigInit.ender == true)
        	event.getRegistry().registerAll(ModItems.ENDER_SEED, ModItems.ENDER_FRUIT);
    	if(ConfigInit.bone == true)
        	event.getRegistry().registerAll(ModItems.BONE_SEED, ModItems.BONE_FRUIT);
    	if(ConfigInit.eye == true)
        	event.getRegistry().registerAll(ModItems.EYE_SEED, ModItems.EYE_FRUIT);
    	if(ConfigInit.powder == true)
        	event.getRegistry().registerAll(ModItems.POWDER_SEED, ModItems.POWDER_FRUIT);
    	if(ConfigInit.blaze == true)
        	event.getRegistry().registerAll(ModItems.BLAZE_SEED, ModItems.BLAZE_FRUIT);
    	if(ConfigInit.ghast == true)
        	event.getRegistry().registerAll(ModItems.GHAST_SEED, ModItems.GHAST_FRUIT);
    	if(ConfigInit.magma == true)
        	event.getRegistry().registerAll(ModItems.MAGMA_SEED, ModItems.MAGMA_FRUIT);
    	if(ConfigInit.shell == true)
        	event.getRegistry().registerAll(ModItems.SHELL_SEED, ModItems.SHELL_FRUIT);
    	if(ConfigInit.slime == true)
        	event.getRegistry().registerAll(ModItems.SLIME_SEED, ModItems.SLIME_FRUIT);
    	if(ConfigInit.star == true)
        	event.getRegistry().registerAll(ModItems.STAR_SEED, ModItems.STAR_FRUIT);
    	if(ConfigInit.string == true)
        	event.getRegistry().registerAll(ModItems.STRING_SEED, ModItems.STRING_FRUIT);
    	if(ConfigInit.zombie == true)
        	event.getRegistry().registerAll(ModItems.ZOMBIE_SEED, ModItems.ZOMBIE_FRUIT);
    	if(ConfigInit.apple == true)
        	event.getRegistry().registerAll(ModItems.APPLE_SEED, ModItems.APPLE_FRUIT);
    	if(ConfigInit.goldenapple == true)
        	event.getRegistry().registerAll(ModItems.GOLDENAPPLE_SEED, ModItems.GOLDENAPPLE_FRUIT);
    	if(ConfigInit.bread == true)
        	event.getRegistry().registerAll(ModItems.BREAD_SEED, ModItems.BREAD_FRUIT);
    	if(ConfigInit.egg == true)
        	event.getRegistry().registerAll(ModItems.EGG_SEED,ModItems.EGG_FRUIT);
    	if(ConfigInit.clownfish == true)
        	event.getRegistry().registerAll(ModItems.CLOWNFISH_SEED, ModItems.CLOWNFISH_FRUIT);
    	if(ConfigInit.pufferfish == true)
        	event.getRegistry().registerAll(ModItems.PUFFERFISH_SEED, ModItems.PUFFERFISH_FRUIT);
    	if(ConfigInit.cookie == true)
        	event.getRegistry().registerAll(ModItems.COOKIE_SEED, ModItems.COOKIE_FRUIT);
    	if(ConfigInit.chorus == true)
        	event.getRegistry().registerAll(ModItems.CHORUS_SEED, ModItems.CHORUS_FRUIT);
    	if(ConfigInit.rawporc == true)
        	event.getRegistry().registerAll(ModItems.RAWPORC_SEED, ModItems.RAWPORC_FRUIT);
    	if(ConfigInit.rawbeef == true)
        	event.getRegistry().registerAll(ModItems.RAWBEEF_SEED, ModItems.RAWBEEF_FRUIT);
    	if(ConfigInit.fish == true)
        	event.getRegistry().registerAll(ModItems.FISH_SEED, ModItems.FISH_FRUIT);
    	if(ConfigInit.salmon == true)
        	event.getRegistry().registerAll(ModItems.SALMON_SEED, ModItems.SALMON_FRUIT);
    	if(ConfigInit.rawmutton == true)
        	event.getRegistry().registerAll(ModItems.RAWMUTTON_SEED, ModItems.RAWMUTTON_FRUIT);
    	if(ConfigInit.rawrabbit == true)
        	event.getRegistry().registerAll(ModItems.RAWRABBIT_SEED, ModItems.RAWRABBIT_FRUIT);
    	if(ConfigInit.rawchicken == true)
        	event.getRegistry().registerAll(ModItems.RAWCHICKEN_SEED, ModItems.RAWCHICKEN_FRUIT);
    	if(ConfigInit.orange == true)
        	event.getRegistry().registerAll(ModItems.ORANGE_SEED, ModItems.ORANGE_FRUIT);
    	if(ConfigInit.magenta == true)
        	event.getRegistry().registerAll(ModItems.MAGENTA_SEED, ModItems.MAGENTA_FRUIT);
    	if(ConfigInit.lightblue == true)
        	event.getRegistry().registerAll(ModItems.LIGHTBLUE_SEED, ModItems.LIGHTBLUE_FRUIT);
    	if(ConfigInit.yellow == true)
        	event.getRegistry().registerAll(ModItems.YELLOW_SEED, ModItems.YELLOW_FRUIT);
    	if(ConfigInit.lime == true)
        	event.getRegistry().registerAll(ModItems.LIME_SEED, ModItems.LIME_FRUIT);
    	if(ConfigInit.pink == true)
        	event.getRegistry().registerAll(ModItems.PINK_SEED, ModItems.PINK_FRUIT);
    	if(ConfigInit.gray == true)
        	event.getRegistry().registerAll(ModItems.GRAY_SEED, ModItems.GRAY_FRUIT);
    	if(ConfigInit.silver == true)
        	event.getRegistry().registerAll(ModItems.SILVER_SEED, ModItems.SILVER_FRUIT);
    	if(ConfigInit.cyan == true)
        	event.getRegistry().registerAll(ModItems.CYAN_SEED, ModItems.CYAN_FRUIT);
    	if(ConfigInit.purple == true)
        	event.getRegistry().registerAll(ModItems.PURPLE_SEED, ModItems.PURPLE_FRUIT);
    	if(ConfigInit.brown == true)
        	event.getRegistry().registerAll(ModItems.BROWN_SEED, ModItems.BROWN_FRUIT);
    	if(ConfigInit.green == true)
        	event.getRegistry().registerAll(ModItems.GREEN_SEED, ModItems.GREEN_FRUIT);
    	if(ConfigInit.red == true)
        	event.getRegistry().registerAll(ModItems.RED_SEED, ModItems.RED_FRUIT);
    	if(ConfigInit.black == true)
        	event.getRegistry().registerAll(ModItems.BLACK_SEED, ModItems.BLACK_FRUIT);
    	if(ConfigInit.vine == true)
        	event.getRegistry().registerAll(ModItems.VINE_SEED, ModItems.VINE_FRUIT);
    	if(ConfigInit.lilypad == true)
        	event.getRegistry().registerAll(ModItems.LILYPAD_SEED, ModItems.LILYPAD_FRUIT);
    	if(ConfigInit.tallgrass == true)
        	event.getRegistry().registerAll(ModItems.TALLGRASS_SEED, ModItems.TALLGRASS_FRUIT);
    	if(ConfigInit.largefern == true)
        	event.getRegistry().registerAll(ModItems.LARGEFERN_SEED, ModItems.LARGEFERN_FRUIT);
    	if(ConfigInit.bush == true)
        	event.getRegistry().registerAll(ModItems.BUSH_SEED, ModItems.BUSH_FRUIT);
    	if(ConfigInit.grass1 == true)
        	event.getRegistry().registerAll(ModItems.GRASS1_SEED, ModItems.GRASS1_FRUIT);
    	if(ConfigInit.fern == true)
        	event.getRegistry().registerAll(ModItems.FERN_SEED, ModItems.FERN_FRUIT);
    	if(ConfigInit.oak == true)
        	event.getRegistry().registerAll(ModItems.OAK_SEED, ModItems.OAK_FRUIT);
    	if(ConfigInit.birch == true)
        	event.getRegistry().registerAll(ModItems.BIRCH_SEED, ModItems.BIRCH_FRUIT);
    	if(ConfigInit.spruce == true)
        	event.getRegistry().registerAll(ModItems.SPRUCE_SEED, ModItems.SPRUCE_FRUIT);
    	if(ConfigInit.jungle == true)
        	event.getRegistry().registerAll(ModItems.JUNGLE_SEED, ModItems.JUNGLE_FRUIT);
    	if(ConfigInit.darkoak == true)
        	event.getRegistry().registerAll(ModItems.DARKOAK_SEED, ModItems.DARKOAK_FRUIT);
    	if(ConfigInit.acacia == true)
        	event.getRegistry().registerAll(ModItems.ACACIA_SEED, ModItems.ACACIA_FRUIT);
    	if(ConfigInit.leather == true)
        	event.getRegistry().registerAll(ModItems.LEATHER_SEED, ModItems.LEATHER_FRUIT);
    	if(ConfigInit.feather == true)
        	event.getRegistry().registerAll(ModItems.FEATHER_SEED, ModItems.FEATHER_FRUIT);
    	if(ConfigInit.hide == true)
        	event.getRegistry().registerAll(ModItems.HIDE_SEED, ModItems.HIDE_FRUIT);
    	if(ConfigInit.foot == true)
        	event.getRegistry().registerAll(ModItems.FOOT_SEED, ModItems.FOOT_FRUIT);
    	
    	if(ConfigInit.aluminium == true)   		
        	event.getRegistry().registerAll(ModItems.ALUMINIUM_SEED, ModItems.ALUMINIUM_FRUIT, ModItems.ALUMINIUM_ITEM);
    	if(ConfigInit.brass == true)
        	event.getRegistry().registerAll(ModItems.BRASS_SEED, ModItems.BRASS_FRUIT, ModItems.BRASS_ITEM);
    	if(ConfigInit.bronze == true)
        	event.getRegistry().registerAll(ModItems.BRONZE_SEED, ModItems.BRONZE_FRUIT, ModItems.BRONZE_ITEM);
    	if(ConfigInit.chrome == true)
        	event.getRegistry().registerAll(ModItems.CHROME_SEED, ModItems.CHROME_FRUIT, ModItems.CHROME_ITEM);
    	if(ConfigInit.copper == true)
        	event.getRegistry().registerAll(ModItems.COPPER_SEED, ModItems.COPPER_FRUIT, ModItems.COPPER_ITEM);
    	if(ConfigInit.electrum == true)
        	event.getRegistry().registerAll(ModItems.ELECTRUM_SEED, ModItems.ELECTRUM_FRUIT, ModItems.ELECTRUM_ITEM);
    	if(ConfigInit.invar == true)
        	event.getRegistry().registerAll(ModItems.INVAR_SEED, ModItems.INVAR_FRUIT, ModItems.INVAR_ITEM);
    	if(ConfigInit.iridium == true)
        	event.getRegistry().registerAll(ModItems.IRIDIUM_SEED, ModItems.IRIDIUM_FRUIT, ModItems.IRIDIUM_ITEM);
    	if(ConfigInit.lead == true)
        	event.getRegistry().registerAll(ModItems.LEAD_SEED, ModItems.LEAD_FRUIT, ModItems.LEAD_ITEM);
    	if(ConfigInit.nickel == true)
        	event.getRegistry().registerAll(ModItems.NICKEL_SEED, ModItems.NICKEL_FRUIT, ModItems.NICKEL_ITEM);
    	if(ConfigInit.platinium == true)
        	event.getRegistry().registerAll(ModItems.PLATINIUM_SEED, ModItems.PLATINIUM_FRUIT, ModItems.PLATINIUM_ITEM);
    	if(ConfigInit.silveringot == true)
        	event.getRegistry().registerAll(ModItems.SILVERINGOT_SEED, ModItems.SILVERINGOT_FRUIT, ModItems.SILVERINGOT_ITEM);
    	if(ConfigInit.steel == true)
        	event.getRegistry().registerAll(ModItems.STEEL_SEED, ModItems.STEEL_FRUIT, ModItems.STEEL_ITEM);
    	if(ConfigInit.tin == true)
        	event.getRegistry().registerAll(ModItems.TIN_SEED, ModItems.TIN_FRUIT, ModItems.TIN_ITEM);
    	if(ConfigInit.titanium == true)
        	event.getRegistry().registerAll(ModItems.TITANIUM_SEED, ModItems.TITANIUM_FRUIT, ModItems.TITANIUM_ITEM);
    	if(ConfigInit.tungsten == true)
        	event.getRegistry().registerAll(ModItems.TUNGSTEN_SEED, ModItems.TUNGSTEN_FRUIT, ModItems.TUNGSTEN_ITEM);
    	if(ConfigInit.zinc == true)
        	event.getRegistry().registerAll(ModItems.ZINC_SEED, ModItems.ZINC_FRUIT, ModItems.ZINC_ITEM);
    	if(ConfigInit.manasteel == true)
        	event.getRegistry().registerAll(ModItems.MANASTEEL_SEED, ModItems.MANASTEEL_FRUIT, ModItems.MANASTEEL_ITEM);
    	if(ConfigInit.terrasteel == true)
        	event.getRegistry().registerAll(ModItems.TERRASTEEL_SEED, ModItems.TERRASTEEL_FRUIT, ModItems.TERRASTEEL_ITEM);
    	if(ConfigInit.manadiamond == true)
        	event.getRegistry().registerAll(ModItems.MANADIAMOND_SEED, ModItems.MANADIAMOND_FRUIT, ModItems.MANADIAMOND_ITEM);
    	if(ConfigInit.manapearl == true)
        	event.getRegistry().registerAll(ModItems.MANAPEARL_SEED, ModItems.MANAPEARL_FRUIT, ModItems.MANAPEARL_ITEM);
    	if(ConfigInit.elementium == true)
        	event.getRegistry().registerAll(ModItems.ELEMENTIUM_SEED, ModItems.ELEMENTIUM_FRUIT, ModItems.ELEMENTIUM_ITEM);
    	if(ConfigInit.dragonstone == true)
        	event.getRegistry().registerAll(ModItems.DRAGONSTONE_SEED, ModItems.DRAGONSTONE_FRUIT, ModItems.DRAGONSTONE_ITEM);
    	if(ConfigInit.gearwood == true)
        	event.getRegistry().registerAll(ModItems.GEARWOOD_SEED, ModItems.GEARWOOD_FRUIT, ModItems.GEARWOOD_ITEM);
    	if(ConfigInit.gearstone == true)
        	event.getRegistry().registerAll(ModItems.GEARSTONE_SEED, ModItems.GEARSTONE_FRUIT, ModItems.GEARSTONE_ITEM);
    	if(ConfigInit.geariron == true)
        	event.getRegistry().registerAll(ModItems.GEARIRON_SEED, ModItems.GEARIRON_FRUIT, ModItems.GEARIRON_ITEM);
    	if(ConfigInit.geargold == true)
        	event.getRegistry().registerAll(ModItems.GEARGOLD_SEED, ModItems.GEARGOLD_FRUIT, ModItems.GEARGOLD_ITEM);
    	if(ConfigInit.geardiamond == true)
        	event.getRegistry().registerAll(ModItems.GEARDIAMOND_SEED, ModItems.GEARDIAMOND_FRUIT, ModItems.GEARDIAMOND_ITEM);
    	if(ConfigInit.yellorium == true)
        	event.getRegistry().registerAll(ModItems.YELLORIUM_SEED, ModItems.YELLORIUM_FRUIT, ModItems.YELLORIUM_ITEM);
    	if(ConfigInit.blutonium == true)
        	event.getRegistry().registerAll(ModItems.BLUTONIUM_SEED, ModItems.BLUTONIUM_FRUIT, ModItems.BLUTONIUM_ITEM);
    	if(ConfigInit.cyanite == true)
        	event.getRegistry().registerAll(ModItems.CYANITE_SEED, ModItems.CYANITE_FRUIT, ModItems.CYANITE_ITEM);
    	if(ConfigInit.graphite == true)
        	event.getRegistry().registerAll(ModItems.GRAPHITE_SEED, ModItems.GRAPHITE_FRUIT, ModItems.GRAPHITE_ITEM);
    	if(ConfigInit.ludicrite == true)
        	event.getRegistry().registerAll(ModItems.LUDICRITE_SEED, ModItems.LUDICRITE_FRUIT, ModItems.LUDICRITE_ITEM);
    	if(ConfigInit.enderium == true)
        	event.getRegistry().registerAll(ModItems.ENDERIUM_SEED, ModItems.ENDERIUM_FRUIT, ModItems.ENDERIUM_ITEM);
    	if(ConfigInit.lumium == true)
        	event.getRegistry().registerAll(ModItems.LUMIUM_SEED, ModItems.LUMIUM_FRUIT, ModItems.LUMIUM_ITEM);
    	if(ConfigInit.signalum == true)
        	event.getRegistry().registerAll(ModItems.SIGNALUM_SEED, ModItems.SIGNALUM_FRUIT, ModItems.SIGNALUM_ITEM);
    	if(ConfigInit.constantan == true)
        	event.getRegistry().registerAll(ModItems.CONSTANTAN_SEED, ModItems.CONSTANTAN_FRUIT, ModItems.CONSTANTAN_ITEM);
    	if(ConfigInit.mithril == true)
        	event.getRegistry().registerAll(ModItems.MITHRIL_SEED, ModItems.MITHRIL_FRUIT, ModItems.MITHRIL_ITEM);
    	if(ConfigInit.uranium == true)
        	event.getRegistry().registerAll(ModItems.URANIUM_SEED, ModItems.URANIUM_FRUIT, ModItems.URANIUM_ITEM);
    	if(ConfigInit.apatite == true)
        	event.getRegistry().registerAll(ModItems.APATITE_SEED, ModItems.APATITE_FRUIT, ModItems.APATITE_ITEM);
    	if(ConfigInit.silicon == true)
        	event.getRegistry().registerAll(ModItems.SILICON_SEED, ModItems.SILICON_FRUIT, ModItems.SILICON_ITEM);
    	if(ConfigInit.draconium == true)
        	event.getRegistry().registerAll(ModItems.DRACONIUM_SEED, ModItems.DRACONIUM_FRUIT, ModItems.DRACONIUM_ITEM);
    	if(ConfigInit.draconium_awakened == true)
        	event.getRegistry().registerAll(ModItems.DRACONIUM_AWAKENED_SEED, ModItems.DRACONIUM_AWAKENED_FRUIT, ModItems.DRACONIUM_AWAKENED_ITEM);
    	if(ConfigInit.osmium == true)
        	event.getRegistry().registerAll(ModItems.OSMIUM_SEED, ModItems.OSMIUM_FRUIT, ModItems.OSMIUM_ITEM);
    	if(ConfigInit.gaia == true)
        	event.getRegistry().registerAll(ModItems.GAIA_SEED, ModItems.GAIA_FRUIT, ModItems.GAIA_ITEM);
    	
    	if(ConfigInit.coalStem == true)
        	event.getRegistry().register(ModItems.COAL_SEED_STEM);
    	if(ConfigInit.ironStem == true)
        	event.getRegistry().register(ModItems.IRON_SEED_STEM);
		if(ConfigInit.goldStem == true)
        	event.getRegistry().register(ModItems.GOLD_SEED_STEM);
    	if(ConfigInit.redstoneStem == true)
        	event.getRegistry().register(ModItems.REDSTONE_SEED_STEM);
    	if(ConfigInit.lapisStem == true)
        	event.getRegistry().register(ModItems.LAPIS_SEED_STEM);
    	if(ConfigInit.diamondStem == true)
        	event.getRegistry().register(ModItems.DIAMOND_SEED_STEM);
    	if(ConfigInit.emeraldStem == true)
        	event.getRegistry().register(ModItems.EMERALD_SEED_STEM);
    	if(ConfigInit.spongeStem == true)
        	event.getRegistry().register(ModItems.SPONGE_SEED_STEM);
    	if(ConfigInit.glassStem == true)
        	event.getRegistry().register(ModItems.GLASS_SEED_STEM);
    	if(ConfigInit.brickStem == true)
        	event.getRegistry().register(ModItems.BRICK_SEED_STEM);
    	if(ConfigInit.bookshelfStem == true)
        	event.getRegistry().register(ModItems.BOOKSHELF_SEED_STEM);
    	if(ConfigInit.iceStem == true)
        	event.getRegistry().register(ModItems.ICE_SEED_STEM);
    	if(ConfigInit.snowStem == true)
        	event.getRegistry().register(ModItems.SNOW_SEED_STEM);
    	if(ConfigInit.clayStem == true)
        	event.getRegistry().register(ModItems.CLAY_SEED_STEM);
    	if(ConfigInit.soulsandStem == true)
        	event.getRegistry().register(ModItems.SOULSAND_SEED_STEM);
    	if(ConfigInit.glowstoneStem == true)
        	event.getRegistry().register(ModItems.GLOWSTONE_SEED_STEM);
    	if(ConfigInit.netherStem == true)
        	event.getRegistry().register(ModItems.NETHER_SEED_STEM);
    	if(ConfigInit.quartzStem == true)
        	event.getRegistry().register(ModItems.QUARTZ_SEED_STEM);
    	if(ConfigInit.sealanternStem == true)
        	event.getRegistry().register(ModItems.SEALANTERN_SEED_STEM);
    	if(ConfigInit.packediceStem == true)
        	event.getRegistry().register(ModItems.PACKEDICE_SEED_STEM);
    	if(ConfigInit.magmaStem == true)
        	event.getRegistry().register(ModItems.MAGMA_SEED_STEM);
    	if(ConfigInit.netherwartStem == true)
        	event.getRegistry().register(ModItems.NETHERWART_SEED_STEM);
    	if(ConfigInit.boneStem == true)
        	event.getRegistry().register(ModItems.BONE_SEED_STEM);
    	if(ConfigInit.obsidianStem == true)
        	event.getRegistry().register(ModItems.OBSIDIAN_SEED_STEM);
    	if(ConfigInit.endStem == true)
        	event.getRegistry().register(ModItems.END_SEED_STEM);
        
    }
}
