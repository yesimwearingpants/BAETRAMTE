package com.yiwp.batmanplusplus.item;

import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MODID)
public class ItemInit {
	
	public static final BPPItem ingotMolybdochalkos = new BPPItem();
	public static final BPPItem ingotOrichalcum = new BPPItem();
	public static final BPPItem ingotCactusSteel = new BPPItem();
	public static final BPPItem ingotMeteoricIron = new BPPItem();
	public static final BPPItem ingotTetsu = new BPPItem();
	public static final BPPItem ingotTitanium = new BPPItem();
	public static final BPPItem ingotVibranium = new BPPItem();
	public static final BPPItem ingotAdamantium = new BPPItem();
	public static final BPPItem ingotTitaniumAlumide = new BPPItem();
	
	public static final BPPItem nuggetMolybdochalkos = new BPPItem();
	public static final BPPItem nuggetOrichalcum = new BPPItem();
	public static final BPPItem nuggetCactusSteel = new BPPItem();
	public static final BPPItem nuggetMeteoricIron = new BPPItem();
	public static final BPPItem nuggetTetsu = new BPPItem();
	public static final BPPItem nuggetTitanium = new BPPItem();
	public static final BPPItem nuggetVibranium = new BPPItem();
	public static final BPPItem nuggetAdamantium = new BPPItem();
	public static final BPPItem nuggetTitaniumAlumide = new BPPItem();
	
	public static void init() {
		
		GameRegistry.registerItem(ingotAdamantium, Names.ingot(Names.adamantium));
		GameRegistry.registerItem(ingotCactusSteel, Names.ingot(Names.cactusSteel));
		GameRegistry.registerItem(ingotMeteoricIron, Names.ingot(Names.meteoricIron));
		GameRegistry.registerItem(ingotMolybdochalkos, Names.ingot(Names.molybdochalkos));
		GameRegistry.registerItem(ingotOrichalcum, Names.ingot(Names.orichalcum));
		GameRegistry.registerItem(ingotTetsu, Names.ingot(Names.tetsu));
		GameRegistry.registerItem(ingotTitanium, Names.ingot(Names.titanium));
		GameRegistry.registerItem(ingotTitaniumAlumide, Names.ingot(Names.titaniumAlumide));
		GameRegistry.registerItem(ingotVibranium, Names.ingot(Names.vibranium));
		
		GameRegistry.registerItem(nuggetAdamantium, Names.nugget(Names.adamantium));
		GameRegistry.registerItem(nuggetCactusSteel, Names.nugget(Names.cactusSteel));
		GameRegistry.registerItem(nuggetMeteoricIron, Names.nugget(Names.meteoricIron));
		GameRegistry.registerItem(nuggetMolybdochalkos, Names.nugget(Names.molybdochalkos));
		GameRegistry.registerItem(nuggetOrichalcum, Names.nugget(Names.orichalcum));
		GameRegistry.registerItem(nuggetTetsu, Names.nugget(Names.tetsu));
		GameRegistry.registerItem(nuggetTitanium, Names.nugget(Names.titanium));
		GameRegistry.registerItem(nuggetTitaniumAlumide, Names.nugget(Names.titaniumAlumide));
		GameRegistry.registerItem(nuggetVibranium, Names.nugget(Names.vibranium));
		
	}

}
