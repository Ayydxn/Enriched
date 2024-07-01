package com.enrichedmc.enriched.datagen.lang;

import com.enrichedmc.enriched.block.EnrichedBlocks;
import com.enrichedmc.enriched.item.EnrichedItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class EnrichedEnglishLanguageProvider extends FabricLanguageProvider
{
    public EnrichedEnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
    {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder)
    {
        /*-------------*/
        /* -- Items -- */
        /*-------------*/

        translationBuilder.add(EnrichedItems.RUBY, "Ruby");
        translationBuilder.add(EnrichedItems.SAPPHIRE, "Sapphire");
        translationBuilder.add(EnrichedItems.TANZANITE, "Tanzanite");
        translationBuilder.add(EnrichedItems.STEEL_BLEND, "Steel Blend");
        translationBuilder.add(EnrichedItems.STEEL_INGOT, "Steel Ingot");
        translationBuilder.add(EnrichedItems.OBSIDIAN_ALLOY_BLEND, "Obsidian Alloy Blend");
        translationBuilder.add(EnrichedItems.OBSIDIAN_ALLOY_INGOT, "Obsidian Alloy Ingot");
        translationBuilder.add(EnrichedItems.HONEY_BALL, "Honey Ball");

        /*--------------*/
        /* -- Blocks -- */
        /*--------------*/

        translationBuilder.add(EnrichedBlocks.RUBY_BLOCK, "Ruby Block");
        translationBuilder.add(EnrichedBlocks.RUBY_ORE, "Ruby Ore");
        translationBuilder.add(EnrichedBlocks.DEEPSLATE_RUBY_ORE, "Deepslate Ruby Ore");

        translationBuilder.add(EnrichedBlocks.SAPPHIRE_BLOCK, "Sapphire Block");
        translationBuilder.add(EnrichedBlocks.SAPPHIRE_ORE, "Sapphire Ore");
        translationBuilder.add(EnrichedBlocks.DEEPSLATE_SAPPHIRE_ORE, "Deepslate Sapphire Ore");

        translationBuilder.add(EnrichedBlocks.TANZANITE_BLOCK, "Tanzanite Block");
        translationBuilder.add(EnrichedBlocks.TANZANITE_ORE, "Tanzanite Ore");
        translationBuilder.add(EnrichedBlocks.DEEPSLATE_TANZANITE_ORE, "Deepslate Tanzanite Ore");

        translationBuilder.add(EnrichedBlocks.STEEL_BLOCK, "Steel Block");
        translationBuilder.add(EnrichedBlocks.OBSIDIAN_ALLOY_BLOCK, "Obsidian Alloy Block");

        /*-------------*/
        /* -- Tools -- */
        /*-------------*/

        this.addToolTranslations(translationBuilder, EnrichedItems.RUBY_SWORD, EnrichedItems.RUBY_SHOVEL, EnrichedItems.RUBY_PICKAXE, EnrichedItems.RUBY_AXE,
                EnrichedItems.RUBY_HOE, "Ruby Sword", "Ruby Shovel", "Ruby Pickaxe", "Ruby Axe", "Ruby Hoe");

        this.addToolTranslations(translationBuilder, EnrichedItems.SAPPHIRE_SWORD, EnrichedItems.SAPPHIRE_SHOVEL, EnrichedItems.SAPPHIRE_PICKAXE,
                EnrichedItems.SAPPHIRE_AXE, EnrichedItems.SAPPHIRE_HOE, "Sapphire Sword", "Sapphire Shovel", "Sapphire Pickaxe",
                "Sapphire Axe", "Sapphire Hoe");

        this.addToolTranslations(translationBuilder, EnrichedItems.TANZANITE_SWORD, EnrichedItems.TANZANITE_SHOVEL, EnrichedItems.TANZANITE_PICKAXE,
                EnrichedItems.TANZANITE_AXE, EnrichedItems.TANZANITE_HOE, "Tanzanite Sword", "Tanzanite Shovel",
                "Tanzanite Pickaxe", "Tanzanite Axe", "Tanzanite Hoe");

        this.addToolTranslations(translationBuilder, EnrichedItems.STEEL_SWORD, EnrichedItems.STEEL_SHOVEL, EnrichedItems.STEEL_PICKAXE, EnrichedItems.STEEL_AXE,
                EnrichedItems.STEEL_HOE, "Steel Sword", "Steel Shovel", "Steel Pickaxe", "Steel Axe", "Steel Hoe");

        this.addToolTranslations(translationBuilder, EnrichedItems.OBSIDIAN_SWORD, EnrichedItems.OBSIDIAN_SHOVEL, EnrichedItems.OBSIDIAN_PICKAXE,
                EnrichedItems.OBSIDIAN_AXE, EnrichedItems.OBSIDIAN_HOE, "Obsidian Sword", "Obsidian Shovel", "Obsidian Pickaxe",
                "Obsidian Axe", "Obsidian Hoe");

        this.addToolTranslations(translationBuilder, EnrichedItems.EMERALD_SWORD, EnrichedItems.EMERALD_SHOVEL, EnrichedItems.EMERALD_PICKAXE,
                EnrichedItems.EMERALD_AXE, EnrichedItems.EMERALD_HOE, "Emerald Sword", "Emerald Shovel", "Emerald Pickaxe",
                "Emerald Axe", "Emerald Hoe");

        this.addToolTranslations(translationBuilder, EnrichedItems.COPPER_SWORD, EnrichedItems.COPPER_SHOVEL, EnrichedItems.COPPER_PICKAXE,
                EnrichedItems.COPPER_AXE, EnrichedItems.COPPER_HOE, "Copper Sword", "Copper Shovel", "Copper Pickaxe",
                "Copper Axe", "Copper Hoe");

        /*-------------*/
        /* -- Armor -- */
        /*-------------*/

        this.addArmorTranslations(translationBuilder, EnrichedItems.RUBY_HELMET, EnrichedItems.RUBY_CHESTPLATE, EnrichedItems.RUBY_LEGGINGS,
                EnrichedItems.RUBY_BOOTS, "Ruby Helmet", "Ruby Chestplate", "Ruby Leggings", "Ruby Boots");

        this.addArmorTranslations(translationBuilder, EnrichedItems.SAPPHIRE_HELMET, EnrichedItems.SAPPHIRE_CHESTPLATE, EnrichedItems.SAPPHIRE_LEGGINGS,
                EnrichedItems.SAPPHIRE_BOOTS, "Sapphire Helmet", "Sapphire Chestplate", "Sapphire Leggings",
                "Sapphire Boots");

        this.addArmorTranslations(translationBuilder, EnrichedItems.TANZANITE_HELMET, EnrichedItems.TANZANITE_CHESTPLATE, EnrichedItems.TANZANITE_LEGGINGS,
                EnrichedItems.TANZANITE_BOOTS, "Tanzanite Helmet", "Tanzanite Chestplate", "Tanzanite Leggings",
                "Tanzanite Boots");

        this.addArmorTranslations(translationBuilder, EnrichedItems.STEEL_HELMET, EnrichedItems.STEEL_CHESTPLATE, EnrichedItems.STEEL_LEGGINGS,
                EnrichedItems.STEEL_BOOTS, "Steel Helmet", "Steel Chestplate", "Steel Leggings",
                "Steel Boots");

        this.addArmorTranslations(translationBuilder, EnrichedItems.OBSIDIAN_HELMET, EnrichedItems.OBSIDIAN_CHESTPLATE, EnrichedItems.OBSIDIAN_LEGGINGS,
                EnrichedItems.OBSIDIAN_BOOTS, "Obsidian Helmet", "Obsidian Chestplate", "Obsidian Leggings",
                "Obsidian Boots");

        this.addArmorTranslations(translationBuilder, EnrichedItems.EMERALD_HELMET, EnrichedItems.EMERALD_CHESTPLATE, EnrichedItems.EMERALD_LEGGINGS,
                EnrichedItems.EMERALD_BOOTS, "Emerald Helmet", "Emerald Chestplate", "Emerald Leggings",
                "Emerald Boots");

        /*------------*/
        /* -- Food -- */
        /*------------*/

        translationBuilder.add(EnrichedItems.BEEF_STEW, "Beef Stew");
        translationBuilder.add(EnrichedItems.BERRY_JUICE, "Berry Juice");
    }

    private void addToolTranslations(TranslationBuilder translationBuilder, Item sword, Item shovel, Item pickaxe, Item axe, Item hoe, String swordText,
                                     String shovelText, String pickaxeText, String axeText, String hoeText)
    {
        translationBuilder.add(sword, swordText);
        translationBuilder.add(shovel, shovelText);
        translationBuilder.add(pickaxe, pickaxeText);
        translationBuilder.add(axe, axeText);
        translationBuilder.add(hoe, hoeText);
    }

    private void addArmorTranslations(TranslationBuilder translationBuilder, ArmorItem helmet, ArmorItem chestplate, ArmorItem leggings, ArmorItem boots,
                                      String helmetText, String chestplateText, String leggingsText, String bootsText)
    {
        translationBuilder.add(helmet, helmetText);
        translationBuilder.add(chestplate, chestplateText);
        translationBuilder.add(leggings, leggingsText);
        translationBuilder.add(boots, bootsText);
    }
}
