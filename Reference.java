package com.croparia.mod;

import com.croparia.mod.Init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.server.management.PlayerList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Reference
{
    public static final String MOD_ID = "croparia";
    public static final String MOD_NAME = "Croparia";
    public static final String VERSION = "2.3";
    public static final String CLIENT_PROXY_CLASS = "com.croparia.mod.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "com.croparia.mod.proxy.CommonProxy";
    
    public static final CreativeTabs TAB = new CreativeTabs("MOD_BLOCK")
  	{
  		@SideOnly(Side.CLIENT)
          public ItemStack getTabIconItem()
          {
              return new ItemStack(ModItems.ELEMATILIUS);
          }
  	};

  	public static void say(String message , World world, BlockPos pos)
  	{
  		EntityPlayer player = world.getClosestPlayer(pos.getX(), pos.getY(), pos.getZ(), 5, false);
  		player.sendMessage(new TextComponentString(message));
  	}    

}
