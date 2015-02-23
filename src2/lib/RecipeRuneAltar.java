/**
 * These classes were created by <Vazkii>. They're distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 * 
 * File Created @ [Feb 5, 2014, 1:41:14 PM (GMT)]
 */
package com.yiwp.batmanplusplus.lib;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import vazkii.botania.api.recipe.RecipePetals;

public class RecipeRuneAltar extends RecipePetals {

	int mana;

	public RecipeRuneAltar(ItemStack output, int mana, Object... inputs) {
		super(output, inputs);
		this.mana = mana;
	}

	public int getManaUsage() {
		return mana;
	}
	
	public static final class BotaniaRecipes {
		
		public static List<RecipeRuneAltar> runeAltarRecipes = new ArrayList<RecipeRuneAltar>();
		
		public static Item bond;
		
		/**
		 * Registers a Rune Altar
		 * @param output The ItemStack to craft.
		 * @param binder The Item/Blork used to finish the recipe
		 * @param mana The amount of mana required. Don't go over 100000!
		 * @param inputs The objects for crafting. Can be ItemStack, MappableStackWrapper
		 * or String (case for Ore Dictionary). The array can't be larger than 16.
		 * @return The recipe created.
		 */
		public static RecipeRuneAltar registerRuneAltarRecipe(ItemStack output, Object binder, int mana, Object... inputs) {
			RecipeRuneAltar recipe = new RecipeRuneAltar(output, mana, inputs);
			runeAltarRecipes.add(recipe);
			if (binder instanceof Block) {
				bond = Item.getItemFromBlock((Block) binder);
			}else {
				bond = (Item) binder;
			}
			return recipe;
			
			
		}
	}

}
