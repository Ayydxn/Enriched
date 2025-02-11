package com.enrichedmc.recipes;

import com.enrichedmc.Enriched;
import com.enrichedmc.builder.ShapedRecipeBuilder;
import com.enrichedmc.config.ModConfig;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

public class DynamicRecipes {
    public static final Map<Identifier, JsonObject> REGISTRY = new HashMap<>();

    public static void register(ModConfig config) {
        final List<Pair<Identifier, JsonObject>> enabledFeatures = new ArrayList<>();
        if (config.enableCopperGear) {
            enabledFeatures.add(pickaxe("copper_pickaxe", "minecraft:copper_ingot", "enriched:copper_pickaxe"));
            enabledFeatures.add(sword("copper_sword", "minecraft:copper_ingot", "enriched:copper_sword"));
            enabledFeatures.add(axe("copper_axe", "minecraft:copper_ingot", "enriched:copper_axe"));
            enabledFeatures.add(shovel("copper_shovel", "minecraft:copper_ingot", "enriched:copper_shovel"));
            enabledFeatures.add(hoe("copper_hoe", "minecraft:copper_ingot", "enriched:copper_hoe"));
        }
        if (config.enableEmeraldGear) {
            enabledFeatures.add(pickaxe("emerald_pickaxe", "minecraft:emerald", "enriched:emerald_pickaxe"));
            enabledFeatures.add(sword("emerald_sword", "minecraft:emerald", "enriched:emerald_sword"));
            enabledFeatures.add(axe("emerald_axe", "minecraft:emerald", "enriched:emerald_axe"));
            enabledFeatures.add(shovel("emerald_shovel", "minecraft:emerald", "enriched:emerald_shovel"));
            enabledFeatures.add(hoe("emerald_hoe", "minecraft:emerald", "enriched:emerald_hoe"));
            enabledFeatures.add(helmet("emerald_helmet", "minecraft:emerald", "enriched:emerald_helmet"));
            enabledFeatures.add(chestplate("emerald_chestplate", "minecraft:emerald", "enriched:emerald_chestplate"));
            enabledFeatures.add(leggings("emerald_leggings", "minecraft:emerald", "enriched:emerald_leggings"));
            enabledFeatures.add(boots("emerald_boots", "minecraft:emerald", "enriched:emerald_boots"));
        }
        if (config.enableObsidianGear) {
            enabledFeatures.add(blend("obsidian_alloy_blend", "minecraft:iron_ingot", "minecraft:obsidian", "enriched:obsidian_alloy_blend"));
            enabledFeatures.add(pickaxe("obsidian_pickaxe", "enriched:obsidian_alloy_ingot", "enriched:obsidian_pickaxe"));
            enabledFeatures.add(sword("obsidian_sword", "enriched:obsidian_alloy_ingot", "enriched:obsidian_sword"));
            enabledFeatures.add(axe("obsidian_axe", "enriched:obsidian_alloy_ingot", "enriched:obsidian_axe"));
            enabledFeatures.add(shovel("obsidian_shovel", "enriched:obsidian_alloy_ingot", "enriched:obsidian_shovel"));
            enabledFeatures.add(hoe("obsidian_hoe", "enriched:obsidian_alloy_ingot", "enriched:obsidian_hoe"));
            enabledFeatures.add(helmet("obsidian_helmet", "enriched:obsidian_alloy_ingot", "enriched:obsidian_helmet"));
            enabledFeatures.add(chestplate("obsidian_chestplate", "enriched:obsidian_alloy_ingot", "enriched:obsidian_chestplate"));
            enabledFeatures.add(leggings("obsidian_leggings", "enriched:obsidian_alloy_ingot", "enriched:obsidian_leggings"));
            enabledFeatures.add(boots("obsidian_boots", "enriched:obsidian_alloy_ingot", "enriched:obsidian_boots"));
            enabledFeatures.add(blasting("obsidian_alloy_ingot_blasting", "enriched:obsidian_alloy_blend", "enriched:obsidian_alloy_ingot", 0.7, 100));
            enabledFeatures.add(smelting("obsidian_alloy_ingot_smelting", "enriched:obsidian_alloy_blend", "enriched:obsidian_alloy_ingot", 0.7, 200));
            enabledFeatures.add(block("obsidian_alloy_block", "enriched:obsidian_alloy_ingot", "enriched:obsidian_alloy_block", 1));
            enabledFeatures.add(uncrafting("obsidian_alloy_ingot", "enriched:obsidian_alloy_block", "enriched:obsidian_alloy_ingot", 9));
        }

        if (config.enableSteelGear) {
            enabledFeatures.add(pickaxe_tag("steel_pickaxe", "c:steel_ingots", "enriched:steel_pickaxe"));
            enabledFeatures.add(sword_tag("steel_sword", "c:steel_ingots", "enriched:steel_sword"));
            enabledFeatures.add(axe_tag("steel_axe", "c:steel_ingots", "enriched:steel_axe"));
            enabledFeatures.add(shovel_tag("steel_shovel", "c:steel_ingots", "enriched:steel_shovel"));
            enabledFeatures.add(hoe_tag("steel_hoe", "c:steel_ingots", "enriched:steel_hoe"));
            enabledFeatures.add(helmet_tag("steel_helmet", "c:steel_ingots", "enriched:steel_helmet"));
            enabledFeatures.add(chestplate_tag("steel_chestplate", "c:steel_ingots", "enriched:steel_chestplate"));
            enabledFeatures.add(leggings_tag("steel_leggings", "c:steel_ingots", "enriched:steel_leggings"));
            enabledFeatures.add(boots_tag("steel_boots", "c:steel_ingots", "enriched:steel_boots"));
            enabledFeatures.add(blend("steel_blend", "minecraft:iron_ingot", "minecraft:coal", "enriched:steel_blend"));
            enabledFeatures.add(blasting("steel_ingot_blasting", "enriched:steel_blend", "enriched:steel_ingot", 0.7, 100));
            enabledFeatures.add(smelting("steel_ingot_smelting", "enriched:obsidian_alloy_blend", "enriched:obsidian_alloy_ingot", 0.7, 200));
            enabledFeatures.add(block("steel_block", "enriched:steel_ingot", "enriched:steel_block", 1));
            enabledFeatures.add(uncrafting("steel_ingot", "enriched:steel_block", "enriched:steel_ingot", 9));
        }

        if (config.enableRubyGear) {
            enabledFeatures.add(pickaxe_tag("ruby_pickaxe", "c:rubies", "enriched:ruby_pickaxe"));
            enabledFeatures.add(sword_tag("ruby_sword", "c:rubies", "enriched:ruby_sword"));
            enabledFeatures.add(axe_tag("ruby_axe", "c:rubies", "enriched:ruby_axe"));
            enabledFeatures.add(shovel_tag("ruby_shovel", "c:rubies", "enriched:ruby_shovel"));
            enabledFeatures.add(hoe_tag("ruby_hoe", "c:rubies", "enriched:ruby_hoe"));
            enabledFeatures.add(helmet_tag("ruby_helmet", "c:rubies", "enriched:ruby_helmet"));
            enabledFeatures.add(chestplate_tag("ruby_chestplate", "c:rubies", "enriched:ruby_chestplate"));
            enabledFeatures.add(leggings_tag("ruby_leggings", "c:rubies", "enriched:ruby_leggings"));
            enabledFeatures.add(boots_tag("ruby_boots", "c:rubies", "enriched:ruby_boots"));
            enabledFeatures.add(block("ruby_block", "enriched:ruby", "enriched:ruby_block", 1));
            enabledFeatures.add(uncrafting("ruby", "enriched:ruby_block", "enriched:ruby", 9));
        }

        if (config.enableSapphireGear) {
            enabledFeatures.add(pickaxe_tag("sapphire_pickaxe", "c:sapphires", "enriched:sapphire_pickaxe"));
            enabledFeatures.add(sword_tag("sapphire_sword", "c:sapphires", "enriched:sapphire_sword"));
            enabledFeatures.add(axe_tag("sapphire_axe", "c:sapphires", "enriched:sapphire_axe"));
            enabledFeatures.add(shovel_tag("sapphire_shovel", "c:sapphires", "enriched:sapphire_shovel"));
            enabledFeatures.add(hoe_tag("sapphire_hoe", "c:sapphires", "enriched:sapphire_hoe"));
            enabledFeatures.add(helmet_tag("sapphire_helmet", "c:sapphires", "enriched:sapphire_helmet"));
            enabledFeatures.add(chestplate_tag("sapphire_chestplate", "c:sapphires", "enriched:sapphire_chestplate"));
            enabledFeatures.add(leggings_tag("sapphire_leggings", "c:sapphires", "enriched:sapphire_leggings"));
            enabledFeatures.add(boots_tag("sapphire_boots", "c:sapphires", "enriched:sapphire_boots"));
            enabledFeatures.add(block("sapphire_block", "enriched:sapphire", "enriched:sapphire_block", 1));
            enabledFeatures.add(uncrafting("sapphire", "enriched:sapphire_block", "enriched:sapphire", 9));
        }

        if (config.enableTanzaniteGear) {
            enabledFeatures.add(pickaxe("tanzanite_pickaxe", "enriched:tanzanite", "enriched:tanzanite_pickaxe"));
            enabledFeatures.add(sword("tanzanite_sword", "enriched:tanzanite", "enriched:tanzanite_sword"));
            enabledFeatures.add(axe("tanzanite_axe", "enriched:tanzanite", "enriched:tanzanite_axe"));
            enabledFeatures.add(shovel("tanzanite_shovel", "enriched:tanzanite", "enriched:tanzanite_shovel"));
            enabledFeatures.add(hoe("tanzanite_hoe", "enriched:tanzanite", "enriched:tanzanite_hoe"));
            enabledFeatures.add(helmet("tanzanite_helmet", "enriched:tanzanite", "enriched:tanzanite_helmet"));
            enabledFeatures.add(chestplate("tanzanite_chestplate", "enriched:tanzanite", "enriched:tanzanite_chestplate"));
            enabledFeatures.add(leggings("tanzanite_leggings", "enriched:tanzanite", "enriched:tanzanite_leggings"));
            enabledFeatures.add(boots("tanzanite_boots", "enriched:tanzanite", "enriched:tanzanite_boots"));
            enabledFeatures.add(block("tanzanite_block", "enriched:tanzanite", "enriched:tanzanite_block", 1));
            enabledFeatures.add(uncrafting("tanzanite", "enriched:tanzanite_block", "enriched:tanzanite", 9));
        }
        //Uncrafting
        if (config.enableUncrafting) {
            enabledFeatures.add(uncrafting_tag("uncrafting_wool", "minecraft:wool", "minecraft:string", 4));
            enabledFeatures.add(uncrafting("uncrafting_cobweb", "minecraft:cobweb", "minecraft:string", 5));
            enabledFeatures.add(uncrafting("uncrafting_brick", "minecraft:bricks", "minecraft:brick", 4));
            enabledFeatures.add(uncrafting("uncrafting_netherbrick", "minecraft:nether_bricks", "minecraft:nether_brick", 4));
            enabledFeatures.add(uncrafting("uncrafting_magma", "minecraft:magma_block", "minecraft:magma_cream", 4));
            enabledFeatures.add(uncrafting("uncrafting_nether_wart", "minecraft:nether_wart_block", "minecraft:nether_wart", 9));
            enabledFeatures.add(uncrafting("uncrafting_honeycomb", "minecraft:honeycomb_block", "minecraft:honeycomb", 4));
        }
        if (config.enableHorseArmor) {
            enabledFeatures.add(horse_armor("diamond_horse_armor", "minecraft:wool", "minecraft:diamond", "minecraft:diamond_horse_armor", 1));
            enabledFeatures.add(horse_armor("golden_horse_armor", "minecraft:wool", "minecraft:gold_ingot", "minecraft:golden_horse_armor", 1));
            enabledFeatures.add(horse_armor("iron_horse_armor", "minecraft:wool", "minecraft:iron_ingot", "minecraft:iron_horse_armor", 1));
        }
        if (config.enableChainmail) {
            enabledFeatures.add(helmet("chainmail_helmet", "minecraft:chain", "minecraft:chainmail_helmet"));
            enabledFeatures.add(chestplate("chainmail_chestplate", "minecraft:chain", "minecraft:chainmail_chestplate"));
            enabledFeatures.add(leggings("chainmail_leggings", "minecraft:chain", "minecraft:chainmail_leggings"));
            enabledFeatures.add(boots("chainmail_boots", "minecraft:chain", "minecraft:chainmail_boots"));
        }

        if (config.enableRawSmelting) {
            enabledFeatures.add(smelting("iron_block_smelting", "minecraft:raw_iron_block", "minecraft:iron_block", 6.3, 1800));
            enabledFeatures.add(smelting("copper_block_smelting", "minecraft:raw_copper_block", "minecraft:copper_block", 6.3, 1800));
            enabledFeatures.add(smelting("gold_block_smelting", "minecraft:raw_gold_block", "minecraft:gold_block", 6.3, 1800));
            enabledFeatures.add(blasting("iron_block_blasting", "minecraft:raw_iron_block", "minecraft:iron_block", 6.3, 900));
            enabledFeatures.add(blasting("copper_block_blasting", "minecraft:raw_copper_block", "minecraft:copper_block", 6.3, 900));
            enabledFeatures.add(blasting("gold_block_blasting", "minecraft:raw_gold_block", "minecraft:gold_block", 6.3, 900));
        }

        enabledFeatures.forEach(it -> REGISTRY.put(it.getLeft(), it.getRight()));
    }

    private static Pair<Identifier, JsonObject> pickaxe(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "###",
                " | ",
                " | "
        ).item('#', item).item('|', "stick").result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> pickaxe_tag(String name, String tag, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "###",
                " | ",
                " | "
        ).tag('#', tag).item('|', "stick").result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> sword(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
                " # ",
                " # ",
                " | "
        ).item('#', item).item('|', "stick").result(result).build(
                Enriched.identifier(name)
        );
    }
    private static Pair<Identifier, JsonObject> sword_tag(String name, String tag, String result) {
        return ShapedRecipeBuilder.ofPattern(
                " # ",
                " # ",
                " | "
        ).tag('#', tag).item('|', "stick").result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> axe(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "## ",
                "#| ",
                " | "
        ).item('#', item).item('|', "stick").result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> axe_tag(String name, String tag, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "## ",
                "#| ",
                " | "
        ).tag('#', tag).item('|', "stick").result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> shovel(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
                " # ",
                " | ",
                " | "
        ).item('#', item).item('|', "stick").result(result).build(
                Enriched.identifier(name)
        );
    }
    private static Pair<Identifier, JsonObject> shovel_tag(String name, String tag, String result) {
        return ShapedRecipeBuilder.ofPattern(
                " # ",
                " | ",
                " | "
        ).tag('#', tag).item('|', "stick").result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> hoe(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "## ",
                " | ",
                " | "
        ).item('#', item).item('|', "stick").result(result).build(
                Enriched.identifier(name)
        );
    }
    private static Pair<Identifier, JsonObject> hoe_tag(String name, String tag, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "## ",
                " | ",
                " | "
        ).tag('#', tag).item('|', "stick").result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> alloy() {
        return ShapedRecipeBuilder.ofPattern(
                "III",
                "OOO",
                "III"
        ).item('I', "iron_ingot").item('O', "obsidian").result(
                "enriched:obsidian_alloy_ingot", 9
        ).build(Enriched.identifier("obsidian_alloy_ingot"));
    }

    private static Pair<Identifier, JsonObject> helmet(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "###",
                "# #",
                "   "
        ).item('#', item).result(result).build(
                Enriched.identifier(name)
        );
    }
    private static Pair<Identifier, JsonObject> helmet_tag(String name, String tag, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "###",
                "# #",
                "   "
        ).tag('#', tag).result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> chestplate(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "# #",
                "###",
                "###"
        ).item('#', item).result(result).build(
                Enriched.identifier(name)
        );
    }
    private static Pair<Identifier, JsonObject> chestplate_tag(String name, String tag, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "# #",
                "###",
                "###"
        ).tag('#', tag).result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> leggings(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "###",
                "# #",
                "# #"
        ).item('#', item).result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> leggings_tag(String name, String tag, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "###",
                "# #",
                "# #"
        ).tag('#', tag).result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> boots(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "# #",
                "# #",
                "   "
        ).item('#', item).result(result).build(
                Enriched.identifier(name)
        );
    }
    private static Pair<Identifier, JsonObject> boots_tag(String name, String tag, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "# #",
                "# #",
                "   "
        ).tag('#', tag).result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> blend(String name, String item_1, String item_2, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "   ",
                "21 ",
                "   "
        ).item('1', item_1).item('2', item_2).result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> uncrafting_tag(String name, String tag, String result, int count) {
        return ShapedRecipeBuilder.ofPattern(
                "#  ",
                "   ",
                "   "
        ).tag('#', tag).result(result, count).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> uncrafting(String name, String item, String result, int count) {
        return ShapedRecipeBuilder.ofPattern(
                "#  ",
                "   ",
                "   "
        ).item('#', item).result(result, count).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> horse_armor(String name, String tag, String item, String result, int count) {
        return ShapedRecipeBuilder.ofPattern(
                "  #",
                "#W#",
                "###"
        ).tag('W', tag).item('#', item).result(result, count).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> block(String name, String item, String result, int count) {
        return ShapedRecipeBuilder.ofPattern(
                "###",
                "###",
                "###"
        ).item('#', item).result(result, count).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> blasting(
            String name, String input, String output, double experience, int cookingTime
    ) {
        final Identifier identifier = Enriched.identifier(name);
        final JsonObject json = new JsonObject();
        json.addProperty("type", "minecraft:blasting");

        final JsonObject ingredient = new JsonObject();
        ingredient.addProperty("item", input);
        json.add("ingredient", ingredient);

        json.addProperty("result", output);
        json.addProperty("experience", experience);
        json.addProperty("cookingtime", cookingTime);

        return new Pair<>(identifier, json);
    }

    private static Pair<Identifier, JsonObject> smelting(
            String name, String input, String output, double experience, int cookingTime
    ) {
        final Identifier identifier = Enriched.identifier(name);
        final JsonObject json = new JsonObject();
        json.addProperty("type", "minecraft:smelting");

        final JsonObject ingredient = new JsonObject();
        ingredient.addProperty("item", input);
        json.add("ingredient", ingredient);

        json.addProperty("result", output);
        json.addProperty("experience", experience);
        json.addProperty("cookingtime", cookingTime);

        return new Pair<>(identifier, json);
    }
}