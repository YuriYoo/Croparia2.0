package com.croparia.mod.World.Generation.Genrator;

import java.util.Random;

import com.croparia.mod.Blocks.BlockIcyPlant;
import com.croparia.mod.Init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class IcyPlantGenerator extends WorldGenerator
{

	private final IBlockState icyPlantState;
	
    public IcyPlantGenerator()
    {
    	 this.icyPlantState = ModBlocks.ICY_PLANT.getDefaultState();
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

            if (worldIn.isAirBlock(blockpos) && ((BlockIcyPlant)ModBlocks.ICY_PLANT).canBlockStay(worldIn, blockpos, this.icyPlantState))
            {
                worldIn.setBlockState(blockpos, this.icyPlantState, 2);
            }
        }

        return true;
    }
}