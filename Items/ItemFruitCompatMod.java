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

public class ItemFruitCompatMod extends ItemFood
{

	private String name;
	
	public ItemFruitCompatMod(String name) {
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
			if(name == "fruit_aluminium" || name == "fruit_brass" || name == "fruit_bronze" || name == "fruit_chrome" ||name == "fruit_copper" || name == "fruit_electrum" || name == "fruit_invar" || name == "fruit_iridium" ||
					name == "fruit_lead" || name == "fruit_nickel" || name == "fruit_platinium" || name == "fruit_silveringot" || name == "fruit_steel" || name == "fruit_tin" || name == "fruit_titanium" || name == "fruit_tungsten" ||
					name == "fruit_zinc" || name == "fruit_geariron" || name == "fruit_yellorium" || name == "fruit_blutonium" || name == "fruit_cyanite" || name == "fruit_graphite" || name == "fruit_ludicrite" || name == "fruit_enderium" || 
					name == "fruit_lumium" || name == "fruit_signalum" || name == "fruit_constantan" || name == "fruit_mithril" || name == "fruit_uranium" || name == "fruit_apatite" || name == "fruit_silicon" || name == "fruit_draconium" || 
					name == "fruit_draconium_awakened" || name == "fruit_osmium" || name == "fruit_manasteel" || name == "fruit_terrasteel" || name == "fruit_manadiamond" || name == "fruit_manapearl" || name == "fruit_elementium" || 
					name == "fruit_dragonstone")      
            	player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, ConfigInit.fruitEffectTime, ConfigInit.fruitEffectCoef));
			if(name == "fruit_geargold")      
            	player.addPotionEffect(new PotionEffect(MobEffects.HASTE, ConfigInit.fruitEffectTime, ConfigInit.fruitEffectCoef));
			if(name == "fruit_geardiamond")      
            	player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, ConfigInit.fruitEffectTime, ConfigInit.fruitEffectCoef));
			if(name == "fruit_gearwood" || name == "fruit_gearstone" || name == "fruit_gaia")      
            	player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, ConfigInit.fruitEffectTime, ConfigInit.fruitEffectCoef));
			if(name == "fruit_urnanium")      
            	player.addPotionEffect(new PotionEffect(MobEffects.POISON, ConfigInit.fruitEffectTime, ConfigInit.fruitEffectCoef));
			if(name == "fruit_manasteel" || name == "fruit_terrasteel" || name == "fruit_manadiamond" || name == "fruit_manapearl" || name == "fruit_elementium" || name == "fruit_dragonstone" || name == "fruit_gaia")      
            	player.addPotionEffect(new PotionEffect(MobEffects.LEVITATION, ConfigInit.fruitEffectTime, ConfigInit.fruitEffectCoef));
		}
	}
	
}
