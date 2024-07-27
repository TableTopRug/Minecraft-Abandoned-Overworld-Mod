package tabletoprug.abandonedoverworld.block;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import tabletoprug.abandonedoverworld.item.ModItems;


public class BlockCropBeans extends BlockCrops {

    public BlockCropBeans() {
        setUnlocalizedName("crop_beans");
        setRegistryName("crop_beans");
    }

    @Override
    protected Item getSeed() {
        return ModItems.BEANS_SEED;
    }

    @Override
    protected Item getCrop() {
        return ModItems.BEANS;
    }

}