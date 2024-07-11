package tabletoprug.abandonedoverworld;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import tabletoprug.abandonedoverworld.util.RegistryUtils;


@EventBusSubscriber(modid = AbandonedOverworld.MODID)
public class RegistrationHandler {

    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        final Item[] items = {
                RegistryUtils.setItemName(new Item(), "obscuring_torch").setCreativeTab(CreativeTabs.MISC)
        };

        event.getRegistry().registerAll(items);
    }
}
