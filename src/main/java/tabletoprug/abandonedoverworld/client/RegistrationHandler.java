package tabletoprug.abandonedoverworld.client;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import tabletoprug.abandonedoverworld.AbandonedOverworld;
import tabletoprug.abandonedoverworld.init.ModItems;


@EventBusSubscriber(modid = AbandonedOverworld.MODID)
public class RegistrationHandler {

    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        ModItems.register(event.getRegistry());
    }

    @SubscribeEvent
    public static void registerItems(ModelRegistryEvent event) {
        ModItems.registerModels();
    }
}
