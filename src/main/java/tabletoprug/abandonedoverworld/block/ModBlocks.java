package tabletoprug.abandonedoverworld.block;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.Arrays;


public class ModBlocks {

    public static BlockOre oreObscura = new BlockOre("ore_obscura");

    public static BlockPedestal pedestal = new BlockPedestal();


    public static BlockBase[] ALL_MOD_BLOCKS = new BlockBase[] {
            oreObscura,
            pedestal
    };


    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(ALL_MOD_BLOCKS);
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        Arrays.stream(ALL_MOD_BLOCKS).forEach(block -> registry.register(block.setCreativeTab(CreativeTabs.MATERIALS).createItemBlock()));
    }

    public static void registerModels() {
        Arrays.stream(ALL_MOD_BLOCKS).forEach(block -> block.registerItemModel(Item.getItemFromBlock(block)));
//        oreObscura.registerItemModel(Item.getItemFromBlock(oreObscura));
    }

}