package com.croparia.mod.Blocks.TileEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.croparia.mod.Config.ConfigInit;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityReward extends TileEntity
{
	public int dateBlock = new Date().getYear() + new Date().getMonth() + new Date().getDay();
	public int dateStart = new Date().getYear() + new Date().getMonth() + new Date().getDay();
	public int dateForList = new Date().getYear() + new Date().getMonth() + new Date().getDay();
	public boolean locked = false;
	public UUID playerUUID;
	
	public boolean more()
	{
		if(!world.isRemote)
		{
			dateBlock++;
			return true;
		}
		return false;
	}
		
	public void resetBlockDate()
	{
		dateBlock = new Date().getYear() + new Date().getMonth() + new Date().getDay();
	}
	
	public void resetRealDate()
	{
		dateForList = new Date().getYear() + new Date().getMonth() + new Date().getDay();
	}
	
	
	public void resetAll()
	{
		resetBlockDate();
		resetRealDate();
	}
	
	public void getCounter()
	{
		Minecraft.getMinecraft().player.sendChatMessage("te date :" + dateBlock);
	}
	
	public boolean less()
	{
		if(!world.isRemote)
		{
			dateBlock--;
			return true;
		}
		return false;
	}
	
	public boolean use1 = false;
	public boolean use2 = false;
	public boolean use3 = false;
	public boolean use4 = false;
	public boolean use5 = false;
	public boolean use6 = false;
	public boolean use7 = false;
	public boolean use8 = false;
	public boolean use9 = false;
	
	public void resetUse(boolean useToSafe)
	{
		use1 = false;
		use2 = false;
		use3= false;
		use4 = false;
		use5 = false;
		use6 = false;
		use7 = false;
		use8 = false;
		use9 = false;
		useToSafe = true;
	}

	
	public void give()
	{
		if(dateStart == dateBlock)
		{
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward1))));
		}
		else if(dateStart+1 == dateBlock)
		{
			for(int i = 0;i<=1;i++)
			{
				world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward2))));
			}
		}
		else if(dateStart+2 == dateBlock)
		{
			for(int i = 0;i<=2;i++)
			{
				world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward3))));
			}
		}
		else if(dateStart+3 == dateBlock)
		{
			for(int i = 0;i<=3;i++)
			{
				world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward4))));
			}
		}
		else if(dateStart+4 == dateBlock)
		{
			for(int i = 0;i<=3;i++)
			{
				world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward5))));	
			}
		}
		else if(dateStart+5 == dateBlock)
		{
			for(int i = 0;i<=3;i++)
			{
				world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward6))));
			}
		}
		else if(dateStart+6 == dateBlock)
		{
			for(int i = 0;i<=3;i++)
			{
				world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward7))));
			}
		}
		else if(dateStart+7 == dateBlock)
		{
			for(int i = 0;i<=3;i++)
			{
				world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward8))));
			}
		}
		else if(dateStart+8 == dateBlock)
		{
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward9_1))));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward9_2))));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward9_3))));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward9_4))));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward9_5))));
			resetAll();
			Minecraft.getMinecraft().player.sendChatMessage("You had all your rewards, they have been reset");
			Minecraft.getMinecraft().player.sendChatMessage("You can get the first Reward");
		}
	/*	else if(dateStart+9 == dateBlock)
		{
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward10_1))));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward10_2))));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward10_3))));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward10_4))));
			for(int i = 0;i<=3;i++)
			{
				world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward10_5))));
			}			
		}
		else if(dateStart+10 == dateBlock)
		{
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward11_1))));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward11_2))));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward11_3))));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward11_4))));
			for(int i = 0;i<=3;i++)
			{
				world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward10_5))));
			}			
		}
		else if(dateStart+11 == dateBlock)
		{
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward12_1))));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward12_2))));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward12_3))));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward12_4))));
			for(int i = 0;i<=3;i++)
			{
				world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward12_5))));
			}
			
		}
		else if(dateStart+12 == dateBlock)
		{
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward13_1))));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward13_2))));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward13_3))));
			world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward13_4))));
			for(int i = 0;i<=3;i++)
			{
				world.spawnEntity(new EntityItem(world, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, new ItemStack(Item.getByNameOrId(ConfigInit.reward13_5))));
			}
			resetAll();
		}*/
	}
		
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		compound.setInteger("date", dateBlock);
		compound.setInteger("checker", dateStart);
		compound.setInteger("forList", dateForList);
		compound.setBoolean("locked", locked);
		compound.setUniqueId("playerUUID", playerUUID);
		compound.setBoolean("yet1", use1);
		compound.setBoolean("yet2", use2);
		compound.setBoolean("yet3", use3);
		compound.setBoolean("yet4", use4);
		compound.setBoolean("yet5", use5);
		compound.setBoolean("yet6", use6);
		compound.setBoolean("yet7", use7);
		compound.setBoolean("yet8", use8);
		return compound;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		dateBlock = compound.getInteger("date");
		dateStart = compound.getInteger("checker");
		dateForList = compound.getInteger("forList");
		locked = compound.getBoolean("locked");
		playerUUID = compound.getUniqueId("playerUUID");
		use1 = compound.getBoolean("yet1");
		use2 = compound.getBoolean("yet2");
		use3 = compound.getBoolean("yet3");
		use4 = compound.getBoolean("yet4");
		use5 = compound.getBoolean("yet5");
		use6 = compound.getBoolean("yet6");
		use7 = compound.getBoolean("yet7");
		use8 = compound.getBoolean("yet8");
	}
}
