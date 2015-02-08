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
		
		GameRegistry.registerItem(ingotAdamantium, Names.Items.adamantiumIngot);
		GameRegistry.registerItem(ingotCactusSteel, Names.Items.cactusSteelIngot);
		GameRegistry.registerItem(ingotMeteoricIron, Names.Items.meteoricIronIngot);
		GameRegistry.registerItem(ingotMolybdochalkos, Names.Items.molybdochalkosIngot);
		GameRegistry.registerItem(ingotOrichalcum, Names.Items.orichalcumIngot);
		GameRegistry.registerItem(ingotTetsu, Names.Items.tetsuIngot);
		GameRegistry.registerItem(ingotTitanium, Names.Items.titaniumIngot);
		GameRegistry.registerItem(ingotTitaniumAlumide, Names.Items.titaniumAlumideIngot);
		GameRegistry.registerItem(ingotVibranium, Names.Items.vibraniumIngot);
		
		GameRegistry.registerItem(nuggetAdamantium, Names.Items.adamantiumNugget);
		GameRegistry.registerItem(nuggetCactusSteel, Names.Items.cactusSteelNugget);
		GameRegistry.registerItem(nuggetMeteoricIron, Names.Items.meteoricIronNugget);
		GameRegistry.registerItem(nuggetMolybdochalkos, Names.Items.molybdochalkosNugget);
		GameRegistry.registerItem(nuggetOrichalcum, Names.Items.orichalcumNugget);
		GameRegistry.registerItem(nuggetTetsu, Names.Items.tetsuNugget);
		GameRegistry.registerItem(nuggetTitanium, Names.Items.titaniumNugget);
		GameRegistry.registerItem(nuggetTitaniumAlumide, Names.Items.titaniumAlumideNugget);
		GameRegistry.registerItem(nuggetVibranium, Names.Items.vibraniumNugget);
		
	}

}
