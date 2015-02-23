package yesiwearpants.compressionmod.handler;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreHandler {
	public static Block cbar;
	public static Block reds;
	public static Block greens;
	public static Block blues;
	public static Block thorium;
	public static Block zinc;
	public static Block lead;
	public static Block aluminium;
	public static Block titan;
	public static Block silver;
		
	
	public static void oreRegistration(OreDictionary dictionary) {
		dictionary.registerOre("ingotRefinedIron", ItemHandler.singot);
		dictionary.registerOre("ingotTitanium", ItemHandler.tingot);
		
		dictionary.registerOre("blockRefinedIron", BlockHandler.steel);
		dictionary.registerOre("oreTitanium", BlockHandler.titan);
		
	}

}
