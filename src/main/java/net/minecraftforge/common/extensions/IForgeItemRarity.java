package net.minecraftforge.common.extensions;

import net.minecraft.network.chat.Style;
import net.minecraft.world.item.Rarity;

public interface IForgeItemRarity
{
    private Rarity self()
    {
        return (Rarity) this;
    }

    /**
     * Use this method to apply color and styles
     * @param style the style to be modified
     * @return modified style
     */
    default Style applyStyle(Style style)
    {
        return self().style.applyTo(style);
    }
}
