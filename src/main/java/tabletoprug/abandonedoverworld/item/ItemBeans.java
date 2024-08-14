package tabletoprug.abandonedoverworld.item;

import net.minecraft.item.ItemFood;
import net.minecraftforge.oredict.OreDictionary;
import tabletoprug.abandonedoverworld.AbandonedOverworld;

public class ItemBeans extends ItemFood implements ItemModelProvider {

    public ItemBeans() {
        super(3, .6f, false);

        setUnlocalizedName("beans");
        setRegistryName("beans");
        setCreativeTab(AbandonedOverworld.TAB);
    }

    @Override
    public void registerItemModel() {
        AbandonedOverworld.proxy.registerItemRenderer(this, 0, "beans");
    }

    public void initOreDict() {
        OreDictionary.registerOre("cropBeans", this);
    }
}
