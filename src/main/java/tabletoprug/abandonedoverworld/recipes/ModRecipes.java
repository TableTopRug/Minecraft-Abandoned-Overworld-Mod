package tabletoprug.abandonedoverworld.recipes;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tabletoprug.abandonedoverworld.block.ModBlocks;
import tabletoprug.abandonedoverworld.item.ModItems;


public class ModRecipes {

    public static void init() {
        // Ore Dict
        ModBlocks.oreObscura.initOreDict();
        ModItems.OBSCURA_DUST.initOreDict();
        ModItems.BEANS.initOreDict();

        // Smelting Recipies
        GameRegistry.addSmelting(ModBlocks.oreObscura, new ItemStack(ModItems.OBSCURA_DUST), 0.7f);
    }
}
