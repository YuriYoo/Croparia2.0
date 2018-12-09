package com.croparia.mod.Blocks;

import java.util.Date;

import com.croparia.mod.Reference;
import com.croparia.mod.Blocks.TileEntity.TileEntityReward;
import com.croparia.mod.Init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class BlockReward extends Block implements ITileEntityProvider{



	public BlockReward() {
		super(Material.IRON);
		ModBlocks.setBlockName(this, "reward");
		setCreativeTab(Reference.TAB);
		setHardness(5F);
		setResistance(10F);
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) 
	{
		if(!worldIn.isRemote)
		{
			int date = new Date().getYear() + new Date().getMonth() + new Date().getDay();
			TileEntity te = worldIn.getTileEntity(pos);
			if(te instanceof TileEntityReward)
			{
				TileEntityReward giver = (TileEntityReward)te;
				if(giver.locked)
				{
					if(playerIn.getUniqueID() == giver.playerUUID)
					{
						if(date < giver.dateBlock)
							playerIn.sendMessage(new TextComponentString("You already had your reward, come back tomorrow"));
						
						else if(date == giver.dateBlock)
						{
							giver.give();
							giver.more();
							playerIn.sendMessage(new TextComponentString("Come Back Tomorrow For Another Reward"));		
						}
						else if(date > giver.dateBlock)
						{
							giver.resetAll();
							playerIn.sendMessage(new TextComponentString("Rewards Have Been Reset"));
							playerIn.sendMessage(new TextComponentString("You can get the first Reward"));
						}
					}
					else
						playerIn.sendMessage(new TextComponentString("You are not the owner of this block"));
				}
				else
				{
					playerIn.sendMessage(new TextComponentString("This block is now owned by" + playerIn.getName()));				
					giver.locked = true;
					giver.playerUUID = playerIn.getUniqueID();
				}
			}
		}
		return true;
	}


	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityReward();
	}
}
