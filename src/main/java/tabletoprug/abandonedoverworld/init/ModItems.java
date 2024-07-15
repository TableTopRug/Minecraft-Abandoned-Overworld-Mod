package tabletoprug.abandonedoverworld.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;
import tabletoprug.abandonedoverworld.AbandonedOverworld;
import tabletoprug.abandonedoverworld.item.ItemBase;


public class ModItems {

    public static final ItemBase OBSCURING_TORCH = new ItemBase("obscuring_torch").setCreativeTab(CreativeTabs.MISC);

    public static final ItemBase[] ALL_MOD_ITEMS = {
            OBSCURING_TORCH
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
