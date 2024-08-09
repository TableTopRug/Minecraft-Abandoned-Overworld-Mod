package tabletoprug.abandonedoverworld.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import tabletoprug.abandonedoverworld.AbandonedOverworld;
import tabletoprug.abandonedoverworld.item.ModItems;


public class AbandonedOverworldTab extends CreativeTabs {

    public AbandonedOverworldTab() {
        super(AbandonedOverworld.MODID);

        setBackgroundImageName("abandonedoverworld.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.OBSCURA_TORCH);
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }

}