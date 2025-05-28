package de.kuschelcraft.vehicles.item;

import de.kuschelcraft.vehicles.Vehicles;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Vehicles.MOD_ID);

    public static final RegistryObject<Item> FUEL_CAN = ITEMS.register("fuel_can",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VEHICLES_TAB)));
    public static final RegistryObject<Item> OILY_EXTRACT = ITEMS.register("oily_extract",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VEHICLES_TAB)));
    public static final RegistryObject<Item> DRIED_OIL = ITEMS.register("dried_oil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VEHICLES_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
