package com.enrichedmc.enriched.datagen;

import com.enrichedmc.enriched.EnrichedMod;
import com.enrichedmc.enriched.block.EnrichedBlocks;
import com.enrichedmc.enriched.conditions.EnrichedResourceConditions;
import com.enrichedmc.enriched.item.EnrichedItems;
import com.google.common.collect.Lists;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.BlastingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SmeltingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class EnrichedRecipeProvider extends FabricRecipeProvider
{
    public EnrichedRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter)
    {
        this.createRubyRecipes(exporter);
        this.createSapphireRecipes(exporter);
        this.createTanzaniteRecipes(exporter);
        this.createSteelRecipes(exporter);
        this.createObsidianRecipes(exporter);
        this.createEmeraldRecipes(exporter);
        this.createCopperRecipes(exporter);

        this.createHorseArmorRecipes(exporter);
        this.createChainmailRecipes(exporter);
        this.createRawSmeltingRecipes(exporter);

        this.createUncraftingRecipes(exporter);
    }

    private void createRubyRecipes(RecipeExporter recipeExporter)
    {
        this.createSwordRecipe(recipeExporter, EnrichedItems.RUBY, EnrichedItems.RUBY_SWORD, Lists.newArrayList(EnrichedResourceConditions.RUBY_ENABLED));
        this.createShovelRecipe(recipeExporter, EnrichedItems.RUBY, EnrichedItems.RUBY_SHOVEL, Lists.newArrayList(EnrichedResourceConditions.RUBY_ENABLED));
        this.createPickaxeRecipe(recipeExporter, EnrichedItems.RUBY, EnrichedItems.RUBY_PICKAXE, Lists.newArrayList(EnrichedResourceConditions.RUBY_ENABLED));
        this.createAxeRecipe(recipeExporter, EnrichedItems.RUBY, EnrichedItems.RUBY_AXE, Lists.newArrayList(EnrichedResourceConditions.RUBY_ENABLED));
        this.createHoeRecipe(recipeExporter, EnrichedItems.RUBY, EnrichedItems.RUBY_HOE, Lists.newArrayList(EnrichedResourceConditions.RUBY_ENABLED));

        this.createHelmetRecipe(recipeExporter, EnrichedItems.RUBY, EnrichedItems.RUBY_HELMET, Lists.newArrayList(EnrichedResourceConditions.RUBY_ENABLED));
        this.createChestplateRecipe(recipeExporter, EnrichedItems.RUBY, EnrichedItems.RUBY_CHESTPLATE, Lists.newArrayList(EnrichedResourceConditions.RUBY_ENABLED));
        this.createLeggingsRecipe(recipeExporter, EnrichedItems.RUBY, EnrichedItems.RUBY_LEGGINGS, Lists.newArrayList(EnrichedResourceConditions.RUBY_ENABLED));
        this.createBootsRecipe(recipeExporter, EnrichedItems.RUBY, EnrichedItems.RUBY_BOOTS, Lists.newArrayList(EnrichedResourceConditions.RUBY_ENABLED));

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, EnrichedItems.RUBY, RecipeCategory.MISC, EnrichedBlocks.RUBY_BLOCK);
    }

    private void createSapphireRecipes(RecipeExporter recipeExporter)
    {
        this.createSwordRecipe(recipeExporter, EnrichedItems.SAPPHIRE, EnrichedItems.SAPPHIRE_SWORD,
                Lists.newArrayList(EnrichedResourceConditions.SAPPHIRE_ENABLED));

        this.createShovelRecipe(recipeExporter, EnrichedItems.SAPPHIRE, EnrichedItems.SAPPHIRE_SHOVEL,
                Lists.newArrayList(EnrichedResourceConditions.SAPPHIRE_ENABLED));

        this.createPickaxeRecipe(recipeExporter, EnrichedItems.SAPPHIRE, EnrichedItems.SAPPHIRE_PICKAXE,
                Lists.newArrayList(EnrichedResourceConditions.SAPPHIRE_ENABLED));

        this.createAxeRecipe(recipeExporter, EnrichedItems.SAPPHIRE, EnrichedItems.SAPPHIRE_AXE,
                Lists.newArrayList(EnrichedResourceConditions.SAPPHIRE_ENABLED));

        this.createHoeRecipe(recipeExporter, EnrichedItems.SAPPHIRE, EnrichedItems.SAPPHIRE_HOE,
                Lists.newArrayList(EnrichedResourceConditions.SAPPHIRE_ENABLED));

        this.createHelmetRecipe(recipeExporter, EnrichedItems.SAPPHIRE, EnrichedItems.SAPPHIRE_HELMET,
                Lists.newArrayList(EnrichedResourceConditions.SAPPHIRE_ENABLED));

        this.createChestplateRecipe(recipeExporter, EnrichedItems.SAPPHIRE, EnrichedItems.SAPPHIRE_CHESTPLATE,
                Lists.newArrayList(EnrichedResourceConditions.SAPPHIRE_ENABLED));

        this.createLeggingsRecipe(recipeExporter, EnrichedItems.SAPPHIRE, EnrichedItems.SAPPHIRE_LEGGINGS,
                Lists.newArrayList(EnrichedResourceConditions.SAPPHIRE_ENABLED));

        this.createBootsRecipe(recipeExporter, EnrichedItems.SAPPHIRE, EnrichedItems.SAPPHIRE_BOOTS,
                Lists.newArrayList(EnrichedResourceConditions.SAPPHIRE_ENABLED));
    }

    private void createTanzaniteRecipes(RecipeExporter recipeExporter)
    {
        this.createSwordRecipe(recipeExporter, EnrichedItems.TANZANITE, EnrichedItems.TANZANITE_SWORD,
                Lists.newArrayList(EnrichedResourceConditions.TANZANITE_ENABLED));

        this.createShovelRecipe(recipeExporter, EnrichedItems.TANZANITE, EnrichedItems.TANZANITE_SHOVEL,
                Lists.newArrayList(EnrichedResourceConditions.TANZANITE_ENABLED));

        this.createPickaxeRecipe(recipeExporter, EnrichedItems.TANZANITE, EnrichedItems.TANZANITE_PICKAXE,
                Lists.newArrayList(EnrichedResourceConditions.TANZANITE_ENABLED));

        this.createAxeRecipe(recipeExporter, EnrichedItems.TANZANITE, EnrichedItems.TANZANITE_AXE,
                Lists.newArrayList(EnrichedResourceConditions.TANZANITE_ENABLED));

        this.createHoeRecipe(recipeExporter, EnrichedItems.TANZANITE, EnrichedItems.TANZANITE_HOE,
                Lists.newArrayList(EnrichedResourceConditions.TANZANITE_ENABLED));

        this.createHelmetRecipe(recipeExporter, EnrichedItems.TANZANITE, EnrichedItems.TANZANITE_HELMET,
                Lists.newArrayList(EnrichedResourceConditions.TANZANITE_ENABLED));

        this.createChestplateRecipe(recipeExporter, EnrichedItems.TANZANITE, EnrichedItems.TANZANITE_CHESTPLATE,
                Lists.newArrayList(EnrichedResourceConditions.TANZANITE_ENABLED));

        this.createLeggingsRecipe(recipeExporter, EnrichedItems.TANZANITE, EnrichedItems.TANZANITE_LEGGINGS,
                Lists.newArrayList(EnrichedResourceConditions.TANZANITE_ENABLED));

        this.createBootsRecipe(recipeExporter, EnrichedItems.TANZANITE, EnrichedItems.TANZANITE_BOOTS,
                Lists.newArrayList(EnrichedResourceConditions.TANZANITE_ENABLED));
    }

    private void createSteelRecipes(RecipeExporter recipeExporter)
    {
        this.createSwordRecipe(recipeExporter, EnrichedItems.STEEL_INGOT, EnrichedItems.STEEL_SWORD, Lists.newArrayList(EnrichedResourceConditions.STEEL_ENABLED));
        this.createShovelRecipe(recipeExporter, EnrichedItems.STEEL_INGOT, EnrichedItems.STEEL_SHOVEL, Lists.newArrayList(EnrichedResourceConditions.STEEL_ENABLED));
        this.createPickaxeRecipe(recipeExporter, EnrichedItems.STEEL_INGOT, EnrichedItems.STEEL_PICKAXE, Lists.newArrayList(EnrichedResourceConditions.STEEL_ENABLED));
        this.createAxeRecipe(recipeExporter, EnrichedItems.STEEL_INGOT, EnrichedItems.STEEL_AXE, Lists.newArrayList(EnrichedResourceConditions.STEEL_ENABLED));
        this.createHoeRecipe(recipeExporter, EnrichedItems.STEEL_INGOT, EnrichedItems.STEEL_HOE, Lists.newArrayList(EnrichedResourceConditions.STEEL_ENABLED));

        this.createHelmetRecipe(recipeExporter, EnrichedItems.STEEL_INGOT, EnrichedItems.STEEL_HELMET, Lists.newArrayList(EnrichedResourceConditions.STEEL_ENABLED));
        this.createChestplateRecipe(recipeExporter, EnrichedItems.STEEL_INGOT, EnrichedItems.STEEL_CHESTPLATE, Lists.newArrayList(EnrichedResourceConditions.STEEL_ENABLED));
        this.createLeggingsRecipe(recipeExporter, EnrichedItems.STEEL_INGOT, EnrichedItems.STEEL_LEGGINGS, Lists.newArrayList(EnrichedResourceConditions.STEEL_ENABLED));
        this.createBootsRecipe(recipeExporter, EnrichedItems.STEEL_INGOT, EnrichedItems.STEEL_BOOTS, Lists.newArrayList(EnrichedResourceConditions.STEEL_ENABLED));
    }

    private void createObsidianRecipes(RecipeExporter recipeExporter)
    {
        this.createSwordRecipe(recipeExporter, EnrichedItems.OBSIDIAN_ALLOY_INGOT, EnrichedItems.OBSIDIAN_SWORD,
                Lists.newArrayList(EnrichedResourceConditions.OBSIDIAN_ENABLED));

        this.createShovelRecipe(recipeExporter, EnrichedItems.OBSIDIAN_ALLOY_INGOT, EnrichedItems.OBSIDIAN_SHOVEL,
                Lists.newArrayList(EnrichedResourceConditions.OBSIDIAN_ENABLED));

        this.createPickaxeRecipe(recipeExporter, EnrichedItems.OBSIDIAN_ALLOY_INGOT, EnrichedItems.OBSIDIAN_PICKAXE,
                Lists.newArrayList(EnrichedResourceConditions.OBSIDIAN_ENABLED));

        this.createAxeRecipe(recipeExporter, EnrichedItems.OBSIDIAN_ALLOY_INGOT, EnrichedItems.OBSIDIAN_AXE,
                Lists.newArrayList(EnrichedResourceConditions.OBSIDIAN_ENABLED));

        this.createHoeRecipe(recipeExporter, EnrichedItems.OBSIDIAN_ALLOY_INGOT, EnrichedItems.OBSIDIAN_HOE,
                Lists.newArrayList(EnrichedResourceConditions.OBSIDIAN_ENABLED));

        this.createHelmetRecipe(recipeExporter, EnrichedItems.OBSIDIAN_ALLOY_INGOT, EnrichedItems.OBSIDIAN_HELMET,
                Lists.newArrayList(EnrichedResourceConditions.OBSIDIAN_ENABLED));

        this.createChestplateRecipe(recipeExporter, EnrichedItems.OBSIDIAN_ALLOY_INGOT, EnrichedItems.OBSIDIAN_CHESTPLATE,
                Lists.newArrayList(EnrichedResourceConditions.OBSIDIAN_ENABLED));

        this.createLeggingsRecipe(recipeExporter, EnrichedItems.OBSIDIAN_ALLOY_INGOT, EnrichedItems.OBSIDIAN_LEGGINGS,
                Lists.newArrayList(EnrichedResourceConditions.OBSIDIAN_ENABLED));

        this.createBootsRecipe(recipeExporter, EnrichedItems.OBSIDIAN_ALLOY_INGOT, EnrichedItems.OBSIDIAN_BOOTS,
                Lists.newArrayList(EnrichedResourceConditions.OBSIDIAN_ENABLED));
    }

    private void createEmeraldRecipes(RecipeExporter recipeExporter)
    {
        this.createSwordRecipe(recipeExporter, Items.EMERALD, EnrichedItems.EMERALD_SWORD, Lists.newArrayList(EnrichedResourceConditions.EMERALD_ENABLED));
        this.createShovelRecipe(recipeExporter, Items.EMERALD, EnrichedItems.EMERALD_SHOVEL, Lists.newArrayList(EnrichedResourceConditions.EMERALD_ENABLED));
        this.createPickaxeRecipe(recipeExporter, Items.EMERALD, EnrichedItems.EMERALD_PICKAXE, Lists.newArrayList(EnrichedResourceConditions.EMERALD_ENABLED));
        this.createAxeRecipe(recipeExporter, Items.EMERALD, EnrichedItems.EMERALD_AXE, Lists.newArrayList(EnrichedResourceConditions.EMERALD_ENABLED));
        this.createHoeRecipe(recipeExporter, Items.EMERALD, EnrichedItems.EMERALD_HOE, Lists.newArrayList(EnrichedResourceConditions.EMERALD_ENABLED));

        this.createHelmetRecipe(recipeExporter, Items.EMERALD, EnrichedItems.EMERALD_HELMET, Lists.newArrayList(EnrichedResourceConditions.EMERALD_ENABLED));
        this.createChestplateRecipe(recipeExporter, Items.EMERALD, EnrichedItems.EMERALD_CHESTPLATE, Lists.newArrayList(EnrichedResourceConditions.EMERALD_ENABLED));
        this.createLeggingsRecipe(recipeExporter, Items.EMERALD, EnrichedItems.EMERALD_LEGGINGS, Lists.newArrayList(EnrichedResourceConditions.EMERALD_ENABLED));
        this.createBootsRecipe(recipeExporter, Items.EMERALD, EnrichedItems.EMERALD_BOOTS, Lists.newArrayList(EnrichedResourceConditions.EMERALD_ENABLED));
    }

    private void createCopperRecipes(RecipeExporter recipeExporter)
    {
        this.createSwordRecipe(recipeExporter, Items.COPPER_INGOT, EnrichedItems.COPPER_SWORD, Lists.newArrayList(EnrichedResourceConditions.COPPER_ENABLED));
        this.createShovelRecipe(recipeExporter, Items.COPPER_INGOT, EnrichedItems.COPPER_SHOVEL, Lists.newArrayList(EnrichedResourceConditions.COPPER_ENABLED));
        this.createPickaxeRecipe(recipeExporter, Items.COPPER_INGOT, EnrichedItems.COPPER_PICKAXE, Lists.newArrayList(EnrichedResourceConditions.COPPER_ENABLED));
        this.createAxeRecipe(recipeExporter, Items.COPPER_INGOT, EnrichedItems.COPPER_AXE, Lists.newArrayList(EnrichedResourceConditions.COPPER_ENABLED));
        this.createHoeRecipe(recipeExporter, Items.COPPER_INGOT, EnrichedItems.COPPER_HOE, Lists.newArrayList(EnrichedResourceConditions.COPPER_ENABLED));
    }

    private void createHorseArmorRecipes(RecipeExporter recipeExporter)
    {
        this.createHorseArmorRecipe(recipeExporter, Items.DIAMOND, Items.DIAMOND_HORSE_ARMOR);
        this.createHorseArmorRecipe(recipeExporter, Items.GOLD_INGOT, Items.GOLDEN_HORSE_ARMOR);
        this.createHorseArmorRecipe(recipeExporter, Items.IRON_INGOT, Items.IRON_HORSE_ARMOR);
    }
    private void createChainmailRecipes(RecipeExporter recipeExporter)
    {
        this.createHelmetRecipe(recipeExporter, Items.CHAIN, (ArmorItem) Items.CHAINMAIL_HELMET,
                Lists.newArrayList(EnrichedResourceConditions.CHAINMAIL_ENABLED));

        this.createChestplateRecipe(recipeExporter, Items.CHAIN, (ArmorItem) Items.CHAINMAIL_CHESTPLATE,
                Lists.newArrayList(EnrichedResourceConditions.CHAINMAIL_ENABLED));

        this.createLeggingsRecipe(recipeExporter, Items.CHAIN, (ArmorItem) Items.CHAINMAIL_LEGGINGS,
                Lists.newArrayList(EnrichedResourceConditions.CHAINMAIL_ENABLED));

        this.createBootsRecipe(recipeExporter, Items.CHAIN, (ArmorItem) Items.CHAINMAIL_BOOTS,
                Lists.newArrayList(EnrichedResourceConditions.CHAINMAIL_ENABLED));
    }

    private void createRawSmeltingRecipes(RecipeExporter recipeExporter)
    {
        this.createSmeltingRecipe(recipeExporter, Items.RAW_IRON_BLOCK, RecipeCategory.MISC, Items.IRON_BLOCK, 6.3f, 1800);
        this.createSmeltingRecipe(recipeExporter, Items.RAW_COPPER_BLOCK, RecipeCategory.MISC, Items.COPPER_BLOCK, 6.3f, 1800);
        this.createSmeltingRecipe(recipeExporter, Items.RAW_GOLD_BLOCK, RecipeCategory.MISC, Items.GOLD_BLOCK, 6.3f, 1800);

        this.createBlastingRecipe(recipeExporter, Items.RAW_IRON_BLOCK, RecipeCategory.MISC, Items.IRON_BLOCK, 6.3f, 900);
        this.createBlastingRecipe(recipeExporter, Items.RAW_COPPER_BLOCK, RecipeCategory.MISC, Items.COPPER_BLOCK, 6.3f, 900);
        this.createBlastingRecipe(recipeExporter, Items.RAW_GOLD_BLOCK, RecipeCategory.MISC, Items.GOLD_BLOCK, 6.3f, 900);
    }

    private void createSmeltingRecipe(RecipeExporter recipeExporter, Item input, RecipeCategory recipeCategory, Item output, float experience, int cookingTime)
    {
        String recipeJSONFileName = String.format("%s_from_smelting_%s", StringUtils.substringAfterLast(output.getTranslationKey(), "."),
                StringUtils.substringAfterLast(input.getTranslationKey(), "."));

        CookingRecipeJsonBuilder.create(Ingredient.ofItems(input), recipeCategory, output, experience, cookingTime, RecipeSerializer.SMELTING, SmeltingRecipe::new)
                .criterion(FabricRecipeProvider.hasItem(input), FabricRecipeProvider.conditionsFromItem(input))
                .offerTo(withConditions(recipeExporter, EnrichedResourceConditions.RAW_SMELTING_ENABLED), Identifier.of(EnrichedMod.MOD_ID, recipeJSONFileName));
    }

    private void createBlastingRecipe(RecipeExporter recipeExporter, Item input, RecipeCategory recipeCategory, Item output, float experience, int cookingTime)
    {
        String recipeJSONFileName = String.format("%s_from_blasting_%s", StringUtils.substringAfterLast(output.getTranslationKey(), "."),
                StringUtils.substringAfterLast(input.getTranslationKey(), "."));

        CookingRecipeJsonBuilder.create(Ingredient.ofItems(input), recipeCategory, output, experience, cookingTime, RecipeSerializer.BLASTING, BlastingRecipe::new)
                .criterion(FabricRecipeProvider.hasItem(input), FabricRecipeProvider.conditionsFromItem(input))
                .offerTo(withConditions(recipeExporter, EnrichedResourceConditions.RAW_SMELTING_ENABLED), Identifier.of(EnrichedMod.MOD_ID, recipeJSONFileName));
    }

    private void createUncraftingRecipes(RecipeExporter recipeExporter)
    {
        this.createUncraftingRecipeWithTag(recipeExporter, ItemTags.WOOL, Items.STRING, 4);

        this.createUncraftingRecipe(recipeExporter, Items.COBWEB, Items.STRING, 5);
        this.createUncraftingRecipe(recipeExporter, Items.BRICKS, Items.BRICK, 4);
        this.createUncraftingRecipe(recipeExporter, Items.NETHER_BRICK, Items.NETHER_BRICKS, 4);
        this.createUncraftingRecipe(recipeExporter, Items.MAGMA_BLOCK, Items.MAGMA_CREAM, 4);
        this.createUncraftingRecipe(recipeExporter, Items.NETHER_WART, Items.NETHER_WART_BLOCK, 9);
        this.createUncraftingRecipe(recipeExporter, Items.HONEYCOMB_BLOCK, Items.HONEYCOMB, 4);
    }

    /*-------------------------*/
    /* -- Utility Functions -- */
    /*-------------------------*/

    private void createSwordRecipe(RecipeExporter recipeExporter, Item swordMaterial, Item outputSword, @Nullable List<ResourceCondition> resourceConditions)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, outputSword)
                .input('M', swordMaterial)
                .input('S', Items.STICK)
                .pattern(" M ")
                .pattern(" M ")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(swordMaterial), FabricRecipeProvider.conditionsFromItem(swordMaterial))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(resourceConditions != null ? withConditions(recipeExporter, resourceConditions.toArray(ResourceCondition[]::new)) : recipeExporter);
    }

    private void createShovelRecipe(RecipeExporter recipeExporter, Item shovelMaterial, Item outputShovel, @Nullable List<ResourceCondition> resourceConditions)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, outputShovel)
                .input('M', shovelMaterial)
                .input('S', Items.STICK)
                .pattern(" M ")
                .pattern(" S ")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(shovelMaterial), FabricRecipeProvider.conditionsFromItem(shovelMaterial))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(resourceConditions != null ? withConditions(recipeExporter, resourceConditions.toArray(ResourceCondition[]::new)) : recipeExporter);
    }

    private void createPickaxeRecipe(RecipeExporter recipeExporter, Item pickaxeMaterial, Item outputPickaxe, @Nullable List<ResourceCondition> resourceConditions)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, outputPickaxe)
                .input('M', pickaxeMaterial)
                .input('S', Items.STICK)
                .pattern("MMM")
                .pattern(" S ")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(pickaxeMaterial), FabricRecipeProvider.conditionsFromItem(pickaxeMaterial))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(resourceConditions != null ? withConditions(recipeExporter, resourceConditions.toArray(ResourceCondition[]::new)) : recipeExporter);
    }

    private void createAxeRecipe(RecipeExporter recipeExporter, Item axeMaterial, Item outputAxe, @Nullable List<ResourceCondition> resourceConditions)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, outputAxe)
                .input('M', axeMaterial)
                .input('S', Items.STICK)
                .pattern("MM ")
                .pattern("MS ")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(axeMaterial), FabricRecipeProvider.conditionsFromItem(axeMaterial))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(resourceConditions != null ? withConditions(recipeExporter, resourceConditions.toArray(ResourceCondition[]::new)) : recipeExporter);
    }

    private void createHoeRecipe(RecipeExporter recipeExporter, Item hoeMaterial, Item outputHoe, @Nullable List<ResourceCondition> resourceConditions)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, outputHoe)
                .input('M', hoeMaterial)
                .input('S', Items.STICK)
                .pattern("MM ")
                .pattern(" S ")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(hoeMaterial), FabricRecipeProvider.conditionsFromItem(hoeMaterial))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(resourceConditions != null ? withConditions(recipeExporter, resourceConditions.toArray(ResourceCondition[]::new)) : recipeExporter);
    }

    private void createHelmetRecipe(RecipeExporter recipeExporter, Item helmetMaterial, ArmorItem outputHelmet, @Nullable List<ResourceCondition> resourceConditions)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, outputHelmet)
                .input('M', helmetMaterial)
                .pattern("MMM")
                .pattern("M M")
                .criterion(FabricRecipeProvider.hasItem(helmetMaterial), FabricRecipeProvider.conditionsFromItem(helmetMaterial))
                .offerTo(resourceConditions != null ? withConditions(recipeExporter, resourceConditions.toArray(ResourceCondition[]::new)) : recipeExporter);
    }

    private void createChestplateRecipe(RecipeExporter recipeExporter, Item chestplateMaterial, ArmorItem outputChestplate,
                                        @Nullable List<ResourceCondition> resourceConditions)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, outputChestplate)
                .input('M', chestplateMaterial)
                .pattern("M M")
                .pattern("MMM")
                .pattern("MMM")
                .criterion(FabricRecipeProvider.hasItem(chestplateMaterial), FabricRecipeProvider.conditionsFromItem(chestplateMaterial))
                .offerTo(resourceConditions != null ? withConditions(recipeExporter, resourceConditions.toArray(ResourceCondition[]::new)) : recipeExporter);
    }

    private void createLeggingsRecipe(RecipeExporter recipeExporter, Item leggingsMaterial, ArmorItem outputLeggings,
                                        @Nullable List<ResourceCondition> resourceConditions)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, outputLeggings)
                .input('M', leggingsMaterial)
                .pattern("MMM")
                .pattern("M M")
                .pattern("M M")
                .criterion(FabricRecipeProvider.hasItem(leggingsMaterial), FabricRecipeProvider.conditionsFromItem(leggingsMaterial))
                .offerTo(resourceConditions != null ? withConditions(recipeExporter, resourceConditions.toArray(ResourceCondition[]::new)) : recipeExporter);
    }

    private void createBootsRecipe(RecipeExporter recipeExporter, Item bootsRecipe, ArmorItem outputBoots, @Nullable List<ResourceCondition> resourceConditions)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, outputBoots)
                .input('M', bootsRecipe)
                .pattern("M M")
                .pattern("M M")
                .criterion(FabricRecipeProvider.hasItem(bootsRecipe), FabricRecipeProvider.conditionsFromItem(bootsRecipe))
                .offerTo(resourceConditions != null ? withConditions(recipeExporter, resourceConditions.toArray(ResourceCondition[]::new)) : recipeExporter);
    }

    private void createHorseArmorRecipe(RecipeExporter recipeExporter, Item horseArmorMaterial, Item outputHorseArmor)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, outputHorseArmor)
                .input('M', horseArmorMaterial)
                .pattern("M M")
                .pattern("MMM")
                .pattern("M M")
                .criterion(FabricRecipeProvider.hasItem(horseArmorMaterial), FabricRecipeProvider.conditionsFromItem(horseArmorMaterial))
                .offerTo(withConditions(recipeExporter, EnrichedResourceConditions.HORSE_ARMOR_ENABLED));
    }

    private void createUncraftingRecipeWithTag(RecipeExporter exporter, TagKey<Item> compactItemTag, Item outputItem, int count)
    {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, outputItem, count)
                .input(compactItemTag)
                .criterion("has_" + compactItemTag.id().getPath(), FabricRecipeProvider.conditionsFromTag(compactItemTag))
                .offerTo(withConditions(exporter, EnrichedResourceConditions.UNCRAFTING_ENABLED),
                        Identifier.of(EnrichedMod.MOD_ID, "uncrafting_" + compactItemTag.id().getPath()));
    }

    private void createUncraftingRecipe(RecipeExporter exporter, Item compactItem, Item outputItem, int count)
    {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, outputItem, count)
                .input(compactItem)
                .criterion(FabricRecipeProvider.hasItem(compactItem), FabricRecipeProvider.conditionsFromItem(compactItem))
                .offerTo(withConditions(exporter, EnrichedResourceConditions.UNCRAFTING_ENABLED),
                        Identifier.of(EnrichedMod.MOD_ID, "uncrafting_" + StringUtils.substringAfterLast(compactItem.getTranslationKey(), ".")));
    }
}