package com.yiwp.batmanplusplus.lib;

import com.yiwp.batmanplusplus.block.subtile.SubTilePureDaisy;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class RecipePureDaisy {
	
	public static void pureDaisyRecipes(Object entry, Block end) {
		if(entry instanceof ItemStack) {
			SubTilePureDaisy.isValid((ItemStack) entry, end);
		}
		if(entry instanceof String) {
			SubTilePureDaisy.isOreDict((String) entry, end);
		}
	}

}
