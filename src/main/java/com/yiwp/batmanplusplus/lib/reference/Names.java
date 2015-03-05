package com.yiwp.batmanplusplus.lib.reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraftforge.fluids.Fluid;

public class Names {
	
	public static final class Metal {
		
		public static final String darkIron = "DarkIron";	
		public static final String molybdochalkos = "Molybdochalkos";
		public static final String orichalcum = "Orichalcum";
		public static final String cactusSteel = "CactusSteel";
		public static final String meteoricIron = "MeteoricIron";
		public static final String tetsu = "Tetsu";
		public static final String titanium = "Titanium";
		public static final String vibranium = "Vibranium";
		public static final String adamantium = "Adamantium";
		public static final String titaniumAlumide = "TitaniumAlumide";
		public static final String slag = "Slag";
		
	}
	
	public static final class Glass {
		
		public static final String lux = "Lux";
		public static final String woodGlass = "WoodGlass";
		public static final String copper = "Copper";
		public static final String bronze = "Bronze";
		public static final String test = "Test";
		
	}
	
	public static final class Misc {
				
		public static final String board = "PressBoard";
		
	}

	public static String fluid(String metal) {
		
		return "fluid.molten." + metal.toLowerCase();
	}
		
	public static String molten(String metal) {

		return metal.toLowerCase() + ".molten";				
	}

	public static final class Textures {
		
		public static String liquidstill(String tex) {
			return "fluid" + tex.toLowerCase();
		}
		
		public static String liquidflowing(String tex) {
			return liquidstill(tex) + "-flow";
		}
		public static String block(String tex) {
			return "block" + tex;
		}
		
		public static String item(String tex) {
			return "item" + tex;
		}
	
		public static String ingot(String ingot) {
			return "ingot" + ingot;
		}
	
		public static String nugget(String nugget) {
			return "nugget" + nugget;
		}
		
		public static String ore(String ore) {
			return "ore" + ore;
		}
	}
	
	
	public static final class Materials	{
		
	}
	
	public static final class Tools		{
		
	}
	
	public static final class Weapons	{
	
	}
	
	public static final class Armor 	{
	
	}
	
	public static final class NBT	{
		
	}
	
	public static final class Config	{
		
		public static final String Modules = "############Modules###########";
		public static final String OSCS = "#####One-Stop Config-Shop#####";
		public static final String Extras = "############Extras############";
		public static final String Core = "#############Core#############";
		public static final String Recipe = "###########Recipes############";
		public static final String Generation = "#######World Generation#######";
	}

	

}