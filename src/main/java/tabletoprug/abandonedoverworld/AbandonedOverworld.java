package tabletoprug.abandonedoverworld;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;
import tabletoprug.abandonedoverworld.client.AbandonedOverworldTab;
import tabletoprug.abandonedoverworld.proxy.CommonProxy;
import tabletoprug.abandonedoverworld.recipes.ModRecipes;
import tabletoprug.abandonedoverworld.world.ModWorldGen;


@Mod(useMetadata = true, modid = AbandonedOverworld.MODID, certificateFingerprint = "7ffb849242ce75b5313e506c31503f92ae75e999a4513148b6f4003108a42dec")
public class AbandonedOverworld {
    public static final String MODID = "abandonedoverworld";
    public static final String NAME = "Abandoned Overworld";
//    public static final String VERSION = "0.9.0";
//    public static final String MC_VERSION = "[1.12.2]";
    public static final AbandonedOverworldTab TAB = new AbandonedOverworldTab();

    public static Logger logger;

    @Mod.Instance(MODID)
    public static AbandonedOverworld instance;

    @SidedProxy(clientSide = "tabletoprug.abandonedoverworld.proxy.ClientProxy", serverSide = "tabletoprug.abandonedoverworld.proxy.ServerProxy")
    public static CommonProxy proxy;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();

        GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
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
