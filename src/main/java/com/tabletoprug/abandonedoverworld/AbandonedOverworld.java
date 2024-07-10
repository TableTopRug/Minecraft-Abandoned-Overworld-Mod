package com.tabletoprug.abandonedoverworld;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;


@Mod(modid = AbandonedOverworld.MODID, name = AbandonedOverworld.NAME, version = AbandonedOverworld.VERSION, dependencies = "required-after:Forge@[11.16.0.1865,)", useMetadata = true)
public class AbandonedOverworld {
    public static final String MODID = "abandonedoverworld";
    public static final String NAME = "Abandoned Overworld";
    public static final String VERSION = "0.0.1";

    private static Logger logger;

    @Mod.Instance
    public static AbandonedOverworld instance;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
