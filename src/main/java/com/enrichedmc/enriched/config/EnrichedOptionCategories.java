package com.enrichedmc.enriched.config;

import com.enrichedmc.enriched.EnrichedMod;
import com.enrichedmc.enriched.networking.payloads.ReloadDataPacksPacket;
import dev.isxander.yacl3.api.ConfigCategory;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionFlag;
import dev.isxander.yacl3.gui.controllers.BooleanController;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.text.Text;

public class EnrichedOptionCategories
{
    private static final EnrichedGameOptions ENRICHED_GAME_OPTIONS;
    private static final EnrichedGameOptions.ToolsAndArmorOptions TOOLS_AND_ARMOR_OPTIONS;
    private static final EnrichedGameOptions.RecipeOptions RECIPE_OPTIONS;

    private static final OptionFlag RELOAD_DATA_PACKS;

    static
    {
        ENRICHED_GAME_OPTIONS = EnrichedMod.getInstance().getGameOptions();
        TOOLS_AND_ARMOR_OPTIONS = ENRICHED_GAME_OPTIONS.toolsAndArmorOptions;
        RECIPE_OPTIONS = ENRICHED_GAME_OPTIONS.recipeOptions;

        // FIXME: (Ayydxn) Doesn't work on dedicated servers. Will have to investigate that.
        RELOAD_DATA_PACKS = (client) -> ClientPlayNetworking.send(new ReloadDataPacksPacket());
    }

    public static ConfigCategory toolsAndArmor()
    {
        return ConfigCategory.createBuilder()
                .name(Text.translatable("enriched.options.category.toolsAndArmor"))
                .option(Option.<Boolean>createBuilder()
                        .name(Text.translatable("enriched.options.toolsAndArmor.enableRubyGear"))
                        .binding(EnrichedGameOptions.defaults().toolsAndArmorOptions.enableRubyGear, () -> TOOLS_AND_ARMOR_OPTIONS.enableRubyGear, newValue -> TOOLS_AND_ARMOR_OPTIONS.enableRubyGear = newValue)
                        .customController(BooleanController::new)
                        .flag(EnrichedOptionCategories.RELOAD_DATA_PACKS)
                        .build())
                .option(Option.<Boolean>createBuilder()
                        .name(Text.translatable("enriched.options.toolsAndArmor.enableSapphireGear"))
                        .binding(EnrichedGameOptions.defaults().toolsAndArmorOptions.enableSapphireGear, () -> TOOLS_AND_ARMOR_OPTIONS.enableSapphireGear, newValue -> TOOLS_AND_ARMOR_OPTIONS.enableSapphireGear = newValue)
                        .customController(BooleanController::new)
                        .flag(EnrichedOptionCategories.RELOAD_DATA_PACKS)
                        .build())
                .option(Option.<Boolean>createBuilder()
                        .name(Text.translatable("enriched.options.toolsAndArmor.enableTanzaniteGear"))
                        .binding(EnrichedGameOptions.defaults().toolsAndArmorOptions.enableTanzaniteGear, () -> TOOLS_AND_ARMOR_OPTIONS.enableTanzaniteGear, newValue -> TOOLS_AND_ARMOR_OPTIONS.enableTanzaniteGear = newValue)
                        .customController(BooleanController::new)
                        .flag(EnrichedOptionCategories.RELOAD_DATA_PACKS)
                        .build())
                .option(Option.<Boolean>createBuilder()
                        .name(Text.translatable("enriched.options.toolsAndArmor.enableSteelGear"))
                        .binding(EnrichedGameOptions.defaults().toolsAndArmorOptions.enableSteelGear, () -> TOOLS_AND_ARMOR_OPTIONS.enableSteelGear, newValue -> TOOLS_AND_ARMOR_OPTIONS.enableSteelGear = newValue)
                        .customController(BooleanController::new)
                        .flag(EnrichedOptionCategories.RELOAD_DATA_PACKS)
                        .build())
                .option(Option.<Boolean>createBuilder()
                        .name(Text.translatable("enriched.options.toolsAndArmor.enableObsidianGear"))
                        .binding(EnrichedGameOptions.defaults().toolsAndArmorOptions.enableObsidianGear, () -> TOOLS_AND_ARMOR_OPTIONS.enableObsidianGear, newValue -> TOOLS_AND_ARMOR_OPTIONS.enableObsidianGear = newValue)
                        .customController(BooleanController::new)
                        .flag(EnrichedOptionCategories.RELOAD_DATA_PACKS)
                        .build())
                .option(Option.<Boolean>createBuilder()
                        .name(Text.translatable("enriched.options.toolsAndArmor.enableEmeraldGear"))
                        .binding(EnrichedGameOptions.defaults().toolsAndArmorOptions.enableEmeraldGear, () -> TOOLS_AND_ARMOR_OPTIONS.enableEmeraldGear, newValue -> TOOLS_AND_ARMOR_OPTIONS.enableEmeraldGear = newValue)
                        .customController(BooleanController::new)
                        .flag(EnrichedOptionCategories.RELOAD_DATA_PACKS)
                        .build())
                .option(Option.<Boolean>createBuilder()
                        .name(Text.translatable("enriched.options.toolsAndArmor.enableCopperTools"))
                        .binding(EnrichedGameOptions.defaults().toolsAndArmorOptions.enableCopperTools, () -> TOOLS_AND_ARMOR_OPTIONS.enableCopperTools, newValue -> TOOLS_AND_ARMOR_OPTIONS.enableCopperTools = newValue)
                        .customController(BooleanController::new)
                        .flag(EnrichedOptionCategories.RELOAD_DATA_PACKS)
                        .build())
                .build();
    }

    public static ConfigCategory recipes()
    {
        return ConfigCategory.createBuilder()
                .name(Text.translatable("enriched.options.category.recipes"))
                .option(Option.<Boolean>createBuilder()
                        .name(Text.translatable("enriched.options.recipes.enableHorseArmorRecipes"))
                        .binding(EnrichedGameOptions.defaults().recipeOptions.enableHorseArmorRecipes, () -> RECIPE_OPTIONS.enableHorseArmorRecipes, newValue -> RECIPE_OPTIONS.enableHorseArmorRecipes = newValue)
                        .customController(BooleanController::new)
                        .flag(EnrichedOptionCategories.RELOAD_DATA_PACKS)
                        .build())
                .option(Option.<Boolean>createBuilder()
                        .name(Text.translatable("enriched.options.recipes.enableChainmailRecipes"))
                        .binding(EnrichedGameOptions.defaults().recipeOptions.enableChainmailRecipes, () -> RECIPE_OPTIONS.enableChainmailRecipes, newValue -> RECIPE_OPTIONS.enableChainmailRecipes = newValue)
                        .customController(BooleanController::new)
                        .flag(EnrichedOptionCategories.RELOAD_DATA_PACKS)
                        .build())
                .option(Option.<Boolean>createBuilder()
                        .name(Text.translatable("enriched.options.recipes.enableRawSmeltingRecipes"))
                        .binding(EnrichedGameOptions.defaults().recipeOptions.enableRawSmeltingRecipes, () -> RECIPE_OPTIONS.enableRawSmeltingRecipes, newValue -> RECIPE_OPTIONS.enableRawSmeltingRecipes = newValue)
                        .customController(BooleanController::new)
                        .flag(EnrichedOptionCategories.RELOAD_DATA_PACKS)
                        .build())
                .option(Option.<Boolean>createBuilder()
                        .name(Text.translatable("enriched.options.recipes.enableUncraftingRecipes"))
                        .binding(EnrichedGameOptions.defaults().recipeOptions.enableUncraftingRecipes, () -> RECIPE_OPTIONS.enableUncraftingRecipes, newValue -> RECIPE_OPTIONS.enableUncraftingRecipes = newValue)
                        .customController(BooleanController::new)
                        .flag(EnrichedOptionCategories.RELOAD_DATA_PACKS)
                        .build())
                .build();
    }
}