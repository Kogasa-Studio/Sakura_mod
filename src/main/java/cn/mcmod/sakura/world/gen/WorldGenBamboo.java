package cn.mcmod.sakura.world.gen;

import cn.mcmod.sakura.block.BlockLoader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import java.util.Random;

public class WorldGenBamboo extends WorldGenAbstractTree {
    public WorldGenBamboo(boolean notify) {
        super(notify);
    }

    @Override
    public boolean generate(World worldIn, Random rand, BlockPos position) {

        int i = 9 + rand.nextInt(9);

        if(BlockLoader.BAMBOOSHOOT.canBlockStay(worldIn,position))
        for (int i2 = 0; i2 < i; ++i2) {
            BlockPos blockpos = position.up(i2);

            this.setBlockAndNotifyAdequately(worldIn, blockpos, BlockLoader.BAMBOO.getDefaultState());
        }
        return false;
    }
}
