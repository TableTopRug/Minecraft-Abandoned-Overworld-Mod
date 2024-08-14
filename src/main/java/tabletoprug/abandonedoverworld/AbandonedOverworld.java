package tabletoprug.abandonedoverworld;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import tabletoprug.abandonedoverworld.client.AbandonedOverworldTab;
import tabletoprug.abandonedoverworld.proxy.CommonProxy;
import tabletoprug.abandonedoverworld.recipes.ModRecipes;


@Mod(modid = AbandonedOverworld.MODID, name = AbandonedOverworld.NAME, version = AbandonedOverworld.VERSION, acceptedMinecraftVersions = AbandonedOverworld.MC_VERSION)
public class AbandonedOverworld {
    public static final String MODID = "abandonedoverworld";
    public static final String NAME = "Abandoned Overworld";
    public static final String VERSION = "0.8.0";
    public static final String MC_VERSION = "[1.12.2]";
    public static final AbandonedOverworldTab TAB = new AbandonedOverworldTab();

    public static Logger logger;

    @Mod.Instance(MODID)
    public static AbandonedOverworld instance;

    @SidedProxy(clientSide = "tabletoprug.abandonedoverworld.proxy.ClientProxy", serverSide = "tabletoprug.abandonedoverworld.proxy.ServerProxy")
    public static CommonProxy proxy;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info(AbandonedOverworld.NAME + " loading");

        ModRecipes.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
