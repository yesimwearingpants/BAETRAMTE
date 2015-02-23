package yesiwearpants.compressionmod.handler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import yesiwearpants.compressionmod.item.*;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemHandler {
	
	public static Item srod;
	public static Item singot;
	public static Item tingot;
	public static Item vingot;
	public static Item caingot;
	public static Item aingot;
	public static Item tore;
	public static Item sore;
	public static Item vore;
	public static Item luxpowder;
	public static Item icecream;
	

	public static void configureItems(Configuration config) {
		srod = new NaItem(config.getItem("Steel_Rod", 20024).getInt()).setUnlocalizedName("srod").setCreativeTab(CreativeTabs.tabMaterials);
		singot = new NaItem(config.getItem("Steel_Ingot", 20025).getInt()).setUnlocalizedName("singot").setCreativeTab(CreativeTabs.tabMaterials);
		tingot = new NaItem(config.getItem("Titanium_Ingot", 20026).getInt()).setUnlocalizedName("tingot").setCreativeTab(CreativeTabs.tabMaterials);
		vingot = new NaItem(config.getItem("Vibranium_Ingot", 20027).getInt()).setUnlocalizedName("vingot").setCreativeTab(CreativeTabs.tabMaterials);
		caingot = new NaItem(config.getItem("Carbonadium_Ingot", 20028).getInt()).setUnlocalizedName("caingot").setCreativeTab(CreativeTabs.tabMaterials);
		aingot = new NaItem(config.getItem("Adamantium_Ingot", 20029).getInt()).setUnlocalizedName("aingot").setCreativeTab(CreativeTabs.tabMaterials);
		sore = new NaItem(config.getItem("UnRefined_Steel", 20030).getInt()).setUnlocalizedName("sore").setCreativeTab(CreativeTabs.tabMaterials);
		tore = new NaItem(config.getItem("Titanium_Ore", 20031).getInt()).setUnlocalizedName("tore").setCreativeTab(CreativeTabs.tabMaterials);
		vore = new NaItem(config.getItem("Vibranium_Ore", 20032).getInt()).setUnlocalizedName("vore").setCreativeTab(CreativeTabs.tabMaterials);
		luxpowder = new NaItem(config.getItem("Lux_Powder", 20033).getInt()).setUnlocalizedName("luxpowder").setCreativeTab(CreativeTabs.tabMaterials);
		icecream = new IcecreamItem(config.getItem("Ice_Cream", 20034).getInt()).setUnlocalizedName("icecream").setCreativeTab(CreativeTabs.tabFood);
		
	}
	
	public static void registerItems(GameRegistry registry) {
		registry.registerItem(srod, "srod");
		registry.registerItem(singot, "singot");
		registry.registerItem(tingot, "tingot");
		registry.registerItem(vingot, "vingot");
		registry.registerItem(caingot, "caingot");
		registry.registerItem(aingot, "aingot");
		registry.registerItem(sore, "sore");
		registry.registerItem(tore, "tore");
		registry.registerItem(vore, "vore");
		registry.registerItem(luxpowder, "luxpowder");
		registry.registerItem(icecream, "icecream");
				
	}
	
	public static void setNames(LanguageRegistry registry) {
		registry.addName(srod, "Steel Rod");
		registry.addName(singot, "Steel Ingot");
		registry.addName(tingot, "Titanium Ingot");
		registry.addName(tingot, "Vibranium Ingot");
		registry.addName(tingot, "Carbonadium Ingot");
		registry.addName(tingot, "Adamantium Ingot");
		registry.addName(sore, "UnRefined Steel");
		registry.addName(tore, "Titanium Ore");
		registry.addName(vore, "Vibranium Ore");
		registry.addName(luxpowder, "Lux Powder");	
		registry.addName(icecream, "Ice Cream");
		
	}
}
