package tabletoprug.abandonedoverworld.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import tabletoprug.abandonedoverworld.AbandonedOverworld;


public class ModItems {

    public static final ItemBase OBSCURA_TORCH = new ItemBase("torch_obscura");

    public static final ItemOre OBSCURA_DUST = new ItemOre("dust_obscura", "dustObscura");
    public static final ItemOre BEANS = new ItemOre("beans", "cropBeans");

    public static ItemBeansSeed BEANS_SEED = new ItemBeansSeed();


    public static final Item[] ALL_MOD_ITEMS = {
            OBSCURA_DUST,
            OBSCURA_TORCH,
            BEANS_SEED,
            BEANS,
    };

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(ALL_MOD_ITEMS);
    }

    public static void registerModels() {
        for (Item modItem : ALL_MOD_ITEMS) {
            if (ItemModelProvider.class.isAssignableFrom(modItem.getClass())) {
                ((ItemModelProvider) modItem).registerItemModel();
            }
            AbandonedOverworld.logger.info("Registered " + modItem.getUnlocalizedName() + " at " + modItem.getRegistryName().getResourcePath());
        }
    }
}
