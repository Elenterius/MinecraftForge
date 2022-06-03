package net.minecraftforge.debug.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod(CustomItemRarityStyleTest.MOD_ID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = CustomItemRarityStyleTest.MOD_ID)
public class CustomItemRarityStyleTest
{
    public static final String MOD_ID = "custom_item_rarity_style_test";

    public static final ResourceLocation ILLAGER_FONT = new ResourceLocation("minecraft", "illageralt");

    public static final Rarity DEPRECATED_RARITY = Rarity.create("forge:test_deprecated", ChatFormatting.RED);
    public static final Rarity EMERALD_VALLEY_COLOR_RARITY = Rarity.create("forge:test_emerald", Style.EMPTY.withColor(0x3b8272));
    public static final Rarity ILLAGER_FONT_RARITY = Rarity.create("forge:test_illager", Style.EMPTY.withFont(ILLAGER_FONT));

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    private static final RegistryObject<Item> TEST_RARITY_DEPRECATED = ITEMS.register("rarity_chat_formatting",() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(DEPRECATED_RARITY)));
    private static final RegistryObject<Item> TEST_RARITY_COLOR = ITEMS.register("rarity_color",() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(EMERALD_VALLEY_COLOR_RARITY)));
    private static final RegistryObject<Item> TEST_RARITY_FONT = ITEMS.register("rarity_font",() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(ILLAGER_FONT_RARITY)));

    public CustomItemRarityStyleTest()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

}
