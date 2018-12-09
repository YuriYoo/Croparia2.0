package com.croparia.mod.Event;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.croparia.mod.Mobs.Entity.EntityReaper;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DropEvent{

	public static Random random;
	public static int fort;
	public static int normal;
	public static int faible;
	public boolean getIt = false;
	List<Integer> intList = new ArrayList<Integer>();

	@SubscribeEvent
	public void onEntityDrop(LivingDropsEvent event) {
		random = new Random();
		fort = random.nextInt(6) + 3;
		normal = random.nextInt(3) + 2;
		faible = random.nextInt(2);

/*		if (event.getEntityLiving() instanceof EntityCow) {
			event.getEntityLiving().dropItem(ModItems.roast_beef, faible);
		} 
		else if (event.getEntityLiving() instanceof EntityPig) {
			event.getEntityLiving().dropItem(ModItems.roast_porc, faible);
		} 
		else if (event.getEntityLiving() instanceof EntityChicken) {
			event.getEntityLiving().dropItem(ModItems.chicken_leg, 2);
		} 
		else if (event.getEntityLiving() instanceof EntityHorse) {
			event.getEntityLiving().dropItem(ModItems.horse_meat, normal);
		} 
		else if (event.getEntityLiving() instanceof EntitySquid) {
			event.getEntityLiving().dropItem(ModItems.squid_meat, fort);
		} 
		else */
		if(event.getEntityLiving() instanceof EntityVillager) {
			event.getEntityLiving().dropItem(Items.EMERALD, 1);
		}
	}
}