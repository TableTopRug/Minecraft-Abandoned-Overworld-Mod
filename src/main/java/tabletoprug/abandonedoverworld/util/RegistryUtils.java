package tabletoprug.abandonedoverworld.util;

import net.minecraft.item.Item;
import tabletoprug.abandonedoverworld.AbandonedOverworld;
import tabletoprug.abandonedoverworld.item.ItemBase;


public class RegistryUtils {

    public static Item setItemName(final Item item, final String itemName) {
        item.setRegistryName(AbandonedOverworld.MODID, itemName).setUnlocalizedName(AbandonedOverworld.MODID + "." + itemName);

        return item;
    }

    public static ItemBase setItemBaseName(final ItemBase item) {
        setItemName(item, item.getUnlocalizedName());

        return item;
    }
}
