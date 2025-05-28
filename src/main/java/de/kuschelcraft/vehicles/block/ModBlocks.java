package de.kuschelcraft.vehicles.block;

import de.kuschelcraft.vehicles.Vehicles;
import de.kuschelcraft.vehicles.item.ModCreativeModeTab;
import de.kuschelcraft.vehicles.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Vehicles.MOD_ID);


    public static final RegistryObject<Block> VEHICLE_CONTROLLER = registerBlock("vehicle_controller",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()
            ), ModCreativeModeTab.VEHICLES_TAB);

    public static final RegistryObject<Block> DRIED_OIL_BLOCK = registerBlock("dried_oil_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()
            ), ModCreativeModeTab.VEHICLES_TAB);

    public static final RegistryObject<Block> OILY_STONE = registerBlock("oily_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()
            ), ModCreativeModeTab.VEHICLES_TAB);

    public static final RegistryObject<Block> OILY_DEEPSLATE = registerBlock("oily_deepslate",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()
            ), ModCreativeModeTab.VEHICLES_TAB);



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {

        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
