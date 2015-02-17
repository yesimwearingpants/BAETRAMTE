package com.yiwp.batmanplusplus.init;

import net.minecraft.item.ItemStack;
import vazkii.botania.common.block.ModBlocks;

import com.yiwp.batmanplusplus.lib.RecipePureDaisy;

public class BotaniaRecipesInit {
	
	public static void init() {
		RecipePureDaisy.pureDaisyRecipes("logWood", ModBlocks.livingwood);
		RecipePureDaisy.pureDaisyRecipes("stone", ModBlocks.livingrock);
		RecipePureDaisy.pureDaisyRecipes(new ItemStack(BlockInit.BlockTetsu), BlockInit.BlockAdamantium);
	}

}
