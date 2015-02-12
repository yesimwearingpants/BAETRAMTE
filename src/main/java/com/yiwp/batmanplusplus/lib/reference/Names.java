package com.yiwp.batmanplusplus.lib.reference;

import net.minecraft.block.Block;
import net.minecraftforge.fluids.Fluid;

public class Names {
	
	public static Block cactus = net.minecraft.init.Blocks.cactus;
	
	private static String i = "Block";
	private static String j = "Ingot";
	private static String k = "Nugget";
	private static String l = "Fluid";

	public static final String darkIron = "darkIron";	
	public static final String molybdochalkos = "molybdochalkos";
	public static final String orichalcum = "orichalcum";
	public static final String cactusSteel = "cactusSteel";
	public static final String meteoricIron = "meteoricIron";
	public static final String tetsu = "tetsu";
	public static final String titanium = "titanium";
	public static final String vibranium = "vibranium";
	public static final String adamantium = "adamantium";
	public static final String titaniumAlumide = "titaniumAlumide";
			
	public static String block(String block) {
		
		return block + i;
	}
	
	public static String fluids(String fluid) {
		
		return fluid + l;
	}
	
	public static String fluid(String metal) {
		
		return "fluid.molten." + metal;
	}
		
	public static String molten(String metal) {

		return metal + ".molten";				
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
			return "liquid_" + tex;
		}
		
		public static String liquidflowing(String tex) {
			return liquidstill(tex) + "_flow";
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