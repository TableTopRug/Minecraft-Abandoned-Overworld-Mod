package tabletoprug.abandonedoverworld.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import tabletoprug.abandonedoverworld.AbandonedOverworld;


public class ItemBase extends Item implements ItemModelProvider {
    protected String name;

    public ItemBase(String name) {
        this.name = name;

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(AbandonedOverworld.TAB);
    }

    public void registerItemModel() {
        AbandonedOverworld.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
