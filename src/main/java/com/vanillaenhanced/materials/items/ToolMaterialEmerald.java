package com.vanillaenhanced.materials.items;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialEmerald implements ToolMaterial {
    @Override
    public int getDurability() {
        return 750;
    }

    @Override
    public float getMiningSpeed() {
        return 8.0f;
    }

    @Override
    public float getAttackDamage() {
        return 4.0f;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 30;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.EMERALD);
    }
}
