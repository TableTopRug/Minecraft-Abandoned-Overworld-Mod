package tabletoprug.abandonedoverworld.client;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import tabletoprug.abandonedoverworld.AbandonedOverworld;
import tabletoprug.abandonedoverworld.block.ModBlocks;
import tabletoprug.abandonedoverworld.item.ModItems;


@EventBusSubscriber(modid = AbandonedOverworld.MODID)
public class RegistrationHandler {

    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        ModItems.register(event.getRegistry());
        ModBlocks.registerItemBlocks(event.getRegistry());
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        ModItems.registerModels();
        ModBlocks.registerModels();
    }

    @SubscribeEvent
    public static void registerBlocks(Register<Block> event) {
        ModBlocks.register(event.getRegistry());
    }
}
