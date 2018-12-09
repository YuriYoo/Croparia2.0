package com.croparia.mod.Config;

import java.io.File;

import com.croparia.mod.Reference;

import net.minecraft.item.Item;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CropariaConfig 
{	

	public static void config()
	{
		Configuration config = new Configuration(new File("config/Croparia/Croparia.cfg"));
		config.load();
		
		//Crops
        ConfigInit.clay = config.get("Crops", "Implement Clay Crop ?", true).getBoolean();
        ConfigInit.glowstone = config.get("Crops", "Implement Glowstone Crop ?", true).getBoolean(); 
        ConfigInit.quartz = config.get("Crops", "Implement Quartz Crop ?", true).getBoolean(); 
        ConfigInit.shard = config.get("Crops", "Implement Shard Crop ?", true).getBoolean(); 
        ConfigInit.cristal = config.get("Crops", "Implement Cristal Crop ?", true).getBoolean();
        ConfigInit.ender = config.get("Crops", "Implement Ender Crop ?", true).getBoolean();
        ConfigInit.bone = config.get("Crops", "Implement Bone Crop ?", true).getBoolean();
        ConfigInit.eye = config.get("Crops", "Implement Spider Eye Crop ?", true).getBoolean();
        ConfigInit.powder = config.get("Crops", "Implement Powder Crop ?", true).getBoolean();
        ConfigInit.paper = config.get("Crops", "Implement Paper Crop ?", true).getBoolean();
        ConfigInit.sugar = config.get("Crops", "Implement Sugar Crop ?", true).getBoolean();
        ConfigInit.charcoal = config.get("Crops", "Implement Charcoal Crop ?", true).getBoolean();
        ConfigInit.flint = config.get("Crops", "Implement Flint Crop ?", true).getBoolean();
        ConfigInit.snowball = config.get("Crops", "Implement Snowball Crop ?", true).getBoolean();
        ConfigInit.firework = config.get("Crops", "Implement Firework Star Crop ?", true).getBoolean();
        ConfigInit.nether = config.get("Crops", "Implement Netherbrick Crop ?", true).getBoolean();
        ConfigInit.bottle = config.get("Crops", "Implement Bottle Crop ?", true).getBoolean();
        ConfigInit.foot = config.get("Crops", "Implement Rabbit's Foot Crop ?", true).getBoolean();
        ConfigInit.hide = config.get("Crops", "Implement Rabbit's Hide Crop ?", true).getBoolean();
        ConfigInit.leather = config.get("Crops", "Implement Leather Crop ?", true).getBoolean();
        ConfigInit.feather = config.get("Crops", "Implement Feather Crop ?", true).getBoolean();                       
        ConfigInit.blaze = config.get("Crops", "Implement Blaze Rod Crop ?", true).getBoolean();
        ConfigInit.ghast = config.get("Crops", "Implement Ghast Tear Crop ?", true).getBoolean();
        ConfigInit.magma = config.get("Crops", "Implement Magma Cream Crop ?", true).getBoolean();
        ConfigInit.shell = config.get("Crops", "Implement Shulker Shell Crop ?", true).getBoolean();
        ConfigInit.slime = config.get("Crops", "Implement Slime Ball Crop ?", true).getBoolean();
        ConfigInit.star = config.get("Crops", "Implement Netehr Star Crop ?", true).getBoolean();
        ConfigInit.string = config.get("Crops", "Implement String Crop ?", true).getBoolean();
        ConfigInit.zombie = config.get("Crops", "Implement Rottenflesh Crop ?", true).getBoolean();
        ConfigInit.orange = config.get("Crops", "Implement Orange Crop ?", true).getBoolean();
        ConfigInit.magenta = config.get("Crops", "Implement Magenta Crop ?", true).getBoolean();
        ConfigInit.lightblue = config.get("Crops", "Implement Light Blue Crop ?", true).getBoolean();
        ConfigInit.yellow = config.get("Crops", "Implement Yellow Crop ?", true).getBoolean();
        ConfigInit.lime = config.get("Crops", "Implement Lime Crop ?", true).getBoolean();
        ConfigInit.pink = config.get("Crops", "Implement Pink Crop ?", true).getBoolean();
        ConfigInit.gray = config.get("Crops", "Implement Gray Crop ?", true).getBoolean();
        ConfigInit.silver = config.get("Crops", "Implement Light Gray Crop ?", true).getBoolean();
        ConfigInit.cyan = config.get("Crops", "Implement Cyan Crop ?", true).getBoolean();
        ConfigInit.purple = config.get("Crops", "Implement Purple Crop ?", true).getBoolean();
        ConfigInit.brown = config.get("Crops", "Implement Brown Crop ?", true).getBoolean();
        ConfigInit.green = config.get("Crops", "Implement Green Crop ?", true).getBoolean();
        ConfigInit.red = config.get("Crops", "Implement Red Crop ?", true).getBoolean();
        ConfigInit.black = config.get("Crops", "Implement Black Crop ?", true).getBoolean();                       
        ConfigInit.vine = config.get("Crops", "Implement Vine Crop ?", true).getBoolean();
        ConfigInit.lilypad = config.get("Crops", "Implement Lilypad Crop ?", true).getBoolean();
        ConfigInit.tallgrass = config.get("Crops", "Implement Double Tallgrass Crop ?", true).getBoolean();
        ConfigInit.largefern = config.get("Crops", "Implement Largefern Crop ?", true).getBoolean();
        ConfigInit.bush = config.get("Crops", "Implement Dead Bush Crop ?", true).getBoolean();
        ConfigInit.grass1 = config.get("Crops", "Implement Grass Crop ?", true).getBoolean();
        ConfigInit.fern = config.get("Crops", "Implement Fern Crop ?", true).getBoolean();
        ConfigInit.oak = config.get("Crops", "Implement Oak Sapling Crop ?", true).getBoolean();
        ConfigInit.birch = config.get("Crops", "Implement Birch Sapling Crop ?", true).getBoolean();
        ConfigInit.spruce = config.get("Crops", "Implement Spruce Sapling Crop ?", true).getBoolean();
        ConfigInit.jungle = config.get("Crops", "Implement Jungle Sapling Crop ?", true).getBoolean();
        ConfigInit.darkoak = config.get("Crops", "Implement Darkoak Sapling Crop ?", true).getBoolean();
        ConfigInit.acacia = config.get("Crops", "Implement Acacia Sapling Crop ?", true).getBoolean();
        ConfigInit.apple = config.get("Crops", "Implement Apple Crop ?", true).getBoolean();
        ConfigInit.goldenapple = config.get("Crops", "Implement Golden Apple Crop ?", true).getBoolean();
        ConfigInit.bread = config.get("Crops", "Implement Bread Crop ?", true).getBoolean();
        ConfigInit.egg = config.get("Crops", "Implement Egg Crop ?", true).getBoolean();
        ConfigInit.clownfish = config.get("Crops", "Implement Clown Fish Crop ?", true).getBoolean();
        ConfigInit.pufferfish = config.get("Crops", "Implement Puffer Fish Crop ?", true).getBoolean();
        ConfigInit.cookie = config.get("Crops", "Implement Cookie Crop ?", true).getBoolean();
        ConfigInit.chorus = config.get("Crops", "Implement Chorus Fruit Crop ?", true).getBoolean();
        ConfigInit.rawporc = config.get("Crops", "Implement Raw Porc Crop ?", true).getBoolean();
        ConfigInit.rawbeef = config.get("Crops", "Implement Raw Beef Crop ?", true).getBoolean();
        ConfigInit.fish = config.get("Crops", "Implement Fish Crop ?", true).getBoolean();
        ConfigInit.salmon = config.get("Crops", "Implement Salmon Crop ?", true).getBoolean();
        ConfigInit.rawchicken = config.get("Crops", "Implement Raw Chicken Crop ?", true).getBoolean();
        ConfigInit.rawrabbit = config.get("Crops", "Implement Raw Rabbit Crop ?", true).getBoolean();
        ConfigInit.rawmutton = config.get("Crops", "Implement Raw Mutton Crop ?", true).getBoolean();
        ConfigInit.death = config.get("Crops", "Implement Death Crop ?", true).getBoolean();
        ConfigInit.totem = config.get("Crops", "Implement Totem Crop ?", true).getBoolean();
        ConfigInit.lead2 = config.get("Crops", "Implement Lead Crop ?", true).getBoolean();
        ConfigInit.nametag = config.get("Crops", "Implement Name Tag Crop ?", true).getBoolean();
        ConfigInit.xp = config.get("Crops", "Implement XP Bottle Crop ?", true).getBoolean();
        ConfigInit.rawbeef = config.get("Crops", "Implement Raw Beef Crop ?", true).getBoolean();
        
       	ConfigInit.aluminium = config.get("Compatibility Crops", "Implement Aluminium Crop ?", true).getBoolean();
        ConfigInit.brass = config.get("Compatibility Crops", "Implement Brass Crop ?", true).getBoolean();
        ConfigInit.bronze = config.get("Compatibility Crops", "Implement Bronze Crop ?", true).getBoolean();
        ConfigInit.chrome = config.get("Compatibility Crops", "Implement Chome Crop ?", true).getBoolean();
        ConfigInit.copper = config.get("Compatibility Crops", "Implement Copper Crop ?", true).getBoolean();
        ConfigInit.electrum = config.get("Compatibility Crops", "Implement Electrum Crop ?", true).getBoolean();
        ConfigInit.invar = config.get("Compatibility Crops", "Implement Invar Crop ?", true).getBoolean();
        ConfigInit.iridium = config.get("Compatibility Crops", "Implement Iridium Crop ?", true).getBoolean();
        ConfigInit.lead = config.get("Compatibility Crops", "Implement Lead Crop ?", true).getBoolean();
        ConfigInit.nickel = config.get("Compatibility Crops", "Implement Nickel Crop ?", true).getBoolean();
        ConfigInit.platinium = config.get("Compatibility Crops", "Implement Platinium Crop ?", true).getBoolean();
        ConfigInit.silveringot = config.get("Compatibility Crops", "Implement Silver Crop ?", true).getBoolean();
        ConfigInit.steel = config.get("Compatibility Crops", "Implement Steel Crop ?", true).getBoolean();
        ConfigInit.tin = config.get("Compatibility Crops", "Implement Tin Crop ?", true).getBoolean();
        ConfigInit.titanium = config.get("Compatibility Crops", "Implement Titanium Crop ?", true).getBoolean();
        ConfigInit.tungsten = config.get("Compatibility Crops", "Implement Tungsten Crop ?", true).getBoolean();
        ConfigInit.zinc = config.get("Compatibility Crops", "Implement Zinc Crop ?", true).getBoolean();
        ConfigInit.manasteel = config.get("Compatibility Crops", "Implement Manasteel Crop ?", true).getBoolean();
        ConfigInit.terrasteel = config.get("Compatibility Crops", "Implement Terrasteel Crop ?", true).getBoolean();
        ConfigInit.manadiamond = config.get("Compatibility Crops", "Implement Manadiamond Crop ?", true).getBoolean();
        ConfigInit.manapearl = config.get("Compatibility Crops", "Implement Manapearl Crop ?", true).getBoolean();
        ConfigInit.elementium = config.get("Compatibility Crops", "Implement Elementium Crop ?", true).getBoolean();
        ConfigInit.dragonstone = config.get("Compatibility Crops", "Implement Dragonstone Crop ?", true).getBoolean();
        ConfigInit.gearwood = config.get("Compatibility Crops", "Implement Wood Gear Crop ?", true).getBoolean();
        ConfigInit.gearstone = config.get("Compatibility Crops", "Implement Stone Gear Crop ?", true).getBoolean();
        ConfigInit.geariron = config.get("Compatibility Crops", "Implement Iron Gear Crop ?", true).getBoolean();
        ConfigInit.geargold = config.get("Compatibility Crops", "Implement Gold Gear Crop ?", true).getBoolean();
        ConfigInit.geardiamond = config.get("Compatibility Crops", "Implement Diamond Gear Crop ?", true).getBoolean();   
    	ConfigInit.yellorium = config.get("Compatibility Crops", "Implement Yellorium Crop ?", true).getBoolean();
    	ConfigInit.blutonium = config.get("Compatibility Crops", "Implement Blutonium Crop ?", true).getBoolean();
    	ConfigInit.cyanite = config.get("Compatibility Crops", "Implement Cyanite Crop ?", true).getBoolean();
    	ConfigInit.graphite = config.get("Compatibility Crops", "Implement Graphite Crop ?", true).getBoolean();
    	ConfigInit.ludicrite = config.get("Compatibility Crops", "Implement Ludicrite Crop ?", true).getBoolean();
    	ConfigInit.enderium = config.get("Compatibility Crops", "Implement Enderium Crop ?", true).getBoolean();
    	ConfigInit.lumium = config.get("Compatibility Crops", "Implement Lumium Crop ?", true).getBoolean();
    	ConfigInit.signalum = config.get("Compatibility Crops", "Implement Signalum Crop ?", true).getBoolean();
    	ConfigInit.constantan = config.get("Compatibility Crops", "Implement Constantan Crop ?", true).getBoolean();
    	ConfigInit.mithril = config.get("Compatibility Crops", "Implement Mithril Crop ?", true).getBoolean();
    	ConfigInit.uranium = config.get("Compatibility Crops", "Implement Uranium Crop ?", true).getBoolean();
    	ConfigInit.apatite = config.get("Compatibility Crops", "Implement Apatite Crop ?", true).getBoolean();
    	ConfigInit.silicon = config.get("Compatibility Crops", "Implement Silicon Crop ?", true).getBoolean();
    	ConfigInit.draconium = config.get("Compatibility Crops", "Implement Draconium Crop ?", true).getBoolean();
    	ConfigInit.draconium_awakened = config.get("Compatibility Crops", "Implement Draconium Awakened Crop ?", true).getBoolean();
    	ConfigInit.osmium = config.get("Compatibility Crops", "Implement Osmium Crop ?", true).getBoolean();
    	ConfigInit.gaia = config.get("Compatibility Crops", "Implement Gaia Spirit Crop ?", true).getBoolean();
	   	
    	ConfigInit.coalStem = config.get("Stems", "Implement Coal Stem ?", true).getBoolean();
    	ConfigInit.ironStem = config.get("Stems", "Implement Iron Stem ?", true).getBoolean();
    	ConfigInit.goldStem = config.get("Stems", "Implement Gold Stem ?", true).getBoolean();
    	ConfigInit.redstoneStem = config.get("Stems", "Implement Redstone Stem ?", true).getBoolean();
    	ConfigInit.lapisStem = config.get("Stems", "Implement Lapis Stem ?", true).getBoolean();
    	ConfigInit.diamondStem = config.get("Stems", "Implement Diamond Stem ?", true).getBoolean();
    	ConfigInit.emeraldStem = config.get("Stems", "Implement Emerald Stem ?", true).getBoolean();
    	ConfigInit.spongeStem = config.get("Stems", "Implement Sponge Stem ?", true).getBoolean();
    	ConfigInit.glassStem = config.get("Stems", "Implement Glass Stem ?", true).getBoolean();
    	ConfigInit.brickStem = config.get("Stems", "Implement Brick Stem ?", true).getBoolean();
    	ConfigInit.bookshelfStem = config.get("Stems", "Implement Bookshelf Stem ?", true).getBoolean();
    	ConfigInit.iceStem = config.get("Stems", "Implement Ice Stem ?", true).getBoolean();
    	ConfigInit.snowStem = config.get("Stems", "Implement Snow Stem ?", true).getBoolean();
    	ConfigInit.clayStem = config.get("Stems", "Implement Clay Stem ?", true).getBoolean();
    	ConfigInit.soulsandStem = config.get("Stems", "Implement Soulsand Stem ?", true).getBoolean();
    	ConfigInit.glowstoneStem = config.get("Stems", "Implement Glowstone Stem ?", true).getBoolean();
    	ConfigInit.netherStem = config.get("Stems", "Implement Nether Brick Stem ?", true).getBoolean();
    	ConfigInit.quartzStem = config.get("Stems", "Implement Quartz Stem ?", true).getBoolean();
    	ConfigInit.sealanternStem = config.get("Stems", "Implement Sea Lantern Stem ?", true).getBoolean();
    	ConfigInit.packediceStem = config.get("Stems", "Implement Packed Ice Stem ?", true).getBoolean();
    	ConfigInit.magmaStem = config.get("Stems", "Implement Magma Stem ?", true).getBoolean();
    	ConfigInit.netherwartStem = config.get("Stems", "Implement Netherwart Stem ?", true).getBoolean();
    	ConfigInit.boneStem = config.get("Stems", "Implement Bone Stem ?", true).getBoolean();
    	ConfigInit.obsidianStem = config.get("Stems", "Implement Obsidian Stem ?", true).getBoolean();
    	ConfigInit.endStem = config.get("Stems", "Implement End Brick Stem ?", true).getBoolean();
    	
	   	//Fruit drop rate
        ConfigInit.coalRate = config.get("Fruit Drop Rate", "Coal Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.ironRate = config.get("Fruit Drop Rate", "Iron Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.goldRate = config.get("Fruit Drop Rate", "Gold Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.redstoneRate = config.get("Fruit Drop Rate", "Redstone Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.lapisRate = config.get("Fruit Drop Rate", "Lapis Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.diamondRate = config.get("Fruit Drop Rate", "Diamond Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.emeraldRate = config.get("Fruit Drop Rate", "Emerald Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.elementalRate = config.get("Fruit Drop Rate", "Elemental Fruit Drop Rate (Default : 1)", 1).getInt();
        ConfigInit.clayRate = config.get("Fruit Drop Rate", "Clay Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.glowstoneRate = config.get("Fruit Drop Rate", "Glowstone Fruit Drop Rate (Default : 4)", 4).getInt(); 
        ConfigInit.quartzRate = config.get("Fruit Drop Rate", "Quartz Fruit Drop Rate (Default : 2)", 2).getInt(); 
        ConfigInit.shardRate = config.get("Fruit Drop Rate", "Shard Fruit Drop Rate (Default : 2)", 2).getInt(); 
        ConfigInit.cristalRate = config.get("Fruit Drop Rate", "Crystal Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.enderRate = config.get("Fruit Drop Rate", "Ender Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.boneRate = config.get("Fruit Drop Rate", "Bone Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.eyeRate = config.get("Fruit Drop Rate", "Eye Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.powderRate = config.get("Fruit Drop Rate", "Gunpowder Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.paperRate = config.get("Fruit Drop Rate", "Paper Fruit Drop Rate (Default : 4)", 4).getInt();
        ConfigInit.sugarRate = config.get("Fruit Drop Rate", "Sugar Fruit Drop Rate (Default : 4)", 4).getInt();
        ConfigInit.charcoalRate = config.get("Fruit Drop Rate", "Charcoal Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.flintRate = config.get("Fruit Drop Rate", "Flint Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.snowballRate = config.get("Fruit Drop Rate", "Snowball Fruit Drop Rate (Default : 8)", 8).getInt();
        ConfigInit.fireworkRate = config.get("Fruit Drop Rate", "Firework Fruit Drop Rate (Default : 4)", 4).getInt();
        ConfigInit.netherRate = config.get("Fruit Drop Rate", "Nether Fruit Drop Rate (Default : 4)", 4).getInt();
        ConfigInit.bottleRate = config.get("Fruit Drop Rate", "Bottle Fruit Drop Rate (Default : 4)", 4).getInt();
        ConfigInit.footRate = config.get("Fruit Drop Rate", "Rabbit's Foot Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.hideRate = config.get("Fruit Drop Rate", "Rabbit's Hide Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.leatherRate = config.get("Fruit Drop Rate", "Leather Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.featherRate = config.get("Fruit Drop Rate", "Feather Fruit Drop Rate (Default : 3)", 3).getInt();                       
        ConfigInit.blazeRate = config.get("Fruit Drop Rate", "Blaze Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.ghastRate = config.get("Fruit Drop Rate", "Ghast Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.magmaRate = config.get("Fruit Drop Rate", "Magma Fruit Drop Rate (Default : 3)", 3).getInt();
        ConfigInit.shellRate = config.get("Fruit Drop Rate", "Shell Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.slimeRate = config.get("Fruit Drop Rate", "Slime Fruit Drop Rate (Default : 3)", 3).getInt();
        ConfigInit.starRate = config.get("Fruit Drop Rate", "Nether Star Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.stringRate = config.get("Fruit Drop Rate", "String Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.zombieRate = config.get("Fruit Drop Rate", "Zombie Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.orangeRate = config.get("Fruit Drop Rate", "Orange Fruit Drop Rate (Default : 4)", 4).getInt();
        ConfigInit.magentaRate = config.get("Fruit Drop Rate", "Magenta Fruit Drop Rate (Default : 4)", 4).getInt();
        ConfigInit.lightblueRate = config.get("Fruit Drop Rate", "Light Blue Fruit Drop Rate (Default : 4)", 4).getInt();
        ConfigInit.yellowRate = config.get("Fruit Drop Rate", "Yellow Fruit Drop Rate (Default : 4)", 4).getInt();
        ConfigInit.limeRate = config.get("Fruit Drop Rate", "Lime Fruit Drop Rate (Default : 4)", 4).getInt();
        ConfigInit.pinkRate = config.get("Fruit Drop Rate", "Pink Fruit Drop Rate (Default : 4)", 4).getInt();
        ConfigInit.grayRate = config.get("Fruit Drop Rate", "Gray Fruit Drop Rate (Default : 4)", 4).getInt();
        ConfigInit.silverRate = config.get("Fruit Drop Rate", "Silver Fruit Drop Rate (Default : 4)", 4).getInt();
        ConfigInit.cyanRate = config.get("Fruit Drop Rate", "Cyan Fruit Drop Rate (Default : 4)", 4).getInt();
        ConfigInit.purpleRate = config.get("Fruit Drop Rate", "Purple Fruit Drop Rate (Default : 4)", 4).getInt();
        ConfigInit.brownRate = config.get("Fruit Drop Rate", "Brown Fruit Drop Rate (Default : 4)", 4).getInt();
        ConfigInit.greenRate = config.get("Fruit Drop Rate", "Green Fruit Drop Rate (Default : 4)", 4).getInt();
        ConfigInit.redRate = config.get("Fruit Drop Rate", "Red Fruit Drop Rate (Default : 4)", 4).getInt();
        ConfigInit.blackRate = config.get("Fruit Drop Rate", "Black Fruit Drop Rate (Default : 4)", 4).getInt();                       
        ConfigInit.vineRate = config.get("Fruit Drop Rate", "Vine Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.lilypadRate = config.get("Fruit Drop Rate", "Lilypad Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.tallgrassRate = config.get("Fruit Drop Rate", "Double Tall Grass Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.largefernRate = config.get("Fruit Drop Rate", "Large Fern Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.bushRate = config.get("Fruit Drop Rate", "Dead Bush Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.grass1Rate = config.get("Fruit Drop Rate", "Tall Grass Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.fernRate = config.get("Fruit Drop Rate", "Fern Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.oakRate = config.get("Fruit Drop Rate", "Oak Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.birchRate = config.get("Fruit Drop Rate", "Birch Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.spruceRate = config.get("Fruit Drop Rate", "Spruce Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.jungleRate = config.get("Fruit Drop Rate", "Jungle Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.darkoakRate = config.get("Fruit Drop Rate", "Dark Oak Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.acaciaRate = config.get("Fruit Drop Rate", "Acacia Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.appleRate = config.get("Fruit Drop Rate", "Apple Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.goldenappleRate = config.get("Fruit Drop Rate", "Golden Apple Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.breadRate = config.get("Fruit Drop Rate", "Bread Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.eggRate = config.get("Fruit Drop Rate", "Egg Fruit Drop Rate (Default : 2)", 2).getInt();
       	ConfigInit.clownfishRate = config.get("Fruit Drop Rate", "Clown Fruit Drop Rate (Default : 2)", 2).getInt();
       	ConfigInit.pufferfishRate = config.get("Fruit Drop Rate", "Puffer Fish Fruit Drop Rate (Default : 2)", 2).getInt();
       	ConfigInit.cookieRate = config.get("Fruit Drop Rate", "Cookie Fruit Drop Rate (Default : 2)", 2).getInt();
       	ConfigInit.chorusRate = config.get("Fruit Drop Rate", "Chorus Fruit Drop Rate (Default : 2)", 2).getInt();
       	ConfigInit.rawporcRate = config.get("Fruit Drop Rate", "Raw Porc Fruit Drop Rate (Default : 2)", 2).getInt();
       	ConfigInit.rawbeefRate = config.get("Fruit Drop Rate", "Raw Beef Fruit Drop Rate (Default : 2)", 2).getInt();
       	ConfigInit.fishRate = config.get("Fruit Drop Rate", "Fish Fruit Drop Rate (Default : 2)", 2).getInt();
       	ConfigInit.salmonRate = config.get("Fruit Drop Rate", "Salmon Fruit Drop Rate (Default : 2)", 2).getInt();
       	ConfigInit.rawchickenRate = config.get("Fruit Drop Rate", "Raw Chicken Fruit Drop Rate (Default : 2)", 2).getInt();
       	ConfigInit.rawrabbitRate = config.get("Fruit Drop Rate", "Raw Rabbit Fruit Drop Rate (Default : 2)", 2).getInt();
       	ConfigInit.rawmuttonRate = config.get("Fruit Drop Rate", "Raw Mutton Fruit Drop Rate (Default : 2)", 2).getInt();
       	ConfigInit.deathRate = config.get("Fruit Drop Rate", "Death Fruit Drop Rate (Default : 2)", 2).getInt();
       	ConfigInit.totemRate = config.get("Fruit Drop Rate", "Totem Fruit Drop Rate (Default : 2)", 2).getInt();
       	ConfigInit.lead2Rate = config.get("Fruit Drop Rate", "Lead Fruit Drop Rate (Default : 2)", 2).getInt();
       	ConfigInit.nametagRate = config.get("Fruit Drop Rate", "Name Tag Fruit Drop Rate (Default : 2)", 2).getInt();
       	ConfigInit.xpRate = config.get("Fruit Drop Rate", "XP Bottle Fruit Drop Rate (Default : 2)", 2).getInt();
       	ConfigInit.rawbeefRate = config.get("Fruit Drop Rate", "Raw Beef Fruit Drop Rate (Default : 2)", 2).getInt();

       	ConfigInit.aluminiumRate = config.get("Compatibility Fruit Drop Rate", "Aluminium Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.brassRate = config.get("Compatibility Fruit Drop Rate", "Brass Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.bronzeRate = config.get("Compatibility Fruit Drop Rate", "Bronze Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.chromeRate = config.get("Compatibility Fruit Drop Rate", "Chrome Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.copperRate = config.get("Compatibility Fruit Drop Rate", "Copper Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.electrumRate = config.get("Compatibility Fruit Drop Rate", "Electrum Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.invarRate = config.get("Compatibility Fruit Drop Rate", "Invar Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.iridiumRate = config.get("Compatibility Fruit Drop Rate", "Iridium Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.leadRate = config.get("Compatibility Fruit Drop Rate", "Lead Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.nickelRate = config.get("Compatibility Fruit Drop Rate", "Nickel Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.platiniumRate = config.get("Compatibility Fruit Drop Rate", "Platinium Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.silveringotRate = config.get("Compatibility Fruit Drop Rate", "Silver Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.steelRate = config.get("Compatibility Fruit Drop Rate", "Steel Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.tinRate = config.get("Compatibility Fruit Drop Rate", "Tin Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.titaniumRate = config.get("Compatibility Fruit Drop Rate", "Titanium Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.tungstenRate = config.get("Compatibility Fruit Drop Rate", "Tungsten Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.zincRate = config.get("Compatibility Fruit Drop Rate", "Zinc Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.manasteelRate = config.get("Compatibility Fruit Drop Rate", "Manasteel Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.terrasteelRate = config.get("Compatibility Fruit Drop Rate", "Terrasteel Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.manadiamondRate = config.get("Compatibility Fruit Drop Rate", "Manadiamond Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.manapearlRate = config.get("Compatibility Fruit Drop Rate", "Manapearl Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.elementiumRate = config.get("Compatibility Fruit Drop Rate", "Elementium Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.dragonstoneRate = config.get("Compatibility Fruit Drop Rate", "Dragonstone Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.gearwoodRate = config.get("Compatibility Fruit Drop Rate", "Wood Gear Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.gearstoneRate = config.get("Compatibility Fruit Drop Rate", "Stone Gear Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.gearironRate = config.get("Compatibility Fruit Drop Rate", "Iron Gear Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.geargoldRate = config.get("Compatibility Fruit Drop Rate", "Gold Gear Fruit Drop Rate (Default : 2)", 2).getInt();
        ConfigInit.geardiamondRate = config.get("Compatibility Fruit Drop Rate", "Gear Diamond Fruit Drop Rate (Default : 2)", 2).getInt();   
    	ConfigInit.yelloriumRate = config.get("Compatibility Fruit Drop Rate", "Yellorium Fruit Drop Rate (Default : 2)", 2).getInt();
    	ConfigInit.blutoniumRate = config.get("Compatibility Fruit Drop Rate", "Blutonium Fruit Drop Rate (Default : 2)", 2).getInt();
    	ConfigInit.cyaniteRate = config.get("Compatibility Fruit Drop Rate", "Cyanite Fruit Drop Rate (Default : 2)", 2).getInt();
    	ConfigInit.graphiteRate = config.get("Compatibility Fruit Drop Rate", "Graphite Fruit Drop Rate (Default : 2)", 2).getInt();
    	ConfigInit.ludicriteRate = config.get("Compatibility Fruit Drop Rate", "Ludicrite Fruit Drop Rate (Default : 2)", 2).getInt();
    	ConfigInit.enderiumRate = config.get("Compatibility Fruit Drop Rate", "Enderium Fruit Drop Rate (Default : 2)", 2).getInt();
    	ConfigInit.lumiumRate = config.get("Compatibility Fruit Drop Rate", "Lumium Fruit Drop Rate (Default : 2)", 2).getInt();
    	ConfigInit.signalumRate = config.get("Compatibility Fruit Drop Rate", "Signalum Fruit Drop Rate (Default : 2)", 2).getInt();
    	ConfigInit.constantanRate = config.get("Compatibility Fruit Drop Rate", "Constantan Fruit Drop Rate (Default : 2)", 2).getInt();
    	ConfigInit.mithrilRate = config.get("Compatibility Fruit Drop Rate", "Mithril Fruit Drop Rate (Default : 2)", 2).getInt();
    	ConfigInit.uraniumRate = config.get("Compatibility Fruit Drop Rate", "Uranium Fruit Drop Rate (Default : 2)", 2).getInt();
    	ConfigInit.apatiteRate = config.get("Compatibility Fruit Drop Rate", "Apatite Fruit Drop Rate (Default : 2)", 2).getInt();
    	ConfigInit.siliconRate = config.get("Compatibility Fruit Drop Rate", "Silicon Fruit Drop Rate (Default : 2)", 2).getInt();
    	ConfigInit.draconiumRate = config.get("Compatibility Fruit Drop Rate", "Draconium Fruit Drop Rate (Default : 2)", 2).getInt();
    	ConfigInit.draconium_awakenedRate = config.get("Compatibility Fruit Drop Rate", "Draconium Awakened Fruit Drop Rate (Default : 2)", 2).getInt();
    	ConfigInit.osmiumRate = config.get("Compatibility Fruit Drop Rate", "Osmium Fruit Drop Rate (Default : 2)", 2).getInt();
    	ConfigInit.gaiaRate = config.get("Compatibility Fruit Drop Rate", "Gaia Fruit Drop Rate (Default : 2)", 2).getInt();

    	//Reward
    	ConfigInit.reward1 = config.get("Reward", "Item name for the 1st Reward (Default:croparia:seed_crop_coal)", "croparia:seed_crop_coal").getString();
       	ConfigInit.reward2 = config.get("Reward", "Item name for the 2nd Reward (Default:croparia:seed_crop_iron)", "croparia:seed_crop_iron").getString();
       	ConfigInit.reward3 = config.get("Reward", "Item name for the 3rd Reward (Default:croparia:seed_crop_gold)", "croparia:seed_crop_gold").getString();
       	ConfigInit.reward4 = config.get("Reward", "Item name for the 4th Reward (Default:croparia:seed_crop_redstone)", "croparia:seed_crop_redstone").getString();
       	ConfigInit.reward5 = config.get("Reward", "Item name for the 5th Reward (Default:croparia:seed_crop_lapis)", "croparia:seed_crop_lapis").getString();
       	ConfigInit.reward6 = config.get("Reward", "Item name for the 6th Reward (Default:croparia:seed_crop_diamond)", "croparia:seed_crop_diamond").getString();
       	ConfigInit.reward7 = config.get("Reward", "Item name for the 7th Reward (Default:croparia:seed_crop_emerald)", "croparia:seed_crop_emerald").getString();
       	ConfigInit.reward8 = config.get("Reward", "Item name for the 8th Reward (Default:croparia:fruit_start)", "croparia:fruit_start").getString();
       	ConfigInit.reward9_1 = config.get("Reward", "Item name for the 9-1 Reward (Default:minecraft:seed_crop_xp)", "minecraft:seed_crop_xp").getString();
       	ConfigInit.reward9_2 = config.get("Reward", "Item name for the 9-2 Reward (Default:minecraft:seed_crop_totem)", "minecraft:seed_crop_totem").getString();
       	ConfigInit.reward9_3 = config.get("Reward", "Item name for the 9-3 Reward (Default:croparia:seed_crop_nametag)", "croparia:seed_crop_nametag").getString();
       	ConfigInit.reward9_4 = config.get("Reward", "Item name for the 9-4 Reward (Default:croparia:seed_crop_diamond)", "croparia:seed_crop_diamond").getString();
       	ConfigInit.reward9_5 = config.get("Reward", "Item name for the 9-5 Reward (Default:croparia:seed_crop_emerald)", "croparia:seed_crop_emerald").getString();
 /*  	ConfigInit.reward10_1 = config.get("Reward", "Item name for the 10th-1 Reward (Default:)", "minecraft:apple").getString();
       	ConfigInit.reward10_2 = config.get("Reward", "Item name for the 10th-2 Reward (Default:)", "minecraft:apple").getString();
       	ConfigInit.reward10_3 = config.get("Reward", "Item name for the 10th-3 Reward (Default:)", "minecraft:apple").getString();
       	ConfigInit.reward10_4 = config.get("Reward", "Item name for the 10th-4 Reward (Default:)", "minecraft:apple").getString();
       	ConfigInit.reward10_5 = config.get("Reward", "Item name for the 10th-5 Reward (Default:)", "minecraft:apple").getString();
       	ConfigInit.reward11_1 = config.get("Reward", "Item name for the 11th-1 Reward (Default:)", "minecraft:apple").getString();
       	ConfigInit.reward11_2 = config.get("Reward", "Item name for the 11th-2 Reward (Default:)", "minecraft:apple").getString();
       	ConfigInit.reward11_3 = config.get("Reward", "Item name for the 11th-3 Reward (Default:)", "minecraft:apple").getString();
       	ConfigInit.reward11_4 = config.get("Reward", "Item name for the 11th-4 Reward (Default:)", "minecraft:apple").getString();
       	ConfigInit.reward11_5 = config.get("Reward", "Item name for the 11th-5 Reward (Default:)", "minecraft:apple").getString();
       	ConfigInit.reward12_1 = config.get("Reward", "Item name for the 12th-1 Reward (Default:)", "minecraft:apple").getString();
       	ConfigInit.reward12_2 = config.get("Reward", "Item name for the 12th-2 Reward (Default:)", "minecraft:apple").getString();
       	ConfigInit.reward12_3 = config.get("Reward", "Item name for the 12th-3 Reward (Default:)", "minecraft:apple").getString();
       	ConfigInit.reward12_4 = config.get("Reward", "Item name for the 12th-4 Reward (Default:)", "minecraft:apple").getString();
       	ConfigInit.reward12_5 = config.get("Reward", "Item name for the 12th-5 Reward (Default:)", "minecraft:apple").getString();
       	ConfigInit.reward13_1 = config.get("Reward", "Item name for the 13th-1 Reward (Default:)", "minecraft:apple").getString();
       	ConfigInit.reward13_2 = config.get("Reward", "Item name for the 13th-2 Reward (Default:)", "minecraft:apple").getString();
       	ConfigInit.reward13_3 = config.get("Reward", "Item name for the 13th-3 Reward (Default:)", "minecraft:apple").getString();
       	ConfigInit.reward13_4 = config.get("Reward", "Item name for the 13th-4 Reward (Default:)", "minecraft:apple").getString();
       	ConfigInit.reward13_5 = config.get("Reward", "Item name for the 13th-5 Reward (Default:)", "minecraft:apple").getString(); */
       	
       	//Food
       	ConfigInit.enableApricot = config.get("Food", "Enable all stuff about Apricots (Default : true)", true).getBoolean();
       	ConfigInit.enableBanana = config.get("Food", "Enable all stuff about Bananas (Default : true)", true).getBoolean();
       	ConfigInit.enableCherry = config.get("Food", "Enable all stuff about Cherrys (Default : true)", true).getBoolean();
       	ConfigInit.enableKiwi = config.get("Food", "Enable all stuff about Kiwis (Default : true)", true).getBoolean();
       	ConfigInit.enableLemon = config.get("Food", "Enable all stuff about Lemons (Default : true)", true).getBoolean();
       	ConfigInit.enableOrange = config.get("Food", "Enable all stuff about Oranges (Default : true)", true).getBoolean();
       	ConfigInit.enablePear = config.get("Food", "Enable all stuff about Pears (Default : true)", true).getBoolean();
       	ConfigInit.enableFlour = config.get("Food", "Allow player to create and cook flour to have bread (Default : true)", true).getBoolean();
       	
       	//Other
       	ConfigInit.fruitEffectTime = config.get("Other", "Fruit Effect Ticks (Default : 500)", 500).getInt();
       	ConfigInit.fruitEffectCoef = config.get("Other", "Fruit Effect Power, | the game add one | (Default : 1(+1 in game so 2))", 1).getInt();
       	ConfigInit.enableFurnace = config.get("Other", "Enable Croparia Furnaces (Default : true)", true).getBoolean();
       	ConfigInit.enableReward = config.get("Other", "Enable Croparia Daily Reward (Default : true)", true).getBoolean();
       	ConfigInit.fruitGenChance = config.get("Other", "Chance to Generate a Fruit Plant (Default : 2)", 2).getInt();
       	ConfigInit.coalGenChance = config.get("Other", "Chance to Generate a Coal Crop (Default : 10)", 10).getInt();
       	ConfigInit.enableMultitool = config.get("Other", "Enable Multitools (Default : true)", true).getBoolean();
       	ConfigInit.poisonousIcyPlantGen = config.get("Other", "Chance to Generate a Poisonous Icy Plant (Default : 60)", 60).getInt();
       	ConfigInit.firedObsidianGroundGen = config.get("Other", "Chance to Generate a Fired Obsidian Ground (Default : 60)", 60).getInt();
       	ConfigInit.bounceCloudGen = config.get("Other", "Chance to Generate a Bouncing Cloud (Default : 60)", 60).getInt();
       	ConfigInit.waterGemOreGen = config.get("Other", "Chance to Generate a Water Gem Ore (Default : 20)", 20).getInt();
       	ConfigInit.fireGemOreGen = config.get("Other", "Chance to Generate a Fire Gem Ore (Default : 20)", 20).getInt();
       	ConfigInit.earthGemOreGen = config.get("Other", "Chance to Generate a Earth Gem Ore (Default : 20)", 20).getInt();
       	ConfigInit.airGemOreGen = config.get("Other", "Chance to Generate a Air Gem Ore (Default : 30)", 30).getInt();
       	ConfigInit.frogPoisonTime = config.get("Other", "Frog Poison Effect Ticks (Default : 200)", 200).getInt();
       	ConfigInit.frogPoisonPower = config.get("Other", "Frog Poison Effect Power, | the game add one | (Default : 0(+1 in game so 0)", 0).getInt();
		
		config.save();
	}
	
	@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
	private static class EventHandler {

		/**
		 * Inject the new values and save to the config file when the config has been changed from the GUI.
		 *
		 * @param event The event
		 */
		@SubscribeEvent
		public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
			if (event.getModID().equals(Reference.MOD_ID)) {
				ConfigManager.sync(Reference.MOD_ID, Config.Type.INSTANCE);
			}
		}
	}
}
