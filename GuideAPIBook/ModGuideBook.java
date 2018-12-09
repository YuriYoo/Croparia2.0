package com.croparia.mod.GuideAPIBook;

import java.awt.Color;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnull;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.CropariaRecipes;
import com.croparia.mod.Init.ModBlocks;
import com.croparia.mod.Init.ModItems;
import com.croparia.mod.World.Dimension.AirDim;
import com.croparia.mod.World.Dimension.EarthDim;
import com.croparia.mod.World.Dimension.FireDim;
import com.croparia.mod.World.Dimension.WaterDim;

import amerifrance.guideapi.api.GuideAPI;
import amerifrance.guideapi.api.GuideBook;
import amerifrance.guideapi.api.IGuideBook;
import amerifrance.guideapi.api.IPage;
import amerifrance.guideapi.api.impl.Book;
import amerifrance.guideapi.api.impl.abstraction.CategoryAbstract;
import amerifrance.guideapi.api.impl.abstraction.EntryAbstract;
import amerifrance.guideapi.category.CategoryItemStack;
import amerifrance.guideapi.entry.EntryItemStack;
import amerifrance.guideapi.page.PageIRecipe;
import amerifrance.guideapi.page.PageImage;
import amerifrance.guideapi.page.PageText;
import amerifrance.guideapi.page.PageTextImage;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.ShapedOreRecipe;

@GuideBook
public class ModGuideBook implements IGuideBook {

    public static Book myGuide;

    @Nonnull
    @Override
    public Book buildBook() {
        Map<ResourceLocation, EntryAbstract> entries1 = new LinkedHashMap<ResourceLocation, EntryAbstract>();
        Map<ResourceLocation, EntryAbstract> entries2 = new LinkedHashMap<ResourceLocation, EntryAbstract>();
        Map<ResourceLocation, EntryAbstract> entries3 = new LinkedHashMap<ResourceLocation, EntryAbstract>();
        Map<ResourceLocation, EntryAbstract> entries4 = new LinkedHashMap<ResourceLocation, EntryAbstract>();
        Map<ResourceLocation, EntryAbstract> entries5 = new LinkedHashMap<ResourceLocation, EntryAbstract>();
        Map<ResourceLocation, EntryAbstract> entries6 = new LinkedHashMap<ResourceLocation, EntryAbstract>();
        Map<ResourceLocation, EntryAbstract> entries7 = new LinkedHashMap<ResourceLocation, EntryAbstract>();
        Map<ResourceLocation, EntryAbstract> entries8 = new LinkedHashMap<ResourceLocation, EntryAbstract>();
        Map<ResourceLocation, EntryAbstract> entries9 = new LinkedHashMap<ResourceLocation, EntryAbstract>();

        //1st Onglet : les debuts
        /**1st page : Fruits du début.*/
        List<IPage> pages1 = new ArrayList<IPage>();
        pages1.add(new PageText("ADVERTISING : This guide was written by a french, so if they are mistakes, please report then on Curse. All the craft are not listed here, to see them, use JEI"));
        pages1.add(new PageText("To start in Croparia, you need some seeds and diamonds: with 5 Diamonds and 4 Seeds you can craft the Defacto's fruit. Without it, you can't do anything"));
        pages1.add(new PageIRecipe(new ShapedOreRecipe(new ResourceLocation("seedStart"), ModItems.FRUIT_START, new Object[] { "iIi", "IiI", "iIi", 'i', Items.DIAMOND, 'I', Items.WHEAT_SEEDS})));   
        entries1.put(new ResourceLocation(Reference.MOD_ID, "entry1"), new EntryItemStack(pages1, "First Fruit", new ItemStack(ModItems.FRUIT_START)));

   		/**2nd page : Plante de minerais*/
   		List<IPage> pages2 = new ArrayList<IPage>(); 
   		pages2.add(new PageText("Here, you can find some resource crops, like Coal, Iron, Gold, etc..."));
   		pages2.add(new PageTextImage("This is the COARA SEED. If you put a BLOCK OF COAL under the FARMLAND before planting it, it will drop you a bonus", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_coal.png"), true));
   		pages2.add(new PageTextImage("This is the IRONIAS SEED. If you put a BLOCK OF IRON under the FARMLAND before planting it, it will drop you a bonus", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_iron.png"), true));
   		pages2.add(new PageTextImage("This is the GOLDIUS SEED. If you put a BLOCK OF GOLD under the FARMLAND before planting it, it will drop you a bonus", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_gold.png"), true));
   		pages2.add(new PageTextImage("This is the REDSTONIAS SEED. If you put a BLOCK OF REDSTONE under the FARMLAND before planting it, it will drop you a bonus", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_redstone.png"), true));
   		pages2.add(new PageTextImage("This is the LAPIUS SEED. If you put a BLOCK OF LAPIS under the FARMLAND before planting it, it will drop you a bonus", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_lapis.png"), true));
   		pages2.add(new PageTextImage("This is the DIAMONIAD SEED. If you put a BLOCK OF DIAMOND under the FARMLAND before planting it, it will drop you a bonus", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_diamond.png"), true));
   		pages2.add(new PageTextImage("This is the EMERALDIA SEED. If you put a BLOCK OF EMERALD under the FARMLAND before planting it, it will drop you a bonus", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_emerald.png"), true));
   		entries1.put(new ResourceLocation(Reference.MOD_ID, "entry2"), new EntryItemStack(pages2, "Resources Crops part1", new ItemStack(ModItems.COAL_SEED)));

   		/**3rd page : Plante de resource*/
   		List<IPage> pages3 = new ArrayList<IPage>(); 
   		pages3.add(new PageText("Here, you can find some other resource crops, like Clay, Totem, Sugar, etc..."));
   		pages3.add(new PageTextImage("This is the CLAYA SEED. If you put a BLOCK OF CLAY under the FARMLAND before planting it, it will drop you a bonus", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_clay.png"), true));
   		pages3.add(new PageTextImage("This is the GLOWYAS SEED. If you put an BLOCK OF GLOWSTONE under the FARMLAND before planting it, it will drop you a bonus", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_glow.png"), true));
   		pages3.add(new PageTextImage("This is the QUARTZESUS SEED. If you put a BLOCK OF QUARTZ under the FARMLAND before planting it, it will drop you a bonus", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_quartz.png"), true));
   		pages3.add(new PageTextImage("This is the PRISMARIA SEED. If you put a PRISMARINE under the FARMLAND before planting it, it will drop you a bonus", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_shard.png"), true));
   		pages3.add(new PageTextImage("This is the LANTEOS SEED. If you put a SEA LANTERN under the FARMLAND before planting it, it will drop you a bonus", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_crystal.png"), true));
   		pages3.add(new PageTextImage("This is the PAPERIUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_paper.png"), true));
   		pages3.add(new PageTextImage("This is the SUGAS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_sugar.png"), true));
   		pages3.add(new PageTextImage("This is the CHARCOARA SEED. If you put a BLOCK OF COAL under the FARMLAND before planting it, it will drop you a bonus", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_charcoal.png"), true));
   		pages3.add(new PageTextImage("This is the FLINTOS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_flint.png"), true));
   		pages3.add(new PageTextImage("This is the SNOWBALLUS SEED. If you put a BLOCK OF SNOW under the FARMLAND before planting it, it will drop you a bonus", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_snowball.png"), true));
   		pages3.add(new PageTextImage("This is the FIREWORKOSUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_firework.png"), true));
   		pages3.add(new PageTextImage("This is the NETHER BRICKIAS SEED. If you put a NETHERBRICK under the FARMLAND before planting it, it will drop you a bonus", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_nether.png"), true));
   		pages3.add(new PageTextImage("This is the BATTLEIS SEED. If you put a GLASS under the FARMLAND before planting it, it will drop you a bonus", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_bottle.png"), true));
   		pages3.add(new PageTextImage("This is the TOTEMES SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_totem.png"), true));
   		pages3.add(new PageTextImage("This is the LEADIAS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_lead2.png"), true));
   		pages3.add(new PageTextImage("This is the NAMES TAGUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_nametag.png"), true));
   		pages3.add(new PageTextImage("This is the EXPERIENCIAS BOTTLEIS SEED. If you put a BEACON under the FARMLAND before planting it, it will drop you a bonus", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_xp.png"), true));
   		entries1.put(new ResourceLocation(Reference.MOD_ID, "entry3"), new EntryItemStack(pages3, "Resources Crops part2", new ItemStack(ModItems.TOTEM_SEED)));

   		/**4th page : Plante d'animaux*/
   		List<IPage> pages4 = new ArrayList<IPage>(); 
   		pages4.add(new PageText("Here, you can find some animal drop crops, like Cow, Rabbit and Chicken"));	
   		pages3.add(new PageTextImage("This is the LEATHER SEED.", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_leather.png"), true));
   		pages3.add(new PageTextImage("This is the FEATHER SEED.", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_feather.png"), true));
   		pages3.add(new PageTextImage("This is the HIDE SEED.", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_hide.png"), true));
   		pages3.add(new PageTextImage("This is the FOOT SEED.", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_foot.png"), true));
   		entries1.put(new ResourceLocation(Reference.MOD_ID, "entry4"), new EntryItemStack(pages4, "Animals Drops Crops", new ItemStack(ModItems.LEATHER_SEED)));
   		
   		/**5th page : Plante de monstre*/
   		List<IPage> pages5 = new ArrayList<IPage>(); 
   		pages5.add(new PageText("Here, you can find some monster crops, like Zombie, Creeper, Ghast, etc..."));
   		pages5.add(new PageTextImage("This is the ENDERIUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_ender.png"), true));
   		pages5.add(new PageTextImage("This is the BONEUS SEED. If you put a BLOCK OF BONE under the FARMLAND before planting it, it will drop you a bonus", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_bone.png"), true));
   		pages5.add(new PageTextImage("This is the EYAS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_eye.png"), true));
   		pages5.add(new PageTextImage("This is the GUNAPOWDIOS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_powder.png"), true));
   		pages5.add(new PageTextImage("This is the BLAZOUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_blaze.png"), true));
   		pages5.add(new PageTextImage("This is the TEARAS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_ghast.png"), true));
   		pages5.add(new PageTextImage("This is the MAGMOS CREAMA SEED. If you put a BLOCK OF MAGMA under the FARMLAND before planting it, it will drop you a bonus", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_magma.png"), true));
   		pages5.add(new PageTextImage("This is the SHELLIUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_shell.png"), true));
   		pages5.add(new PageTextImage("This is the NETHER STAREIOS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_star.png"), true));
   		pages5.add(new PageTextImage("This is the STRINGIO SEED. If you put a BLOCK OF GLOWSTONE under the FARMLAND before planting it, it will drop you a bonus", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_string.png"), true));
   		pages5.add(new PageTextImage("This is the SLIMIU SEED. If you put a BLOCK OF WOOL under the FARMLAND before planting it, it will drop you a bonus", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_slime.png"), true));
   		pages5.add(new PageTextImage("This is the ROTTENIAS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_zombie.png"), true));
   		entries1.put(new ResourceLocation(Reference.MOD_ID, "entry5"), new EntryItemStack(pages5, "Monsters Crops", new ItemStack(ModItems.ENDER_SEED)));
   		
   		/**6th page : Plante de nouriture*/
   		List<IPage> pages6 = new ArrayList<IPage>(); 
   		pages6.add(new PageText("Here, you can find some food crops, like Bread, Egg, Golden Apple, etc..."));
   		pages6.add(new PageTextImage("This is the APPLIUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_apple.png"), true));
   		pages6.add(new PageTextImage("This is the GOLDIUS APPLIUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_goldenapple.png"), true));
   		pages6.add(new PageTextImage("This is the BREADIAS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_bread.png"), true));
   		pages6.add(new PageTextImage("This is the EGGROS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_egg.png"), true));
   		pages6.add(new PageTextImage("This is the CLOWNFISHIAS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_clownfish.png"), true));
   		pages6.add(new PageTextImage("This is the PUFFERFISHIAS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_pufferfish.png"), true));
   		pages6.add(new PageTextImage("This is the COOKIEUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_cookie.png"), true));
   		pages6.add(new PageTextImage("This is the CHOROS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_chorus.png"), true));
   		pages6.add(new PageTextImage("This is the BEEFIEUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_rawbeef.png"), true));
   		pages6.add(new PageTextImage("This is the PORCIOS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_rawporc.png"), true));
   		pages6.add(new PageTextImage("This is the FISHIAS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_fish.png"), true));
   		pages6.add(new PageTextImage("This is the SALMONIAS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_salmon.png"), true));
   		pages6.add(new PageTextImage("This is the CHIKEIUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_rawchicken.png"), true));
   		pages6.add(new PageTextImage("This is the RABBIS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_rawrabbit.png"), true));
   		pages6.add(new PageTextImage("This is the MUTTOS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_rawmutton.png"), true)); 		
   		entries1.put(new ResourceLocation(Reference.MOD_ID, "entry6"), new EntryItemStack(pages6, "Food Crops", new ItemStack(ModItems.CLOWNFISH_SEED)));
   	
   		/**7th page : Plante de la nature*/
   		
   		/**8th page : Plante des couleurs*/
   		
   		/**9th page : Plante pour les Mods*/
   		List<IPage> pages9 = new ArrayList<IPage>(); 
		pages9.add(new PageText("Here, you can find some compatibility crops, like Copper, Electrum, Manasteel, Iron Gear, etc..."));
		pages9.add(new PageTextImage("This is the ALUMINIUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_aluminium.png"), true));
		pages9.add(new PageTextImage("This is the BRASSIOS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_brass.png"), true));
		pages9.add(new PageTextImage("This is the BRONZEUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_bronze.png"), true));
		pages9.add(new PageTextImage("This is the CHROMAS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_chrome.png"), true));
		pages9.add(new PageTextImage("This is the COPPERIS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_copper.png"), true));
		pages9.add(new PageTextImage("This is the ELECTRUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_electrum.png"), true));
		pages9.add(new PageTextImage("This is the INVARIUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_invar.png"), true));
		pages9.add(new PageTextImage("This is the IRIDIUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_iridium.png"), true));
		pages9.add(new PageTextImage("This is the LEADUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_lead.png"), true));
		pages9.add(new PageTextImage("This is the NICKELIS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_nickel.png"), true));
		pages9.add(new PageTextImage("This is the PLATINIUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_platinium.png"), true));
		pages9.add(new PageTextImage("This is the SILVERIAS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_silveringot.png"), true));
		pages9.add(new PageTextImage("This is the STEELISIUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_steel.png"), true));
		pages9.add(new PageTextImage("This is the TINIAS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_tin.png"), true));
		pages9.add(new PageTextImage("This is the TITANIUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_titanium.png"), true));
		pages9.add(new PageTextImage("This is the TUNGSTENOS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_tungsten.png"), true));
		pages9.add(new PageTextImage("This is the ZINCISUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_zinc.png"), true));
		pages9.add(new PageTextImage("This is the MANASTEUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_manasteel.png"), true));
		pages9.add(new PageTextImage("This is the TERRASTEUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_terrasteel.png"), true));
		pages9.add(new PageTextImage("This is the MANADIAMONIAS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_manadiamond.png"), true));
		pages9.add(new PageTextImage("This is the MANAPEARIOS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_manapearl.png"), true));
		pages9.add(new PageTextImage("This is the ELEMENTAYA SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_elementium.png"), true));
		pages9.add(new PageTextImage("This is the DRAGONSTOS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_dragonstone.png"), true));
		pages9.add(new PageTextImage("This is the GEAS WOODOS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_gearwood.png"), true));
		pages9.add(new PageTextImage("This is the GEAS STONIAS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_gearstone.png"), true));
		pages9.add(new PageTextImage("This is the GEAS IRONIAS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_geariron.png"), true));
		pages9.add(new PageTextImage("This is the GEAS GOLDIUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_geargold.png"), true));
		pages9.add(new PageTextImage("This is the GEAS DIAMONIAD SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_geardiamond.png"), true));
		pages9.add(new PageTextImage("This is the YELLORIUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_yellorium.png"), true));
		pages9.add(new PageTextImage("This is the BLUTONIUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_blutonium.png"), true));
		pages9.add(new PageTextImage("This is the CYANIS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_cyanite.png"), true));
		pages9.add(new PageTextImage("This is the GRAPHIS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_graphite.png"), true));
		pages9.add(new PageTextImage("This is the LUDICRIS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_ludicrite.png"), true));
		pages9.add(new PageTextImage("This is the ENDERIUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_enderium.png"), true));
		pages9.add(new PageTextImage("This is the SIGNALUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_lumium.png"), true));
		pages9.add(new PageTextImage("This is the LUMIUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_signalum.png"), true));
		pages9.add(new PageTextImage("This is the CONSTANTAS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_constantan.png"), true));
		pages9.add(new PageTextImage("This is the MITHRILIS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_mithril.png"), true));
		pages9.add(new PageTextImage("This is the URANIUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_uranium.png"), true));
		pages9.add(new PageTextImage("This is the APATIS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_apatite.png"), true));
		pages9.add(new PageTextImage("This is the SILICOS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_silicon.png"), true));
		pages9.add(new PageTextImage("This is the DRACONIUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_draconium.png"), true));
		pages9.add(new PageTextImage("This is the AWAKENED DRACONIUS SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_draconium_awakened.png"), true));
		pages9.add(new PageTextImage("This is the OSMIUM SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_osmium.png"), true));
		pages9.add(new PageTextImage("This is the GAIA SPIRIT SEED", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_gaia.png"), true));
   		entries1.put(new ResourceLocation(Reference.MOD_ID, "entry9"), new EntryItemStack(pages9, "Compatibility Crops", new ItemStack(ModItems.COPPER_SEED)));
   		
   		/**10th page : Les Fruits*/
   		List<IPage> pages10 = new ArrayList<IPage>(); 
   		pages10.add(new PageText("Here, you can find which effect give the fruits"));
   		pages10.add(new PageText("NIGHT VISISON : Coal, Charcoal."));
   		pages10.add(new PageText("RESISTANCE : Iron, Paper, Netherbrick, Aluminium, Brass, Bronze, Chrome, Copper, Electrum, Invar, Iridium, Lead(Mod), Nickel, Platinium, Silver(Mod), Steel, Tin, Titanium, Tungsten, Zinc, Iron Gear, Yellorium, Blutonium, Cyanite"));
   		pages10.add(new PageText("Grpahite, Ludicrite, Enderium, Lumium, Signalum, Constantan, Mithril, Uranium, Apatite, Silicon, Draconium (Awakened too), Osmium, Manasteel, Terrasteel, Elementium, Manadiamond, Manapearl, Dragonstone."));
   		pages10.add(new PageText("HASTE : Gold, Totem, Gold Gear."));
   		pages10.add(new PageText("SPEED : Redstone, Sugar, Leather"));
   		pages10.add(new PageText("WATER BREATHING : Lapis."));
   		pages10.add(new PageText("INSTANT HEALTH : Diamond, Bottle o' Enchanting, Diamond Gear, Gaia Spirit."));
   		pages10.add(new PageText("STRENGTH : Emerald."));
   		pages10.add(new PageText("BLINDNESS : Clay, Spider Eye."));
   		pages10.add(new PageText("GLOWING : Glowstone, Crystal."));
   		pages10.add(new PageText("JUMP BOOST : Shard, Slime Ball, Rabbit's Hide, Rabbit's Foot"));
   		pages10.add(new PageText("INVISIBILITY : Quartz, Bottle, Nametag."));
   		pages10.add(new PageText("NAUSEA : Netherbrick, Lead(Vanilla), Flint, Wood Gear, Stone Gear."));
   		pages10.add(new PageText("WEAKNESS : Snowball, Gunpowder."));
   		pages10.add(new PageText("FIRE RESISTANCE : Firework."));
   		pages10.add(new PageText("MINING FATIGUE : Bone."));
   		pages10.add(new PageText("POISON : Uranium, String."));
   		pages10.add(new PageText("LEVITATION : Manasteel, Terrasteel, Elementium, Manadiamond, Manapearl, Dragonstone, Ender Pearl, Gaia Spirit."));
   		pages10.add(new PageText("HUNGER : Zombie, Leather"));
   		pages10.add(new PageText("FIRE : Blaze Rod, Ghast Tear, Magama Cream."));
   		pages10.add(new PageText("NO GRAVITY : Shulker Shell."));
   		pages10.add(new PageText("TP ~ ~+1000 ~: Star."));
   		entries1.put(new ResourceLocation(Reference.MOD_ID, "entry10"), new EntryItemStack(pages10, "Fruits Effect", new ItemStack(ModItems.COPPER_SEED)));

   		/**11th page : La Nouriture*/
   		List<IPage> pages11 = new ArrayList<IPage>(); 
   		pages11.add(new PageText("Here, you can find the Croparia's Food"));
   		pages11.add(new PageText("You can craft a pie some new fruits : Apricot, Banana, Cherry, Kiwi, Lemon, Orange, Pear. You can plat them and harvest them. You can find them in the world"));
   		pages11.add(new PageText("You can have some BREAD by cooking FLOUR : to have it, craft and use PESTLE. Once the pestle used, it will lost some efficiency"));
   		entries1.put(new ResourceLocation(Reference.MOD_ID, "entry11"), new EntryItemStack(pages11, "Food", new ItemStack(ModItems.CHERRY)));

   		/** 22nd page : Le rateau*/
   		List<IPage> pages22 = new ArrayList<IPage>(); 
   		pages22.add(new PageTextImage("See JEI to know how to craft the Rake. It will allow you to get the fruits from a croparia's crop without breaking the crop.", new ResourceLocation(Reference.MOD_ID + ":textures/items/rake.png"), true));
   		entries1.put(new ResourceLocation(Reference.MOD_ID, "entry22"), new EntryItemStack(pages22, "Rake", new ItemStack(ModItems.RAKE)));

   		/*2 Onglet : Armure, outils et initiation aux elements*/
   		/**12th page : Elements*/
   		List<IPage> pages12 = new ArrayList<IPage>(); 
   		pages12.add(new PageText("Here, you can find how to start with elements"));
   		pages12.add(new PageTextImage("This is the ELEMATILIUS SEED. If you put an ELEMENTAL STONE under the FARMLAND before planting it, it will drop you a bonus", new ResourceLocation(Reference.MOD_ID + ":textures/items/seed/seed_crop_elemental.png"), true));
   		pages12.add(new PageTextImage("With ELEMATILIUS, you can craft an ELEMATILIUS POTION, I hope you have crafted an INFUSOR too", new ResourceLocation(Reference.MOD_ID + ":textures/items/potion_elematilius.png"), true));
   		pages12.add(new PageTextImage("To have an ELEMENTAL WATER, use your ELEMENTAL POTION on the INFUSOR and drop a WATER BUCKET on it", new ResourceLocation(Reference.MOD_ID + ":textures/items/elemental_water.png"), true));
   		pages12.add(new PageTextImage("To have an ELEMENTAL FIRE, use your ELEMENTAL POTION on the INFUSOR and drop a FLINT AND STEEL on it", new ResourceLocation(Reference.MOD_ID + ":textures/items/elemental_fire.png"), true));
   		pages12.add(new PageTextImage("To have an ELEMENTAL EARTH, use your ELEMENTAL POTION on the INFUSOR and drop a BLOCK OF LEAVES on it", new ResourceLocation(Reference.MOD_ID + ":textures/items/elemental_earth.png"), true));
   		pages12.add(new PageTextImage("To have an ELEMENTAL AIR, use your ELEMENTAL POTION on the INFUSOR and drop a GLASS BOTTLE on it", new ResourceLocation(Reference.MOD_ID + ":textures/items/elemental_air.png"), true));
   		pages12.add(new PageTextImage("To have a WATER GEM, you will need to go to the WATER DIMENSION and to fing this :", new ResourceLocation(Reference.MOD_ID + ":textures/blocks/water_gem_ore.png"), true));
		entries2.put(new ResourceLocation(Reference.MOD_ID, "entry12"), new EntryItemStack(pages12, "Elements", new ItemStack(ModItems.ELEMATILIUS)));

   		/**13th page : 1st ritual*/
		List<IPage> pages13 = new ArrayList<IPage>(); 
   		pages13.add(new PageText("Here, you can find how to build the RELICS RITUAL and how to have Relics"));
   		pages13.add(new PageImage(new ResourceLocation(Reference.MOD_ID + ":textures/guidebook/first_ritual1.png")));
   		pages13.add(new PageImage(new ResourceLocation(Reference.MOD_ID + ":textures/guidebook/first_ritual2.png")));
   		pages13.add(new PageImage(new ResourceLocation(Reference.MOD_ID + ":textures/guidebook/first_ritual3.png")));
   		pages13.add(new PageText("MIDAS HAND : Put a BLOCK OF GOLD into holes near of the ELEMENTAL STONE and drop an STICK on the RITUAL STAND. You can transform Entity into Golden Block and block into Golden Ingot"));
   		pages13.add(new PageText("HORN OF PLENTY : Put a NETHER WART BLOCK  into holes near of the ELEMENTAL STONE and drop a WOOD BLOCK (not PLANKS) on the RITUAL STAND. You can right-click to have food"));
   		pages13.add(new PageText("INFINITE APPLE : Put a BLOCK OF GOLD  into holes near of the ELEMENTAL STONE and drop an APPLE on the RITUAL STAND. You can eat it infinitely"));
   		entries2.put(new ResourceLocation(Reference.MOD_ID, "entry13"), new EntryItemStack(pages13, "RELICS RITUAL", new ItemStack(ModBlocks.RITUAL_STAND)));
	
   		/**14h page : 2nd ritual*/
   		List<IPage> pages14 = new ArrayList<IPage>(); 
   		pages14.add(new PageText("Here, you can find how to build the MONSTERS RITUAL and how to summon new monsters"));
   		pages14.add(new PageImage(new ResourceLocation(Reference.MOD_ID + ":textures/guidebook/second_ritual1.png")));
   		pages14.add(new PageImage(new ResourceLocation(Reference.MOD_ID + ":textures/guidebook/second_ritual2.png")));
   		pages14.add(new PageImage(new ResourceLocation(Reference.MOD_ID + ":textures/guidebook/second_ritual3.png")));
   		pages14.add(new PageImage(new ResourceLocation(Reference.MOD_ID + ":textures/guidebook/second_ritual4.png")));
   		pages14.add(new PageImage(new ResourceLocation(Reference.MOD_ID + ":textures/guidebook/second_ritual5.png")));
   		pages14.add(new PageImage(new ResourceLocation(Reference.MOD_ID + ":textures/guidebook/second_ritual6.png")));
   		pages14.add(new PageText("SEAFARER : Replace DIAMOND BLOCKS by ELEMENTAL WATER BLOCK and drop an ELEMENTAL WATER on the RITUAL STAND TIER 2, he is a monster of Water, he is not really strong and not really powerful, but an Obsidian Stuff at least is recommanded"));
   		pages14.add(new PageText("MINOTAUR : Replace DIAMOND BLOCKS by ELEMENTAL FIRE BLOCK and drop an ELEMENTAL FIRE on the RITUAL STAND TIER 2, he is a monster of Fire, he is really strong and powerful but not fast, so a Water Stuff is recommanded"));
   		pages14.add(new PageText("CENTAUR : Replace DIAMOND BLOCKS by ELEMENTAL EARTH BLOCK and drop an ELEMENTAL EARTH on the RITUAL STAND TIER 2, he is a monster of Earth, he is really fast and  powerful, a Fire Stuff is recommanded"));
   		pages14.add(new PageText("FLYING BEAST : Replace DIAMOND BLOCKS by ELEMENTAL AIR BLOCK and drop an ELEMENTAL AIR on the RITUAL STAND TIER 2, he is a monster of Air, he is  strong, powerful and he can fly, a Fire Stuff is recommanded"));
   		entries2.put(new ResourceLocation(Reference.MOD_ID, "entry14"), new EntryItemStack(pages14, "MONSTERS RITUAL", new ItemStack(ModBlocks.RITUAL_STAND_t2)));
	
   		/**15th page : 3rd ritual*/
   		List<IPage> pages15 = new ArrayList<IPage>(); 
   		pages15.add(new PageText("Here, you can find how to build the GOLEMS RITUAL and how to summon new monsters"));
   		pages15.add(new PageImage(new ResourceLocation(Reference.MOD_ID + ":textures/guidebook/golem_ritual1.png")));
   		pages15.add(new PageImage(new ResourceLocation(Reference.MOD_ID + ":textures/guidebook/golem_ritual2.png")));
   		pages15.add(new PageImage(new ResourceLocation(Reference.MOD_ID + ":textures/guidebook/golem_ritual3.png")));
   		pages15.add(new PageText("To summon golems, you will need to fill the infusors with elements to make some combination between the dimension and the infusers element and then drop the same type of Elemental that the one in the infusors on the ritaul stand"));
   		pages15.add(new PageText("Now, go to the golems page to now how to summon them"));
   		entries2.put(new ResourceLocation(Reference.MOD_ID, "entry15"), new EntryItemStack(pages15, "GOLEMS RITUAL", new ItemStack(ModBlocks.RITUAL_STAND_t3)));
	
   		/**16th page : Tools*/
		List<IPage> pages16 = new ArrayList<IPage>(); 
   		pages16.add(new PageText("Here, you can find the Croparia's Tools"));
   		pages16.add(new PageTextImage("There is the OBSIDIAN Set, with a Sword, an Axe, a Pickaxe, a Shovel and a Hoe, a super hoe...", new ResourceLocation(Reference.MOD_ID + ":textures/items/obsidian_sword.png"), true));
   		pages16.add(new PageTextImage("There is the REFORCED Set, with a Sword, an Axe, a Pickaxe, a Shovel and a Hoe, a super hoe...", new ResourceLocation(Reference.MOD_ID + ":textures/items/renforced_sword.png"), true));
   		pages16.add(new PageTextImage("There is the WATER Set, with a Sword, an Axe, a Pickaxe, a Shovel and a Hoe, an ULTRA hoe !", new ResourceLocation(Reference.MOD_ID + ":textures/items/water_sword.png"), true));
   		pages16.add(new PageTextImage("There is the FIRE Set, with a Sword, an Axe, a Pickaxe, a Shovel and a Hoe, an ULTRA hoe !", new ResourceLocation(Reference.MOD_ID + ":textures/items/fire_sword.png"), true));
   		pages16.add(new PageTextImage("There is the EARTH Set, with a Sword, an Axe, a Pickaxe, a Shovel and a Hoe, an ULTRA hoe !", new ResourceLocation(Reference.MOD_ID + ":textures/items/earth_sword.png"), true));
   		pages16.add(new PageTextImage("There is the AIR Set, with a Sword, an Axe, a Pickaxe, a Shovel and a Hoe, an ULTRA hoe !", new ResourceLocation(Reference.MOD_ID + ":textures/items/air_sword.png"), true));
   		pages16.add(new PageTextImage("These are the new MULTITOOLS, it exists in Wood, Stone, Iron, Gold, Diamond, Obsidian, Renforced and Elematilius", new ResourceLocation(Reference.MOD_ID + ":textures/items/diamond_multitool.png"), true));
   		pages16.add(new PageTextImage("This is an ELEMENTAL WATER MULTITOOL, it works like a multitool but when you right click, it will hurt you and a WATER BLOCK will appear", new ResourceLocation(Reference.MOD_ID + ":textures/items/water_multitool.png"), true));
   		pages16.add(new PageTextImage("This is an ELEMENTAL FIRE MULTITOOL, it works like a multitool but when you right click, it will hurt you and a LAVA BLOCK will appear", new ResourceLocation(Reference.MOD_ID + ":textures/items/fire_multitool.png"), true));
   		pages16.add(new PageTextImage("This is an ELEMENTAL EARTH MULTITOOL, it works like a multitool but when you right click, it will hurt you and the BLOCK you click on will APPEAR", new ResourceLocation(Reference.MOD_ID + ":textures/items/earth_multitool.png"), true));
   		pages16.add(new PageTextImage("This is an ELEMENTAL AIR MULTITOOL, it works like a multitool but when you right click, it will hurt you and the BLOCK you click on will DISAPPEAR", new ResourceLocation(Reference.MOD_ID + ":textures/items/air_multitool.png"), true));
   		pages16.add(new PageTextImage("This is a PESTLE, it will alow ou to craft FLOUR. It exists in Wood, Stone, Iron, Gold, Diamond, Obsidian, Renforced and Elematilius", new ResourceLocation(Reference.MOD_ID + ":textures/items/iron_pestle.png"), true));
   		entries2.put(new ResourceLocation(Reference.MOD_ID, "entry16"), new EntryItemStack(pages16, "Tools", new ItemStack(ModItems.FIRE_MULTITOOL)));
   		
   		/**17th page : Armor*/
   		List<IPage> pages17 = new ArrayList<IPage>(); 
   		pages17.add(new PageTextImage("There is the OBSIDIAN Set", new ResourceLocation(Reference.MOD_ID + ":textures/items/obsidian_chestplate.png"), true));
   		pages17.add(new PageTextImage("There is the REFORCED Set", new ResourceLocation(Reference.MOD_ID + ":textures/items/renforced_chestplate.png"), true));
   		pages17.add(new PageTextImage("This is the WATER HELMET, it will protect you from the WATER GEM", new ResourceLocation(Reference.MOD_ID + ":textures/items/water_helmet.png"), true));
   		pages17.add(new PageTextImage("This is the WATER CHESTPLATE, you need to beat the Seafarer of the MONSTERS RITUAL to have it", new ResourceLocation(Reference.MOD_ID + ":textures/items/water_chestplate.png"), true));
   		pages17.add(new PageTextImage("This is the WATER LEGGINGS, it will protect you from the QUICKICE", new ResourceLocation(Reference.MOD_ID + ":textures/items/water_leggings.png"), true));
   		pages17.add(new PageTextImage("This is the WATER BOOTS, it will protect you from the ICY PLANT", new ResourceLocation(Reference.MOD_ID + ":textures/items/water_boots.png"), true));
   		pages17.add(new PageTextImage("There is the FIRE Set", new ResourceLocation(Reference.MOD_ID + ":textures/items/fire_chestplate.png"), true));
   		pages17.add(new PageTextImage("There is the EARTH Set", new ResourceLocation(Reference.MOD_ID + ":textures/items/earth_chestplate.png"), true));
   		pages17.add(new PageTextImage("There is the AIR Set", new ResourceLocation(Reference.MOD_ID + ":textures/items/air_chestplate.png"), true));
   		pages17.add(new PageTextImage("There is the WATER GEM Set. If you wear all the armor, you will have NIGHT VISION III and WATER BREATHING III", new ResourceLocation(Reference.MOD_ID + ":textures/items/water_gem_chestplate.png"), true));
   		entries2.put(new ResourceLocation(Reference.MOD_ID, "entry17"), new EntryItemStack(pages17, "Armor", new ItemStack(ModItems.WATER_GEM_CHEST)));
   		
   		/* 3 Onglet : Autres*/
   		/**18th page : Reward*/
   		List<IPage> pages18 = new ArrayList<IPage>(); 
   		pages18.add(new PageTextImage("Right-Click each days to have your reward !", new ResourceLocation(Reference.MOD_ID + ":textures/blocks/reward.png"), true));  
   		entries3.put(new ResourceLocation(Reference.MOD_ID, "entry18"), new EntryItemStack(pages18, "Reward", new ItemStack(ModItems.BLOCK_REWARD_ITEM)));

   		/**19th page : Furnace*/
   		List<IPage> pages19 = new ArrayList<IPage>(); 
   		pages19.add(new PageText("Here you can find the specificity of Croparia's Furnaces"));
   		pages19.add(new PageTextImage("Coal Furnace : cook 8 Items with 1 Coal", new ResourceLocation(Reference.MOD_ID + ":textures/blocks/furnace/" + "coal" + "_furnace_on.png"), true));  
   		pages19.add(new PageTextImage("Iron Furnace : cook 10 Items with 1 Coal", new ResourceLocation(Reference.MOD_ID + ":textures/blocks/furnace/" + "iron" + "_furnace_on.png"), true));  
   		pages19.add(new PageTextImage("Gold Furnace : cook 11 Items with 1 Coal", new ResourceLocation(Reference.MOD_ID + ":textures/blocks/furnace/" + "gold" + "_furnace_on.png"), true));  
   		pages19.add(new PageTextImage("Redstone Furnace : cook 13 Items with 1 Coal", new ResourceLocation(Reference.MOD_ID + ":textures/blocks/furnace/" + "redstone" + "_furnace_on.png"), true));  
   		pages19.add(new PageTextImage("Lapis Furnace : cook 17 Items with 1 Coal", new ResourceLocation(Reference.MOD_ID + ":textures/blocks/furnace/" + "lapis" + "_furnace_on.png"), true));  
   		pages19.add(new PageTextImage("Diamond Furnace : cook 23 Items with 1 Coal", new ResourceLocation(Reference.MOD_ID + ":textures/blocks/furnace/" + "diamond" + "_furnace_on.png"), true));  
   		pages19.add(new PageTextImage("Obsidian Furnace : cook 34 Items with 1 Coal", new ResourceLocation(Reference.MOD_ID + ":textures/blocks/furnace/" + "obsidian" + "_furnace_on.png"), true));  
   		pages19.add(new PageTextImage("Renforced Furnace : cook 66 Items with 1 Coal", new ResourceLocation(Reference.MOD_ID + ":textures/blocks/furnace/" + "renforced" + "_furnace_on.png"), true));  
   		entries3.put(new ResourceLocation(Reference.MOD_ID, "entry19"), new EntryItemStack(pages19, "Furnaces", new ItemStack(ModItems.BLOCK_COAL_FURNACE_ITEM)));
   		
   		/**20th page : Infusor*/
   		List<IPage> pages20 = new ArrayList<IPage>(); 
   		pages20.add(new PageText("You will need to craft an INFUSOR. This block will allow you to infuse elements into items"));
   		pages20.add(new PageTextImage("To have an ELEMENTAL WATER, use your ELEMENTAL POTION on the INFUSOR and drop a WATER BUCKET on it", new ResourceLocation(Reference.MOD_ID + ":textures/items/elemental_water.png"), true));
   		pages20.add(new PageTextImage("To have an ELEMENTAL FIRE, use your ELEMENTAL POTION on the INFUSOR and drop a FLINT AND STEEL on it", new ResourceLocation(Reference.MOD_ID + ":textures/items/elemental_fire.png"), true));
   		pages20.add(new PageTextImage("To have an ELEMENTAL EARTH, use your ELEMENTAL POTION on the INFUSOR and drop a BLOCK OF LEAVES on it", new ResourceLocation(Reference.MOD_ID + ":textures/items/elemental_earth.png"), true));
   		pages20.add(new PageTextImage("To have an ELEMENTAL AIR, use your ELEMENTAL POTION on the INFUSOR and drop a GLASS BOTTLE on it", new ResourceLocation(Reference.MOD_ID + ":textures/items/elemental_air.png"), true));
   		pages20.add(new PageText("To have WATER MULTITOOL, use a WATER POTION on the INFUSOR and drop an ELEMENTAL MULTIOOL on it, then, wait"));
   		pages20.add(new PageText("To have WATER TOOLS, SWORD and ARMOR, use a WATER POTION on the INFUSOR and drop a RENFORCED TOOL, SWORD or ARMOR on it, then, wait"));
   		pages20.add(new PageText("To have FIRE MULTITOOL, use a FIRE POTION on the INFUSOR and drop an ELEMENTAL MULTIOOL on it, then, wait"));
   		pages20.add(new PageText("To have FIRE TOOLS, SWORD and ARMOR, use a FIRE POTION on the INFUSOR and drop a RENFORCED TOOL, SWORD or ARMOR on it, then, wait"));
   		pages20.add(new PageText("To have EARTH MULTITOOL, use a EARTH POTION on the INFUSOR and drop an ELEMENTAL MULTIOOL on it, then, wait"));
   		pages20.add(new PageText("To have EARTH TOOLS, SWORD and ARMOR, use a EARTH POTION on the INFUSOR and drop a RENFORCED TOOL, SWORD or ARMOR on it, then, wait"));
   		pages20.add(new PageText("To have AIR MULTITOOL, use a AIR POTION on the INFUSOR and drop an ELEMENTAL MULTIOOL on it, then, wait"));
   		pages20.add(new PageText("To have AIR TOOLS, SWORD and ARMOR, use a AIR POTION on the INFUSOR and drop a RENFORCED TOOL, SWORD or ARMOR on it, then, wait"));
   		entries3.put(new ResourceLocation(Reference.MOD_ID, "entry20"), new EntryItemStack(pages20, "Infusor", new ItemStack(ModItems.BLOCK_INFUSOR_ITEM)));
   		
   		/**21th page : Ritual Stand*/
   		List<IPage> pages21 = new ArrayList<IPage>(); 
   		pages21.add(new PageText("You will need to craft RITUAL STANDS. These blocks will allow you to make RITUALS"));
   		pages21.add(new PageText("RITUAL STAND : Works only with the RELICS RITUAL"));
   		pages21.add(new PageText("RITUAL STAND TIER 2 : Works with the RELICS RITUAL and the MONSTERS RITUAL"));
   		pages21.add(new PageText("RITUAL STAND TIER 3 : Works with the RELICS RITUAL, the MONSTERS RITUAL and the GOLEMS RITUAL"));
   		entries3.put(new ResourceLocation(Reference.MOD_ID, "entry21"), new EntryItemStack(pages21, "Ritual Stand", new ItemStack(ModItems.BLOCK_RITUAL_STAND_t2_ITEM)));   		
       
   		/**23rd page : Greenhouse*/
   		List<IPage> pages23 = new ArrayList<IPage>(); 
   		pages23.add(new PageText("Put a greenhouse on a crop or a stem from croparia, it will help you to automate the harvest"));
   		entries3.put(new ResourceLocation(Reference.MOD_ID, "entry23"), new EntryItemStack(pages23, "Greenhouse", new ItemStack(ModItems.BLOCK_GREENHOUSE_ITEM)));   	
   		
   		/*Water Dimension*/
   		/**100th page : Water : Go in*/
        List<IPage> pages100= new ArrayList<IPage>();
        pages100.add(new PageText("First, you will need to kill the Seafarer of the MONSTERS RITUAL, check its page"));  
        pages100.add(new PageText("Then create a portal with WATER BLOCK (like a normal nether portal), use your DIMENSION OPENER and go in !"));  
        entries5.put(new ResourceLocation(Reference.MOD_ID, "entry100"), new EntryItemStack(pages100, "How to go in", new ItemStack(WaterDim.block)));        
        /**101st page : Water : Ores*/
        List<IPage> pages101= new ArrayList<IPage>(); 
        pages101.add(new PageTextImage("There are WATER GEM ORE here, break them with a WATER PICKAXE to have WATER GEM, I recommand you to wear ELEMENTAL WATER HELMET...", new ResourceLocation(Reference.MOD_ID + ":textures/items/water_gem.png"), true));
        entries5.put(new ResourceLocation(Reference.MOD_ID, "entry101"), new EntryItemStack(pages101, "Dimension Ores", new ItemStack(ModBlocks.WATER_GEM_ORE)));      
        /**102nd page : Water : Mobs*/
        List<IPage> pages102= new ArrayList<IPage>(); 
        pages102.add(new PageText("There are a lot of 'normal' Seafarer, and some 'tall' and 'small' Seafarer too... they will drop you some FISH and ELEMENTAL WATER"));  
        pages102.add(new PageText("There are cute penguins too !! But... wait a minute... they are not cutes at all !!!!"));  
        pages102.add(new PageText("You can make the REAPER comes here too, just kill a penguin, and kill the ones who appear from the first one, and then kill the ones who appear from the second, and again..."));  
        entries5.put(new ResourceLocation(Reference.MOD_ID, "entry102"), new EntryItemStack(pages102, "Dimension Mobs", new ItemStack(ModItems.SCYTHE)));    
        /**103rd page : Water : Other Blocks*/
        List<IPage> pages103= new ArrayList<IPage>(); 
        pages103.add(new PageText("Don't walk on these sorts of ICY PLANT, or wear WATER BOOTS. Some of them give you a poison effect... but it's not a big deal..."));  
        pages103.add(new PageText("Don't walk on these sorts of PURPLE PACKED ICE, or wear WATER LEGGINGS. They are actually QUICKICE"));  
        entries5.put(new ResourceLocation(Reference.MOD_ID, "entry103"), new EntryItemStack(pages103, "Dimension Decoration", new ItemStack(ModBlocks.ICY_PLANT)));      
        /**104th page : Water : Structures*/
        List<IPage> pages104= new ArrayList<IPage>(); 
        pages104.add(new PageText("There are 3 new structures here. A Penguin hut, a Seafarer house and an other one. All of them have a chest. In it, you can find diamonds, iron ingots, diamond seeds and water gem"));  
        entries5.put(new ResourceLocation(Reference.MOD_ID, "entry104"), new EntryItemStack(pages104, "Dimension Structures", new ItemStack(Blocks.PACKED_ICE)));

        
   		/**100th page : Fire : Go in*/
        List<IPage> pages200= new ArrayList<IPage>();
        pages200.add(new PageText("First, you will need to kill the Minotaur of the MONSTERS RITUAL, check its page"));  
        pages200.add(new PageText("Then create a portal with FIRE BLOCK (like a normal nether portal), use your DIMENSION OPENER and go in !"));  
        entries6.put(new ResourceLocation(Reference.MOD_ID, "entry200"), new EntryItemStack(pages200, "How to go in", new ItemStack(FireDim.block)));        
        /**201st page : Fire : Ores*/
        List<IPage> pages201= new ArrayList<IPage>(); 
        pages201.add(new PageTextImage("There are FIRE GEM ORE here, break them with a FIRE PICKAXE to have FIRE GEM, I recommand you to wear ELEMENTAL FIRE HELMET...", new ResourceLocation(Reference.MOD_ID + ":textures/items/fire_gem.png"), true));
        entries6.put(new ResourceLocation(Reference.MOD_ID, "entry201"), new EntryItemStack(pages201, "Dimension Ores", new ItemStack(ModBlocks.FIRE_GEM_ORE)));      
        /**202nd page : Fire : Mobs*/
        List<IPage> pages202= new ArrayList<IPage>(); 
        pages202.add(new PageText("There are a lot of 'normal' Minotaur, and some 'tall' and 'small' Minotaur too... they will drop you some MAGMA CREAM and ELEMENTAL FIRE"));  
        pages202.add(new PageText("There are Akurojin-no-hi, a Japanese Spectral Flame who want to kill you"));  
        entries6.put(new ResourceLocation(Reference.MOD_ID, "entry202"), new EntryItemStack(pages202, "Dimension Mobs", new ItemStack(Items.MAGMA_CREAM)));    
        /**203rd page : Fire : Other Blocks*/
        List<IPage> pages203= new ArrayList<IPage>(); 
        pages203.add(new PageText("Don't walk on these sorts of OBSIDIAN GROUND, or wear FIRE BOOTS. Some of them burn you..."));  
        entries6.put(new ResourceLocation(Reference.MOD_ID, "entry203"), new EntryItemStack(pages203, "Dimension Decoration", new ItemStack(ModBlocks.OBSIDIAN_GROUND)));      


   		/**300th page : Earth : Go in*/
        List<IPage> pages300= new ArrayList<IPage>();
        pages300.add(new PageText("First, you will need to kill the Centaur of the MONSTERS RITUAL, check its page"));  
        pages300.add(new PageText("Then create a portal with EARTH BLOCK (like a normal nether portal), use your DIMENSION OPENER and go in !"));  
        entries7.put(new ResourceLocation(Reference.MOD_ID, "entry300"), new EntryItemStack(pages300, "How to go in", new ItemStack(EarthDim.block)));        
        /**301st page : Earth : Ores*/
        List<IPage> pages301= new ArrayList<IPage>(); 
        pages301.add(new PageTextImage("There are EARTH GEM ORE here, break them with a EARTH PICKAXE to have EARTH GEM, I recommand you to wear ELEMENTAL EARTH HELMET...", new ResourceLocation(Reference.MOD_ID + ":textures/items/earth_gem.png"), true));
        entries7.put(new ResourceLocation(Reference.MOD_ID, "entry301"), new EntryItemStack(pages301, "Dimension Ores", new ItemStack(ModBlocks.EARTH_GEM_ORE)));      
        /**302nd page : Earth : Mobs*/
        List<IPage> pages302= new ArrayList<IPage>(); 
        pages302.add(new PageText("There are a lot of 'normal' Centaur, and some 'tall' and 'small' Centaur too... they will drop you some SAPLING and ELEMENTAL EARTH"));  
        pages302.add(new PageText("There are Poisonous Frog, hurt it with an arrow to have a poisonous arrow"));  
        entries7.put(new ResourceLocation(Reference.MOD_ID, "entry302"), new EntryItemStack(pages302, "Dimension Mobs", new ItemStack(Blocks.SAPLING)));    
        /**303rd page : Earth : Other Blocks*/
        List<IPage> pages303= new ArrayList<IPage>(); 
        pages303.add(new PageText("Don't walk on these sorts of PURPLE SAND, or wear EARTH LEGGINGS. They are actually QUICKSAND"));  
        entries7.put(new ResourceLocation(Reference.MOD_ID, "entry303"), new EntryItemStack(pages303, "Dimension Decoration", new ItemStack(ModBlocks.QUICK_SAND)));      

   		/**400th page : Earth : Go in*/
        List<IPage> pages400= new ArrayList<IPage>();
        pages400.add(new PageText("First, you will need to kill the Flying Beast of the MONSTERS RITUAL, check its page"));  
        pages400.add(new PageText("Then create a portal with AIR BLOCK (like a normal nether portal), use your DIMENSION OPENER and go in !"));  
        entries8.put(new ResourceLocation(Reference.MOD_ID, "entry400"), new EntryItemStack(pages400, "How to go in", new ItemStack(AirDim.block)));        
        /**401st page : Earth : Ores*/
        List<IPage> pages401= new ArrayList<IPage>(); 
        pages401.add(new PageTextImage("There are AIR GEM ORE here, break them with a AIR PICKAXE to have AIR GEM, I recommand you to wear ELEMENTAL AIR HELMET...", new ResourceLocation(Reference.MOD_ID + ":textures/items/earth_gem.png"), true));
        entries8.put(new ResourceLocation(Reference.MOD_ID, "entry401"), new EntryItemStack(pages401, "Dimension Ores", new ItemStack(ModBlocks.AIR_GEM_ORE)));      
        /**402nd page : Earth : Mobs*/
        List<IPage> pages402= new ArrayList<IPage>(); 
        pages402.add(new PageText("There are a lot of 'normal' Flying Beast, and some 'tall' and 'small' Flying Beast too... they will drop you some FIRE CHARGE and ELEMENTAL AIR"));  
        pages402.add(new PageText("There are Endermen, but you already know them"));  
        entries8.put(new ResourceLocation(Reference.MOD_ID, "entry402"), new EntryItemStack(pages402, "Dimension Mobs", new ItemStack(Items.FIRE_CHARGE)));    
        /**403rd page : Earth : Other Blocks*/
        List<IPage> pages403= new ArrayList<IPage>(); 
        pages403.add(new PageText("Don't walk on these sorts of PURPLE CLOUD, or wear AIR BOOTS. They are actually QUICKSAND"));  
        entries8.put(new ResourceLocation(Reference.MOD_ID, "entry403"), new EntryItemStack(pages403, "Dimension Decoration", new ItemStack(ModBlocks.BOUNCE_CLOUD)));      

        /**501st page : Golems from Overworld*/
        List<IPage> pages501= new ArrayList<IPage>();                                                                                 
        pages501.add(new PageText("Overworld :     Elemental Water -> Water Golem        Elemental Fire -> Fire Golem                 Elemental Earth -> Earth Golem     Elemental Air -> Air Golem")); 
        pages501.add(new PageText("Water Dimension :     Elemental Water -> Ice Golem                  Elemental Fire -> Obsidian Golem  Elemental Earth -> Mud Golem                   Elemental Air -> Lightning Golem")); 
        pages501.add(new PageText("Fire Dimension :     Elemental Water -> Steam Golem     Elemental Air -> Smoke Golem")); 
        pages501.add(new PageText("Earth Dimension :    Elemental Fire -> Lava Golem "));
        pages501.add(new PageText("Air Dimension :     Elemental Earth -> Dust Golem")); 
        entries9.put(new ResourceLocation(Reference.MOD_ID, "entry501"), new EntryItemStack(pages501, "Golems", new ItemStack(Blocks.GRASS)));      

        // Setup the list of categories and add our entries to it.
        List<CategoryAbstract> categories = new ArrayList<CategoryAbstract>();
        categories.add(new CategoryItemStack(entries1, "First Step", new ItemStack(Items.WHEAT_SEEDS)));
        categories.add(new CategoryItemStack(entries2, "Elemental Way", new ItemStack(ModItems.ELEMATILIUS)));
        categories.add(new CategoryItemStack(entries3, "Other Stuff", new ItemStack(ModItems.BLOCK_DIAMOND_FURNACE_ITEM)));
        categories.add(new CategoryItemStack(entries5, "Water Dimension", new ItemStack(ModItems.WATER_GEM)));
        categories.add(new CategoryItemStack(entries6, "Fire Dimension", new ItemStack(ModItems.FIRE_GEM)));
        categories.add(new CategoryItemStack(entries7, "Earth Dimension ", new ItemStack(ModItems.EARTH_GEM)));
        categories.add(new CategoryItemStack(entries8, "Air Dimension", new ItemStack(ModItems.AIR_GEM)));
        categories.add(new CategoryItemStack(entries9, "Elemental Golems", new ItemStack(ModItems.GOLEM_EYE_LIGHTNING)));

        // Setup the book's base information
        myGuide = new Book();
        myGuide.setTitle("Croparia's Guide");
        myGuide.setDisplayName("Croparia's Guide");
        myGuide.setAuthor("DeFacto34");
        myGuide.setColor(Color.GREEN);
        myGuide.setCategoryList(categories);
        myGuide.setCreativeTab(Reference.TAB);
        myGuide.setRegistryName(new ResourceLocation(Reference.MOD_ID + ":guide_book"));
        return myGuide;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void handleModel(ItemStack bookStack) {
        GuideAPI.setModel(myGuide);
    }

    @Override
    public void handlePost(ItemStack bookStack) {
        CropariaRecipes.ShapedOreRecipe(bookStack, new Object[] { " f ", "fbf", " f ", 'f', Items.WHEAT_SEEDS, 'b', Items.BOOK});
    }  
}