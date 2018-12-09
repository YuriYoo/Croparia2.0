package com.croparia.mod.World.Generation.Genrator;

import java.util.Random;

import com.croparia.mod.Blocks.BlockObsidianGround;
import com.croparia.mod.Init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class ObsidianGroundGenerator extends WorldGenerator
{

	private final IBlockState obsidanGroundState;
	
    public ObsidianGroundGenerator()
    {
    	 this.obsidanGroundState = ModBlocks.OBSIDIAN_GROUND.getDefaultState();
    }

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        for (IBlockState iblockstate = worldIn.getBlockState(position); (iblockstate.getBlock().isAir(iblockstate, worldIn, position) || iblockstate.getBlock().isLeaves(iblockstate, worldIn, position)) && position.getY() > 0; iblockstate = worldIn.getBlockState(position))
        {
            position = position.down();
        }

        for (int i = 0; i < 128; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (worldIn.isAirBlock(blockpos) && ((BlockObsidianGround)ModBlocks.OBSIDIAN_GROUND).canBlockStay(worldIn, blockpos, this.obsidanGroundState))
            {
                worldIn.setBlockState(blockpos, this.obsidanGroundState, 2);
            }
        }

        return true;
    }
}