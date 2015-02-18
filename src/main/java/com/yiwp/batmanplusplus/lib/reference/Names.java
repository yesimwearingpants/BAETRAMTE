package com.yiwp.batmanplusplus.lib.reference;

import net.minecraft.block.Block;
import net.minecraftforge.fluids.Fluid;

public class Names {
		
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
			
	public static String fluid(String metal) {
		
		return "fluid.molten." + metal.toLowerCase();
	}
		
	public static String molten(String metal) {

		return metal.toLowerCase() + ".molten";				
	}

	public static String ingot(String ingot) {
		return ingot + "Ingot";
	}

	public static String nugget(String nugget) {
		return nugget + "Nugget";
	}
	
	public static final class Blocks {
		
	}
	
	public static final class Items {
		
	}
	
	public static final class Textures {
		
		public static String liquidstill(String tex) {
			return "liquid_" + tex.toLowerCase();
		}
		
		public static String liquidflowing(String tex) {
			return liquidstill(tex) + "_flow";
		}
		public static String block(String tex) {
			return "block" + tex;
		}
		
		public static String item(String tex) {
			return "item" + tex;
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
		
		public static final String Catagory1 = "############Modules###########";
		public static final String Catagory2 = "#####One-Stop Config-Shop#####";
	}

}