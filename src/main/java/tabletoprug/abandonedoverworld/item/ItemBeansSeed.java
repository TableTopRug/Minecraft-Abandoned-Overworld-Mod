package tabletoprug.abandonedoverworld.item;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import tabletoprug.abandonedoverworld.AbandonedOverworld;
import tabletoprug.abandonedoverworld.block.ModBlocks;


public class ItemBeansSeed extends ItemSeeds implements ItemModelProvider {

    public ItemBeansSeed() {
        super(ModBlocks.cropBeans, Blocks.FARMLAND);

        setUnlocalizedName("beans_seed");
        setRegistryName("beans_seed");
        setCreativeTab(AbandonedOverworld.TAB);
    }

    @Override
    public void registerItemModel() {
        AbandonedOverworld.proxy.registerItemRenderer(this, 0, "beans_seed");
    }
}
