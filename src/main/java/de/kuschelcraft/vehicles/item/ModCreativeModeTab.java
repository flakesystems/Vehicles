package de.kuschelcraft.vehicles.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab VEHICLES_TAB = new CreativeModeTab("vehicles_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FUEL_CAN.get());
        }
    };
}
