package com.croparia.mod.Items;

import com.croparia.mod.Reference;
import com.croparia.mod.Config.ConfigInit;
import com.croparia.mod.Init.ModItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemFruitMod extends ItemFood
{

	private String name;
	
	public ItemFruitMod(String name) {
		super(0, 0, false);
        ModItems.setItemName(this, name);
        setCreativeTab(Reference.TAB);
        setAlwaysEdible();
        this.name = name;
	}
	
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) 
	{
		if (!worldIn.isRemote)
		{  
			if(name == "fruit_coal" || name == "fruit_charcoal")      
            	player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, ConfigInit.fruitEffectTime, ConfigInit.fruitEffectCoef));
			else if(name == "fruit_iron" || name == "fruit_paper" || name == "fruit_nether")      
            	player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, ConfigInit.fruitEffectTime, ConfigInit.fruitEffectCoef));
			else if(name == "fruit_gold" || name == "fruit_totem")      
            	player.addPotionEffect(new PotionEffect(MobEffects.HASTE, ConfigInit.fruitEffectTime, ConfigInit.fruitEffectCoef));
			else if(name == "fruit_redstone" || name == "fruit_sugar" || name == "fruit_feather")      
            	player.addPotionEffect(new PotionEffect(MobEffects.SPEED, ConfigInit.fruitEffectTime, ConfigInit.fruitEffectCoef));
			else if(name == "fruit_lapis")      
            	player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, ConfigInit.fruitEffectTime, ConfigInit.fruitEffectCoef));
			else if(name == "fruit_diamond" || name == "fruit_xp")      
            	player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, ConfigInit.fruitEffectTime, ConfigInit.fruitEffectCoef));
			else if(name == "fruit_emerald")      
            	player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, ConfigInit.fruitEffectTime, ConfigInit.fruitEffectCoef));
			else if(name == "fruit_clay" || name == "fruit_eye")      
            	player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, ConfigInit.fruitEffectTime, ConfigInit.fruitEffectCoef));
			else if(name == "fruit_glowstone" || name == "fruit_crystal")      
            	player.addPotionEffect(new PotionEffect(MobEffects.GLOWING, ConfigInit.fruitEffectTime, ConfigInit.fruitEffectCoef));
			else if(name == "fruit_shard" || name == "fruit_slime" || name == "fruit_hide" || name == "fruit_foot")      
            	player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, ConfigInit.fruitEffectTime, ConfigInit.fruitEffectCoef));
			else if(name == "fruit_quartz" || name == "fruit_bottle" || name == "fruit_nametag")      
            	player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, ConfigInit.fruitEffectTime, ConfigInit.fruitEffectCoef));
			else if(name == "fruit_nether" || name == "fruit_lead2" || name == "fruit_flint")      
            	player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, ConfigInit.fruitEffectTime, ConfigInit.fruitEffectCoef));
			else if(name == "fruit_snowball" || name == "fruit_powder")      
            	player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, ConfigInit.fruitEffectTime, ConfigInit.fruitEffectCoef));
			else if(name == "fruit_firework")      
            	player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, ConfigInit.fruitEffectTime, ConfigInit.fruitEffectCoef));
			else if(name == "fruit_bone")      
            	player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, ConfigInit.fruitEffectTime, ConfigInit.fruitEffectCoef));
			else if(name == "fruit_ender")      
            	player.addPotionEffect(new PotionEffect(MobEffects.LEVITATION, ConfigInit.fruitEffectTime, ConfigInit.fruitEffectCoef));
			else if(name == "fruit_string")      
            	player.addPotionEffect(new PotionEffect(MobEffects.POISON, ConfigInit.fruitEffectTime, ConfigInit.fruitEffectCoef));
			else if(name == "fruit_zombie")      
            	player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, ConfigInit.fruitEffectTime, ConfigInit.fruitEffectCoef));
			else if(name == "fruit_blaze" || name == "fruit_ghast" || name == "fruit_magma" || name == "fruit_leather")      
            	player.setFire(ConfigInit.fruitEffectTime);			
			else if(name == "fruit_shell")      
                	player.setNoGravity(true);
			else if(name == "fruit_star")
				player.setPositionAndUpdate(player.getPosition().getX(), player.getPosition().getY() + 1000, player.getPosition().getZ());
			else if (name == "fruit_apple" || name == "fruit_goldenapple" || name == "fruit_bread" || name == "fruit_egg" || name == "fruit_clownfish" || name == "fruit_pufferfish" || name == "fruit_cookie" || name == "fruit_chorus" || name == "fruit_rawporc" || 
					name == "fruit_rawbeef" || name == "fruit_fish" || name == "fruit_salmon" || name == "fruit_rawchicken" || name == "fruit_rawmutton" || name == "fruit_rawrabbit")
				player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, ConfigInit.fruitEffectTime, ConfigInit.fruitEffectCoef));
			
		}
	}
	
}
