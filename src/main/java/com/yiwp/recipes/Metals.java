package com.yiwp.recipes;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import tconstruct.TConstruct;
import tconstruct.library.TConstructRegistry;
import tconstruct.library.crafting.LiquidCasting;
import tconstruct.library.crafting.Smeltery;
import tconstruct.smeltery.TinkerSmeltery;
import tconstruct.util.config.PHConstruct;

import com.yiwp.lib.config.ConfigurationHandler;
import com.yiwp.lib.reference.Names;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class Metals {
	
	static ConfigurationHandler config = new ConfigurationHandler(); 
	
	public static int gemLiquidValue = 250;
	
	
	public static void addRecipesForSmeltery() {
		
		Item darkIron = GameRegistry.findItem("factorization", "dark_iron_ingot");
		Block darkIronOre = GameRegistry.findBlock("factorization", "DarkIronOre");
		
		if(darkIron != null && darkIronOre != null) {
			Smeltery.addMelting(new ItemStack(darkIron), 800, new FluidStack(Names.moltenDarkIronFluid, TConstruct.ingotLiquidValue));
			Smeltery.addMelting(darkIronOre, 0, 750, new FluidStack(Names.moltenDarkIronFluid, ((int) TConstruct.ingotLiquidValue * (int) PHConstruct.ingotsPerOre)));
		}
		if(Loader.isModLoaded("Thaumcraft") == true || Loader.isModLoaded("AWayofTime") == true || 
				Loader.isModLoaded("EE3") == true){
		
			Smeltery.addAlloyMixing(new FluidStack(Names.moltenOrichalcumFluid, TConstruct.ingotLiquidValue * 5), new FluidStack(TinkerSmeltery.moltenGoldFluid, 
				TConstruct.ingotLiquidValue * 2), new FluidStack(TinkerSmeltery.moltenCopperFluid, TConstruct.ingotLiquidValue * 3));
			Smeltery.addAlloyMixing(new FluidStack(Names.moltenMolybdochalkosFluid, TConstruct.ingotLiquidValue * 2), new FluidStack(TinkerSmeltery.moltenCopperFluid, 
				TConstruct.ingotLiquidValue), new FluidStack(TinkerSmeltery.moltenLeadFluid, TConstruct.ingotLiquidValue));
		}
		
		Smeltery.addMelting((new ItemStack(Names.cactus)), 200, new FluidStack(Names.moltenCactusFluid, gemLiquidValue));
		
	}
		
	public static void addRecipesForTableCasting() {
        LiquidCasting tableCasting = TConstructRegistry.instance.getTableCasting();
	
		ItemStack ingotcast = new ItemStack(TinkerSmeltery.metalPattern, 1, 0);
        ItemStack gemcast = new ItemStack(TinkerSmeltery.metalPattern, 1, 26);
        Item denier = GameRegistry.findItem("millenaire", "denier");
        Item denierArgent = GameRegistry.findItem("millenaire", "denier_argent");
        Item denierOr = GameRegistry.findItem("millenaire", "denier_or");
        
        if(Loader.isModLoaded("millenaire") == true && config.configCastDeniers == true) {
        	
        	tableCasting.addCastingRecipe(new ItemStack(denierOr), new FluidStack(TinkerSmeltery.moltenNickelFluid, gemLiquidValue), gemcast, true, 50);
        	tableCasting.addCastingRecipe(new ItemStack(denierArgent), new FluidStack(TinkerSmeltery.moltenSilverFluid, gemLiquidValue), gemcast, true, 50);
        	tableCasting.addCastingRecipe(new ItemStack(denier), new FluidStack(TinkerSmeltery.moltenCopperFluid, gemLiquidValue), gemcast, true, 50);
        }
		
	}
	
	public static void addRecipesForBasinCasting() {
		LiquidCasting basinCasting = TConstructRegistry.instance.getBasinCasting();
		
		
	}
    
    

}
