package tabletoprug.abandonedoverworld.util;

import net.minecraft.item.Item;
import tabletoprug.abandonedoverworld.AbandonedOverworld;


public class RegistryUtils {

    public static Item setItemName(final Item item, final String itemName) {
        item.setRegistryName(AbandonedOverworld.MODID, itemName).setUnlocalizedName(AbandonedOverworld.MODID + "." + itemName);

        return item;
    }
}
