package com.vanillaenhanced.biome;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;

import javax.swing.table.DefaultTableModel;


public class DesertMountains extends Biome {
    public DesertMountains()
        {
            super((new Settings()).configureSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.SAND_CONFIG)
                    .precipitation(Precipitation.NONE)
                    .category(Category.DESERT)
                    .depth(0.5F).scale(0.75F)
                    .temperature(2.0F)
                    .downfall(0.0F)
                    .effects((new BiomeEffects.Builder())
                            .waterColor(4159204)
                            .waterFogColor(329011)
                            .fogColor(12638463)
                            .moodSound(BiomeMoodSound.CAVE)
                            .build()).parent((String) null)
                    .noises(ImmutableList.of(new MixedNoisePoint(0.5F, -0.5F, 0.0F, 0.0F, 1.0F))));
            this.addStructureFeature(DefaultBiomeFeatures.STRONGHOLD);
            this.addStructureFeature(DefaultBiomeFeatures.DESERT_VILLAGE);
            this.addStructureFeature(DefaultBiomeFeatures.PILLAGER_OUTPOST);
            this.addStructureFeature(DefaultBiomeFeatures.DESERT_PYRAMID);
            DefaultBiomeFeatures.addDefaultUndergroundStructures(this);
            this.addStructureFeature(DefaultBiomeFeatures.DESERT_RUINED_PORTAL);
            DefaultBiomeFeatures.addDungeons(this);
            DefaultBiomeFeatures.addMineables(this);
            DefaultBiomeFeatures.addDefaultOres(this);
            DefaultBiomeFeatures.addDefaultDisks(this);
            DefaultBiomeFeatures.addDefaultFlowers(this);
            DefaultBiomeFeatures.addDefaultGrass(this);
            DefaultBiomeFeatures.addDesertDeadBushes(this);
            DefaultBiomeFeatures.addDefaultMushrooms(this);
            DefaultBiomeFeatures.addDesertVegetation(this);
            DefaultBiomeFeatures.addSprings(this);
            DefaultBiomeFeatures.addDesertFeatures(this);
            DefaultBiomeFeatures.addFrozenTopLayer(this);
            this.addSpawn(SpawnGroup.CREATURE, new SpawnEntry(EntityType.RABBIT, 8, 2, 4));
            this.addSpawn(SpawnGroup.AMBIENT, new SpawnEntry(EntityType.BAT, 10, 8, 8));
            this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.SPIDER, 100, 4, 4));
            this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.HUSK, 95, 4, 4));
            this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
            this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.SKELETON, 100, 4, 4));
            this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.CREEPER, 100, 4, 4));
            this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.SLIME, 100, 4, 4));
            this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.ENDERMAN, 10, 1, 4));
            this.addSpawn(SpawnGroup.MONSTER, new SpawnEntry(EntityType.WITCH, 5, 1, 1));

        }
    }

