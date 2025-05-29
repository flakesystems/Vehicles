package de.kuschelcraft.vehicles.world.feature;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import de.kuschelcraft.vehicles.Vehicles;
import de.kuschelcraft.vehicles.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Vehicles.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_OIL_VEINS = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.OILY_STONE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.OILY_DEEPSLATE.get().defaultBlockState())
    ));

    public static final RegistryObject<ConfiguredFeature<?, ?>> OIL_VEINS = CONFIGURED_FEATURES.register("oil_veins",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_OIL_VEINS.get(), 9)));

    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}
