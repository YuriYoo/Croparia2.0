package com.croparia.mod.Items.Relics;

import com.croparia.mod.Reference;
import com.croparia.mod.Init.ModItems;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemHornPlenty extends Item 
{
	public ItemHornPlenty(String name)
	{
		ModItems.setItemName(this, name);
		setMaxStackSize(1);
		setCreativeTab(Reference.TAB);
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{			
		int random = worldIn.rand.nextInt(33);
		ItemStack a = new ItemStack(Items.CAKE);
		ItemStack b = new ItemStack(Items.RABBIT_STEW);
		ItemStack c = new ItemStack(Items.COOKED_PORKCHOP);
		ItemStack d = new ItemStack(Items.COOKED_BEEF);
		ItemStack e = new ItemStack(Items.PUMPKIN_PIE);
		ItemStack f = new ItemStack(Items.GOLDEN_CARROT);
		ItemStack g = new ItemStack(Items.COOKED_MUTTON);
		ItemStack h = new ItemStack(Items.COOKED_FISH, 1);
		ItemStack i = new ItemStack(Items.MUSHROOM_STEW);
		ItemStack j = new ItemStack(Items.COOKED_CHICKEN);
		ItemStack k = new ItemStack(Items.BAKED_POTATO);
		ItemStack l = new ItemStack(Items.COOKED_RABBIT);
		ItemStack m = new ItemStack(Items.BREAD);
		ItemStack n = new ItemStack(Items.COOKED_FISH);
		ItemStack o = new ItemStack(Items.CARROT);
		ItemStack p = new ItemStack(Items.APPLE);
		ItemStack q = new ItemStack(Items.CHORUS_FRUIT);
		ItemStack r = new ItemStack(Items.ROTTEN_FLESH);
		ItemStack s = new ItemStack(Items.PORKCHOP);
		ItemStack t = new ItemStack(Items.BEEF);
		ItemStack u = new ItemStack(Items.SPIDER_EYE);
		ItemStack v = new ItemStack(Items.RABBIT);
		ItemStack w = new ItemStack(Items.MUTTON);
		ItemStack x = new ItemStack(Items.FISH);
		ItemStack y = new ItemStack(Items.MELON);
		ItemStack z = new ItemStack(Items.CHICKEN);
		ItemStack aa = new ItemStack(Items.POISONOUS_POTATO);
		ItemStack ab = new ItemStack(Items.FISH, 1);
		ItemStack ac = new ItemStack(Items.COOKIE);
		ItemStack ad = new ItemStack(Items.BEETROOT);
		ItemStack ae = new ItemStack(Items.BEETROOT_SOUP);
		ItemStack af = new ItemStack(Items.POTATO);
		ItemStack ag = new ItemStack(Items.FISH, 2);
		ItemStack ah = new ItemStack(Items.FISH, 3);
			
		if(!worldIn.isRemote)			
		{
			if(random == 0)
				spawn(a, worldIn, pos);
			else if(random == 1)
				spawn(b, worldIn, pos);
			else if(random == 2)
				spawn(c, worldIn, pos);
			else if(random == 3)
				spawn(d, worldIn, pos);
			else if(random == 4)
				spawn(e, worldIn, pos);
			else if(random == 5)
				spawn(f, worldIn, pos);
			else if(random == 6)
				spawn(g, worldIn, pos);
			else if(random == 7)
				spawn(h, worldIn, pos);
			else if(random == 8)
				spawn(i, worldIn, pos);
			else if(random == 9)
				spawn(j, worldIn, pos);
			else if(random == 10)
				spawn(k, worldIn, pos);
			else if(random == 11)
				spawn(l, worldIn, pos);
			else if(random == 12)
				spawn(m, worldIn, pos);
			else if(random == 13)
				spawn(n, worldIn, pos);
			else if(random == 14)
				spawn(o, worldIn, pos);
			else if(random == 15)
				spawn(p, worldIn, pos);
			else if(random == 16)
				spawn(q, worldIn, pos);
			else if(random == 17)
				spawn(r, worldIn, pos);
			else if(random == 18)
				spawn(s, worldIn, pos);
			else if(random == 19)
				spawn(t, worldIn, pos);
			else if(random == 20)
				spawn(u, worldIn, pos);
			else if(random == 21)
				spawn(v, worldIn, pos);
			else if(random == 22)
				spawn(w, worldIn, pos);
			else if(random == 23)
				spawn(x, worldIn, pos);
			else if(random == 24)
				spawn(y, worldIn, pos);
			else if(random == 25)
				spawn(z, worldIn, pos);
			else if(random == 26)
				spawn(aa, worldIn, pos);
			else if(random == 27)
				spawn(ab, worldIn, pos);
			else if(random == 28)
				spawn(ac, worldIn, pos);
			else if(random == 29)
				spawn(ad, worldIn, pos);
			else if(random == 30)
				spawn(ae, worldIn, pos);
			else if(random == 31)
				spawn(af, worldIn, pos);
			else if(random == 32)
				spawn(ag, worldIn, pos);
			else if(random == 33)
				spawn(ah, worldIn, pos);		
		}
		return EnumActionResult.SUCCESS;
	}
	
	private void spawn(ItemStack stack, World worldIn, BlockPos pos)
	{worldIn.spawnEntity(new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, stack));}
}
