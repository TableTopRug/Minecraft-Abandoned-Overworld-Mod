package tabletoprug.abandonedoverworld.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import tabletoprug.abandonedoverworld.AbandonedOverworld;


public class ModItems {

    public static final ItemBase OBSCURA_TORCH = new ItemBase("torch_obscura").setCreativeTab(CreativeTabs.MISC);


    public static final ItemBase[] ALL_MOD_ITEMS = {
            OBSCURA_TORCH,
    };

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(ALL_MOD_ITEMS);
    }

    public static void registerModels() {
        for (ItemBase modItem : ALL_MOD_ITEMS) {
            modItem.registerItemModel();
            AbandonedOverworld.logger.info("Registered " + modItem.getUnlocalizedName() + " at " + modItem.getRegistryName().getResourcePath());
        }
    }
}
