package com.yiwp.batmanplusplus.recipes;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import com.yiwp.batmanplusplus.item.ItemInit;

import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingTableRecipes {
	
	public static void init()	{
		
		//These are samples, soI can't forget how
		
		//Recipe for stick
		GameRegistry.addRecipe(new ItemStack(Items.stick), "yfy", "fyf", "   ", 'y', new ItemStack(Items.apple), 'f', new ItemStack(ItemInit.ingotAdamantium));
		//Recipe for CactusSteel
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemInit.ingotCactusSteel), "stickWood", "plankWood"));
		
	}

}
