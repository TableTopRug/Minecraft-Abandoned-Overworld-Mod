package tabletoprug.abandonedoverworld.block;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.Arrays;


public class ModBlocks {

    public static BlockOre oreObscura = new BlockOre("ore_obscura", "oreObscura");

    public static BlockPedestal pedestal = new BlockPedestal();

    public static BlockCropBeans cropBeans = new BlockCropBeans();


    public static Block[] ALL_MOD_BLOCKS = new Block[] {
            oreObscura,
            pedestal,
            cropBeans
    };


    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(ALL_MOD_BLOCKS);
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        Arrays.stream(ALL_MOD_BLOCKS)
                .filter(block -> BlockBase.class.isAssignableFrom(block.getClass()))
                .forEach(block -> registry.register(((BlockBase)block).createItemBlock()));
    }

    public static void registerModels() {
        Arrays.stream(ALL_MOD_BLOCKS)
                .filter(block -> BlockBase.class.isAssignableFrom(block.getClass()))
                .forEach(block -> ((BlockBase) block).registerItemModel(Item.getItemFromBlock(block)));
//        oreObscura.registerItemModel(Item.getItemFromBlock(oreObscura));
    }

}