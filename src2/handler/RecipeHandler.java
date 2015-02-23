package yesiwearpants.compressionmod.handler;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeHandler {
	
		static ItemStack pcobbleStack = new ItemStack(BlockHandler.pcobble);
		static ItemStack stoneBStack = new ItemStack(Block.stoneBrick);
		static ItemStack woodbStack = new ItemStack(BlockHandler.woodboard);
		static ItemStack steelStack = new ItemStack(BlockHandler.steel);
		static ItemStack titanStack = new ItemStack(BlockHandler.titan);
		static ItemStack lightStack = new ItemStack(BlockHandler.light);
		static ItemStack aingotStack = new ItemStack(ItemHandler.aingot);
		static ItemStack luxpowderStack = new ItemStack(ItemHandler.luxpowder);
		static ItemStack singotStack = new ItemStack(ItemHandler.singot);
		static ItemStack tingotStack = new ItemStack(ItemHandler.tingot);
		static ItemStack vingotStack = new ItemStack(ItemHandler.vingot);
		
		static ItemStack sstickStack = new ItemStack(ItemHandler.srod, 2);
		static ItemStack cswordStack = new ItemStack(ToolHandler.csword);
		static ItemStack caxeStack = new ItemStack(ToolHandler.caxe);
		static ItemStack cpickStack = new ItemStack(ToolHandler.cpick);
		static ItemStack cspadeStack = new ItemStack(ToolHandler.cspade);
		static ItemStack choeStack = new ItemStack(ToolHandler.choe);
		static ItemStack sswordStack = new ItemStack(ToolHandler.ssword);
		static ItemStack saxeStack = new ItemStack(ToolHandler.saxe);
		static ItemStack spickStack = new ItemStack(ToolHandler.spick);
		static ItemStack sspadeStack = new ItemStack(ToolHandler.sspade);
		static ItemStack shoeStack = new ItemStack(ToolHandler.shoe);
		static ItemStack tswordStack = new ItemStack(ToolHandler.tsword);
		static ItemStack taxeStack = new ItemStack(ToolHandler.taxe);
		static ItemStack tpickStack = new ItemStack(ToolHandler.tpick);
		static ItemStack tspadeStack = new ItemStack(ToolHandler.tspade);
		static ItemStack thoeStack = new ItemStack(ToolHandler.thoe);
		static ItemStack aswordStack = new ItemStack(ToolHandler.asword);
		static ItemStack aaxeStack = new ItemStack(ToolHandler.aaxe);
		static ItemStack apickStack = new ItemStack(ToolHandler.apick);
		static ItemStack aspadeStack = new ItemStack(ToolHandler.aspade);
		static ItemStack ahoeStack = new ItemStack(ToolHandler.ahoe);
		
		public static void addRecipe(GameRegistry recipe) {
			recipe.addRecipe(new ShapedOreRecipe(pcobbleStack, "xx", "xx", 'x', "blockCobble"));
			recipe.addRecipe(new ShapedOreRecipe(woodbStack, "xx", "xx", 'x', "planksWood"));
			recipe.addRecipe(new ShapedOreRecipe(steelStack, "xxx", "xxx", "xxx", 'x', "ingotRefinedIron"));
			recipe.addRecipe(new ShapedOreRecipe(titanStack, "xxx", "xxx", "xxx", 'x', "ingotTitanium"));
			recipe.addRecipe(lightStack, "xx", "xx",  'x', luxpowderStack);
			recipe.addRecipe(new ShapedOreRecipe(sstickStack, "x", "x", 'x', "ingotRefinedIron"));
			
			
			recipe.addRecipe(new ShapedOreRecipe(cswordStack, "x", "x", "y", 'x', pcobbleStack, 'y', "stickWood"));
			recipe.addRecipe(new ShapedOreRecipe(caxeStack, "xx", "xy", " y", 'x', pcobbleStack, 'y', "stickWood"));
			recipe.addRecipe(new ShapedOreRecipe(cpickStack, "xxx", " y ", " y ", 'x', pcobbleStack, 'y', "stickWood"));
			recipe.addRecipe(new ShapedOreRecipe(cspadeStack, "x", "y", "y", 'x', pcobbleStack, 'y', "stickWood"));
			recipe.addRecipe(new ShapedOreRecipe(choeStack, "xx", "y ", "y ", 'x', pcobbleStack, 'y', "stickWood"));
			recipe.addRecipe(new ShapedOreRecipe(choeStack, "xx", " y", " y", 'x', pcobbleStack, 'y', "stickWood"));
			recipe.addRecipe(new ShapedOreRecipe(sswordStack, "x", "x", "y", 'x', "ingotRefinedIron", 'y', "stickWood"));
			recipe.addRecipe(new ShapedOreRecipe(saxeStack, "xx", "xy", " y", 'x', "ingotRefinedIron", 'y', "stickWood"));
			recipe.addRecipe(new ShapedOreRecipe(spickStack, "xxx", " y ", " y ", 'x', "ingotRefinedIron", 'y', "stickWood"));
			recipe.addRecipe(new ShapedOreRecipe(sspadeStack, "x", "y", "y", 'x', "ingotRefinedIron", 'y', "stickWood"));
			recipe.addRecipe(new ShapedOreRecipe(shoeStack, "xx", "y ", "y ", 'x', "ingotRefinedIron", 'y', "stickWood"));
			recipe.addRecipe(new ShapedOreRecipe(shoeStack, "xx", " y", " y", 'x', "ingotRefinedIron", 'y', "stickWood"));
			recipe.addRecipe(new ShapedOreRecipe(tswordStack, "x", "x", "y", 'x', "ingotTitanium", 'y', sstickStack));
			recipe.addRecipe(new ShapedOreRecipe(taxeStack, "xx", "xy", " y", 'x', "ingotTitanium", 'y', sstickStack));
			recipe.addRecipe(new ShapedOreRecipe(tpickStack, "xxx", " y ", " y ", 'x', "ingotTitanium", 'y', sstickStack));
			recipe.addRecipe(new ShapedOreRecipe(tspadeStack, "x", "y", "y", 'x', "ingotTitanium", 'y', sstickStack));
			recipe.addRecipe(new ShapedOreRecipe(thoeStack, "xx", "y ", "y ", 'x', "ingotTitanium", 'y', sstickStack));
			recipe.addRecipe(new ShapedOreRecipe(thoeStack, "xx", " y", " y", 'x', "ingotTitanium", 'y', sstickStack));
			recipe.addRecipe(new ShapedOreRecipe(aswordStack, "x", "x", "y", 'x', aingotStack, 'y', sstickStack));
			recipe.addRecipe(new ShapedOreRecipe(aaxeStack, "xx", "xy", " y", 'x', aingotStack, 'y', sstickStack));
			recipe.addRecipe(new ShapedOreRecipe(apickStack, "xxx", " y ", " y ", 'x', aingotStack, 'y', sstickStack));
			recipe.addRecipe(new ShapedOreRecipe(aspadeStack, "x", "y", "y", 'x', aingotStack, 'y', sstickStack));
			recipe.addRecipe(new ShapedOreRecipe(ahoeStack, "xx", "y ", "y ", 'x', aingotStack, 'y', sstickStack));
			recipe.addRecipe(new ShapedOreRecipe(ahoeStack, "xx", " y", " y", 'x', aingotStack, 'y', sstickStack));
			
	}
		public static void addSmelting(GameRegistry recipe) {
			recipe.addSmelting(BlockHandler.pcobble.blockID, stoneBStack, 0.0625f);
			recipe.addSmelting(BlockHandler.slag.blockID, steelStack, 0.0625f);
			recipe.addSmelting(BlockHandler.steelore.blockID, singotStack, 0.125f);
			recipe.addSmelting(BlockHandler.titanore.blockID, tingotStack, 0.125f);
			recipe.addSmelting(ItemHandler.sore.itemID, singotStack, 0.0625f);
			recipe.addSmelting(ItemHandler.tore.itemID, tingotStack, 0.0725f);
			recipe.addSmelting(ItemHandler.vore.itemID, vingotStack, 0.0825f);
	}
		
		
}
