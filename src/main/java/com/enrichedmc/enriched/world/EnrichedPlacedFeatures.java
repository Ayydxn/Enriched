package com.enrichedmc.enriched.world;

import com.enrichedmc.enriched.registry.EnrichedRegisters;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.OrePlacedFeatures;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class EnrichedPlacedFeatures
{
    public static final RegistryKey<PlacedFeature> RUBY_ORE_PLACED_KEY = EnrichedRegisters.createRegistryKey(RegistryKeys.PLACED_FEATURE, "ruby_ore_placed");
    public static final RegistryKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY = EnrichedRegisters.createRegistryKey(RegistryKeys.PLACED_FEATURE, "sapphire_ore_placed");
    public static final RegistryKey<PlacedFeature> TANZANITE_ORE_PLACED_KEY = EnrichedRegisters.createRegistryKey(RegistryKeys.PLACED_FEATURE, "tanzanite_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> context)
    {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, RUBY_ORE_PLACED_KEY, registryEntryLookup.getOrThrow(EnrichedConfiguredFeatures.RUBY_ORE_KEY),
                OrePlacedFeatures.modifiersWithCount(6, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(+80))));

        register(context, SAPPHIRE_ORE_PLACED_KEY, registryEntryLookup.getOrThrow(EnrichedConfiguredFeatures.SAPPHIRE_ORE_KEY),
                OrePlacedFeatures.modifiersWithCount(6, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(+80))));

        register(context, TANZANITE_ORE_PLACED_KEY, registryEntryLookup.getOrThrow(EnrichedConfiguredFeatures.TANZANITE_ORE_KEY),
                OrePlacedFeatures.modifiersWithCount(6, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(+80))));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> registryKey,
                                 RegistryEntry<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> placementModifiers)
    {
        context.register(registryKey, new PlacedFeature(configuration, List.copyOf(placementModifiers)));
    }
}