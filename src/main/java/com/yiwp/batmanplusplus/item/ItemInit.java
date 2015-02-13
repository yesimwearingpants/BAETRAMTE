package com.yiwp.batmanplusplus.item;

import com.yiwp.batmanplusplus.item.ExtItem.BPPItem;
import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MODID)
public class ItemInit {
	
	public static final ExtItem ingotMolybdochalkos = new BPPItem(Names.ingot(Names.molybdochalkos));
	public static final ExtItem ingotOrichalcum = new BPPItem(Names.ingot(Names.orichalcum));
	public static final ExtItem ingotCactusSteel = new BPPItem(Names.ingot(Names.cactusSteel));
	public static final ExtItem ingotMeteoricIron = new BPPItem(Names.ingot(Names.meteoricIron));
	public static final ExtItem ingotTetsu = new BPPItem(Names.ingot(Names.tetsu));
	public static final ExtItem ingotTitanium = new BPPItem(Names.ingot(Names.titanium));
	public static final ExtItem ingotVibranium = new BPPItem(Names.ingot(Names.vibranium));
	public static final ExtItem ingotAdamantium = new BPPItem(Names.ingot(Names.adamantium));
	public static final ExtItem ingotTitaniumAlumide = new BPPItem(Names.ingot(Names.titaniumAlumide));
	
	public static final ExtItem nuggetMolybdochalkos = new BPPItem(Names.nugget(Names.molybdochalkos));
	public static final ExtItem nuggetOrichalcum = new BPPItem(Names.nugget(Names.orichalcum));
	public static final ExtItem nuggetCactusSteel = new BPPItem(Names.nugget(Names.cactusSteel));
	public static final ExtItem nuggetMeteoricIron = new BPPItem(Names.nugget(Names.meteoricIron));
	public static final ExtItem nuggetTetsu = new BPPItem(Names.nugget(Names.tetsu));
	public static final ExtItem nuggetTitanium = new BPPItem(Names.nugget(Names.titanium));
	public static final ExtItem nuggetVibranium = new BPPItem(Names.nugget(Names.vibranium));
	public static final ExtItem nuggetAdamantium = new BPPItem(Names.nugget(Names.adamantium));
	public static final ExtItem nuggetTitaniumAlumide = new BPPItem(Names.nugget(Names.titaniumAlumide));

	public static void preInit() {
		
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
